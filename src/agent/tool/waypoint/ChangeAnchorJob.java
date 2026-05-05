package agent.tool.waypoint;

import agent.Job;
import haven.Coord;
import lmi.AgentContext;
import lmi.Api;
import lmi.ClickManager;
import lmi.Rect;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.managed.ManagedWpAnchor;
import lmi.waypoint.object.WpAnchor;
import lmi.waypoint.persistence.SaveBatchResult;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.runtime.WaypointCutBounds;

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

    Coord anchorWorld = WaypointCutBounds.cutOriginOfWorld(area.origin.tileMin());
    Coord anchorVir = WaypointManager.virOfWorld(anchorWorld);
    Long graphId = WaypointManager.calibrationGraphId();
    if (anchorVir == null || graphId == null) {
      Api.message("ChangeAnchor failed: current waypoint calibration is unavailable.");
      return;
    }

    ManagedWpAnchor managedAnchor = WaypointManager.managedAnchor();
    WpAnchor anchor = (managedAnchor == null) ? null : managedAnchor.toWpAnchor();
    if (anchor == null) {
      Api.message("ChangeAnchor failed: anchor is unavailable.");
      return;
    }
    if ((anchor.graphId == graphId) && (anchor.virX == anchorVir.x) && (anchor.virY == anchorVir.y)) {
      Api.message("ChangeAnchor skipped: anchor is unchanged.");
      return;
    }

    managedAnchor.moveTo(graphId, anchorVir.x, anchorVir.y);
    WaypointManager.managedAnchorContext().save(new WaypointResultHandler<SaveBatchResult>() {
      @Override
      public void onSuccess(SaveBatchResult result) {
        if (!WaypointManager.calibrate(area)) {
          Api.message("ChangeAnchor failed: anchor was updated, but recalibration failed.");
          return;
        }

        Api.message("Changed waypoint anchor to area origin: " + area.origin);
      }

      @Override
      public void onFailure(Exception error) {
        Api.message("ChangeAnchor failed: failed to save anchor: " + error.getMessage());
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
