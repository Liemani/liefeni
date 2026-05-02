package lmi.waypoint;

import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.model.CreateRootNodeResult;
import lmi.waypoint.model.SaveEdgeResult;
import lmi.waypoint.db.GobNodeRecord;
import lmi.waypoint.db.WpEdgeRecord;
import lmi.waypoint.db.WpNodeRecord;
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
    int nodeX,
    int nodeY,
    long gobId,
    int gobX,
    int gobY,
    String gobResname
  ) {
    try {
      if (_gobNodeExists(conn, gobId))
        return CreateRootNodeResult.failed("Gob is already registered: " + gobId);

      long graphId = _insertGobGraph(conn, gobId);
      _insertGobNode(conn, gobId, graphId, gobX - nodeX, gobY - nodeY, null, gobResname);
      long wpNodeId = _insertWpNode(conn, graphId, gobId, 0, 0, nodeName);
      _updateGobNodeWpNodeId(conn, gobId, wpNodeId);
      return CreateRootNodeResult.created(wpNodeId, gobId, graphId);
    } catch (Exception e) {
      return CreateRootNodeResult.failed("Failed to create root node: " + e.getMessage());
    }
  }

  static CreateNodeResult createNode(
    Connection conn,
    String nodeName,
    long gobGraphId,
    long gobId,
    int nodeVirX,
    int nodeVirY,
    int gobVirX,
    int gobVirY,
    String gobResname
  ) {
    try {
      GobNodeRecord existingGob = _findGob(conn, gobId);
      if (existingGob != null) {
        if (existingGob.wpNodeId != null)
          return CreateNodeResult.failed("Gob is already connected to a waypoint node: " + gobId);
        if (existingGob.graphId != gobGraphId)
          return CreateNodeResult.failed("Gob belongs to a different gob_graph: " + gobId);

        long wpNodeId = _insertWpNode(conn, gobGraphId, gobId, nodeVirX, nodeVirY, nodeName);
        _updateGobNodeWpNodeId(conn, gobId, wpNodeId);
        return CreateNodeResult.created(wpNodeId, gobId);
      }

      _insertGobNode(conn, gobId, gobGraphId, gobVirX, gobVirY, null, gobResname);
      long wpNodeId = _insertWpNode(conn, gobGraphId, gobId, nodeVirX, nodeVirY, nodeName);
      _updateGobNodeWpNodeId(conn, gobId, wpNodeId);
      return CreateNodeResult.created(wpNodeId, gobId);
    } catch (Exception e) {
      return CreateNodeResult.failed("Failed to create node: " + e.getMessage());
    }
  }

  static GobNodeRecord findGob(Connection conn, long gobId) {
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, graph_id, vir_x, vir_y, wp_node_id, resname FROM gob_node WHERE id = ?")) {
      stmt.setLong(1, gobId);
      try (ResultSet rs = stmt.executeQuery()) {
        if (!rs.next()) return null;

        Long wpNodeId = null;
        long wpNodeIdValue = rs.getLong("wp_node_id");
        if (!rs.wasNull()) wpNodeId = wpNodeIdValue;

        return new GobNodeRecord(
          rs.getLong("id"),
          rs.getLong("graph_id"),
          rs.getInt("vir_x"),
          rs.getInt("vir_y"),
          wpNodeId,
          rs.getString("resname")
        );
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to query gob_node " + gobId + ": " + e.getMessage(), e);
    }
  }

  static WpNodeRecord findNodeByGob(Connection conn, long gobId) {
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT n.id, n.gob_graph_id, n.gob_node_id, n.vir_x, n.vir_y, n.name " +
           "FROM wp_node n " +
           "JOIN gob_node g ON g.wp_node_id = n.id " +
           "WHERE g.id = ?")) {
      stmt.setLong(1, gobId);
      try (ResultSet rs = stmt.executeQuery()) {
        if (!rs.next()) return null;
        return new WpNodeRecord(
          rs.getLong("id"),
          rs.getLong("gob_graph_id"),
          rs.getLong("gob_node_id"),
          rs.getInt("vir_x"),
          rs.getInt("vir_y"),
          rs.getString("name")
        );
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to query wp_node by gob " + gobId + ": " + e.getMessage(), e);
    }
  }

  static WpNodeRecord findNodeById(Connection conn, long wpNodeId) {
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, gob_graph_id, gob_node_id, vir_x, vir_y, name " +
           "FROM wp_node WHERE id = ?")) {
      stmt.setLong(1, wpNodeId);
      try (ResultSet rs = stmt.executeQuery()) {
        if (!rs.next()) return null;
        return new WpNodeRecord(
          rs.getLong("id"),
          rs.getLong("gob_graph_id"),
          rs.getLong("gob_node_id"),
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
           "SELECT id, gob_graph_id, gob_node_id, vir_x, vir_y, name " +
           "FROM wp_node " +
           "WHERE gob_graph_id = ? " +
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
            rs.getLong("gob_graph_id"),
            rs.getLong("gob_node_id"),
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

  static ArrayList<GobNodeRecord> loadNearbyGobs(Connection conn, long graphId, int centerVirX, int centerVirY, int range) {
    ArrayList<GobNodeRecord> gobs = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, graph_id, vir_x, vir_y, wp_node_id, resname " +
           "FROM gob_node " +
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
          Long wpNodeId = null;
          long wpNodeIdValue = rs.getLong("wp_node_id");
          if (!rs.wasNull()) wpNodeId = wpNodeIdValue;

          gobs.add(new GobNodeRecord(
            rs.getLong("id"),
            rs.getLong("graph_id"),
            rs.getInt("vir_x"),
            rs.getInt("vir_y"),
            wpNodeId,
            rs.getString("resname")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load nearby gob_node rows: " + e.getMessage(), e);
    }
    return gobs;
  }

  static ArrayList<WpPointRecord> loadNearbyPoints(Connection conn, long graphId, int centerVirX, int centerVirY, int range) {
    ArrayList<WpPointRecord> points = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT p.segment_id, p.step, p.vir_x, p.vir_y, p.mouse_button, p.gob_id, p.mesh_id, s.gob_graph_id " +
           "FROM wp_point p " +
           "JOIN wp_segment s ON s.id = p.segment_id " +
           "WHERE s.gob_graph_id = ? " +
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
          Long gobId = null;
          long gobIdValue = rs.getLong("gob_id");
          if (!rs.wasNull()) gobId = gobIdValue;

          Integer meshId = null;
          int meshIdValue = rs.getInt("mesh_id");
          if (!rs.wasNull()) meshId = meshIdValue;

          points.add(new WpPointRecord(
            rs.getLong("segment_id"),
            rs.getInt("step"),
            rs.getLong("gob_graph_id"),
            rs.getInt("vir_x"),
            rs.getInt("vir_y"),
            rs.getInt("mouse_button"),
            gobId,
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
           "SELECT id, edge_id, gob_graph_id, step FROM wp_segment WHERE edge_id = ? ORDER BY step")) {
      stmt.setLong(1, edgeId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          segments.add(new WpSegmentRecord(
            rs.getLong("id"),
            rs.getLong("edge_id"),
            rs.getLong("gob_graph_id"),
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
           "SELECT p.segment_id, p.step, s.gob_graph_id, p.vir_x, p.vir_y, p.mouse_button, p.gob_id, p.mesh_id " +
           "FROM wp_point p " +
           "JOIN wp_segment s ON s.id = p.segment_id " +
           "WHERE p.segment_id = ? ORDER BY p.step")) {
      stmt.setLong(1, segmentId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          Long gobId = null;
          long gobIdValue = rs.getLong("gob_id");
          if (!rs.wasNull()) gobId = gobIdValue;

          Integer meshId = null;
          int meshIdValue = rs.getInt("mesh_id");
          if (!rs.wasNull()) meshId = meshIdValue;

          points.add(new WpPointRecord(
            rs.getLong("segment_id"),
            rs.getInt("step"),
            rs.getLong("gob_graph_id"),
            rs.getInt("vir_x"),
            rs.getInt("vir_y"),
            rs.getInt("mouse_button"),
            gobId,
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
        "CREATE TABLE IF NOT EXISTS gob_graph (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  entry_node_id INTEGER NOT NULL UNIQUE," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_entry_node_id " +
        "    FOREIGN KEY (entry_node_id) REFERENCES gob_node(id) DEFERRABLE INITIALLY DEFERRED" +
        ")"
      );

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS gob_node (" +
        "  id INTEGER NOT NULL PRIMARY KEY," +
        "  graph_id INTEGER NOT NULL," +
        "  vir_x INTEGER NOT NULL," +
        "  vir_y INTEGER NOT NULL," +
        "  wp_node_id INTEGER UNIQUE," +
        "  resname TEXT NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_graph_id " +
        "    FOREIGN KEY (graph_id) REFERENCES gob_graph(id) DEFERRABLE INITIALLY DEFERRED," +
        "  CONSTRAINT fk_wp_node_id " +
        "    FOREIGN KEY (wp_node_id) REFERENCES wp_node(id) DEFERRABLE INITIALLY DEFERRED" +
        ")"
      );
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_gob_node_graph_id ON gob_node (graph_id)");

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_node (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  gob_graph_id INTEGER NOT NULL," +
        "  gob_node_id INTEGER NOT NULL UNIQUE," +
        "  vir_x INTEGER NOT NULL," +
        "  vir_y INTEGER NOT NULL," +
        "  name TEXT NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_gob_graph_id " +
        "    FOREIGN KEY (gob_graph_id) REFERENCES gob_graph(id)," +
        "  CONSTRAINT fk_gob_node_id " +
        "    FOREIGN KEY (gob_node_id) REFERENCES gob_node(id) DEFERRABLE INITIALLY DEFERRED" +
        ")"
      );
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_node_gob_graph_id ON wp_node (gob_graph_id)");

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS gob_edge (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  node0_id INTEGER NOT NULL," +
        "  node1_id INTEGER NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_node0_id FOREIGN KEY (node0_id) REFERENCES gob_node(id)," +
        "  CONSTRAINT fk_node1_id FOREIGN KEY (node1_id) REFERENCES gob_node(id)," +
        "  UNIQUE (node0_id, node1_id)" +
        ")"
      );

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
        "  UNIQUE (node0_id, node1_id)" +
        ")"
      );

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_segment (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  edge_id INTEGER NOT NULL," +
        "  gob_graph_id INTEGER NOT NULL," +
        "  step INTEGER NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_edge_id FOREIGN KEY (edge_id) REFERENCES wp_edge(id)," +
        "  CONSTRAINT fk_gob_graph_id FOREIGN KEY (gob_graph_id) REFERENCES gob_graph(id)," +
        "  UNIQUE (edge_id, step)" +
        ")"
      );
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_segment_gob_graph_id ON wp_segment (gob_graph_id)");

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_point (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  segment_id INTEGER NOT NULL," +
        "  step INTEGER NOT NULL," +
        "  vir_x INTEGER NOT NULL," +
        "  vir_y INTEGER NOT NULL," +
        "  mouse_button INTEGER NOT NULL," +
        "  gob_id INTEGER," +
        "  mesh_id INTEGER," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_segment_id FOREIGN KEY (segment_id) REFERENCES wp_segment(id)," +
        "  UNIQUE (segment_id, step)" +
        ")"
      );
    }
  }

  private static boolean _gobNodeExists(Connection conn, long gobId) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "SELECT 1 FROM gob_node WHERE id = ? LIMIT 1")) {
      stmt.setLong(1, gobId);
      try (ResultSet rs = stmt.executeQuery()) {
        return rs.next();
      }
    }
  }

  static GobNodeRecord _findGob(Connection conn, long gobId) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "SELECT id, graph_id, vir_x, vir_y, wp_node_id, resname FROM gob_node WHERE id = ?")) {
      stmt.setLong(1, gobId);
      try (ResultSet rs = stmt.executeQuery()) {
        if (!rs.next()) return null;

        Long wpNodeId = null;
        long wpNodeIdValue = rs.getLong("wp_node_id");
        if (!rs.wasNull()) wpNodeId = wpNodeIdValue;

        return new GobNodeRecord(
          rs.getLong("id"),
          rs.getLong("graph_id"),
          rs.getInt("vir_x"),
          rs.getInt("vir_y"),
          wpNodeId,
          rs.getString("resname")
        );
      }
    }
  }

  static long _insertGobGraph(Connection conn, long entryNodeId) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO gob_graph(entry_node_id) VALUES (?)",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.setLong(1, entryNodeId);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert gob_graph row.");
  }

  static void _insertGobNode(Connection conn, long gobId, long graphId, int virX, int virY,
                                     Long wpNodeId, String resname) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO gob_node(id, graph_id, vir_x, vir_y, wp_node_id, resname) VALUES (?, ?, ?, ?, ?, ?)")) {
      stmt.setLong(1, gobId);
      stmt.setLong(2, graphId);
      stmt.setInt(3, virX);
      stmt.setInt(4, virY);
      if (wpNodeId != null) stmt.setLong(5, wpNodeId);
      else stmt.setNull(5, java.sql.Types.BIGINT);
      stmt.setString(6, resname);
      stmt.executeUpdate();
    }
  }

  static void _insertGobEdge(Connection conn, Long node0Id, Long node1Id) throws SQLException {
    if (node0Id == null || node1Id == null) return;
    if (node0Id.longValue() == node1Id.longValue()) return;

    long a = Math.min(node0Id, node1Id);
    long b = Math.max(node0Id, node1Id);
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT OR IGNORE INTO gob_edge(node0_id, node1_id) VALUES (?, ?)")) {
      stmt.setLong(1, a);
      stmt.setLong(2, b);
      stmt.executeUpdate();
    }
  }

  private static long _insertWpNode(Connection conn, long gobGraphId, long gobNodeId, int virX, int virY, String name) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_node(gob_graph_id, gob_node_id, vir_x, vir_y, name) VALUES (?, ?, ?, ?, ?)",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.setLong(1, gobGraphId);
      stmt.setLong(2, gobNodeId);
      stmt.setInt(3, virX);
      stmt.setInt(4, virY);
      stmt.setString(5, name);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert wp_node row.");
  }

  private static void _updateGobNodeWpNodeId(Connection conn, long gobId, long wpNodeId) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "UPDATE gob_node SET wp_node_id = ? WHERE id = ?")) {
      stmt.setLong(1, wpNodeId);
      stmt.setLong(2, gobId);
      stmt.executeUpdate();
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

  static long _insertWpSegment(Connection conn, long edgeId, int step, long gobGraphId) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_segment(edge_id, gob_graph_id, step) VALUES (?, ?, ?)",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.setLong(1, edgeId);
      stmt.setLong(2, gobGraphId);
      stmt.setInt(3, step);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert wp_segment row.");
  }

  static void _insertWpPoint(Connection conn, long segmentId, int step, int virX, int virY,
                                     int mouseButton, Long gobId, Integer meshId) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_point(segment_id, step, vir_x, vir_y, mouse_button, gob_id, mesh_id) VALUES (?, ?, ?, ?, ?, ?, ?)")) {
      stmt.setLong(1, segmentId);
      stmt.setInt(2, step);
      stmt.setInt(3, virX);
      stmt.setInt(4, virY);
      stmt.setInt(5, mouseButton);
      if (gobId != null) stmt.setLong(6, gobId);
      else stmt.setNull(6, java.sql.Types.BIGINT);
      if (meshId != null) stmt.setInt(7, meshId);
      else stmt.setNull(7, java.sql.Types.INTEGER);
      stmt.executeUpdate();
    }
  }

  static void _updateWpNode(Connection conn, long id, long gobGraphId, long gobNodeId, int virX, int virY,
                            String name) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "UPDATE wp_node SET gob_graph_id = ?, gob_node_id = ?, vir_x = ?, vir_y = ?, name = ? WHERE id = ?")) {
      stmt.setLong(1, gobGraphId);
      stmt.setLong(2, gobNodeId);
      stmt.setInt(3, virX);
      stmt.setInt(4, virY);
      stmt.setString(5, name);
      stmt.setLong(6, id);
      stmt.executeUpdate();
    }
  }

}
