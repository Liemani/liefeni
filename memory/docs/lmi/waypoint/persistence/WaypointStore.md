# WaypointStore

## Meta

- Source: [WaypointStore.java](../../../../../src/lmi/waypoint/persistence/WaypointStore.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Provides the public facade for waypoint DB requests.
- Exposes async entry points for reads, writes, and current-grid save requests.

## Code Members

### Member Index

#### Methods

- [initializeAsync(WaypointResultHandler<EmptyWaypointResult> handler)](#member-1)
- [public static void createNodeAsync(](#member-2)
- [loadNodesByGraphAsync(long graphId, WaypointResultHandler<LoadNodesByGraphResult> handler)](#member-3)
- [loadNodesByGridAsync(long gridId, WaypointResultHandler<LoadNodesByGridResult> handler)](#member-4)
- [loadEdgesByGraphAsync(long graphId, WaypointResultHandler<LoadEdgesByGraphResult> handler)](#member-5)
- [loadSegmentsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadSegmentsByCutResult> handler)](#member-6)
- [loadPointsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadPointsByCutResult> handler)](#member-7)
- [public static SaveBatchResult applySaveBatch(Connection conn, SaveBatch batch) throws Exception](#member-8)
- [public static void saveMapGridIfMissingAsync(](#member-9)

### Member Reference

#### Methods

<a id="member-1"></a>
##### `initializeAsync(WaypointResultHandler<EmptyWaypointResult> handler)`

- Description: TODO

<a id="member-2"></a>
##### `public static void createNodeAsync(`

- Description: TODO

<a id="member-3"></a>
##### `loadNodesByGraphAsync(long graphId, WaypointResultHandler<LoadNodesByGraphResult> handler)`

- Description: TODO

<a id="member-4"></a>
##### `loadNodesByGridAsync(long gridId, WaypointResultHandler<LoadNodesByGridResult> handler)`

- Description: TODO

<a id="member-5"></a>
##### `loadEdgesByGraphAsync(long graphId, WaypointResultHandler<LoadEdgesByGraphResult> handler)`

- Description: TODO

<a id="member-6"></a>
##### `loadSegmentsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadSegmentsByCutResult> handler)`

- Description: TODO

<a id="member-7"></a>
##### `loadPointsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadPointsByCutResult> handler)`

- Description: TODO

<a id="member-8"></a>
##### `public static SaveBatchResult applySaveBatch(Connection conn, SaveBatch batch) throws Exception`

- Description: TODO

<a id="member-9"></a>
##### `public static void saveMapGridIfMissingAsync(`

- Description: TODO
