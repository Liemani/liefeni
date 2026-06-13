# DEC-005

## Indexes

- [waypoint.md](../indexes/waypoint.md)

waypoint DB initialize는 world enter 시 executor queue의 앞부분에 먼저 enqueue한다.

## 이유

- 별도 sync call 없이 single-thread executor의 queue ordering을 initialization barrier로 사용하기 위함이다.
