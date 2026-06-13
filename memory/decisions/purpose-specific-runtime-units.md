# DEC-013

## Meta

- Date: 2026-06-13 LMI의 독립 실행 단위는 목적별로 분리한다: runtime polling waypoint DB ordering automation job execution.

## 이유

- thread마다 존재 목적이 섞이면 Haven thread 지연 방지, DB ordering, automation orchestration의 경계가 다시 흐려진다.
- `RuntimeEventManager`, `WaypointDbExecutor`, `Agent`는 서로 다른 목적을 가진다.
- completion queue는 별도 worker가 아니라 render 경계 delivery로 유지하는 편이 더 단순하다.

