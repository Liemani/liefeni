# Docs

이 문서는 구현 전 구조 설명, 구조 walkthrough, 여러 decision을 묶는 doc 문서를 모아둔다.

- [agent/](agent/index.md): `src/agent/` 구조와 책임 배치
- [haven/](haven/index.md): `src/haven/` 구조와 책임 배치
- [lmi/](lmi/index.md): `src/lmi/` 구조와 책임 배치

## Meta Rule

- 각 doc item은 `Meta` 블록에 실제 소스 파일 링크를 포함한다.
- `Source`는 `src/...`의 실제 파일을 가리키는 기본 식별자다.
- `Target`과 `Owner`는 더 이상 기본 필드가 아니며, 필요할 때만 본문에서 설명한다.
- 기존 문서는 `Source` 중심으로 맞춘다.
- 단일 파일은 `doc-file.md`, 디렉터리는 `doc-directory.md` 템플릿을 사용한다.
- 디렉터리 문서는 `Subdirectories`를 `Files`보다 먼저 둔다.
