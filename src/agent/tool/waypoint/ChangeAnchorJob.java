package agent.tool.waypoint;

import agent.Job;
import haven.Coord;
import lmi.AgentContext;
import lmi.Api;
import lmi.ClickManager;
import lmi.Rect;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.persistence.WaypointStore;
import lmi.waypoint.model.UpdateAnchorResult;

public class ChangeAnchorJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (!WaypointManager.isCalibrated()) {
      Api.message("ChangeAnchor failed: waypoint is not calibrated.");
      Api.message("Run CalibrateWaypoint first.");
      return;
    }

    Rect area = _selectAnchorArea();
    if (area == null) {
      Api.message("ChangeAnchor failed: no area selected.");
      return;
    }

    Coord anchorWorld = area.origin.tileMin();
    Coord anchorVir = WaypointManager.virOfWorld(anchorWorld);
    Long graphId = WaypointManager.calibrationGraphId();
    if (anchorVir == null || graphId == null) {
      Api.message("ChangeAnchor failed: current waypoint calibration is unavailable.");
      return;
    }

    WaypointStore.updateAnchorAsync(graphId, anchorVir.x, anchorVir.y, new WaypointResultHandler<UpdateAnchorResult>() {
      @Override
      public void onSuccess(UpdateAnchorResult result) {
        if (!result.updated) {
          Api.message(result.errorMessage);
          return;
        }

        if (!WaypointManager.calibrate(area)) {
          Api.message("ChangeAnchor failed: anchor was updated, but recalibration failed.");
          return;
        }

        Api.message("Changed waypoint anchor to area origin: " + area.origin);
      }

      @Override
      public void onFailure(Exception error) {
        Api.message("ChangeAnchor failed: " + error.getMessage());
      }
    });
  }

  private static Rect _selectAnchorArea() {
    Api.alert("새 anchor tile 을 포함하는 area 를 선택해 주세요");
    return ClickManager.getArea();
  }

  public static String info() {
    return "Changes the anchor tile of the current calibrated waypoint graph.";
  }
}
