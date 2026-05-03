package lmi.waypoint;

import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.model.CreateAnchorResult;
import lmi.waypoint.model.CreateRootNodeResult;
import lmi.waypoint.model.SaveEdgeResult;
import lmi.waypoint.model.UpdateAnchorResult;
import lmi.waypoint.db.WpAnchorRecord;
import lmi.waypoint.db.WpEdgeRecord;
import lmi.waypoint.db.WpNodeRecord;
import lmi.waypoint.db.WpPortalRecord;
import lmi.waypoint.db.WpPointRecord;
import lmi.waypoint.db.WpSegmentRecord;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.CodeSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static lmi.Constant.WaypointEdgeDirection.*;

final class WaypointDatabase {
  private WaypointDatabase() {}

  static void initialize(Connection conn) throws Exception {
    Class.forName("org.sqlite.JDBC");
    _enableForeignKeys(conn);
    _createSchema(conn);
  }

  static CreateRootNodeResult createRootNode(
    Connection conn,
    String nodeName,
    int anchorWorldX,
    int anchorWorldY,
    int nodeWorldX,
    int nodeWorldY
  ) {
    try {
      if (_anchorExists(conn))
        return CreateRootNodeResult.failed("wp_anchor already exists.");

      long graphId = _insertWpGraph(conn);
      _insertWpAnchor(conn, graphId, 0, 0);
      long wpNodeId = _insertWpNode(
        conn,
        graphId,
        nodeWorldX - anchorWorldX,
        nodeWorldY - anchorWorldY,
        nodeName
      );
      return CreateRootNodeResult.created(wpNodeId, graphId);
    } catch (Exception e) {
      return CreateRootNodeResult.failed("Failed to create root node: " + e.getMessage());
    }
  }

  static CreateAnchorResult createAnchor(Connection conn) {
    try {
      if (_anchorExists(conn))
        return CreateAnchorResult.failed("wp_anchor already exists.");

      long graphId = _insertWpGraph(conn);
      _insertWpAnchor(conn, graphId, 0, 0);
      return CreateAnchorResult.created(graphId);
    } catch (Exception e) {
      return CreateAnchorResult.failed("Failed to create anchor: " + e.getMessage());
    }
  }

  static UpdateAnchorResult updateAnchor(Connection conn, long graphId, int anchorVirX, int anchorVirY) {
    try {
      long updated = _updateWpAnchor(conn, graphId, anchorVirX, anchorVirY);
      if (updated < 1)
        return UpdateAnchorResult.failed("wp_anchor does not exist.");
      return UpdateAnchorResult.updated();
    } catch (Exception e) {
      return UpdateAnchorResult.failed("Failed to update anchor: " + e.getMessage());
    }
  }

  static CreateNodeResult createNode(
    Connection conn,
    String nodeName,
    long graphId,
    int nodeVirX,
    int nodeVirY
  ) {
    try {
      if (findNodeByGraphAndVir(conn, graphId, nodeVirX, nodeVirY) != null)
        return CreateNodeResult.failed("A waypoint node already exists at (" + nodeVirX + ", " + nodeVirY + ").");

      long wpNodeId = _insertWpNode(conn, graphId, nodeVirX, nodeVirY, nodeName);
      return CreateNodeResult.created(wpNodeId);
    } catch (Exception e) {
      return CreateNodeResult.failed("Failed to create node: " + e.getMessage());
    }
  }

  static ArrayList<WpAnchorRecord> loadAnchors(Connection conn) {
    ArrayList<WpAnchorRecord> anchors = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, graph_id, vir_x, vir_y FROM wp_anchor ORDER BY id")) {
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          anchors.add(new WpAnchorRecord(
            rs.getLong("id"),
            rs.getLong("graph_id"),
            rs.getInt("vir_x"),
            rs.getInt("vir_y")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load wp_anchor rows: " + e.getMessage(), e);
    }
    return anchors;
  }

  static ArrayList<WpPortalRecord> loadPortalsByGraph(Connection conn, long graphId) {
    ArrayList<WpPortalRecord> portals = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, graph_id, vir_x, vir_y, resname FROM wp_portal WHERE graph_id = ? ORDER BY id")) {
      stmt.setLong(1, graphId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          portals.add(new WpPortalRecord(
            rs.getLong("id"),
            rs.getLong("graph_id"),
            rs.getInt("vir_x"),
            rs.getInt("vir_y"),
            rs.getString("resname")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load wp_portal rows by graph " + graphId + ": " + e.getMessage(), e);
    }
    return portals;
  }

  static ArrayList<WpPortalRecord> findCounterpartPortals(Connection conn, long portalId) {
    ArrayList<WpPortalRecord> portals = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT p.id, p.graph_id, p.vir_x, p.vir_y, p.resname " +
           "FROM wp_portal_pair pp " +
           "JOIN wp_portal p ON p.id = CASE " +
           "  WHEN pp.portal0_id = ? THEN pp.portal1_id " +
           "  ELSE pp.portal0_id " +
           "END " +
           "WHERE pp.portal0_id = ? OR pp.portal1_id = ? " +
           "ORDER BY p.id")) {
      stmt.setLong(1, portalId);
      stmt.setLong(2, portalId);
      stmt.setLong(3, portalId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          portals.add(new WpPortalRecord(
            rs.getLong("id"),
            rs.getLong("graph_id"),
            rs.getInt("vir_x"),
            rs.getInt("vir_y"),
            rs.getString("resname")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load counterpart wp_portal rows for portal " + portalId + ": " + e.getMessage(), e);
    }
    return portals;
  }

  static ArrayList<WpNodeRecord> loadNodesByGraph(Connection conn, long graphId) {
    ArrayList<WpNodeRecord> nodes = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, graph_id, vir_x, vir_y, name " +
           "FROM wp_node WHERE graph_id = ? ORDER BY id")) {
      stmt.setLong(1, graphId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          nodes.add(new WpNodeRecord(
            rs.getLong("id"),
            rs.getLong("graph_id"),
            rs.getInt("vir_x"),
            rs.getInt("vir_y"),
            rs.getString("name")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load wp_node rows by graph " + graphId + ": " + e.getMessage(), e);
    }
    return nodes;
  }

  static WpNodeRecord findNodeByGraphAndVir(Connection conn, long graphId, int virX, int virY) {
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, graph_id, vir_x, vir_y, name " +
           "FROM wp_node WHERE graph_id = ? AND vir_x = ? AND vir_y = ? " +
           "ORDER BY id LIMIT 1")) {
      stmt.setLong(1, graphId);
      stmt.setInt(2, virX);
      stmt.setInt(3, virY);
      try (ResultSet rs = stmt.executeQuery()) {
        if (!rs.next()) return null;
        return new WpNodeRecord(
          rs.getLong("id"),
          rs.getLong("graph_id"),
          rs.getInt("vir_x"),
          rs.getInt("vir_y"),
          rs.getString("name")
        );
      }
    } catch (Exception e) {
      throw new RuntimeException(
        "Failed to query wp_node by graph/vir (" + graphId + ", " + virX + ", " + virY + "): " + e.getMessage(),
        e
      );
    }
  }

  static WpNodeRecord findNodeById(Connection conn, long wpNodeId) {
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, graph_id, vir_x, vir_y, name " +
           "FROM wp_node WHERE id = ?")) {
      stmt.setLong(1, wpNodeId);
      try (ResultSet rs = stmt.executeQuery()) {
        if (!rs.next()) return null;
        return new WpNodeRecord(
          rs.getLong("id"),
          rs.getLong("graph_id"),
          rs.getInt("vir_x"),
          rs.getInt("vir_y"),
          rs.getString("name")
        );
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to query wp_node " + wpNodeId + ": " + e.getMessage(), e);
    }
  }

  static ArrayList<WpNodeRecord> loadNearbyNodes(Connection conn, long graphId, int centerVirX, int centerVirY, int range) {
    ArrayList<WpNodeRecord> nodes = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, graph_id, vir_x, vir_y, name " +
           "FROM wp_node " +
           "WHERE graph_id = ? " +
           "  AND vir_x BETWEEN ? AND ? " +
           "  AND vir_y BETWEEN ? AND ? " +
           "ORDER BY id")) {
      stmt.setLong(1, graphId);
      stmt.setInt(2, centerVirX - range);
      stmt.setInt(3, centerVirX + range);
      stmt.setInt(4, centerVirY - range);
      stmt.setInt(5, centerVirY + range);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          nodes.add(new WpNodeRecord(
            rs.getLong("id"),
            rs.getLong("graph_id"),
            rs.getInt("vir_x"),
            rs.getInt("vir_y"),
            rs.getString("name")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load nearby wp_node rows: " + e.getMessage(), e);
    }
    return nodes;
  }

  static ArrayList<WpPointRecord> loadNearbyPoints(Connection conn, long graphId, int centerVirX, int centerVirY, int range) {
    ArrayList<WpPointRecord> points = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT p.id, p.segment_id, p.step, p.vir_x, p.vir_y, p.mouse_button, p.mesh_id, s.graph_id " +
           "FROM wp_point p " +
           "JOIN wp_segment s ON s.id = p.segment_id " +
           "WHERE s.graph_id = ? " +
           "  AND p.vir_x BETWEEN ? AND ? " +
           "  AND p.vir_y BETWEEN ? AND ? " +
           "ORDER BY p.segment_id, p.step")) {
      stmt.setLong(1, graphId);
      stmt.setInt(2, centerVirX - range);
      stmt.setInt(3, centerVirX + range);
      stmt.setInt(4, centerVirY - range);
      stmt.setInt(5, centerVirY + range);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          Integer meshId = null;
          int meshIdValue = rs.getInt("mesh_id");
          if (!rs.wasNull()) meshId = meshIdValue;

          points.add(new WpPointRecord(
            rs.getLong("id"),
            rs.getLong("segment_id"),
            rs.getInt("step"),
            rs.getInt("vir_x"),
            rs.getInt("vir_y"),
            rs.getInt("mouse_button"),
            meshId
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load nearby wp_point rows: " + e.getMessage(), e);
    }
    return points;
  }

  static ArrayList<WpEdgeRecord> loadEdgesByNode(Connection conn, long wpNodeId) {
    ArrayList<WpEdgeRecord> edges = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, node0_id, node1_id, direction, time_cost, fatigue_cost " +
           "FROM wp_edge WHERE node0_id = ? OR node1_id = ? ORDER BY id")) {
      stmt.setLong(1, wpNodeId);
      stmt.setLong(2, wpNodeId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          edges.add(new WpEdgeRecord(
            rs.getLong("id"),
            rs.getLong("node0_id"),
            rs.getLong("node1_id"),
            rs.getInt("direction"),
            rs.getDouble("time_cost"),
            rs.getDouble("fatigue_cost")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load wp_edge rows by wp_node " + wpNodeId + ": " + e.getMessage(), e);
    }
    return edges;
  }

  static ArrayList<WpSegmentRecord> loadSegmentsByEdge(Connection conn, long edgeId) {
    ArrayList<WpSegmentRecord> segments = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, edge_id, graph_id, step FROM wp_segment WHERE edge_id = ? ORDER BY step")) {
      stmt.setLong(1, edgeId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          segments.add(new WpSegmentRecord(
            rs.getLong("id"),
            rs.getLong("edge_id"),
            rs.getLong("graph_id"),
            rs.getInt("step")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load wp_segment rows by wp_edge " + edgeId + ": " + e.getMessage(), e);
    }
    return segments;
  }

  static ArrayList<WpPointRecord> loadPointsBySegment(Connection conn, long segmentId) {
    ArrayList<WpPointRecord> points = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, segment_id, step, vir_x, vir_y, mouse_button, mesh_id " +
           "FROM wp_point WHERE segment_id = ? ORDER BY step")) {
      stmt.setLong(1, segmentId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          Integer meshId = null;
          int meshIdValue = rs.getInt("mesh_id");
          if (!rs.wasNull()) meshId = meshIdValue;

          points.add(new WpPointRecord(
            rs.getLong("id"),
            rs.getLong("segment_id"),
            rs.getInt("step"),
            rs.getInt("vir_x"),
            rs.getInt("vir_y"),
            rs.getInt("mouse_button"),
            meshId
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load wp_point rows by wp_segment " + segmentId + ": " + e.getMessage(), e);
    }
    return points;
  }

  static String _jdbcUrl() throws Exception {
    CodeSource codeSource = WaypointDatabase.class.getProtectionDomain().getCodeSource();
    if (codeSource == null)
      throw new IllegalStateException("CodeSource is unavailable");

    URL location = codeSource.getLocation();
    if (location == null)
      throw new IllegalStateException("CodeSource location is unavailable");

    File locationFile = new File(location.toURI());
    File baseDir = locationFile.isFile() ? locationFile.getParentFile() : locationFile;
    if (baseDir == null)
      throw new IllegalStateException("Base directory is unavailable");

    Path dataDir = baseDir.toPath().resolve("data");
    Files.createDirectories(dataDir);

    Path dbPath = dataDir.resolve("lmi_waypoint.db");
    return "jdbc:sqlite:" + dbPath.toAbsolutePath();
  }

  static void _enableForeignKeys(Connection conn) throws SQLException {
    try (Statement stmt = conn.createStatement()) {
      stmt.execute("PRAGMA foreign_keys = ON");
    }
  }

  private static void _createSchema(Connection conn) throws SQLException {
    try (Statement stmt = conn.createStatement()) {
      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_graph (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP" +
        ")"
      );

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_anchor (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  graph_id INTEGER NOT NULL UNIQUE," +
        "  vir_x INTEGER NOT NULL," +
        "  vir_y INTEGER NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_graph_id " +
        "    FOREIGN KEY (graph_id) REFERENCES wp_graph(id)" +
        ")"
      );

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_portal (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  graph_id INTEGER NOT NULL," +
        "  vir_x INTEGER NOT NULL," +
        "  vir_y INTEGER NOT NULL," +
        "  resname TEXT NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_graph_id " +
        "    FOREIGN KEY (graph_id) REFERENCES wp_graph(id)" +
        ")"
      );
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_portal_graph_id ON wp_portal (graph_id)");

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_portal_pair (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  portal0_id INTEGER NOT NULL," +
        "  portal1_id INTEGER NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_portal0_id FOREIGN KEY (portal0_id) REFERENCES wp_portal(id)," +
        "  CONSTRAINT fk_portal1_id FOREIGN KEY (portal1_id) REFERENCES wp_portal(id)," +
        "  CONSTRAINT chk_portal_pair_order CHECK (portal0_id < portal1_id)," +
        "  UNIQUE (portal0_id, portal1_id)" +
        ")"
      );

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_node (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  graph_id INTEGER NOT NULL," +
        "  vir_x INTEGER NOT NULL," +
        "  vir_y INTEGER NOT NULL," +
        "  name TEXT NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_graph_id FOREIGN KEY (graph_id) REFERENCES wp_graph(id)" +
        ")"
      );
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_node_graph_id ON wp_node (graph_id)");

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_edge (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  node0_id INTEGER NOT NULL," +
        "  node1_id INTEGER NOT NULL," +
        "  direction INTEGER NOT NULL," +
        "  time_cost DOUBLE NOT NULL," +
        "  fatigue_cost DOUBLE NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_node0_id FOREIGN KEY (node0_id) REFERENCES wp_node(id)," +
        "  CONSTRAINT fk_node1_id FOREIGN KEY (node1_id) REFERENCES wp_node(id)," +
        "  CONSTRAINT chk_direction CHECK (direction IN (0, 1, 2, 3))," +
        "  CONSTRAINT chk_distinct_nodes CHECK (node0_id <> node1_id)," +
        "  UNIQUE (node0_id, node1_id)" +
        ")"
      );

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_segment (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  graph_id INTEGER NOT NULL," +
        "  edge_id INTEGER NOT NULL," +
        "  step INTEGER NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_graph_id FOREIGN KEY (graph_id) REFERENCES wp_graph(id)," +
        "  CONSTRAINT fk_edge_id FOREIGN KEY (edge_id) REFERENCES wp_edge(id)," +
        "  UNIQUE (edge_id, step)" +
        ")"
      );
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_segment_graph_id ON wp_segment (graph_id)");

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_point (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  segment_id INTEGER NOT NULL," +
        "  step INTEGER NOT NULL," +
        "  vir_x INTEGER NOT NULL," +
        "  vir_y INTEGER NOT NULL," +
        "  mouse_button INTEGER NOT NULL," +
        "  mesh_id INTEGER," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_segment_id FOREIGN KEY (segment_id) REFERENCES wp_segment(id)," +
        "  CONSTRAINT chk_mouse_button CHECK (mouse_button IN (1, 3))," +
        "  UNIQUE (segment_id, step)" +
        ")"
      );
    }
  }

  private static long _insertWpNode(Connection conn, long graphId, long nodeRefId, int virX, int virY, String name) throws SQLException {
    return _insertWpNode(conn, graphId, virX, virY, name);
  }

  private static long _insertWpNode(Connection conn, long graphId, int virX, int virY, String name) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_node(graph_id, vir_x, vir_y, name) VALUES (?, ?, ?, ?)",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.setLong(1, graphId);
      stmt.setInt(2, virX);
      stmt.setInt(3, virY);
      stmt.setString(4, name);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert wp_node row.");
  }

  private static boolean _anchorExists(Connection conn) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement("SELECT 1 FROM wp_anchor LIMIT 1")) {
      try (ResultSet rs = stmt.executeQuery()) {
        return rs.next();
      }
    }
  }

  private static long _insertWpGraph(Connection conn) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_graph DEFAULT VALUES",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert wp_graph row.");
  }

  private static long _insertWpAnchor(Connection conn, long graphId, int virX, int virY) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_anchor(graph_id, vir_x, vir_y) VALUES (?, ?, ?)",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.setLong(1, graphId);
      stmt.setInt(2, virX);
      stmt.setInt(3, virY);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert wp_anchor row.");
  }

  private static long _updateWpAnchor(Connection conn, long graphId, int virX, int virY) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "UPDATE wp_anchor SET graph_id = ?, vir_x = ?, vir_y = ?")) {
      stmt.setLong(1, graphId);
      stmt.setInt(2, virX);
      stmt.setInt(3, virY);
      return stmt.executeUpdate();
    }
  }

  static long _insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,
                                    double timeCost, double fatigueCost) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_edge(node0_id, node1_id, direction, time_cost, fatigue_cost) VALUES (?, ?, ?, ?, ?)",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.setLong(1, node0Id);
      stmt.setLong(2, node1Id);
      stmt.setInt(3, direction);
      stmt.setDouble(4, timeCost);
      stmt.setDouble(5, fatigueCost);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert wp_edge row.");
  }

  static long _insertWpSegment(Connection conn, long edgeId, int step, long graphId) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_segment(edge_id, graph_id, step) VALUES (?, ?, ?)",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.setLong(1, edgeId);
      stmt.setLong(2, graphId);
      stmt.setInt(3, step);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert wp_segment row.");
  }

  static void _insertWpPoint(Connection conn, long segmentId, int step, int virX, int virY,
                                     int mouseButton, Integer meshId) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_point(segment_id, step, vir_x, vir_y, mouse_button, mesh_id) VALUES (?, ?, ?, ?, ?, ?)")) {
      stmt.setLong(1, segmentId);
      stmt.setInt(2, step);
      stmt.setInt(3, virX);
      stmt.setInt(4, virY);
      stmt.setInt(5, mouseButton);
      if (meshId != null) stmt.setInt(6, meshId);
      else stmt.setNull(6, java.sql.Types.INTEGER);
      stmt.executeUpdate();
    }
  }

  static void _updateWpNode(Connection conn, long id, long graphId, long nodeRefId, int virX, int virY,
                            String name) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "UPDATE wp_node SET graph_id = ?, vir_x = ?, vir_y = ?, name = ? WHERE id = ?")) {
      stmt.setLong(1, graphId);
      stmt.setInt(2, virX);
      stmt.setInt(3, virY);
      stmt.setString(4, name);
      stmt.setLong(5, id);
      stmt.executeUpdate();
    }
  }

}
