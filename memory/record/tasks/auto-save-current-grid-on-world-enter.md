---
status: Backlog
created: 2026-06-13
related_decisions: []
---

# world enter 직후 현재 player grid를 자동 저장하는 흐름 만들기

Tracks the implementation and verification work for this task.

## Checklist
- [ ] world enter 이후 현재 player가 서 있는 Haven grid는 waypoint `map_segment` / `map_grid` row로 자동 기록되는 것이 기본 경로여야 한다.
- [ ] user action fallback이 있더라도 eager path를 먼저 갖춰야 한다.

## Notes
- Task ID: REQ-WP-003
- Indexes:
  - [waypoint.md](../indexes/waypoint.md)
- Parent task:
  - [implement-current-grid-bootstrap.md](implement-current-grid-bootstrap.md)
