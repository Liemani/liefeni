---
created: 2026-06-13
---

# REQ-RT-004

Captures the stable decision that `RuntimeEventManager` thread는 Haven signal 이후에 재시도 polling deferred runtime housekeeping이 필요한 LMI 작업만 맡아야 한다.

## 결정

`RuntimeEventManager` thread는 Haven signal 이후에 재시도 polling deferred runtime housekeeping이 필요한 LMI 작업만 맡아야 한다.

## 이유

- 이 thread는 blocking DB access나 장시간 job execution을 직접 맡으면 안 된다.
