package lmi.waypoint;

import lmi.waypoint.model.RecordingClick;
import lmi.waypoint.model.RecordingSegment;
import lmi.waypoint.model.RecordingSession;
import lmi.waypoint.model.SaveEdgeResult;

import java.sql.Connection;

import static lmi.Constant.WaypointEdgeDirection.FORWARD;

public final class WaypointEdgeWriter {
  private WaypointEdgeWriter() {}

  public static SaveEdgeResult save(RecordingSession session, long endNodeId) {
    synchronized (WaypointStore.class) {
      Connection conn = WaypointStore._connection();
      boolean originalAutoCommit = true;
      try {
        originalAutoCommit = conn.getAutoCommit();
        conn.setAutoCommit(false);

        long edgeId = WaypointStore._insertWpEdge(conn, session.startNodeId, endNodeId, FORWARD, 0.0, 0.0);
        int pointCount = 0;

        for (RecordingSegment segment : session.segments) {
          SegmentResolution resolution = SegmentResolver.resolve(conn, segment);
          if (!resolution.resolved) {
            conn.rollback();
            conn.setAutoCommit(originalAutoCommit);
            return SaveEdgeResult.failed(resolution.errorMessage);
          }

          long segmentId = WaypointStore._insertWpSegment(conn, edgeId, segment.index, resolution.graphId);

          for (RecordingClick click : segment.clicks) {
            int virX = resolution.referenceVirX + (click.x - resolution.referenceActualX);
            int virY = resolution.referenceVirY + (click.y - resolution.referenceActualY);
            WaypointStore._insertWpPoint(conn, segmentId, click.index, virX, virY, click.mouseButton, click.meshId);
            pointCount += 1;
          }
        }

        conn.commit();
        conn.setAutoCommit(originalAutoCommit);
        return SaveEdgeResult.saved(edgeId, pointCount);
      } catch (Exception e) {
        try {
          conn.rollback();
        } catch (Exception rollbackError) {
          e.addSuppressed(rollbackError);
        }
        try {
          conn.setAutoCommit(originalAutoCommit);
        } catch (Exception ignored) {}
        return SaveEdgeResult.failed("Failed to save edge: " + e.getMessage());
      }
    }
  }
}
