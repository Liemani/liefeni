# WaypointDatabase

This file documents the responsibilities and members of `WaypointDatabase`.

## Meta

- Source: [WaypointDatabase.java](../../../../../src/lmi/waypoint/persistence/WaypointDatabase.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Owns waypoint SQLite schema bootstrap and the low-level SQL helpers used by the persistence layer.
It does not own async execution, lifecycle orchestration, or gameplay policy. Callers pass an open `Connection`, and `WaypointDatabase` only performs the SQL work.
The helpers are grouped by responsibility:
  - schema bootstrap: `initialize(...)`, `createSchema(...)`, `saveSchemaVersion(...)`
  - read helpers: `loadNodesByGraph(...)`, `loadNodesByGridId(...)`, `loadEdgesByGraph(...)`, `loadSegmentsByGridId(...)`, `loadPointsByGridId(...)`
  - lookup helpers: `findNodeById(...)`, `findNodeByGraphAndGridLocal(...)`, `findMapGridIdByHavenId(...)`
  - write helpers: `createNode(...)`, `insertWpNode(...)`, `insertWpGraph(...)`, `insertWpEdge(...)`, `insertWpSegment(...)`, `insertWpPoint(...)`, `updateWpNode(...)`, `saveMapGridIfMissing(...)`, `saveMapSegmentIfMissing(...)`
The class is intentionally narrow: one place for SQL strings, constraints, and row mapping so higher layers do not duplicate schema knowledge.

## Members

### Constants

#### `private static final String WAYPOINT_SCHEMA_NAMESPACE = "waypoint"`

- Description: TODO

#### `private static final int WAYPOINT_SCHEMA_VERSION = 1`

- Description: TODO

### Fields

### Methods

#### `private WaypointDatabase()`

- Description: TODO

#### `static void initialize(Connection conn) throws Exception`

- Description: TODO

#### `static CreateNodeResult createNode(`

- Description: TODO

#### `static ArrayList<WpNodeRecord> loadNodesByGraph(Connection conn, long graphId)`

- Description: TODO

#### `static ArrayList<WpNodeRecord> loadNodesByGridId(Connection conn, long gridId)`

- Description: TODO

#### `static WpNodeRecord findNodeById(Connection conn, long wpNodeId)`

- Description: TODO

#### `static WpNodeRecord findNodeByGraphAndGridLocal(Connection conn, long graphId, long gridId, int localX, int localY)`

- Description: TODO

#### `static ArrayList<WpEdgeRecord> loadEdgesByGraph(Connection conn, long graphId)`

- Description: TODO

#### `static ArrayList<WpSegmentRecord> loadSegmentsByGridId(Connection conn, long gridId)`

- Description: TODO

#### `static ArrayList<WpSegmentRecord> loadSegmentsByGraphAndCut(Connection conn, long graphId, int cutId)`

- Description: TODO

#### `static ArrayList<WpPointRecord> loadPointsByGridId(Connection conn, long gridId)`

- Description: TODO

#### `static ArrayList<WpPointRecord> loadPointsByGraphAndCut(Connection conn, long graphId, int cutId)`

- Description: TODO

#### `static String jdbcUrl() throws Exception`

- Description: TODO

#### `private static void enableForeignKeys(Connection conn) throws SQLException`

- Description: TODO

#### `private static void ensureSchemaVersionTable(Connection conn) throws SQLException`

- Description: TODO

#### `private static Integer loadSchemaVersion(Connection conn) throws SQLException`

- Description: TODO

#### `private static void saveSchemaVersion(Connection conn, int version) throws SQLException`

- Description: TODO

#### `private static void createSchema(Connection conn) throws SQLException`

- Description: TODO

#### `static long insertWpNode(Connection conn, long graphId, long gridId, int localX, int localY, String name) throws SQLException`

- Description: TODO

#### `private static long insertWpNode(Connection conn, long graphId, int localX, int localY, String name) throws SQLException`

- Description: TODO

#### `private static long insertWpGraph(Connection conn) throws SQLException`

- Description: TODO

#### `static long insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,`

- Description: TODO

#### `static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws SQLException`

- Description: TODO

#### `static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,`

- Description: TODO

#### `static void updateWpNode(Connection conn, long id, long graphId, long gridId, int localX, int localY,`

- Description: TODO

#### `static long saveMapGridIfMissing(Connection conn, long mapSegmentId, int localX, int localY, long havenGridId) throws SQLException`

- Description: TODO

#### `private static Long findMapGridIdByHavenId(Connection conn, long havenGridId) throws SQLException`

- Description: TODO

#### `private static void saveMapSegmentIfMissing(Connection conn, long mapSegmentId) throws SQLException`

- Description: TODO
