---
source: [WaypointGridSaveCoordinator.java](../../../../../../src/lmi/waypoint/runtime/WaypointGridSaveCoordinator.java)
created: 2026-06-14
updated: 2026-06-20
---

# WaypointGridSaveCoordinator

Coordinates the "save current Haven grid if missing" flow by resolving the current grid, avoiding duplicate in-flight requests, and forwarding callbacks back to the waypoint manager.

## Members

### Constants

#### `private static final Set<Long> pendingGridSaveHavenGridIds = new HashSet<>()`
- Role: Tracks in-flight grid-save requests.
- Description: Prevents duplicate save requests for the same Haven grid id.
- Value: `new HashSet<>()`

#### `private static final Map<Long, List<WaypointResultHandler<SaveMapGridResult>>> pendingHandlersByHavenGridId = new HashMap<>()`
- Role: Stores pending completion handlers by Haven grid id.
- Description: Batches callbacks that are waiting for the same grid-save result.
- Value: `new HashMap<>()`

### Methods

#### `private WaypointGridSaveCoordinator()`
- Role: Prevents instantiation.
- Description: Static coordinator only.

#### `public static void saveIfMissing(Coord gc, WaypointResultHandler<SaveMapGridResult> handler)`
- Role: Starts the current-grid save flow from a Haven grid coordinate.
- Description: Resolves the current Haven grid, looks up cached `MapFile.GridInfo`, and falls back to `MapFile.update(...)` before delegating to waypoint storage.

#### `static void saveIfMissing(long mapSegmentId, int localX, int localY, long havenGridId, Coord originWorld)`
- Role: Starts the grid-save flow with resolved identifiers.
- Description: Convenience overload that forwards to the callback-aware implementation.

#### `static synchronized void onResolved(long havenGridId, ResolvedGrid grid, SaveMapGridResult result)`
- Role: Completes pending grid-save requests successfully.
- Description: Clears the in-flight marker, notifies queued handlers, and asks `WaypointManager` to refresh.

#### `static synchronized void onSaveFailed(long havenGridId, Exception error)`
- Role: Completes pending grid-save requests with failure.
- Description: Clears the in-flight marker, notifies queued handlers, and asks `WaypointManager` to refresh.

#### `private static synchronized void saveIfMissing(`
- Role: Deduplicates and dispatches grid-save work.
- Description: Prevents duplicate save requests for the same Haven grid and delegates to `WaypointStore.saveMapGridIfMissingAsync(...)`.

#### `private static MapFile mapFile()`
- Role: Returns the active Haven map file.
- Description: Reads the map file from `GameUI` through the current `AppContext`, preferring `mmap` and then `mapfile`.