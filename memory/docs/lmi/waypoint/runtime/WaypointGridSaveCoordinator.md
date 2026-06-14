# WaypointGridSaveCoordinator

## Meta

- Source: [WaypointGridSaveCoordinator.java](../../../../../src/lmi/waypoint/runtime/WaypointGridSaveCoordinator.java)
- Created: `2026-06-14`
- Updated: `2026-06-14`

## Role

- Coordinates current-grid save requests.
- Deduplicates pending saves for the same Haven grid.
- Fans out success or failure to waiting handlers.
- Triggers waypoint refresh after completion.
- Resolves the current Haven grid and map segment metadata before saving.

## Code Members

### Member Index

#### Fields

- [pendingGridSaveHavenGridIds](#member-1)
- [pendingHandlersByHavenGridId](#member-2)

#### Methods

- [saveIfMissing(Coord gc, WaypointResultHandler<SaveMapGridResult> handler)](#member-3)
- [saveIfMissing(long mapSegmentId, int localX, int localY, long havenGridId, Coord originWorld)](#member-4)
- [onResolved(long havenGridId, ResolvedGrid grid, SaveMapGridResult result)](#member-5)
- [onSaveFailed(long havenGridId, Exception error)](#member-6)
- [private static synchronized void saveIfMissing(](#member-7)
- [mapFile()](#member-8)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `pendingGridSaveHavenGridIds`

- Description: TODO

<a id="member-2"></a>
##### `pendingHandlersByHavenGridId`

- Description: TODO

#### Methods

<a id="member-3"></a>
##### `saveIfMissing(Coord gc, WaypointResultHandler<SaveMapGridResult> handler)`

- Description: TODO

<a id="member-4"></a>
##### `saveIfMissing(long mapSegmentId, int localX, int localY, long havenGridId, Coord originWorld)`

- Description: TODO

<a id="member-5"></a>
##### `onResolved(long havenGridId, ResolvedGrid grid, SaveMapGridResult result)`

- Description: TODO

<a id="member-6"></a>
##### `onSaveFailed(long havenGridId, Exception error)`

- Description: TODO

<a id="member-7"></a>
##### `private static synchronized void saveIfMissing(`

- Description: TODO

<a id="member-8"></a>
##### `mapFile()`

- Description: TODO
