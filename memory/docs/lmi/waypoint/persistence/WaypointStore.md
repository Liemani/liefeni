# WaypointStore

This file documents the responsibilities and members of `WaypointStore`.

## Meta

- Source: [WaypointStore.java](../../../../../src/lmi/waypoint/persistence/WaypointStore.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides the public facade for waypoint DB requests.
Exposes async entry points for reads, writes, and current-grid save requests.

## Members

### Constants

### Fields

### Methods

#### `private WaypointStore()`

- Description: TODO

#### `public static void initializeAsync(WaypointResultHandler<EmptyWaypointResult> handler)`

- Description: TODO

#### `public static void createNodeAsync(`

- Description: TODO

#### `public static void loadNodesByGraphAsync(long graphId, WaypointResultHandler<LoadNodesByGraphResult> handler)`

- Description: TODO

#### `public static void loadNodesByGridAsync(long gridId, WaypointResultHandler<LoadNodesByGridResult> handler)`

- Description: TODO

#### `public static void loadEdgesByGraphAsync(long graphId, WaypointResultHandler<LoadEdgesByGraphResult> handler)`

- Description: TODO

#### `public static void loadSegmentsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadSegmentsByCutResult> handler)`

- Description: TODO

#### `public static void loadPointsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadPointsByCutResult> handler)`

- Description: TODO

#### `public static SaveBatchResult applySaveBatch(Connection conn, SaveBatch batch) throws Exception`

- Description: TODO

#### `public static void saveMapGridIfMissingAsync(`

- Description: TODO
