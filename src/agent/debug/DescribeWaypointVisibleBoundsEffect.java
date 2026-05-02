package agent.debug;

import agent.Effect;
import haven.Area;
import haven.Coord;
import haven.Coord2d;
import haven.Coord3f;
import haven.MapView;
import haven.MCache;
import lmi.Api;
import lmi.AppContext;

import java.lang.reflect.Field;

import static haven.MCache.tilesz;

public class DescribeWaypointVisibleBoundsEffect extends Effect {
  @Override
  public void execute() {
    MapView mapView = AppContext.mapView();
    if (mapView == null) {
      Api.message("MapView is unavailable.");
      return;
    }

    Coord3f cc = mapView.getcc();
    Coord2d center = Coord2d.of(cc);
    Coord centerTile = center.floor(tilesz);
    int view = _view(mapView);
    Area cutArea = _cutArea(centerTile, view);
    Area reqTileArea = _reqTileArea(centerTile, view);
    Area reqCutArea = reqTileArea.div(MCache.cutsz);

    Api.message("MapView.sz: " + mapView.sz);
    Api.message("MapView.getcc(): " + cc);
    Api.message("center tile: " + centerTile);
    Api.message("private view: " + view);
    Api.message("candidate terrain cut area: " + cutArea);
    Api.message("candidate req tile area: " + reqTileArea);
    Api.message("candidate req cut area: " + reqCutArea);
  }

  public static String name() {
    return "Describe Waypoint Visible Bounds";
  }

  public static String info() {
    return "Prints candidate MapView tile/cut bounds for waypoint visibility design.";
  }

  private static int _view(MapView mapView) {
    try {
      Field field = MapView.class.getDeclaredField("view");
      field.setAccessible(true);
      return field.getInt(mapView);
    } catch (Exception e) {
      throw new RuntimeException("Failed to read MapView.view: " + e.getMessage(), e);
    }
  }

  private static Area _cutArea(Coord centerTile, int view) {
    Coord centerCut = centerTile.div(MCache.cutsz);
    return new Area(centerCut.sub(view, view), centerCut.add(view, view).add(1, 1));
  }

  private static Area _reqTileArea(Coord centerTile, int view) {
    Coord margin = MCache.cutsz.mul(view + 1);
    return new Area(centerTile.sub(margin), centerTile.add(margin));
  }
}
