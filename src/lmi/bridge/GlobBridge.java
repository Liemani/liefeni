package lmi.bridge;

import haven.Coord;
import haven.Coord2d;
import haven.Glob;
import haven.MCache;

public final class GlobBridge {
  private static Glob glob;

  private GlobBridge() {}

  public static void setGlob(Glob val) {
    glob = val;
  }

  public static void clear() {
    glob = null;
  }

  public static Glob glob() {
    return glob;
  }

  public static MCache.Grid gridAtGc(Coord gc) {
    Glob current = glob();
    if (current == null || gc == null)
      return null;
    try {
      return current.map.getgrid(gc);
    } catch (RuntimeException e) {
      return null;
    }
  }

  public static MCache.Grid gridAtWorld(Coord2d world) {
    if (world == null)
      return null;
    Coord tile = world.floor(MCache.tilesz);
    return gridAtGc(tile.div(MCache.cmaps));
  }
}
