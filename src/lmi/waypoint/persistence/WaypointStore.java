package lmi.waypoint.persistence;

import lmi.core.Array;
import lmi.waypoint.db.WpEdgeRecord;
import lmi.waypoint.db.WpNodeRecord;
import lmi.waypoint.db.WpPointRecord;
import lmi.waypoint.db.WpSegmentRecord;
import lmi.waypoint.managed.SaveBatch;
import lmi.waypoint.managed.WpNodeSnapshot;
import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.model.LoadEdgesByGraphResult;
import lmi.waypoint.model.LoadNodesByGraphResult;
import lmi.waypoint.model.LoadNodesByGridResult;
import lmi.waypoint.model.LoadPointsByCutResult;
import lmi.waypoint.model.LoadSegmentsByCutResult;
import lmi.waypoint.model.SaveMapGridResult;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;

import java.sql.Connection;

public final class WaypointStore {
  private WaypointStore() {}

  public static void initializeAsync(WaypointResultHandler<EmptyWaypointResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> EmptyWaypointResult.INSTANCE,
      handler
    );
  }

  public static void createNodeAsync(
    String nodeName,
    long graphId,
    long gridId,
    int localX,
    int localY,
    WaypointResultHandler<CreateNodeResult> handler
  ) {
    WaypointDbExecutor.submitWrite(
      conn -> {
        boolean originalAutoCommit = conn.getAutoCommit();
        try {
          conn.setAutoCommit(false);
          CreateNodeResult result = WaypointDatabase.createNode(conn, nodeName, graphId, gridId, localX, localY);
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

  public static void loadNodesByGridAsync(long gridId, WaypointResultHandler<LoadNodesByGridResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpNode> nodes = new Array<>();
        for (WpNodeRecord record : WaypointDatabase.loadNodesByGridId(conn, gridId))
          nodes.append(WpNode.fromRecord(record));
        return new LoadNodesByGridResult(gridId, nodes);
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

  public static void loadSegmentsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadSegmentsByCutResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpSegment> segments = new Array<>();
        for (WpSegmentRecord record : WaypointDatabase.loadSegmentsByGridId(conn, gridId))
          segments.append(WpSegment.fromRecord(record));
        return new LoadSegmentsByCutResult(graphId, gridId, segments);
      },
      handler
    );
  }

  public static void loadPointsByGridAsync(long graphId, long gridId, WaypointResultHandler<LoadPointsByCutResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpPoint> points = new Array<>();
        for (WpPointRecord record : WaypointDatabase.loadPointsByGridId(conn, gridId))
          points.append(WpPoint.fromRecord(record));
        return new LoadPointsByCutResult(graphId, gridId, points);
      },
      handler
    );
  }

  public static SaveBatchResult applySaveBatch(Connection conn, SaveBatch batch) throws Exception {
    boolean originalAutoCommit = conn.getAutoCommit();
    try {
      conn.setAutoCommit(false);
      for (WpNodeSnapshot snapshot : batch.wpNodeSnapshots)
        WaypointWriteBridge.updateWpNode(conn, snapshot);
      conn.commit();
      return new SaveBatchResult();
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

  public static void saveMapGridIfMissingAsync(
    long mapSegmentId,
    int localX,
    int localY,
    long havenGridId,
    WaypointResultHandler<SaveMapGridResult> handler
  ) {
    WaypointDbExecutor.submitWrite(
      conn -> {
        long mapGridId = WaypointDatabase.saveMapGridIfMissing(conn, mapSegmentId, localX, localY, havenGridId);
        return new SaveMapGridResult(mapGridId, mapSegmentId, havenGridId, localX, localY);
      },
      handler
    );
  }
}
