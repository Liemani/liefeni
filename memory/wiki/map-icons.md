# Map Icons

## Meta

### Indexes

- [../indexes/waypoint.md](../indexes/waypoint.md)

이 문서는 Haven 클라이언트가 minimap / map window에서 보이는 아이콘과 marker를 어떻게 저장하는지 정리한다.

## 개요

현재 map icon 관련 저장은 두 층으로 나뉜다.

1. 아이콘 설정 저장
- 어떤 아이콘을 알고 있는가
- 표시 / 알림 / mark 여부를 어떻게 둘 것인가

2. 맵 marker 저장
- 어떤 위치에 어떤 오브젝트 marker가 있었는가

즉 “아이콘 정의/설정”과 “맵 위 위치 기록”은 다른 파일/구조에 저장된다.

## 1. 아이콘 설정 저장

아이콘 설정은 `GobIcon.Settings`가 맡는다.

관련 코드:

- `src/haven/GameUI.java`
  - `"map-icons"` 메시지 처리
- `src/haven/GobIcon.java`
  - `Settings`
  - `Settings.save()`
  - `Settings.load()`

파일명:

- `data/mm-icons-2`
- genus가 있으면 `data/mm-icons-2/<genus>`
- 세션 user가 있으면 `data/mm-icons-2/<genus>/<user>`

코드:

- [GameUI.java](../src/haven/GameUI.java)
- [GobIcon.java](../src/haven/GobIcon.java)

무엇이 저장되나:

- resource name / version
- optional `sdt` bytes
- icon별 `show`
- `defshow`
- `notify`
- `mark` override
- notify sound resource or wav path
- sub-id별 setting

중요:

- 여기엔 아이콘 bitmap 자체를 저장하지 않는다
- 아이콘 이미지 자체는 resource cache 쪽에서 관리된다
- 여기에는 “이 아이콘을 어떻게 다룰지”와 “서버가 알려준 icon identity”가 저장된다

## 2. 맵 marker 저장

맵 위 검색 가능한 object icon은 `MapFile.SMarker`로 저장된다.

관련 타입:

- `MapFile.Marker`
- `MapFile.PMarker`
- `MapFile.SMarker`

의미:

- `PMarker`
  - 사용자가 직접 찍는 일반 마커
- `SMarker`
  - 시스템/오브젝트 기반 marker

`SMarker`가 저장하는 값:

- `seg`
- `tc`
- `nm`
- `oid`
- `res`
- `data`

코드:

- [MapFile.java](../src/haven/MapFile.java)

이 marker들은 `MapFile.markers` 컬렉션에 있고, `MapFile.save()` 시 map index에 같이 직렬화된다.

## 자동 등록 경로

### A. minimap icon 기반 자동 마킹

관련 코드:

- [MiniMap.java](../src/haven/MiniMap.java)
  - `markobjs()`

흐름:

1. gob에 `GobIcon`이 있는지 본다
2. icon resource가 markable인지 확인한다
3. 사용자 설정에서 mark가 켜져 있으면
4. 현재 gob world 위치를 tile 좌표로 바꾼다
5. 현재 `MCache.Grid.id`에서 `MapFile.GridInfo`를 찾아
6. `seg`와 segment 내부 tile 좌표 `sc`를 계산한다
7. `new SMarker(...)`
8. `file.add(...)` 또는 기존 marker update

즉 자동 `SMarker`의 대부분은 minimap icon과 `GobIcon.Settings`를 통해 만들어진다.

### B. server `map-mark` 메시지 기반 등록

관련 코드:

- [GameUI.java](../src/haven/GameUI.java)
  - `"map-mark"`
- [MapWnd.java](../src/haven/MapWnd.java)
  - `markobj(...)` 경로

서버가 명시적으로:

- gob id
- object uid
- resource
- name
- optional data

를 보내면, 클라이언트가 해당 gob 위치를 기준으로 `SMarker`를 만든다.

## 어떤 오브젝트가 자동 등록되나

하드코딩된 Java 목록이 있는 건 아니다.

기준은 `GobIcon.Icon.markable()`이다.

기본 `ImageIcon`의 경우 resource metadata `mm/mark`를 본다.

- `0` or absent
  - `UNMARKABLE`
- `1`
  - `NONDEFAULT`
- `2`
  - `DEFAULT`

즉 자동 등록 대상은:

- minimap icon이 있고
- icon resource가 `mm/mark`로 markable 판정을 받고
- user icon setting에서 mark가 켜진 오브젝트들

실제로는 forageable, 탐색 대상, 특수 world object처럼 icon이 있는 오브젝트들이 여기에 들어간다.

## 검색은 어떻게 하나

검색은 `MapWnd`가 `MapFile.markers`를 순회해 필터링하는 방식이다.

관련 코드:

- [MapWnd.java](../src/haven/MapWnd.java)

즉 검색 가능한 이유는:

- marker가 mapfile에 영속 저장되고
- marker에 `name`, `resource`, `segment/tile position`이 남기 때문이다

## 정리

- `GobIcon.Settings`
  - 아이콘 설정과 icon identity 저장
- `MapFile.SMarker`
  - 맵 위 실제 위치 기록 저장
- 아이콘 비트맵 자체
  - 별도 resource cache

즉 map icon 저장은 “설정”과 “위치 marker”로 분리되어 있다.
