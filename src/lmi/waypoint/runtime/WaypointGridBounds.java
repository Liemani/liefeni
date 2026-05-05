package lmi.waypoint.runtime;

import haven.Area;
import haven.Coord;
import haven.Coord2d;
import haven.MCache;
import lmi.AppContext;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class WaypointGridBounds {
  public final Coord centerGrid;
  public final Area loadArea;
  public final Area renderArea;

  private final Set<Long> loadGridIds;
  private final Set<Long> renderGridIds;
  private final Map<Long, Coord> gridOrigins;

  private WaypointGridBounds(
    Coord centerGrid,
    Area loadArea,
    Area renderArea,
    Set<Long> loadGridIds,
    Set<Long> renderGridIds,
    Map<Long, Coord> gridOrigins
  ) {
    this.centerGrid = centerGrid;
    this.loadArea = loadArea;
    this.renderArea = renderArea;
    this.loadGridIds = loadGridIds;
    this.renderGridIds = renderGridIds;
    this.gridOrigins = gridOrigins;
  }

  public static WaypointGridBounds empty() {
    Area empty = new Area(Coord.z, Coord.z);
    return new WaypointGridBounds(Coord.z, empty, empty, new HashSet<>(), new HashSet<>(), new HashMap<>());
  }

  public static WaypointGridBounds aroundWorld(Coord world) {
    if (world == null || AppContext.glob == null)
      return empty();

    Coord tile = Coord2d.of(world).floor(MCache.tilesz);
    Coord centerGrid = tile.div(MCache.cmaps);
    Area loadArea = new Area(centerGrid.sub(1, 1), centerGrid.add(2, 2));
    Area renderArea = new Area(centerGrid.sub(1, 1), centerGrid.add(2, 2));
    HashSet<Long> loadGridIds = new HashSet<>();
    HashSet<Long> renderGridIds = new HashSet<>();
    HashMap<Long, Coord> gridOrigins = new HashMap<>();

    for (Coord gc : loadArea) {
      MCache.Grid grid = _findLoadedGrid(gc);
      if (grid == null)
        continue;
      loadGridIds.add(grid.id);
      gridOrigins.put(grid.id, Coord.of(grid.ul.mul(MCache.tilesz)));
    }
    for (Coord gc : renderArea) {
      MCache.Grid grid = _findLoadedGrid(gc);
      if (grid == null)
        continue;
      renderGridIds.add(grid.id);
      gridOrigins.put(grid.id, Coord.of(grid.ul.mul(MCache.tilesz)));
    }

    return new WaypointGridBounds(centerGrid, loadArea, renderArea, loadGridIds, renderGridIds, gridOrigins);
  }

  public Set<Long> loadGridIds() {
    return new HashSet<>(loadGridIds);
  }

  public boolean loadContainsGridId(long gridId) {
    return loadGridIds.contains(gridId);
  }

  public boolean renderContainsGridId(long gridId) {
    return renderGridIds.contains(gridId);
  }

  public Coord worldOfGridLocal(long gridId, int localX, int localY) {
    Coord origin = gridOrigins.get(gridId);
    if (origin == null)
      return null;
    return origin.add(localX, localY);
  }

  private static MCache.Grid _findLoadedGrid(Coord gc) {
    try {
      return AppContext.glob.map.getgrid(gc);
    } catch (RuntimeException e) {
      return null;
    }
  }
}
