# Tasks

이 문서는 아직 코드에 반영되지 않았거나, 검증이 덜 끝난 task를 추적한다.

- `P0`: 지금 진행을 막거나 요구사항을 직접 위반하는 문제
- `P1`: 다음으로 바로 진행할 중요한 구현/검증 작업
- `P2`: 나중에 해도 되는 정리, 감사, 리팩터링 작업

## Now

- [implement-current-grid-bootstrap.md](implement-current-grid-bootstrap.md) `[P0]` `current-grid-bootstrap`

## Backlog

- [ensure-current-grid-before-create-node.md](ensure-current-grid-before-create-node.md) `[P0]` `REQ-WP-002`
- [auto-save-current-grid-on-world-enter.md](auto-save-current-grid-on-world-enter.md) `[P0]` `REQ-WP-003`
- [verify-active-graph-topology-preload.md](verify-active-graph-topology-preload.md) `[P1]` `REQ-WP-004`
- [verify-session-handoff-ordering.md](verify-session-handoff-ordering.md) `[P1]` `REQ-LC-005`
- [verify-lifecycle-log-flow.md](verify-lifecycle-log-flow.md) `[P1]` lifecycle 로그 확인
- [verify-portal-refresh-resident-grid.md](verify-portal-refresh-resident-grid.md) `[P1]` portal transition 후 waypoint refresh / resident grid 갱신 확인
- [verify-auto-create-map-grid-on-new-db.md](verify-auto-create-map-grid-on-new-db.md) `[P0]` 새 DB 파일에서 첫 world enter 후 `map_segment` / `map_grid` 자동 생성 확인
- [rename-cut-result-types.md](rename-cut-result-types.md) `[P2]` `LoadSegmentsByCutResult`, `LoadPointsByCutResult` naming 정리
- [organize-register-meaning.md](organize-register-meaning.md) `[P2]` `register` 관련 내용과 역할 정리
- [design-db-infra-domain-split.md](design-db-infra-domain-split.md) `[P2]` waypoint DB 공통 인프라와 waypoint 도메인 계층 분리 범위 설계
- [design-minimap-cave-icon-db.md](design-minimap-cave-icon-db.md) `[P2]` 미니맵 동굴 아이콘 DB 저장 구조 설계
- [audit-haven-patch-width-vs-origin-master.md](audit-haven-patch-width-vs-origin-master.md) `[P2]` `origin/master` 대비 Haven patch audit

## Done

- 없음

## Canceled

- 없음
