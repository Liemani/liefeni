# DEC-009

## Indexes

- [waypoint.md](../indexes/waypoint.md)

waypoint persistence는 public store facade와 dedicated DB worker 구조를 유지한다.

## 이유

- direct JDBC 진입점이 생기면 connection ownership, initialize ordering, completion routing이 다시 흩어진다.
