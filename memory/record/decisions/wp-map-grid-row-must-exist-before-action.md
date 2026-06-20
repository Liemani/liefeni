---
created: 2026-06-13
---

# REQ-WP-002

Captures the stable decision that 선행조건으로서 현재 player 위치를 기준으로 waypoint 동작을 시작하기 전에 해당 grid의 waypoint `map_grid` row는 DB에 존재해야 한다.

## 결정

선행조건으로서 현재 player 위치를 기준으로 waypoint 동작을 시작하기 전에 해당 grid의 waypoint `map_grid` row는 DB에 존재해야 한다.

## 이유

- The decision is recorded so later work can follow the same direction.
