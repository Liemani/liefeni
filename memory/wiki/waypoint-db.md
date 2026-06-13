# Waypoint DB

## Indexes

- [../indexes/waypoint.md](../indexes/waypoint.md)

이 문서는 waypoint persistence 계층의 현재 책임과 실행 흐름을 정리한다.

## 구성

현재 persistence 계층은 다음 파일들로 나뉜다.

- `WaypointStore`
  - waypoint 도메인이 붙는 public facade
  - async read / write request를 만든다
- `WaypointDbExecutor`
  - waypoint DB 전용 single-thread worker
  - queue에서 request를 순서대로 실행한다
- `WaypointDatabase`
  - low-level JDBC helper
  - schema 생성, query, insert, update를 담당한다
- `WaypointSyncManager`
  - DB completion을 main / render 쪽으로 되돌리는 queue
- `WaypointWriteBridge`
  - edge / segment / point / managed node write용 thin helper

핵심 원칙은:

- waypoint DB access는 `WaypointStore` / `WaypointDbExecutor` 경로로 통일한다
- 임의의 direct JDBC access를 새로 만들지 않는다
- DB completion은 `WaypointSyncManager`를 통해 나중에 runtime cache에 반영한다

## 실행 모델

`WaypointDbExecutor`는 daemon thread 하나를 띄우고, `LinkedBlockingQueue`에 들어온 request를 순서대로 처리한다.

중요한 점:

- connection은 lazy open이다
- first request 시 `WaypointDatabase.initialize(conn)`가 호출된다
- world enter 시 `WaypointStore.initializeAsync(...)`를 먼저 enqueue해서 schema initialize가 queue 앞쪽에 오게 만든다
- 그 다음 `ensureMapGridAsync(...)`, `loadNodesByGraphAsync(...)` 같은 요청들이 같은 queue를 탄다

즉 별도 sync call 없이도 queue ordering 자체가 initialization barrier 역할을 한다.

## DB 파일과 schema version

DB 위치:

- `data/lmi_waypoint.db`

`WaypointDatabase.jdbcUrl()`는 실행 위치 기준 `data/` 디렉토리를 보장하고 SQLite URL을 만든다.

schema version 정책:

- `wp_meta`
  - `key TEXT PRIMARY KEY`
  - `value TEXT NOT NULL`
- namespace:
  - `waypoint.schema_version`

현재 정책:

- version row가 없으면 `createSchema(...)` 실행 후 version 기록
- version mismatch면 예외를 던진다
- migration은 아직 없고, mismatch 시 DB 파일 삭제를 전제로 한다

## 현재 스키마

핵심 테이블:

- `map_segment`
- `map_grid`
- `wp_graph`
- `wp_node`
- `wp_edge`
- `wp_segment`
- `wp_point`

현재 제약의 핵심:

- `map_segment.id == Haven MapFile.Segment.id`
- `map_grid.haven_id == Haven MCache.Grid.id`
- `UNIQUE (map_segment_id, local_x, local_y)` on `map_grid`
- `UNIQUE (grid_id, local_x, local_y)` on `wp_node`
- `UNIQUE (node0_id, node1_id)` on `wp_edge`
- `node0_id < node1_id` on `wp_edge`
- `UNIQUE (edge_id, step)` on `wp_segment`
- `UNIQUE (segment_id, step)` on `wp_point`
- `mouse_button IN (1, 3)` on `wp_point`

상세 schema 의미는 [waypoint.md](./waypoint.md)의 스키마 섹션을 본다.

## 주요 facade API

현재 `WaypointStore`의 주요 entry는 다음과 같다.

- `initializeAsync(...)`
- `createNodeAsync(...)`
- `loadNodesByGraphAsync(...)`
- `loadNodesByGridAsync(...)`
- `loadEdgesByGraphAsync(...)`
- `loadSegmentsByGridAsync(...)`
- `loadPointsByGridAsync(...)`
- `ensureMapGridAsync(...)`
- `applySaveBatch(...)`

의미:

- graph topology는 `graph_id` 기준으로 읽는다
- geometry는 `grid_id` 기준으로 읽는다
- Haven grid / segment를 waypoint 내부 `map_grid.id`로 연결할 때 `ensureMapGridAsync(...)`를 사용한다

## map_grid 보장 흐름

현재 world 좌표에서 waypoint `grid_id`를 얻을 때는 다음 흐름을 탄다.

1. `WaypointGridResolver`가 Haven `MCache.Grid`를 찾는다
2. `MapFile.gridinfo`로 Haven `Segment.id`를 얻는다
3. grid origin world 좌표를 계산한다
4. runtime cache에 `havenGridId -> mapGridId`가 없으면 `ensureMapGridAsync(...)`를 enqueue한다
5. DB completion 시 `ResolvedGrid`를 runtime cache에 넣고 `WaypointManager.requestRefresh()`를 건다

즉 grid resolve도 preload-first, retry-on-next-refresh 모델이다.

## Write 경로

low-level insert는 `WaypointDatabase`가 가진다.

- `insertWpNode(...)`
- `insertWpEdge(...)`
- `insertWpSegment(...)`
- `insertWpPoint(...)`
- `updateWpNode(...)`
- `ensureMapGrid(...)`

`WaypointWriteBridge`는 여기에 도메인 규칙을 조금 얹는다.

예:

- `insertWpEdge(...)`
  - `node0_id < node1_id` canonical order를 강제
  - 필요하면 direction을 뒤집는다

즉:

- SQL과 schema 불변식: `WaypointDatabase`
- write-side 도메인 보정: `WaypointWriteBridge`

## Completion 모델

DB 작업은 worker thread에서 실행되지만, success / failure callback은 직접 그 자리에서 실행하지 않는다.

- executor가 result를 얻음
- `WaypointSyncManager.enqueue(...)`로 completion을 넣음
- 현재 `Hook.mapViewDidDraw(...)`에서 `WaypointSyncManager.drain()`이 호출됨

이 구조 덕분에 runtime cache 갱신은 draw/poll 경계에서 일관되게 처리된다.

## 주의점

- `WaypointDbExecutor.clear()`는 queue와 sync completion만 비우고, worker thread는 유지한다
- initialize failure가 나면 현재는 callback failure 경로를 타고, schema mismatch는 DB 파일 삭제 전제가 있다
- `WaypointStore`의 result 타입 이름 중 `LoadSegmentsByCutResult`, `LoadPointsByCutResult`는 과거 naming 흔적이지만 현재 payload는 `grid_id` 기준이다
