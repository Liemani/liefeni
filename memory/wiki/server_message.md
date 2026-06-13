# LMI Server Message Notes

이 문서는 LMI 설계 시 참고하기 위한 `UI.uimsg(...)` 메시지 메모다.
목적은 "이 메시지가 무슨 뜻인지"를 현재 코드 기준으로 빠르게 파악하는 것이다.

## 전제

- `Hook.didMsgReceive(id, msg, args...)`에 찍히는 `id`는 **메시지 종류 id가 아니라 widget id**다.
- 따라서 같은 `msg` 문자열이라도 **어느 widget class가 받느냐에 따라 의미가 달라진다**.
- 예를 들어 `"set"`, `"m"`, `"max"`는 여러 widget에서 재사용된다.
- 아래 정리는 현재 `src/haven/**`의 `uimsg(...)` 구현을 기준으로 한 것이다.

## 현재 확인된 메시지

### `glut`

- 처리 위치: `[src/haven/BAttrWnd.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/BAttrWnd.java:490)`
- 의미: `BAttrWnd`의 hunger / satiation meter 갱신
- 로그 형태:
  - `Float 0.0`
  - `Float 0.0`
  - `Float 3.0`
  - `String Satiety`
  - `Color ...`
  - `Color ...`
- 공간 이동과 직접 관련된 신호로 보기는 어렵다.
- 캐릭터 상태창의 배고픔/포만도 UI 갱신으로 보는 것이 맞다.

### `set`

`set`은 여러 widget에서 쓰인다.

#### LayerMeter의 `set`

- 처리 위치: `[src/haven/LayerMeter.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/LayerMeter.java:108)`
- 의미: meter 값 갱신
- 로그 예시:
  - `UNorm16 0.9998...`
  - `Color ...`
- 스태미나/에너지/기타 meter 갱신일 가능성이 높다.
- 공간 이동 자체의 완료 신호로 보기 어렵다.

#### Label / ILabel / Speedget의 `set`

- 처리 위치:
  - `[src/haven/Label.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/Label.java:95)`
  - `[src/haven/ILabel.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/ILabel.java:62)`
  - `[src/haven/Speedget.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/Speedget.java:90)`
- 의미:
  - 텍스트 변경
  - 속도 선택 변경
- 현재 공간 이동 로그에서 보인 `set`은 arg 형태상 `LayerMeter` 쪽일 가능성이 더 높다.

### `m`

`m`도 여러 곳에서 쓰인다.

#### Partyview의 `m`

- 처리 위치: `[src/haven/Partyview.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/Partyview.java:180)`
- 의미: party member 위치/색상 갱신
- 인자 형태:
  - member id
  - optional `Coord`
  - optional `Color`

로그 예시:

```text
{34: m}
Integer 1674641151
Coord (...)
Color java.awt.Color[r=255,g=0,b=0]
```

이 형태는 `Partyview`의 `m`과 정확히 맞는다.

중요한 점:

- 이것은 **공간 이동 완료 신호라기보다 party member marker 갱신**이다.
- 다만 공간 이동 직후 연달아 발생할 수 있으므로, 전환 시점의 보조 신호로는 참고 가능하다.

#### Polity / MCache의 `m`

- 처리 위치:
  - `[src/haven/Polity.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/Polity.java:194)`
  - `[src/haven/MCache.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/MCache.java:815)`
- 현재 제공된 로그 형태와는 잘 맞지 않는다.
- 현재 사례에서는 `Partyview.m`로 보는 쪽이 맞다.

### `pid`

- 처리 위치: `[src/haven/Partyview.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/Partyview.java:191)`
- 의미: 현재 party id 설정
- 로그 예시:

```text
{34: pid}
Integer -158844439
```

- 공간 이동 전후에 나타날 수는 있지만, 그것만으로 맵 전환 완료를 뜻하진 않는다.

### `list`

- 처리 위치: `[src/haven/Partyview.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/Partyview.java:167)`
- 의미: 현재 party member 목록 갱신
- 로그 예시:

```text
{34: list}
Integer 1674641151
```

- `Partyview` 재구성의 일부로 이해하는 편이 맞다.

### `ldr`

- 처리 위치: `[src/haven/Partyview.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/Partyview.java:178)`
- 의미: party leader 설정
- 로그 예시:

```text
{34: ldr}
Integer 1674641151
```

- 이것 역시 공간 이동 자체의 완료 신호보다는 `Partyview` 상태 갱신이다.

### `move`

- 처리 위치: `[src/haven/MapView.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/MapView.java:1869)`
- 의미: `MapView.cc` 갱신
- 코드:

```java
} else if(msg == "move") {
    cc = ((Coord)args[0]).mul(posres);
}
```

- 로그 예시:

```text
{7: move}
Coord (-971497, -972800)
Integer 52902
```

첫 번째 인자는 실제 좌표 갱신에 쓰인다.
두 번째 인자는 여기 코드에서 직접 사용하지 않는다.

중요한 점:

- 이 메시지는 **플레이어/카메라의 현재 맵 좌표 기준점이 갱신되었다**는 점에서 공간 이동과 가장 직접 관련 있다.
- 일반 이동과 공간 전환 둘 다에서 나타날 수 있으므로, 이것만으로 "문 진입 완료"를 판정하긴 부족하다.
- 하지만 공간 전환 atomic action을 설계할 때 핵심 참고 신호다.

### `max`

`max`도 여러 widget에서 쓰인다.

#### Speedget의 `max`

- 처리 위치: `[src/haven/Speedget.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/Speedget.java:85)`
- 의미: 현재 허용 최대 이동 속도 갱신
- 로그 예시:

```text
{17: max}
Integer 30
```

이 값은 UI 상 최대 속도 한계를 갱신하는 용도로 보인다.

#### FightWnd의 `max`

- 처리 위치: `[src/haven/FightWnd.java](/Volumes/mac/3_project/zz_liefeni/liefeni/src/haven/FightWnd.java:699)`
- 의미: 전투 액션 슬롯/활성 수 관련 갱신
- 현재 로그의 arg 형태와 widget 맥락상, 이번 사례는 `Speedget.max`일 가능성이 높다.

## 이번 공간 이동 로그에 대한 해석

사용자가 문 같은 gob를 우클릭한 뒤 관측한 흐름은 대략 이렇게 읽을 수 있다.

1. `MapView click`
   - 실제 gob / mesh를 포함한 우클릭이 서버로 전송됨
2. `glut`, `set`
   - 일반 UI meter 갱신
3. `pid`, `list`, `ldr`, `m`
   - `Partyview` 재구성/업데이트
4. `move`
   - `MapView` 기준 좌표 갱신
5. `max`
   - 속도 UI 갱신

이 흐름은 "단순 이동 후 정지"보다는 **상호작용 -> 서버 처리 -> 공간 상태 갱신 -> 새 위치 적용**에 더 가깝다.

따라서 문 진입 같은 동작은 일반 `move()`와 별도 `AtomicAction`으로 다루는 것이 맞다.

## 설계 참고

현재까지의 코드 해석만으로는, 공간 이동 atomic action의 완료 조건을 아래처럼 계층적으로 보는 것이 안전하다.

### 1. 최소 조건

- click 전송
- `WaitManager.waitResponse()`
- 실제로 움직였으면 `Self.gob().waitMove()`

### 2. 공간 전환 보조 신호

- `MapView`의 `move` 수신
- `Partyview`의 `pid/list/ldr/m` 연쇄 수신

이들은 "전환 중" 또는 "전환 직후 재구성"의 힌트로는 유용하다.
다만 지금 단계에서 이 신호들만으로 완료 판정을 확정하는 것은 성급할 수 있다.

## 현재 결론

- `glut`, `set`, `max`는 이번 문제의 핵심 신호가 아니다.
- `pid`, `list`, `ldr`, `m`은 `Partyview` 갱신으로 보아야 한다.
- `move`는 공간 이동과 가장 직접 관련 있는 `MapView` 좌표 갱신 신호다.
- 문/건물 진입 같은 상호작용은 일반 이동과 다른 완료 조건을 가지므로, 별도 `AtomicAction`이 필요하다.

## 다음에 하면 좋은 것

- `Hook.didMsgReceive()` 로그에 widget class 정보까지 함께 찍는 경로를 만들기
- 공간 전환 후보 메시지들의 시간 순서를 더 많이 수집하기
- `AtomicAction.changeSpace(...)` 또는 `AtomicAction.enterDoor(...)`를 만들고,
  초기 버전은 `waitResponse + waitMove + 추가 안정화 대기`로 시작하기
