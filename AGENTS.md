# LMI Working Context

이 저장소는 Haven & Hearth 클라이언트 위에 얹는 자동화 런타임 `LMI`와, 그 위에서 실행되는 사용자 기능 패키지 `agent`로 구성된다.
현재 개발 기준에서 중요한 것은 "무엇을 자동화하느냐"보다 "그 자동화가 어떤 런타임 계약 위에서 안전하게 돌아가느냐"다.

## 핵심 구조

### 1. 계층

- `haven`: 원본 게임 클라이언트와 엔진 코드
- `lmi`: 자동화 런타임, 동기화, 훅, UI 주입, 실행 인프라
- `agent`: 실제 사용자 기능인 `Job`과 `Action`

의존 방향은 기본적으로 `lmi -> agent`다.
`agent`는 실행 대상이고, `lmi`는 그것을 발견하고 실행하고 동기화하는 프레임워크다.

### 2. 실행 모델

- 메인/렌더 스레드: Haven UI와 입력 처리
- 네트워크 스레드: 서버 패킷 송수신
- `lmi.Agent`: 자동화 실행 전용 스레드

`Agent`는 "무엇을 할지 결정하는 객체"가 아니라 "결정된 실행 요청을 안전하게 수행하는 런타임"이다.

현재 `Agent`는 내부적으로 `JobRequest` 단위로 요청을 다룬다.
각 요청은 다음 정보를 함께 가진다.

- `Job`
- `String[] args`
- `AgentContext`

스케줄링 정책은 두 가지를 모두 지원한다.

- `pushJob(...)`: 현재 작업 위에 즉시 끼워 넣는 긴급 작업
- `enqueueJob(...)`: 뒤에 이어서 실행할 일반 작업

즉, 현재 `Agent`는 단순 stack이나 queue가 아니라 "긴급 push + 일반 enqueue"를 처리하는 작은 스케줄러 성격을 가진다.
다만 아직 정책이 단순하므로 별도 `Scheduler` 클래스로 분리하지 않고 `Agent` 안에 유지하고 있다.

### 3. 동기화 모델

자동화의 기본 동기화 축은 `WaitManager`다.

- `updateSentSeq(seq)`: 송신 패킷 시퀀스 기록
- `updateAckedSeq(seq)`: 서버 ACK 반영
- `waitACK()`: 마지막 송신이 ACK될 때까지 대기
- `waitResponse()`: ACK 이후 화면/상태 반영 시간을 포함해 대기

LMI는 "서버 응답 기반으로 깨어난 뒤, 상태 조건은 직접 다시 확인한다"는 방식을 따른다.
즉, 이벤트 기반보다는 ACK 기반 동기화 + 폴링 확인의 혼합 모델이다.

## Discovery / Menu / Execution

### 1. `AgentRegistry`가 단일 진실 공급원이다

현재 `agent` 패키지의 `Job`, `Action`, 폴더 메타데이터 발견은 모두 `lmi.AgentRegistry`가 맡는다.

규칙은 다음과 같다.

- 배포는 JAR 기준이다.
- 실행 중인 JAR 안의 `agent/**`를 recursive 하게 스캔한다.
- concrete `Job`은 실행 가능한 Job으로 등록한다.
- concrete `Action`은 실행 가능한 Action으로 등록한다.
- 패키지 마지막 이름과 같은 소문자 마커 클래스는 폴더 메타데이터로 간주한다.
  - 예: `agent.job.job`
  - 예: `agent.action.action`

이 registry를 다음 컴포넌트가 공통으로 사용한다.

- `AgentManager`: 콘솔 명령에서 Job 조회 및 실행
- `MenuGridProxy`: 메뉴 계층 구성 및 메타데이터 표시
- `Hook`: 메뉴 클릭 시 Job/Action 실행

이 구조의 목적은 "찾는 규칙"과 "실행 규칙"과 "보여주는 규칙"이 서로 어긋나지 않게 하는 것이다.

### 2. 메뉴 메타데이터 계약

`agent` 아래의 Job/Action/폴더 메타데이터 클래스는 다음 정적 메서드를 선택적으로 제공할 수 있다.

- `name()`: 표시 이름
- `info()`: 툴팁 설명
- `icon()`: 아이콘 경로
- `sortkey()`: 정렬 키

`icon()`이 `assets/`로 시작하면 로컬 PNG를 직접 로드한다.
그 외 문자열은 Haven resource path로 간주한다.

### 3. Action의 의미

`Job`은 길거나 절차적인 작업이다.
`Action`은 즉시 실행형 기능이다.

현재 예시로 `agent.action.ToggleSleepAction`이 있으며, 이는 메뉴 클릭 즉시 `Agent` sleep 상태를 토글한다.
이 예시는 registry -> menu -> hook -> execute 경로가 끝까지 연결되어 있음을 검증하기 위한 기준 구현이기도 하다.

## 실패 처리 원칙

현재 LMI는 `LMIException`의 `reason`으로 제어 흐름을 표현한다.

중요한 원칙:

- `ER_INTERRUPTED`는 어떤 계층에서도 삼키지 않는다.
- 사용자 중단, 스레드 interrupt, 취소 계열은 항상 상위로 전파한다.
- 업무상 예상 가능한 실패만 선택적으로 `false`나 분기 로직으로 처리한다.

현재 `Task` 계층은 완전히 안정된 설계 상태가 아니다.
다만 최소 원칙은 적용되어 있다.

- `MoveTask`, `LiftTask`, `PutTask`는 `catch (Exception)`로 모든 실패를 삼키지 않는다.
- `ER_INTERRUPTED`는 반드시 다시 던진다.
- 의미 있는 실패만 `false`로 바꾼다.
- `Behavior`는 Task 결과를 무시하지 않는다.

이 영역은 앞으로 많이 바뀔 수 있으므로, 현재는 "전역 계약"만 유지하고 세부 설계는 작업별로 다듬는 편이 낫다.

## 설계 원칙

### 1. 패키지 구조를 메뉴 구조의 기반으로 사용한다

`agent`의 Java package 구조와 메뉴 폴더 구조는 가능한 한 일치시키는 편이 좋다.
메뉴는 패키지 구조를 시각화한 결과물로 보는 것이 맞다.

### 2. 런타임 인프라와 사용자 기능을 분리한다

- `lmi`: 실행 인프라
- `agent`: 사용자 기능

새 기능을 추가할 때도 "이 코드가 런타임인가, 기능인가"를 먼저 구분하는 것이 중요하다.

### 3. 엔진 수정은 훅 중심으로 최소화한다

Haven 엔진 수정은 `// lmi start`와 `// lmi end` 범위 안에서만 다루는 것이 기본 원칙이다.
LMI는 엔진을 대체하는 것이 아니라 연결하고 보완하는 레이어다.

### 4. 배포 기준은 JAR이다

이 프로젝트는 class 파일 묶음을 직접 다루는 개발 흐름보다 JAR 배포를 전제로 한다.
따라서 discovery도 JAR 기준으로 설계하는 것이 맞다.

## 지금 기준에서 중요한 파일

- `src/lmi/Agent.java`
  - JobRequest 실행, push/enqueue 스케줄링, stop/interruption
- `src/lmi/AgentRegistry.java`
  - `agent/**` recursive scan, Job/Action/폴더 메타데이터 등록
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

## 파일 인덱스

현재 `lmi` 패키지의 파일 책임을 빠르게 찾기 위한 요약이다.
설명은 "현재 코드가 실제로 맡고 있는 책임" 기준의 한 줄 정리다.

```text
src/
  lmi/
    Agent.java: JobRequest를 push/enqueue 정책으로 실행하는 에이전트 런타임
    AgentConfig.java: 에이전트 drive 설정을 properties 파일로 저장하고 읽는 설정 저장소
    AgentContext.java: Job 실행 중 누적해서 들고 다닐 상태를 담는 경량 컨텍스트
    AgentManager.java: Job 탐색, 생성, 도움말 출력, 실행 진입점을 관리하는 등록기
    AgentRegistry.java: JAR 안의 `agent/**`를 스캔해 Job, Action, 폴더 메타데이터를 등록하는 공통 레지스트리
    Api.java: Job이 사용하는 고수준 자동화 API를 제공하는 퍼사드
    AppContext.java: Haven 쪽 객체 참조를 LMI 전역 컨텍스트로 연결하는 브리지
    Array.java: Swift 스타일 편의 메서드를 덧붙인 ArrayList 래퍼
    ClickManager.java: Gob 클릭과 영역 선택 같은 사용자 입력 대기를 관리하는 상태 관리자
    CommandHandler.java: 콘솔 명령 `a`를 등록하고 LMI 초기화를 시작하는 진입점
    Constant.java: 메시지, 타임아웃, 리소스명, 바운딩 박스 등 공용 상수를 모아둔 정의 파일
    FlowerMenuHandler.java: 플라워 메뉴 열기, 선택, 진행 대기를 묶어 처리하는 조정자
    Hook.java: Haven 엔진 훅에서 LMI 런타임으로 이벤트를 전달하는 연결 지점
    Interaction.java: `wdgmsg()` 호출을 정리해 서버 상호작용을 일관되게 보내는 래퍼
    LMIException.java: LMI 제어 흐름과 실패 이유를 담는 런타임 예외
    MenuGridProxy.java: AgentRegistry를 바탕으로 LMI 메뉴 구조와 메타데이터를 UI에 주입하는 프록시
    Pathfinder.java: 주변 장애물을 바탕으로 경로를 찾고 이동을 수행하는 경로 탐색기
    ProgressManager.java: 진행 바 생성과 종료를 감시해 작업 완료를 기다리는 상태 관리자
    Rect.java: 영역 선택과 배치 계산에 사용하는 직사각형 좌표 유틸리티
    Self.java: 플레이어 자신과 관련된 상태 조회를 모아둔 접근 계층
    Util.java: 디버그 출력, 리플렉션 보조, 문자열 처리 등 잡다한 공용 유틸리티
    WaitManager.java: 송신 seq와 ACK를 추적해 서버 응답 타이밍을 동기화하는 대기 관리자
    WidgetManager.java: 자주 쓰는 Haven 위젯을 AppContext에서 찾아오는 접근 헬퍼
    behavior/
      AlignLogBehavior.java: 통나무 정렬 절차를 Task 조합으로 표현한 행동 시퀀스
    task/
      Task.java: 행동 단위를 실행하는 Task 인터페이스
      MoveTask.java: 지정 좌표로 이동하는 Task
      LiftTask.java: 대상 Gob을 드는 Task
      PutTask.java: 들고 있는 물체를 지정 좌표에 내려놓는 Task
```

## 지금 보류 중인 것

- `AgentContext`의 장기 설계
- `Task`/`Behavior` 전면 재정리
- `MenuGridProxy`의 추가 분해
- `AppContext`의 lifecycle 정리

이 네 가지는 중요하지만, 현재는 런타임 골격을 먼저 안정화하는 쪽이 우선이다.
