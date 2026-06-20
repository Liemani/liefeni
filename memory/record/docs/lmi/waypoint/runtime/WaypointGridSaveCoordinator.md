---
source: [WaypointGridSaveCoordinator.java](../../../../../src/lmi/waypoint/runtime/WaypointGridSaveCoordinator.java)
created: 2026-06-14
updated: 2026-06-14
---

# WaypointGridSaveCoordinator

Coordinates saving the current Haven grid into waypoint storage.

## Members

### Constants

#### `private static final Set<Long> pendingGridSaveHavenGridIds = new HashSet<>()`
- Role: Defines the shared pending grid save haven grid ids constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Map<Long, List<WaypointResultHandler<SaveMapGridResult>>> pendingHandlersByHavenGridId = new HashMap<>()`
- Role: Coordinates asynchronous waypoint grid save coordinator work.
- Description: Supports the pending handlers by haven grid id operation used by the surrounding class.

### Fields

### Methods

#### `private WaypointGridSaveCoordinator()`
- Role: Creates a new WaypointGridSaveCoordinator instance.
- Description: Constructs the instance and initializes its default state.

#### `public static void saveIfMissing(Coord gc, WaypointResultHandler<SaveMapGridResult> handler)`
- Role: Coordinates save if missing persistence or lookup.
- Description: Supports the save if missing operation used by the surrounding class.

#### `static void saveIfMissing(long mapSegmentId, int localX, int localY, long havenGridId, Coord originWorld)`
- Role: Coordinates save if missing persistence or lookup.
- Description: Supports the save if missing operation used by the surrounding class.

#### `static synchronized void onResolved(long havenGridId, ResolvedGrid grid, SaveMapGridResult result)`
- Role: Performs on resolved.
- Description: Supports the on resolved operation used by the surrounding class.

#### `static synchronized void onSaveFailed(long havenGridId, Exception error)`
- Role: Performs on save failed.
- Description: Supports the on save failed operation used by the surrounding class.

#### `private static synchronized void saveIfMissing(`
- Role: Coordinates save if missing persistence or lookup.
- Description: Supports the save if missing operation used by the surrounding class.

#### `private static MapFile mapFile()`
- Role: Performs map file.
- Description: Supports the map file operation used by the surrounding class.
