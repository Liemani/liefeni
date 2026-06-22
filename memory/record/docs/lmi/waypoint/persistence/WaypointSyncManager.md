---
source: [WaypointSyncManager.java](../../../../../../src/lmi/waypoint/persistence/WaypointSyncManager.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointSyncManager

Coordinates waypoint synchronization between runtime and persistence.

## Members

### Constants

#### `private static final ConcurrentLinkedQueue<Runnable> completions = new ConcurrentLinkedQueue<>()`
- Role: Implements the completions operation.
- Description: Implements the private static final concurrent linked queue<runnable> completions = new concurrent linked queue<>() operation.

### Fields

### Methods

#### `private WaypointSyncManager()`
- Role: Creates a new WaypointSyncManager instance.
- Description: Constructs the WaypointSyncManager instance from the supplied inputs.

#### `public static void enqueue(Runnable completion)`
- Role: Queues a post-write completion callback.
- Description: Stores the callback until the next sync drain.

#### `public static void drain()`
- Role: Runs queued waypoint write completions.
- Description: Executes the callbacks that were buffered during persistence.

#### `public static void clear()`
- Role: Clears waypoint manager state.
- Description: Empties the buffered waypoint completion queue.