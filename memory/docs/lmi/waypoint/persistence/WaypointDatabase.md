# WaypointDatabase

## Meta

- Source: [WaypointDatabase.java](../../../../../src/lmi/waypoint/persistence/WaypointDatabase.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Owns waypoint SQLite schema bootstrap and the low-level SQL helpers used by the persistence layer.
- It does not own async execution, lifecycle orchestration, or gameplay policy. Callers pass an open `Connection`, and `WaypointDatabase` only performs the SQL work.
- The helpers are grouped by responsibility:
  - schema bootstrap: `initialize(...)`, `createSchema(...)`, `saveSchemaVersion(...)`
  - read helpers: `loadNodesByGraph(...)`, `loadNodesByGridId(...)`, `loadEdgesByGraph(...)`, `loadSegmentsByGridId(...)`, `loadPointsByGridId(...)`
  - lookup helpers: `findNodeById(...)`, `findNodeByGraphAndGridLocal(...)`, `findMapGridIdByHavenId(...)`
  - write helpers: `createNode(...)`, `insertWpNode(...)`, `insertWpGraph(...)`, `insertWpEdge(...)`, `insertWpSegment(...)`, `insertWpPoint(...)`, `updateWpNode(...)`, `saveMapGridIfMissing(...)`, `saveMapSegmentIfMissing(...)`
- The class is intentionally narrow: one place for SQL strings, constraints, and row mapping so higher layers do not duplicate schema knowledge.

## Code Members

### Member Index

#### Constants

- [WAYPOINT_SCHEMA_NAMESPACE](#member-1)
- [WAYPOINT_SCHEMA_VERSION](#member-2)

#### Methods

- [static void initialize(Connection conn) throws Exception](#member-3)
- [static CreateNodeResult createNode(](#member-4)
- [loadNodesByGraph(Connection conn, long graphId)](#member-5)
- [loadNodesByGridId(Connection conn, long gridId)](#member-6)
- [findNodeById(Connection conn, long wpNodeId)](#member-7)
- [findNodeByGraphAndGridLocal(Connection conn, long graphId, long gridId, int localX, int localY)](#member-8)
- [loadEdgesByGraph(Connection conn, long graphId)](#member-9)
- [loadSegmentsByGridId(Connection conn, long gridId)](#member-10)
- [loadSegmentsByGraphAndCut(Connection conn, long graphId, int cutId)](#member-11)
- [loadPointsByGridId(Connection conn, long gridId)](#member-12)
- [loadPointsByGraphAndCut(Connection conn, long graphId, int cutId)](#member-13)
- [static String jdbcUrl() throws Exception](#member-14)
- [private static void enableForeignKeys(Connection conn) throws SQLException](#member-15)
- [private static void ensureSchemaVersionTable(Connection conn) throws SQLException](#member-16)
- [private static Integer loadSchemaVersion(Connection conn) throws SQLException](#member-17)
- [private static void saveSchemaVersion(Connection conn, int version) throws SQLException](#member-18)
- [private static void createSchema(Connection conn) throws SQLException](#member-19)
- [static long insertWpNode(Connection conn, long graphId, long gridId, int localX, int localY, String name) throws SQLException](#member-20)
- [private static long insertWpNode(Connection conn, long graphId, int localX, int localY, String name) throws SQLException](#member-21)
- [private static long insertWpGraph(Connection conn) throws SQLException](#member-22)
- [static long insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,](#member-23)
- [static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws SQLException](#member-24)
- [static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,](#member-25)
- [static void updateWpNode(Connection conn, long id, long graphId, long gridId, int localX, int localY,](#member-26)
- [static long saveMapGridIfMissing(Connection conn, long mapSegmentId, int localX, int localY, long havenGridId) throws SQLException](#member-27)
- [private static Long findMapGridIdByHavenId(Connection conn, long havenGridId) throws SQLException](#member-28)
- [private static void saveMapSegmentIfMissing(Connection conn, long mapSegmentId) throws SQLException](#member-29)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `WAYPOINT_SCHEMA_NAMESPACE`

- Description: TODO

<a id="member-2"></a>
##### `WAYPOINT_SCHEMA_VERSION`

- Description: TODO

#### Methods

<a id="member-3"></a>
##### `static void initialize(Connection conn) throws Exception`

- Description: TODO

<a id="member-4"></a>
##### `static CreateNodeResult createNode(`

- Description: TODO

<a id="member-5"></a>
##### `loadNodesByGraph(Connection conn, long graphId)`

- Description: TODO

<a id="member-6"></a>
##### `loadNodesByGridId(Connection conn, long gridId)`

- Description: TODO

<a id="member-7"></a>
##### `findNodeById(Connection conn, long wpNodeId)`

- Description: TODO

<a id="member-8"></a>
##### `findNodeByGraphAndGridLocal(Connection conn, long graphId, long gridId, int localX, int localY)`

- Description: TODO

<a id="member-9"></a>
##### `loadEdgesByGraph(Connection conn, long graphId)`

- Description: TODO

<a id="member-10"></a>
##### `loadSegmentsByGridId(Connection conn, long gridId)`

- Description: TODO

<a id="member-11"></a>
##### `loadSegmentsByGraphAndCut(Connection conn, long graphId, int cutId)`

- Description: TODO

<a id="member-12"></a>
##### `loadPointsByGridId(Connection conn, long gridId)`

- Description: TODO

<a id="member-13"></a>
##### `loadPointsByGraphAndCut(Connection conn, long graphId, int cutId)`

- Description: TODO

<a id="member-14"></a>
##### `static String jdbcUrl() throws Exception`

- Description: TODO

<a id="member-15"></a>
##### `private static void enableForeignKeys(Connection conn) throws SQLException`

- Description: TODO

<a id="member-16"></a>
##### `private static void ensureSchemaVersionTable(Connection conn) throws SQLException`

- Description: TODO

<a id="member-17"></a>
##### `private static Integer loadSchemaVersion(Connection conn) throws SQLException`

- Description: TODO

<a id="member-18"></a>
##### `private static void saveSchemaVersion(Connection conn, int version) throws SQLException`

- Description: TODO

<a id="member-19"></a>
##### `private static void createSchema(Connection conn) throws SQLException`

- Description: TODO

<a id="member-20"></a>
##### `static long insertWpNode(Connection conn, long graphId, long gridId, int localX, int localY, String name) throws SQLException`

- Description: TODO

<a id="member-21"></a>
##### `private static long insertWpNode(Connection conn, long graphId, int localX, int localY, String name) throws SQLException`

- Description: TODO

<a id="member-22"></a>
##### `private static long insertWpGraph(Connection conn) throws SQLException`

- Description: TODO

<a id="member-23"></a>
##### `static long insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,`

- Description: TODO

<a id="member-24"></a>
##### `static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws SQLException`

- Description: TODO

<a id="member-25"></a>
##### `static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,`

- Description: TODO

<a id="member-26"></a>
##### `static void updateWpNode(Connection conn, long id, long graphId, long gridId, int localX, int localY,`

- Description: TODO

<a id="member-27"></a>
##### `static long saveMapGridIfMissing(Connection conn, long mapSegmentId, int localX, int localY, long havenGridId) throws SQLException`

- Description: TODO

<a id="member-28"></a>
##### `private static Long findMapGridIdByHavenId(Connection conn, long havenGridId) throws SQLException`

- Description: TODO

<a id="member-29"></a>
##### `private static void saveMapSegmentIfMissing(Connection conn, long mapSegmentId) throws SQLException`

- Description: TODO## `wp_meta`

- `key: TEXT PRIMARY KEY`
- `value: TEXT NOT NULL`

Used for schema version storage under `waypoint.schema_version`.

Column purpose:

- `key`
  - identifies a single persisted metadata entry
- `value`
  - stores the serialized metadata payload as text

## `map_segment`

- `id: INTEGER PRIMARY KEY`

Represents a Haven `MapFile.Segment` row by id only.

Column purpose:

- `id`
  - stable Haven segment id reused as the primary key

## `map_grid`

- `id: INTEGER PRIMARY KEY`
- `map_segment_id: INTEGER NOT NULL`
- `local_x: INTEGER NOT NULL`
- `local_y: INTEGER NOT NULL`
- `haven_id: INTEGER UNIQUE`

Constraints:

- `FOREIGN KEY (map_segment_id) REFERENCES map_segment(id)`
- `UNIQUE (map_segment_id, local_x, local_y)`

Meaning:

- `haven_id` is the Haven `MCache.Grid.id`
- `map_segment_id` is the Haven `MapFile.Segment.id`
- `local_x/local_y` store the grid origin world coordinate

Column purpose:

- `id`
  - internal waypoint FK key used by `wp_node`, `wp_segment`, and `wp_point`
- `map_segment_id`
  - groups grids under the Haven segment they belong to
- `local_x`
  - stores the world-space x coordinate of the grid origin
- `local_y`
  - stores the world-space y coordinate of the grid origin
- `haven_id`
  - remembers the original Haven grid id so the same grid can be recognized again

## `wp_graph`

- `id: INTEGER PRIMARY KEY`

Stores one navigation graph id.

Column purpose:

- `id`
  - stable graph key for one navigation graph

## `wp_node`

- `id: INTEGER PRIMARY KEY`
- `graph_id: INTEGER NOT NULL`
- `grid_id: INTEGER NOT NULL`
- `local_x: INTEGER NOT NULL`
- `local_y: INTEGER NOT NULL`
- `name: TEXT NOT NULL`

Constraints:

- `FOREIGN KEY (graph_id) REFERENCES wp_graph(id)`
- `FOREIGN KEY (grid_id) REFERENCES map_grid(id)`
- `UNIQUE (grid_id, local_x, local_y)`

Column purpose:

- `id`
  - node identity inside a graph
- `graph_id`
  - groups nodes into one navigation graph
- `grid_id`
  - anchors the node to one waypoint grid
- `local_x`
  - local x offset within the grid
- `local_y`
  - local y offset within the grid
- `name`
  - user-visible node label

## `wp_edge`

- `id: INTEGER PRIMARY KEY`
- `graph_id: INTEGER NOT NULL`
- `node0_id: INTEGER NOT NULL`
- `node1_id: INTEGER NOT NULL`
- `direction: INTEGER NOT NULL`
- `time_cost: DOUBLE NOT NULL`
- `fatigue_cost: DOUBLE NOT NULL`

Constraints:

- `FOREIGN KEY (graph_id) REFERENCES wp_graph(id)`
- `FOREIGN KEY (node0_id) REFERENCES wp_node(id)`
- `FOREIGN KEY (node1_id) REFERENCES wp_node(id)`
- `CHECK (direction IN (0, 1, 2, 3))`
- `CHECK (node0_id <> node1_id)`
- `CHECK (node0_id < node1_id)`
- `UNIQUE (node0_id, node1_id)`

Column purpose:

- `id`
  - edge identity inside a graph
- `graph_id`
  - keeps the edge in the same graph as its nodes
- `node0_id`
  - canonical first endpoint
- `node1_id`
  - canonical second endpoint
- `direction`
  - remembers traversal direction of the edge
- `time_cost`
  - stores travel cost in time units
- `fatigue_cost`
  - stores travel cost in stamina / fatigue units

## `wp_segment`

- `id: INTEGER PRIMARY KEY`
- `grid_id: INTEGER NOT NULL`
- `edge_id: INTEGER NOT NULL`
- `step: INTEGER NOT NULL`

Constraints:

- `FOREIGN KEY (grid_id) REFERENCES map_grid(id)`
- `FOREIGN KEY (edge_id) REFERENCES wp_edge(id)`
- `UNIQUE (edge_id, step)`

Column purpose:

- `id`
  - segment identity inside a recorded edge
- `grid_id`
  - anchors the segment to one waypoint grid
- `edge_id`
  - links the segment back to the owning edge
- `step`
  - preserves the segment order along the edge

## `wp_point`

- `id: INTEGER PRIMARY KEY`
- `grid_id: INTEGER NOT NULL`
- `local_x: INTEGER NOT NULL`
- `local_y: INTEGER NOT NULL`
- `segment_id: INTEGER NOT NULL`
- `step: INTEGER NOT NULL`
- `mouse_button: INTEGER NOT NULL`
- `mesh_id: INTEGER`

Constraints:

- `FOREIGN KEY (grid_id) REFERENCES map_grid(id)`
- `FOREIGN KEY (segment_id) REFERENCES wp_segment(id)`
- `CHECK (mouse_button IN (1, 3))`
- `UNIQUE (segment_id, step)`

Column purpose:

- `id`
  - point identity inside a recorded segment
- `grid_id`
  - anchors the point to one waypoint grid
- `local_x`
  - local x offset of the recorded click inside the grid
- `local_y`
  - local y offset of the recorded click inside the grid
- `segment_id`
  - links the point back to its recorded segment
- `step`
  - preserves the point order within the segment
- `mouse_button`
  - remembers which mouse button produced the click
- `mesh_id`
  - stores the interacted mesh id when the click came from a specific mesh target

## Versioning

- schema version row lives in `wp_meta`
- current namespace key is `waypoint.schema_version`
- mismatch currently fails fast; migrations are not implemented yet
