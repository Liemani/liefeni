# lmi/runtime

이 문서는 이 디렉터리의 책임과 하위 구조를 정리한다.

## Meta

- Source: [runtime/](../../../../src/lmi/runtime/)
- Created: 2026-06-13
- Updated: 2026-06-14

## Role

- agent worker와 runtime monitor, progress/wait state를 묶는다.

## Contents

### Subdirectories

### Files
- [Agent.md](Agent.md)
- [AgentConfig.md](AgentConfig.md)
- [AgentContext.md](AgentContext.md)
- [AgentManager.md](AgentManager.md)
- [AgentRegistry.md](AgentRegistry.md)
- [ChatInputMonitor.md](ChatInputMonitor.md)
- [PortalMonitor.md](PortalMonitor.md)
- [WaitManager.md](WaitManager.md)

## Rules

- runtime은 UI thread에서 직접 오래 돌지 않는다.
- agent execution과 state monitor를 분리한다.
