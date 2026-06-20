---
created: 2026-06-13
---

# waypoint-grid-save-next-refresh.md

Captures the stable decision that `WaypointGridResolver`는 map grid가 없을 때 저장 요청을 queue에 넣고 다음 refresh에서 다시 본다.

## 결정

`WaypointGridResolver`는 map grid가 없을 때 저장 요청을 queue에 넣고 다음 refresh에서 다시 본다.

## 이유

- grid / segment / DB row 보장은 비동기 흐름으로 맞춘다.
- runtime thread를 block하지 않기 위함이다.

## 영향

- Related index: [waypoint.md](../indexes/waypoint.md)
