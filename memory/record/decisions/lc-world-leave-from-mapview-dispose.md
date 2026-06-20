---
created: 2026-06-13
---

# REQ-LC-004

Captures the stable decision that world-level lifecycle 종료는 Haven `MapView.dispose()`에서 `LmiLifecycle.leaveWorld()`로 직접 전달되어야 한다.

## 결정

world-level lifecycle 종료는 Haven `MapView.dispose()`에서 `LmiLifecycle.leaveWorld()`로 직접 전달되어야 한다.

## 이유

- session leave나 widget invalidation이 world leave를 대신 소유하면 안 된다.
