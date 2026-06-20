---
created: 2026-06-13
---

# DEC-003

Captures the stable decision that world enter trigger는 `plob`가 아니라 `MapView` 생성이다.

## 결정

world enter trigger는 `plob`가 아니라 `MapView` 생성이다.

## 이유

- 초기 world enter에서 `plgob`와 `cc`는 `MapView` constructor 인자로 이미 들어온다.
- `plob`는 일반적인 초기 진입 신호가 아니다.
