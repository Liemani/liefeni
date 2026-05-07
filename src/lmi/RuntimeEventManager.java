package lmi;

import lmi.waypoint.WaypointManager;

import java.util.ArrayList;

import static lmi.Constant.ExceptionReason.ER_TIMEOUT;
import static lmi.Constant.Timeout.TO_INFINITE;
import static lmi.Constant.Timeout.TO_POLL;

public final class RuntimeEventManager {
  private static final Object lock = new Object();
  private static final ArrayList<RuntimeEventHandler> handlers = new ArrayList<>();
  private static final RuntimeEventHandler waypointRefreshHandler = new RuntimeEventHandler() {
    @Override
    public boolean handle() {
      WaypointManager.processRefreshRequests();
      return false;
    }
  };

  private static Thread thread;
  private static boolean running = false;

  private RuntimeEventManager() {}

  public static void init() {
    synchronized (lock) {
      running = true;
      if (thread != null && thread.isAlive())
        return;

      thread = new Thread(RuntimeEventManager::_loop, "RuntimeEventManager");
      thread.setDaemon(true);
      thread.start();
    }
  }

  public static void clear() {
    synchronized (lock) {
      handlers.clear();
      lock.notifyAll();
    }
  }

  public static void registerWaypointRefreshHandler() {
    _addHandler(waypointRefreshHandler);
  }

  public static void unregisterWaypointRefreshHandler() {
    synchronized (lock) {
      handlers.remove(waypointRefreshHandler);
      lock.notifyAll();
    }
  }

  public static void shutdown() {
    Thread worker;
    synchronized (lock) {
      running = false;
      handlers.clear();
      lock.notifyAll();
      worker = thread;
      thread = null;
    }
    if (worker != null)
      worker.interrupt();
  }

  private static void _addHandler(RuntimeEventHandler handler) {
    synchronized (lock) {
      if (handlers.contains(handler))
        return;
      handlers.add(handler);
      lock.notifyAll();
    }
  }

  private static void _loop() {
    while (true) {
      ArrayList<RuntimeEventHandler> snapshot;
      synchronized (lock) {
        if (!running)
          return;
        while (running && handlers.isEmpty()) {
          try {
            lock.wait(TO_INFINITE);
          } catch (InterruptedException ignored) {}
        }
        if (!running)
          return;
        snapshot = new ArrayList<>(handlers);
      }

      ArrayList<RuntimeEventHandler> completed = new ArrayList<>();
      for (RuntimeEventHandler handler : snapshot) {
        try {
          if (handler.handle())
            completed.add(handler);
        } catch (LMIException e) {
          if (e.reason == ER_TIMEOUT) {
            completed.add(handler);
          } else {
            Util.debugPrint(e);
            completed.add(handler);
          }
        } catch (Exception e) {
          Util.debugPrint(e);
          completed.add(handler);
        }
      }

      synchronized (lock) {
        handlers.removeAll(completed);
        if (!running)
          return;
        try {
          lock.wait(TO_POLL);
        } catch (InterruptedException ignored) {}
      }
    }
  }

  public interface RuntimeEventHandler {
    boolean handle();
  }
}
