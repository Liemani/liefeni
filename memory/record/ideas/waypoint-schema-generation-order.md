---
status: Open
created: 2026-06-14
---

# waypoint schema 생성 순서 문서화

Explores whether schema generation order should be documented.

## Notes

- 지금은 `WaypointDatabase.md`에 스키마 정의만 문서화하면 충분하다.
- 다만 테이블 간 의존 관계가 보이도록 생성 순서를 따로 적는 방식도 나중에 유용할 수 있다.
- 예를 들면:
  - `map_segment`가 `map_grid`보다 먼저 의미를 갖는지
  - `wp_graph`가 `wp_node`보다 먼저 필요한지
  - migration이 생겼을 때 기준이 되는지
- 아직은 필요 여부를 확정하지 못했으니 아이디어로 보류한다.
