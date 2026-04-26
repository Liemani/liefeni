package agent.tool.waypoint;

import agent.Job;

import haven.Coord;
import lmi.AgentContext;
import lmi.AtomicAction;
import lmi.Api;
import lmi.LMIException;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.WaypointRecorder;
import lmi.waypoint.model.RecordingSession;
import lmi.waypoint.runtime.ResolvedGob;
import lmi.waypoint.runtime.ResolvedNode;

import static lmi.Constant.ExceptionReason.*;

public class RecordJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    String recordingName = _parseRecordingName(args);
    if (recordingName == null) return;

    if (!_ensureCalibrated()) return;

    ResolvedNode startNode = _selectStartNode();
    if (startNode == null) return;

    ResolvedGob startGob = _selectStartGob(startNode);
    if (startGob == null) return;

    _moveToStartNode(startNode);

    RecordingSession session = _startRecording(recordingName, startNode, startGob);
    if (session == null) return;

    _waitUntilStopped(session, recordingName);
  }

  private static String _parseRecordingName(String[] args) {
    if (args.length < 3) {
      Api.message("Usage: a Record <recording_name>");
      return null;
    }
    return args[2];
  }

  private static boolean _ensureCalibrated() {
    if (WaypointManager.isCalibrated()) return true;
    Api.message("Waypoint recording failed: waypoint coordinates are not calibrated.");
    Api.message("Run CalibrateWaypoint or CreateNode first.");
    return false;
  }

  private static ResolvedNode _selectStartNode() {
    WaypointManager.refresh();
    ResolvedNode startNode = WaypointManager.nearestNode();
    if (startNode == null) {
      Api.message("Waypoint recording failed: no nearby start node is available.");
      return null;
    }
    return startNode;
  }

  private static ResolvedGob _selectStartGob(ResolvedNode startNode) {
    ResolvedGob startGob = WaypointManager.nearbyGob(startNode.gobNodeId);
    if (startGob == null) {
      Api.message("Waypoint recording failed: start node base gob is not nearby.");
      return null;
    }
    return startGob;
  }

  private static void _moveToStartNode(ResolvedNode startNode) {
    Coord startWorld = startNode.world;
    if (!lmi.Self.gob().isAt(startWorld)) {
      AtomicAction.go(startWorld);
    }
  }

  private static RecordingSession _startRecording(String recordingName, ResolvedNode startNode, ResolvedGob startGob) {
    try {
      RecordingSession session = WaypointRecorder.start(recordingName, startNode.id, startGob.id, startGob.world.x, startGob.world.y);
      Api.message("Waypoint recording started: " + recordingName);
      Api.message("Start node: " + startNode.name);
      Api.message("Use StopRecord job to save the recording.");
      return session;
    } catch (IllegalStateException e) {
      Api.message(e.getMessage());
      return null;
    }
  }

  private static void _waitUntilStopped(RecordingSession session, String recordingName) {
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
