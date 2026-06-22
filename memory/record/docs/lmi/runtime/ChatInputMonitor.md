---
source: [ChatInputMonitor.java](../../../../../src/lmi/runtime/ChatInputMonitor.java)
created: 2026-06-13
updated: 2026-06-14
---

# ChatInputMonitor

Monitors chat input events for agent hooks.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Implements the lock operation.
- Description: Implements the object operation.

### Fields

#### `private static boolean waitingAreaChat = false`
- Role: Tracks the waiting area chat flag.
- Description: Marks whether the next chat message should be captured as area chat.

#### `private static String capturedAreaChat = null`
- Role: Caches the captured area chat value.
- Description: Caches the `capturedAreaChat` value for reuse.

### Methods

#### `private ChatInputMonitor()`
- Role: Creates a new ChatInputMonitor instance.
- Description: Constructs the ChatInputMonitor instance from the supplied inputs.

#### `public static void clear()`
- Role: Clears waypoint manager state.
- Description: Clears the pending chat capture state.

#### `public static String waitAreaChat()`
- Role: Blocks until an area chat message is captured.
- Description: Waits for the next matching chat input and returns it.

#### `public static void capture(Widget sender, String msg, Object... args)`
- Role: Captures a chat message from Haven UI.
- Description: Stores the message when the monitor is waiting for area chat.