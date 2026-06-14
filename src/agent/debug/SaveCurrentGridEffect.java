package agent.debug;

import agent.Effect;
import haven.Coord;
import haven.Coord2d;
import haven.MCache;
import lmi.bridge.Api;
import lmi.core.LocalPlayer;
import lmi.core.Util;
import lmi.waypoint.model.SaveMapGridResult;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.runtime.WaypointGridSaveCoordinator;
import lmi.bridge.MapViewBridge;

public class SaveCurrentGridEffect extends Effect {
  @Override
  public void execute() {
    Coord selfWorld = LocalPlayer.gob() == null ? null : LocalPlayer.position();
    if (selfWorld == null) {
      Util.debugPrintHeader("SaveCurrentGrid failed: player position is unavailable.");
      return;
    }

    Coord tile = Coord2d.of(selfWorld).floor(MCache.tilesz);
    Coord gc = tile.div(MCache.cmaps);
    Util.debugPrintHeader("SaveCurrentGridEffect");
    Util.debugPrint("selfWorld=" + selfWorld + ", tile=" + tile + ", gc=" + gc);
    Util.debugPrint("mapView=" + MapViewBridge.mapView());
    WaypointGridSaveCoordinator.saveIfMissing(gc, new WaypointResultHandler<SaveMapGridResult>() {
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
