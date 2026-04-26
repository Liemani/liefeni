# LMI Working Context

이 저장소는 Haven & Hearth 클라이언트 위에 얹는 자동화 런타임 `lmi`와, 그 위에서 실행되는 사용자 기능 패키지 `agent`로 구성된다.
현재 중요한 것은 "무엇을 자동화하느냐"보다 "그 자동화가 어떤 런타임 계약 위에서 안전하게 돌아가느냐"다.

## 구조 개요

### 계층

- `haven`: 원본 게임 클라이언트와 엔진 코드
- `lmi`: 자동화 런타임, 동기화, 훅, UI 주입, waypoint 인프라
- `agent`: 실제 사용자 기능인 `Job`과 `Effect`

의존 방향은 기본적으로 `lmi -> agent`다.
`agent`는 실행 대상이고, `lmi`는 그것을 발견하고 실행하고 동기화하는 프레임워크다.

### 실행 모델

- 메인/렌더 스레드: Haven UI와 입력 처리
- 네트워크 스레드: 서버 패킷 송수신
- `lmi.Agent`: 자동화 실행 전용 스레드

`Agent`는 "무엇을 할지 결정하는 객체"가 아니라 "결정된 실행 요청을 안전하게 수행하는 런타임"이다.

현재 `Agent`는 `JobRequest` 단위로 요청을 다룬다.
각 요청은 다음 정보를 함께 가진다.

- `Job`
- `String[] args`
- `AgentContext`

스케줄링 정책은 두 가지를 지원한다.

- `pushJob(...)`: 현재 작업 위에 즉시 끼워 넣는 긴급 작업
- `enqueueJob(...)`: 뒤에 이어서 실행할 일반 작업

즉, 현재 `Agent`는 단순 stack이나 queue가 아니라 "긴급 push + 일반 enqueue"를 처리하는 작은 스케줄러다.

## 전역 접근점

현재 `AppContext`는 이름은 그대로 유지하고 있지만, 실제 역할은 "LMI 전역 접근점"에 가깝다.

- Haven에서 전달받은 주요 참조를 보관한다.
- 자주 쓰는 UI 접근은 `AppContext.menuGrid()`, `AppContext.window()` 같은 accessor로 제공한다.
- 기존 `WidgetManager`가 맡던 접근 함수들은 `AppContext`로 흡수되었다.
- `IMeter`는 목록으로 보관하고, 체력/스태미나/에너지는 lazy cache로 해석한다.
- 내부적으로 `process-level`, `session-level`, `widget-cache` 수명을 구분한다.
- `setMenuGrid()`는 menu 참조만 저장하고, 실제 LMI 메뉴 주입은 호출부에서 `MenuGridProxy.init()`를 명시적으로 호출한다.

세션/위젯 무효화 정책은 다음과 같다.

- `setSession(newSession)`: 이전 session과 다를 때 `resetSessionState()` 호출
- `setRootWidget(newRoot)`: 이전 root와 다를 때 `resetWidgetCache()` 호출

즉, 생성은 Haven lifecycle을 따라 분산되지만, 무효화 정책은 `AppContext`에 모아둔다.

## 동기화 모델

자동화의 기본 동기화 축은 `WaitManager`다.

- `updateSentSeq(seq)`: 송신 패킷 시퀀스 기록
- `updateAckedSeq(seq)`: 서버 ACK 반영
- `waitACK()`: 마지막 송신이 ACK될 때까지 대기
- `waitResponse()`: ACK 이후 화면/상태 반영 시간을 포함해 대기
- `sleepPolling()`: 기본 polling interval (`TO_POLL`) 대기
- `sleep(long)`: 명시 시간 대기

LMI는 "서버 응답 기반으로 깨어난 뒤, 상태 조건은 직접 다시 확인한다"는 방식을 따른다.
즉, 이벤트 기반보다는 ACK 기반 동기화 + 폴링 확인의 혼합 모델이다.

## Meter 조회 모델

Haven의 상태 미터는 `IMeter` 기반으로 다룬다.
현재 구조는 다음과 같다.

- `IMeter` 생성 시 `AppContext.addMeterWidget(...)`로 목록에만 등록
- `AppContext.hitPointMeter()`, `staminaMeter()`, `energyMeter()`가 필요할 때 lazy 하게 탐색
- 한 번 찾은 `IMeter`는 각 슬롯에 캐시
- 끝까지 못 찾으면 `LMIException(ER_WIDGET_MISSING)` 발생

## Discovery / Menu / Execution

### AgentRegistry

현재 `agent` 패키지의 `Job`, `Effect`, 폴더 메타데이터 발견은 모두 `lmi.AgentRegistry`가 맡는다.

규칙은 다음과 같다.

- 배포는 JAR 기준이다.
- 실행 중인 JAR 안의 `agent/**`를 recursive 하게 스캔한다.
- concrete `Job`은 실행 가능한 Job으로 등록한다.
- concrete `Effect`는 실행 가능한 Effect로 등록한다.
- 패키지 마지막 이름과 같은 소문자 마커 클래스는 폴더 메타데이터로 간주한다.

이 registry를 다음 컴포넌트가 공통으로 사용한다.

- `AgentManager`: 콘솔 명령에서 Job 조회 및 실행
- `MenuGridProxy`: 메뉴 계층 구성 및 메타데이터 표시
- `Hook`: 메뉴 클릭 시 Job/Effect 실행

### 메뉴 메타데이터 계약

`agent` 아래의 Job/Effect/폴더 메타데이터 클래스는 다음 정적 메서드를 선택적으로 제공할 수 있다.

- `name()`: 표시 이름
- `info()`: 툴팁 설명
- `icon()`: 아이콘 경로
- `sortkey()`: 정렬 키

`icon()`이 `assets/`로 시작하면 로컬 PNG를 직접 로드한다.
그 외 문자열은 Haven resource path로 간주한다.

### Effect의 의미

`Job`은 길거나 절차적인 작업이다.
`Effect`는 메뉴 클릭 즉시 수행되는 완결 기능이다.

현재 예시로:

- `agent.effect.ToggleSleepEffect`
- `agent.debug.DescribeSelfEffect`
- `agent.debug.DescribeAgentStackEffect`

가 있다.

## AtomicAction

`AtomicAction`은 더 쪼개지지 않는 최소 실행 단위를 모아둔 내부 계층이다.
현재 공개 메서드는 다음 성격으로 정리되어 있다.

- `interact(long gobId, Coord gobPosition)`
- `enter(long doorId, Coord doorPosition, int meshId)`
- `go(Coord)`
- `forceGo(Coord)`
- `lift(long gobId, Coord gobPosition)`
- `forceLift(long gobId, Coord gobPosition)`
- `put(Coord)`
- `forcePut(Coord)`

핵심 원칙은:

- `Gob` 객체 전체보다는 `gobId`, `gobPosition` 같은 필요한 값만 인자로 받는다.
- `go(Coord)`는 `Self.gob().waitMove(coord)`를 바로 호출하지 않고, 내부에서 click / wait / 도착 판정을 직접 수행한다.
- 공간 전환성 click은 `enter(...)`처럼 별도 원자 동작으로 둔다.

## Chat 입력 대기

area chat 입력 대기는 `ChatInputManager`가 맡는다.

현재 구조:

- `Hook.willMsgSend(...)`가 `ChatUI.MultiChat`의 `"msg"` 전송을 가로챈다
- `ChatInputManager.waitAreaChat()`는 다음 area chat 입력 문자열이 들어올 때까지 block 한다

이 메커니즘은 현재 `CreateNodeJob`, `StopRecordJob`의 이름 입력 대기에 사용된다.

## Waypoint

Waypoint는 현재 두 계층으로 나뉜다.

### 1. `gob_*` 계층

실제 관측 가능한 gob를 기준으로 가상 좌표계와 연결 그래프를 만든다.

- `gob_graph`
- `gob_node`
- `gob_edge`

핵심 규칙:

- `gob_node.id = gob_id`
- `gob_node`는 `graph_id`, `vir_x`, `vir_y`, `resname`을 가진다
- `gob_edge`는 좌표 연결용이므로 direction이 없다
- `gob_graph.entry_node_id`는 graph의 대표 진입 gob node를 가리킨다

### 2. `wp_*` 계층

실제 캐릭터 이동 경로와 비용 계산을 표현한다.

- `wp_node`
- `wp_edge`
- `wp_segment`
- `wp_point`

핵심 규칙:

- `wp_node`는 항상 정확히 하나의 `gob_node`를 anchor로 가진다
- `wp_node.gob_graph_id`와 `wp_node.gob_node_id`를 둘 다 들고 간다
- `wp_node.name`은 중복 허용
- `wp_edge.direction`은 다음 상수를 사용한다
  - `0 = blocked`
  - `1 = forward`
  - `2 = backward`
  - `3 = bidirectional`
- `wp_segment.gob_graph_id`는 해당 segment의 point가 속한 virtual graph를 나타낸다
- `wp_segment.step`, `wp_point.step`은 순차 인덱스다
- `wp_point.vir_x`, `wp_point.vir_y`는 공통 virtual coordinate 기준 절대값이다

즉 지금 waypoint의 핵심은:

- 하위 `gob_*` 계층으로 좌표계를 복원하고
- 상위 `wp_*` 계층으로 실제 navigation 그래프를 다룬다

### WaypointDatabase

현재 `WaypointDatabase`는 위 최종 스키마를 기준으로 동작하는 DB 접근 중심 계층이다.

중요한 공개 API:

- `initialize()`
- `createRootNode(...)`
- `createNode(...)`
- `findGob(...)`
- `findNodeByGob(...)`
- `loadNearbyNodes(...)`
- `loadNearbyGobs(...)`
- `loadNearbyPoints(...)`

즉 현재 `WaypointDatabase`는 schema 생성, 조회, root/node 생성 같은 기본 DB 작업에 집중한다.

### WaypointEdgeWriter / SegmentResolver / GobGraphMerger

waypoint 저장 경로는 지금 세 계층으로 분리되어 있다.

- `WaypointEdgeWriter`
  - `RecordingSession`을 받아 `wp_edge`, `wp_segment`, `wp_point`를 저장하는 orchestration 담당
- `SegmentResolver`
  - 각 segment의 시작/끝 gob를 해석해 segment가 속한 `gob_graph`를 확정
  - 둘 다 미등록이면 새 `gob_graph`와 `gob_node`를 만든다
  - 하나만 등록돼 있으면 같은 graph에 나머지 endpoint `gob_node`를 만든다
  - 둘 다 등록돼 있는데 graph가 다르면 graph 병합을 요청한다
- `GobGraphMerger`
  - graph 병합 시 작은 graph의 `gob_node`, `wp_node`, `wp_segment.gob_graph_id`, `wp_point.vir_x/vir_y`를 `deltaX/deltaY`로 평행이동한다

즉 현재 저장 경로는:

- `WaypointEdgeWriter`
- `SegmentResolver`
- `GobGraphMerger`

로 나뉘어 있고, `WaypointDatabase`는 그 저수준 DB helper를 제공하는 형태다.

### WaypointManager

현재 좌표계 복원과 nearby 시각화용 캐시는 `lmi.waypoint.WaypointManager`가 맡는다.

현재 핵심 상태는:

- `Gob calibrationGob`

즉, 현재 waypoint 좌표계 calibration의 active key는 gob 하나다.

현재 책임:

- `calibrate(Gob gob)`: 등록된 `gob_node` 기준으로 현재 좌표계를 보정
- `refresh()`: 현재 player 위치 기준 nearby node / gob / point 캐시 재계산
- `nearestNode()`
- `nearbyGob(long gobId)`
- `nearbyNodes()`
- `nearbyGobs()`
- `nearbyPoints()`

nearby 범위는 `x`, `y` 각각 30 tile이며, 내부 계산 단위는 `30 * 1024`다.

복원 결과 타입은 더 이상 `WaypointManager` 내부 클래스가 아니라 별도 runtime 타입으로 분리돼 있다.

- `ResolvedNode`
- `ResolvedGob`
- `ResolvedPoint`

### CalibrateWaypointJob

`CalibrateWaypointJob`은 사용자가 클릭한 gob가 `gob_node` 테이블에 등록되어 있으면 `WaypointManager.calibrate(gob)`를 호출한다.
성공 시 현재 graph 좌표계가 calibrated 상태가 되고, nearby node / point 수를 출력한다.

### CreateNodeJob

`CreateNodeJob`은 새로운 root waypoint node를 만든다.

흐름:

1. 사용자에게 기준 gob 클릭 요청
2. area chat에 node 이름 입력 요청
3. 현재 캐릭터 위치를 새 `wp_node` 위치로 사용
4. 선택한 gob의 virtual 좌표를 `gob.position - Self.position()`으로 계산
5. `gob_graph`, `gob_node`, `wp_node` 생성
6. 성공 시 `WaypointManager.calibrate(gob)`까지 수행

즉 `CreateNodeJob` 직후에는 `CalibrateWaypointJob` 없이도 좌표계가 calibrated 상태가 된다.

### RecordJob

`RecordJob`은 다음 조건에서만 시작된다.

- `WaypointManager.isCalibrated()`가 `true`

시작 흐름:

1. `WaypointManager.refresh()`
2. nearby `wp_node` 중 가장 가까운 node 선택
3. 그 node 위치로 먼저 이동
4. 그 node를 `startNode`로 세션에 저장하고 recording 시작

즉 지금 `RecordJob`은:

- "현재 좌표계가 확정된 상태에서"
- "근처 시작 node를 기준으로"
- user click를 기록하는 작업이다

내부 recording은 `WaypointRecorder`가 맡는다. 현재 recorder는:

- session의 `startNodeId`
- 각 segment의 `baseGobId`
- 각 segment의 시작/끝 gob 정보
- portal click 뒤 아직 반대편 portal gob가 확정되지 않은 `pendingPortalTransition`

을 들고 있다.

문 전환 처리 규칙:

- portal click 시점에는 진입 portal gob와 `resname`만 확정한다
- 맵 전환 직후에는 gob 로딩이 불완전할 수 있으므로 반대편 portal을 바로 찾지 않는다
- 다음 point 입력 시점 또는 `StopRecordJob` 종료 시점에 반대편 portal gob를 찾는다
- 찾을 때는 현재 맵의 모든 gob 중 `WaypointPortal` 사전에서 대응되는 `resname` 후보를 추리고, 그 중 가장 가까운 gob를 사용한다
- 현재 사전은 다음 pair를 포함한다
  - `gfx/terobjs/arch/stonehut` <-> `gfx/terobjs/arch/stonehut-door`
  - `gfx/terobjs/burrow` <-> `gfx/tiles/ridges/caveout`
  - `gfx/tiles/ridges/cavein2` <-> `gfx/tiles/ridges/caveout`

즉 현재 recorder는 portal transition을 단순 boolean이 아니라:

- 문 앞 gob와 `resname`
- 아직 확정되지 않은 반대편 portal gob
- 새 segment의 시작 gob

까지 포함하는 작은 상태 기계로 동작한다.

recorder 상태 타입도 별도 model로 분리돼 있다.

- `RecordingSession`
- `RecordingSegment`
- `RecordingPoint`
- `PendingPortalTransition`

### StopRecordJob

`StopRecordJob`은 단순 중단이 아니라 저장 절차를 수행한다.

현재 흐름:

1. active recording 종료
2. 끝 node에 연결할 gob 선택 요청
3. 선택한 gob가 이미 `wp_node`에 연결돼 있으면 그 node 재사용
4. 아니면 area chat으로 node 이름 입력받아 새 `wp_node` 생성
5. `WaypointEdgeWriter.save(...)`로 `wp_edge / wp_segment / wp_point` 저장
6. 성공 시 끝 gob 기준으로 다시 `WaypointManager.calibrate(gob)`

### NavigateJob

현재 `NavigateJob`은 새 schema 기준으로 아직 미구현이다.

## 실패 처리 원칙

현재 LMI는 `LMIException`의 `reason`으로 제어 흐름을 표현한다.

- `ER_INTERRUPTED`는 어떤 계층에서도 삼키지 않는다.
- 사용자 중단, 스레드 interrupt, 취소 계열은 항상 상위로 전파한다.
- 업무상 예상 가능한 실패만 선택적으로 `false`나 분기 로직으로 처리한다.

## 설계 원칙

- `agent`의 Java package 구조와 메뉴 폴더 구조는 가능한 한 일치시키는 편이 좋다.
- `lmi`는 실행 인프라, `agent`는 사용자 기능으로 구분한다.
- Haven 엔진 수정은 `// lmi start`와 `// lmi end` 범위 안에서만 다루는 것이 기본 원칙이다.
- 배포 기준은 JAR이며, discovery도 JAR 기준으로 설계하는 것이 맞다.

## 중요한 파일

- `src/lmi/Agent.java`
  - JobRequest 실행, push/enqueue 스케줄링, stop/interruption
- `src/lmi/AgentRegistry.java`
  - `agent/**` recursive scan, Job/Effect/폴더 메타데이터 등록
- `src/lmi/AgentManager.java`
  - 콘솔 진입점에서 Job 실행 관리
- `src/lmi/MenuGridProxy.java`
  - registry 기반 메뉴 주입과 메타데이터 표시
- `src/lmi/Hook.java`
  - Haven 이벤트를 LMI 실행 경로로 연결
- `src/lmi/WaitManager.java`
  - ACK/응답 타이밍 동기화
- `src/lmi/Api.java`
  - Job에서 직접 사용하는 고수준 자동화 API
- `src/lmi/AppContext.java`
  - Haven 참조, UI 접근 함수, IMeter lazy cache, session/widget reset 정책을 제공하는 전역 접근점
- `src/lmi/AtomicAction.java`
  - 내부 최소 실행 단위를 모은 원자 동작 계층
- `src/lmi/ChatInputManager.java`
  - area chat 입력 대기
- `src/lmi/waypoint/WaypointDatabase.java`
  - waypoint DB schema와 조회/생성 API
- `src/lmi/waypoint/WaypointManager.java`
  - calibration gob와 nearby node/gob/point 캐시 관리
- `src/lmi/waypoint/WaypointRecorder.java`
  - recording session, segment, point, pending portal transition 수집
- `src/lmi/waypoint/WaypointPortal.java`
  - portal resname pair 사전과 반대편 portal gob 탐색 helper
- `src/lmi/waypoint/WaypointEdgeWriter.java`
  - `RecordingSession`을 `wp_edge / wp_segment / wp_point`로 저장하는 writer
- `src/lmi/waypoint/SegmentResolver.java`
  - segment의 시작/끝 gob를 보고 `gob_graph`를 해석하는 resolver
- `src/lmi/waypoint/GobGraphMerger.java`
  - 서로 다른 `gob_graph`를 병합하고 virtual coordinate를 평행이동하는 merger

## 파일 인덱스

```text
src/
  lmi/
    Agent.java: JobRequest를 push/enqueue 정책으로 실행하는 에이전트 런타임
    AgentConfig.java: 에이전트 drive 설정을 properties 파일로 저장하고 읽는 설정 저장소
    AgentContext.java: Job 실행 중 누적해서 들고 다닐 상태를 담는 경량 컨텍스트
    AgentManager.java: Job 탐색, 생성, 도움말 출력, 실행 진입점을 관리하는 등록기
    AgentRegistry.java: JAR 안의 `agent/**`를 스캔해 Job, Effect, 폴더 메타데이터를 등록하는 공통 레지스트리
    Api.java: Job이 사용하는 고수준 자동화 API를 제공하는 퍼사드
    AppContext.java: Haven 참조, UI 접근 함수, IMeter lazy cache, session/widget reset 정책을 제공하는 LMI 전역 접근점
    Array.java: Swift 스타일 편의 메서드를 덧붙인 ArrayList 래퍼
    AtomicAction.java: 더 쪼개지지 않는 내부 원자 동작 계층
    ChatInputManager.java: area chat 입력을 가로채고 대기하는 상태 관리자
    ClickManager.java: Gob 클릭과 영역 선택 같은 사용자 입력 대기를 관리하는 상태 관리자
    CommandHandler.java: 콘솔 명령 `a`를 등록하고 LMI 초기화를 시작하는 진입점
    Constant.java: 메시지, 타임아웃, 리소스명, waypoint direction 등 공용 상수를 모아둔 정의 파일
    FlowerMenuHandler.java: 플라워 메뉴 열기, 선택, 진행 대기를 묶어 처리하는 조정자
    Hook.java: Haven 엔진 훅에서 LMI 런타임으로 이벤트를 전달하는 연결 지점
    Interaction.java: `wdgmsg()` 호출을 정리해 서버 상호작용을 일관되게 보내는 래퍼
    LMIException.java: LMI 제어 흐름과 실패 이유를 담는 런타임 예외
    MenuGridProxy.java: AgentRegistry를 바탕으로 LMI 메뉴 구조와 메타데이터를 UI에 주입하는 프록시
    Pathfinder.java: 주변 장애물을 바탕으로 경로를 찾고 이동을 수행하는 경로 탐색기
    ProgressManager.java: 진행 바 생성과 종료를 감시해 작업 완료를 기다리는 상태 관리자
    Rect.java: 영역 선택과 배치 계산에 사용하는 직사각형 좌표 유틸리티
    Self.java: 플레이어 자신 상태와 IMeter 기반 수치 조회를 모아둔 접근 계층
    Util.java: 디버그 출력, 리플렉션 보조, 문자열 처리 등 잡다한 공용 유틸리티
    WaitManager.java: 송신 seq와 ACK를 추적해 서버 응답 타이밍을 동기화하는 대기 관리자
    behavior/
      AlignLogBehavior.java: 통나무 정렬 절차를 AtomicAction 조합으로 표현한 행동 시퀀스
    waypoint/
      WaypointDatabase.java: `gob_* / wp_*` schema 생성과 waypoint DB 조회/생성 API
      WaypointManager.java: calibration gob와 nearby node/gob/point 복원 캐시를 관리
      WaypointRecorder.java: recording session과 portal transition 상태를 메모리에서 수집
      WaypointPortal.java: portal resname pair 사전과 반대편 portal gob 탐색 규칙을 제공
      WaypointEdgeWriter.java: recording session을 `wp_edge / wp_segment / wp_point`로 저장하는 writer
      SegmentResolver.java: segment의 시작/끝 gob를 보고 target `gob_graph`를 정하는 resolver
      GobGraphMerger.java: 두 `gob_graph`를 병합하며 `vir_x/vir_y`를 평행이동하는 merger
      model/
        CreateRootNodeResult.java: root node 생성 결과
        CreateNodeResult.java: 일반 node 생성 결과
        SaveEdgeResult.java: edge 저장 결과
        GobNodeRecord.java: `gob_node` row 모델
        WpNodeRecord.java: `wp_node` row 모델
        WpPointRecord.java: `wp_point` row 모델
        RecordingSession.java: waypoint recording session 상태
        RecordingSegment.java: recording 중 하나의 segment 상태
        RecordingPoint.java: recording 중 하나의 click point 상태
        PendingPortalTransition.java: 아직 반대편 portal gob가 확정되지 않은 전이 상태
      runtime/
        ResolvedNode.java: 현재 world 좌표로 복원된 nearby `wp_node`
        ResolvedGob.java: 현재 world 좌표로 복원된 nearby `gob_node`
        ResolvedPoint.java: 현재 world 좌표로 복원된 nearby `wp_point`
  agent/
    effect/
      ToggleSleepEffect.java: Agent sleep 상태를 즉시 토글하는 effect
    debug/
      DescribeSelfEffect.java: 플레이어 상태와 isMoving을 출력하는 effect
      DescribeAgentStackEffect.java: AgentMind 스레드 stack trace를 출력하는 effect
    tool/
      waypoint/
        CreateNodeJob.java: 새 root waypoint node를 생성하고 즉시 calibrate 하는 job
        CalibrateWaypointJob.java: 등록된 gob를 클릭해 waypoint 좌표계를 calibrate 하는 job
        RecordJob.java: nearest start node로 이동 후 waypoint recording을 시작하는 job
        StopRecordJob.java: end node를 확정하고 edge/segment/point를 저장하는 job
        NavigateJob.java: 새 schema 기준으로 아직 미구현인 navigate job
```

## 보류 중인 것

- `NavigateJob` 구현
- `Task`/`Behavior` 전면 재정리
- `MenuGridProxy`의 추가 분해
- `AppContext` 명칭 재검토

현재 핵심은 waypoint graph / navigation 골격을 실제 runtime에서 검증하면서 다듬는 일이다.
