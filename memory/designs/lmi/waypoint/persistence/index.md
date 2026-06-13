# lmi/waypoint/persistence

이 문서는 `src/lmi/waypoint/persistence/`의 책임과 하위 구조를 정리한다.

## Role

- Holds waypoint lifecycle, runtime, persistence, and recording code.

## Files

- [EmptyWaypointResult.md](EmptyWaypointResult.md)
- [SaveBatchResult.md](SaveBatchResult.md)
- [WaypointDatabase.md](WaypointDatabase.md)
- [WaypointDbExecutor.md](WaypointDbExecutor.md)
- [WaypointReadRequest.md](WaypointReadRequest.md)
- [WaypointRequest.md](WaypointRequest.md)
- [WaypointResult.md](WaypointResult.md)
- [WaypointResultHandler.md](WaypointResultHandler.md)
- [WaypointStore.md](WaypointStore.md)
- [WaypointSyncManager.md](WaypointSyncManager.md)
- [WaypointWriteBridge.md](WaypointWriteBridge.md)
- [WaypointWriteRequest.md](WaypointWriteRequest.md)

## Rules

- 설계 문서는 코드와 1:1로 대응되는 설명을 유지한다.
- 내용은 구현 코드가 아니라 책임, 경계, 흐름을 설명한다.
