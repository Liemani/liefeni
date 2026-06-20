---
source: [WaypointWriteBridge.java](../../../../../src/lmi/waypoint/persistence/WaypointWriteBridge.java)
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
- Description: Constructs the instance and initializes its default state.

#### `public static WpEdge insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,`
- Role: Mutates the insert wp edge state.
- Description: Supports the insert wp edge operation used by the surrounding class.

#### `public static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws Exception`
- Role: Mutates the insert wp segment state.
- Description: Supports the insert wp segment operation used by the surrounding class.

#### `public static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,`
- Role: Mutates the insert wp point state.
- Description: Supports the insert wp point operation used by the surrounding class.

#### `public static void updateWpNode(Connection conn, WpNodeSnapshot snapshot) throws Exception`
- Role: Mutates the update wp node state.
- Description: Supports the update wp node operation used by the surrounding class.

#### `private static int reversedDirection(int direction)`
- Role: Performs reversed direction.
- Description: Supports the reversed direction operation used by the surrounding class.
