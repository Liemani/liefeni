package lmi.waypoint.persistence;

import lmi.waypoint.managed.WpAnchorSnapshot;
import lmi.waypoint.managed.WpNodeSnapshot;
import lmi.waypoint.object.WpEdge;

import java.sql.Connection;

import static lmi.Constant.WaypointEdgeDirection.BACKWARD;
import static lmi.Constant.WaypointEdgeDirection.FORWARD;

public final class WaypointWriteBridge {
  private WaypointWriteBridge() {}

  public static WpEdge insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,
                                    double timeCost, double fatigueCost) throws Exception {
    if (node0Id < node1Id) {
      long id = WaypointDatabase.insertWpEdge(conn, node0Id, node1Id, direction, timeCost, fatigueCost);
      return WpEdge.of(id, node0Id, node1Id, direction, timeCost, fatigueCost);
    }

    long id = WaypointDatabase.insertWpEdge(
      conn,
      node1Id,
      node0Id,
      reversedDirection(direction),
      timeCost,
      fatigueCost
    );
    return WpEdge.of(id, node1Id, node0Id, reversedDirection(direction), timeCost, fatigueCost);
  }

  public static long insertWpSegment(Connection conn, long edgeId, int step, long graphId, long cutId) throws Exception {
    return WaypointDatabase.insertWpSegment(conn, edgeId, step, graphId, cutId);
  }

  public static long insertWpPoint(Connection conn, long segmentId, long cutId, int step, int virX, int virY,
                                   int mouseButton, Integer meshId) throws Exception {
    return WaypointDatabase.insertWpPoint(conn, segmentId, cutId, step, virX, virY, mouseButton, meshId);
  }

  public static void updateWpNode(Connection conn, WpNodeSnapshot snapshot) throws Exception {
    WaypointDatabase.updateWpNode(
      conn,
      snapshot.id,
      snapshot.graphId,
      snapshot.nodeRefId,
      snapshot.virX,
      snapshot.virY,
      snapshot.name
    );
  }

  public static long saveWpAnchor(Connection conn, WpAnchorSnapshot snapshot) throws Exception {
    if (snapshot.graphId == null)
      return WaypointDatabase.createWpAnchor(conn, snapshot.virX, snapshot.virY);

    WaypointDatabase.updateWpAnchor(conn, snapshot.graphId, snapshot.virX, snapshot.virY);
    return snapshot.graphId;
  }

  private static int reversedDirection(int direction) {
    if (direction == FORWARD) return BACKWARD;
    if (direction == BACKWARD) return FORWARD;
    return direction;
  }
}
