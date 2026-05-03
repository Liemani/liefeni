package lmi.waypoint;

import lmi.waypoint.model.LoadAnchorsResult;

public final class WaypointBootstrap {
  private static boolean initialized;

  private WaypointBootstrap() {}

  public static synchronized void init() {
    WaypointDbExecutor.init();
    if (!WaypointManager.beginAnchorsLoad()) {
      initialized = true;
      return;
    }
    WaypointStore.loadAnchorsAsync(new WaypointResultHandler<LoadAnchorsResult>() {
      @Override
      public void onSuccess(LoadAnchorsResult result) {
        WaypointManager.setAnchors(result.anchors);
      }

      @Override
      public void onFailure(Exception error) {
        WaypointManager.endAnchorsLoad();
        WaypointManager.setAnchors(new lmi.Array<>());
      }
    });
    initialized = true;
  }

  public static synchronized boolean initialized() {
    return initialized;
  }
}
