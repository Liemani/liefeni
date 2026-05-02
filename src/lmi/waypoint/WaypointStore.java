package lmi.waypoint;

import lmi.Array;
import lmi.waypoint.db.GobNodeRecord;
import lmi.waypoint.db.WpEdgeRecord;
import lmi.waypoint.db.WpNodeRecord;
import lmi.waypoint.db.WpPointRecord;
import lmi.waypoint.db.WpSegmentRecord;
import lmi.waypoint.managed.DbWorker;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.managed.SaveBatch;
import lmi.waypoint.managed.WpNodeSnapshot;
import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.model.CreateRootNodeResult;
import lmi.waypoint.object.GobNode;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;

import java.sql.Connection;
import java.sql.DriverManager;

public final class WaypointStore {
  private static Connection connection;
  private static DbWorker managedDbWorker;
  private WaypointStore() {}

  public static synchronized GobNode findGob(long gobId) {
    return GobNode.fromRecord(WaypointDatabase.findGob(_connection(), gobId));
  }

  public static synchronized WpNode findNodeByGob(long gobId) {
    return WpNode.fromRecord(WaypointDatabase.findNodeByGob(_connection(), gobId));
  }

  public static synchronized ManagedWpNode findManagedNodeByGob(ManagedObjectContext context, long gobId) {
    return _toManaged(context, findNodeByGob(gobId));
  }

  public static synchronized WpNode findNode(long wpNodeId) {
    return WpNode.fromRecord(WaypointDatabase.findNodeById(_connection(), wpNodeId));
  }

  public static synchronized ManagedWpNode findManagedNode(ManagedObjectContext context, long wpNodeId) {
    return _toManaged(context, findNode(wpNodeId));
  }

  public static synchronized CreateRootNodeResult createRootNode(
    String nodeName,
    int nodeX,
    int nodeY,
    long gobId,
    int gobX,
    int gobY,
    String gobResname
  ) {
    return _withTransaction(() -> WaypointDatabase.createRootNode(
      _connection(),
      nodeName,
      nodeX,
      nodeY,
      gobId,
      gobX,
      gobY,
      gobResname
    ));
  }

  public static synchronized CreateNodeResult createNode(
    String nodeName,
    long gobGraphId,
    long gobId,
    int nodeVirX,
    int nodeVirY,
    int gobVirX,
    int gobVirY,
    String gobResname
  ) {
    return _withTransaction(() -> WaypointDatabase.createNode(
      _connection(),
      nodeName,
      gobGraphId,
      gobId,
      nodeVirX,
      nodeVirY,
      gobVirX,
      gobVirY,
      gobResname
    ));
  }

  public static synchronized Array<WpNode> loadNearbyNodes(long graphId, int centerVirX, int centerVirY, int range) {
    Array<WpNode> nodes = new Array<>();
    for (WpNodeRecord record : WaypointDatabase.loadNearbyNodes(_connection(), graphId, centerVirX, centerVirY, range)) {
      nodes.append(WpNode.fromRecord(record));
    }
    return nodes;
  }

  public static synchronized Array<ManagedWpNode> loadManagedNearbyNodes(
    ManagedObjectContext context,
    long graphId,
    int centerVirX,
    int centerVirY,
    int range
  ) {
    Array<ManagedWpNode> nodes = new Array<>();
    for (WpNodeRecord record : WaypointDatabase.loadNearbyNodes(_connection(), graphId, centerVirX, centerVirY, range)) {
      nodes.append(_toManaged(context, WpNode.fromRecord(record)));
    }
    return nodes;
  }

  public static synchronized Array<GobNode> loadNearbyGobs(long graphId, int centerVirX, int centerVirY, int range) {
    Array<GobNode> gobs = new Array<>();
    for (GobNodeRecord record : WaypointDatabase.loadNearbyGobs(_connection(), graphId, centerVirX, centerVirY, range)) {
      gobs.append(GobNode.fromRecord(record));
    }
    return gobs;
  }

  public static synchronized Array<WpPoint> loadNearbyPoints(long graphId, int centerVirX, int centerVirY, int range) {
    Array<WpPoint> points = new Array<>();
    for (WpPointRecord record : WaypointDatabase.loadNearbyPoints(_connection(), graphId, centerVirX, centerVirY, range)) {
      points.append(WpPoint.fromRecord(record));
    }
    return points;
  }

  public static synchronized Array<WpEdge> loadEdgesByNode(long wpNodeId) {
    Array<WpEdge> edges = new Array<>();
    for (WpEdgeRecord record : WaypointDatabase.loadEdgesByNode(_connection(), wpNodeId)) {
      edges.append(WpEdge.fromRecord(record));
    }
    return edges;
  }

  public static synchronized Array<WpSegment> loadSegmentsByEdge(long edgeId) {
    Array<WpSegment> segments = new Array<>();
    for (WpSegmentRecord record : WaypointDatabase.loadSegmentsByEdge(_connection(), edgeId)) {
      segments.append(WpSegment.fromRecord(record));
    }
    return segments;
  }

  public static synchronized Array<WpPoint> loadPointsBySegment(long segmentId) {
    Array<WpPoint> points = new Array<>();
    for (WpPointRecord record : WaypointDatabase.loadPointsBySegment(_connection(), segmentId)) {
      points.append(WpPoint.fromRecord(record));
    }
    return points;
  }

  public static synchronized DbWorker managedDbWorker() {
    if (managedDbWorker == null)
      managedDbWorker = new DbWorker(WaypointStore::_applySaveBatch);
    return managedDbWorker;
  }

  static synchronized Connection _connection() {
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

  static GobNode _findGob(Connection conn, long gobId) throws Exception {
    return GobNode.fromRecord(WaypointDatabase._findGob(conn, gobId));
  }

  static long _insertGobGraph(Connection conn, long entryNodeId) throws Exception {
    return WaypointDatabase._insertGobGraph(conn, entryNodeId);
  }

  static void _insertGobNode(Connection conn, long gobId, long graphId, int virX, int virY,
                             Long wpNodeId, String resname) throws Exception {
    WaypointDatabase._insertGobNode(conn, gobId, graphId, virX, virY, wpNodeId, resname);
  }

  static void _insertGobEdge(Connection conn, Long node0Id, Long node1Id) throws Exception {
    WaypointDatabase._insertGobEdge(conn, node0Id, node1Id);
  }

  static long _insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,
                            double timeCost, double fatigueCost) throws Exception {
    return WaypointDatabase._insertWpEdge(conn, node0Id, node1Id, direction, timeCost, fatigueCost);
  }

  static long _insertWpSegment(Connection conn, long edgeId, int step, long gobGraphId) throws Exception {
    return WaypointDatabase._insertWpSegment(conn, edgeId, step, gobGraphId);
  }

  static void _insertWpPoint(Connection conn, long segmentId, int step, int virX, int virY,
                             int mouseButton, Long gobId, Integer meshId) throws Exception {
    WaypointDatabase._insertWpPoint(conn, segmentId, step, virX, virY, mouseButton, gobId, meshId);
  }

  static void _updateWpNode(Connection conn, WpNodeSnapshot snapshot) throws Exception {
    WaypointDatabase._updateWpNode(
      conn,
      snapshot.id,
      snapshot.gobGraphId,
      snapshot.gobNodeId,
      snapshot.virX,
      snapshot.virY,
      snapshot.name
    );
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

  private static void _applySaveBatch(SaveBatch batch) throws Exception {
    synchronized (WaypointStore.class) {
      Connection conn = _connection();
      boolean originalAutoCommit = conn.getAutoCommit();
      try {
        conn.setAutoCommit(false);
        for (WpNodeSnapshot snapshot : batch.wpNodeSnapshots)
          _updateWpNode(conn, snapshot);
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
  }
}
