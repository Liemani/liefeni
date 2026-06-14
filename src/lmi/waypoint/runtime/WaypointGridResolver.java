package lmi.waypoint.runtime;

import haven.Coord;
import haven.GameUI;
import haven.MapFile;
import haven.MCache;
import lmi.core.AppContext;
import lmi.bridge.GlobBridge;
import java.util.HashMap;
import java.util.Map;

public final class WaypointGridResolver {
  private static final Map<Long, ResolvedGrid> resolvedByHavenGridId = new HashMap<>();

  private WaypointGridResolver() {}

  public static synchronized void clear() {
    resolvedByHavenGridId.clear();
  }

  public static synchronized ResolvedGrid resolveGrid(Coord gc) {
    MCache.Grid grid = GlobBridge.gridAtGc(gc);
    if (grid == null)
      return null;

    ResolvedGrid cached = resolvedByHavenGridId.get(grid.id);
    if (cached != null)
      return cached;

    MapFile file = mapFile();
    if (file == null)
      return null;

    MapFile.GridInfo info = file.gridinfo.get(grid.id);
    if (info == null) {
      try {
        file.update(GlobBridge.glob().map, gc);
      } catch (RuntimeException ignored) {
      }
      info = file.gridinfo.get(grid.id);
    }
    if (info == null)
      return null;

    Coord originWorld = Coord.of(grid.ul.mul(MCache.tilesz));
    WaypointGridSaveCoordinator.saveIfMissing(info.seg, originWorld.x, originWorld.y, grid.id, originWorld);
    return resolvedByHavenGridId.get(grid.id);
  }

  static synchronized ResolvedGrid resolvedGrid(long havenGridId) {
    return resolvedByHavenGridId.get(havenGridId);
  }

  static synchronized void putResolvedGrid(long havenGridId, ResolvedGrid grid) {
    resolvedByHavenGridId.put(havenGridId, grid);
  }

  private static MapFile mapFile() {
    GameUI gameUI = AppContext.gameUI();
    if (gameUI == null)
      return null;
    if (gameUI.mmap != null)
      return gameUI.mmap.file;
    if (gameUI.mapfile != null)
      return gameUI.mapfile.file;
    return null;
  }
}
