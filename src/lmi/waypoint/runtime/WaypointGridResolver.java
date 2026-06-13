package lmi.waypoint.runtime;

import haven.Coord;
import haven.GameUI;
import haven.MapFile;
import haven.MCache;
import lmi.AppContext;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.model.SaveMapGridResult;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.persistence.WaypointStore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WaypointGridResolver {
  private static final Map<Long, ResolvedGrid> resolvedByHavenGridId = new HashMap<>();
  private static final Set<Long> pendingGridSaveHavenGridIds = new HashSet<>();
  private static final Map<Long, List<WaypointResultHandler<SaveMapGridResult>>> pendingHandlersByHavenGridId = new HashMap<>();

  private WaypointGridResolver() {}

  public static synchronized void clear() {
    resolvedByHavenGridId.clear();
    pendingGridSaveHavenGridIds.clear();
    pendingHandlersByHavenGridId.clear();
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
    _saveMapGridIfMissingAsync(info.seg, originWorld.x, originWorld.y, grid.id, originWorld);
    return resolvedByHavenGridId.get(grid.id);
  }

  public static void saveGridIfMissing(Coord gc, WaypointResultHandler<SaveMapGridResult> handler) {
    if (handler == null)
      throw new IllegalArgumentException("handler is null");
    if (gc == null || AppContext.glob == null) {
      handler.onFailure(new RuntimeException("current Haven grid is unavailable."));
      return;
    }

    MCache.Grid grid;
    try {
      grid = AppContext.glob.map.getgrid(gc);
    } catch (RuntimeException e) {
      handler.onFailure(new RuntimeException("current Haven grid is unavailable.", e));
      return;
    }
    if (grid == null) {
      handler.onFailure(new RuntimeException("current Haven grid is unavailable."));
      return;
    }

    ResolvedGrid cached;
    synchronized (WaypointGridResolver.class) {
      cached = resolvedByHavenGridId.get(grid.id);
    }
    if (cached != null) {
      handler.onSuccess(new SaveMapGridResult(cached.mapGridId, cached.mapSegmentId, cached.havenGridId, cached.originWorld.x, cached.originWorld.y));
      return;
    }

    MapFile file = mapFile();
    if (file == null) {
      handler.onFailure(new RuntimeException("MapFile is unavailable."));
      return;
    }

    MapFile.GridInfo info = file.gridinfo.get(grid.id);
    if (info == null) {
      try {
        file.update(AppContext.glob.map, gc);
      } catch (RuntimeException ignored) {
      }
      info = file.gridinfo.get(grid.id);
    }
    if (info == null) {
      handler.onFailure(new RuntimeException("MapFile grid info is unavailable for current grid."));
      return;
    }

    Coord originWorld = Coord.of(grid.ul.mul(MCache.tilesz));
    _saveMapGridIfMissingAsync(info.seg, originWorld.x, originWorld.y, grid.id, originWorld, handler);
  }

  private static synchronized void _saveMapGridIfMissingAsync(long mapSegmentId, int localX, int localY, long havenGridId, Coord originWorld) {
    _saveMapGridIfMissingAsync(mapSegmentId, localX, localY, havenGridId, originWorld, null);
  }

  private static synchronized void _saveMapGridIfMissingAsync(
    long mapSegmentId,
    int localX,
    int localY,
    long havenGridId,
    Coord originWorld,
    WaypointResultHandler<SaveMapGridResult> handler
  ) {
    if (resolvedByHavenGridId.containsKey(havenGridId))
      return;
    if (pendingGridSaveHavenGridIds.contains(havenGridId)) {
      if (handler != null) {
        pendingHandlersByHavenGridId
          .computeIfAbsent(havenGridId, key -> new ArrayList<>())
          .add(handler);
      }
      return;
    }
    pendingGridSaveHavenGridIds.add(havenGridId);
    if (handler != null) {
      pendingHandlersByHavenGridId
        .computeIfAbsent(havenGridId, key -> new ArrayList<>())
        .add(handler);
    }
    WaypointStore.saveMapGridIfMissingAsync(mapSegmentId, localX, localY, havenGridId, new WaypointResultHandler<SaveMapGridResult>() {
      @Override
      public void onSuccess(SaveMapGridResult result) {
        List<WaypointResultHandler<SaveMapGridResult>> handlers;
        synchronized (WaypointGridResolver.class) {
          pendingGridSaveHavenGridIds.remove(result.havenGridId);
          resolvedByHavenGridId.put(
            result.havenGridId,
            new ResolvedGrid(result.mapGridId, result.havenGridId, result.mapSegmentId, Coord.of(result.localX, result.localY))
          );
          handlers = pendingHandlersByHavenGridId.remove(result.havenGridId);
        }
        if (handlers != null) {
          for (WaypointResultHandler<SaveMapGridResult> handler : handlers) {
            try {
              handler.onSuccess(result);
            } catch (RuntimeException ignored) {
            }
          }
        }
        WaypointManager.requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        List<WaypointResultHandler<SaveMapGridResult>> handlers;
        synchronized (WaypointGridResolver.class) {
          pendingGridSaveHavenGridIds.remove(havenGridId);
          handlers = pendingHandlersByHavenGridId.remove(havenGridId);
        }
        if (handlers != null) {
          for (WaypointResultHandler<SaveMapGridResult> handler : handlers) {
            try {
              handler.onFailure(error);
            } catch (RuntimeException ignored) {
            }
          }
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
