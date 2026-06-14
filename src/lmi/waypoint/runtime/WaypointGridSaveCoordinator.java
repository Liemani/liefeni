package lmi.waypoint.runtime;

import haven.Coord;
import haven.GameUI;
import haven.MapFile;
import haven.MCache;
import lmi.bridge.GlobBridge;
import lmi.core.AppContext;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.model.SaveMapGridResult;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.persistence.WaypointStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WaypointGridSaveCoordinator {
  private static final Set<Long> pendingGridSaveHavenGridIds = new HashSet<>();
  private static final Map<Long, List<WaypointResultHandler<SaveMapGridResult>>> pendingHandlersByHavenGridId = new HashMap<>();

  private WaypointGridSaveCoordinator() {}

  public static void saveIfMissing(Coord gc, WaypointResultHandler<SaveMapGridResult> handler) {
    if (handler == null)
      throw new IllegalArgumentException("handler is null");
    if (gc == null || GlobBridge.glob() == null) {
      handler.onFailure(new RuntimeException("current Haven grid is unavailable."));
      return;
    }

    MCache.Grid grid = GlobBridge.gridAtGc(gc);
    if (grid == null) {
      handler.onFailure(new RuntimeException("current Haven grid is unavailable."));
      return;
    }

    ResolvedGrid cached = WaypointGridResolver.resolvedGrid(grid.id);
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
        file.update(GlobBridge.glob().map, gc);
      } catch (RuntimeException ignored) {
      }
      info = file.gridinfo.get(grid.id);
    }
    if (info == null) {
      handler.onFailure(new RuntimeException("MapFile grid info is unavailable for current grid."));
      return;
    }

    Coord originWorld = Coord.of(grid.ul.mul(MCache.tilesz));
    saveIfMissing(info.seg, originWorld.x, originWorld.y, grid.id, originWorld, handler);
  }

  static void saveIfMissing(long mapSegmentId, int localX, int localY, long havenGridId, Coord originWorld) {
    saveIfMissing(mapSegmentId, localX, localY, havenGridId, originWorld, null);
  }

  static synchronized void onResolved(long havenGridId, ResolvedGrid grid, SaveMapGridResult result) {
    pendingGridSaveHavenGridIds.remove(havenGridId);
    List<WaypointResultHandler<SaveMapGridResult>> handlers = pendingHandlersByHavenGridId.remove(havenGridId);
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

  static synchronized void onSaveFailed(long havenGridId, Exception error) {
    pendingGridSaveHavenGridIds.remove(havenGridId);
    List<WaypointResultHandler<SaveMapGridResult>> handlers = pendingHandlersByHavenGridId.remove(havenGridId);
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

  private static synchronized void saveIfMissing(
    long mapSegmentId,
    int localX,
    int localY,
    long havenGridId,
    Coord originWorld,
    WaypointResultHandler<SaveMapGridResult> handler
  ) {
    if (WaypointGridResolver.resolvedGrid(havenGridId) != null)
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
        WaypointGridResolver.putResolvedGrid(
          result.havenGridId,
          new ResolvedGrid(result.mapGridId, result.havenGridId, result.mapSegmentId, Coord.of(result.localX, result.localY))
        );
        onResolved(result.havenGridId, WaypointGridResolver.resolvedGrid(result.havenGridId), result);
      }

      @Override
      public void onFailure(Exception error) {
        onSaveFailed(havenGridId, error);
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
