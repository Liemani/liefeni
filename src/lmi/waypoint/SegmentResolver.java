package lmi.waypoint;

import lmi.waypoint.model.GobNodeRecord;
import lmi.waypoint.model.RecordingSegment;

import java.sql.Connection;
import java.sql.SQLException;

final class SegmentResolver {
  private SegmentResolver() {}

  static SegmentResolution resolve(Connection conn, RecordingSegment segment) throws SQLException {
    Endpoint start = new Endpoint(segment.startGobId, segment.startGobX, segment.startGobY, segment.startGobResname);
    Endpoint end = new Endpoint(segment.endGobId, segment.endGobX, segment.endGobY, segment.endGobResname);

    GobNodeRecord startRecord = (start.gobId != null) ? WaypointDatabase._findGob(conn, start.gobId) : null;
    GobNodeRecord endRecord = (end.gobId != null) ? WaypointDatabase._findGob(conn, end.gobId) : null;

    if (startRecord == null && endRecord == null) {
      if (start.gobId == null || start.resname == null)
        return SegmentResolution.failed("Segment " + segment.index + " cannot determine a start gob.");

      long graphId = WaypointDatabase._insertGobGraph(conn, start.gobId);
      WaypointDatabase._insertGobNode(conn, start.gobId, graphId, 0, 0, null, start.resname);
      if (end.gobId != null && end.gobId != start.gobId && end.resname != null) {
        WaypointDatabase._insertGobNode(conn, end.gobId, graphId, end.x - start.x, end.y - start.y, null, end.resname);
      }
      WaypointDatabase._insertGobEdge(conn, start.gobId, end.gobId);
      return SegmentResolution.resolved(graphId, start.x, start.y, 0, 0);
    }

    if (startRecord != null && endRecord != null) {
      if (startRecord.graphId != endRecord.graphId) {
        GraphMerge merge = GobGraphMerger.merge(conn, start, startRecord, end, endRecord);
        if (!merge.merged)
          return SegmentResolution.failed(merge.errorMessage);
        GobNodeRecord reloaded = (merge.referenceGobId == start.gobId)
          ? WaypointDatabase._findGob(conn, start.gobId)
          : WaypointDatabase._findGob(conn, end.gobId);
        Endpoint referenceEndpoint = (merge.referenceGobId == start.gobId) ? start : end;
        if (reloaded == null)
          return SegmentResolution.failed("Failed to reload merged reference gob: " + merge.referenceGobId);
        WaypointDatabase._insertGobEdge(conn, start.gobId, end.gobId);
        return SegmentResolution.resolved(reloaded.graphId, referenceEndpoint.x, referenceEndpoint.y, reloaded.virX, reloaded.virY);
      }

      GobNodeRecord preferred = _prefer(startRecord, endRecord);
      Endpoint preferredEndpoint = (preferred.id == startRecord.id) ? start : end;
      WaypointDatabase._insertGobEdge(conn, start.gobId, end.gobId);
      return SegmentResolution.resolved(preferred.graphId, preferredEndpoint.x, preferredEndpoint.y, preferred.virX, preferred.virY);
    }

    GobNodeRecord known = (startRecord != null) ? startRecord : endRecord;
    Endpoint knownEndpoint = (startRecord != null) ? start : end;
    Endpoint unknownEndpoint = (startRecord != null) ? end : start;

    if (unknownEndpoint.gobId != null && unknownEndpoint.resname != null) {
      int unknownVirX = known.virX + (unknownEndpoint.x - knownEndpoint.x);
      int unknownVirY = known.virY + (unknownEndpoint.y - knownEndpoint.y);
      WaypointDatabase._insertGobNode(conn, unknownEndpoint.gobId, known.graphId, unknownVirX, unknownVirY, null, unknownEndpoint.resname);
    }

    WaypointDatabase._insertGobEdge(conn, start.gobId, end.gobId);
    return SegmentResolution.resolved(known.graphId, knownEndpoint.x, knownEndpoint.y, known.virX, known.virY);
  }

  private static GobNodeRecord _prefer(GobNodeRecord a, GobNodeRecord b) {
    if (a.wpNodeId != null && b.wpNodeId == null) return a;
    if (b.wpNodeId != null && a.wpNodeId == null) return b;
    return a;
  }
}
