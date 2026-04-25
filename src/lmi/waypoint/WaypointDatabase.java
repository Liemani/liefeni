package lmi.waypoint;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.CodeSource;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public final class WaypointDatabase {
  private WaypointDatabase() {}

  public static void initialize() {
    try {
      Class.forName("org.sqlite.JDBC");
      try (Connection conn = DriverManager.getConnection(_jdbcUrl())) {
        _enableForeignKeys(conn);
        _createSchema(conn);
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to initialize waypoint database: " + e.getMessage(), e);
    }
  }

  static String save(WaypointRecorder.Session session) {
    try {
      Class.forName("org.sqlite.JDBC");
    } catch (ClassNotFoundException e) {
      return "SQLite JDBC driver is not available on the classpath.";
    }

    try (Connection conn = DriverManager.getConnection(_jdbcUrl())) {
      _enableForeignKeys(conn);
      _createSchema(conn);
      return "WaypointDatabase.save() is not implemented for the new wp_graph schema yet.";
    } catch (Exception e) {
      return "Failed to initialize waypoint database: " + e.getMessage();
    }
  }

  public static Recording loadLatestRecording(String recordingName) {
    throw new UnsupportedOperationException(
      "WaypointDatabase.loadLatestRecording() is not implemented for the new wp_graph schema yet.");
  }

  public static GobRecord findGob(long gobId) {
    initialize();
    try (Connection conn = DriverManager.getConnection(_jdbcUrl());
         PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, node_id, root_node_id, rel_x, rel_y, resname FROM gob WHERE id = ?")) {
      _enableForeignKeys(conn);
      stmt.setLong(1, gobId);
      try (ResultSet rs = stmt.executeQuery()) {
        if (!rs.next()) return null;
        return new GobRecord(
          rs.getLong("id"),
          rs.getLong("node_id"),
          rs.getLong("root_node_id"),
          rs.getInt("rel_x"),
          rs.getInt("rel_y"),
          rs.getString("resname")
        );
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to query gob " + gobId + ": " + e.getMessage(), e);
    }
  }

  public static ArrayList<NodeRecord> loadNearbyNodes(long rootNodeId, int centerRelX, int centerRelY, int range) {
    initialize();
    ArrayList<NodeRecord> nodes = new ArrayList<>();
    try (Connection conn = DriverManager.getConnection(_jdbcUrl());
         PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, name, root_node_id, gob_id, rel_x, rel_y " +
           "FROM wp_node " +
           "WHERE root_node_id = ? " +
           "  AND rel_x BETWEEN ? AND ? " +
           "  AND rel_y BETWEEN ? AND ? " +
           "ORDER BY id")) {
      _enableForeignKeys(conn);
      stmt.setLong(1, rootNodeId);
      stmt.setInt(2, centerRelX - range);
      stmt.setInt(3, centerRelX + range);
      stmt.setInt(4, centerRelY - range);
      stmt.setInt(5, centerRelY + range);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          nodes.add(new NodeRecord(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getLong("root_node_id"),
            rs.getLong("gob_id"),
            rs.getInt("rel_x"),
            rs.getInt("rel_y")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load nearby nodes: " + e.getMessage(), e);
    }
    return nodes;
  }

  public static ArrayList<GobRecord> loadNearbyGobs(long rootNodeId, int centerRelX, int centerRelY, int range) {
    initialize();
    ArrayList<GobRecord> gobs = new ArrayList<>();
    try (Connection conn = DriverManager.getConnection(_jdbcUrl());
         PreparedStatement stmt = conn.prepareStatement(
           "SELECT id, node_id, root_node_id, rel_x, rel_y, resname " +
           "FROM gob " +
           "WHERE root_node_id = ? " +
           "  AND rel_x BETWEEN ? AND ? " +
           "  AND rel_y BETWEEN ? AND ? " +
           "ORDER BY id")) {
      _enableForeignKeys(conn);
      stmt.setLong(1, rootNodeId);
      stmt.setInt(2, centerRelX - range);
      stmt.setInt(3, centerRelX + range);
      stmt.setInt(4, centerRelY - range);
      stmt.setInt(5, centerRelY + range);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          gobs.add(new GobRecord(
            rs.getLong("id"),
            rs.getLong("node_id"),
            rs.getLong("root_node_id"),
            rs.getInt("rel_x"),
            rs.getInt("rel_y"),
            rs.getString("resname")
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load nearby gobs: " + e.getMessage(), e);
    }
    return gobs;
  }

  public static ArrayList<PointRecord> loadPointsByRootNode(long rootNodeId) {
    initialize();
    ArrayList<PointRecord> points = new ArrayList<>();
    try (Connection conn = DriverManager.getConnection(_jdbcUrl());
         PreparedStatement stmt = conn.prepareStatement(
           "SELECT " +
           "  p.segment_id, p.point_idx, p.rel_x, p.rel_y, p.mouse_button, p.gob_id, p.mesh_id, " +
           "  s.base_gob_id, bg.rel_x AS base_rel_x, bg.rel_y AS base_rel_y, bg.root_node_id AS base_root_node_id " +
           "FROM wp_point p " +
           "JOIN wp_segment s ON s.id = p.segment_id " +
           "JOIN gob bg ON bg.id = s.base_gob_id " +
           "WHERE bg.root_node_id = ? " +
           "ORDER BY p.segment_id, p.point_idx")) {
      _enableForeignKeys(conn);
      stmt.setLong(1, rootNodeId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          Long gobId = null;
          long gobIdValue = rs.getLong("gob_id");
          if (!rs.wasNull()) gobId = gobIdValue;

          Integer meshId = null;
          int meshIdValue = rs.getInt("mesh_id");
          if (!rs.wasNull()) meshId = meshIdValue;

          points.add(new PointRecord(
            rs.getLong("segment_id"),
            rs.getInt("point_idx"),
            rs.getLong("base_gob_id"),
            rs.getLong("base_root_node_id"),
            rs.getInt("base_rel_x"),
            rs.getInt("base_rel_y"),
            rs.getInt("rel_x"),
            rs.getInt("rel_y"),
            rs.getInt("mouse_button"),
            gobId,
            meshId
          ));
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load points by root node: " + e.getMessage(), e);
    }
    return points;
  }

  private static String _jdbcUrl() throws Exception {
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

  private static void _enableForeignKeys(Connection conn) throws SQLException {
    try (Statement stmt = conn.createStatement()) {
      stmt.execute("PRAGMA foreign_keys = ON");
    }
  }

  private static void _createSchema(Connection conn) throws SQLException {
    try (Statement stmt = conn.createStatement()) {
      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_graph (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  root_node_id INTEGER NOT NULL UNIQUE," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_root_node_id " +
        "    FOREIGN KEY (root_node_id) REFERENCES wp_node(id) DEFERRABLE INITIALLY DEFERRED" +
        ")"
      );

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_node (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  name TEXT NOT NULL UNIQUE," +
        "  root_node_id INTEGER NOT NULL," +
        "  gob_id INTEGER NOT NULL UNIQUE," +
        "  rel_x INTEGER NOT NULL," +
        "  rel_y INTEGER NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_root_node_id " +
        "    FOREIGN KEY (root_node_id) REFERENCES wp_node(id) DEFERRABLE INITIALLY DEFERRED," +
        "  CONSTRAINT fk_gob_id " +
        "    FOREIGN KEY (gob_id) REFERENCES gob(id) DEFERRABLE INITIALLY DEFERRED" +
        ")"
      );

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS gob (" +
        "  id INTEGER NOT NULL PRIMARY KEY," +
        "  node_id INTEGER NOT NULL UNIQUE," +
        "  root_node_id INTEGER NOT NULL," +
        "  rel_x INTEGER NOT NULL," +
        "  rel_y INTEGER NOT NULL," +
        "  resname TEXT NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_node_id " +
        "    FOREIGN KEY (node_id) REFERENCES wp_node(id) DEFERRABLE INITIALLY DEFERRED," +
        "  CONSTRAINT fk_root_node_id " +
        "    FOREIGN KEY (root_node_id) REFERENCES wp_node(id) DEFERRABLE INITIALLY DEFERRED" +
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
        "  CONSTRAINT fk_node0_id " +
        "    FOREIGN KEY (node0_id) REFERENCES wp_node(id)," +
        "  CONSTRAINT fk_node1_id " +
        "    FOREIGN KEY (node1_id) REFERENCES wp_node(id)," +
        "  CONSTRAINT chk_direction " +
        "    CHECK (direction IN (0, 1, 2, 3))," +
        "  UNIQUE (node0_id, node1_id)" +
        ")"
      );

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_segment (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  edge_id INTEGER NOT NULL," +
        "  segment_idx INTEGER NOT NULL," +
        "  base_gob_id INTEGER NOT NULL," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_edge_id " +
        "    FOREIGN KEY (edge_id) REFERENCES wp_edge(id)," +
        "  CONSTRAINT fk_base_gob_id " +
        "    FOREIGN KEY (base_gob_id) REFERENCES gob(id)," +
        "  UNIQUE (edge_id, segment_idx)" +
        ")"
      );

      stmt.execute(
        "CREATE TABLE IF NOT EXISTS wp_point (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  segment_id INTEGER NOT NULL," +
        "  point_idx INTEGER NOT NULL," +
        "  rel_x INTEGER NOT NULL," +
        "  rel_y INTEGER NOT NULL," +
        "  mouse_button INTEGER NOT NULL," +
        "  gob_id INTEGER," +
        "  mesh_id INTEGER," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  CONSTRAINT fk_segment_id " +
        "    FOREIGN KEY (segment_id) REFERENCES wp_segment(id)," +
        "  UNIQUE (segment_id, point_idx)" +
        ")"
      );
    }
  }

  public static final class Recording {
    public final long id;
    public final String name;

    Recording(long id, String name) {
      this.id = id;
      this.name = name;
    }
  }

  public static final class NodeRecord {
    public final long id;
    public final String name;
    public final long rootNodeId;
    public final long gobId;
    public final int relX;
    public final int relY;

    NodeRecord(long id, String name, long rootNodeId, long gobId, int relX, int relY) {
      this.id = id;
      this.name = name;
      this.rootNodeId = rootNodeId;
      this.gobId = gobId;
      this.relX = relX;
      this.relY = relY;
    }
  }

  public static final class GobRecord {
    public final long id;
    public final long nodeId;
    public final long rootNodeId;
    public final int relX;
    public final int relY;
    public final String resname;

    GobRecord(long id, long nodeId, long rootNodeId, int relX, int relY, String resname) {
      this.id = id;
      this.nodeId = nodeId;
      this.rootNodeId = rootNodeId;
      this.relX = relX;
      this.relY = relY;
      this.resname = resname;
    }
  }

  public static final class PointRecord {
    public final long segmentId;
    public final int pointIdx;
    public final long baseGobId;
    public final long baseRootNodeId;
    public final int baseRelX;
    public final int baseRelY;
    public final int relX;
    public final int relY;
    public final int mouseButton;
    public final Long gobId;
    public final Integer meshId;

    PointRecord(long segmentId, int pointIdx, long baseGobId, long baseRootNodeId,
                int baseRelX, int baseRelY, int relX, int relY,
                int mouseButton, Long gobId, Integer meshId) {
      this.segmentId = segmentId;
      this.pointIdx = pointIdx;
      this.baseGobId = baseGobId;
      this.baseRootNodeId = baseRootNodeId;
      this.baseRelX = baseRelX;
      this.baseRelY = baseRelY;
      this.relX = relX;
      this.relY = relY;
      this.mouseButton = mouseButton;
      this.gobId = gobId;
      this.meshId = meshId;
    }
  }
}
