package lmi.draw;

import haven.GOut;
import haven.MapView;
import lmi.waypoint.WaypointOverlay;

public final class LmiOverlay {
  static {
    OverlayRegistry.register(CurrentGridDebugOverlay.instance());
    OverlayRegistry.register(WaypointOverlay.instance());
  }

  private LmiOverlay() {}

  public static void draw(MapView mapView, GOut g) {
    for (MapOverlay overlay : OverlayRegistry.overlays()) {
      if (!overlay.visible())
        continue;
      overlay.draw(mapView, g);
    }
  }
}
