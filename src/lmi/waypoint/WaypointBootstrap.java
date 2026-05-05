package lmi.waypoint;

import lmi.waypoint.persistence.WaypointDbExecutor;
public final class WaypointBootstrap {
  private static boolean initialized;

  private WaypointBootstrap() {}

  public static synchronized void init() {
    WaypointDbExecutor.init();
    initialized = true;
  }

  public static synchronized boolean initialized() {
    return initialized;
  }
}
