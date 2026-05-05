package lmi.waypoint.recording;

import lmi.Array;
import lmi.waypoint.persistence.WaypointDbExecutor;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.persistence.WaypointStore;
import lmi.waypoint.persistence.WaypointWriteBridge;
import lmi.waypoint.model.RecordingClick;
import lmi.waypoint.model.RecordingSegment;
import lmi.waypoint.model.RecordingSession;
import lmi.waypoint.model.SaveEdgeResult;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;
import lmi.waypoint.runtime.WaypointCutBounds;

import static lmi.Constant.WaypointEdgeDirection.FORWARD;

public final class WaypointEdgeWriter {
  private WaypointEdgeWriter() {}

  public static void saveAsync(
    RecordingSession session,
    long endNodeId,
    WaypointResultHandler<SaveEdgeResult> handler
  ) {
    WaypointDbExecutor.submitWrite(conn -> {
      synchronized (WaypointStore.class) {
        boolean originalAutoCommit = true;
        try {
          RecordingSessionPlanner.plan(session);

          originalAutoCommit = conn.getAutoCommit();
          conn.setAutoCommit(false);

          WpEdge edge = WaypointWriteBridge.insertWpEdge(conn, session.startNodeId, endNodeId, FORWARD, 0.0, 0.0);
          long edgeId = edge.id;
          int pointCount = 0;
          int segmentStep = 0;
          Array<WpSegment> savedSegments = new Array<>();
          Array<WpPoint> savedPoints = new Array<>();

          for (RecordingSegment segment : session.segments) {
            SegmentResolution resolution = SegmentResolver.resolve(conn, segment);
            if (!resolution.resolved) {
              conn.rollback();
              conn.setAutoCommit(originalAutoCommit);
              return SaveEdgeResult.failed(resolution.errorMessage);
            }

            if (segment.clicks.isEmpty()) {
              int cutId = WaypointCutBounds.cutIdOfVir(resolution.referenceVirX, resolution.referenceVirY);
              long segmentId = WaypointWriteBridge.insertWpSegment(conn, edgeId, segmentStep, resolution.graphId, cutId);
              savedSegments.append(WpSegment.of(segmentId, edgeId, resolution.graphId, cutId, segmentStep));
              segmentStep += 1;
              continue;
            }

            Integer currentCutId = null;
            Long currentSegmentId = null;
            int pointStep = 0;

            for (RecordingClick click : segment.clicks) {
              int virX = resolution.referenceVirX + (click.x - resolution.referenceActualX);
              int virY = resolution.referenceVirY + (click.y - resolution.referenceActualY);
              int cutId = WaypointCutBounds.cutIdOfVir(virX, virY);

              if (currentCutId == null || currentCutId.intValue() != cutId) {
                currentCutId = cutId;
                currentSegmentId = WaypointWriteBridge.insertWpSegment(conn, edgeId, segmentStep, resolution.graphId, cutId);
                savedSegments.append(WpSegment.of(currentSegmentId, edgeId, resolution.graphId, cutId, segmentStep));
                segmentStep += 1;
                pointStep = 0;
              }

              long pointId = WaypointWriteBridge.insertWpPoint(conn, currentSegmentId, cutId, pointStep, virX, virY, click.mouseButton, click.meshId);
              savedPoints.append(WpPoint.of(pointId, currentSegmentId, cutId, pointStep, virX, virY, click.mouseButton, click.meshId));
              pointStep += 1;
              pointCount += 1;
            }
          }

          conn.commit();
          conn.setAutoCommit(originalAutoCommit);
          return SaveEdgeResult.saved(edgeId, pointCount, edge, savedSegments, savedPoints);
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
    }, handler);
  }
}
