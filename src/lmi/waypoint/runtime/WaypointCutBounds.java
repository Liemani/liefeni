package lmi.waypoint.runtime;

import haven.Area;
import haven.Coord;
import haven.MCache;

import static lmi.Constant.TILE_IN_COORD;

public final class WaypointCutBounds {
  public final Coord centerCut;
  public final Area loadArea;
  public final Area renderArea;

  private WaypointCutBounds(Coord centerCut, Area loadArea, Area renderArea) {
    this.centerCut = centerCut;
    this.loadArea = loadArea;
    this.renderArea = renderArea;
  }

  public static WaypointCutBounds aroundWorld(Coord world) {
    Coord centerCut = cutOfWorld(world.x, world.y);
    Area loadArea = new Area(centerCut.sub(3, 3), centerCut.add(4, 4));
    Area renderArea = new Area(centerCut.sub(2, 2), centerCut.add(3, 3));
    return new WaypointCutBounds(centerCut, loadArea, renderArea);
  }

  public Coord cutOfWorld(Coord world) {
    return cutOfWorld(world.x, world.y);
  }

  private static Coord cutOfWorld(int x, int y) {
    int tileX = Math.floorDiv(x, TILE_IN_COORD);
    int tileY = Math.floorDiv(y, TILE_IN_COORD);
    return Coord.of(Math.floorDiv(tileX, MCache.cutsz.x), Math.floorDiv(tileY, MCache.cutsz.y));
  }
}
