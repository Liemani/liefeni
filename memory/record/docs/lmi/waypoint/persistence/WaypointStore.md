---
source: [WaypointStore.java](../../../../../src/lmi/waypoint/persistence/WaypointStore.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointStore

Coordinates high-level waypoint persistence requests and batching.

## Members

### Constants

### Fields

### Methods

#### `private WaypointStore()`
- Role: Creates a new WaypointStore instance.
- Description: Constructs the instance and initializes its default state.

#### `public static void initializeAsync(WaypointResultHandler<EmptyWaypointResult> handler)`
- Role: Performs initialize async.
- Description: Supports the initialize async operation used by the surrounding class.

#### `public static void createNodeAsync(`
- Role: Handles the create node async workflow.
- Description: Supports the create node async operation used by the surrounding class.

#### `public static void loadNodesByGraphAsync(long graphId, WaypointResultHandler<LoadNodesByGraphResult> handler)`
- Role: Coordinates load nodes by graph async persistence or lookup.
- Description: Supports the load nodes by graph async operation used by the surrounding class.

#### `public static void loadNodesByGridAsync(long gridId, WaypointResultHandler<LoadNodesByGridResult> handler)`
- Role: Coordinates load nodes by grid async persistence or lookup.
- Description: Supports the load nodes by grid async operation used by the surrounding class.

#### `public static void loadEdgesByGraphAsync(long graphId, WaypointResultHandler<LoadEdgesByGraphResult> handler)`
- Role: Coordinates load edges by graph async persistence or lookup.
- Description: Supports the load edges by graph async operation used by the surrounding class.

#### `public static void loadSegmentsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadSegmentsByCutResult> handler)`
- Role: Coordinates load segments by grid async persistence or lookup.
- Description: Supports the load segments by grid async operation used by the surrounding class.

#### `public static void loadPointsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadPointsByCutResult> handler)`
- Role: Coordinates load points by grid async persistence or lookup.
- Description: Supports the load points by grid async operation used by the surrounding class.

#### `public static SaveBatchResult applySaveBatch(Connection conn, SaveBatch batch) throws Exception`
- Role: Handles the apply save batch workflow.
- Description: Supports the apply save batch operation used by the surrounding class.

#### `public static void saveMapGridIfMissingAsync(`
- Role: Coordinates save map grid if missing async persistence or lookup.
- Description: Supports the save map grid if missing async operation used by the surrounding class.
