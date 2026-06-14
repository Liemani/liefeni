# Task

## Title

`current-grid-bootstrap`: [current-grid-bootstrap](../wiki/current-grid-bootstrap.md) 설계를 코드로 반영하기

## Meta

- Status: Now
- Created: 2026-06-13
- Started: 2026-06-13
- Indexes:
  - [waypoint.md](../indexes/waypoint.md)
- Child Tasks:
  - [auto-save-current-grid-on-world-enter.md](auto-save-current-grid-on-world-enter.md)
  - [save-current-grid-before-create-node.md](save-current-grid-before-create-node.md)
  - [verify-auto-create-map-grid-on-new-db.md](verify-auto-create-map-grid-on-new-db.md)

## Notes

- world enter eager path
- refresh lazy fallback
- user action fallback
- `WaypointGridSaveCoordinator.saveIfMissing(Coord gc, ...)` 같은 공통 helper 분리
