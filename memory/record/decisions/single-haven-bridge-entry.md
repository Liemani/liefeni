---
created: 2026-06-13
---

# DEC-012

Captures the stable decision that Haven -> LMI integration entry는 장기적으로 하나의 bridge class에 모은다.

## 결정

Haven -> LMI integration entry는 장기적으로 하나의 bridge class에 모은다.

## 이유

- Haven patch 지점이 임의의 LMI 도메인 클래스를 직접 알기 시작하면 경계가 무너진다.
- thread ownership과 lifecycle ownership을 통제하기 어려워진다.
- 장기적으로 `Hook`는 `HavenBridge` 같은 이름으로 승격하고, Haven 수정 범위를 한 경계로 모으는 편이 구조적으로 더 명확하다.
