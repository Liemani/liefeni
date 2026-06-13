# REQ-WP

## Indexes

- [waypoint.md](../indexes/waypoint.md)

## Waypoint

- `REQ-WP-001`
  - waypoint는 `gob_id`를 위치 정체성의 기준으로 사용하면 안 된다.
  - waypoint 위치는 Haven `MapFile.Segment.id`, 내부 `map_grid.id`, 그리고 `grid_id + local_x + local_y` 좌표 표현을 기준으로 다뤄야 한다.
- `REQ-WP-002`
  - 선행조건으로서, 현재 player 위치를 기준으로 waypoint 동작을 시작하기 전에 해당 grid의 waypoint `map_grid` row는 DB에 존재해야 한다.
- `REQ-WP-003`
  - world enter 이후 현재 player가 서 있는 Haven grid는 waypoint `map_segment` / `map_grid` row로 자동 기록되는 것이 기본 경로여야 한다.
  - 다만 아직 기록되지 않았더라도 waypoint user action 실행 중 현재 Haven grid가 필요해지면, 그 자리에서 직접 기록하여 확보할 수 있어야 한다.
- `REQ-WP-004`
  - 현재 active graph의 topology (`wp_node`, `wp_edge`)는 graph 단위로 메모리에 유지되어야 한다.
  - topology load 경계는 local resident grid가 아니라 active graph다.
- `REQ-WP-005`
  - geometry (`wp_segment`, `wp_point`)는 player 기준 `3 x 3 grid` 범위를 resident load / render 경계로 사용해야 한다.
  - geometry residency 경계는 active graph 전체가 아니라 current local grid neighborhood다.
- `REQ-WP-006`
  - `CreateNodeJob`, `RecordJob`, `StopRecordJob`은 anchor / calibration / virtual coordinate를 전제로 하면 안 된다.
  - 이 작업들은 active graph와 현재 waypoint `grid_id + local_x + local_y` 위치를 기준으로 동작해야 한다.
