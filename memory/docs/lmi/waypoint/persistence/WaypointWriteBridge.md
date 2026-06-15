# WaypointWriteBridge

This file documents the responsibilities and members of `WaypointWriteBridge`.

## Meta

- Source: [WaypointWriteBridge.java](../../../../../src/lmi/waypoint/persistence/WaypointWriteBridge.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Bridges waypoint recording state into persistence writes.

## Members

### Constants

### Fields

### Methods

#### `private WaypointWriteBridge()`

- Description: TODO

#### `public static WpEdge insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,`

- Description: TODO

#### `public static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws Exception`

- Description: TODO

#### `public static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,`

- Description: TODO

#### `public static void updateWpNode(Connection conn, WpNodeSnapshot snapshot) throws Exception`

- Description: TODO

#### `private static int reversedDirection(int direction)`

- Description: TODO
