---
created: 2026-06-13
---

# REQ-RT-008

Captures the stable decision that Haven 코드는 LMI 때문에 불필요하게 넓게 수정되면 안 된다.

## 결정

Haven 코드는 LMI 때문에 불필요하게 넓게 수정되면 안 된다.

## 이유

- Haven 변경은 가능한 한 작은 hook point, bridge call, 또는 `// lmi start` / `// lmi end` 범위 안의 국소 patch로 제한해야 한다.
