# lmi/lifecycle

이 문서는 이 디렉터리의 책임과 하위 구조를 정리한다.

## Meta

- Source: [lifecycle/](../../../../src/lmi/lifecycle/)
- Created: 2026-06-13
- Updated: 2026-06-14

## Role

- lifecycle ownership과 Haven event entry point를 묶는다.
- `LmiLifecycle`가 실제 진입점이고, `CommandHandler`, `Pathfinder`, `RuntimeEventManager`가 그 주변 책임을 분담한다.

## Contents

### Subdirectories

### Files
- [CommandHandler.md](CommandHandler.md)
- [LmiLifecycle.md](LmiLifecycle.md)
- [Pathfinder.md](Pathfinder.md)
- [RuntimeEventManager.md](RuntimeEventManager.md)

## Rules

- lifecycle 진입점은 Haven 이벤트에서 직접 들어와야 한다.
- process/session/world/widget의 소유권을 서로 섞지 않는다.
- `MapView` reference ownership은 bridge/MapViewBridge 쪽이 맡고, lifecycle은 그 진입점을 호출만 한다.
