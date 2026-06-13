# REQ-DB-002

## Meta

- Date: 2026-06-13 waypoint 도메인 코드는 `DriverManager.getConnection(...)` 같은 direct ad hoc JDBC connection open 경로를 새로 만들면 안 된다.

## Rule

- waypoint DB connection ownership은 dedicated DB worker 쪽에 있어야 한다.
