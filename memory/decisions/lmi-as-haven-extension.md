# DEC-014

LMI는 Haven 위에 붙는 확장 계층으로 유지하고, Haven 수정은 최소 hook/bridge patch로 제한한다.

## 이유

- Haven 원본 구조를 크게 재구성하면 upstream merge 비용과 회귀 위험이 급격히 커진다.
- LMI를 hook/overlay/worker 중심 확장 계층으로 유지해야 Haven 변경을 좁게 가두고 내부 구조 변경의 파급을 줄일 수 있다.

