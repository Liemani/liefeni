# lmi/waypoint

이 문서는 `src/lmi/waypoint/`의 책임과 하위 구조를 정리한다.

## Role

- Holds waypoint lifecycle, runtime, persistence, and recording code.

## Files

- [WaypointBootstrap.md](WaypointBootstrap.md)
- [WaypointDebug.md](WaypointDebug.md)
- [WaypointManager.md](WaypointManager.md)
- [WaypointOverlay.md](WaypointOverlay.md)

## Child Packages

- [calibration/](calibration/index.md)
- [db/](db/index.md)
- [managed/](managed/index.md)
- [model/](model/index.md)
- [object/](object/index.md)
- [persistence/](persistence/index.md)
- [recording/](recording/index.md)
- [runtime/](runtime/index.md)

## Rules

- 설계 문서는 코드와 1:1로 대응되는 설명을 유지한다.
- 내용은 구현 코드가 아니라 책임, 경계, 흐름을 설명한다.
