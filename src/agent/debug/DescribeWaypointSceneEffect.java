package agent.debug;

import agent.Effect;
import haven.Coord;
import haven.MapView;
import lmi.Api;
import lmi.AppContext;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.WaypointOverlay;
import lmi.waypoint.runtime.ResolvedNode;

public class DescribeWaypointSceneEffect extends Effect {
  @Override
  public void execute() {
    WaypointManager.refresh();
    for (String line : WaypointManager.debugLines())
      Api.message(line);

    MapView mapView = AppContext.mapView();
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
    return "Prints waypoint calibration, virtual coordinates, scene bounds, and drawable/hidden scene counts.";
  }
}
