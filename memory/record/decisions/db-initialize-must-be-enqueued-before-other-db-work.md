---
created: 2026-06-13
---

# REQ-DB-005

Captures the stable decision that world enter 이후 waypoint DB initialize request는 이후 waypoint DB 작업보다 먼저 enqueue되어야 한다.

## 결정

world enter 이후 waypoint DB initialize request는 이후 waypoint DB 작업보다 먼저 enqueue되어야 한다.

## 이유

- 이후 waypoint DB 작업은 같은 dedicated DB worker queue ordering에 의존해야 한다.
