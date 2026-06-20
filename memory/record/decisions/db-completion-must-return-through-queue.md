---
created: 2026-06-13
---

# REQ-DB-004

Captures the stable decision that DB worker completion은 runtime cache를 worker thread에서 직접 갱신하면 안 된다.

## 결정

DB worker completion은 runtime cache를 worker thread에서 직접 갱신하면 안 된다.

## 이유

- completion은 sync/completion queue를 통해 main/render 쪽 lifecycle 경계로 되돌려 반영해야 한다.
