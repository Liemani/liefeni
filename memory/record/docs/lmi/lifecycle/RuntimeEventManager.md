---
source: [RuntimeEventManager.java](../../../../../src/lmi/lifecycle/RuntimeEventManager.java)
created: 2026-06-13
updated: 2026-06-20
---

# RuntimeEventManager

Runs a background loop that dispatches lifecycle runtime handlers, including waypoint refresh processing.

## Nested Types

### `RuntimeEventHandler`
- Role: Represents one callback that can stay registered in the runtime event loop until it completes.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Serializes access to the handler list and worker thread state.
- Value: `new Object()`

#### `private static final ArrayList<RuntimeEventHandler> handlers = new ArrayList<>()`
- Role: Stores the active runtime handlers.
- Value: `new ArrayList<>()`

#### `private static final RuntimeEventHandler waypointRefreshHandler = new RuntimeEventHandler()`
- Role: Bridges runtime event processing to `WaypointManager.processRefreshRequests()`.
- Value: anonymous `RuntimeEventHandler` instance that calls `WaypointManager.processRefreshRequests()`

### Fields

#### `private static Thread thread`
- Role: Holds the background worker thread.

#### `private static boolean running = false`
- Role: Tracks whether the runtime event loop should keep running.

### Methods

#### `private RuntimeEventManager()`
- Role: Prevents instantiation.

#### `public static void init()`
- Role: Starts the runtime worker thread if it is not already running.

#### `public static void clear()`
- Role: Removes all registered handlers without stopping the worker thread.

#### `public static void registerWaypointRefreshHandler()`
- Role: Registers the waypoint refresh bridge handler.

#### `public static void unregisterWaypointRefreshHandler()`
- Role: Unregisters the waypoint refresh bridge handler.

#### `public static void shutdown()`
- Role: Stops the worker thread and clears handler state.

#### `private static void _addHandler(RuntimeEventHandler handler)`
- Role: Adds one handler unless it is already present.

#### `private static void _loop()`
- Role: Waits for handlers, runs them, removes completed ones, and polls again.

#### `boolean handle()`
- Role: Returns whether the handler should remain registered after one pass.

