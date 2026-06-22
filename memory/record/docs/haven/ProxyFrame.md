---
source: [ProxyFrame.java](../../../../src/haven/ProxyFrame.java)
created: 2026-06-13
updated: 2026-06-14
---

# ProxyFrame

Represents the proxy frame Haven component.

## Members

### Constants

### Fields

#### `public final T ch`
- Role: Caches the ch value.
- Description: Caches the `ch` value for reuse.

#### `public Color color = Color.WHITE`
- Role: Caches the color value.
- Description: Caches the `color` value for reuse.

### Methods

#### `public ProxyFrame(T child, boolean resize)`
- Role: Creates a new ProxyFrame instance.
- Description: Constructs the ProxyFrame instance from the supplied inputs.

#### `public void drawframe(GOut g)`
- Role: Handles the drawframe path.
- Description: Draws the frame.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Handles widget UI messages from the server.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Handles the wdgmsg path.
- Description: Sends a widget message through the UI message path.