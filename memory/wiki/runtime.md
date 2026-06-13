# LMI Runtime

이 문서는 Haven & Hearth 클라이언트 위에 얹는 자동화 런타임 `lmi`와, 그 위에서 실행되는 사용자 기능 패키지 `agent`의 현재 구조를 설명한다.
현재 중요한 것은 "무엇을 자동화하느냐"보다 "그 자동화가 어떤 런타임 계약 위에서 안전하게 돌아가느냐"다.

## 구조 개요

### 계층

- `haven`: 원본 게임 클라이언트와 엔진 코드
- `lmi`: 자동화 런타임, 동기화, 훅, UI 주입, lifecycle, waypoint 인프라
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

## Lifecycle

LMI 초기화는 이제 수명 기준으로 나뉜다.

- `process`
- `session`
- `world`
- `widget`

현재 진입점은 `LmiLifecycle`이 가진다.

- `LmiLifecycle.initProcess()`
  - process-level 1회 초기화
- `LmiLifecycle.enterSession(Session)`
  - 로그인 후 session-level subsystem 준비
- `LmiLifecycle.enterWorld(MapView)`
  - 월드 진입 시 world-dependent polling과 refresh 시작
- `LmiLifecycle.setRootWidget(...)`
- `LmiLifecycle.setGameUI(...)`
- `LmiLifecycle.setMenuGrid(...)`
- `LmiLifecycle.setMapView(...)`
  - widget readiness 동기화용 참조 반영
- `LmiLifecycle.leaveWorld()`
  - world-dependent runtime 정리
- `LmiLifecycle.leaveSession(Session)`
  - session-level 상태 정리

현재 Haven 쪽 lifecycle 트리거는 다음과 같다.

- `MainFrame`
  - `LmiLifecycle.initProcess()`
- `Session`
  - `LmiLifecycle.enterSession(this)`
- `MapView` 생성
  - `LmiLifecycle.enterWorld(this)`
- `MapView.dispose()`
  - `LmiLifecycle.leaveWorld()`
- `RemoteUI.run(...).finally`
  - `LmiLifecycle.leaveSession(sess)`

즉 lifecycle 소유권은 Haven concrete event에서 `LmiLifecycle`로 직접 넘어가고, `AppContext`는 참조 보관 쪽으로 줄어들었다.

## 전역 접근점

현재 `AppContext`는 이름은 그대로 유지하고 있지만, 실제 역할은 "LMI 전역 접근점"에 가깝다.

- Haven에서 전달받은 주요 참조를 보관한다.
- 자주 쓰는 UI 접근은 `AppContext.menuGrid()`, `AppContext.window()` 같은 accessor로 제공한다.
- 기존 `WidgetManager`가 맡던 접근 함수들은 `AppContext`로 흡수되었다.
- `IMeter`는 목록으로 보관하고, 체력/스태미나/에너지는 lazy cache로 해석한다.
- 내부적으로 `process-level`, `session-level`, `widget-cache` 수명을 구분한다.
- setter들은 이제 Haven 참조를 보관하는 역할에 집중한다.

세션/위젯 무효화 정책은 다음과 같다.

- session-level clear는 `AppContext.resetSessionState()`
- widget cache clear는 `AppContext.resetWidgetCache()`

즉, 생성과 수명 전환은 `LmiLifecycle`, 참조 보관과 실제 clear는 `AppContext`로 분리된다.

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

현재 예시:

- `agent.effect.ToggleSleepEffect`
- `agent.debug.DescribeSelfEffect`
- `agent.debug.DescribeAgentStackEffect`

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

핵심 원칙:

- `Gob` 객체 전체보다는 `gobId`, `gobPosition` 같은 필요한 값만 인자로 받는다.
- `go(Coord)`는 `Self.gob().waitMove(coord)`를 바로 호출하지 않고, 내부에서 click / wait / 도착 판정을 직접 수행한다.
- 공간 전환성 click은 `enter(...)`처럼 별도 원자 동작으로 둔다.

## Chat 입력 대기

area chat 입력 대기는 `ChatInputMonitor`가 맡는다.

현재 구조:

- `Hook.willMsgSend(...)`가 `ChatUI.MultiChat`의 `"msg"` 전송을 가로챈다
- `ChatInputMonitor.waitAreaChat()`는 다음 area chat 입력 문자열이 들어올 때까지 block 한다

이 메커니즘은 현재 `CreateNodeJob`, `StopRecordJob`의 이름 입력 대기에 사용된다.

## Waypoint

Waypoint는 이제 `gob_id` 불변성을 가정하지 않고, `map_segment` / `map_grid` / `local_x + local_y` 중심으로 동작한다.

현재 코드 구조는 책임 기준으로 다음 패키지로 나뉜다.

- `lmi.waypoint`
  - facade / bootstrap / overlay / debug
- `lmi.waypoint.persistence`
  - DB facade, DB executor, sync queue, low-level SQL helper
- `lmi.waypoint.runtime`
  - runtime authoritative cache, grid bounds, scene build/result
- `lmi.waypoint.recording`
  - raw recording, portal-aware segment planning, edge save, segment resolution

현재 핵심 테이블:

- `map_segment`
- `map_grid`
- `wp_graph`
- `wp_node`
- `wp_edge`
- `wp_segment`
- `wp_point`

핵심 규칙:

- `map_segment.id == Haven MapFile.Segment.id`
- `map_grid.id`는 waypoint 내부 FK용 id다
- `map_grid.haven_id == Haven MCache.Grid.id`
- `map_grid.local_x`, `map_grid.local_y`는 해당 grid origin의 world 좌표다
- `wp_node.grid_id`, `wp_segment.grid_id`, `wp_point.grid_id`는 `map_grid.id`를 참조한다
- `wp_node.local_x`, `wp_node.local_y`, `wp_point.local_x`, `wp_point.local_y`는 해당 grid origin 기준 local offset이다
- `wp_node` 위치는 전역 유일하다
  - `UNIQUE (grid_id, local_x, local_y)`
- `wp_edge.graph_id`는 topology load 경계를 뜻한다
- `wp_edge.direction`
  - `0 = blocked`
  - `1 = forward`
  - `2 = backward`
  - `3 = bidirectional`
- `wp_edge`는 canonical order를 유지한다
  - `node0_id < node1_id`
- `wp_segment`는 하나의 grid에만 속한다
- `wp_point.grid_id == wp_segment.grid_id`
- `wp_segment.step`, `wp_point.step`은 순차 인덱스다
- `wp_point.mouse_button`은 `1` 또는 `3`만 허용한다
- `wp_point`는 `gob_id`를 저장하지 않는다

Waypoint 세부 설계와 use case는 [waypoint.md](./waypoint.md)를 본다.

Haven minimap / map marker 저장 구조는 [map-icons.md](./map-icons.md)를 본다.

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
  - Haven 참조와 UI 접근 함수를 제공하는 전역 접근점
- `src/lmi/AtomicAction.java`
  - 내부 최소 실행 단위를 모은 원자 동작 계층
- `src/lmi/ChatInputMonitor.java`
  - area chat 입력 대기
- `src/lmi/LmiLifecycle.java`
  - process / session / world / widget lifecycle을 조정하는 진입점
- `src/lmi/waypoint/persistence/WaypointStore.java`
  - waypoint 도메인이 사용하는 public facade
- `src/lmi/waypoint/persistence/WaypointDatabase.java`
  - waypoint DB schema와 low-level query / insert helper
- `src/lmi/waypoint/runtime/WaypointGridResolver.java`
  - Haven `grid.id` / `MapFile.Segment.id`를 waypoint `map_grid.id`에 연결하는 helper
- `src/lmi/waypoint/runtime/WaypointRuntimeContext.java`
  - runtime authoritative cache와 loaded/loading 상태를 보관
- `src/lmi/waypoint/persistence/WaypointDbExecutor.java`
  - waypoint DB 전용 async worker thread
- `src/lmi/waypoint/persistence/WaypointSyncManager.java`
  - DB completion을 runtime 쪽으로 되돌리는 sync queue
- `src/lmi/waypoint/runtime/WaypointSceneBuilder.java`
  - current graph와 player grid bounds를 받아 scene을 구성하는 builder
- `src/lmi/waypoint/WaypointManager.java`
  - waypoint facade이자 graph / grid runtime orchestration 계층
- `src/lmi/waypoint/WaypointOverlay.java`
  - `MapView.draw()` 훅에서 drawable waypoint scene을 실제 화면에 그리는 overlay

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
    AppContext.java: Haven 참조와 UI 접근 함수를 제공하는 LMI 전역 접근점
    Array.java: Swift 스타일 편의 메서드를 덧붙인 ArrayList 래퍼
    AtomicAction.java: 더 쪼개지지 않는 내부 원자 동작 계층
    ChatInputMonitor.java: area chat 입력을 가로채고 대기하는 상태 관리자
    ClickManager.java: Gob 클릭과 영역 선택 같은 사용자 입력 대기를 관리하는 상태 관리자
    CommandHandler.java: 콘솔 명령 `a`를 등록하는 진입점
    Constant.java: 메시지, 타임아웃, 리소스명, waypoint direction 등 공용 상수를 모아둔 정의 파일
    FlowerMenuHandler.java: 플라워 메뉴 열기, 선택, 진행 대기를 묶어 처리하는 조정자
    Hook.java: 현재 Haven 엔진 훅에서 LMI 런타임으로 이벤트를 전달하는 연결 지점
    Interaction.java: `wdgmsg()` 호출을 정리해 서버 상호작용을 일관되게 보내는 래퍼
    LmiLifecycle.java: process / session / world / widget lifecycle을 조정하는 진입점
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
      WaypointBootstrap.java: waypoint DB bootstrap 진입점
      WaypointManager.java: waypoint facade이자 graph / grid runtime orchestration 계층
      WaypointOverlay.java: `MapView.draw()` 훅에서 drawable waypoint scene을 world overlay로 그린다
      WaypointDebug.java: waypoint runtime 상태를 사람이 읽기 좋은 텍스트로 요약하는 debug helper
      persistence/
        WaypointStore.java: waypoint 도메인이 사용하는 public facade이자 async read/write facade
        WaypointDatabase.java: `wp_*` schema 생성과 connection-based low-level DB helper
        WaypointDbExecutor.java: waypoint DB 전용 async worker thread
        WaypointSyncManager.java: DB completion을 runtime 쪽으로 되돌리는 sync queue
        WaypointWriteBridge.java: low-level waypoint write bridge
      runtime/
        WaypointGridResolver.java: Haven grid와 mapfile segment를 waypoint `map_grid.id`에 연결하는 helper
        WaypointRuntimeContext.java: runtime authoritative cache와 loaded/loading 상태를 보관
        WaypointSceneBuilder.java: current graph와 player grid bounds를 받아 waypoint scene을 구성하는 builder
        ResolvedNode.java: 현재 world 좌표로 복원된 nearby `wp_node`
        ResolvedPoint.java: 현재 world 좌표로 복원된 nearby `wp_point`
        ResolvedLine.java: drawable node / point 사이를 잇는 runtime line
        WaypointScene.java: drawable / hidden waypoint scene collection
        WaypointGridBounds.java: player 기준 3x3 load / render grid bounds
      recording/
        WaypointRecorder.java: raw recording session과 click sequence를 메모리에서 수집
        RecordingSessionPlanner.java: raw recording session을 portal-aware segment 구조로 재해석하는 planner
        WaypointPortal.java: portal resname 판정과 counterpart 규칙 helper
        WaypointPortalResolver.java: runtime에서 counterpart portal gob를 찾는 resolver
        WaypointEdgeWriter.java: recording session을 `wp_edge / wp_segment / wp_point`로 저장하는 writer
        SegmentResolver.java: segment의 `baseGraphId/baseGridId/baseLocal`를 기준으로 저장 좌표계를 해석하는 resolver
      model/
        CreateNodeResult.java: 일반 node 생성 결과
        SaveEdgeResult.java: edge 저장 결과
        RecordingSession.java: waypoint recording session 상태
        RecordingSegment.java: recording 중 하나의 segment 상태
        RecordingClick.java: recording 중 하나의 click 상태
```

## 보류 중인 것

- `NavigateJob` 구현
- portal transition을 DB-backed link 모델로 다시 올릴지 결정
- `Task` / `Behavior` 전면 재정리
- `MenuGridProxy`의 추가 분해
- `AppContext` 명칭 재검토

현재 핵심은 grid-local waypoint graph / navigation 골격을 실제 runtime에서 검증하면서 다듬는 일이다.
