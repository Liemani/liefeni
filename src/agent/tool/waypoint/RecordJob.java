package agent.tool.waypoint;

import agent.Job;

import haven.Coord;
import lmi.AgentContext;
import lmi.AtomicAction;
import lmi.Api;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.WaypointRecorder;
import lmi.waypoint.model.RecordingSession;
import lmi.waypoint.runtime.ResolvedNode;

public class RecordJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (!_ensureCalibrated()) return;

    ResolvedNode startNode = _selectStartNode();
    if (startNode == null) return;

    _moveToStartNode(startNode);

    RecordingSession session = _startRecording(startNode);
    if (session == null) return;
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

  private static void _moveToStartNode(ResolvedNode startNode) {
    Coord startWorld = startNode.world;
    if (!lmi.Self.gob().isAt(startWorld)) {
      AtomicAction.go(startWorld);
    }
  }

  private static RecordingSession _startRecording(ResolvedNode startNode) {
    try {
      RecordingSession session = WaypointRecorder.start(
        startNode.id,
        startNode.graphId,
        startNode.world.x,
        startNode.world.y,
        startNode.virX,
        startNode.virY
      );
      Api.message("Waypoint recording started.");
      Api.message("Start node: " + startNode.name);
      Api.message("Use StopRecord job to save the recording.");
      return session;
    } catch (IllegalStateException e) {
      Api.message(e.getMessage());
      return null;
    }
  }

  public static String info() {
    return "Moves to the nearest nearby node and starts recording user MapView left/right clicks until StopRecord is used.";
  }
}
