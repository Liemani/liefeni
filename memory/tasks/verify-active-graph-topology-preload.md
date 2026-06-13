# Task

## Title

`REQ-WP-004`: active graph 결정과 graph topology preload가 실제 in-game 흐름에서 항상 맞게 동작하는지 검증하기

## Priority

`P1`

## Indexes

- [waypoint.md](../indexes/waypoint.md)

## Status

Backlog

## Notes

- active graph의 topology (`wp_node`, `wp_edge`)는 graph 단위로 메모리에 유지되어야 한다.
- 실제 월드 진입과 이동 흐름에서 graph 선택과 preload 타이밍을 검증한다.
