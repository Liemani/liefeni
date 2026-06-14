# waypoint.md

이 문서는 waypoint와 직접 관련된 task, decision, wiki 문서를 모아둔다.

## Decisions

- [wp-no-gob-id-position-identity.md](../decisions/wp-no-gob-id-position-identity.md)
- [wp-map-grid-row-must-exist-before-action.md](../decisions/wp-map-grid-row-must-exist-before-action.md)
- [wp-current-grid-eager-bootstrap-and-fallback.md](../decisions/wp-current-grid-eager-bootstrap-and-fallback.md)
- [wp-topology-loaded-by-active-graph.md](../decisions/wp-topology-loaded-by-active-graph.md)
- [wp-geometry-loaded-by-local-grid-neighborhood.md](../decisions/wp-geometry-loaded-by-local-grid-neighborhood.md)
- [wp-jobs-must-not-assume-calibration.md](../decisions/wp-jobs-must-not-assume-calibration.md)
- [db-store-facade-and-worker-only.md](../decisions/db-store-facade-and-worker-only.md)
- [db-no-direct-jdbc-open.md](../decisions/db-no-direct-jdbc-open.md)
- [db-no-auto-migration-on-schema-mismatch.md](../decisions/db-no-auto-migration-on-schema-mismatch.md)
- [db-completion-must-return-through-queue.md](../decisions/db-completion-must-return-through-queue.md)
- [db-initialize-must-be-enqueued-before-other-db-work.md](../decisions/db-initialize-must-be-enqueued-before-other-db-work.md)
- [waypoint-db-initialize-queue-order.md](../decisions/waypoint-db-initialize-queue-order.md)
- [waypoint-grid-save-next-refresh.md](../decisions/waypoint-grid-save-next-refresh.md)
- [waypoint-schema-no-auto-migration.md](../decisions/waypoint-schema-no-auto-migration.md)
- [waypoint-store-db-worker-boundary.md](../decisions/waypoint-store-db-worker-boundary.md)
- [current-grid-eager-and-lazy-save.md](../decisions/current-grid-eager-and-lazy-save.md)

## Tasks

- [save-current-grid-before-create-node.md](../tasks/save-current-grid-before-create-node.md)
- [auto-save-current-grid-on-world-enter.md](../tasks/auto-save-current-grid-on-world-enter.md)
- [implement-current-grid-bootstrap.md](../tasks/implement-current-grid-bootstrap.md)
- [verify-active-graph-topology-preload.md](../tasks/verify-active-graph-topology-preload.md)
- [verify-portal-refresh-resident-grid.md](../tasks/verify-portal-refresh-resident-grid.md)
- [verify-auto-create-map-grid-on-new-db.md](../tasks/verify-auto-create-map-grid-on-new-db.md)
- [rename-cut-result-types.md](../tasks/rename-cut-result-types.md)
- [waypoint-db-infra-domain-split.md](../tasks/waypoint-db-infra-domain-split.md)

## Issues

- [create-node-fails-on-new-db-before-current-grid-is-available.md](../issues/create-node-fails-on-new-db-before-current-grid-is-available.md)
- [save-current-grid-fails-with-current-haven-grid-unavailable.md](../issues/save-current-grid-fails-with-current-haven-grid-unavailable.md)

## Ideas

- [minimap-cave-icon-db.md](../ideas/minimap-cave-icon-db.md)

## Wiki

- [waypoint.md](../wiki/waypoint.md)
- [waypoint-db.md](../wiki/waypoint-db.md)
- [map-icons.md](../wiki/map-icons.md)

## Wiki

- [current-grid-bootstrap.md](../wiki/current-grid-bootstrap.md)
