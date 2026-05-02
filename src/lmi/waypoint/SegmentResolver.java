package lmi.waypoint;

import lmi.waypoint.model.RecordingSegment;
import lmi.waypoint.object.GobNode;

import java.sql.Connection;
import java.sql.SQLException;

final class SegmentResolver {
  private SegmentResolver() {}

  static SegmentResolution resolve(Connection conn, RecordingSegment segment) throws SQLException {
    Endpoint start = new Endpoint(segment.startGobId, segment.startGobX, segment.startGobY, segment.startGobResname);
    Endpoint end = new Endpoint(segment.endGobId, segment.endGobX, segment.endGobY, segment.endGobResname);

    GobNode startRecord = (start.gobId != null) ? _findGob(conn, start.gobId) : null;
    GobNode endRecord = (end.gobId != null) ? _findGob(conn, end.gobId) : null;

    if (startRecord == null && endRecord == null) {
      if (start.gobId == null || start.resname == null)
        return SegmentResolution.failed("Segment " + segment.index + " cannot determine a start gob.");

      long graphId = _insertGobGraph(conn, start.gobId);
      _insertGobNode(conn, start.gobId, graphId, 0, 0, null, start.resname);
      if (end.gobId != null && end.gobId != start.gobId && end.resname != null) {
        _insertGobNode(conn, end.gobId, graphId, end.x - start.x, end.y - start.y, null, end.resname);
      }
      _insertGobEdge(conn, start.gobId, end.gobId);
      return SegmentResolution.resolved(graphId, start.x, start.y, 0, 0);
    }

    if (startRecord != null && endRecord != null) {
      if (startRecord.graphId != endRecord.graphId) {
        GraphMerge merge = GobGraphMerger.merge(conn, start, startRecord, end, endRecord);
        if (!merge.merged)
          return SegmentResolution.failed(merge.errorMessage);
        GobNode reloaded = (merge.referenceGobId == start.gobId)
          ? _findGob(conn, start.gobId)
          : _findGob(conn, end.gobId);
        Endpoint referenceEndpoint = (merge.referenceGobId == start.gobId) ? start : end;
        if (reloaded == null)
          return SegmentResolution.failed("Failed to reload merged reference gob: " + merge.referenceGobId);
        _insertGobEdge(conn, start.gobId, end.gobId);
        return SegmentResolution.resolved(reloaded.graphId, referenceEndpoint.x, referenceEndpoint.y, reloaded.virX, reloaded.virY);
      }

      GobNode preferred = _prefer(startRecord, endRecord);
      Endpoint preferredEndpoint = (preferred.id == startRecord.id) ? start : end;
      _insertGobEdge(conn, start.gobId, end.gobId);
      return SegmentResolution.resolved(preferred.graphId, preferredEndpoint.x, preferredEndpoint.y, preferred.virX, preferred.virY);
    }

    GobNode known = (startRecord != null) ? startRecord : endRecord;
    Endpoint knownEndpoint = (startRecord != null) ? start : end;
    Endpoint unknownEndpoint = (startRecord != null) ? end : start;

    if (unknownEndpoint.gobId != null && unknownEndpoint.resname != null) {
      int unknownVirX = known.virX + (unknownEndpoint.x - knownEndpoint.x);
      int unknownVirY = known.virY + (unknownEndpoint.y - knownEndpoint.y);
      _insertGobNode(conn, unknownEndpoint.gobId, known.graphId, unknownVirX, unknownVirY, null, unknownEndpoint.resname);
    }

    _insertGobEdge(conn, start.gobId, end.gobId);
    return SegmentResolution.resolved(known.graphId, knownEndpoint.x, knownEndpoint.y, known.virX, known.virY);
  }

  private static GobNode _prefer(GobNode a, GobNode b) {
    if (a.wpNodeId != null && b.wpNodeId == null) return a;
    if (b.wpNodeId != null && a.wpNodeId == null) return b;
    return a;
  }

  private static GobNode _findGob(Connection conn, long gobId) throws SQLException {
    try {
      return WaypointStore._findGob(conn, gobId);
    } catch (SQLException e) {
      throw e;
    } catch (Exception e) {
      throw new SQLException("Failed to load gob_node " + gobId + ": " + e.getMessage(), e);
    }
  }

  private static long _insertGobGraph(Connection conn, long entryNodeId) throws SQLException {
    try {
      return WaypointStore._insertGobGraph(conn, entryNodeId);
    } catch (SQLException e) {
      throw e;
    } catch (Exception e) {
      throw new SQLException("Failed to insert gob_graph: " + e.getMessage(), e);
    }
  }

  private static void _insertGobNode(Connection conn, long gobId, long graphId, int virX, int virY,
                                     Long wpNodeId, String resname) throws SQLException {
    try {
      WaypointStore._insertGobNode(conn, gobId, graphId, virX, virY, wpNodeId, resname);
    } catch (SQLException e) {
      throw e;
    } catch (Exception e) {
      throw new SQLException("Failed to insert gob_node " + gobId + ": " + e.getMessage(), e);
    }
  }

  private static void _insertGobEdge(Connection conn, Long node0Id, Long node1Id) throws SQLException {
    try {
      WaypointStore._insertGobEdge(conn, node0Id, node1Id);
    } catch (SQLException e) {
      throw e;
    } catch (Exception e) {
      throw new SQLException("Failed to insert gob_edge: " + e.getMessage(), e);
    }
  }
}
