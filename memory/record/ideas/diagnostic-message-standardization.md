---
status: Open
created: 2026-06-13
---

# 진단 메시지 정교화

Explores how diagnostic messages should be standardized.

## Notes

- 지금 문제는 메시지를 무조건 길게 쓰는 것이 아니라, 실패/진단 메시지의 형식과 포함 정보가 제각각이라는 점이다.
- 같은 종류의 실패라면 같은 필드를 출력하도록 규칙을 맞추는 게 필요하다.
- 예를 들면:
  - 현재 world position
  - 계산된 grid coord
  - mapView 존재 여부
  - current graph / current grid id
  - 실패 원인
- task로 올리려면:
  - 어떤 메시지 카테고리를 정교화할지
  - terminal 전용인지 GUI 전용인지
  - 공통 prefix / field order / level 규칙을 어떻게 둘지
- 가 먼저 분명해져야 한다.
