# REQ-DB

## Indexes

- [waypoint.md](../indexes/waypoint.md)

## Persistence

- `REQ-DB-001`
  - waypoint persistence access는 public store facade와 dedicated DB worker 경로로 통일해야 한다.
  - waypoint 도메인 코드는 store facade를 우회하는 별도 persistence 진입 경로를 만들면 안 된다.
- `REQ-DB-002`
  - waypoint 도메인 코드는 `DriverManager.getConnection(...)` 같은 direct ad hoc JDBC connection open 경로를 새로 만들면 안 된다.
  - waypoint DB connection ownership은 dedicated DB worker 쪽에 있어야 한다.
- `REQ-DB-003`
  - 현재 단계에서는 schema version mismatch 시 automatic migration을 시도하지 않고, 명시적 예외를 던진다.
  - DB 재생성과 clean schema initialize를 전제로 한다.
- `REQ-DB-004`
  - DB worker completion은 runtime cache를 worker thread에서 직접 갱신하면 안 된다.
  - completion은 sync/completion queue를 통해 main/render 쪽 lifecycle 경계로 되돌려 반영해야 한다.
- `REQ-DB-005`
  - world enter 이후 waypoint DB initialize request는 이후 waypoint DB 작업보다 먼저 enqueue되어야 한다.
  - 이후 waypoint DB 작업은 같은 dedicated DB worker queue ordering에 의존해야 한다.
