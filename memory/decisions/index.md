# Requirements and Decisions

이 문서는 작업 전에 고정한 요구사항과, 이후 내린 설계 결정을 함께 기록한다.

## Requirements

새 요구사항은 먼저 여기에 추가하고, 이후 코드와 문서를 그 ID 기준으로 맞춘다.

- [lc-lmi-as-haven-extension.md](lc-lmi-as-haven-extension.md): lifecycle 관련 요구사항 `REQ-LC-000`
- [lc-process-init-owned-by-lifecycle.md](lc-process-init-owned-by-lifecycle.md): lifecycle 관련 요구사항 `REQ-LC-001`
- [lc-session-enter-from-session-creation.md](lc-session-enter-from-session-creation.md): lifecycle 관련 요구사항 `REQ-LC-002`
- [lc-world-enter-from-mapview-creation.md](lc-world-enter-from-mapview-creation.md): lifecycle 관련 요구사항 `REQ-LC-003`
- [lc-world-leave-from-mapview-dispose.md](lc-world-leave-from-mapview-dispose.md): lifecycle 관련 요구사항 `REQ-LC-004`
- [lc-session-leave-must-be-identity-aware.md](lc-session-leave-must-be-identity-aware.md): lifecycle 관련 요구사항 `REQ-LC-005`
- [lc-appcontext-state-holder-only.md](lc-appcontext-state-holder-only.md): lifecycle 관련 요구사항 `REQ-LC-006`
- [wp-no-gob-id-position-identity.md](wp-no-gob-id-position-identity.md): waypoint 관련 요구사항 `REQ-WP-001`
- [wp-map-grid-row-must-exist-before-action.md](wp-map-grid-row-must-exist-before-action.md): waypoint 관련 요구사항 `REQ-WP-002`
- [wp-current-grid-eager-bootstrap-and-fallback.md](wp-current-grid-eager-bootstrap-and-fallback.md): waypoint 관련 요구사항 `REQ-WP-003`
- [wp-topology-loaded-by-active-graph.md](wp-topology-loaded-by-active-graph.md): waypoint 관련 요구사항 `REQ-WP-004`
- [wp-geometry-loaded-by-local-grid-neighborhood.md](wp-geometry-loaded-by-local-grid-neighborhood.md): waypoint 관련 요구사항 `REQ-WP-005`
- [wp-jobs-must-not-assume-calibration.md](wp-jobs-must-not-assume-calibration.md): waypoint 관련 요구사항 `REQ-WP-006`
- [db-store-facade-and-worker-only.md](db-store-facade-and-worker-only.md): persistence / DB 관련 요구사항 `REQ-DB-001`
- [db-no-direct-jdbc-open.md](db-no-direct-jdbc-open.md): persistence / DB 관련 요구사항 `REQ-DB-002`
- [db-no-auto-migration-on-schema-mismatch.md](db-no-auto-migration-on-schema-mismatch.md): persistence / DB 관련 요구사항 `REQ-DB-003`
- [db-completion-must-return-through-queue.md](db-completion-must-return-through-queue.md): persistence / DB 관련 요구사항 `REQ-DB-004`
- [db-initialize-must-be-enqueued-before-other-db-work.md](db-initialize-must-be-enqueued-before-other-db-work.md): persistence / DB 관련 요구사항 `REQ-DB-005`
- [rt-nonrender-work-off-haven-thread.md](rt-nonrender-work-off-haven-thread.md): runtime / thread / bridge 관련 요구사항 `REQ-RT-001`
- [rt-render-read-prebuilt-lmi-data.md](rt-render-read-prebuilt-lmi-data.md): runtime / thread / bridge 관련 요구사항 `REQ-RT-002`
- [rt-single-haven-bridge.md](rt-single-haven-bridge.md): runtime / thread / bridge 관련 요구사항 `REQ-RT-003`
- [rt-runtime-event-manager-purpose.md](rt-runtime-event-manager-purpose.md): runtime / thread / bridge 관련 요구사항 `REQ-RT-004`
- [rt-waypoint-db-worker-purpose.md](rt-waypoint-db-worker-purpose.md): runtime / thread / bridge 관련 요구사항 `REQ-RT-005`
- [rt-agent-thread-purpose.md](rt-agent-thread-purpose.md): runtime / thread / bridge 관련 요구사항 `REQ-RT-006`
- [rt-completion-queue-purpose.md](rt-completion-queue-purpose.md): runtime / thread / bridge 관련 요구사항 `REQ-RT-007`
- [rt-minimal-haven-patches.md](rt-minimal-haven-patches.md): runtime / thread / bridge 관련 요구사항 `REQ-RT-008`
- [rt-diagnostic-messages-to-terminal.md](rt-diagnostic-messages-to-terminal.md): runtime / thread / bridge 관련 요구사항 `REQ-RT-009`
- [lang-use-concrete-verbs.md](lang-use-concrete-verbs.md): 용어와 문장 표현 관련 요구사항 `REQ-LANG-001`

## Decisions

이 문서는 이미 내린 설계 결정을 기록한다.
결정 기록은 "왜 그렇게 구현하기로 했나"를 남긴다.

- [lifecycle-haven-events.md](lifecycle-haven-events.md): lifecycle ownership은 Haven concrete event에서 `LmiLifecycle`로 직접 넘어가도록 정리한다.
- [session-identity-source-of-truth.md](session-identity-source-of-truth.md): session lifecycle의 진실 원천은 boolean 상태가 아니라 `Session` identity다.
- [world-enter-mapview-creation.md](world-enter-mapview-creation.md): world enter trigger는 `plob`가 아니라 `MapView` 생성이다.
- [world-leave-mapview-dispose.md](world-leave-mapview-dispose.md): world leave trigger는 `MapView.dispose()`다.
- [waypoint-db-initialize-queue-order.md](waypoint-db-initialize-queue-order.md): waypoint DB initialize는 world enter 시 executor queue의 앞부분에 먼저 enqueue한다.
- [waypoint-grid-save-next-refresh.md](waypoint-grid-save-next-refresh.md): `WaypointGridResolver`는 map grid가 없을 때 저장 요청을 queue에 넣고 다음 refresh에서 다시 본다.
- [waypoint-schema-no-auto-migration.md](waypoint-schema-no-auto-migration.md): waypoint schema version mismatch는 자동 migration하지 않는다.
- [appcontext-state-holder-only.md](appcontext-state-holder-only.md): `AppContext`는 lifecycle orchestrator가 아니라 Haven 참조 보관, accessor, cache clear 역할에 집중한다.
- [waypoint-store-db-worker-boundary.md](waypoint-store-db-worker-boundary.md): waypoint persistence는 public store facade와 dedicated DB worker 구조를 유지한다.
- [current-grid-eager-and-lazy-save.md](current-grid-eager-and-lazy-save.md): 현재 player grid의 waypoint DB row 저장은 eager path와 lazy fallback을 둘 다 허용한다.
- [haven-lmi-render-nonrender-split.md](haven-lmi-render-nonrender-split.md): Haven-originated LMI 작업은 render와 non-render를 분리한다.
- [diagnostic-messages-to-terminal.md](diagnostic-messages-to-terminal.md): 내부 상태를 드러내는 진단 메시지는 게임 GUI 콘솔보다 terminal 출력으로 우선 보낸다.
- [single-haven-bridge-entry.md](single-haven-bridge-entry.md): Haven -> LMI integration entry는 장기적으로 하나의 bridge class에 모은다.
- [purpose-specific-runtime-units.md](purpose-specific-runtime-units.md): LMI의 독립 실행 단위는 목적별로 분리한다.
- [lmi-as-haven-extension.md](lmi-as-haven-extension.md): LMI는 Haven 위에 붙는 확장 계층으로 유지하고, Haven 수정은 최소 hook/bridge patch로 제한한다.
