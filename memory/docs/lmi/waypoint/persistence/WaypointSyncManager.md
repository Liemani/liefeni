# WaypointSyncManager

This file documents the responsibilities and members of `WaypointSyncManager`.

## Meta

- Source: [WaypointSyncManager.java](../../../../../src/lmi/waypoint/persistence/WaypointSyncManager.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Queues DB completions for delivery on the draw/render boundary.

## Members

### Constants

#### `private static final ConcurrentLinkedQueue<Runnable> completions = new ConcurrentLinkedQueue<>()`

- Description: TODO

### Fields

### Methods

#### `private WaypointSyncManager()`

- Description: TODO

#### `public static void enqueue(Runnable completion)`

- Description: TODO

#### `public static void drain()`

- Description: TODO

#### `public static void clear()`

- Description: TODO
