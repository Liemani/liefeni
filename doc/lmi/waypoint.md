# Waypoint

이 문서는 현재 LMI waypoint 시스템의 목적, 스키마, calibration, 저장 흐름을 간단히 정리한다.

## 목적

현재 waypoint는 더 이상 `gob_id`가 불변이라고 가정하지 않는다.
핵심은 다음 세 가지다.

- graph별 virtual coordinate 유지
- portal pair를 통한 world transition 뒤 graph 재식별
- `wp_node/wp_edge/wp_segment/wp_point` 기반 recorded path 저장

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
  - edge 내부의 순차 구간, 각 segment가 속한 `graph_id` 보유
- `wp_point`
  - segment 내부 recorded click point

## virtual coordinate

모든 저장 좌표는 virtual coordinate다.

- `wp_anchor.vir_x`, `wp_anchor.vir_y`
- `wp_portal.vir_x`, `wp_portal.vir_y`
- `wp_node.vir_x`, `wp_node.vir_y`
- `wp_point.vir_x`, `wp_point.vir_y`

첫 graph 생성 시:

- 사용자가 area select 한 anchor tile의 시작 world 좌표가
- virtual `(0, 0)`이 된다

즉 이후 world <-> virtual 변환은 calibration world origin과 calibration virtual origin 사이의 translation 문제로만 다룬다.

## calibration

현재 waypoint 좌표계를 실제 world에 맞추는 작업을 calibration이라고 부른다.

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

## scene / bounds

현재 `WaypointManager`는 nearby range query보다 scene builder에 가깝다.

정책:

- memory load 범위: player 기준 `7 x 7 cut`
- render 범위: player 기준 `5 x 5 cut`

runtime scene은 `WaypointScene`이 들고 간다.

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

복원 결과 타입:

- `ResolvedNode`
- `ResolvedPoint`
- `WaypointScene`
- `WaypointCutBounds`

## overlay

현재 waypoint 시각화는 별도 widget이 아니라 `MapView.draw()` 훅 기반이다.

- `Hook.mapViewDidDraw(...)`
- `WaypointOverlay.draw(mapView, g)`

중요:

- `ResolvedNode.world`, `ResolvedPoint.world`는 LMI `Coord` (`1024` 기준)
- projection 전에 Haven `Coord2d` (`11` 기준)로 변환해야 한다
- terrain 높이도 붙여서 `MapView.screenxf(...)`를 호출한다

## recorder 계층

recording 중 메모리 상태는 다음 타입으로 표현한다.

- `RecordingSession`
- `RecordingSegment`
- `RecordingClick`
- `PendingPortalTransition`

`RecordingClick`은 point가 아니라 click record다.

현재 중요한 필드:

- `x`, `y`
- `mouseButton`
- `meshId`
- `gobResname`
- `isPortal`

## portal 처리

현재 portal 규칙은 `WaypointPortal`이 담당한다.

- 현재 calibration graph의 `wp_portal` 읽기
- `wp_portal_pair`를 따라 counterpart portal 찾기
- 그 counterpart의 `resname`과 현재 world gob를 매칭
- 가장 가까운 portal gob를 선택

`WaypointRecorder`는 portal 통과를 두 단계로 처리한다.

1. 직전 click가 portal click였는지 판정
2. 반대편 portal gob와 현재 calibration을 바탕으로 새 segment의 `baseGraphId/baseVir`를 채움

## 주요 실행 흐름

### `CreateNodeJob`

1. 사용자가 anchor tile area 선택
2. area chat으로 node 이름 입력
3. 현재 위치를 `wp_node` 위치로 사용
4. `wp_graph`, `wp_anchor`, `wp_node` 생성
5. 성공 시 `WaypointManager.calibrate(area)`

### `CalibrateWaypointJob`

1. 사용자가 anchor tile area 선택
2. `WaypointManager.calibrate(area)`
3. nearby node/point 수를 확인 가능

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
5. `WaypointEdgeWriter.save(...)`
6. 성공 시 end gob 기준으로 다시 calibration

## 저장 파이프라인

저장/조회 계층은 다음처럼 분리한다.

- `WaypointStore`
  - waypoint 도메인이 사용하는 public facade
  - waypoint SQLite connection 하나를 오래 들고 가는 shared connection owner
  - managed DB worker owner
  - `WpAnchor`, `WpPortal`, `WpNode`, `WpPoint` object를 반환한다
- `WaypointDatabase`
  - SQL schema 생성
  - connection을 인자로 받는 low-level query / insert helper
- `WaypointEdgeWriter`
  - `RecordingSession`을 DB 저장 절차로 변환
- `SegmentResolver`
  - 각 segment의 `baseGraphId/baseVir`를 기준으로 graph를 확정

즉 현재 구조는:

`StopRecordJob -> WaypointEdgeWriter -> SegmentResolver -> WaypointDatabase`

그리고 draw/runtime 쪽은:

`CalibrateWaypointJob -> WaypointManager.refresh -> WaypointScene -> WaypointOverlay.draw`

## 핵심 불변식

- `wp_anchor`는 graph별로 최대 1개다
- `wp_segment.graph_id`는 해당 segment의 point가 속한 graph를 뜻한다
- `wp_point.vir_x`, `wp_point.vir_y`는 segment graph 기준 absolute virtual coordinate다
- `RecordingSession`은 저장 전 raw recording 상태다
- `RecordingClick`은 point가 아니라 click record다

## 유지보수 원칙

- recorder는 raw 사실 수집에 가깝게 유지한다
- DB 저장 해석은 writer/resolver로 분리한다
- portal pair 규칙은 `WaypointPortal` 한 곳에 모은다
