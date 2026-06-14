package agent.debug;

import agent.Effect;
import haven.Coord;
import haven.MapView;
import lmi.bridge.Api;
import lmi.waypoint.WaypointDebug;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.WaypointOverlay;
import lmi.waypoint.runtime.ResolvedNode;
import lmi.bridge.MapViewBridge;

public class DescribeWaypointSceneEffect extends Effect {
  @Override
  public void execute() {
    WaypointManager.refresh();
    for (String line : WaypointDebug.lines())
      Api.message(line);

    MapView mapView = MapViewBridge.mapView();
    if (mapView == null) {
      Api.message("MapView: null");
      return;
    }

    if (WaypointManager.nearbyNodes().count() == 0) {
      Api.message("drawableNode[0].screen: unavailable");
      return;
    }

    ResolvedNode node = WaypointManager.nearbyNodes().get(0);
    Coord screen = WaypointOverlay.debugScreen(mapView, node.world);
    Api.message("drawableNode[0].screen: " + screen);
    Api.message("MapView.sz: " + mapView.sz);
  }

  public static String name() {
    return "Describe Waypoint Scene";
  }

  public static String info() {
    return "Prints waypoint scene state, active graph, grid bounds, and drawable/hidden scene counts.";
  }
}
