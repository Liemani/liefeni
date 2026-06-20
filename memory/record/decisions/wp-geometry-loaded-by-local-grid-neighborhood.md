---
created: 2026-06-13
---

# REQ-WP-005

Captures the stable decision that geometry (`wp_segment` `wp_point`)는 player 기준 `3 x 3 grid` 범위를 resident load / render 경계로 사용해야 한다.

## 결정

geometry (`wp_segment` `wp_point`)는 player 기준 `3 x 3 grid` 범위를 resident load / render 경계로 사용해야 한다.

## 이유

- geometry residency 경계는 active graph 전체가 아니라 current local grid neighborhood다.
