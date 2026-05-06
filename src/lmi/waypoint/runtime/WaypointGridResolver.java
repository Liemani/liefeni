package lmi.waypoint.runtime;

import haven.Coord;
import haven.GameUI;
import haven.MapFile;
import haven.MCache;
import lmi.AppContext;
import lmi.waypoint.persistence.WaypointStore;

import java.util.HashMap;
import java.util.Map;

public final class WaypointGridResolver {
  private static final Map<Long, ResolvedGrid> resolvedByHavenGridId = new HashMap<>();

  private WaypointGridResolver() {}

  public static synchronized void clear() {
    resolvedByHavenGridId.clear();
  }

  public static synchronized ResolvedGrid resolveGrid(Coord gc) {
    if (gc == null || AppContext.glob == null)
      return null;

    MCache.Grid grid;
    try {
      grid = AppContext.glob.map.getgrid(gc);
    } catch (RuntimeException e) {
      return null;
    }
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
        file.update(AppContext.glob.map, gc);
      } catch (RuntimeException ignored) {
      }
      info = file.gridinfo.get(grid.id);
    }
    if (info == null)
      return null;

    Coord originWorld = Coord.of(grid.ul.mul(MCache.tilesz));
    long mapGridId = WaypointStore.ensureMapGridId(info.seg, originWorld.x, originWorld.y, grid.id);
    ResolvedGrid resolved = new ResolvedGrid(mapGridId, grid.id, info.seg, originWorld);
    resolvedByHavenGridId.put(grid.id, resolved);
    return resolved;
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
