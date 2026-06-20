---
created: 2026-06-13
---

# REQ-WP-006

Captures the stable decision that `CreateNodeJob` `RecordJob` `StopRecordJob`은 anchor / calibration / virtual coordinate를 전제로 하면 안 된다.

## 결정

`CreateNodeJob` `RecordJob` `StopRecordJob`은 anchor / calibration / virtual coordinate를 전제로 하면 안 된다.

## 이유

- 이 작업들은 active graph와 현재 waypoint `grid_id + local_x + local_y` 위치를 기준으로 동작해야 한다.
