package lmi.waypoint.runtime;

import haven.Area;
import haven.Coord;
import haven.MCache;

import static lmi.Constant.TILE_IN_COORD;

public final class WaypointCutBounds {
  private static final int CUT_ID_SHIFT = 14;

  public final Coord centerCut;
  public final Area loadArea;
  public final Area renderArea;

  private WaypointCutBounds(Coord centerCut, Area loadArea, Area renderArea) {
    this.centerCut = centerCut;
    this.loadArea = loadArea;
    this.renderArea = renderArea;
  }

  public static WaypointCutBounds aroundVir(Coord vir) {
    Coord centerCut = cutOfVir(vir.x, vir.y);
    Area loadArea = new Area(centerCut.sub(3, 3), centerCut.add(4, 4));
    Area renderArea = new Area(centerCut.sub(2, 2), centerCut.add(3, 3));
    return new WaypointCutBounds(centerCut, loadArea, renderArea);
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

  public static Coord cutOfWorld(int x, int y) {
    int tileX = Math.floorDiv(x, TILE_IN_COORD);
    int tileY = Math.floorDiv(y, TILE_IN_COORD);
    return Coord.of(Math.floorDiv(tileX, MCache.cutsz.x), Math.floorDiv(tileY, MCache.cutsz.y));
  }

  public static Coord cutOriginOfWorld(Coord world) {
    return cutOriginOfCut(cutOfWorld(world.x, world.y));
  }

  public static Coord cutOfVir(int virX, int virY) {
    int cutWidth = MCache.cutsz.x * TILE_IN_COORD;
    int cutHeight = MCache.cutsz.y * TILE_IN_COORD;
    return Coord.of(Math.floorDiv(virX, cutWidth), Math.floorDiv(virY, cutHeight));
  }

  public Coord cutOfVir(Coord vir) {
    return cutOfVir(vir.x, vir.y);
  }

  public static Coord cutOriginOfVir(int virX, int virY) {
    return cutOriginOfCut(cutOfVir(virX, virY));
  }

  public static Coord cutOriginOfCut(Coord cut) {
    return Coord.of(
      cut.x * MCache.cutsz.x * TILE_IN_COORD,
      cut.y * MCache.cutsz.y * TILE_IN_COORD
    );
  }

  public static long cutIdOfVir(int virX, int virY) {
    Coord cut = cutOfVir(virX, virY);
    return cutIdOfCut(cut.x, cut.y);
  }

  public static long cutIdOfCut(int cutX, int cutY) {
    return cutX + ((long)cutY << CUT_ID_SHIFT);
  }

  public boolean renderContainsCutId(long cutId) {
    for (Coord cut : renderArea) {
      if (cutId == cutIdOfCut(cut.x, cut.y))
        return true;
    }
    return false;
  }
}
