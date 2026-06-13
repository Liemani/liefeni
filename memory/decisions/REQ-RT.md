# REQ-RT

## Runtime

- `REQ-RT-001`
  - Haven signal로 시작되는 LMI non-render 작업은 기본적으로 Haven thread에서 오래 실행되면 안 된다.
  - Haven thread는 필요한 최소 이벤트나 snapshot만 LMI 쪽 worker/runtime 경계로 넘기고, 실제 LMI 작업은 LMI thread에서 처리해야 한다.
- `REQ-RT-002`
  - draw/render 경로는 Haven thread가 LMI 데이터를 직접 읽고 그릴 수 있어야 한다.
  - 다만 draw/render 시점에 무거운 계산, blocking wait, ad hoc DB access를 하면 안 되며, draw 가능한 형태의 데이터는 그 전에 LMI 쪽에서 미리 준비되어 있어야 한다.
- `REQ-RT-003`
  - Haven 코드가 LMI 쪽으로 직접 진입해야 할 때는 하나의 Haven bridge class를 통해서만 들어가야 한다.
  - Haven 코드는 waypoint manager나 다른 LMI 도메인 클래스를 직접 호출하면 안 된다.
  - bridge class의 기본 이름은 `HavenBridge`로 두고, lifecycle / input / render / notification entry를 이 경계에 모아야 한다.
- `REQ-RT-004`
  - `RuntimeEventManager` thread는 Haven signal 이후에 재시도, polling, deferred runtime housekeeping이 필요한 LMI 작업만 맡아야 한다.
  - 이 thread는 blocking DB access나 장시간 job execution을 직접 맡으면 안 된다.
- `REQ-RT-005`
  - waypoint DB worker thread는 waypoint persistence의 단일 connection ownership과 read/write ordering을 보장하기 위해 존재해야 한다.
  - waypoint DB 작업은 이 worker queue를 통해 직렬화되어야 하며, runtime/domain 로직 실행 thread로 확장되면 안 된다.
- `REQ-RT-006`
  - `Agent` thread는 user-facing automation job execution을 Haven main/draw thread 밖에서 수행하기 위해 존재해야 한다.
  - agent thread는 job orchestration 경계여야 하며, persistence ordering이나 render completion delivery 책임을 겸하면 안 된다.
- `REQ-RT-007`
  - completion queue는 별도 worker thread를 만들지 않고, Haven draw/render 경계에서 짧게 drain되는 completion delivery 용도로만 유지해야 한다.
  - 이 경계에서 실행되는 completion은 draw 전에 준비된 lightweight state apply에 머물러야 하며, 무거운 후속 작업을 직접 시작하면 안 된다.
- `REQ-RT-008`
  - Haven 코드는 LMI 때문에 불필요하게 넓게 수정되면 안 된다.
  - Haven 변경은 가능한 한 작은 hook point, bridge call, 또는 `// lmi start` / `// lmi end` 범위 안의 국소 patch로 제한해야 한다.

