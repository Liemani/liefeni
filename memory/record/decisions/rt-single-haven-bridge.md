---
created: 2026-06-13
---

# REQ-RT-003

Captures the stable decision that Haven 코드가 LMI 쪽으로 직접 진입해야 할 때는 하나의 Haven bridge class를 통해서만 들어가야 한다.

## 결정

Haven 코드가 LMI 쪽으로 직접 진입해야 할 때는 하나의 Haven bridge class를 통해서만 들어가야 한다.

## 이유

- Haven 코드는 waypoint manager나 다른 LMI 도메인 클래스를 직접 호출하면 안 된다.
- bridge class의 기본 이름은 `HavenBridge`로 둔다.
- lifecycle / input / render / notification entry를 이 경계에 모아야 한다.
