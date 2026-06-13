# Requirements and Decisions

이 문서는 작업 전에 고정한 요구사항과, 이후 내린 설계 결정을 함께 기록한다.

## Requirements

새 요구사항은 먼저 여기에 추가하고, 이후 코드와 문서를 그 ID 기준으로 맞춘다.

- [REQ-LC.md](REQ-LC.md): lifecycle 관련 요구사항
- [REQ-WP.md](REQ-WP.md): waypoint 관련 요구사항
- [REQ-DB.md](REQ-DB.md): persistence / DB 관련 요구사항
- [REQ-RT.md](REQ-RT.md): runtime / thread / bridge 관련 요구사항
- [REQ-LANG.md](REQ-LANG.md): 용어와 문장 표현 관련 요구사항

## Decisions

이 문서는 이미 내린 설계 결정을 기록한다.
결정 기록은 "왜 그렇게 구현하기로 했나"를 남긴다.

- [lifecycle-haven-events.md](lifecycle-haven-events.md): lifecycle ownership은 Haven concrete event에서 `LmiLifecycle`로 직접 넘어가도록 정리한다.
- [session-identity-source-of-truth.md](session-identity-source-of-truth.md): session lifecycle의 진실 원천은 boolean 상태가 아니라 `Session` identity다.
- [world-enter-mapview-creation.md](world-enter-mapview-creation.md): world enter trigger는 `plob`가 아니라 `MapView` 생성이다.
- [world-leave-mapview-dispose.md](world-leave-mapview-dispose.md): world leave trigger는 `MapView.dispose()`다.
- [waypoint-db-initialize-queue-order.md](waypoint-db-initialize-queue-order.md): waypoint DB initialize는 world enter 시 executor queue의 앞부분에 먼저 enqueue한다.
- [waypoint-grid-ensure-next-refresh.md](waypoint-grid-ensure-next-refresh.md): `WaypointGridResolver`는 map grid가 없을 때 ensure request를 enqueue하고 다음 refresh에서 다시 본다.
- [waypoint-schema-no-auto-migration.md](waypoint-schema-no-auto-migration.md): waypoint schema version mismatch는 자동 migration하지 않는다.
- [appcontext-state-holder-only.md](appcontext-state-holder-only.md): `AppContext`는 lifecycle orchestrator가 아니라 Haven 참조 보관, accessor, cache clear 역할에 집중한다.
- [waypoint-store-db-worker-boundary.md](waypoint-store-db-worker-boundary.md): waypoint persistence는 public store facade와 dedicated DB worker 구조를 유지한다.
- [current-grid-eager-and-lazy-ensure.md](current-grid-eager-and-lazy-ensure.md): 현재 player grid의 waypoint DB row 확보는 eager path와 lazy fallback을 둘 다 허용한다.
- [haven-lmi-render-nonrender-split.md](haven-lmi-render-nonrender-split.md): Haven-originated LMI 작업은 render와 non-render를 분리한다.
- [single-haven-bridge-entry.md](single-haven-bridge-entry.md): Haven -> LMI integration entry는 장기적으로 하나의 bridge class에 모은다.
- [purpose-specific-runtime-units.md](purpose-specific-runtime-units.md): LMI의 독립 실행 단위는 목적별로 분리한다.
- [lmi-as-haven-extension.md](lmi-as-haven-extension.md): LMI는 Haven 위에 붙는 확장 계층으로 유지하고, Haven 수정은 최소 hook/bridge patch로 제한한다.
