package agent.tool.waypoint;

import agent.Job;
import haven.Gob;
import lmi.AgentContext;
import lmi.Api;
import lmi.ClickManager;
import lmi.waypoint.WaypointManager;

public class CalibrateWaypointJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Gob gob = _selectCalibrationGob();
    if (gob == null) {
      Api.message("Waypoint calibration failed: no gob selected.");
      return;
    }

    if (!_calibrate(gob)) {
      Api.message("Waypoint calibration failed: gob is not registered in database.");
      return;
    }

    _printCalibrationResult(gob);
  }

  private static Gob _selectCalibrationGob() {
    Api.alert("등록된 gob 을 클릭해 waypoint 좌표계를 calibrate 해 주세요");
    return ClickManager.getGob();
  }

  private static boolean _calibrate(Gob gob) {
    return WaypointManager.calibrate(gob);
  }

  private static void _printCalibrationResult(Gob gob) {
    Api.message("Waypoint calibrated with gob id: " + gob.id());
    Api.message("Nearby nodes: " + WaypointManager.nearbyNodes().count());
    Api.message("Nearby points: " + WaypointManager.nearbyPoints().count());
  }

  public static String info() {
    return "Calibrates waypoint coordinates from a registered gob in the current map.";
  }
}
