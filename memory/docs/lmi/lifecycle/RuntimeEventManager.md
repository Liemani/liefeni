# RuntimeEventManager

This file documents the responsibilities and members of `RuntimeEventManager`.

## Meta

- Source: [RuntimeEventManager.java](../../../../src/lmi/lifecycle/RuntimeEventManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Dispatches deferred runtime work on a background loop.

## Nested Types

### RuntimeEventHandler

- Description: TODO

## Members

### Constants

#### `private static final Object lock = new Object()`

- Description: TODO

#### `private static final ArrayList<RuntimeEventHandler> handlers = new ArrayList<>()`

- Description: TODO

#### `private static final RuntimeEventHandler waypointRefreshHandler = new RuntimeEventHandler()`

- Description: TODO

### Fields

#### `private static Thread thread`

- Description: TODO

#### `private static boolean running = false`

- Description: TODO

### Methods

#### `private RuntimeEventManager()`

- Description: TODO

#### `public static void init()`

- Description: TODO

#### `public static void clear()`

- Description: TODO

#### `public static void registerWaypointRefreshHandler()`

- Description: TODO

#### `public static void unregisterWaypointRefreshHandler()`

- Description: TODO

#### `public static void shutdown()`

- Description: TODO

#### `private static void _addHandler(RuntimeEventHandler handler)`

- Description: TODO

#### `private static void _loop()`

- Description: TODO

#### `boolean handle()`

- Description: TODO
