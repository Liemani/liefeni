# WaypointWriteBridge

## Meta

- Source: [WaypointWriteBridge.java](../../../../../src/lmi/waypoint/persistence/WaypointWriteBridge.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Bridges waypoint recording state into persistence writes.

## Code Members

### Member Index

#### Methods

- [public static WpEdge insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,](#member-1)
- [public static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws Exception](#member-2)
- [public static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,](#member-3)
- [public static void updateWpNode(Connection conn, WpNodeSnapshot snapshot) throws Exception](#member-4)
- [reversedDirection(int direction)](#member-5)

### Member Reference

#### Methods

<a id="member-1"></a>
##### `public static WpEdge insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,`

- Description: TODO

<a id="member-2"></a>
##### `public static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws Exception`

- Description: TODO

<a id="member-3"></a>
##### `public static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,`

- Description: TODO

<a id="member-4"></a>
##### `public static void updateWpNode(Connection conn, WpNodeSnapshot snapshot) throws Exception`

- Description: TODO

<a id="member-5"></a>
##### `reversedDirection(int direction)`

- Description: TODO
