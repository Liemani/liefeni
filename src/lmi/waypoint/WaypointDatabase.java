package lmi.waypoint;

import java.io.File;
import java.net.URL;
import java.security.CodeSource;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class WaypointDatabase {
  private static final DateTimeFormatter DATETIME_FORMATTER =
    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());

  private WaypointDatabase() {}

  static String save(WaypointRecorder.Session session) {
    try {
      Class.forName("org.sqlite.JDBC");
    } catch (ClassNotFoundException e) {
      return "SQLite JDBC driver is not available on the classpath.";
    }

    final String jdbcUrl;
    try {
      jdbcUrl = _jdbcUrl();
    } catch (Exception e) {
      return "Failed to resolve waypoint database path: " + e.getMessage();
    }

    try (Connection conn = DriverManager.getConnection(jdbcUrl)) {
      conn.setAutoCommit(false);
      _enableForeignKeys(conn);
      _createSchema(conn);

      long recordingId = _insertRecording(conn, session);
      _insertClicks(conn, recordingId, session);

      conn.commit();
      return null;
    } catch (SQLException e) {
      return "SQLite save failed: " + e.getMessage();
    }
  }

  public static Recording loadLatestRecording(String recordingName) {
    try {
      Class.forName("org.sqlite.JDBC");
      String jdbcUrl = _jdbcUrl();

      try (Connection conn = DriverManager.getConnection(jdbcUrl)) {
        _enableForeignKeys(conn);
        _createSchema(conn);

        Long recordingId = _findLatestRecordingId(conn, recordingName);
        if (recordingId == null) return null;

        return new Recording(recordingId, recordingName, _loadClicks(conn, recordingId));
      }
    } catch (Exception e) {
      throw new RuntimeException("Failed to load waypoint recording: " + e.getMessage(), e);
    }
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
        "CREATE TABLE IF NOT EXISTS waypoint_recording (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  name TEXT NOT NULL," +
        "  started_at DATETIME," +
        "  stopped_at DATETIME," +
        "  created_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP" +
        ")"
      );
      stmt.execute(
        "CREATE TABLE IF NOT EXISTS waypoint_click (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  recording_id INTEGER NOT NULL," +
        "  click_index INTEGER NOT NULL," +
        "  x INTEGER NOT NULL," +
        "  y INTEGER NOT NULL," +
        "  mouse_button INTEGER NOT NULL," +
        "  gob_id INTEGER," +
        "  mesh_id INTEGER," +
        "  created_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  FOREIGN KEY (recording_id) REFERENCES waypoint_recording(id)," +
        "  UNIQUE (recording_id, click_index)" +
        ")"
      );
    }

    _migrateWaypointRecordingTable(conn);
    _ensureColumn(conn, "waypoint_recording", "started_at", "DATETIME");
    _ensureColumn(conn, "waypoint_recording", "stopped_at", "DATETIME");
    _ensureColumn(conn, "waypoint_click", "mesh_id", "INTEGER");
  }

  private static void _migrateWaypointRecordingTable(Connection conn) throws SQLException {
    String createSql = null;
    try (PreparedStatement stmt = conn.prepareStatement(
      "SELECT sql FROM sqlite_master WHERE type = 'table' AND name = 'waypoint_recording'");
         ResultSet rs = stmt.executeQuery()) {
      if (rs.next()) createSql = rs.getString(1);
    }

    if (createSql == null || !createSql.toUpperCase().contains("UNIQUE")) return;

    try (Statement stmt = conn.createStatement()) {
      stmt.execute(
        "CREATE TABLE waypoint_recording_new (" +
        "  id INTEGER PRIMARY KEY AUTOINCREMENT," +
        "  name TEXT NOT NULL," +
        "  started_at DATETIME," +
        "  stopped_at DATETIME," +
        "  created_at DATETIME DEFAULT CURRENT_TIMESTAMP," +
        "  updated_at DATETIME DEFAULT CURRENT_TIMESTAMP" +
        ")"
      );
      stmt.execute(
        "INSERT INTO waypoint_recording_new(id, name, started_at, stopped_at, created_at, updated_at) " +
        "SELECT id, name, started_at, stopped_at, created_at, updated_at FROM waypoint_recording"
      );
      stmt.execute("DROP TABLE waypoint_recording");
      stmt.execute("ALTER TABLE waypoint_recording_new RENAME TO waypoint_recording");
    }
  }

  private static void _ensureColumn(Connection conn, String tableName, String columnName, String definition) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement("PRAGMA table_info(" + tableName + ")");
         ResultSet rs = stmt.executeQuery()) {
      while (rs.next()) {
        if (columnName.equalsIgnoreCase(rs.getString("name"))) return;
      }
    }

    try (Statement stmt = conn.createStatement()) {
      stmt.execute("ALTER TABLE " + tableName + " ADD COLUMN " + columnName + " " + definition);
    }
  }

  private static long _insertRecording(Connection conn, WaypointRecorder.Session session) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO waypoint_recording(name, started_at, stopped_at) VALUES (?, ?, ?)",
      Statement.RETURN_GENERATED_KEYS
    )) {
      stmt.setString(1, session.name);
      stmt.setString(2, _formatDatetime(session.startedAtMillis));
      if (session.stoppedAtMillis > 0) stmt.setString(3, _formatDatetime(session.stoppedAtMillis));
      else stmt.setNull(3, java.sql.Types.VARCHAR);
      stmt.executeUpdate();

      try (ResultSet keys = stmt.getGeneratedKeys()) {
        if (keys.next()) return keys.getLong(1);
      }
    }
    throw new SQLException("Failed to insert waypoint_recording row.");
  }

  private static void _insertClicks(Connection conn, long recordingId, WaypointRecorder.Session session) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "INSERT INTO waypoint_click(recording_id, click_index, x, y, mouse_button, gob_id, mesh_id) VALUES (?, ?, ?, ?, ?, ?, ?)"
    )) {
      for (WaypointRecorder.ClickRecord click : session.clicks) {
        stmt.setLong(1, recordingId);
        stmt.setInt(2, click.index);
        stmt.setInt(3, click.x);
        stmt.setInt(4, click.y);
        stmt.setInt(5, click.mouseButton);
        if (click.gobId != null) stmt.setLong(6, click.gobId);
        else stmt.setNull(6, java.sql.Types.BIGINT);
        if (click.meshId != null) stmt.setInt(7, click.meshId);
        else stmt.setNull(7, java.sql.Types.INTEGER);
        stmt.addBatch();
      }
      stmt.executeBatch();
    }
  }

  private static Long _findLatestRecordingId(Connection conn, String recordingName) throws SQLException {
    try (PreparedStatement stmt = conn.prepareStatement(
      "SELECT id FROM waypoint_recording WHERE name = ? ORDER BY id DESC LIMIT 1"
    )) {
      stmt.setString(1, recordingName);
      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) return rs.getLong(1);
      }
    }
    return null;
  }

  private static List<RecordedClick> _loadClicks(Connection conn, long recordingId) throws SQLException {
    List<RecordedClick> clicks = new ArrayList<>();
    try (PreparedStatement stmt = conn.prepareStatement(
      "SELECT click_index, x, y, mouse_button, gob_id, mesh_id " +
      "FROM waypoint_click WHERE recording_id = ? ORDER BY click_index"
    )) {
      stmt.setLong(1, recordingId);
      try (ResultSet rs = stmt.executeQuery()) {
        while (rs.next()) {
          Long gobId = null;
          long gobIdValue = rs.getLong("gob_id");
          if (!rs.wasNull()) gobId = gobIdValue;

          Integer meshId = null;
          int meshIdValue = rs.getInt("mesh_id");
          if (!rs.wasNull()) meshId = meshIdValue;

          clicks.add(new RecordedClick(
            rs.getInt("click_index"),
            rs.getInt("x"),
            rs.getInt("y"),
            rs.getInt("mouse_button"),
            gobId,
            meshId
          ));
        }
      }
    }
    return clicks;
  }

  private static String _formatDatetime(long epochMillis) {
    return DATETIME_FORMATTER.format(Instant.ofEpochMilli(epochMillis));
  }

  public static final class Recording {
    public final long id;
    public final String name;
    public final List<RecordedClick> clicks;

    Recording(long id, String name, List<RecordedClick> clicks) {
      this.id = id;
      this.name = name;
      this.clicks = clicks;
    }
  }

  public static final class RecordedClick {
    public final int index;
    public final int x;
    public final int y;
    public final int mouseButton;
    public final Long gobId;
    public final Integer meshId;

    RecordedClick(int index, int x, int y, int mouseButton, Long gobId, Integer meshId) {
      this.index = index;
      this.x = x;
      this.y = y;
      this.mouseButton = mouseButton;
      this.gobId = gobId;
      this.meshId = meshId;
    }
  }
}
