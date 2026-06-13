# Working Notes

설명성 문서는 `memory/wiki/`에 둔다.
현재 LMI 구조와 runtime 설명은 다음 문서를 본다.

- [runtime.md](./runtime.md)
- [waypoint.md](./waypoint.md)
- [current-grid-bootstrap.md](./current-grid-bootstrap.md)
- [server_message.md](./server_message.md)
- [../decisions/index.md](../decisions/index.md)
- [../tasks/index.md](../tasks/index.md)

이 파일은 예전 `AGENTS.md`의 축약 컨텍스트를 대체한다.
작업 시 필요한 짧은 규칙과 문서 진입점은 여기서 관리한다.

## 핵심 규칙

- `haven -> lmi -> agent` 의존 방향을 유지한다.
- LMI는 Haven 위에 붙는 확장 계층으로 유지하고, Haven 자체를 대체하는 방향으로 만들지 않는다.
- Haven 엔진 수정은 가능한 한 `// lmi start` / `// lmi end` 범위 안에 둔다.
- Haven 변경은 가능한 한 작은 hook point / bridge call 수준으로 제한한다.
- lifecycle 진입점의 소유권은 Haven concrete event에서 `LmiLifecycle`로 직접 넘어가야 한다.
- `AppContext`는 lifecycle orchestrator가 아니라 참조 보관과 cache clear 쪽에 집중한다.
- Haven signal로 시작되는 LMI non-render 작업은 가능한 한 Haven thread 밖으로 넘긴다.
- draw/render 경로는 Haven thread가 직접 실행하되, draw 가능한 LMI 데이터는 미리 준비해 둔다.
- Haven -> LMI 직접 호출은 장기적으로 하나의 `HavenBridge` 경계로 모은다.
- waypoint는 `map_segment` / `map_grid` / `grid_id + local_x + local_y` 기준으로 본다.
- waypoint DB access는 `WaypointStore` / `WaypointDbExecutor` 경로로 통일한다.
- `ER_INTERRUPTED`는 어떤 계층에서도 삼키지 않는다.

## 작업 시 우선 확인할 문서

- LMI 전체 구조 / lifecycle / discovery / runtime:
  - [runtime.md](./runtime.md)
- waypoint schema / runtime / use case:
  - [waypoint.md](./waypoint.md)

## 자주 보는 파일

- `src/lmi/LmiLifecycle.java`
- `src/lmi/AppContext.java`
- `src/lmi/Hook.java`
- `src/lmi/Agent.java`
- `src/lmi/AgentRegistry.java`
- `src/lmi/MenuGridProxy.java`
- `src/lmi/WaitManager.java`
- `src/lmi/waypoint/WaypointManager.java`
- `src/lmi/waypoint/persistence/WaypointStore.java`
- `src/lmi/waypoint/persistence/WaypointDatabase.java`
- `src/lmi/waypoint/runtime/WaypointGridResolver.java`
