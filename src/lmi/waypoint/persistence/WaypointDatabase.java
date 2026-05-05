package lmi.waypoint.persistence;

import lmi.waypoint.model.CreateNodeResult;
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

final class WaypointDatabase {
  private WaypointDatabase() {}

  static void initialize(Connection conn) throws Exception {
    Class.forName("org.sqlite.JDBC");
    enableForeignKeys(conn);
    createSchema(conn);
  }

  static CreateNodeResult createNode(
    Connection conn,
    String nodeName,
    long graphId,
    long gridId,
    int localX,
    int localY
  ) {
    try {
      long resolvedGraphId = (graphId > 0) ? graphId : insertWpGraph(conn);

      if (findNodeByGraphAndGridLocal(conn, resolvedGraphId, gridId, localX, localY) != null)
        return CreateNodeResult.failed("A waypoint node already exists at (" + gridId + ", " + localX + ", " + localY + ").");

      long wpNodeId = insertWpNode(conn, resolvedGraphId, gridId, localX, localY, nodeName);
      return CreateNodeResult.created(resolvedGraphId, wpNodeId);
    } catch (Exception e) {
      return CreateNodeResult.failed("Failed to create node: " + e.getMessage());
    }
  }

  static ArrayList<WpNodeRecord> loadNodesByGraph(Connection conn, long graphId) {
    ArrayList<WpNodeRecord> nodes = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, graph_id, grid_id, local_x, local_y, name " +
           "FROM wp_node WHERE graph_id = ? ORDER BY id")) {
      stmt.setLong(1, graphId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          nodes.add(new WpNodeRecord(
            rs.getLong("id"),
            rs.getLong("graph_id"),
            rs.getLong("grid_id"),
            rs.getInt("local_x"),
            rs.getInt("local_y"),
            rs.getString("name")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load wp_node rows by graph " + graphId + ": " + e.getMessage(), e);
    }
    return nodes;
  }

  static WpNodeRecord findNodeById(Connection conn, long wpNodeId) {
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, graph_id, grid_id, local_x, local_y, name " +
           "FROM wp_node WHERE id = ?")) {
      stmt.setLong(1, wpNodeId);
      try (ResultSet rs = stmt.executeQuery()) {
        if (!rs.next()) return null;
        return new WpNodeRecord(
          rs.getLong("id"),
          rs.getLong("graph_id"),
          rs.getLong("grid_id"),
          rs.getInt("local_x"),
          rs.getInt("local_y"),
          rs.getString("name")
        );
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to query wp_node " + wpNodeId + ": " + e.getMessage(), e);
    }
  }

  static WpNodeRecord findNodeByGraphAndGridLocal(Connection conn, long graphId, long gridId, int localX, int localY) {
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, graph_id, grid_id, local_x, local_y, name " +
           "FROM wp_node WHERE graph_id = ? AND grid_id = ? AND local_x = ? AND local_y = ? " +
           "ORDER BY id LIMIT 1")) {
      stmt.setLong(1, graphId);
      stmt.setLong(2, gridId);
      stmt.setInt(3, localX);
      stmt.setInt(4, localY);
      try (ResultSet rs = stmt.executeQuery()) {
        if (!rs.next()) return null;
        return new WpNodeRecord(
          rs.getLong("id"),
          rs.getLong("graph_id"),
          rs.getLong("grid_id"),
          rs.getInt("local_x"),
          rs.getInt("local_y"),
          rs.getString("name")
        );
      }
    } catch (Exception e) {
      throw new RuntimeException(
        "Failed to query wp_node by graph/grid-local (" + graphId + ", " + gridId + ", " + localX + ", " + localY + "): " + e.getMessage(),
        e
      );
    }
  }

  static ArrayList<WpEdgeRecord> loadEdgesByGraph(Connection conn, long graphId) {
    ArrayList<WpEdgeRecord> edges = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT e.id, e.graph_id, e.node0_id, e.node1_id, e.direction, e.time_cost, e.fatigue_cost " +
           "FROM wp_edge e WHERE e.graph_id = ? ORDER BY e.id")) {
      stmt.setLong(1, graphId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          edges.add(new WpEdgeRecord(
            rs.getLong("id"),
            graphId,
            rs.getLong("node0_id"),
            rs.getLong("node1_id"),
            rs.getInt("direction"),
            rs.getDouble("time_cost"),
            rs.getDouble("fatigue_cost")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load wp_edge rows by graph " + graphId + ": " + e.getMessage(), e);
    }
    return edges;
  }

  static ArrayList<WpSegmentRecord> loadSegmentsByGridId(Connection conn, long gridId) {
    ArrayList<WpSegmentRecord> segments = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, edge_id, grid_id, step FROM wp_segment WHERE grid_id = ? ORDER BY edge_id, step, id")) {
      stmt.setLong(1, gridId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          segments.add(new WpSegmentRecord(
            rs.getLong("id"),
            rs.getLong("edge_id"),
            rs.getLong("grid_id"),
            rs.getInt("step")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load wp_segment rows by grid " + gridId + ": " + e.getMessage(), e);
    }
    return segments;
  }

  static ArrayList<WpSegmentRecord> loadSegmentsByGraphAndCut(Connection conn, long graphId, int cutId) {
    return loadSegmentsByGridId(conn, cutId);
  }

  static ArrayList<WpPointRecord> loadPointsByGridId(Connection conn, long gridId) {
    ArrayList<WpPointRecord> points = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, segment_id, grid_id, step, local_x, local_y, mouse_button, mesh_id " +
           "FROM wp_point WHERE grid_id = ? ORDER BY segment_id, step")) {
      stmt.setLong(1, gridId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          Integer meshId = null;
          int meshIdValue = rs.getInt("mesh_id");
          if (!rs.wasNull()) meshId = meshIdValue;

          points.add(new WpPointRecord(
            rs.getLong("id"),
            rs.getLong("segment_id"),
            rs.getLong("grid_id"),
            rs.getInt("step"),
            rs.getInt("local_x"),
            rs.getInt("local_y"),
            rs.getInt("mouse_button"),
            meshId
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load wp_point rows by grid " + gridId + ": " + e.getMessage(), e);
    }
    return points;
  }

  static ArrayList<WpPointRecord> loadPointsByGraphAndCut(Connection conn, long graphId, int cutId) {
    return loadPointsByGridId(conn, cutId);
  }

  static String jdbcUrl() throws Exception {
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

  private static void enableForeignKeys(Connection conn) throws SQLException {
    try (Statement stmt = conn.createStatement()) {
      stmt.execute("PRAGMA foreign_keys = ON");
    }
  }

  private static void createSchema(Connection conn) throws SQLException {
    try (Statement stmt = conn.createStatement()) {
      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_graph (" +
        "  id INTEGER PRIMARY KEY," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP" +
        ")"
      );

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_node (" +
        "  id INTEGER PRIMARY KEY," +
        "  graph_id INTEGER NOT NULL," +
        "  grid_id INTEGER NOT NULL," +
        "  local_x INTEGER NOT NULL," +
        "  local_y INTEGER NOT NULL," +
        "  name TEXT NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_graph_id FOREIGN KEY (graph_id) REFERENCES wp_graph(id)," +
        "  UNIQUE (grid_id, local_x, local_y)" +
        ")"
      );
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_node_graph_id ON wp_node (graph_id)");
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_node_grid_id ON wp_node (grid_id)");

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_edge (" +
        "  id INTEGER PRIMARY KEY," +
        "  graph_id INTEGER NOT NULL," +
        "  node0_id INTEGER NOT NULL," +
        "  node1_id INTEGER NOT NULL," +
        "  direction INTEGER NOT NULL," +
        "  time_cost DOUBLE NOT NULL," +
        "  fatigue_cost DOUBLE NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_graph_id FOREIGN KEY (graph_id) REFERENCES wp_graph(id)," +
        "  CONSTRAINT fk_node0_id FOREIGN KEY (node0_id) REFERENCES wp_node(id)," +
        "  CONSTRAINT fk_node1_id FOREIGN KEY (node1_id) REFERENCES wp_node(id)," +
        "  CONSTRAINT chk_direction CHECK (direction IN (0, 1, 2, 3))," +
        "  CONSTRAINT chk_distinct_nodes CHECK (node0_id <> node1_id)," +
        "  CONSTRAINT chk_edge_order CHECK (node0_id < node1_id)," +
        "  UNIQUE (node0_id, node1_id)" +
        ")"
      );
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_edge_graph_id ON wp_edge (graph_id)");

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_segment (" +
        "  id INTEGER PRIMARY KEY," +
        "  edge_id INTEGER NOT NULL," +
        "  grid_id INTEGER NOT NULL," +
        "  step INTEGER NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_edge_id FOREIGN KEY (edge_id) REFERENCES wp_edge(id)," +
        "  UNIQUE (edge_id, step)" +
        ")"
      );
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_segment_edge_id ON wp_segment (edge_id)");
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_segment_grid_id ON wp_segment (grid_id)");

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_point (" +
        "  id INTEGER PRIMARY KEY," +
        "  segment_id INTEGER NOT NULL," +
        "  grid_id INTEGER NOT NULL," +
        "  step INTEGER NOT NULL," +
        "  local_x INTEGER NOT NULL," +
        "  local_y INTEGER NOT NULL," +
        "  mouse_button INTEGER NOT NULL," +
        "  mesh_id INTEGER," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_segment_id FOREIGN KEY (segment_id) REFERENCES wp_segment(id)," +
        "  CONSTRAINT chk_mouse_button CHECK (mouse_button IN (1, 3))," +
        "  UNIQUE (segment_id, step)" +
        ")"
      );
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_point_segment_id ON wp_point (segment_id)");
      stmt.execute("CREATE INDEX IF NOT EXISTS idx_wp_point_grid_id ON wp_point (grid_id)");
    }
  }

  static long insertWpNode(Connection conn, long graphId, long gridId, int localX, int localY, String name) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_node(graph_id, grid_id, local_x, local_y, name) VALUES (?, ?, ?, ?, ?)",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.setLong(1, graphId);
      stmt.setLong(2, gridId);
      stmt.setInt(3, localX);
      stmt.setInt(4, localY);
      stmt.setString(5, name);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert wp_node row.");
  }

  // Transitional compatibility wrapper for callers still on vir-based APIs.
  private static long insertWpNode(Connection conn, long graphId, int localX, int localY, String name) throws SQLException {
    return insertWpNode(conn, graphId, 0L, localX, localY, name);
  }

  private static long insertWpGraph(Connection conn) throws SQLException {
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

  static long insertWpEdge(Connection conn, long node0Id, long node1Id, int direction,
                           double timeCost, double fatigueCost) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_edge(graph_id, node0_id, node1_id, direction, time_cost, fatigue_cost) " +
      "VALUES ((SELECT graph_id FROM wp_node WHERE id = ?), ?, ?, ?, ?, ?)",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.setLong(1, node0Id);
      stmt.setLong(2, node0Id);
      stmt.setLong(3, node1Id);
      stmt.setInt(4, direction);
      stmt.setDouble(5, timeCost);
      stmt.setDouble(6, fatigueCost);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert wp_edge row.");
  }

  static long insertWpSegment(Connection conn, long edgeId, int step, long gridId) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_segment(edge_id, grid_id, step) VALUES (?, ?, ?)",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.setLong(1, edgeId);
      stmt.setLong(2, gridId);
      stmt.setInt(3, step);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert wp_segment row.");
  }

  static long insertWpPoint(Connection conn, long segmentId, long gridId, int step, int localX, int localY,
                            int mouseButton, Integer meshId) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO wp_point(segment_id, grid_id, step, local_x, local_y, mouse_button, mesh_id) VALUES (?, ?, ?, ?, ?, ?, ?)",
      Statement.RETURN_GENERATED_KEYS)) {
      stmt.setLong(1, segmentId);
      stmt.setLong(2, gridId);
      stmt.setInt(3, step);
      stmt.setInt(4, localX);
      stmt.setInt(5, localY);
      stmt.setInt(6, mouseButton);
      if (meshId != null) stmt.setInt(7, meshId);
      else stmt.setNull(7, java.sql.Types.INTEGER);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert wp_point row.");
  }

  static void updateWpNode(Connection conn, long id, long graphId, long gridId, int localX, int localY,
                           String name) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "UPDATE wp_node SET graph_id = ?, grid_id = ?, local_x = ?, local_y = ?, name = ? WHERE id = ?")) {
      stmt.setLong(1, graphId);
      stmt.setLong(2, gridId);
      stmt.setInt(3, localX);
      stmt.setInt(4, localY);
      stmt.setString(5, name);
      stmt.setLong(6, id);
      stmt.executeUpdate();
    }
  }

}
