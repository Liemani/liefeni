package lmi.waypoint;

import haven.Coord;
import haven.Coord2d;
import haven.Coord3f;
import haven.FastText;
import haven.GOut;
import haven.MapView;
import lmi.AppContext;
import lmi.Array;
import lmi.Constant;
import lmi.draw.MapOverlay;
import lmi.waypoint.runtime.ResolvedLine;
import lmi.waypoint.runtime.ResolvedNode;
import lmi.waypoint.runtime.ResolvedPoint;

import java.awt.Color;

public final class WaypointOverlay implements MapOverlay {
  private static final WaypointOverlay INSTANCE = new WaypointOverlay();
  private static final Color POINT_COLOR = new Color(205, 205, 205, 170);
  private static final Color LINE_COLOR = new Color(190, 190, 190, 165);
  private static final Color NODE_COLOR = new Color(80, 220, 120, 220);
  private static final Color NODE_LABEL_COLOR = new Color(255, 220, 80, 240);
  private static final Color TEST_COLOR = new Color(255, 80, 80, 220);

  private static boolean testEnabled;

  private WaypointOverlay() {}

  public static WaypointOverlay instance() {
    return INSTANCE;
  }

  public static boolean toggleTest() {
    testEnabled = !testEnabled;
    return testEnabled;
  }

  @Override
  public void draw(MapView mapView, GOut g) {
    if (testEnabled)
      _drawTestOverlay(mapView, g);

    if (!WaypointManager.isCalibrated())
      return;

    Array<ResolvedPoint> points = WaypointManager.nearbyPoints();
    Array<ResolvedNode> nodes = WaypointManager.nearbyNodes();
    Array<ResolvedLine> lines = WaypointManager.scene().drawableLines;

    g.chcolor(LINE_COLOR);
    for (ResolvedLine line : lines) {
      Coord from = _project(mapView, line.fromWorld);
      Coord to = _project(mapView, line.toWorld);
      if (from == null || to == null)
        continue;
      g.line(from, to, 1);
    }

    g.chcolor(POINT_COLOR);
    for (ResolvedPoint point : points) {
      Coord screen = _screen(mapView, point.world);
      if (screen == null)
        continue;
      g.frect(screen.sub(1, 1), Coord.of(3, 3));
    }

    for (ResolvedNode node : nodes) {
      Coord screen = _screen(mapView, node.world);
      if (screen == null)
        continue;

      g.chcolor(NODE_COLOR);
      Coord markerSize = Coord.of(7, 7);
      g.frect(screen.sub(markerSize.div(2)), markerSize);
      g.chcolor(NODE_LABEL_COLOR);
      FastText.print(g, screen.add(8, -14), node.name);
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
    Coord screen = _project(mapView, world);
    if (screen == null)
      return null;
    if ((screen.x < 0) || (screen.y < 0) || (screen.x >= mapView.sz.x) || (screen.y >= mapView.sz.y))
      return null;
    return screen;
  }

  private static Coord _project(MapView mapView, Coord world) {
    Coord2d world2d = Coord2d.of(
      world.x * Constant.COORD2D_PER_COORD,
      world.y * Constant.COORD2D_PER_COORD
    );
    Coord3f world3d = AppContext.glob.map.getzp(world2d);
    Coord3f projected = mapView.screenxf(world3d);
    if (projected == null)
      return null;
    return Coord.of(Math.round(projected.x), Math.round(projected.y));
  }
}
