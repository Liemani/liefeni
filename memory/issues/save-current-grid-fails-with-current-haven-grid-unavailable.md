# SaveCurrentGridEffect가 current Haven grid를 찾지 못하고 실패함

## Meta

- Status: Open
- Created: 2026-06-13
- Related Tasks:
  - [implement-current-grid-bootstrap.md](../tasks/implement-current-grid-bootstrap.md)
  - [auto-save-current-grid-on-world-enter.md](../tasks/auto-save-current-grid-on-world-enter.md)
  - [save-current-grid-before-create-node.md](../tasks/save-current-grid-before-create-node.md)
- Related Decisions:
  - [wp-map-grid-row-must-exist-before-action.md](../decisions/wp-map-grid-row-must-exist-before-action.md)
  - [wp-current-grid-eager-bootstrap-and-fallback.md](../decisions/wp-current-grid-eager-bootstrap-and-fallback.md)
  - [current-grid-eager-and-lazy-save.md](../decisions/current-grid-eager-and-lazy-save.md)
  - [waypoint-grid-save-next-refresh.md](../decisions/waypoint-grid-save-next-refresh.md)
- Related Design:
  - [current-grid-bootstrap.md](../wiki/current-grid-bootstrap.md)
- Indexes:
  - [waypoint.md](../indexes/waypoint.md)

## Notes

- 재현:
  - 게임 실행
  - 월드 진입
  - `SaveCurrentGridEffect` 실행
- 관측된 메시지:
  - `SaveCurrentGrid failed: current Haven grid is unavailable.`
- 의미:
  - 현재 player 위치는 있어도, 그 위치에 해당하는 Haven grid를 `AppContext.glob.map.getgrid(gc)`에서 얻지 못하고 있다.
  - 따라서 current grid 저장의 가장 기초 단계가 아직 안정적이지 않다.
- 확인할 점:
  - effect 실행 시점의 `LocalPlayer.position()`과 계산된 `gc`
  - `MCache.getgrid(gc)`가 실패하는 조건
  - world enter 직후와 충분히 로드된 뒤의 차이
