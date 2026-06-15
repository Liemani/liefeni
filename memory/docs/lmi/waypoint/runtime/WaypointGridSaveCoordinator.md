# WaypointGridSaveCoordinator

This file documents the responsibilities and members of `WaypointGridSaveCoordinator`.

## Meta

- Source: [WaypointGridSaveCoordinator.java](../../../../../src/lmi/waypoint/runtime/WaypointGridSaveCoordinator.java)
- Created: `2026-06-14`
- Updated: `2026-06-14`

## Role

Coordinates current-grid save requests.
Deduplicates pending saves for the same Haven grid.
Fans out success or failure to waiting handlers.
Triggers waypoint refresh after completion.
Resolves the current Haven grid and map segment metadata before saving.

## Members

### Constants

#### `private static final Set<Long> pendingGridSaveHavenGridIds = new HashSet<>()`

- Description: TODO

#### `private static final Map<Long, List<WaypointResultHandler<SaveMapGridResult>>> pendingHandlersByHavenGridId = new HashMap<>()`

- Description: TODO

### Fields

### Methods

#### `private WaypointGridSaveCoordinator()`

- Description: TODO

#### `public static void saveIfMissing(Coord gc, WaypointResultHandler<SaveMapGridResult> handler)`

- Description: TODO

#### `static void saveIfMissing(long mapSegmentId, int localX, int localY, long havenGridId, Coord originWorld)`

- Description: TODO

#### `static synchronized void onResolved(long havenGridId, ResolvedGrid grid, SaveMapGridResult result)`

- Description: TODO

#### `static synchronized void onSaveFailed(long havenGridId, Exception error)`

- Description: TODO

#### `private static synchronized void saveIfMissing(`

- Description: TODO

#### `private static MapFile mapFile()`

- Description: TODO
