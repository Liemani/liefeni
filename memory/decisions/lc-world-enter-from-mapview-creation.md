# REQ-LC-003

## Meta

- Date: 2026-06-13 world-level lifecycle 진입은 Haven `MapView` 생성 경계에서 `LmiLifecycle.enterWorld(MapView)`로 직접 전달되어야 한다.

## Rule

- `plob`나 다른 후행 메시지를 world enter의 기본 진입점으로 사용하면 안 된다.
