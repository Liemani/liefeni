package lmi.waypoint;

import lmi.waypoint.model.GobNodeRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

final class GobGraphMerger {
  private GobGraphMerger() {}

  static GraphMerge merge(Connection conn, Endpoint start, GobNodeRecord startRecord,
                          Endpoint end, GobNodeRecord endRecord) throws SQLException {
    long startCount = _countGobNodes(conn, startRecord.graphId);
    long endCount = _countGobNodes(conn, endRecord.graphId);

    GobNodeRecord keep = (startCount >= endCount) ? startRecord : endRecord;
    GobNodeRecord move = (keep == startRecord) ? endRecord : startRecord;
    Endpoint keepEndpoint = (keep == startRecord) ? start : end;
    Endpoint moveEndpoint = (move == startRecord) ? start : end;

    int targetVirX = keep.virX + (moveEndpoint.x - keepEndpoint.x);
    int targetVirY = keep.virY + (moveEndpoint.y - keepEndpoint.y);
    int deltaX = targetVirX - move.virX;
    int deltaY = targetVirY - move.virY;

    _translateGraph(conn, move.graphId, keep.graphId, deltaX, deltaY);
    return GraphMerge.merged(keep.graphId, keep.id);
  }

  private static long _countGobNodes(Connection conn, long graphId) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "SELECT COUNT(*) FROM gob_node WHERE graph_id = ?")) {
      stmt.setLong(1, graphId);
      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) return rs.getLong(1);
      }
    }
    return 0;
  }

  private static void _translateGraph(Connection conn, long fromGraphId, long toGraphId, int deltaX, int deltaY) throws SQLException {
    try (PreparedStatement updatePoints = conn.prepareStatement(
           "UPDATE wp_point SET vir_x = vir_x + ?, vir_y = vir_y + ? " +
           "WHERE segment_id IN (SELECT id FROM wp_segment WHERE gob_graph_id = ?)");
         PreparedStatement updateSegments = conn.prepareStatement(
           "UPDATE wp_segment SET gob_graph_id = ? WHERE gob_graph_id = ?");
         PreparedStatement updateWpNodes = conn.prepareStatement(
           "UPDATE wp_node SET gob_graph_id = ?, vir_x = vir_x + ?, vir_y = vir_y + ? WHERE gob_graph_id = ?");
         PreparedStatement updateGobNodes = conn.prepareStatement(
           "UPDATE gob_node SET graph_id = ?, vir_x = vir_x + ?, vir_y = vir_y + ? WHERE graph_id = ?");
         PreparedStatement deleteGraph = conn.prepareStatement(
           "DELETE FROM gob_graph WHERE id = ?")) {
      updatePoints.setInt(1, deltaX);
      updatePoints.setInt(2, deltaY);
      updatePoints.setLong(3, fromGraphId);
      updatePoints.executeUpdate();

      updateSegments.setLong(1, toGraphId);
      updateSegments.setLong(2, fromGraphId);
      updateSegments.executeUpdate();

      updateWpNodes.setLong(1, toGraphId);
      updateWpNodes.setInt(2, deltaX);
      updateWpNodes.setInt(3, deltaY);
      updateWpNodes.setLong(4, fromGraphId);
      updateWpNodes.executeUpdate();

      updateGobNodes.setLong(1, toGraphId);
      updateGobNodes.setInt(2, deltaX);
      updateGobNodes.setInt(3, deltaY);
      updateGobNodes.setLong(4, fromGraphId);
      updateGobNodes.executeUpdate();

      deleteGraph.setLong(1, fromGraphId);
      deleteGraph.executeUpdate();
    }
  }
}
