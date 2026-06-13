# lmi/waypoint/model

이 문서는 `src/lmi/waypoint/model/`의 책임과 하위 구조를 정리한다.

## Role

- Holds waypoint lifecycle, runtime, persistence, and recording code.

## Files

- [CreateNodeResult.md](CreateNodeResult.md)
- [LoadEdgesByGraphResult.md](LoadEdgesByGraphResult.md)
- [LoadNodesByGraphResult.md](LoadNodesByGraphResult.md)
- [LoadNodesByGridResult.md](LoadNodesByGridResult.md)
- [LoadPointsByCutResult.md](LoadPointsByCutResult.md)
- [LoadSegmentsByCutResult.md](LoadSegmentsByCutResult.md)
- [PendingPortalTransition.md](PendingPortalTransition.md)
- [RecordingClick.md](RecordingClick.md)
- [RecordingSegment.md](RecordingSegment.md)
- [RecordingSession.md](RecordingSession.md)
- [SaveEdgeResult.md](SaveEdgeResult.md)
- [SaveMapGridResult.md](SaveMapGridResult.md)

## Rules

- 설계 문서는 코드와 1:1로 대응되는 설명을 유지한다.
- 내용은 구현 코드가 아니라 책임, 경계, 흐름을 설명한다.
