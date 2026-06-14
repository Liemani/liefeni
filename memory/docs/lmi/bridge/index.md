# lmi/bridge

이 문서는 이 디렉터리의 책임과 하위 구조를 정리한다.

## Meta

- Source: [bridge/](../../../../src/lmi/bridge/)
- Created: 2026-06-13
- Updated: 2026-06-14

## Role

- UI, menu, input, map view, and widget interaction surfaces를 Haven 쪽에서 LMI 쪽으로 넘기는 경계를 묶는다.

## Contents

### Subdirectories

### Files
- [Api.md](Api.md)
- [FlowerMenuHandler.md](FlowerMenuHandler.md)
- [GlobBridge.md](GlobBridge.md)
- [Hook.md](Hook.md)
- [MapViewBridge.md](MapViewBridge.md)
- [MenuGridProxy.md](MenuGridProxy.md)
- [ProgressManager.md](ProgressManager.md)

## Rules

- bridge는 Haven 쪽 hook point를 최소한으로 유지한다.
- bridge는 계산을 길게 잡지 않고, work를 lifecycle/runtime으로 넘긴다.
