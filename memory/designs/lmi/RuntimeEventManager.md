# RuntimeEventManager

## Meta

- Source: `src/lmi/RuntimeEventManager.java`
- Package: `lmi`
- Declared Type: `interface`
- Declared Name: `RuntimeEventHandler`

## Role

- Dispatches deferred runtime work on a background loop.

## Code Signals

- Public entry points:
  - `handle`
  - `init`
  - `clear`
  - `registerWaypointRefreshHandler`
  - `unregisterWaypointRefreshHandler`
  - `shutdown`
