---
created: 2026-06-13
---

# REQ-LC-001

Captures the stable decision that process-level 초기화의 유일한 orchestration entry는 `LmiLifecycle.initProcess()`여야 한다.

## 결정

process-level 초기화의 유일한 orchestration entry는 `LmiLifecycle.initProcess()`여야 한다.

## 이유

- process-level subsystem은 자기 자신이 전체 초기화 소유권을 가져서는 안 된다.
