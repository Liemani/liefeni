---
source: [ProxyFrame.java](../../../src/haven/ProxyFrame.java)
created: 2026-06-13
updated: 2026-06-14
---

# ProxyFrame

Represents the proxy frame Haven component.

## Members

### Constants

### Fields

#### `public final T ch`
- Role: Holds the ch state.
- Description: Backs the cached state for this file.

#### `public Color color = Color.WHITE`
- Role: Stores the color value.
- Description: Backs the cached state for this file.

### Methods

#### `public ProxyFrame(T child, boolean resize)`
- Role: Creates a new ProxyFrame instance.
- Description: Constructs the instance and initializes its default state.

#### `public void drawframe(GOut g)`
- Role: Performs drawframe.
- Description: Supports the drawframe operation used by the surrounding class.

#### `public void uimsg(String msg, Object... args)`
- Role: Handles a UI message.
- Description: Supports the uimsg operation used by the surrounding class.

#### `public void wdgmsg(Widget sender, String msg, Object... args)`
- Role: Performs wdgmsg.
- Description: Supports the wdgmsg operation used by the surrounding class.
