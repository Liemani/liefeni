---
created: 2026-06-13
---

# REQ-WP-003

Captures the stable decision that world enter 이후 현재 player가 서 있는 Haven grid는 waypoint `map_segment` / `map_grid` row로 자동 기록되는 것이 기본 경로여야 한다.

## 결정

world enter 이후 현재 player가 서 있는 Haven grid는 waypoint `map_segment` / `map_grid` row로 자동 기록되는 것이 기본 경로여야 한다.

## 이유

- 아직 기록되지 않았더라도 waypoint user action 실행 중 현재 Haven grid가 필요해지면, 그 자리에서 직접 기록하여 확보할 수 있어야 한다.
