# WaypointSyncManager

This file documents the responsibilities and members of `WaypointSyncManager`.

## Meta

- Source: [WaypointSyncManager.java](../../../../../src/lmi/waypoint/persistence/WaypointSyncManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Coordinates waypoint synchronization between runtime and persistence.

## Members

### Constants

#### `private static final ConcurrentLinkedQueue<Runnable> completions = new ConcurrentLinkedQueue<>()`
- Role: Defines the shared completions constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `private WaypointSyncManager()`
- Role: Creates a new WaypointSyncManager instance.
- Description: Constructs the instance and initializes its default state.

#### `public static void enqueue(Runnable completion)`
- Role: Performs enqueue.
- Description: Supports the enqueue operation used by the surrounding class.

#### `public static void drain()`
- Role: Performs drain.
- Description: Supports the drain operation used by the surrounding class.

#### `public static void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.
