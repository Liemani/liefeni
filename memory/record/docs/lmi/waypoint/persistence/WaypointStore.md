---
source: [WaypointStore.java](../../../../../../src/lmi/waypoint/persistence/WaypointStore.java)
created: 2026-06-13
updated: 2026-06-20
---

# WaypointStore

Provides the public asynchronous façade for waypoint persistence and batching, while delegating the actual JDBC work to `WaypointDbExecutor` and `WaypointDatabase`.

## Members

### Methods

#### `private WaypointStore()`
- Role: Prevents instantiation.
- Description: Static façade only.

#### `public static void initializeAsync(WaypointResultHandler<EmptyWaypointResult> handler)`
- Role: Enqueues waypoint DB initialization.
- Description: Submits the initialization work to the DB executor and returns the completion through the handler.

#### `public static void createNodeAsync(`
- Role: Enqueues waypoint node creation.
- Description: Wraps node creation in a write transaction and returns a `CreateNodeResult` through the handler.

#### `public static void loadNodesByGraphAsync(long graphId, WaypointResultHandler<LoadNodesByGraphResult> handler)`
- Role: Enqueues node loading by graph.
- Description: Reads `wp_node` rows for a graph and maps them to `WpNode` objects.

#### `public static void loadNodesByGridAsync(long gridId, WaypointResultHandler<LoadNodesByGridResult> handler)`
- Role: Enqueues node loading by grid.
- Description: Reads `wp_node` rows for a grid and maps them to `WpNode` objects.

#### `public static void loadEdgesByGraphAsync(long graphId, WaypointResultHandler<LoadEdgesByGraphResult> handler)`
- Role: Enqueues edge loading by graph.
- Description: Reads `wp_edge` rows for a graph and maps them to `WpEdge` objects.

#### `public static void loadSegmentsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadSegmentsByCutResult> handler)`
- Role: Enqueues segment loading by grid.
- Description: Reads `wp_segment` rows for a grid and maps them to `WpSegment` objects.

#### `public static void loadPointsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadPointsByCutResult> handler)`
- Role: Enqueues point loading by grid.
- Description: Reads `wp_point` rows for a grid and maps them to `WpPoint` objects.

#### `public static SaveBatchResult applySaveBatch(Connection conn, SaveBatch batch) throws Exception`
- Role: Applies a batched waypoint save on an existing connection.
- Description: Runs `WpNodeSnapshot` updates inside a transaction and commits or rolls back the connection.

#### `public static void saveMapGridIfMissingAsync(`
- Role: Enqueues map-grid bootstrap persistence.
- Description: Writes a waypoint `map_grid` row only when the Haven grid has not been stored yet.