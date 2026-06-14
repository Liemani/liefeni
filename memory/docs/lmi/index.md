# lmi

이 문서는 `src/lmi/`의 루트 클래스와 하위 디렉터리의 책임과 구조를 정리한다.

## Meta

- Source: [lmi/](../../../src/lmi/)
- Created: 2026-06-13
- Updated: 2026-06-14

## Role

- Defines the root LMI package classes and the supported subpackages under `src/lmi/`.

## Contents

### Subdirectories
- [behavior/](behavior/index.md)
- [bridge/](bridge/index.md)
- [core/](core/index.md)
- [draw/](draw/index.md)
- [lifecycle/](lifecycle/index.md)
- [runtime/](runtime/index.md)
- [waypoint/](waypoint/index.md)

### Files

## Rules

- Root-package classes stay in `Files`; subdirectories stay in `Subdirectories`.
- bridge-specific helpers stay under `bridge/`.
- lifecycle/runtime ownership is documented in their own index files, not duplicated here.
- 내용은 구현 코드가 아니라 책임, 경계, 흐름을 설명한다.
