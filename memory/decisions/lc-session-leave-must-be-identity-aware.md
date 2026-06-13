# REQ-LC-005

## Meta

- Date: 2026-06-13 session-level lifecycle 종료는 떠나는 `Session` identity를 가진 `LmiLifecycle.leaveSession(Session)`로 처리해야 한다.

## Rule

- 현재 `AppContext.session`과 다른 session의 종료는 현재 session-level state를 지우면 안 된다.
