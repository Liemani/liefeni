# lmi/bridge

이 문서는 Haven 이벤트와 LMI 기능을 잇는 진입점을 정리한다.

## Role

- UI, menu, input, map view, and widget interaction surfaces를 Haven 쪽에서 LMI 쪽으로 넘기는 경계를 묶는다.

## Files

- [Api.md](Api.md)
- [FlowerMenuHandler.md](FlowerMenuHandler.md)
- [Hook.md](Hook.md)
- [MenuGridProxy.md](MenuGridProxy.md)
- [ProgressManager.md](ProgressManager.md)
- [MapViewBridge.md](MapViewBridge.md)

## Notes

- `bridge`는 단순한 read/write 분리보다 Haven 객체와의 상호작용 대상별 묶음이 더 중요하다.
- `MapView`처럼 읽기와 메시지 전송이 함께 필요한 대상은 한 bridge 영역에서 같이 다루는 편이 낫다.
- bridge helper는 raw Haven access를 좁게 모으고, runtime/waypoint는 그 결과만 사용해야 한다.

## Rules

- bridge는 Haven 쪽 hook point를 최소한으로 유지한다.
- bridge는 계산을 길게 잡지 않고, work를 lifecycle/runtime으로 넘긴다.
