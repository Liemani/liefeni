package lmi.waypoint.recording;

import haven.Coord;
import lmi.core.Array;
import lmi.waypoint.WaypointManager;
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
import lmi.waypoint.runtime.GridPosition;

import static lmi.core.Constant.WaypointEdgeDirection.FORWARD;

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
              long segmentId = WaypointWriteBridge.insertWpSegment(conn, edgeId, segmentStep, resolution.referenceGridId);
              savedSegments.append(WpSegment.of(segmentId, edgeId, resolution.referenceGridId, segmentStep));
              segmentStep += 1;
              continue;
            }

            Long currentGridId = null;
            Long currentSegmentId = null;
            int pointStep = 0;

            for (RecordingClick click : segment.clicks) {
              GridPosition position = WaypointManager.gridPositionOfWorld(Coord.of(click.x, click.y));
              if (position == null) {
                conn.rollback();
                conn.setAutoCommit(originalAutoCommit);
                return SaveEdgeResult.failed("Failed to resolve grid position for recorded click.");
              }

              if (currentGridId == null || currentGridId.longValue() != position.gridId) {
                currentGridId = position.gridId;
                currentSegmentId = WaypointWriteBridge.insertWpSegment(conn, edgeId, segmentStep, position.gridId);
                savedSegments.append(WpSegment.of(currentSegmentId, edgeId, position.gridId, segmentStep));
                segmentStep += 1;
                pointStep = 0;
              }

              long pointId = WaypointWriteBridge.insertWpPoint(conn, currentSegmentId, position.gridId, pointStep, position.localX, position.localY, click.mouseButton, click.meshId);
              savedPoints.append(WpPoint.of(pointId, currentSegmentId, position.gridId, pointStep, position.localX, position.localY, click.mouseButton, click.meshId));
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
