---
created: 2026-06-13
---

# REQ-RT-001

Captures the stable decision that Haven signal로 시작되는 LMI non-render 작업은 기본적으로 Haven thread에서 오래 실행되면 안 된다.

## 결정

Haven signal로 시작되는 LMI non-render 작업은 기본적으로 Haven thread에서 오래 실행되면 안 된다.

## 이유

- Haven thread는 필요한 최소 이벤트나 snapshot만 LMI 쪽 worker/runtime 경계로 넘겨야 한다.
- 실제 LMI non-render 작업은 LMI thread에서 처리해야 한다.
