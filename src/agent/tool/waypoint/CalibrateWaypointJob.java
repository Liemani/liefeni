package agent.tool.waypoint;

import agent.Job;
import lmi.AgentContext;
import lmi.Api;
import lmi.ClickManager;
import lmi.Rect;
import lmi.waypoint.WaypointManager;

public class CalibrateWaypointJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Rect area = _selectCalibrationArea();
    if (area == null) {
      Api.message("Waypoint calibration failed: no area selected.");
      return;
    }

    if (!_calibrate(area)) {
      Api.message("Waypoint calibration failed: no anchor graph is registered in database.");
      return;
    }

    _printCalibrationResult(area);
  }

  private static Rect _selectCalibrationArea() {
    Api.alert("anchor tile 을 포함하는 area 를 선택해 waypoint 좌표계를 calibrate 해 주세요");
    return ClickManager.getArea();
  }

  private static boolean _calibrate(Rect area) {
    return WaypointManager.calibrate(area);
  }

  private static void _printCalibrationResult(Rect area) {
    Api.message("Waypoint calibrated with area origin: " + area.origin);
    Api.message("Nearby nodes: " + WaypointManager.nearbyNodes().count());
    Api.message("Nearby points: " + WaypointManager.nearbyPoints().count());
  }

  public static String info() {
    return "Calibrates waypoint coordinates from an area-selected anchor tile in the current map.";
  }
}
