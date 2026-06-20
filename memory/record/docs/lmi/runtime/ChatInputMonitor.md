---
source: [ChatInputMonitor.java](../../../../src/lmi/runtime/ChatInputMonitor.java)
created: 2026-06-13
updated: 2026-06-14
---

# ChatInputMonitor

Monitors chat input events for agent hooks.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Defines the shared lock constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static boolean waitingAreaChat = false`
- Role: Tracks the waiting area chat flag.
- Description: Supports the waiting area chat operation used by the surrounding class.

#### `private static String capturedAreaChat = null`
- Role: Stores the captured area chat value.
- Description: Backs the cached state for this file.

### Methods

#### `private ChatInputMonitor()`
- Role: Creates a new ChatInputMonitor instance.
- Description: Constructs the instance and initializes its default state.

#### `public static void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public static String waitAreaChat()`
- Role: Performs wait area chat.
- Description: Supports the wait area chat operation used by the surrounding class.

#### `public static void capture(Widget sender, String msg, Object... args)`
- Role: Performs capture.
- Description: Supports the capture operation used by the surrounding class.
