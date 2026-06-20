---
created: 2026-06-13
---

# REQ-DB-003

Captures the stable decision that 현재 단계에서는 schema version mismatch 시 automatic migration을 시도하지 않고 명시적 예외를 던진다.

## 결정

현재 단계에서는 schema version mismatch 시 automatic migration을 시도하지 않고 명시적 예외를 던진다.

## 이유

- DB 재생성과 clean schema initialize를 전제로 한다.
