# REQ-RT-004

## Meta

- Date: 2026-06-13 `RuntimeEventManager` thread는 Haven signal 이후에 재시도 polling deferred runtime housekeeping이 필요한 LMI 작업만 맡아야 한다.

## Rule

- 이 thread는 blocking DB access나 장시간 job execution을 직접 맡으면 안 된다.
