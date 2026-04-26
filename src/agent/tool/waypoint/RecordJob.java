package agent.tool.waypoint;

import agent.Job;

import haven.Coord;
import lmi.AgentContext;
import lmi.AtomicAction;
import lmi.Api;
import lmi.LMIException;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.WaypointRecorder;
import lmi.waypoint.model.Session;
import lmi.waypoint.runtime.ResolvedGob;
import lmi.waypoint.runtime.ResolvedNode;

import static lmi.Constant.ExceptionReason.*;

public class RecordJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (args.length < 3) {
      Api.message("Usage: a Record <recording_name>");
      return;
    }

    if (!WaypointManager.isResolved()) {
      Api.message("Waypoint recording failed: waypoint coordinates are not resolved.");
      Api.message("Run ResolveWaypoint or CreateNode first.");
      return;
    }

    WaypointManager.refresh();
    ResolvedNode startNode = WaypointManager.nearestNode();
    if (startNode == null) {
      Api.message("Waypoint recording failed: no nearby start node is available.");
      return;
    }

    ResolvedGob startGob = WaypointManager.nearbyGob(startNode.gobNodeId);
    if (startGob == null) {
      Api.message("Waypoint recording failed: start node base gob is not nearby.");
      return;
    }

    final Coord startWorld = startNode.world;
    if (!lmi.Self.gob().isAt(startWorld)) {
      AtomicAction.go(startWorld);
    }

    final String recordingName = args[2];
    final Session session;
    try {
      session = WaypointRecorder.start(recordingName, startNode.id, startGob.id, startGob.world.x, startGob.world.y);
    } catch (IllegalStateException e) {
      Api.message(e.getMessage());
      return;
    }
    Api.message("Waypoint recording started: " + recordingName);
    Api.message("Start node: " + startNode.name);
    Api.message("Use StopRecord job to save the recording.");

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
    return "Moves to the nearest nearby node and starts recording user MapView left/right clicks until StopRecord is used.\n"
      + "Usage: a Record <recording_name>";
  }
}
