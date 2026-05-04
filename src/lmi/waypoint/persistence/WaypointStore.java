package lmi.waypoint.persistence;

import lmi.Array;
import lmi.waypoint.db.WpAnchorRecord;
import lmi.waypoint.db.WpEdgeRecord;
import lmi.waypoint.db.WpNodeRecord;
import lmi.waypoint.db.WpPortalRecord;
import lmi.waypoint.db.WpPointRecord;
import lmi.waypoint.db.WpSegmentRecord;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.managed.SaveBatch;
import lmi.waypoint.managed.WpNodeSnapshot;
import lmi.waypoint.model.CreateAnchorResult;
import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.model.CreateRootNodeResult;
import lmi.waypoint.model.LoadAnchorsResult;
import lmi.waypoint.model.LoadCounterpartPortalsResult;
import lmi.waypoint.model.LoadEdgesByNodeResult;
import lmi.waypoint.model.LoadNodesByGraphResult;
import lmi.waypoint.model.LoadPointsBySegmentResult;
import lmi.waypoint.model.LoadPortalsResult;
import lmi.waypoint.model.LoadSegmentsByEdgeResult;
import lmi.waypoint.model.UpdateAnchorResult;
import lmi.waypoint.object.WpAnchor;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPortal;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;

import java.sql.Connection;
import java.sql.DriverManager;

public final class WaypointStore {
  private static Connection connection;
  private WaypointStore() {}

  public static synchronized void warmUp() {
    _connection();
  }

  public static synchronized WpNode findNode(long wpNodeId) {
    return WpNode.fromRecord(WaypointDatabase.findNodeById(_connection(), wpNodeId));
  }

  public static synchronized WpNode findNodeByGraphAndVir(long graphId, int virX, int virY) {
    return WpNode.fromRecord(WaypointDatabase.findNodeByGraphAndVir(_connection(), graphId, virX, virY));
  }

  static synchronized Array<WpAnchor> loadAnchors() {
    Array<WpAnchor> anchors = new Array<>();
    for (WpAnchorRecord record : WaypointDatabase.loadAnchors(_connection())) {
      anchors.append(WpAnchor.fromRecord(record));
    }
    return anchors;
  }

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

  static synchronized Array<WpPortal> loadPortalsByGraph(long graphId) {
    Array<WpPortal> portals = new Array<>();
    for (WpPortalRecord record : WaypointDatabase.loadPortalsByGraph(_connection(), graphId)) {
      portals.append(WpPortal.fromRecord(record));
    }
    return portals;
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

  static synchronized Array<WpPortal> findCounterpartPortals(long portalId) {
    Array<WpPortal> portals = new Array<>();
    for (WpPortalRecord record : WaypointDatabase.findCounterpartPortals(_connection(), portalId)) {
      portals.append(WpPortal.fromRecord(record));
    }
    return portals;
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

  public static synchronized ManagedWpNode findManagedNode(ManagedObjectContext context, long wpNodeId) {
    return _toManaged(context, findNode(wpNodeId));
  }

  static synchronized CreateRootNodeResult createRootNode(
    String nodeName,
    int anchorWorldX,
    int anchorWorldY,
    int nodeWorldX,
    int nodeWorldY
  ) {
    return _withTransaction(() -> WaypointDatabase.createRootNode(
      _connection(),
      nodeName,
      anchorWorldX,
      anchorWorldY,
      nodeWorldX,
      nodeWorldY
    ));
  }

  static synchronized CreateAnchorResult createAnchor() {
    return _withTransaction(() -> WaypointDatabase.createAnchor(_connection()));
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

  static synchronized UpdateAnchorResult updateAnchor(long graphId, int anchorVirX, int anchorVirY) {
    return _withTransaction(() -> WaypointDatabase.updateAnchor(_connection(), graphId, anchorVirX, anchorVirY));
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

  public static synchronized CreateNodeResult createNode(
    String nodeName,
    long graphId,
    int nodeVirX,
    int nodeVirY
  ) {
    return _withTransaction(() -> WaypointDatabase.createNode(
      _connection(),
      nodeName,
      graphId,
      nodeVirX,
      nodeVirY
    ));
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

  static synchronized Array<WpNode> loadNearbyNodes(long graphId, int centerVirX, int centerVirY, int range) {
    Array<WpNode> nodes = new Array<>();
    for (WpNodeRecord record : WaypointDatabase.loadNearbyNodes(_connection(), graphId, centerVirX, centerVirY, range)) {
      nodes.append(WpNode.fromRecord(record));
    }
    return nodes;
  }

  static synchronized Array<WpNode> loadNodesByGraph(long graphId) {
    Array<WpNode> nodes = new Array<>();
    for (WpNodeRecord record : WaypointDatabase.loadNodesByGraph(_connection(), graphId)) {
      nodes.append(WpNode.fromRecord(record));
    }
    return nodes;
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

  static synchronized Array<WpPoint> loadNearbyPoints(long graphId, int centerVirX, int centerVirY, int range) {
    Array<WpPoint> points = new Array<>();
    for (WpPointRecord record : WaypointDatabase.loadNearbyPoints(_connection(), graphId, centerVirX, centerVirY, range)) {
      points.append(WpPoint.fromRecord(record));
    }
    return points;
  }

  static synchronized Array<WpEdge> loadEdgesByNode(long wpNodeId) {
    Array<WpEdge> edges = new Array<>();
    for (WpEdgeRecord record : WaypointDatabase.loadEdgesByNode(_connection(), wpNodeId)) {
      edges.append(WpEdge.fromRecord(record));
    }
    return edges;
  }

  public static void loadEdgesByNodeAsync(long wpNodeId, WaypointResultHandler<LoadEdgesByNodeResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpEdge> edges = new Array<>();
        for (WpEdgeRecord record : WaypointDatabase.loadEdgesByNode(conn, wpNodeId))
          edges.append(WpEdge.fromRecord(record));
        return new LoadEdgesByNodeResult(wpNodeId, edges);
      },
      handler
    );
  }

  static synchronized Array<WpSegment> loadSegmentsByEdge(long edgeId) {
    Array<WpSegment> segments = new Array<>();
    for (WpSegmentRecord record : WaypointDatabase.loadSegmentsByEdge(_connection(), edgeId)) {
      segments.append(WpSegment.fromRecord(record));
    }
    return segments;
  }

  public static void loadSegmentsByEdgeAsync(long edgeId, WaypointResultHandler<LoadSegmentsByEdgeResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpSegment> segments = new Array<>();
        for (WpSegmentRecord record : WaypointDatabase.loadSegmentsByEdge(conn, edgeId))
          segments.append(WpSegment.fromRecord(record));
        return new LoadSegmentsByEdgeResult(edgeId, segments);
      },
      handler
    );
  }

  static synchronized Array<WpPoint> loadPointsBySegment(long segmentId) {
    Array<WpPoint> points = new Array<>();
    for (WpPointRecord record : WaypointDatabase.loadPointsBySegment(_connection(), segmentId)) {
      points.append(WpPoint.fromRecord(record));
    }
    return points;
  }

  public static void loadPointsBySegmentAsync(long segmentId, WaypointResultHandler<LoadPointsBySegmentResult> handler) {
    WaypointDbExecutor.submitRead(
      conn -> {
        Array<WpPoint> points = new Array<>();
        for (WpPointRecord record : WaypointDatabase.loadPointsBySegment(conn, segmentId))
          points.append(WpPoint.fromRecord(record));
        return new LoadPointsBySegmentResult(segmentId, points);
      },
      handler
    );
  }

  public static synchronized Connection _connection() {
    try {
      if (connection == null || connection.isClosed()) {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection(WaypointDatabase._jdbcUrl());
        WaypointDatabase.initialize(connection);
      }
      return connection;
    } catch (Exception e) {
      throw new RuntimeException("Failed to open waypoint database connection: " + e.getMessage(), e);
    }
  }

  private static <T> T _withTransaction(TransactionCall<T> call) {
    Connection conn = _connection();
    boolean originalAutoCommit;
    try {
      originalAutoCommit = conn.getAutoCommit();
      conn.setAutoCommit(false);
      T result = call.run();
      conn.commit();
      conn.setAutoCommit(originalAutoCommit);
      return result;
    } catch (Exception e) {
      try {
        conn.rollback();
      } catch (Exception rollbackError) {
        e.addSuppressed(rollbackError);
      }
      try {
        conn.setAutoCommit(true);
      } catch (Exception ignored) {}
      if (e instanceof RuntimeException)
        throw (RuntimeException)e;
      throw new RuntimeException("Failed to execute waypoint transaction: " + e.getMessage(), e);
    }
  }

  @FunctionalInterface
  private interface TransactionCall<T> {
    T run() throws Exception;
  }

  private static ManagedWpNode _toManaged(ManagedObjectContext context, WpNode node) {
    if (node == null)
      return null;
    return context.registerLoaded(ManagedWpNode.fromWpNode(context, node));
  }

  public static void applySaveBatch(Connection conn, SaveBatch batch) throws Exception {
    boolean originalAutoCommit = conn.getAutoCommit();
    try {
      conn.setAutoCommit(false);
      for (WpNodeSnapshot snapshot : batch.wpNodeSnapshots)
        WaypointWriteBridge.updateWpNode(conn, snapshot);
      conn.commit();
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

  private static void _applySaveBatch(SaveBatch batch) throws Exception {
    applySaveBatch(_connection(), batch);
  }
}
