# Task

## Title

`REQ-WP-002`: `CreateNodeJob` 실행 전에 현재 player grid가 waypoint DB에 존재하도록 보장하기

## Meta

- Status: Backlog
- Created: 2026-06-13
- Indexes:
  - [waypoint.md](../indexes/waypoint.md)
- Parent Task:
  - [implement-current-grid-bootstrap.md](implement-current-grid-bootstrap.md)

## Notes

- 현재 player 위치를 기준으로 waypoint 동작을 시작하기 전에 해당 grid의 waypoint `map_grid` row가 DB에 존재해야 한다.
- `CreateNodeJob`가 current grid 미확보 상태에서 바로 실패하지 않도록 구조를 맞춘다.
