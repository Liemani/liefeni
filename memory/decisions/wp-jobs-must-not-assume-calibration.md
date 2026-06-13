# REQ-WP-006

## Meta

- Date: 2026-06-13 `CreateNodeJob` `RecordJob` `StopRecordJob`은 anchor / calibration / virtual coordinate를 전제로 하면 안 된다.

## Rule

- 이 작업들은 active graph와 현재 waypoint `grid_id + local_x + local_y` 위치를 기준으로 동작해야 한다.
