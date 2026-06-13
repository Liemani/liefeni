# DEC-002

## Meta

- Date: 2026-06-13 session lifecycle의 진실 원천은 boolean 상태가 아니라 `Session` identity다.

## 이유

- session handoff / reconnect 경로에서 old session cleanup이 new session state를 지우지 않게 해야 한다.

