package agent.debug;

import agent.Effect;
import haven.Coord;
import haven.Coord2d;
import haven.MCache;
import lmi.Api;
import lmi.AppContext;
import lmi.Self;
import lmi.Util;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.model.SaveMapGridResult;
import lmi.waypoint.persistence.WaypointResultHandler;

public class SaveCurrentGridEffect extends Effect {
  @Override
  public void execute() {
    Coord selfWorld = Self.gob() == null ? null : Self.position();
    if (selfWorld == null) {
      Util.debugPrintHeader("SaveCurrentGrid failed: player position is unavailable.");
      return;
    }

    Coord tile = Coord2d.of(selfWorld).floor(MCache.tilesz);
    Coord gc = tile.div(MCache.cmaps);
    Util.debugPrintHeader("SaveCurrentGridEffect");
    Util.debugPrint("selfWorld=" + selfWorld + ", tile=" + tile + ", gc=" + gc);
    Util.debugPrint("mapView=" + AppContext.mapView());
    WaypointManager.saveCurrentGridIfMissing(gc, new WaypointResultHandler<SaveMapGridResult>() {
      @Override
      public void onSuccess(SaveMapGridResult result) {
        Api.message(
          "Saved current grid. map_grid_id=" + result.mapGridId +
            ", segment_id=" + result.mapSegmentId +
            ", haven_grid_id=0x" + Long.toUnsignedString(result.havenGridId, 16)
        );
      }

      @Override
      public void onFailure(Exception error) {
        Util.debugPrintHeader("SaveCurrentGrid failed");
        Util.debugPrint(error);
      }
    });
  }

  public static String name() {
    return "Save Current Grid";
  }

  public static String info() {
    return "Saves the player's current Haven grid as waypoint map_segment/map_grid rows if missing.";
  }
}
