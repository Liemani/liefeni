package lmi.waypoint.persistence;

import lmi.waypoint.managed.WpNodeSnapshot;

import java.sql.Connection;

import static lmi.Constant.WaypointEdgeDirection.BACKWARD;
import static lmi.Constant.WaypointEdgeDirection.FORWARD;

public final class WaypointWriteBridge {
  private WaypointWriteBridge() {}

  public static long insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,
                                  double timeCost, double fatigueCost) throws Exception {
    if (node0Id < node1Id)
      return WaypointDatabase._insertWpEdge(conn, node0Id, node1Id, direction, timeCost, fatigueCost);

    return WaypointDatabase._insertWpEdge(
      conn,
      node1Id,
      node0Id,
      _reversedDirection(direction),
      timeCost,
      fatigueCost
    );
  }

  public static long insertWpSegment(Connection conn, long edgeId, int step, long graphId) throws Exception {
    return WaypointDatabase._insertWpSegment(conn, edgeId, step, graphId);
  }

  public static void insertWpPoint(Connection conn, long segmentId, int step, int virX, int virY,
                                   int mouseButton, Integer meshId) throws Exception {
    WaypointDatabase._insertWpPoint(conn, segmentId, step, virX, virY, mouseButton, meshId);
  }

  public static void updateWpNode(Connection conn, WpNodeSnapshot snapshot) throws Exception {
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

  private static int _reversedDirection(int direction) {
    if (direction == FORWARD) return BACKWARD;
    if (direction == BACKWARD) return FORWARD;
    return direction;
  }
}
