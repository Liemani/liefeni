---
source: [WaypointDatabase.java](../../../../../src/lmi/waypoint/persistence/WaypointDatabase.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointDatabase

Provides low-level SQL helpers for waypoint persistence.

## Members

### Constants

#### `private static final String WAYPOINT_SCHEMA_NAMESPACE = "waypoint"`
- Role: Defines the shared waypoint schema namespace constant.
- Description: Shared constant used by the rest of the class.

#### `private static final int WAYPOINT_SCHEMA_VERSION = 1`
- Role: Defines the shared waypoint schema version constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `private WaypointDatabase()`
- Role: Creates a new WaypointDatabase instance.
- Description: Constructs the instance and initializes its default state.

#### `static void initialize(Connection conn) throws Exception`
- Role: Handles the initialize workflow.
- Description: Supports the initialize operation used by the surrounding class.

#### `static CreateNodeResult createNode(`
- Role: Handles the create node workflow.
- Description: Supports the create node operation used by the surrounding class.

#### `static ArrayList<WpNodeRecord> loadNodesByGraph(Connection conn, long graphId)`
- Role: Coordinates load nodes by graph persistence or lookup.
- Description: Supports the load nodes by graph operation used by the surrounding class.

#### `static ArrayList<WpNodeRecord> loadNodesByGridId(Connection conn, long gridId)`
- Role: Coordinates load nodes by grid id persistence or lookup.
- Description: Supports the load nodes by grid id operation used by the surrounding class.

#### `static WpNodeRecord findNodeById(Connection conn, long wpNodeId)`
- Role: Returns the node by id.
- Description: Exposes the requested value without mutating state.

#### `static WpNodeRecord findNodeByGraphAndGridLocal(Connection conn, long graphId, long gridId, int localX, int localY)`
- Role: Finds a waypoint node by graph and local grid coordinates.
- Description: Supports the find node by graph and grid local operation used by the surrounding class.

#### `static ArrayList<WpEdgeRecord> loadEdgesByGraph(Connection conn, long graphId)`
- Role: Coordinates load edges by graph persistence or lookup.
- Description: Supports the load edges by graph operation used by the surrounding class.

#### `static ArrayList<WpSegmentRecord> loadSegmentsByGridId(Connection conn, long gridId)`
- Role: Coordinates load segments by grid id persistence or lookup.
- Description: Supports the load segments by grid id operation used by the surrounding class.

#### `static ArrayList<WpSegmentRecord> loadSegmentsByGraphAndCut(Connection conn, long graphId, int cutId)`
- Role: Coordinates load segments by graph and cut persistence or lookup.
- Description: Supports the load segments by graph and cut operation used by the surrounding class.

#### `static ArrayList<WpPointRecord> loadPointsByGridId(Connection conn, long gridId)`
- Role: Coordinates load points by grid id persistence or lookup.
- Description: Supports the load points by grid id operation used by the surrounding class.

#### `static ArrayList<WpPointRecord> loadPointsByGraphAndCut(Connection conn, long graphId, int cutId)`
- Role: Coordinates load points by graph and cut persistence or lookup.
- Description: Supports the load points by graph and cut operation used by the surrounding class.

#### `static String jdbcUrl() throws Exception`
- Role: Handles the jdbc url workflow.
- Description: Supports the jdbc url operation used by the surrounding class.

#### `private static void enableForeignKeys(Connection conn) throws SQLException`
- Role: Handles the enable foreign keys workflow.
- Description: Supports the enable foreign keys operation used by the surrounding class.

#### `private static void ensureSchemaVersionTable(Connection conn) throws SQLException`
- Role: Coordinates ensure schema version table persistence or lookup.
- Description: Supports the ensure schema version table operation used by the surrounding class.

#### `private static Integer loadSchemaVersion(Connection conn) throws SQLException`
- Role: Coordinates load schema version persistence or lookup.
- Description: Supports the load schema version operation used by the surrounding class.

#### `private static void saveSchemaVersion(Connection conn, int version) throws SQLException`
- Role: Coordinates save schema version persistence or lookup.
- Description: Supports the save schema version operation used by the surrounding class.

#### `private static void createSchema(Connection conn) throws SQLException`
- Role: Handles the create schema workflow.
- Description: Supports the create schema operation used by the surrounding class.

#### `static long insertWpNode(Connection conn, long graphId, long gridId, int localX, int localY, String name) throws SQLException`
- Role: Mutates the insert wp node state.
- Description: Supports the insert wp node operation used by the surrounding class.

#### `private static long insertWpNode(Connection conn, long graphId, int localX, int localY, String name) throws SQLException`
- Role: Mutates the insert wp node state.
- Description: Supports the insert wp node operation used by the surrounding class.

#### `private static long insertWpGraph(Connection conn) throws SQLException`
- Role: Mutates the insert wp graph state.
- Description: Supports the insert wp graph operation used by the surrounding class.

#### `static long insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,`
- Role: Mutates the insert wp edge state.
- Description: Supports the insert wp edge operation used by the surrounding class.

#### `static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws SQLException`
- Role: Mutates the insert wp segment state.
- Description: Supports the insert wp segment operation used by the surrounding class.

#### `static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,`
- Role: Mutates the insert wp point state.
- Description: Supports the insert wp point operation used by the surrounding class.

#### `static void updateWpNode(Connection conn, long id, long graphId, long gridId, int localX, int localY,`
- Role: Mutates the update wp node state.
- Description: Supports the update wp node operation used by the surrounding class.

#### `static long saveMapGridIfMissing(Connection conn, long mapSegmentId, int localX, int localY, long havenGridId) throws SQLException`
- Role: Coordinates save map grid if missing persistence or lookup.
- Description: Supports the save map grid if missing operation used by the surrounding class.

#### `private static Long findMapGridIdByHavenId(Connection conn, long havenGridId) throws SQLException`
- Role: Handles the find map grid id by haven id workflow.
- Description: Supports the find map grid id by haven id operation used by the surrounding class.

#### `private static void saveMapSegmentIfMissing(Connection conn, long mapSegmentId) throws SQLException`
- Role: Coordinates save map segment if missing persistence or lookup.
- Description: Supports the save map segment if missing operation used by the surrounding class.
