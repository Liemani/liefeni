---
created: 2026-06-13
---

# DEC-009

Captures the stable decision that ### Indexes - waypoint persistence는 public store facade와 dedicated DB worker 구조를 유지한다.

## 결정

### Indexes - waypoint persistence는 public store facade와 dedicated DB worker 구조를 유지한다.

## 이유

- direct JDBC 진입점이 생기면 connection ownership, initialize ordering, completion routing이 다시 흩어진다.
