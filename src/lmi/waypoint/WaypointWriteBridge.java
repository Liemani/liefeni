package lmi.waypoint;

import lmi.waypoint.managed.WpNodeSnapshot;

import java.sql.Connection;

final class WaypointWriteBridge {
  private WaypointWriteBridge() {}

  static long insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,
                           double timeCost, double fatigueCost) throws Exception {
    return WaypointDatabase._insertWpEdge(conn, node0Id, node1Id, direction, timeCost, fatigueCost);
  }

  static long insertWpSegment(Connection conn, long edgeId, int step, long graphId) throws Exception {
    return WaypointDatabase._insertWpSegment(conn, edgeId, step, graphId);
  }

  static void insertWpPoint(Connection conn, long segmentId, int step, int virX, int virY,
                            int mouseButton, Integer meshId) throws Exception {
    WaypointDatabase._insertWpPoint(conn, segmentId, step, virX, virY, mouseButton, meshId);
  }

  static void updateWpNode(Connection conn, WpNodeSnapshot snapshot) throws Exception {
    WaypointDatabase._updateWpNode(
      conn,
      snapshot.id,
      snapshot.graphId,
      snapshot.nodeRefId,
      snapshot.virX,
      snapshot.virY,
      snapshot.name
    );
  }
}
