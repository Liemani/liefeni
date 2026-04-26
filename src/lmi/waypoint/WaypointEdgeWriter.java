package lmi.waypoint;

import lmi.waypoint.model.RecordingPoint;
import lmi.waypoint.model.RecordingSegment;
import lmi.waypoint.model.RecordingSession;
import lmi.waypoint.model.SaveEdgeResult;

import java.sql.Connection;
import java.sql.DriverManager;

import static lmi.Constant.WaypointEdgeDirection.FORWARD;

public final class WaypointEdgeWriter {
  private WaypointEdgeWriter() {}

  public static SaveEdgeResult save(RecordingSession session, long endNodeId) {
    WaypointDatabase.initialize();

    try (Connection conn = DriverManager.getConnection(WaypointDatabase._jdbcUrl())) {
      conn.setAutoCommit(false);
      WaypointDatabase._enableForeignKeys(conn);

      long edgeId = WaypointDatabase._insertWpEdge(conn, session.startNodeId, endNodeId, FORWARD, 0.0, 0.0);
      int pointCount = 0;

      for (RecordingSegment segment : session.segments) {
        SegmentResolution resolution = SegmentResolver.resolve(conn, segment);
        if (!resolution.resolved)
          return SaveEdgeResult.failed(resolution.errorMessage);

        long segmentId = WaypointDatabase._insertWpSegment(conn, edgeId, segment.index, resolution.graphId);

        for (RecordingPoint point : segment.points) {
          int virX = resolution.referenceVirX + (point.x - resolution.referenceActualX);
          int virY = resolution.referenceVirY + (point.y - resolution.referenceActualY);
          WaypointDatabase._insertWpPoint(conn, segmentId, point.index, virX, virY, point.mouseButton, point.gobId, point.meshId);
          pointCount += 1;
        }
      }

      conn.commit();
      return SaveEdgeResult.saved(edgeId, pointCount);
    } catch (Exception e) {
      return SaveEdgeResult.failed("Failed to save edge: " + e.getMessage());
    }
  }
}
