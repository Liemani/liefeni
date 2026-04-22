# Liefeni (LMI) Automation Framework Context

이 문서는 Haven & Hearth 게임 클라이언트를 위한 자동화 프레임워크인 LMI(Liefeni Multi-Interaction)의 아키텍처와 주요 메커니즘을 정리한 문서입니다.

## 1. 핵심 아키텍처 (Core Architecture)

### 1.1 스레드 모델
*   **Main/Render Thread (Haven)**: 게임 엔진의 렌더링 및 입력을 담당.
*   **Network Thread (Haven)**: 서버와의 패킷 송수신 전담.
*   **Agent Thread (LMI)**: 자동화 스크립트(Job)를 실행하는 독립 스레드. 선형적인 코드 흐름을 보장하기 위해 별도로 운영됨.

### 1.2 동기화 시스템 (WaitManager)
기존의 복잡한 시그널 방식을 버리고, **상태 중심의 단순화된 통로**로 리팩토링됨.
*   **ACK 대기 (`waitACK`)**: UDP의 누적 확인(Cumulative ACK) 특성을 이용. 서버가 보낸 마지막 패킷 일련번호(`seq`)를 추적하여 명령의 도달을 보장함.
*   **응답 대기 (`waitResponse`)**: `waitACK()` 이후 서버의 데이터 처리를 위한 아주 짧은 지연(`TO_IMPERCEPTIBLE`)을 포함하여 게임 상태 변화가 반영될 시간을 확보함.
*   **전역 알림**: 네트워크 응답(ACK) 발생 시 에이전트 스레드를 깨움.
*   **상태 폴링**: 에이전트는 깨어날 때마다 `while` 루프를 통해 자신의 조건(예: `self.isMoving()`)이 충족되었는지 직접 확인함.

## 2. 상호작용 및 훅 (Interaction & Hook)

### 2.1 기초 상호작용 (`Interaction`)
*   `wdgmsg()`를 래핑하여 모든 상호작용(클릭, 아이템 이동, 메뉴 선택 등)을 통합 관리.
*   `AppContext`를 활용하여 위젯 인스턴스에 대한 의존성을 최소화함.

### 2.2 엔진 훅 (`Hook`)
*   `haven` 엔진과 `lmi` 시스템 사이의 유일한 가교.
*   엔진 코드 수정은 최소화하며, 반드시 `// lmi start`와 `// lmi end` 주석 내에서만 관리함.
*   엔진의 이벤트를 가로채어 에이전트 중단(ESC), Job 실행(MenuGrid), 상태 동기화 등을 수행.

## 3. UI 통합 및 Job 시스템

### 3.1 MenuGridProxy
*   게임 내 메뉴 그리드에 LMI 전용 계층형 아이콘을 주입.
*   `Agent / [Job, Settings, Debug, Test]` 구조의 트리 구성을 가짐.
*   `\ufffe` 접두어와 ID 기반 정렬을 통해 메뉴의 가장 마지막 위치에 고정됨.

### 3.2 자동 Job 스캔
*   `AgentManager`가 `lmi.job`, `lmi.debug`, `lmi.test` 패키지를 스캔하여 실행 가능한 클래스를 자동 등록함.
*   아이콘 클릭 시 해당 Job 클래스의 `info()` 메서드를 호출하여 툴팁 설명을 생성하고, 인스턴스를 생성하여 에이전트 스레드에서 실행.

## 4. 설계 원칙 (Design Principles)

*   **정수 좌표 우선**: 모든 로직 계산과 서버 통신에는 `Coord`(Integer)를 사용. `Coord2d`는 오직 부드러운 렌더링을 위한 보간용으로만 간주함.
*   **예외 기반 중단**: 인터럽트 등 비정상 상황 발생 시 `LMIException(ER_INTERRUPTED)`를 던져 에이전트 루프에서 일괄 처리하도록 함.
*   **최소 비용 감시**: `Gob.isObserved`와 같은 플래그를 활용하려 했으나, 최종적으로는 필요한 순간에만 `Agent`가 상태를 들여다보는 폴링 방식을 지향하여 엔진 부하를 0%에 가깝게 유지함.

## 5. 주요 파일 경로
*   `src/lmi/Agent.java`: 에이전트 메인 루프.
*   `src/lmi/WaitManager.java`: 동기화 허브.
*   `src/lmi/Interaction.java`: 상호작용 명령 집합.
*   `src/lmi/MenuGridProxy.java`: UI 주입 및 관리.
*   `src/lmi/Hook.java`: 엔진 이벤트 리스너.
