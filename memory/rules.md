# Workflow Rules

이 문서는 작업 운영 문서들이 어떻게 연결되고 사용되는지 정리한다.

## Roles

- `ideas/`: 아직 task로 확정되지 않은 생각과 가능성을 관리한다.
- `issues/`: 아직 해결되지 않은 문제, 불편, 리스크를 관리한다.
- `tasks/`: 실제 실행 단위를 관리한다. 필요하면 관련 task들을 묶는 상위 task 역할도 함께 할 수 있다.
- `decisions/`: 작업 전에 고정한 요구사항과, 시도와 판단을 바탕으로 내린 결정을 함께 기록한다.
- `docs/`: 여러 decision과 task를 엮은 코드 연동 문서, 구현 전 구조 초안, 비교적 구체적인 구조 walkthrough를 관리한다.
- `indexes/`: 특정 주제와 관련된 item 링크를 모아두는 주제별 인덱스를 관리한다.
- `templates/`: 새 문서를 만들 때 사용하는 템플릿을 둔다.
- `wiki/`: 구조 설명, 개념 정리, 긴 문맥을 남기는 설명 문서를 관리한다. 작업 운영 문서와는 구분되는 reference 영역이다.

## Basic Flow

1. 아직 막연하지만 가능성으로 보고 싶으면 `ideas/`에 아이디어를 만든다.
2. 해결해야 할 문제나 불편이면 `issues/`에 이슈를 만든다.
3. 실제 실행 단위는 `tasks/`에 만든다.
4. 관련 task가 여러 개 생기면 상위 task에서 child task를 링크해 묶는다.
5. 작업 전에 고정해야 할 요구사항이 있으면 `decisions/` 문서 안에 먼저 정리한다.
6. 구현 전 구조를 설명하거나 여러 결정을 묶는 문서가 필요하면 `docs/`에 문서를 만든다.
7. 시도 결과를 바탕으로 방향을 정하면 `decisions/`에 결정을 남긴다.
8. 특정 주제와 관련된 item이 늘어나면 `indexes/`에 주제 인덱스를 만든다.
9. 필요하면 task, decision, doc, wiki 문서에서 관련 index를 링크한다.

## Linking Rules

- idea는 관련 task를 가질 수 있다.
- issue는 관련 task와 decision을 가질 수 있다.
- task는 관련된 child task와 decision을 묶어 관리할 수 있다.
- task, decision, doc, wiki 문서는 관련된 index를 링크할 수 있다.
- decision은 관련 issue나 task를 링크할 수 있다.
- doc은 관련 decision, task, issue를 링크할 수 있다.

## Status Rules

- 아직 시작하지 않은 작업은 `Backlog`에 둔다.
- 지금 진행 중인 작업은 `Now`에 둔다.
- 끝난 작업은 `Done`으로 옮긴다.

## Boundary

- 이 문서들은 현재 second brain의 핵심 작업 영역을 구성한다.
- 여기의 문서들은 작업 운영 자체를 다룬다.
- `docs/`는 작업 운영 문서와 설명 문서 사이에 있는 코드 연동 문서 영역이다.
- `wiki/`는 작업 운영보다 설명과 정리에 가깝고, 필요할 때 issue / task / decision / design에서 링크해 사용한다.
