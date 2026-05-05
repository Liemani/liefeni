package lmi.waypoint.persistence;

import lmi.Array;
import lmi.waypoint.db.WpAnchorRecord;
import lmi.waypoint.db.WpEdgeRecord;
import lmi.waypoint.db.WpNodeRecord;
import lmi.waypoint.db.WpPortalRecord;
import lmi.waypoint.db.WpPointRecord;
import lmi.waypoint.db.WpSegmentRecord;
import lmi.waypoint.managed.SaveBatch;
import lmi.waypoint.persistence.SaveBatchResult;
import lmi.waypoint.managed.WpNodeSnapshot;
import lmi.waypoint.model.CreateAnchorResult;
import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.model.LoadAnchorsResult;
import lmi.waypoint.model.LoadCounterpartPortalsResult;
import lmi.waypoint.model.LoadEdgesByGraphResult;
import lmi.waypoint.model.LoadNodesByGraphResult;
import lmi.waypoint.model.LoadPointsByCutResult;
import lmi.waypoint.model.LoadPortalsResult;
import lmi.waypoint.model.LoadSegmentsByCutResult;
import lmi.waypoint.model.UpdateAnchorResult;
import lmi.waypoint.object.WpAnchor;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPortal;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;

import java.sql.Connection;

public final class WaypointStore {
  private WaypointStore() {}

  public static void loadAnchorsAsync(WaypointResultHandler<LoadAnchorsResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpAnchor> anchors = new Array<>();
        for (WpAnchorRecord record : WaypointDatabase.loadAnchors(conn))
          anchors.append(WpAnchor.fromRecord(record));
        return new LoadAnchorsResult(anchors);
      },
      handler
    );
  }

  public static void loadPortalsByGraphAsync(long graphId, WaypointResultHandler<LoadPortalsResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpPortal> portals = new Array<>();
        for (WpPortalRecord record : WaypointDatabase.loadPortalsByGraph(conn, graphId))
          portals.append(WpPortal.fromRecord(record));
        return new LoadPortalsResult(graphId, portals);
      },
      handler
    );
  }

  public static void findCounterpartPortalsAsync(long portalId, WaypointResultHandler<LoadCounterpartPortalsResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpPortal> portals = new Array<>();
        for (WpPortalRecord record : WaypointDatabase.findCounterpartPortals(conn, portalId))
          portals.append(WpPortal.fromRecord(record));
        return new LoadCounterpartPortalsResult(portalId, portals);
      },
      handler
    );
  }

  public static void createAnchorAsync(WaypointResultHandler<CreateAnchorResult> handler) {
    WaypointDbExecutor.submitWrite(
      conn -> {
        boolean originalAutoCommit = conn.getAutoCommit();
        try {
          conn.setAutoCommit(false);
          CreateAnchorResult result = WaypointDatabase.createAnchor(conn);
          conn.commit();
          return result;
        } catch (Exception e) {
          try {
            conn.rollback();
          } catch (Exception rollbackError) {
            e.addSuppressed(rollbackError);
          }
          throw e;
        } finally {
          conn.setAutoCommit(originalAutoCommit);
        }
      },
      handler
    );
  }

  public static void updateAnchorAsync(long graphId, int anchorVirX, int anchorVirY, WaypointResultHandler<UpdateAnchorResult> handler) {
    WaypointDbExecutor.submitWrite(
      conn -> {
        boolean originalAutoCommit = conn.getAutoCommit();
        try {
          conn.setAutoCommit(false);
          UpdateAnchorResult result = WaypointDatabase.updateAnchor(conn, graphId, anchorVirX, anchorVirY);
          conn.commit();
          return result;
        } catch (Exception e) {
          try {
            conn.rollback();
          } catch (Exception rollbackError) {
            e.addSuppressed(rollbackError);
          }
          throw e;
        } finally {
          conn.setAutoCommit(originalAutoCommit);
        }
      },
      handler
    );
  }

  public static void createNodeAsync(
    String nodeName,
    long graphId,
    int nodeVirX,
    int nodeVirY,
    WaypointResultHandler<CreateNodeResult> handler
  ) {
    WaypointDbExecutor.submitWrite(
      conn -> {
        boolean originalAutoCommit = conn.getAutoCommit();
        try {
          conn.setAutoCommit(false);
          CreateNodeResult result = WaypointDatabase.createNode(conn, nodeName, graphId, nodeVirX, nodeVirY);
          conn.commit();
          return result;
        } catch (Exception e) {
          try {
            conn.rollback();
          } catch (Exception rollbackError) {
            e.addSuppressed(rollbackError);
          }
          throw e;
        } finally {
          conn.setAutoCommit(originalAutoCommit);
        }
      },
      handler
    );
  }

  public static void loadNodesByGraphAsync(long graphId, WaypointResultHandler<LoadNodesByGraphResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpNode> nodes = new Array<>();
        for (WpNodeRecord record : WaypointDatabase.loadNodesByGraph(conn, graphId))
          nodes.append(WpNode.fromRecord(record));
        return new LoadNodesByGraphResult(graphId, nodes);
      },
      handler
    );
  }

  public static void loadEdgesByGraphAsync(long graphId, WaypointResultHandler<LoadEdgesByGraphResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpEdge> edges = new Array<>();
        for (WpEdgeRecord record : WaypointDatabase.loadEdgesByGraph(conn, graphId))
          edges.append(WpEdge.fromRecord(record));
        return new LoadEdgesByGraphResult(graphId, edges);
      },
      handler
    );
  }

  public static void loadSegmentsByCutAsync(long graphId, long cutId, WaypointResultHandler<LoadSegmentsByCutResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpSegment> segments = new Array<>();
        for (WpSegmentRecord record : WaypointDatabase.loadSegmentsByGraphAndCut(conn, graphId, cutId))
          segments.append(WpSegment.fromRecord(record));
        return new LoadSegmentsByCutResult(graphId, cutId, segments);
      },
      handler
    );
  }

  public static void loadPointsByCutAsync(long graphId, long cutId, WaypointResultHandler<LoadPointsByCutResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpPoint> points = new Array<>();
        for (WpPointRecord record : WaypointDatabase.loadPointsByGraphAndCut(conn, graphId, cutId))
          points.append(WpPoint.fromRecord(record));
        return new LoadPointsByCutResult(graphId, cutId, points);
      },
      handler
    );
  }

  public static SaveBatchResult applySaveBatch(Connection conn, SaveBatch batch) throws Exception {
    boolean originalAutoCommit = conn.getAutoCommit();
    Long anchorGraphId = null;
    try {
      conn.setAutoCommit(false);
      if (batch.wpAnchorSnapshot != null)
        anchorGraphId = WaypointWriteBridge.saveWpAnchor(conn, batch.wpAnchorSnapshot);
      for (WpNodeSnapshot snapshot : batch.wpNodeSnapshots)
        WaypointWriteBridge.updateWpNode(conn, snapshot);
      conn.commit();
      return new SaveBatchResult(anchorGraphId);
    } catch (Exception e) {
      try {
        conn.rollback();
      } catch (Exception rollbackError) {
        e.addSuppressed(rollbackError);
      }
      throw e;
    } finally {
      conn.setAutoCommit(originalAutoCommit);
    }
  }
}
