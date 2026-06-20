---
created: 2026-06-13
---

# DEC-015

Captures the stable decision that 내부 상태를 드러내는 진단 메시지는 게임 GUI 콘솔보다 terminal 출력으로 우선 보낸다.

## 결정

내부 상태를 드러내는 진단 메시지는 게임 GUI 콘솔보다 terminal 출력으로 우선 보낸다.

## 이유

- GUI 콘솔은 사용자 행동 결과와 실제 사용자 안내를 보여주는 곳에 가깝다.
- `current grid position is unavailable` 같은 내부 상태 문구는 사용자용 실패 메시지라기보다 디버깅 정보에 가깝다.
- 이런 문구를 GUI 콘솔에 그대로 노출하면 사용자 경험과 디버깅 정보가 섞인다.
- terminal 출력으로 보내면 개발 중에는 정보를 유지하면서도 게임 UI는 더 깔끔하게 유지할 수 있다.
