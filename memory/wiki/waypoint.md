# Waypoint

## Meta

- Indexes:
  - [waypoint.md](../indexes/waypoint.md)

이 문서는 현재 LMI waypoint 시스템의 목적, 스키마, runtime, recording 흐름을 정리한다.

## 목적

현재 waypoint는 더 이상 anchor / calibration / virtual coordinate를 사용하지 않는다.
핵심은 다음 세 가지다.

- Haven grid / segment를 waypoint 내부 `map_grid.id`로 안정적으로 매핑
- `wp_graph`로 분리된 navigation graph를 유지
- `wp_node / wp_edge / wp_segment / wp_point`로 recorded path를 저장하고 시각화

현재 구현 패키지:

- `lmi.waypoint`
  - facade / bootstrap / overlay / debug
- `lmi.waypoint.persistence`
  - DB facade, executor, sync queue, low-level SQL helper
- `lmi.waypoint.runtime`
  - runtime authoritative cache, bounds, scene build/result
- `lmi.waypoint.recording`
  - raw recording, portal-aware segment planning, edge save

DB / executor / schema version / `map_grid` 저장 흐름은 [waypoint-db.md](./waypoint-db.md)를 본다.

## 스키마

현재 핵심 테이블:

- `map_segment`
- `map_grid`
- `wp_graph`
- `wp_node`
- `wp_edge`
- `wp_segment`
- `wp_point`

의미:

- `map_segment`
  - Haven `MapFile.Segment`와 1:1로 대응하는 row
- `map_grid`
  - Haven grid를 waypoint 내부 FK용 grid row로 매핑
- `wp_graph`
  - 서로 분리된 navigation graph
- `wp_node`
  - graph 안의 사용자-visible node
- `wp_edge`
  - node 간 연결
- `wp_segment`
  - edge 경로를 grid 경계 기준으로 자른 조각
- `wp_point`
  - segment 내부 recorded click point

핵심 컬럼:

- `map_segment`
  - `id`
- `map_grid`
  - `id`
  - `map_segment_id`
  - `local_x`
  - `local_y`
  - `haven_id`
- `wp_node`
  - `graph_id`
  - `grid_id`
  - `local_x`
  - `local_y`
  - `name`
- `wp_edge`
  - `graph_id`
  - `node0_id`
  - `node1_id`
  - `direction`
  - `time_cost`
  - `fatigue_cost`
- `wp_segment`
  - `edge_id`
  - `grid_id`
  - `step`
- `wp_point`
  - `grid_id`
  - `step`
  - `local_x`
  - `local_y`
  - `mouse_button`
  - `mesh_id`

핵심 규칙:

- 모든 `id`는 `INTEGER PRIMARY KEY`
- `map_segment.id == Haven MapFile.Segment.id`
- `map_grid.id`는 waypoint 내부 FK용 id다
- `map_grid.haven_id == Haven MCache.Grid.id`
- `map_grid.local_x`, `map_grid.local_y`는 해당 grid origin의 world 좌표다
- `wp_node` 위치는 전역 유일하다
  - `UNIQUE (grid_id, local_x, local_y)`
- `wp_edge.direction`
  - `0 = blocked`
  - `1 = forward`
  - `2 = backward`
  - `3 = bidirectional`
- `wp_edge`는 canonical order를 유지한다
  - `node0_id < node1_id`
- `wp_segment`는 정확히 하나의 `grid_id`에 속한다
- `wp_point.grid_id == wp_segment.grid_id`
- `wp_point.mouse_button`은 `1` 또는 `3`만 허용한다
- `wp_point`는 `gob_id`를 저장하지 않는다

## Grid Mapping

현재 waypoint가 직접 쓰는 `grid_id`는 Haven `MCache.Grid.id`가 아니다.

- Haven `MCache.Grid.id`
  - `map_grid.haven_id`
- waypoint 내부 `grid_id`
  - `map_grid.id`
- `local_x`, `local_y`
  - 해당 `map_grid` origin world 기준 local offset

runtime 변환:

1. world 좌표에서 현재 tile 계산
2. tile이 속한 `MCache.Grid` 조회
3. `MapFile.gridinfo.get(grid.id)`로 Haven `Segment.id`를 찾음
4. `map_segment(id = Segment.id)`를 보장
5. `map_grid(haven_id = grid.id, map_segment_id = Segment.id, local_x = gridOriginWorld.x, local_y = gridOriginWorld.y)`를 보장
6. 그 `map_grid.id`를 waypoint `grid_id`로 사용
7. `world - grid origin world`를 `local_x/local_y`로 사용

즉 waypoint는 더 이상 virtual 좌표계를 쓰지 않고, Haven grid / segment 구조를 내부 FK 체계로 옮겨서 저장한다.

## Lifecycle

현재 waypoint는 LMI lifecycle을 따라 초기화된다.

- `LmiLifecycle.enterSession()`
  - `RuntimeEventManager` thread를 준비한다
  - `WaypointBootstrap.init()`를 통해 `WaypointDbExecutor`를 준비한다
- `LmiLifecycle.enterWorld()`
  - `MapView.plgob`가 세팅되어 `player()`가 생긴 뒤 호출된다
  - 여기서 waypoint refresh polling이 등록된다
- `LmiLifecycle.leaveWorld()`
  - world-dependent polling과 runtime state를 정리한다

즉 waypoint DB worker는 session 단계에서 준비하고, waypoint refresh는 world 단계에서 시작한다.

## Runtime / Persistence Context

현재 waypoint는 memory-first 2-context 구조다.

- `WaypointRuntimeContext`
  - runtime authoritative state
  - `currentGraphId`
  - `enteringPortal`
  - `WaypointScene`
  - `ManagedObjectContext`
  - node / edge / segment / point cache
  - 각 cache의 `loaded/loading` 상태
  - resident `3 x 3 grid` 집합
- `WaypointDbExecutor`
  - waypoint DB 전용 async worker thread
  - read / write request queue 처리
- `WaypointSyncManager`
  - DB completion을 runtime 쪽으로 되돌리는 중앙 queue
  - 현재 `Hook.mapViewDidDraw(...)`에서 drain 된다

즉 main/render thread는 DB를 직접 기다리지 않고,
DB completion이 나중에 runtime cache를 갱신한다.

## Current Graph

현재 waypoint는 active graph 개념을 가진다.

- `WaypointManager.currentGraphId()`
- `WaypointManager.activeGraphId()`
- `WaypointManager.setCurrentGraphId(...)`

의미:

- node / edge topology는 active graph 단위로 메모리에 유지
- `CreateNodeJob`이 처음 node를 만들면 새 `wp_graph`를 시작한다
- 이후 create / record / stop은 이 active graph를 기준으로 동작한다

## Grid Resolution

현재 world 좌표에서 waypoint `grid_id`를 얻는 책임은 `WaypointGridResolver`가 맡는다.

흐름:

1. Haven `MCache.Grid`를 찾는다
2. `MapFile.gridinfo`로 Haven `Segment.id`를 찾는다
3. `map_segment` row를 보장한다
4. `map_grid` row를 보장한다
5. waypoint 내부 `map_grid.id`를 반환한다

즉 runtime과 DB는 더 이상 Haven `grid.id`를 직접 키로 쓰지 않고, 내부 `map_grid.id`를 공통 키로 쓴다.

## Scene / Bounds

현재 scene build는 `WaypointSceneBuilder`가 맡는다.

정책:

- memory load 범위: player 기준 `3 x 3 grid`
- render 범위: player 기준 `3 x 3 grid`

runtime scene은 `WaypointScene`이 들고 간다.

- `drawableLines`
- `drawableNodes`
- `hiddenNodes`
- `drawablePoints`
- `hiddenPoints`

현재 bounds 타입:

- `WaypointGridBounds`

핵심 역할:

- current center grid 계산
- load / render `3 x 3 grid` 집합 계산
- `grid_id -> world origin` 매핑 제공
- `worldOfGridLocal(gridId, localX, localY)` 제공

scene build 규칙:

- `wp_node`, `wp_edge`는 active graph 전체를 cache에서 본다
- `wp_segment`, `wp_point`는 resident `3 x 3 grid` 집합만 본다
- cache miss면 async preload를 enqueue하고 이번 build는 빈 scene 또는 부분 scene을 만든다
- preload completion이 누적되면 `WaypointManager.requestRefresh()`로 다음 poll 시점에 scene을 다시 만든다

복원 결과 타입:

- `ResolvedLine`
- `ResolvedNode`
- `ResolvedPoint`
- `WaypointScene`
- `WaypointGridBounds`

## Overlay

현재 waypoint 시각화는 `MapView.draw()` 훅 기반이다.

- `Hook.mapViewDidDraw(...)`
- `lmi.draw.LmiOverlay.draw(mapView, g)`
- `WaypointOverlay`는 공용 `MapOverlay` registry에 등록된다
- `CurrentGridDebugOverlay`는 현재 grid debug overlay다

핵심 규칙:

- drawable collection만 그린다
- `ResolvedNode.world`, `ResolvedPoint.world`는 LMI `Coord` world다
- projection 전에 Haven `Coord2d`로 변환한다
- line은 endpoint가 화면 밖이어도 `screenxf(...)` 결과를 그대로 사용한다

## Recorder / Save Pipeline

recording 중 메모리 상태는 다음 타입으로 표현한다.

- `RecordingSession`
- `RecordingSegment`
- `RecordingClick`
- `PendingPortalTransition`

현재 중요한 recording header:

- `baseGraphId`
- `baseGridId`
- `baseLocalX`
- `baseLocalY`

현재 recorder / planner / writer는 다음처럼 나뉜다.

- `WaypointRecorder`
  - raw click record 수집
- `RecordingSessionPlanner`
  - raw recording session을 portal-aware segment session으로 재구성
- `WaypointPortal`
  - portal `resname` 판정과 counterpart `resname` 규칙 제공
- `WaypointPortalResolver`
  - counterpart `resname` 후보 중 현재 world에서 가장 가까운 gob를 찾음
- `WaypointEdgeWriter`
  - planner 결과를 DB 저장 절차로 변환
- `SegmentResolver`
  - 각 segment의 `baseGraphId/baseGridId/baseLocal`를 기준으로 저장 위치를 해석
- `WaypointWriteBridge`
  - edge / segment / point / managed node update용 low-level write bridge

저장 규칙:

- click를 world에서 waypoint `grid_id + local`로 즉시 변환
- grid가 바뀌면 새 `wp_segment`를 시작
- `wp_point`는 항상 자기 `wp_segment.grid_id`와 같은 grid에 저장
- `StopRecordJob` 성공 시 새 edge / segment / point를 runtime cache에 즉시 append한다

## 주요 실행 흐름

### `CreateNodeJob`

1. area chat으로 node 이름 입력
2. 현재 world에서 waypoint `grid_id + local` 계산
3. active graph가 없으면 `createNodeAsync(...)`가 새 `wp_graph`를 시작
4. DB completion에서 새 `WpNode`를 runtime cache에 append
5. `WaypointManager.refresh()`

### `RecordJob`

1. active graph 존재 확인
2. nearby start node 중 가장 가까운 node 선택
3. 그 node로 이동
4. recorder를 `startNodeId + baseGraphId + baseGridId + baseLocal`로 시작

### `StopRecordJob`

1. active recording 종료
2. 현재 waypoint `grid_id + local` 기준으로 end node 재사용 여부 확인
3. 없으면 area chat으로 이름 입력 후 새 node 생성
4. 새 node는 DB completion에서 runtime cache에 즉시 append
5. `WaypointEdgeWriter.saveAsync(...)`로 edge / segment / point 저장
6. 저장 성공 시 edge / segment / point도 runtime cache에 즉시 append
7. `WaypointManager.refresh()`

## Use Cases

### 1. Node 생성

목적:

- 현재 위치를 waypoint node로 등록

흐름:

1. `CreateNodeJob`
2. area chat으로 이름 입력
3. 현재 world에서 waypoint `grid_id + local` 계산
4. active graph가 없으면 새 `wp_graph` 시작
5. `wp_node` 저장
6. runtime cache 즉시 반영
7. overlay에 node / name 표시

### 2. Recording 시작

목적:

- 기존 node를 시작점으로 경로 기록 시작

흐름:

1. `RecordJob`
2. active graph 존재 확인
3. nearby node 중 nearest 선택
4. 그 node로 이동
5. `WaypointRecorder.start(...)`
6. raw click 수집 시작

### 3. Raw click recording

목적:

- 사용자의 map click sequence를 raw input으로 저장

흐름:

1. `Hook.didClicked(...)`
2. `WaypointRecorder.recordMapClick(...)`
3. click의 world / button / mesh / gobResname 기록
4. portal click는 아직 raw 상태로만 들어감

### 4. Portal-aware segment planning

목적:

- raw click sequence를 segment 단위로 재해석

흐름:

1. `RecordingSessionPlanner.plan(...)`
2. portal click를 `isPortal=true`로 마킹
3. portal click에서 segment split
4. 다음 segment의 base를 exit portal 근처 world 기준으로 잡음
5. 현재는 `WaypointPortal` / `WaypointPortalResolver`의 resname heuristic 사용

### 5. Recording 종료 및 저장

목적:

- end node를 확정하고 edge/path를 DB에 저장

흐름:

1. `StopRecordJob`
2. 현재 waypoint `grid_id + local` 기준 end node 재사용 여부 확인
3. 없으면 새 node 생성
4. `WaypointEdgeWriter.saveAsync(...)`
5. `wp_edge`, `wp_segment`, `wp_point` 저장
6. runtime cache 즉시 append
7. refresh

### 6. Waypoint topology load

목적:

- navigation용 graph topology를 메모리에 유지

흐름:

1. active graph 기준
2. `loadNodesByGraphAsync(...)`
3. `loadEdgesByGraphAsync(...)`
4. `WaypointRuntimeContext` cache 반영

핵심:

- node / edge는 graph 단위로 전부 메모리에 유지

### 7. Waypoint geometry resident load

목적:

- 시각화에 필요한 segment / point만 근처 grid 기준으로 메모리에 유지

흐름:

1. `WaypointManager.processRefreshRequests()`
2. 현재 player 기준 `3 x 3 grid` 계산
3. `loadSegmentsByGridAsync(...)`
4. `loadPointsByGridAsync(...)`
5. resident grid set 갱신

핵심:

- segment / point는 graph 전체가 아니라 local resident만 유지

### 8. Scene build / overlay draw

목적:

- 현재 active graph와 resident geometry를 화면에 보이도록 scene 구성

흐름:

1. `WaypointSceneBuilder.build(...)`
2. node / edge / segment / point cache 기반으로 `WaypointScene` 생성
3. `WaypointOverlay.draw(...)`
4. drawable node / point / line projection 후 렌더

### 9. Entering portal snapshot

목적:

- portal transition 직전 어떤 portal을 탔는지 runtime에 남김

흐름:

1. `Hook.didClicked(...)`
2. 우클릭 gob이면 `WaypointManager.captureEnteringPortal(...)`
3. `graphId + gridId + local + resname` 저장

### 10. Managed node 수정 저장

목적:

- 이미 로드된 node의 수정사항을 memory-first로 반영하고 async save

흐름:

1. `ManagedWpNode`
2. `ManagedObjectContext.save()`
3. `WaypointDbExecutor`
4. completion 후 clean 처리

### 11. Debug visualization / inspection

목적:

- 현재 graph / scene / grid 상태를 관찰

흐름:

1. `DescribeWaypointSceneEffect`
2. `CurrentGridDebugOverlay`
3. `DescribeMapViewCenterEffect`

핵심:

- grid world corner 확인
- scene counts / bounds 확인
- current map center / grid id 확인

## 현재 없는 것

다음 개념은 현재 waypoint에서 제거됐다.

- anchor
- calibration
- virtual coordinate
- cut-based residency
- `wp_portal`
- `wp_portal_pair`

portal 관련 처리는 지금은 DB pair가 아니라 `resname` 기반 heuristic만 유지한다.

## 남은 과제

- `NavigateJob` 구현
- portal transition을 heuristic이 아니라 명시적 passage/link 모델로 올릴지 결정
- 문서와 코드의 세부 명칭 정리
