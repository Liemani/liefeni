# Current Grid Bootstrap

## Indexes

- [../indexes/waypoint.md](../indexes/waypoint.md)

이 문서는 current player grid를 waypoint DB에 확보하는 현재 문제와, 이를 해결하기 위한 설계를 정리한다.

관련 요구사항:

- `REQ-WP-002`
- `REQ-WP-003`
- `REQ-DB-005`

관련 결정:

- `DEC-005`
- `DEC-006`
- `DEC-010`

## 문제

현재 `CreateNodeJob`이 실패하는 직접 원인은:

- 현재 player가 서 있는 Haven grid가 아직 waypoint DB의 `map_segment` / `map_grid` row로 확보되지 않았고
- `CreateNodeJob`이 그 상태에서 현재 grid 위치를 즉시 요구하기 때문이다

즉 문제는 “새 DB라서 row가 없다” 자체가 아니라,

- eager path가 약하고
- lazy fallback이 불완전하며
- user-facing failure 메시지가 내부 구현 상태를 그대로 드러낸다

는 점이다.

## 목표

현재 player grid는 다음 세 경로를 통해 확보되어야 한다.

1. world enter 직후 eager path
2. refresh 중 lazy fallback
3. waypoint user action 중 마지막 fallback

이 세 경로가 함께 있어야

- 초기 사용성
- 구조적 안전성
- async DB 흐름

을 같이 만족시킬 수 있다.

## 설계

### 1. World Enter Eager Path

`LmiLifecycle.enterWorld(MapView)`에서:

1. `WaypointStore.initializeAsync(...)`를 먼저 enqueue
2. success callback에서 `WaypointManager.requestRefresh()`를 건다
3. current player grid 확보 요청도 함께 시작한다

즉 world enter 이후 가능한 빨리 현재 Haven grid를 `map_segment` / `map_grid` row로 확보하는 것이 기본 경로다.

## 2. Refresh Lazy Fallback

`WaypointManager.processRefreshRequests()`는 현재처럼:

1. current world 위치에서 current Haven grid를 찾고
2. waypoint `map_grid`가 아직 없으면 ensure request를 enqueue하고
3. 다음 tick / refresh에서 다시 본다

이 경로는 eager path가 아직 끝나지 않았거나, 새로운 grid에 막 진입한 경우의 fallback이다.

## 3. User Action Fallback

`CreateNodeJob`, 이후 필요하면 `RecordJob` 같은 waypoint user action은:

1. current grid 위치를 요구했는데 아직 없으면
2. 그 자리에서 current grid 확보 요청을 다시 건다
3. 사용자에게는 내부 상태가 아니라
   - `현재 grid 정보를 저장 중입니다. 잠시 후 다시 시도해 주세요.`
   같은 retry-friendly 메시지를 보여준다

즉 immediate hard failure 대신, 현재 grid 확보가 아직 끝나지 않았음을 알려주는 방식으로 간다.

## Helper 분리

현재 grid 확보 로직은 한 군데로 모아야 한다.

추천 helper:

- `WaypointManager.ensureCurrentGrid()`

역할:

- 현재 player 위치의 Haven grid를 본다
- current `map_segment` / `map_grid` row 확보 요청을 건다
- 이미 있으면 no-op
- 없으면 async ensure enqueue

이 helper를:

- world enter eager path
- refresh fallback
- user action fallback

세 군데에서 공통 사용한다.

## 조회와 확보의 분리

이 설계에서 중요한 점은:

- `currentGridPosition()`
  - 조회
- `ensureCurrentGrid()`
  - 확보 시도

를 분리하는 것이다.

즉 상태 조회 함수가 과도한 side effect를 숨기지 않게 하고,
확보 시도는 별도 helper가 맡는다.

## 최종 요약

current grid 확보는

- world enter eager ensure
- refresh lazy fallback
- user action fallback

3단계 구조로 간다.

그리고 그 공통 로직은 `WaypointManager.ensureCurrentGrid()` 같은 helper로 모아
중복 구현과 요구사항 drift를 줄인다.
