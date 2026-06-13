# REQ-DB-001

## Meta

- Date: 2026-06-13 waypoint persistence access는 public store facade와 dedicated DB worker 경로로 통일해야 한다.

## Rule

- waypoint 도메인 코드는 store facade를 우회하는 별도 persistence 진입 경로를 만들면 안 된다.
