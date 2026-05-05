package lmi.draw;

import haven.Coord;
import haven.Coord2d;
import haven.Coord3f;
import haven.FastText;
import haven.GOut;
import haven.MapView;
import haven.MCache;
import lmi.AppContext;
import lmi.Constant;
import lmi.Self;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.runtime.WaypointCutBounds;

import java.awt.Color;

public final class CurrentCutDebugOverlay implements MapOverlay {
  private static final int GRID_TILE_SIZE = 100;
  private static final CurrentCutDebugOverlay INSTANCE = new CurrentCutDebugOverlay();
  private static final Color CORNER_COLOR = new Color(80, 180, 255, 220);
  private static final Color LABEL_COLOR = new Color(220, 245, 255, 240);
  private static final Color GRID_CORNER_COLOR = new Color(255, 140, 90, 220);
  private static final Color GRID_LABEL_COLOR = new Color(255, 230, 210, 240);
  private static boolean enabled = true;

  private CurrentCutDebugOverlay() {}

  public static CurrentCutDebugOverlay instance() {
    return INSTANCE;
  }

  public static boolean toggle() {
    enabled = !enabled;
    return enabled;
  }

  @Override
  public int zOrder() {
    return 100;
  }

  @Override
  public boolean visible() {
    return enabled;
  }

  @Override
  public void draw(MapView mapView, GOut g) {
    if (!WaypointManager.isCalibrated())
      return;

    Coord selfWorld = Self.position();
    Coord selfVir = WaypointManager.virOfWorld(Self.position());
    Coord cut = WaypointCutBounds.cutOfVir(selfVir.x, selfVir.y);
    Coord cutOriginVir = WaypointCutBounds.cutOriginOfCut(cut);
    int cutWidth = MCache.cutsz.x * Constant.TILE_IN_COORD;
    int cutHeight = MCache.cutsz.y * Constant.TILE_IN_COORD;

    _drawCutCorner(mapView, g, "TL", cutOriginVir.x, cutOriginVir.y, 8, -16);
    _drawCutCorner(mapView, g, "TR", cutOriginVir.x + cutWidth, cutOriginVir.y, 8, -16);
    _drawCutCorner(mapView, g, "BR", cutOriginVir.x + cutWidth, cutOriginVir.y + cutHeight, 8, 4);
    _drawCutCorner(mapView, g, "BL", cutOriginVir.x, cutOriginVir.y + cutHeight, 8, 4);

    int gridWorldSize = GRID_TILE_SIZE * Constant.TILE_IN_COORD;
    Coord gridOriginWorld = Coord.of(
      Math.floorDiv(selfWorld.x, gridWorldSize) * gridWorldSize,
      Math.floorDiv(selfWorld.y, gridWorldSize) * gridWorldSize
    );

    _drawGridCorner(mapView, g, "GTL", gridOriginWorld.x, gridOriginWorld.y, 8, -30);
    _drawGridCorner(mapView, g, "GTR", gridOriginWorld.x + gridWorldSize, gridOriginWorld.y, 8, -30);
    _drawGridCorner(mapView, g, "GBR", gridOriginWorld.x + gridWorldSize, gridOriginWorld.y + gridWorldSize, 8, 18);
    _drawGridCorner(mapView, g, "GBL", gridOriginWorld.x, gridOriginWorld.y + gridWorldSize, 8, 18);
  }

  private static void _drawCutCorner(MapView mapView, GOut g, String label, int virX, int virY, int labelDx, int labelDy) {
    Coord world = WaypointManager.worldOfVir(virX, virY);
    Coord screen = _screen(mapView, world);
    if (screen == null)
      return;

    g.chcolor(CORNER_COLOR);
    g.frect(screen.sub(2, 2), Coord.of(5, 5));
    g.chcolor(LABEL_COLOR);
    FastText.print(g, screen.add(labelDx, labelDy), label + " vir=(" + virX + ", " + virY + ")");
    FastText.print(g, screen.add(labelDx, labelDy + 14), "world=(" + world.x + ", " + world.y + ")");
    g.chcolor();
  }

  private static void _drawGridCorner(MapView mapView, GOut g, String label, int worldX, int worldY, int labelDx, int labelDy) {
    Coord world = Coord.of(worldX, worldY);
    Coord screen = _screen(mapView, world);
    if (screen == null)
      return;

    g.chcolor(GRID_CORNER_COLOR);
    g.frect(screen.sub(2, 2), Coord.of(5, 5));
    g.chcolor(GRID_LABEL_COLOR);
    FastText.print(g, screen.add(labelDx, labelDy), label + " world=(" + worldX + ", " + worldY + ")");
    g.chcolor();
  }

  private static Coord _screen(MapView mapView, Coord world) {
    Coord2d world2d = Coord2d.of(
      world.x * Constant.COORD2D_PER_COORD,
      world.y * Constant.COORD2D_PER_COORD
    );
    Coord3f world3d = AppContext.glob.map.getzp(world2d);
    Coord3f projected = mapView.screenxf(world3d);
    if (projected == null)
      return null;
    Coord screen = Coord.of(Math.round(projected.x), Math.round(projected.y));
    if ((screen.x < 0) || (screen.y < 0) || (screen.x >= mapView.sz.x) || (screen.y >= mapView.sz.y))
      return null;
    return screen;
  }
}
