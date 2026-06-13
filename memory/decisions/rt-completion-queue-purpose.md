# REQ-RT-007

## Meta

- Date: 2026-06-13 completion queue는 별도 worker thread를 만들지 않고 Haven draw/render 경계에서 짧게 drain되는 completion delivery 용도로만 유지해야 한다.

## Rule

- 이 경계에서 실행되는 completion은 draw 전에 준비된 lightweight state apply에 머물러야 한다.
- 무거운 후속 작업을 직접 시작하면 안 된다.
