---
status: Backlog
created: 2026-06-13
related_decisions: []
---

# session handoff / reconnect 시 `leaveSession(Session)`과 `enterSession(Session)` 순서가 실제로 안전한지 로그 기반으로 재검증하기

Tracks the implementation and verification work for this task.

## Checklist
- [ ] old session cleanup이 new session state를 지우지 않는지 확인한다.
- [ ] character select 복귀, reconnect, handoff 경로를 중심으로 본다.

## Notes
- Task ID: REQ-LC-005
