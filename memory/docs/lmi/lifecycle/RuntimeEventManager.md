# RuntimeEventManager

This file documents the responsibilities and members of `RuntimeEventManager`.

## Meta

- Source: [RuntimeEventManager.java](../../../../src/lmi/lifecycle/RuntimeEventManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Dispatches runtime events to lifecycle listeners.

## Nested Types

### RuntimeEventHandler
### RuntimeEventHandler
- Role: Represents the runtime event handler helper used by RuntimeEventManager.

- Role: Represents one runtime event callback handler.
- Description: Acts as one runtime event callback handler.

## Members

### Constants

#### `private static final Object lock = new Object()`
- Role: Defines the shared lock constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ArrayList<RuntimeEventHandler> handlers = new ArrayList<>()`
- Role: Coordinates asynchronous runtime event manager work.
- Description: Supports the handlers operation used by the surrounding class.

#### `private static final RuntimeEventHandler waypointRefreshHandler = new RuntimeEventHandler()`
- Role: Coordinates asynchronous runtime event handler work.
- Description: Supports the runtime event handler operation used by the surrounding class.

### Fields

#### `private static Thread thread`
- Role: Coordinates asynchronous runtime event manager work.
- Description: Supports the thread operation used by the surrounding class.

#### `private static boolean running = false`
- Role: Tracks the running flag.
- Description: Supports the running operation used by the surrounding class.

### Methods

#### `private RuntimeEventManager()`
- Role: Creates a new RuntimeEventManager instance.
- Description: Constructs the instance and initializes its default state.

#### `public static void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public static void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public static void registerWaypointRefreshHandler()`
- Role: Performs register waypoint refresh handler.
- Description: Supports the register waypoint refresh handler operation used by the surrounding class.

#### `public static void unregisterWaypointRefreshHandler()`
- Role: Performs unregister waypoint refresh handler.
- Description: Supports the unregister waypoint refresh handler operation used by the surrounding class.

#### `public static void shutdown()`
- Role: Performs shutdown.
- Description: Supports the shutdown operation used by the surrounding class.

#### `private static void _addHandler(RuntimeEventHandler handler)`
- Role: Performs  add handler.
- Description: Supports the add handler operation used by the surrounding class.

#### `private static void _loop()`
- Role: Performs  loop.
- Description: Supports the loop operation used by the surrounding class.

#### `boolean handle()`
- Role: Performs handle.
- Description: Supports the handle operation used by the surrounding class.
