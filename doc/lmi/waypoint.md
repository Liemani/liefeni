# Waypoint

이 문서는 현재 LMI waypoint 시스템의 목적, 계층, 주요 불변식, 상태 전이, 저장 흐름을 정리한다.

## 목적

waypoint 시스템은 두 가지를 동시에 다룬다.

- 관측 가능한 `Gob`를 기준으로 맵/포탈 사이 좌표를 연결하는 것
- 실제 캐릭터 이동 경로를 waypoint graph로 저장하고 재사용하는 것

이 둘은 별도 계층으로 분리한다.

## 계층

### `gob_*`

`gob_graph`, `gob_node`, `gob_edge`는 실제 world에서 관측 가능한 gob 기반 그래프다.

- `gob_graph`
  - 연결 성분 단위
  - `entry_node_id`를 가진다
- `gob_node`
  - 실제 gob 하나를 node로 취급한다
  - `id == gob_id`
  - `vir_x`, `vir_y`를 가진다
  - 필요하면 `wp_node_id`와 1:1로 연결된다
- `gob_edge`
  - gob 간 연결
  - 좌표 연결용이므로 direction을 두지 않는다

### `wp_*`

`wp_node`, `wp_edge`, `wp_segment`, `wp_point`는 실제 이동 경로를 표현한다.

- `wp_node`
  - 실제 pathfinding용 node
  - 하나의 `gob_node`를 anchor로 가진다
- `wp_edge`
  - 두 `wp_node` 사이 이동 경로
  - direction, time_cost, fatigue_cost를 가진다
- `wp_segment`
  - 하나의 `wp_edge` 안에 있는 순차 구간
  - `step`과 `gob_graph_id`를 가진다
- `wp_point`
  - 각 segment 안의 recorded click 위치
  - `vir_x`, `vir_y`는 virtual coordinate 기준 절대값이다

## 현재 스키마 의미

### virtual coordinate

모든 저장 좌표는 실제 world coordinate가 아니라 virtual coordinate다.

- `gob_node.vir_x`, `gob_node.vir_y`
- `wp_node.vir_x`, `wp_node.vir_y`
- `wp_point.vir_x`, `wp_point.vir_y`

graph 병합 시에는 회전이나 스케일 조정 없이, `deltaX`, `deltaY`를 이용한 평행이동만 허용한다.

### graph 병합

서로 다른 `gob_graph`가 하나의 recorded segment에서 연결되면 병합한다.

병합 시 재계산 대상:

- 작은 graph의 `gob_node.vir_x`, `gob_node.vir_y`
- 작은 graph의 `wp_node.vir_x`, `wp_node.vir_y`
- 작은 graph에 속한 `wp_segment.gob_graph_id`
- 작은 graph에 속한 `wp_point.vir_x`, `wp_point.vir_y`

즉 waypoint system은 graph 병합을 단순 translation 문제로 제한한다.

## calibration

현재 waypoint 좌표계를 실제 world에 맞추는 작업을 calibration이라고 부른다.

- `WaypointManager.calibrate(gob)`
- `WaypointManager.isCalibrated()`
- `WaypointManager.calibrationGob()`

여기서 `calibrationGob`는 현재 맵에서 virtual coordinate를 실제 좌표로 복원하기 위한 기준 gob다.

`ResolvedNode`, `ResolvedGob`, `ResolvedPoint`는 calibration 이후 계산된 nearby 결과 타입이다.

portal 이동 후에는 tick에서 자동 recalibration을 시도한다.

- 기존 `calibrationGob`가 현재 `OCache`에서 사라졌으면
- 현재 맵의 portal gob 중 DB에 등록된 gob를 찾고
- 가장 가까운 portal gob로 `calibrate(...)`
- 실패하면 calibration을 해제한다

즉 portal을 통한 recalibration에는 사용자 입력이 필요 없다.

## scene / bounds

현재 `WaypointManager`는 단순 nearby range query가 아니라 scene builder에 가깝다.

정책:

- memory load 범위: player 기준 `7 x 7 cut`
- render 범위: player 기준 `5 x 5 cut`

runtime scene은 `WaypointScene`이 들고 간다.

- `drawableNodes`
- `hiddenNodes`
- `drawablePoints`
- `hiddenPoints`

여기서 hidden은 attribute가 아니라 별도 collection이다.

### cut 판정 규칙

cut 판정은 `vir` 좌표에서 직접 하지 않는다.

1. calibration 기준으로 `vir -> world` translation
2. world 좌표를 tile / cut으로 변환
3. `renderArea`, `loadArea`와 비교

즉 waypoint의 visible/load 분류는 항상 실제 world 위치 기준이다.

### hidden frontier

어떤 `wp_node`가 hidden이면:

- 그 node는 hidden collection에 넣고
- 그 node와 연결된 다음 `wp_node` 한 hop까지만 추가 적재한다

즉 hidden node는 frontier 역할을 하며, 그 너머를 무한히 읽지 않는다.

## overlay

현재 waypoint 시각화는 별도 widget이 아니라 `MapView.draw()` 훅 기반이다.

- `Hook.mapViewDidDraw(...)`
- `WaypointOverlay.draw(mapView, g)`

`WaypointOverlay`는 drawable collection만 그린다.

중요:

- `ResolvedNode.world`, `ResolvedPoint.world`는 LMI `Coord` (`1024` 기준)
- projection 전에 Haven `Coord2d` (`11` 기준)로 변환해야 한다
- 그 다음 `MapView.screenxf(...)`를 호출한다

즉 렌더링은 UI widget layer가 아니라 `MapView` 내부 world overlay로 취급한다.

## recorder 계층

recording 중 메모리 상태는 다음 타입으로 표현한다.

- `RecordingSession`
  - recording 전체 런타임 상태
- `RecordingSegment`
  - recording 내부 구간
- `RecordingClick`
  - 하나의 recorded click
- `PendingPortalTransition`
  - 반대편 portal gob가 아직 확정되지 않은 상태

### `RecordingClick`

`RecordingClick`의 책임은 recorded click 1건을 표현하는 것이다.

- `index`
- `x`, `y`
- `mouseButton`
- `gobId`
- `meshId`
- `gobResname`
- `isPortal`

이 타입은 수학적 point가 아니라 input record에 가깝다.

## portal 처리

waypoint는 문보다 더 일반적인 개념으로 portal을 사용한다.

현재 portal 규칙은 `WaypointPortal`이 담당한다.

- portal entry gob의 `resname`
- 가능한 counterpart `resname` 후보
- 현재 맵에서 가장 가까운 counterpart gob 탐색

현재는 작은 하드코딩 사전으로 시작한다.

예:

- `gfx/terobjs/arch/stonehut` <-> `gfx/terobjs/arch/stonehut-door`
- `gfx/terobjs/burrow` <-> `gfx/tiles/ridges/caveout`
- `gfx/tiles/ridges/cavein2` <-> `gfx/tiles/ridges/caveout`

### portal transition 상태 전이

`WaypointRecorder`는 portal 통과를 두 단계로 처리한다.

1. 직전 click가 portal click였는지 판정
2. 반대편 portal gob를 나중에 확정

관련 메서드:

- `_rotateSegmentIfPreviousWasPortal(...)`
  - 직전 click를 portal로 확정
  - 현재 segment를 닫고
  - pending portal transition을 만들고
  - 다음 segment를 시작
- `_finalizeLastPortalClick(...)`
  - 마지막 click는 다음 click가 없으므로
  - `stop()` 시점에 portal 여부를 최종 확정
- `_resolvePendingPortalTransition(...)`
  - 반대편 portal gob를 실제로 찾아
  - 새 segment의 시작 gob를 채운다

## 주요 실행 흐름

### `CreateNodeJob`

1. 사용자가 gob 선택
2. area chat으로 node 이름 입력
3. 현재 위치를 `wp_node` 위치로 사용
4. 기준 gob와 함께 root 수준의 node 생성
5. 성공 시 `WaypointManager.calibrate(gob)`

### `CalibrateWaypointJob`

1. 사용자가 등록된 gob 선택
2. `WaypointManager.calibrate(gob)`
3. nearby node/point 수를 확인 가능

### `RecordJob`

1. calibrated 상태 확인
2. `WaypointManager.refresh()`
3. nearby start node 선택
4. 그 node 근처로 이동
5. `WaypointRecorder.start(...)`
6. 사용자의 click를 `RecordingSession`에 누적

### `StopRecordJob`

1. `WaypointRecorder.stop()`
2. end gob 선택
3. `WaypointRecorder.setTerminalGob(...)`
4. end gob에 연결된 `wp_node` 재사용 또는 새 생성
5. `WaypointEdgeWriter.save(...)`
6. 성공 시 end gob 기준으로 다시 calibration

## 저장 파이프라인

저장/조회 계층은 다음처럼 분리한다.

- `WaypointStore`
  - waypoint 도메인이 사용하는 public facade
  - waypoint SQLite connection 하나를 오래 들고 가는 shared connection owner
  - managed DB worker owner
  - `GobNode`, `WpNode`, `WpPoint` object를 반환한다
  - root/node 생성도 여기로 진입한다
- `WaypointDatabase`
  - SQL schema 생성
  - connection을 인자로 받는 low-level query / insert helper
  - package-private SQL 계층이며, 현재는 `WaypointStore`, `WaypointEdgeWriter`, `SegmentResolver`, `GobGraphMerger`가 내부적으로 사용한다

저장 orchestration은 다음 순서로 분리한다.

- `StopRecordJob`
  - 사용자 입력 orchestration
- `WaypointEdgeWriter`
  - `RecordingSession`을 DB 저장 절차로 변환
- `SegmentResolver`
  - 각 segment의 시작/끝 gob를 보고 graph를 확정
- `GobGraphMerger`
  - graph가 다르면 병합
- `WaypointDatabase`
  - schema, query, low-level insert helper

즉 현재 구조는:

`Job -> WaypointStore`

`StopRecordJob -> WaypointEdgeWriter -> SegmentResolver -> GobGraphMerger -> WaypointDatabase`

그리고 draw/runtime 쪽은:

`CalibrateWaypointJob -> WaypointManager.refresh/tick -> WaypointScene -> WaypointOverlay.draw`

## 핵심 불변식

- `gob_node.id == gob_id`
- `gob_node.wp_node_id`는 nullable 1:1이다
- `wp_node.gob_graph_id`와 `wp_node.gob_node_id`는 항상 일관되어야 한다
- `wp_segment.gob_graph_id`는 해당 segment의 point가 속한 graph를 뜻한다
- `wp_point.vir_x`, `wp_point.vir_y`는 segment graph 기준 absolute virtual coordinate다
- graph 병합은 translation만 허용한다
- `RecordingSession`은 저장 전 raw recording 상태다
- `RecordingClick`은 point가 아니라 click record다

## 유지보수 원칙

- `gob_*`와 `wp_*` 책임을 섞지 않는다
- recorder는 raw 사실 수집에 가깝게 유지한다
- DB 저장 해석은 writer/resolver/merger로 분리한다
- graph 병합 규칙은 단순 translation만 허용한다
- portal pair 규칙은 `WaypointPortal` 한 곳에 모은다
