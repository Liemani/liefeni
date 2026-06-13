# lmi/core

이 문서는 `src/lmi/` 루트의 공용 helper와 상태 보관 클래스를 정리한다.

## Role

- 캐릭터, 좌표, 공용 유틸, 가벼운 상태 보관 책임을 묶는다.

## Files

- [AppContext.md](AppContext.md)
- [Array.md](Array.md)
- [AtomicAction.md](AtomicAction.md)
- [ClickManager.md](ClickManager.md)
- [Constant.md](Constant.md)
- [GobFinder.md](GobFinder.md)
- [Interaction.md](Interaction.md)
- [LMIException.md](LMIException.md)
- [Rect.md](Rect.md)
- [Self.md](Self.md)
- [Util.md](Util.md)

## Rules

- core는 lifecycle orchestration을 하지 않는다.
- core는 bridge/runtime/waypoint에 의존하지 않거나 최소한으로 의존한다.
