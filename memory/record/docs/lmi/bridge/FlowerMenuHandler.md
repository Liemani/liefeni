---
source: [FlowerMenuHandler.java](../../../../../src/lmi/bridge/FlowerMenuHandler.java)
created: 2026-06-13
updated: 2026-06-14
---

# FlowerMenuHandler

Handles Haven flower menu lifecycle and forwards selection callbacks.

## Members

### Constants

### Fields

#### `private static haven.FlowerMenu _widget`
- Role: Caches the widget value.
- Description: Caches the `_widget` value for reuse.

### Methods

#### `public static void setWidget(haven.FlowerMenu widget)`
- Role: Sets the widget.
- Description: Updates the current object state.

#### `public static void clearWidget()`
- Role: Clears the widget.
- Description: Clears the widget.

#### `public static void choose(Gob gob, int meshId, String name)`
- Role: Handles the choose path.
- Description: Chooses a flower-menu entry for the supplied gob target.

#### `private static void _open(Gob gob, int meshId)`
- Role: Handles the open path.
- Description: Opens the flower menu for the requested gob and mesh.

#### `private static void _waitFlowerMenuOpening()`
- Role: Handles the wait flower menu opening path.
- Description: Blocks until Haven has created the flower menu widget.

#### `private static boolean _isAdded()`
- Role: Handles the is added path.
- Description: Checks whether the flower menu bridge still has a live widget.

#### `private static void _close()`
- Role: Closes the current stream or resource.
- Description: Requests Haven to close the current flower menu.

#### `private static void _choose(String name)`
- Role: Handles the choose path.
- Description: Sends the selected petal name back to Haven.

#### `private static void _sendChoosePetalMessage(int index)`
- Role: Handles the send choose petal message path.
- Description: Dispatches the petal-index selection message to Haven.

#### `private static void _sendInteractMessage(Gob gob, int meshId)`
- Role: Handles the send interact message path.
- Description: Dispatches the flower-menu interaction message to Haven.

#### `private static void _sendCloseMessage()`
- Role: Handles the send close message path.
- Description: Dispatches the close request message to Haven.