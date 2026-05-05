package agent.debug;

import agent.Effect;
import haven.Coord;
import haven.Coord2d;
import haven.Coord3f;
import haven.MCache;
import haven.MapView;
import lmi.Api;
import lmi.AppContext;

import static haven.MCache.cmaps;
import static haven.MCache.tilesz;

public class DescribeMapViewCenterEffect extends Effect {
  @Override
  public void execute() {
    MapView mapView = AppContext.mapView();
    if (mapView == null) {
      Api.message("MapView is unavailable.");
      return;
    }

    Coord3f cc = mapView.getcc();
    Coord centerTile = Coord2d.of(cc).floor(tilesz);
    MCache.Grid grid = AppContext.glob.map.getgrid(centerTile.div(cmaps));
    Api.message("MapView.getcc(): " + cc);
    Api.message("center tile: " + centerTile);
    Api.message("grid coord: " + grid.gc);
    Api.message("grid id: " + Long.toUnsignedString(grid.id, 16));
  }

  public static String name() {
    return "Describe MapView Center";
  }

  public static String info() {
    return "Prints MapView.getcc(), current center tile, and the current map grid coord/id.";
  }
}
