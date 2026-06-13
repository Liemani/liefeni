# Hook

## Meta

- Target: `lmi.bridge.Hook`
- Owner: `lmi.bridge`
- Concept: `Hook`
- Created: `2026-06-13`
- Updated: `2026-06-13`

## Role

- Acts as the narrow Haven-to-LMI bridge for concrete event callbacks.

## Code Signals

- Public entry points:
  - `didMsgReceive`
  - `willMsgSend`
  - `willQueueMessage`
  - `didGetACK`
  - `newWidgetDidAdded`
  - `flowerMenuDidDestroyed`
  - `progressDidAdded`
  - `progressDidDestroyed`
  - `menuGridWillUse`
  - `willPaginaDropToBelt`
