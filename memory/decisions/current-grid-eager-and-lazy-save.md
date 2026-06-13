# current-grid-eager-and-lazy-save.md

## Meta

- Date: 2026-06-13
- Indexes:
  - [waypoint.md](../indexes/waypoint.md)

현재 player grid의 waypoint DB row 저장은 eager path와 lazy fallback을 둘 다 허용한다.

## 이유

- 기본적으로는 world enter 직후 자동 확보가 맞다.
- 아직 준비되지 않았더라도 user action 중 필요한 시점에 직접 확보할 수 있어야 초기 사용성이 무너지지 않는다.
