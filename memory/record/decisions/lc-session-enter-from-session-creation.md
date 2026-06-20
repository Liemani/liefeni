---
created: 2026-06-13
---

# REQ-LC-002

Captures the stable decision that session-level lifecycle 진입은 Haven `Session` 생성 경계에서 `LmiLifecycle.enterSession(Session)`으로 직접 전달되어야 한다.

## 결정

session-level lifecycle 진입은 Haven `Session` 생성 경계에서 `LmiLifecycle.enterSession(Session)`으로 직접 전달되어야 한다.

## 이유

- 다른 LMI helper나 context class가 session enter를 추론해서 시작하면 안 된다.
