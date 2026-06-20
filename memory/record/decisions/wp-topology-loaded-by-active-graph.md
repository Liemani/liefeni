---
created: 2026-06-13
---

# REQ-WP-004

Captures the stable decision that 현재 active graph의 topology (`wp_node` `wp_edge`)는 graph 단위로 메모리에 유지되어야 한다.

## 결정

현재 active graph의 topology (`wp_node` `wp_edge`)는 graph 단위로 메모리에 유지되어야 한다.

## 이유

- topology load 경계는 local resident grid가 아니라 active graph다.
