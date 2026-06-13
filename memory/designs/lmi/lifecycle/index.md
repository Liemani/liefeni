# lmi/lifecycle

이 문서는 process/session/world/widget 경계와 초기화 흐름을 정리한다.

## Role

- lifecycle ownership과 event entry point를 묶는다.

## Files

- [CommandHandler.md](CommandHandler.md)
- [LmiLifecycle.md](LmiLifecycle.md)
- [Pathfinder.md](Pathfinder.md)
- [RuntimeEventManager.md](RuntimeEventManager.md)

## Rules

- lifecycle 진입점은 Haven 이벤트에서 직접 들어와야 한다.
- process/session/world/widget의 소유권을 서로 섞지 않는다.
- `MapView` reference ownership은 bridge/MapViewBridge 쪽이 맡고, lifecycle은 그 진입점을 호출만 한다.
