# lmi

이 문서는 `src/lmi/`의 책임과 하위 구조를 정리한다.

## Role

- Defines the core LMI runtime, lifecycle, and shared helper classes.

## Files

- [Agent.md](Agent.md)
- [AgentConfig.md](AgentConfig.md)
- [AgentContext.md](AgentContext.md)
- [AgentManager.md](AgentManager.md)
- [AgentRegistry.md](AgentRegistry.md)
- [Api.md](Api.md)
- [AppContext.md](AppContext.md)
- [Array.md](Array.md)
- [AtomicAction.md](AtomicAction.md)
- [ChatInputMonitor.md](ChatInputMonitor.md)
- [ClickManager.md](ClickManager.md)
- [CommandHandler.md](CommandHandler.md)
- [Constant.md](Constant.md)
- [FlowerMenuHandler.md](FlowerMenuHandler.md)
- [GobFinder.md](GobFinder.md)
- [Hook.md](Hook.md)
- [Interaction.md](Interaction.md)
- [LMIException.md](LMIException.md)
- [LmiLifecycle.md](LmiLifecycle.md)
- [MenuGridProxy.md](MenuGridProxy.md)
- [Pathfinder.md](Pathfinder.md)
- [PortalMonitor.md](PortalMonitor.md)
- [ProgressManager.md](ProgressManager.md)
- [Rect.md](Rect.md)
- [RuntimeEventManager.md](RuntimeEventManager.md)
- [Self.md](Self.md)
- [Util.md](Util.md)
- [WaitManager.md](WaitManager.md)

## Child Packages

- [behavior/](behavior/index.md)
- [draw/](draw/index.md)
- [waypoint/](waypoint/index.md)

## Rules

- 설계 문서는 코드와 1:1로 대응되는 설명을 유지한다.
- 내용은 구현 코드가 아니라 책임, 경계, 흐름을 설명한다.
