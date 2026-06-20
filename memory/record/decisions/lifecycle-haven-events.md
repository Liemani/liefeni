---
created: 2026-06-13
---

# DEC-001

Captures the stable decision that lifecycle ownership은 Haven concrete event에서 `LmiLifecycle`로 직접 넘어가도록 정리한다.

## 결정

lifecycle ownership은 Haven concrete event에서 `LmiLifecycle`로 직접 넘어가도록 정리한다.

## 이유

- `AppContext`와 `CommandHandler`가 lifecycle 소유권을 가지면 책임 경계가 흐려진다.
