# AppContext

## Meta

- Target: `lmi.core.AppContext`
- Owner: `lmi.core`
- Concept: `AppContext`
- Created: `2026-06-13`
- Updated: `2026-06-13`

## Role

- Holds shared references to the current Haven session and UI-level state that is not owned by a specific bridge surface.

## Code Signals

- Public entry points:
  - `init`
  - `resetWidgetCache`
  - `resetSessionState`
  - `setMainFrame`
  - `setMainThread`
  - `setJOGLPanel`
  - `setDispatcher`
  - `setRemoteUI`
  - `setUI`
  - `setRootWidget`
