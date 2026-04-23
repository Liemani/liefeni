# Liefeni (LMI) Automation Framework Context

이 문서는 Haven & Hearth 게임 클라이언트를 위한 자동화 프레임워크인 LMI(Liefeni Multi-Interaction)의 아키텍처와 주요 메커니즘을 정리한 문서입니다.

## 1. 핵심 아키텍처 (Core Architecture)

### 1.1 스레드 모델
*   **Main/Render Thread (Haven)**: 게임 엔진의 렌더링 및 입력을 담당.
*   **Network Thread (Haven)**: 서버와의 패킷 송수신 전담.
*   **Agent Thread (LMI)**: 자동화 스크립트(Job)를 실행하는 독립 스레드. 선형적인 코드 흐름을 보장하기 위해 별도로 운영됨.

### 1.2 동기화 시스템 (WaitManager)
*   **ACK 대기 (`waitACK`)**: UDP의 누적 확인(Cumulative ACK) 특성을 이용. 서버가 보낸 마지막 패킷 일련번호(`seq`)를 추적하여 명령의 도달을 보장함.
*   **응답 대기 (`waitResponse`)**: `waitACK()` 이후 서버의 데이터 처리를 위한 지연을 포함하여 게임 상태 변화 반영 시간을 확보함.
*   **상태 폴링**: 에이전트는 네트워크 응답 시 깨어나며, `while` 루프를 통해 자신의 조건(예: `self.isMoving()`)이 충족되었는지 직접 확인함.

## 2. 엔진 훅 및 상호작용 (Hook & Interaction)

### 2.1 엔진 훅 (`Hook`)
*   `haven` 엔진과 `lmi` 시스템 사이의 가교. 엔진 코드 수정은 최소화하며, `// lmi start`와 `// lmi end` 주석 내에서만 관리함.
*   엔진 이벤트를 가로채어 에이전트 중단(ESC), Job 실행(MenuGrid), 상태 동기화 등을 수행함.

### 2.2 기초 상호작용 (`Interaction`)
*   `wdgmsg()`를 래핑하여 모든 상호작용(클릭, 아이템 이동 등)을 통합 관리. `AppContext`를 활용하여 위젯 인스턴스 의존성을 최소화함.

## 3. UI 및 Job 시스템 (Dynamic Metadata)

### 3.1 패키지 및 디렉토리 구조
*   **표준 준수**: Java의 설계 의도에 따라 `src/agent/` 하위의 물리적 디렉토리 구조와 Java 패키지 선언을 일치시킴 (예: `src/agent/job/MyJob.java` -> `package agent.job;`).
*   **계층 자동 생성**: `MenuGridProxy`는 JAR 엔트리 경로를 분석하여 실제 폴더 구조와 동일한 메뉴 계층을 자동으로 생성함.

### 3.2 동기적 메타데이터 발견 (Discovery)
*   **선언적 UI**: 각 클래스는 고유한 `static` 메서드를 통해 자신의 UI 표현 방식을 정의함. `MenuGridProxy`는 이를 리플렉션으로 호출하여 `Pagina`를 구성함.
    *   `name()`: 표시 이름 (기본값: 클래스명)
    *   `info()`: 툴팁 설명
    *   `icon()`: 아이콘 경로 (`assets/` 시작 시 로컬 PNG 로드)
    *   `sortkey()`: 메뉴 내 정렬 순서
*   **폴더 메타데이터**: 패키지 폴더의 정보를 정의하기 위해 패키지명과 동일한 소문자 마커 클래스를 사용함 (예: `agent.job` 패키지 정보를 위해 `agent.job.job` 클래스 참조).

### 3.3 로컬 에셋 및 렌더링
*   **에셋 로드**: `assets/` 디렉토리에 위치한 PNG 파일을 `ImageIO`로 로드하여 `haven.Tex`로 변환함.
*   **커스텀 렌더링**: `MenuGridProxy.Pagina`는 커스텀 텍스처가 있을 경우 기본 리소스 기반 렌더링 대신 `g.image()`를 통해 직접 아이콘을 그림.
*   **안정성**: 엔진의 `MenuGrid.draw`에서 발생할 수 있는 NPE를 방지하기 위해 커스텀 아이콘 사용 시에도 항상 유효한 `GSprite` 객체를 반환하도록 설계됨.

## 4. 설계 원칙 (Design Principles)

*   **Java 표준 존중**: 빌드 시스템(Ant)의 기본 동작을 해치지 않으며, Java의 패키지 메커니즘을 UI 계층 구조의 근간으로 삼음.
*   **런타임 견고성**: `ProtectionDomain`을 사용하여 실행 중인 JAR 파일을 직접 스캔함으로써 클래스 로더 상태에 무관하게 안정적으로 Job을 발견함.
*   **데이터와 로직의 분리**: UI 관리 로직은 인터페이스만 제공하고, 실제 데이터는 각 Job/Folder 클래스가 독립적으로 관리함.

## 5. 주요 파일 경로
*   `src/lmi/Agent.java`: 에이전트 메인 루프.
*   `src/lmi/MenuGridProxy.java`: 동기적 메타데이터 기반 UI 주입 및 관리.
*   `src/lmi/AgentManager.java`: 하위 패키지 자동 스캔 및 Job 실행 관리.
*   `assets/`: 로컬 아이콘 이미지 저장소.
