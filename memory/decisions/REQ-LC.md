# REQ-LC

## Lifecycle

- `REQ-LC-000`
  - LMI는 Haven 위에 붙는 확장 계층이어야 하며, Haven 자체를 대체하거나 재구성하는 방향으로 구현하면 안 된다.
  - LMI 기능은 가능한 한 hook / bridge / overlay / worker 형태로 Haven 바깥에서 추가되어야 한다.
- `REQ-LC-001`
  - process-level 초기화의 유일한 orchestration entry는 `LmiLifecycle.initProcess()`여야 한다.
  - process-level subsystem은 자기 자신이 전체 초기화 소유권을 가져서는 안 된다.
- `REQ-LC-002`
  - session-level lifecycle 진입은 Haven `Session` 생성 경계에서 `LmiLifecycle.enterSession(Session)`으로 직접 전달되어야 한다.
  - 다른 LMI helper나 context class가 session enter를 추론해서 시작하면 안 된다.
- `REQ-LC-003`
  - world-level lifecycle 진입은 Haven `MapView` 생성 경계에서 `LmiLifecycle.enterWorld(MapView)`로 직접 전달되어야 한다.
  - `plob`나 다른 후행 메시지를 world enter의 기본 진입점으로 사용하면 안 된다.
- `REQ-LC-004`
  - world-level lifecycle 종료는 Haven `MapView.dispose()`에서 `LmiLifecycle.leaveWorld()`로 직접 전달되어야 한다.
  - session leave나 widget invalidation이 world leave를 대신 소유하면 안 된다.
- `REQ-LC-005`
  - session-level lifecycle 종료는 떠나는 `Session` identity를 가진 `LmiLifecycle.leaveSession(Session)`로 처리해야 한다.
  - 현재 `AppContext.session`과 다른 session의 종료는 현재 session-level state를 지우면 안 된다.
- `REQ-LC-006`
  - `AppContext`는 Haven 참조 보관, accessor, cache clear 역할에 집중해야 한다.
  - lifecycle 진입과 종료를 직접 판단하거나 orchestration하면 안 된다.

