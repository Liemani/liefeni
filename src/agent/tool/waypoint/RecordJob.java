package agent.tool.waypoint;

import agent.Job;

import lmi.AgentContext;
import lmi.Api;
import lmi.LMIException;
import lmi.waypoint.WaypointRecorder;

import static lmi.Constant.ExceptionReason.*;

public class RecordJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (args.length < 3) {
      Api.message("Usage: a Record <recording_name>");
      return;
    }

    final String recordingName = args[2];
    final WaypointRecorder.Session session;
    try {
      session = WaypointRecorder.start(recordingName);
    } catch (IllegalStateException e) {
      Api.message(e.getMessage());
      return;
    }
    Api.message("Waypoint recording started: " + recordingName);
    Api.message("Use StopRecord action to save the recording.");

    try {
      while (WaypointRecorder.isActive(session)) {
        lmi.WaitManager.sleepPolling();
      }
    } catch (LMIException e) {
      if (e.reason == ER_INTERRUPTED) {
        WaypointRecorder.discard(session);
        Api.message("Waypoint recording discarded: " + recordingName);
        throw e;
      }
      throw e;
    }
  }

  public static String info() {
    return "Starts recording user MapView left/right clicks until StopRecord is used.\n"
      + "Usage: a Record <recording_name>";
  }
}
