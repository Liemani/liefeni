---
created: 2026-06-13
---

# DEC-004

Captures the stable decision that world leave trigger는 `MapView.dispose()`다.

## 결정

world leave trigger는 `MapView.dispose()`다.

## 이유

- widget invalidation과 world 종료를 분리한다.
- world 수명의 소유권을 `MapView`에 맞추기 위함이다.
