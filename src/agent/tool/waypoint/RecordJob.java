package agent.tool.waypoint;

import agent.Job;

import haven.Coord;
import lmi.runtime.AgentContext;
import lmi.core.AtomicAction;
import lmi.bridge.Api;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.model.RecordingSession;
import lmi.waypoint.recording.WaypointRecorder;
import lmi.waypoint.runtime.ResolvedNode;

public class RecordJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (!_ensureGraphSelected()) return;

    ResolvedNode startNode = _selectStartNode();
    if (startNode == null) return;

    _moveToStartNode(startNode);

    RecordingSession session = _startRecording(startNode);
    if (session == null) return;
  }

  private static boolean _ensureGraphSelected() {
    if (WaypointManager.activeGraphId() != null) return true;
    Api.message("Waypoint recording failed: current waypoint graph is unavailable.");
    Api.message("CreateNode first or select a graph-defining action.");
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
    if (!lmi.core.LocalPlayer.gob().isAt(startWorld)) {
      AtomicAction.go(startWorld);
    }
  }

  private static RecordingSession _startRecording(ResolvedNode startNode) {
    try {
      RecordingSession session = WaypointRecorder.start(
        startNode.id,
        startNode.graphId,
        startNode.gridId,
        startNode.localX,
        startNode.localY
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
