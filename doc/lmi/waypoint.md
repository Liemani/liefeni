# Waypoint

이 문서는 현재 LMI waypoint 시스템의 목적, 스키마, calibration, runtime, 저장 흐름을 간단히 정리한다.

## 목적

현재 waypoint는 더 이상 `gob_id`가 불변이라고 가정하지 않는다.
핵심은 다음 세 가지다.

- graph별 virtual coordinate 유지
- portal pair를 통한 world transition 뒤 graph 재식별
- `wp_node/wp_edge/wp_segment/wp_point` 기반 recorded path 저장

현재 구현은 책임 기준으로 다음 패키지로 나뉜다.

- `lmi.waypoint`
  - facade / bootstrap / overlay / debug
- `lmi.waypoint.persistence`
  - DB facade, DB executor, sync queue, low-level SQL helper
- `lmi.waypoint.runtime`
  - runtime authoritative cache, calibration state, scene build/result
- `lmi.waypoint.calibration`
  - area / portal calibration, portal resolver
- `lmi.waypoint.recording`
  - raw recording, segment planning, edge save, segment resolution

## 스키마

현재 핵심 테이블:

- `wp_graph`
- `wp_anchor`
- `wp_portal`
- `wp_portal_pair`
- `wp_node`
- `wp_edge`
- `wp_segment`
- `wp_point`

의미:

- `wp_graph`
  - 하나의 virtual coordinate graph
- `wp_anchor`
  - graph별 calibration 기준 virtual 좌표
- `wp_portal`
  - graph 안의 portal 위치와 `resname`
- `wp_portal_pair`
  - portal 간 무방향 pair
- `wp_node`
  - pathfinding / user-visible node
- `wp_edge`
  - node 간 연결
- `wp_segment`
  - edge 내부의 순차 구간
  - 각 segment가 속한 `graph_id` 보유
- `wp_point`
  - segment 내부 recorded click point

핵심 규칙:

- 첫 graph 생성 시 사용자가 area select 한 anchor tile의 시작 world 좌표가 virtual `(0, 0)`이 된다
- `wp_portal_pair`는 무방향 pair이며 `portal0_id < portal1_id`를 유지한다
- `wp_edge.direction`
  - `0 = blocked`
  - `1 = forward`
  - `2 = backward`
  - `3 = bidirectional`
- `wp_segment.graph_id`는 해당 segment point가 속한 graph를 뜻한다
- `wp_point`는 `gob_id`를 저장하지 않는다

## Virtual Coordinate

모든 저장 좌표는 virtual coordinate다.

- `wp_anchor.vir_x`, `wp_anchor.vir_y`
- `wp_portal.vir_x`, `wp_portal.vir_y`
- `wp_node.vir_x`, `wp_node.vir_y`
- `wp_point.vir_x`, `wp_point.vir_y`

즉 world <-> virtual 변환은 calibration world origin과 calibration virtual origin 사이의 translation 문제로만 다룬다.

## Bootstrap

현재 waypoint bootstrap은 다음처럼 나뉜다.

- `LmiBootstrap`
  - LMI 전역 bootstrap 진입점
  - `RuntimeEventManager.init()`
  - `WaypointBootstrap.init()`
- `WaypointBootstrap`
  - `WaypointDbExecutor.init()`
  - anchor async preload 시작
  - completion에서 anchor cache를 runtime context에 반영

즉 bootstrap 시점부터 waypoint는 DB worker thread와 runtime cache를 같이 준비한다.

## Runtime / Persistence Context

현재 waypoint는 memory-first 2-context 구조로 가는 중이다.

- `WaypointRuntimeContext`
  - runtime authoritative state
  - calibration state
  - scene
  - managed object context
  - anchor / portal / node / edge / segment / point cache
  - 각 cache의 `loaded/loading` 상태
- `WaypointDbExecutor`
  - waypoint DB 전용 async worker thread
  - read / write request queue 처리
- `WaypointSyncManager`
  - DB completion을 runtime 쪽으로 되돌리는 중앙 queue
  - 현재 `Hook.mapViewDidDraw(...)`에서 drain 된다

즉 main/render thread는 DB를 직접 기다리지 않고, DB completion이 나중에 runtime cache를 갱신한다.

현재 위치:

- `lmi.waypoint.runtime.WaypointRuntimeContext`
- `lmi.waypoint.persistence.WaypointDbExecutor`
- `lmi.waypoint.persistence.WaypointSyncManager`

## Calibration

현재 waypoint 좌표계를 실제 world에 맞추는 작업을 calibration이라고 부른다.

- `WaypointManager.hasAnchor()`
- `WaypointManager.calibrate(Rect area)`
- `WaypointManager.calibrate(Gob gob)`
- `WaypointManager.isCalibrated()`
- `WaypointManager.calibrationGraphId()`
- `WaypointManager.calibrationVir()`
- `WaypointManager.calibrationWorld()`

첫 calibration:

- 사용자가 anchor tile을 포함하는 area를 선택
- 그 area의 origin world 좌표를 calibration world origin으로 사용
- anchor row의 `(vir_x, vir_y)`를 calibration virtual origin으로 사용

portal recalibration:

- 현재 graph의 `wp_portal`
- 그 portal의 `wp_portal_pair`
- counterpart `resname`

를 이용해 현재 world에서 가장 가까운 matching portal gob를 찾고 `calibrate(gob)`를 호출한다.

현재 calibration runtime은 다음처럼 분리돼 있다.

- `WaypointCalibrationState`
  - anchor / calibration runtime state
- `WaypointCalibrator`
  - area / portal calibration 수행 로직
- `WaypointManager`
  - public facade
  - refresh orchestration

현재 calibration은 DB direct read를 바로 하지 않고, 먼저 runtime cache를 본다.
anchor / portal cache가 비어 있으면 async preload를 걸고 이번 calibration은 실패한다.

현재 위치:

- `lmi.waypoint.runtime.WaypointCalibrationState`
- `lmi.waypoint.calibration.WaypointCalibrator`
- `lmi.waypoint.WaypointManager`

## Scene / Bounds

현재 scene build는 `WaypointSceneBuilder`가 맡는다.

정책:

- memory load 범위: player 기준 `7 x 7 cut`
- render 범위: player 기준 `5 x 5 cut`

runtime scene은 `WaypointScene`이 들고 간다.

- `drawableLines`
- `drawableNodes`
- `hiddenNodes`
- `drawablePoints`
- `hiddenPoints`

여기서 hidden은 attribute가 아니라 별도 collection이다.

cut 판정 규칙:

1. calibration 기준으로 `vir -> world` translation
2. world 좌표를 tile / cut으로 변환
3. `renderArea`, `loadArea`와 비교

즉 visible/load 분류는 항상 실제 world 위치 기준이다.

현재 scene build는 DB를 직접 읽지 않고 runtime cache를 기준으로 동작한다.

- node / edge / segment / point cache가 이미 있으면 즉시 scene 구성
- cache miss면 대응되는 async preload를 enqueue
- 이번 build에서는 빈 scene 또는 부분 scene을 반환
- preload completion이 누적되면 `WaypointManager.requestRefresh()`로 다음 poll 시점에 scene을 다시 만든다

복원 결과 타입:

- `ResolvedLine`
- `ResolvedNode`
- `ResolvedPoint`
- `WaypointScene`
- `WaypointCutBounds`

현재 위치:

- `lmi.waypoint.runtime.WaypointSceneBuilder`
- `lmi.waypoint.runtime.ResolvedLine`
- `lmi.waypoint.runtime.ResolvedNode`
- `lmi.waypoint.runtime.ResolvedPoint`
- `lmi.waypoint.runtime.WaypointScene`
- `lmi.waypoint.runtime.WaypointCutBounds`

## Overlay

현재 waypoint 시각화는 별도 widget이 아니라 `MapView.draw()` 훅 기반이다.

- `Hook.mapViewDidDraw(...)`
- `WaypointOverlay.draw(mapView, g)`

핵심 규칙:

- drawable collection만 그린다
- `ResolvedNode.world`, `ResolvedPoint.world`는 LMI `Coord` (`1024` 기준)
- projection 전에 Haven `Coord2d` (`11` 기준)로 변환해야 한다
- terrain 높이도 붙여서 `MapView.screenxf(...)`를 호출한다

## Portal Runtime

현재 portal 관련 책임은 둘로 나뉜다.

- `WaypointPortal`
  - portal `resname` 분류
  - 기본 counterpart `resname` 규칙
- `WaypointPortalResolver`
  - 현재 calibration graph의 `wp_portal` 읽기
  - `wp_portal_pair`를 따라 counterpart portal 찾기
  - 그 counterpart의 `resname`과 현재 world gob를 매칭
  - 가장 가까운 portal gob를 선택

현재 위치:

- `lmi.waypoint.calibration.WaypointPortal`
- `lmi.waypoint.calibration.WaypointPortalResolver`

portal world transition event는 다음처럼 처리한다.

1. `MapView`가 실제 portal 우클릭 뒤 pending 상태를 유지
2. `"move"` 메시지 처리 시 `Hook.didEnterPortal()`
3. `RuntimeEventManager.calibratePortal()`가 1회성 handler 등록
4. `WaypointPortalResolver.closestPortalForRecalibration()`로 portal gob 후보를 찾음
5. `WaypointManager.calibrate(gob)`로 recalibration 시도

portal 관련 DB read도 runtime cache를 거친다.

- graph portal 목록
- portal counterpart 목록

둘 다 cache가 비어 있으면 preload를 걸고, 현재 시도는 fallback 또는 실패로 빠진다.

## Recorder / Save Pipeline

recording 중 메모리 상태는 다음 타입으로 표현한다.

- `RecordingSession`
- `RecordingSegment`
- `RecordingClick`

`RecordingClick`은 point가 아니라 click record다.

현재 중요한 필드:

- `x`, `y`
- `mouseButton`
- `meshId`
- `gobResname`
- `isPortal`

현재 recorder / planner / writer는 다음처럼 나뉜다.

- `WaypointRecorder`
  - raw click record 수집
- `RecordingSessionPlanner`
  - raw recording session을 portal-aware segment session으로 재구성
- `WaypointEdgeWriter`
  - planner 결과를 DB 저장 절차로 변환
- `SegmentResolver`
  - 각 segment의 `baseGraphId/baseVir`를 기준으로 graph를 확정
- `WaypointWriteBridge`
  - edge / segment / point / managed update용 low-level write bridge

현재 위치:

- `lmi.waypoint.recording.WaypointRecorder`
- `lmi.waypoint.recording.RecordingSessionPlanner`
- `lmi.waypoint.recording.WaypointEdgeWriter`
- `lmi.waypoint.recording.SegmentResolver`
- `lmi.waypoint.persistence.WaypointWriteBridge`

즉 현재 저장 경로는:

`StopRecordJob -> WaypointEdgeWriter -> RecordingSessionPlanner -> SegmentResolver -> WaypointWriteBridge -> WaypointDatabase`

현재 write는 기본적으로 async다.

- anchor 생성: `createAnchorAsync`
- anchor 변경: `updateAnchorAsync`
- node 생성: `createNodeAsync`
- edge 저장: `saveAsync`
- managed node 수정 저장: `ManagedObjectContext.save()` -> `WaypointDbExecutor`

## 주요 실행 흐름

### `CreateNodeJob`

1. anchor cache가 load 되었는지 확인
2. `WaypointManager.hasAnchor()` 확인
3. anchor가 없으면 anchor tile area 선택
4. area chat으로 node 이름 입력
5. `WaypointStore.createAnchorAsync(...)`
6. completion에서 `WaypointManager.calibrate(area)`
7. 이어서 `WaypointStore.createNodeAsync(...)`
8. completion에서 `WaypointManager.refresh()`

anchor가 이미 있으면 3~6을 건너뛰고 현재 위치 `vir` 기준으로 `createNodeAsync(...)`만 수행한다.

### `CalibrateWaypointJob`

1. anchor cache가 load 되었는지 확인
2. 사용자가 anchor tile area 선택
3. `WaypointManager.calibrate(area)`
4. nearby node/point 수를 확인 가능

### `RecordJob`

1. calibrated 상태 확인
2. `WaypointManager.refresh()`
3. nearby start node 선택
4. 그 node 위치로 이동
5. start node의 `graph/world/vir`를 기준으로 `WaypointRecorder.start(...)`

### `StopRecordJob`

1. `WaypointRecorder.stop()`
2. end gob 선택
3. `WaypointRecorder.setTerminalGob(...)`
4. current `graph + vir` 기준으로 end node 재사용 또는 새 생성
5. 새 node가 필요하면 `WaypointStore.createNodeAsync(...)`
6. completion에서 `WaypointEdgeWriter.saveAsync(...)`
7. 성공 시 end gob 기준으로 다시 calibration

## 핵심 불변식

- `wp_anchor`는 graph별로 최대 1개다
- `wp_segment.graph_id`는 해당 segment point가 속한 graph를 뜻한다
- `wp_point.vir_x`, `wp_point.vir_y`는 segment graph 기준 absolute virtual coordinate다
- `RecordingSession`은 저장 전 raw recording 상태다
- `RecordingClick`은 point가 아니라 click record다
- cache miss read는 async preload를 걸고 다음 refresh에서 반영한다
- 같은 cache key에 대한 중복 preload는 `loading` 상태로 coalesce 한다

## 유지보수 원칙

- recorder는 raw 사실 수집에 가깝게 유지한다
- session -> segment 해석은 planner로 분리한다
- DB 저장 해석은 writer / resolver / write bridge로 분리한다
- portal 분류는 `WaypointPortal`, runtime portal 탐색은 `WaypointPortalResolver`에 둔다
- runtime은 memory-first로 읽고, DB는 async persistence backend로 둔다
