package agent.tool.waypoint;

import agent.Effect;

import lmi.Api;
import lmi.waypoint.WaypointRecorder;

public class StopRecordEffect extends Effect {
  @Override
  public void execute() {
    WaypointRecorder.StopResult result = WaypointRecorder.stopAndSave();
    if (!result.hadActiveSession) {
      Api.message("No active waypoint recording.");
      return;
    }

    if (result.saved) {
      Api.message("Saved waypoint recording: " + result.recordingName + " (" + result.clickCount + " clicks)");
    } else {
      Api.message("Failed to save waypoint recording: " + result.recordingName);
      if (result.errorMessage != null)
        Api.message(result.errorMessage);
    }
  }

  public static String name() {
    return "StopRecord";
  }

  public static String info() {
    return "Stops the current waypoint recording and saves it to SQLite.";
  }
}
