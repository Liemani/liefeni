package agent.debug;

import agent.Effect;
import haven.Coord;
import haven.Coord2d;
import haven.Coord3f;
import haven.MCache;
import haven.GameUI;
import haven.MapFile;
import haven.MapView;
import lmi.bridge.Api;
import lmi.core.AppContext;
import lmi.core.DebugUtil;
import lmi.bridge.GlobBridge;
import lmi.bridge.MapViewBridge;

import static haven.MCache.cmaps;
import static haven.MCache.tilesz;

public class DescribeMapViewCenterEffect extends Effect {
  @Override
  public void execute() {
    MapView mapView = MapViewBridge.mapView();
    if (mapView == null) {
      Api.message("MapView is unavailable.");
      return;
    }

    Coord3f cc = mapView.getcc();
    Coord centerTile = Coord2d.of(cc).floor(tilesz);
    MCache.Grid grid = GlobBridge.gridAtGc(centerTile.div(cmaps));
    if (grid == null) {
      Api.message("Current grid is unavailable.");
      return;
    }
    GameUI gameUI = AppContext.gameUI();
    MapFile mapFile = (gameUI == null) ? null : (gameUI.mmap != null ? gameUI.mmap.file : gameUI.mapfile.file);
    MapFile.GridInfo gridInfo = mapFile.gridinfo.get(grid.id);
    Api.message("MapView.getcc(): " + cc);
    Api.message("center tile: " + centerTile);
    Api.message("grid coord: " + grid.gc);
    Api.message("grid id: " + Long.toUnsignedString(grid.id, 16));
    DebugUtil.debugPrintObjectFields(gridInfo);
  }

  public static String name() {
    return "Describe MapView Center";
  }

  public static String info() {
    return "Prints MapView.getcc(), current center tile, and the current map grid coord/id/seg.";
  }
}
