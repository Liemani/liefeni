---
source: [FlowerMenuHandler.java](../../../../src/lmi/bridge/FlowerMenuHandler.java)
created: 2026-06-13
updated: 2026-06-14
---

# FlowerMenuHandler

Handles Haven flower menu lifecycle and forwards selection callbacks.

## Members

### Constants

### Fields

#### `private static haven.FlowerMenu _widget`
- Role: Holds the widget state.
- Description: Backs the cached state for this file.

### Methods

#### `public static void setWidget(haven.FlowerMenu widget)`
- Role: Sets the widget.
- Description: Mutates the owning object to keep runtime state in sync.

#### `public static void clearWidget()`
- Role: Clears the widget.
- Description: Removes the associated value from the current runtime state.

#### `public static void choose(Gob gob, int meshId, String name)`
- Role: Performs choose.
- Description: Supports the choose operation used by the surrounding class.

#### `private static void _open(Gob gob, int meshId)`
- Role: Performs  open.
- Description: Supports the open operation used by the surrounding class.

#### `private static void _waitFlowerMenuOpening()`
- Role: Performs  wait flower menu opening.
- Description: Supports the wait flower menu opening operation used by the surrounding class.

#### `private static boolean _isAdded()`
- Role: Performs  is added.
- Description: Supports the is added operation used by the surrounding class.

#### `private static void _close()`
- Role: Performs  close.
- Description: Supports the close operation used by the surrounding class.

#### `private static void _choose(String name)`
- Role: Performs  choose.
- Description: Supports the choose operation used by the surrounding class.

#### `private static void _sendChoosePetalMessage(int index)`
- Role: Performs  send choose petal message.
- Description: Supports the send choose petal message operation used by the surrounding class.

#### `private static void _sendInteractMessage(Gob gob, int meshId)`
- Role: Performs  send interact message.
- Description: Supports the send interact message operation used by the surrounding class.

#### `private static void _sendCloseMessage()`
- Role: Performs  send close message.
- Description: Supports the send close message operation used by the surrounding class.
