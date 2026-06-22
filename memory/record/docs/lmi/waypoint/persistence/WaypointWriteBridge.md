---
source: [WaypointWriteBridge.java](../../../../../../src/lmi/waypoint/persistence/WaypointWriteBridge.java)
created: 2026-06-13
updated: 2026-06-14
---

# WaypointWriteBridge

Bridges waypoint write requests into the database executor.

## Members

### Constants

### Fields

### Methods

#### `private WaypointWriteBridge()`
- Role: Creates a new WaypointWriteBridge instance.
- Description: Constructs the WaypointWriteBridge instance from the supplied inputs.

#### `public static WpEdge insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,`
- Role: Inserts a waypoint edge row.
- Description: Writes the edge record and returns the created model.

#### `public static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws Exception`
- Role: Inserts a waypoint segment row.
- Description: Writes the segment record that links an edge to a grid.

#### `public static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,`
- Role: Inserts a waypoint point row.
- Description: Writes the point record for one sampled location.

#### `public static void updateWpNode(Connection conn, WpNodeSnapshot snapshot) throws Exception`
- Role: Updates a waypoint node row.
- Description: Persists the latest node snapshot back into the database.

#### `private static int reversedDirection(int direction)`
- Role: Returns the opposite direction code.
- Description: Mirrors the stored edge direction for reverse traversal.