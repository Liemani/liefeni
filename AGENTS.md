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

area chat 입력 대기는 `ChatInputMonitor`가 맡는다.

현재 구조:

- `Hook.willMsgSend(...)`가 `ChatUI.MultiChat`의 `"msg"` 전송을 가로챈다
- `ChatInputMonitor.waitAreaChat()`는 다음 area chat 입력 문자열이 들어올 때까지 block 한다

이 메커니즘은 현재 `CreateNodeJob`, `StopRecordJob`의 이름 입력 대기에 사용된다.

## Waypoint

Waypoint는 이제 `gob_id` 불변성을 가정하지 않고, graph / anchor / portal / virtual coordinate 중심으로 동작한다.

현재 코드 구조는 책임 기준으로 다음 패키지로 나뉜다.

- `lmi.waypoint`
  - facade / bootstrap / overlay / debug
- `lmi.waypoint.persistence`
  - DB facade, DB executor, sync queue, low-level SQL helper
- `lmi.waypoint.runtime`
  - runtime authoritative cache, calibration state, scene build/result
- `lmi.waypoint.calibration`
  - area / portal calibration, portal resolver
- `lmi.waypoint.recording`
  - raw recording, segment planning, edge save, segment resolution

현재 핵심 테이블:

- `wp_graph`
- `wp_anchor`
- `wp_portal`
- `wp_portal_pair`
- `wp_node`
- `wp_edge`
- `wp_segment`
- `wp_point`

핵심 규칙:

- 첫 graph 생성 시 사용자가 area select 한 anchor tile의 시작 world 좌표가 virtual `(0, 0)`이 된다
- `wp_anchor`는 graph별 calibration 기준 virtual 좌표를 가진다
- `wp_portal_pair`는 무방향 portal pair를 표현하며 `portal0_id < portal1_id`를 유지한다
- `wp_node.name`은 중복 허용
- `wp_edge.direction`은 다음 상수를 사용한다
  - `0 = blocked`
  - `1 = forward`
  - `2 = backward`
  - `3 = bidirectional`
- `wp_segment.graph_id`는 해당 segment의 point가 속한 graph를 뜻한다
- `wp_segment.step`, `wp_point.step`은 순차 인덱스다
- `wp_point.vir_x`, `wp_point.vir_y`는 graph 기준 virtual coordinate 절대값이다
- `wp_point`는 `gob_id`를 저장하지 않는다

### Bootstrap

초기 waypoint 준비는 다음처럼 나뉜다.

- `LmiBootstrap`
  - LMI 전역 bootstrap 진입점
  - `RuntimeEventManager.init()`
  - `WaypointBootstrap.init()`
- `WaypointBootstrap`
  - `WaypointDbExecutor.init()`
  - anchor async preload 시작
  - completion 시 anchor cache를 runtime context에 반영

즉 bootstrap 시점부터 waypoint는 DB worker thread와 runtime cache를 같이 준비한다.

### WaypointRuntimeContext / WaypointDbExecutor / WaypointSyncManager

현재 waypoint는 memory-first 2-context 구조로 가는 중이다.

- `WaypointRuntimeContext`
  - runtime authoritative state
  - `WaypointCalibrationState`
  - `WaypointScene`
  - `ManagedObjectContext`
  - anchor / portal / node / edge / segment / point cache
  - 각 cache의 `loaded/loading` 상태
- `WaypointDbExecutor`
  - waypoint DB 전용 async worker thread
  - read / write request를 queue로 처리
- `WaypointSyncManager`
  - DB completion을 runtime 쪽으로 되돌리는 중앙 queue
  - 현재 `Hook.mapViewDidDraw(...)`에서 drain 한다

즉 main/render thread는 DB를 직접 기다리지 않고, DB completion이 나중에 runtime cache를 갱신하는 구조다.

### WaypointStore

현재 waypoint 외부 코드가 붙는 public DB/store 진입점은 `WaypointStore`다.

현재 facade 역할:

- synchronous lookup
  - `findNode(...)`
  - `findNodeByGraphAndVir(...)`
- async read
  - `loadAnchorsAsync(...)`
  - `loadPortalsByGraphAsync(...)`
  - `findCounterpartPortalsAsync(...)`
  - `loadNodesByGraphAsync(...)`
  - `loadEdgesByNodeAsync(...)`
  - `loadSegmentsByEdgeAsync(...)`
  - `loadPointsBySegmentAsync(...)`
- async write
  - `createAnchorAsync(...)`
  - `updateAnchorAsync(...)`
  - `createNodeAsync(...)`

구조상 `WaypointStore`는:

- waypoint SQLite connection 하나를 프로그램 lifetime 동안 소유한다
- 외부 코드가 붙는 facade다
- object 계층(`WpAnchor`, `WpPortal`, `WpNode`, `WpPoint`)으로 결과를 변환한다
- low-level write bridge는 `WaypointWriteBridge`로 분리됐다

즉 현재 `WaypointStore`는 public facade이고, 실질적인 async SQL 실행은 `WaypointDbExecutor`, 저수준 SQL helper는 `WaypointDatabase`가 맡는다.

### WaypointDatabase

현재 `WaypointDatabase`는 위 최종 스키마를 기준으로 동작하는 low-level DB helper 계층이다.

역할:

- schema 생성
- connection을 인자로 받는 query / insert helper
- row 타입(`WpAnchorRecord`, `WpPortalRecord`, `WpNodeRecord`, `WpPointRecord`) 기반 SQL 해석

즉 현재 `WaypointDatabase`는 외부 진입점이 아니라, `WaypointStore` 아래에서만 쓰이는 package-private SQL helper다.

### WaypointEdgeWriter / SegmentResolver

waypoint 저장 경로는 지금 세 계층으로 분리되어 있다.

- `WaypointEdgeWriter`
  - `RecordingSession`을 받아 `wp_edge`, `wp_segment`, `wp_point`를 저장하는 orchestration 담당
- `SegmentResolver`
  - 각 segment의 `baseGraphId`, `baseVirX`, `baseVirY`를 기준으로 segment virtual 좌표계를 해석한다

즉 현재 저장 경로는:

- `WaypointEdgeWriter`
- `SegmentResolver`

로 나뉘어 있고, 외부 진입은 `WaypointStore`, 저수준 DB helper는 `WaypointDatabase`가 제공하는 형태다.

### WaypointCalibrationState / WaypointCalibrator / WaypointSceneBuilder

waypoint runtime은 이제 다음 세 클래스로 나뉜다.

- `WaypointCalibrationState`
  - anchor 존재 여부
  - calibration graph id
  - calibration vir
  - calibration world
  - calibration portal gob
  를 보관하는 작은 상태 객체다
- `WaypointCalibrator`
  - `calibrateFromAnchorArea(...)`
  - `calibrateFromPortal(...)`
  를 담당한다
- `WaypointSceneBuilder`
  - 현재 calibration state와 player world 위치를 받아 `WaypointScene`을 구성한다
  - `ResolvedNode`, `ResolvedPoint`, `ResolvedLine`을 조립한다
  - 필요한 cache가 비어 있으면 preload 요청만 걸고 이번 build에서는 비운 scene 또는 부분 scene을 반환한다

### WaypointManager

현재 `WaypointManager`는 waypoint facade이자 orchestration 계층이다.

직접 보유하는 핵심 상태는:

- `WaypointRuntimeContext runtimeContext`
- `WaypointCalibrationState calibration`

현재 책임:

- `calibrate(Rect area)`: area-select tile 기준으로 graph를 calibration
- `calibrate(Gob gob)`: portal counterpart 기준으로 다른 graph로 recalibration
- `refresh()`: 현재 player 위치 기준 scene 재구성
- `requestRefresh()`: async preload completion이 scene rebuild를 요청할 때 사용
- `processRefreshRequests()`: bounds 변화나 pending refresh 요청이 있으면 scene을 다시 구성
- `nearestNode()`
- `nearbyNodes()`
- `nearbyPoints()`

cache 관련 책임:

- anchor / portal / node / edge / segment / point cache accessor
- `preload*()`를 통한 async read request enqueue
- 각 cache의 `loaded/loading` 상태를 기준으로 중복 preload를 coalesce

scene 정책:

- memory load 범위는 player 기준 `7 x 7 cut`
- render 범위는 player 기준 `5 x 5 cut`
- cut 계산은 world cut이 아니라 virtual cut 기준으로 한다
- calibration anchor의 world origin은 anchor tile이 속한 `1 grid = 100 tile`의 시작점이다
- `drawable`과 `hidden`은 별도 collection으로 관리한다
- `wp_node`, `wp_edge`는 graph 단위로 memory에 유지한다
- `wp_segment`, `wp_point`는 현재 7x7 cut resident 집합 기준으로 유지한다

복원 결과 타입은 더 이상 `WaypointManager` 내부 클래스가 아니라 별도 runtime 타입으로 분리돼 있다.

- `ResolvedNode`
- `ResolvedPoint`
- `WaypointScene`
- `WaypointCutBounds`

### WaypointOverlay

현재 waypoint 시각화는 별도 widget이 아니라 `MapView.draw()` 훅 기반 world overlay다.

- `Hook.mapViewDidDraw(...)`
- `lmi.draw.LmiOverlay.draw(mapView, g)`
- `WaypointOverlay`는 그 registry에 등록되는 `MapOverlay` 구현체다
- `CurrentCutDebugOverlay`도 같은 registry를 통해 draw 된다

핵심 규칙:

- drawable collection만 그린다
- `Coord` world (`1024` 기준)를 Haven `Coord2d` world (`11` 기준)로 변환한 뒤 `MapView.screenxf(...)`로 projection 한다
- test overlay도 같은 draw 경로에서 토글한다

### WaypointPortal / WaypointPortalResolver

portal 관련 책임은 둘로 나뉜다.

- `WaypointPortal`
  - portal resname 판정
  - 기본 counterpart resname 규칙
- `WaypointPortalResolver`
  - runtime에서 실제 counterpart portal gob를 찾는다
  - portal recalibration용 nearest portal gob를 찾는다

### CalibrateWaypointJob

`CalibrateWaypointJob`은 area select 기반 calibration job이다.

흐름:

1. anchor cache가 load 되었는지 확인
2. 사용자에게 anchor tile area select 요청
3. `WaypointManager.calibrate(area)` 호출
4. 성공 시 현재 graph 좌표계가 calibrated 상태가 된다
5. nearby node / point 수를 출력한다

### CreateNodeJob

`CreateNodeJob`은 anchor가 없으면 먼저 anchor를 만들고 calibration 한 뒤, 현재 위치에 node를 생성한다.

흐름:

1. anchor cache가 load 되었는지 확인
2. anchor가 없으면:
   - anchor tile area 선택
   - area chat으로 node 이름 입력
   - singleton `ManagedWpAnchor.ensurePresent()`
   - `ManagedObjectContext.save()`
   - completion에서 `WaypointManager.calibrate(area)`
   - 이어서 `WaypointStore.createNodeAsync(...)`
3. anchor가 이미 있으면:
   - calibrated 상태 확인
   - area chat으로 node 이름 입력
   - 현재 calibration graph + 현재 위치 `vir` 기준으로 `WaypointStore.createNodeAsync(...)`
4. node create completion에서 새 `WpNode`를 runtime cache에 append하고 `WaypointManager.refresh()`

즉 현재 정식 create path는 async write + runtime refresh completion 구조다.

### RecordJob

`RecordJob`은 다음 조건에서만 시작된다.

- `WaypointManager.isCalibrated()`가 `true`

시작 흐름:

1. 사용자에게 anchor tile area select 요청
2. `WaypointManager.refresh()`
3. nearby `wp_node` 중 가장 가까운 node 선택
4. 그 node 위치로 먼저 이동
5. 그 node를 `startNode`로 세션에 저장하고 recording 시작

즉 지금 `RecordJob`은:

- "현재 좌표계가 확정된 상태에서"
- "근처 시작 node를 기준으로"
- user click를 기록하는 작업이다

내부 recording은 `WaypointRecorder`가 맡는다. 현재 recorder는:

- session의 `startNodeId`
- raw `RecordingClick` sequence

즉 recorder 자체는 raw input recorder이고, portal / segment 해석은 별도 planner가 맡는다.

recorder 상태 타입도 별도 model로 분리돼 있다.

- `RecordingSession`
- `RecordingSegment`
- `RecordingClick`
- `PendingPortalTransition`

`RecordingSessionPlanner`는 저장 직전에:

- portal click을 `isPortal`로 마킹하고
- raw click sequence를 segment 구조로 나누고
- portal transition이 있는 다음 segment의 `baseGraphId/baseVir/baseWorld`를 채운다

### StopRecordJob

`StopRecordJob`은 단순 중단이 아니라 저장 절차를 수행한다.

현재 흐름:

1. active recording 종료
2. 현재 calibration graph + 현재 위치 `vir` 기준으로 end node 재사용 여부 확인
3. 없으면 area chat으로 node 이름 입력받고 `WaypointStore.createNodeAsync(...)`로 새 `wp_node` 생성
4. 새 node가 생성되면 runtime cache에 즉시 append
5. `WaypointEdgeWriter.saveAsync(...)`로 `wp_edge / wp_segment / wp_point` 저장
6. 저장 성공 시 edge / segment / point도 runtime cache에 즉시 append하고 `WaypointManager.refresh()`

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
- `src/lmi/ChatInputMonitor.java`
  - area chat 입력 대기
- `src/lmi/waypoint/persistence/WaypointStore.java`
  - waypoint 도메인이 사용하는 public store facade
  - shared SQLite connection owner
  - async read/write facade
- `src/lmi/waypoint/persistence/WaypointDatabase.java`
  - waypoint DB schema와 low-level query/insert helper
- `src/lmi/waypoint/runtime/WaypointRuntimeContext.java`
  - runtime authoritative cache와 loaded/loading 상태를 보관
- `src/lmi/waypoint/persistence/WaypointDbExecutor.java`
  - waypoint DB 전용 async worker thread
- `src/lmi/waypoint/persistence/WaypointSyncManager.java`
  - DB completion을 runtime 쪽으로 되돌리는 sync queue
- `src/lmi/waypoint/runtime/WaypointCalibrationState.java`
  - anchor 존재와 calibration graph/world/vir 상태를 보관하는 runtime state
- `src/lmi/waypoint/calibration/WaypointCalibrator.java`
  - area / portal 기준 calibration 수행 계층
- `src/lmi/waypoint/runtime/WaypointSceneBuilder.java`
  - calibration state와 player 위치를 받아 scene을 구성하는 builder
- `src/lmi/waypoint/WaypointManager.java`
  - waypoint facade이자 calibration / scene refresh orchestration 계층
- `src/lmi/waypoint/WaypointOverlay.java`
  - `MapView.draw()` 훅에서 drawable waypoint scene을 실제 화면에 그리는 overlay
- `src/lmi/waypoint/recording/WaypointRecorder.java`
  - raw recording session과 click sequence를 메모리에서 수집
- `src/lmi/waypoint/recording/RecordingSessionPlanner.java`
  - raw recording session을 portal-aware segment 구조로 재해석하는 planner
- `src/lmi/waypoint/calibration/WaypointPortal.java`
  - portal resname 판정과 기본 counterpart 규칙 helper
- `src/lmi/waypoint/calibration/WaypointPortalResolver.java`
  - runtime에서 counterpart / recalibration portal gob를 찾는 resolver
- `src/lmi/waypoint/recording/WaypointEdgeWriter.java`
  - `RecordingSession`을 `wp_edge / wp_segment / wp_point`로 저장하는 writer
  - async save entry도 제공
- `src/lmi/waypoint/recording/SegmentResolver.java`
  - segment의 `baseGraphId/baseVir/baseWorld`를 기준으로 저장 좌표계를 해석하는 resolver
- `src/lmi/waypoint/persistence/WaypointWriteBridge.java`
  - low-level waypoint write bridge

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
    ChatInputMonitor.java: area chat 입력을 가로채고 대기하는 상태 관리자
    ClickManager.java: Gob 클릭과 영역 선택 같은 사용자 입력 대기를 관리하는 상태 관리자
    CommandHandler.java: 콘솔 명령 `a`를 등록하고 LMI 초기화를 시작하는 진입점
    Constant.java: 메시지, 타임아웃, 리소스명, waypoint direction 등 공용 상수를 모아둔 정의 파일
    FlowerMenuHandler.java: 플라워 메뉴 열기, 선택, 진행 대기를 묶어 처리하는 조정자
    Hook.java: Haven 엔진 훅에서 LMI 런타임으로 이벤트를 전달하는 연결 지점
    Interaction.java: `wdgmsg()` 호출을 정리해 서버 상호작용을 일관되게 보내는 래퍼
    LmiBootstrap.java: LMI subsystem bootstrap을 한 곳에서 수행하는 idempotent 초기화 진입점
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
      WaypointBootstrap.java: waypoint DB warm-up과 anchor presence sync를 수행하는 bootstrap 계층
      WaypointManager.java: waypoint facade이자 calibration / scene refresh orchestration 계층
      WaypointOverlay.java: `MapView.draw()` 훅에서 drawable waypoint scene을 world overlay로 그린다
      WaypointDebug.java: waypoint runtime 상태를 사람이 읽기 좋은 텍스트로 요약하는 debug helper
      persistence/
        WaypointStore.java: waypoint 도메인이 사용하는 public facade이자 async read/write facade
        WaypointDatabase.java: `wp_*` schema 생성과 connection-based low-level DB helper
        WaypointDbExecutor.java: waypoint DB 전용 async worker thread
        WaypointSyncManager.java: DB completion을 runtime 쪽으로 되돌리는 sync queue
        WaypointWriteBridge.java: low-level waypoint write bridge
        WaypointRequest.java: DB executor가 처리하는 request 공통 계약
        WaypointReadRequest.java: async read request 계약
        WaypointWriteRequest.java: async write request 계약
        WaypointResult.java: async completion result marker
        WaypointResultHandler.java: async completion callback 계약
        EmptyWaypointResult.java: payload 없는 write completion result
      runtime/
        WaypointRuntimeContext.java: runtime authoritative cache와 loaded/loading 상태를 보관
        WaypointCalibrationState.java: anchor 존재와 calibration graph/world/vir 상태를 보관하는 runtime state
        WaypointSceneBuilder.java: calibration state와 player 위치를 받아 waypoint scene을 구성하는 builder
        ResolvedNode.java: 현재 world 좌표로 복원된 nearby `wp_node`
        ResolvedPoint.java: 현재 world 좌표로 복원된 nearby `wp_point`
        ResolvedLine.java: drawable node / point 사이를 잇는 runtime line
        WaypointScene.java: drawable / hidden waypoint scene collection
        WaypointCutBounds.java: player 기준 7x7 load / 5x5 render cut bounds
      calibration/
        WaypointCalibrator.java: area / portal 기준 calibration 수행 계층
        WaypointPortal.java: portal resname 판정과 기본 counterpart 규칙을 제공
        WaypointPortalResolver.java: runtime에서 counterpart / recalibration portal gob를 찾는 resolver
      recording/
        WaypointRecorder.java: raw recording session과 click sequence를 메모리에서 수집
        RecordingSessionPlanner.java: raw recording session을 portal-aware segment 구조로 재해석하는 planner
        WaypointEdgeWriter.java: recording session을 `wp_edge / wp_segment / wp_point`로 저장하는 writer
        SegmentResolver.java: segment의 `baseGraphId/baseVir/baseWorld`를 기준으로 저장 좌표계를 해석하는 resolver
        SegmentResolution.java: segment 저장 해석 결과 값 객체
      model/
        CreateAnchorResult.java: anchor 생성 결과
        CreateNodeResult.java: 일반 node 생성 결과
        SaveEdgeResult.java: edge 저장 결과
        RecordingSession.java: waypoint recording session 상태
        RecordingSegment.java: recording 중 하나의 segment 상태
        RecordingClick.java: recording 중 하나의 click 상태
        PendingPortalTransition.java: 아직 반대편 portal gob가 확정되지 않은 전이 상태
      db/
        WpAnchorRecord.java: `wp_anchor` row 모델
        WpPortalRecord.java: `wp_portal` row 모델
        WpNodeRecord.java: `wp_node` row 모델
        WpPointRecord.java: `wp_point` row 모델
  agent/
    effect/
      ToggleSleepEffect.java: Agent sleep 상태를 즉시 토글하는 effect
    debug/
      DescribeSelfEffect.java: 플레이어 상태와 isMoving을 출력하는 effect
      DescribeAgentStackEffect.java: AgentMind 스레드 stack trace를 출력하는 effect
    tool/
      waypoint/
        CreateNodeJob.java: anchor가 없으면 먼저 anchor를 만들고 calibration 한 뒤 현재 위치에 node를 async로 생성하는 job
        CalibrateWaypointJob.java: area-select anchor tile 기준으로 waypoint 좌표계를 calibrate 하는 job
        RecordJob.java: nearest start node로 이동 후 waypoint recording을 시작하는 job
        StopRecordJob.java: end node를 확정하고 end node 생성과 edge 저장을 async로 수행하는 job
        NavigateJob.java: 새 schema 기준으로 아직 미구현인 navigate job
```

## 보류 중인 것

- `NavigateJob` 구현
- `Task`/`Behavior` 전면 재정리
- `MenuGridProxy`의 추가 분해
- `AppContext` 명칭 재검토

현재 핵심은 waypoint graph / navigation 골격을 실제 runtime에서 검증하면서 다듬는 일이다.
