package lmi.waypoint;

import haven.Coord;
import haven.Coord2d;
import haven.Coord3f;
import haven.FastText;
import haven.GOut;
import haven.MapView;
import lmi.Array;
import lmi.Constant;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.runtime.ResolvedNode;
import lmi.waypoint.runtime.ResolvedPoint;

import java.awt.Color;
import java.util.HashSet;

public final class WaypointOverlay {
  private static final Color POINT_COLOR = new Color(180, 180, 180, 160);
  private static final Color NODE_COLOR = new Color(80, 220, 120, 220);
  private static final Color SELECTED_NODE_COLOR = new Color(255, 220, 80, 240);
  private static final Color TEST_COLOR = new Color(255, 80, 80, 220);

  private static boolean testEnabled;

  private WaypointOverlay() {}

  public static boolean toggleTest() {
    testEnabled = !testEnabled;
    return testEnabled;
  }

  public static void draw(MapView mapView, GOut g) {
    if (testEnabled)
      _drawTestOverlay(mapView, g);

    if (!WaypointManager.isCalibrated())
      return;

    Array<ResolvedPoint> points = WaypointManager.nearbyPoints();
    Array<ResolvedNode> nodes = WaypointManager.nearbyNodes();
    Array<ManagedWpNode> selectedNodes = WaypointManager.selectedManagedNodes();

    HashSet<Long> selectedNodeIds = new HashSet<>();
    for (ManagedWpNode node : selectedNodes)
      selectedNodeIds.add(node.id);

    g.chcolor(POINT_COLOR);
    for (ResolvedPoint point : points) {
      Coord screen = _screen(mapView, point.world);
      if (screen == null)
        continue;
      g.frect(screen.sub(1, 1), Coord.of(3, 3));
    }

    for (ResolvedNode node : nodes) {
      boolean selected = selectedNodeIds.contains(node.id);
      Coord screen = _screen(mapView, node.world);
      if (screen == null)
        continue;

      g.chcolor(selected ? SELECTED_NODE_COLOR : NODE_COLOR);
      Coord markerSize = selected ? Coord.of(9, 9) : Coord.of(7, 7);
      g.frect(screen.sub(markerSize.div(2)), markerSize);

      if (selected) {
        g.chcolor(SELECTED_NODE_COLOR);
        FastText.print(g, screen.add(8, -14), node.name);
      }
    }
    g.chcolor();
  }

  public static Coord debugScreen(MapView mapView, Coord world) {
    return _screen(mapView, world);
  }

  private static void _drawTestOverlay(MapView mapView, GOut g) {
    Coord center = mapView.sz.div(2);

    g.chcolor(TEST_COLOR);
    g.line(center.add(-40, 0), center.add(40, 0), 2);
    g.line(center.add(0, -40), center.add(0, 40), 2);
    g.frect(center.add(48, -10), Coord.of(16, 16));
    FastText.print(g, center.add(70, -6), "WAYPOINT TEST");
    g.chcolor();
  }

  private static Coord _screen(MapView mapView, Coord world) {
    Coord2d world2d = Coord2d.of(
      world.x * Constant.COORD2D_PER_COORD,
      world.y * Constant.COORD2D_PER_COORD
    );
    Coord3f projected = mapView.screenxf(world2d);
    if (projected == null)
      return null;

    Coord screen = Coord.of(Math.round(projected.x), Math.round(projected.y));
    if ((screen.x < 0) || (screen.y < 0) || (screen.x >= mapView.sz.x) || (screen.y >= mapView.sz.y))
      return null;
    return screen;
  }
}
