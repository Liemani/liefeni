---
created: 2026-06-13
---

# REQ-RT-006

Captures the stable decision that `Agent` thread는 user-facing automation job execution을 Haven main/draw thread 밖에서 수행하기 위해 존재해야 한다.

## 결정

`Agent` thread는 user-facing automation job execution을 Haven main/draw thread 밖에서 수행하기 위해 존재해야 한다.

## 이유

- agent thread는 job orchestration 경계여야 한다.
- persistence ordering이나 render completion delivery 책임을 겸하면 안 된다.
