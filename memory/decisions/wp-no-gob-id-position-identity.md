# REQ-WP-001

## Meta

- Date: 2026-06-13 waypoint는 `gob_id`를 위치 정체성의 기준으로 사용하면 안 된다.

## Rule

- waypoint 위치는 Haven `MapFile.Segment.id`, 내부 `map_grid.id`, 그리고 `grid_id + local_x + local_y` 좌표 표현을 기준으로 다뤄야 한다.
