---
source: [WaypointDatabase.java](../../../../../../src/lmi/waypoint/persistence/WaypointDatabase.java)
created: 2026-06-13
updated: 2026-06-20
---

# WaypointDatabase

Provides the low-level SQL helpers for waypoint persistence, including schema initialization, direct row lookups, and row inserts/updates.

## Members

### Constants

#### `private static final String WAYPOINT_SCHEMA_NAMESPACE = "waypoint"`
- Role: Names the waypoint schema namespace.
- Description: Used for schema metadata and versioning.
- Value: `"waypoint"`

#### `private static final int WAYPOINT_SCHEMA_VERSION = 1`
- Role: Declares the current waypoint schema version.
- Description: Compared against the stored DB version during initialization.
- Value: `1`

### Methods

#### `private WaypointDatabase()`
- Role: Prevents instantiation.
- Description: SQL helper class only.

#### `static void initialize(Connection conn) throws Exception`
- Role: Initializes the waypoint database schema state.
- Description: Enables foreign keys, checks schema version metadata, and creates the schema on first run.

#### `static CreateNodeResult createNode(`
- Role: Creates a waypoint node record.
- Description: Creates a graph when needed, checks for duplicate node positions, and inserts a new `wp_node` row.

#### `static ArrayList<WpNodeRecord> loadNodesByGraph(Connection conn, long graphId)`
- Role: Loads waypoint nodes for a graph.
- Description: Returns `wp_node` rows ordered by id for the given graph.

#### `static ArrayList<WpNodeRecord> loadNodesByGridId(Connection conn, long gridId)`
- Role: Loads waypoint nodes for a grid.
- Description: Returns `wp_node` rows ordered by id for the given grid.

#### `static WpNodeRecord findNodeById(Connection conn, long wpNodeId)`
- Role: Finds one waypoint node by id.
- Description: Returns the matching `wp_node` row or `null`.

#### `static WpNodeRecord findNodeByGraphAndGridLocal(Connection conn, long graphId, long gridId, int localX, int localY)`
- Role: Finds a node by graph and local grid coordinates.
- Description: Returns the first matching `wp_node` row for the given graph and local position.

#### `static ArrayList<WpEdgeRecord> loadEdgesByGraph(Connection conn, long graphId)`
- Role: Loads waypoint edges for a graph.
- Description: Returns `wp_edge` rows ordered by id for the given graph.

#### `static ArrayList<WpSegmentRecord> loadSegmentsByGridId(Connection conn, long gridId)`
- Role: Loads waypoint segments for a grid.
- Description: Returns `wp_segment` rows ordered by edge, step, and id for the given grid.

#### `static ArrayList<WpSegmentRecord> loadSegmentsByGraphAndCut(Connection conn, long graphId, int cutId)`
- Role: Compatibility wrapper for loading segments.
- Description: Delegates to `loadSegmentsByGridId(...)` with the current grid/cut identifier model.

#### `static ArrayList<WpPointRecord> loadPointsByGridId(Connection conn, long gridId)`
- Role: Loads waypoint points for a grid.
- Description: Returns `wp_point` rows ordered by segment and step for the given grid.

#### `static ArrayList<WpPointRecord> loadPointsByGraphAndCut(Connection conn, long graphId, int cutId)`
- Role: Compatibility wrapper for loading points.
- Description: Delegates to `loadPointsByGridId(...)` with the current grid/cut identifier model.

#### `static String jdbcUrl() throws Exception`
- Role: Builds the SQLite JDBC URL.
- Description: Locates the running JAR or classpath base, ensures `data/`, and points at `data/liefeni.db`.

#### `private static void enableForeignKeys(Connection conn) throws SQLException`
- Role: Enables SQLite foreign keys.
- Description: Runs the `PRAGMA foreign_keys = ON` statement.

#### `private static void ensureSchemaVersionTable(Connection conn) throws SQLException`
- Role: Ensures the schema version metadata table exists.
- Description: Creates the `wp_meta` table if it does not exist.

#### `private static Integer loadSchemaVersion(Connection conn) throws SQLException`
- Role: Reads the stored schema version.
- Description: Returns the version value from `wp_meta`, or `null` when it has not been stored yet.

#### `private static void saveSchemaVersion(Connection conn, int version) throws SQLException`
- Role: Persists the schema version.
- Description: Stores the current version in `wp_meta`.

#### `private static void createSchema(Connection conn) throws SQLException`
- Role: Creates the waypoint schema.
- Description: Creates the `wp_graph`, `wp_node`, `wp_edge`, `wp_segment`, `wp_point`, `map_segment`, and `map_grid` tables plus indexes.

#### `static long insertWpNode(Connection conn, long graphId, long gridId, int localX, int localY, String name) throws SQLException`
- Role: Inserts a waypoint node with an explicit grid id.
- Description: Writes a `wp_node` row for the given graph, grid, local coordinates, and name.

#### `private static long insertWpNode(Connection conn, long graphId, int localX, int localY, String name) throws SQLException`
- Role: Inserts a waypoint node without a grid id.
- Description: Legacy helper that writes a `wp_node` row using the graph-local coordinates.

#### `private static long insertWpGraph(Connection conn) throws SQLException`
- Role: Inserts a waypoint graph row.
- Description: Creates a new `wp_graph` row and returns its id.

#### `static long insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,`
- Role: Inserts a waypoint edge row.
- Description: Writes a `wp_edge` row that connects two nodes with direction and cost values.

#### `static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws SQLException`
- Role: Inserts a waypoint segment row.
- Description: Writes a `wp_segment` row for an edge step on a specific grid.

#### `static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,`
- Role: Inserts a waypoint point row.
- Description: Writes a `wp_point` row that records a local click position within a segment.

#### `static void updateWpNode(Connection conn, long id, long graphId, long gridId, int localX, int localY,`
- Role: Updates a waypoint node row.
- Description: Rewrites the stored waypoint node coordinates and related metadata.

#### `static long saveMapGridIfMissing(Connection conn, long mapSegmentId, int localX, int localY, long havenGridId) throws SQLException`
- Role: Ensures a `map_grid` row exists for the Haven grid.
- Description: Inserts the matching `map_segment` first when needed, then inserts or returns the existing `map_grid` row.

#### `private static Long findMapGridIdByHavenId(Connection conn, long havenGridId) throws SQLException`
- Role: Looks up a `map_grid` row by Haven grid id.
- Description: Returns the stored waypoint map-grid id for the supplied Haven grid id, or `null`.

#### `private static void saveMapSegmentIfMissing(Connection conn, long mapSegmentId) throws SQLException`
- Role: Ensures a `map_segment` row exists.
- Description: Inserts the segment row only when the segment id has not been stored yet.