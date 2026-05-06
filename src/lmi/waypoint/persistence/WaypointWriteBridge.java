package lmi.waypoint.persistence;

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
      return WpEdge.of(id, WaypointDatabase.findNodeById(conn, node0Id).graphId, node0Id, node1Id, direction, timeCost, fatigueCost);
    }

    long id = WaypointDatabase.insertWpEdge(
      conn,
      node1Id,
      node0Id,
      reversedDirection(direction),
      timeCost,
      fatigueCost
    );
    return WpEdge.of(
      id,
      WaypointDatabase.findNodeById(conn, node1Id).graphId,
      node1Id,
      node0Id,
      reversedDirection(direction),
      timeCost,
      fatigueCost
    );
  }

  public static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws Exception {
    return WaypointDatabase.insertWpSegment(conn, edgeId, step, gridId);
  }

  public static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,
                                   int mouseButton, Integer meshId) throws Exception {
    return WaypointDatabase.insertWpPoint(conn, segmentId, gridId, step, localX, localY, mouseButton, meshId);
  }

  public static void updateWpNode(Connection conn, WpNodeSnapshot snapshot) throws Exception {
    WaypointDatabase.updateWpNode(
      conn,
      snapshot.id,
      snapshot.graphId,
      snapshot.mapSegmentId,
      snapshot.gridId,
      snapshot.localX,
      snapshot.localY,
      snapshot.name
    );
  }

  private static int reversedDirection(int direction) {
    if (direction == FORWARD) return BACKWARD;
    if (direction == BACKWARD) return FORWARD;
    return direction;
  }
}
