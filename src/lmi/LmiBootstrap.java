package lmi;

import lmi.waypoint.WaypointBootstrap;

public final class LmiBootstrap {
  private static boolean initialized;

  private LmiBootstrap() {}

  public static synchronized void init() {
    if (!initialized) {
      RuntimeEventManager.init();
      initialized = true;
    }
    WaypointBootstrap.init();
  }
}
