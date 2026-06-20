---
created: 2026-06-13
---

# REQ-RT-002

Captures the stable decision that draw/render 경로는 Haven thread가 LMI 데이터를 직접 읽고 그릴 수 있어야 한다.

## 결정

draw/render 경로는 Haven thread가 LMI 데이터를 직접 읽고 그릴 수 있어야 한다.

## 이유

- draw/render 시점에 무거운 계산, blocking wait, ad hoc DB access를 하면 안 된다.
- draw 가능한 형태의 데이터는 그 전에 LMI 쪽에서 미리 준비되어 있어야 한다.
