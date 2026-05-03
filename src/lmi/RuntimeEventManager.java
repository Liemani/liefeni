package lmi;

import haven.Gob;
import lmi.waypoint.WaypointPortal;
import lmi.waypoint.WaypointManager;

import java.util.ArrayList;

import static lmi.Constant.ExceptionReason.ER_TIMEOUT;
import static lmi.Constant.Timeout.TO_INFINITE;
import static lmi.Constant.Timeout.TO_POLL;

public final class RuntimeEventManager {
  private static final Object lock = new Object();
  private static final ArrayList<RuntimeEventHandler> handlers = new ArrayList<>();

  private static Thread thread;
  private static boolean running = false;

  private RuntimeEventManager() {}

  public static void init() {
    synchronized (lock) {
      handlers.clear();
      running = true;
      _addPersistentHandlers();
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

  public static void calibratePortal() {
    final long deadline = System.currentTimeMillis() + (5 * lmi.Constant.Timeout.TO_RETRY);
    _addHandler(new RuntimeEventHandler() {
      @Override
      public boolean handle() {
        System.out.printf("calibratePortal\n");
        if (System.currentTimeMillis() >= deadline)
          throw new LMIException(ER_TIMEOUT);

        Gob portal = _nearestRegisteredPortal();
        if (portal == null)
          return false;

        WaypointManager.calibrate(portal);
        return true;
      }
    });
  }

  private static void _addHandler(RuntimeEventHandler handler) {
    synchronized (lock) {
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

  private static void _addPersistentHandlers() {
    handlers.add(new RuntimeEventHandler() {
      @Override
      public boolean handle() {
        WaypointManager.refreshSceneIfBoundsChanged();
        return false;
      }
    });
  }

  private static Gob _nearestRegisteredPortal() {
    return WaypointPortal.closestPortalForRecalibration();
  }
}
