# 새 DB에서 current grid가 준비되기 전에 CreateNode가 실패함

## Meta

- Status: Open
- Created: 2026-06-13
- Related Tasks:
  - [implement-current-grid-bootstrap.md](../tasks/implement-current-grid-bootstrap.md)
  - [save-current-grid-before-create-node.md](../tasks/save-current-grid-before-create-node.md)
  - [auto-save-current-grid-on-world-enter.md](../tasks/auto-save-current-grid-on-world-enter.md)
  - [verify-auto-create-map-grid-on-new-db.md](../tasks/verify-auto-create-map-grid-on-new-db.md)
- Related Design:
  - [current-grid-bootstrap.md](../wiki/current-grid-bootstrap.md)
- Related Decisions:
  - [wp-map-grid-row-must-exist-before-action.md](../decisions/wp-map-grid-row-must-exist-before-action.md)
  - [wp-current-grid-eager-bootstrap-and-fallback.md](../decisions/wp-current-grid-eager-bootstrap-and-fallback.md)
  - [db-initialize-must-be-enqueued-before-other-db-work.md](../decisions/db-initialize-must-be-enqueued-before-other-db-work.md)
  - [current-grid-eager-and-lazy-save.md](../decisions/current-grid-eager-and-lazy-save.md)
  - [waypoint-db-initialize-queue-order.md](../decisions/waypoint-db-initialize-queue-order.md)
- Indexes:
  - [waypoint.md](../indexes/waypoint.md)

## Notes

- 재현 절차:
  - DB 파일 삭제
  - 게임 실행
  - 로딩 완료 후 `CreateNodeJob` 실행
  - node 이름 입력
  - node 생성 실패
- 관측된 메시지:
  - `CreateNode failed: current grid position is unavailable.`
- 새 DB에서도 world enter 이후 현재 Haven grid는 자동으로 기록되는 것이 기본 경로여야 한다.
- 아직 자동 기록이 끝나지 않았더라도 waypoint user action 중 현재 Haven grid를 직접 확보할 수 있어야 한다.
- 지금 증상은 current grid bootstrap이 늦거나, `CreateNodeJob` 쪽 fallback 확보가 없다는 뜻이다.
