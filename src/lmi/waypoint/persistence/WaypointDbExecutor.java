package lmi.waypoint.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class WaypointDbExecutor {
  private static final Object lock = new Object();
  private static final BlockingQueue<Task<?>> queue = new LinkedBlockingQueue<>();

  private static Thread thread;
  private static boolean initialized;
  private static Connection connection;

  private WaypointDbExecutor() {}

  public static void init() {
    synchronized (lock) {
      if (initialized)
        return;
      thread = new Thread(WaypointDbExecutor::runLoop, "Waypoint DB Executor");
      thread.setDaemon(true);
      thread.start();
      initialized = true;
    }
  }

  public static <R extends WaypointResult> void submitRead(
    WaypointReadRequest<R> request,
    WaypointResultHandler<R> handler
  ) {
    init();
    queue.offer(new Task<>(request, handler));
  }

  public static <R extends WaypointResult> void submitWrite(
    WaypointWriteRequest<R> request,
    WaypointResultHandler<R> handler
  ) {
    init();
    queue.offer(new Task<>(request, handler));
  }

  public static void clear() {
    queue.clear();
    WaypointSyncManager.clear();
  }

  private static void runLoop() {
    while (true) {
      try {
        Task<?> task = queue.take();
        task.execute(connection());
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        closeConnection();
        return;
      } catch (Exception ignored) {}
    }
  }

  private static Connection connection() throws Exception {
    if (connection == null || connection.isClosed()) {
      Class.forName("org.sqlite.JDBC");
      connection = DriverManager.getConnection(WaypointDatabase.jdbcUrl());
      WaypointDatabase.initialize(connection);
    }
    return connection;
  }

  private static void closeConnection() {
    try {
      if (connection != null && !connection.isClosed())
        connection.close();
    } catch (Exception ignored) {}
    connection = null;
  }

  private static final class Task<R extends WaypointResult> {
    private final WaypointRequest<R> request;
    private final WaypointResultHandler<R> handler;

    private Task(WaypointRequest<R> request, WaypointResultHandler<R> handler) {
      this.request = request;
      this.handler = handler;
    }

    private void execute(Connection conn) {
      try {
        R result = request.execute(conn);
        if (handler != null)
          WaypointSyncManager.enqueue(() -> handler.onSuccess(result));
      } catch (Exception error) {
        if (handler != null)
          WaypointSyncManager.enqueue(() -> handler.onFailure(error));
      }
    }
  }
}
