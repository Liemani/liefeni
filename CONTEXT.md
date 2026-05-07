# Working Notes

설명성 문서는 `doc/`로 옮긴다.
현재 LMI 구조와 runtime 설명은 다음 문서를 본다.

- [doc/lmi/runtime.md](doc/lmi/runtime.md)
- [doc/lmi/waypoint.md](doc/lmi/waypoint.md)
- [doc/lmi/server_message.md](doc/lmi/server_message.md)

이 파일은 예전 `AGENTS.md`의 축약 컨텍스트를 대체한다.
작업 시 필요한 짧은 규칙과 문서 진입점은 여기서 관리한다.

## 핵심 규칙

- `haven -> lmi -> agent` 의존 방향을 유지한다.
- Haven 엔진 수정은 가능한 한 `// lmi start` / `// lmi end` 범위 안에 둔다.
- lifecycle 진입점의 소유권은 Haven concrete event에서 `LmiLifecycle`로 직접 넘어가야 한다.
- `AppContext`는 lifecycle orchestrator가 아니라 참조 보관과 cache clear 쪽에 집중한다.
- waypoint는 `map_segment` / `map_grid` / `grid_id + local_x + local_y` 기준으로 본다.
- waypoint DB access는 `WaypointStore` / `WaypointDbExecutor` 경로로 통일한다.
- `ER_INTERRUPTED`는 어떤 계층에서도 삼키지 않는다.

## 작업 시 우선 확인할 문서

- LMI 전체 구조 / lifecycle / discovery / runtime:
  - [doc/lmi/runtime.md](doc/lmi/runtime.md)
- waypoint schema / runtime / use case:
  - [doc/lmi/waypoint.md](doc/lmi/waypoint.md)

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
