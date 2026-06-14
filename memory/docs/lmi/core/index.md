# lmi/core

이 문서는 이 디렉터리의 책임과 하위 구조를 정리한다.

## Meta

- Source: [core/](../../../../src/lmi/core/)
- Created: 2026-06-13
- Updated: 2026-06-14

## Role

- 캐릭터, 좌표, 공용 유틸, 가벼운 상태 보관 책임을 묶는다.

## Contents

### Subdirectories

### Files
- [AppContext.md](AppContext.md)
- [Array.md](Array.md)
- [AtomicAction.md](AtomicAction.md)
- [ClickManager.md](ClickManager.md)
- [Constant.md](Constant.md)
- [DebugUtil.md](DebugUtil.md)
- [GobFinder.md](GobFinder.md)
- [Interaction.md](Interaction.md)
- [LMIException.md](LMIException.md)
- [LocalPlayer.md](LocalPlayer.md)
- [Rect.md](Rect.md)
- [Util.md](Util.md)

## Rules

- core는 lifecycle orchestration을 하지 않는다.
- core는 bridge/runtime/waypoint에 의존하지 않거나 최소한으로 의존한다.
