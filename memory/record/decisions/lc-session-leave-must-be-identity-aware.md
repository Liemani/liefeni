---
created: 2026-06-13
---

# REQ-LC-005

Captures the stable decision that session-level lifecycle 종료는 떠나는 `Session` identity를 가진 `LmiLifecycle.leaveSession(Session)`로 처리해야 한다.

## 결정

session-level lifecycle 종료는 떠나는 `Session` identity를 가진 `LmiLifecycle.leaveSession(Session)`로 처리해야 한다.

## 이유

- 현재 `AppContext.session`과 다른 session의 종료는 현재 session-level state를 지우면 안 된다.
