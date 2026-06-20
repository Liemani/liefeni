---
created: 2026-06-13
---

# REQ-RT-005

Captures the stable decision that waypoint DB worker thread는 waypoint persistence의 단일 connection ownership과 read/write ordering을 보장하기 위해 존재해야 한다.

## 결정

waypoint DB worker thread는 waypoint persistence의 단일 connection ownership과 read/write ordering을 보장하기 위해 존재해야 한다.

## 이유

- waypoint DB 작업은 이 worker queue를 통해 직렬화되어야 한다.
- runtime/domain 로직 실행 thread로 확장되면 안 된다.
