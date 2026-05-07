package lmi.waypoint.runtime;

import haven.Coord;
import haven.GameUI;
import haven.MapFile;
import haven.MCache;
import lmi.AppContext;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.model.EnsureMapGridResult;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.persistence.WaypointStore;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class WaypointGridResolver {
  private static final Map<Long, ResolvedGrid> resolvedByHavenGridId = new HashMap<>();
  private static final Set<Long> pendingEnsureHavenGridIds = new HashSet<>();

  private WaypointGridResolver() {}

  public static synchronized void clear() {
    resolvedByHavenGridId.clear();
    pendingEnsureHavenGridIds.clear();
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
    _ensureMapGridAsync(info.seg, originWorld.x, originWorld.y, grid.id, originWorld);
    return resolvedByHavenGridId.get(grid.id);
  }

  private static void _ensureMapGridAsync(long mapSegmentId, int localX, int localY, long havenGridId, Coord originWorld) {
    if (resolvedByHavenGridId.containsKey(havenGridId))
      return;
    if (pendingEnsureHavenGridIds.contains(havenGridId))
      return;
    pendingEnsureHavenGridIds.add(havenGridId);
    WaypointStore.ensureMapGridAsync(mapSegmentId, localX, localY, havenGridId, new WaypointResultHandler<EnsureMapGridResult>() {
      @Override
      public void onSuccess(EnsureMapGridResult result) {
        synchronized (WaypointGridResolver.class) {
          pendingEnsureHavenGridIds.remove(result.havenGridId);
          resolvedByHavenGridId.put(
            result.havenGridId,
            new ResolvedGrid(result.mapGridId, result.havenGridId, result.mapSegmentId, Coord.of(result.localX, result.localY))
          );
        }
        WaypointManager.requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        synchronized (WaypointGridResolver.class) {
          pendingEnsureHavenGridIds.remove(havenGridId);
        }
        WaypointManager.requestRefresh();
      }
    });
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
