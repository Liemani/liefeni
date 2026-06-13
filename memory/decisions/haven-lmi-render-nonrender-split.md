# DEC-011

## Meta

- Date: 2026-06-13 Haven-originated LMI 작업은 render와 non-render를 분리한다.

## 이유

- non-render 작업까지 Haven thread가 직접 수행하면 LMI 때문에 Haven이 지연될 수 있다.
- render 경로는 Haven draw thread가 직접 실행하되, draw 가능한 scene/cache는 그 전에 LMI 쪽에서 미리 준비해 두는 편이 구조적으로 안전하다.

