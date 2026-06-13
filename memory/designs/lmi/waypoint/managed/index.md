# lmi/waypoint/managed

이 문서는 `src/lmi/waypoint/managed/`의 책임과 하위 구조를 정리한다.

## Role

- Holds waypoint lifecycle, runtime, persistence, and recording code.

## Files

- [ManagedObject.md](ManagedObject.md)
- [ManagedObjectContext.md](ManagedObjectContext.md)
- [ManagedWpNode.md](ManagedWpNode.md)
- [SaveBatch.md](SaveBatch.md)
- [WpNodeSnapshot.md](WpNodeSnapshot.md)

## Rules

- 설계 문서는 코드와 1:1로 대응되는 설명을 유지한다.
- 내용은 구현 코드가 아니라 책임, 경계, 흐름을 설명한다.
