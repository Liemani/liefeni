package lmi.draw;

import haven.Coord;
import haven.Coord2d;
import haven.Coord3f;
import haven.FastText;
import haven.GOut;
import haven.MapView;
import lmi.core.Constant;
import lmi.core.LocalPlayer;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.runtime.GridPosition;
import lmi.bridge.GlobBridge;

import java.awt.Color;

public final class CurrentGridDebugOverlay implements MapOverlay {
  private static final int GRID_TILE_SIZE = 100;
  private static final CurrentGridDebugOverlay INSTANCE = new CurrentGridDebugOverlay();
  private static final Color GRID_CORNER_COLOR = new Color(255, 140, 90, 220);
  private static final Color GRID_LABEL_COLOR = new Color(255, 230, 210, 240);
  private static boolean enabled = false;

  private CurrentGridDebugOverlay() {}

  public static CurrentGridDebugOverlay instance() {
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
    Coord selfWorld = LocalPlayer.position();
    GridPosition selfGrid = WaypointManager.currentGridPosition();
    if (selfGrid == null)
      return;

    int gridWorldSize = GRID_TILE_SIZE * Constant.TILE_IN_COORD;
    Coord gridOriginWorld = Coord.of(
      Math.floorDiv(selfWorld.x, gridWorldSize) * gridWorldSize,
      Math.floorDiv(selfWorld.y, gridWorldSize) * gridWorldSize
    );

    drawGridCorner(mapView, g, "GTL", gridOriginWorld.x, gridOriginWorld.y, 8, -30);
    drawGridCorner(mapView, g, "GTR", gridOriginWorld.x + gridWorldSize, gridOriginWorld.y, 8, -30);
    drawGridCorner(mapView, g, "GBR", gridOriginWorld.x + gridWorldSize, gridOriginWorld.y + gridWorldSize, 8, 18);
    drawGridCorner(mapView, g, "GBL", gridOriginWorld.x, gridOriginWorld.y + gridWorldSize, 8, 18);
  }

  private static void drawGridCorner(MapView mapView, GOut g, String label, int worldX, int worldY, int labelDx, int labelDy) {
    Coord world = Coord.of(worldX, worldY);
    Coord screen = screen(mapView, world);
    if (screen == null)
      return;

    g.chcolor(GRID_CORNER_COLOR);
    g.frect(screen.sub(2, 2), Coord.of(5, 5));
    g.chcolor(GRID_LABEL_COLOR);
    FastText.print(g, screen.add(labelDx, labelDy), label + " world=(" + worldX + ", " + worldY + ")");
    g.chcolor();
  }

  private static Coord screen(MapView mapView, Coord world) {
    Coord2d world2d = Coord2d.of(
      world.x * Constant.COORD2D_PER_COORD,
      world.y * Constant.COORD2D_PER_COORD
    );
    Coord3f world3d = GlobBridge.glob().map.getzp(world2d);
    Coord3f projected = mapView.screenxf(world3d);
    if (projected == null)
      return null;
    Coord screen = Coord.of(Math.round(projected.x), Math.round(projected.y));
    if ((screen.x < 0) || (screen.y < 0) || (screen.x >= mapView.sz.x) || (screen.y >= mapView.sz.y))
      return null;
    return screen;
  }
}
