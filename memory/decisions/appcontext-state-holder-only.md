# DEC-008

## Meta

- Date: 2026-06-13 `AppContext`는 lifecycle orchestrator가 아니라 Haven 참조 보관 accessor cache clear 역할에 집중한다.

## 이유

- lifecycle 판단과 state holding이 섞이면 책임 경계가 다시 흐려진다.
- reset 경로가 중복되기 쉽다.

