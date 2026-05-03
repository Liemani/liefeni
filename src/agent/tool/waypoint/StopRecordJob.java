package agent.tool.waypoint;

import agent.Job;

import haven.Coord;
import haven.Gob;
import lmi.AgentContext;
import lmi.Api;
import lmi.ChatInputMonitor;
import lmi.ClickManager;
import lmi.Self;
import lmi.waypoint.WaypointEdgeWriter;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.WaypointRecorder;
import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.model.RecordingSession;
import lmi.waypoint.model.SaveEdgeResult;
import lmi.waypoint.WaypointStore;
import lmi.waypoint.object.WpNode;

public class StopRecordJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    RecordingSession session = WaypointRecorder.stop();
    if (session == null) {
      Api.message("No active waypoint recording.");
      return;
    }

    Gob gob = _selectEndGob();
    if (gob == null) {
      Api.message("Failed to save waypoint recording: no end gob selected.");
      return;
    }

    WaypointRecorder.setTerminalGob(session, gob);

    WpNode endNode = _ensureEndNode(gob);
    if (endNode == null) return;

    _saveEdge(session, endNode, gob);
  }

  private static Gob _selectEndGob() {
    Api.alert("끝 node 에 연결할 gob 을 클릭해 주세요");
    return ClickManager.getGob();
  }

  private static WpNode _ensureEndNode(Gob gob) {
    Coord nodeVir = WaypointManager.virOfWorld(Self.position());
    Long graphId = WaypointManager.calibrationGraphId();
    if (nodeVir == null || graphId == null)
      return null;

    WpNode endNode = WaypointStore.findNodeByGraphAndVir(graphId, nodeVir.x, nodeVir.y);
    if (endNode != null) return endNode;

    return _createEndNode(gob);
  }

  private static WpNode _createEndNode(Gob gob) {
    if (!WaypointManager.isCalibrated()) {
      Api.message("[StopRecordJob] calibration missing before end node creation");
      Api.message("[StopRecordJob] isCalibrated=" + WaypointManager.isCalibrated());
      Api.message("Failed to save waypoint recording: waypoint coordinates are not calibrated.");
      return null;
    }

    String nodeName = _inputEndNodeName();
    if (nodeName == null) return null;

    Long graphId = WaypointManager.calibrationGraphId();
    Coord nodeVir = WaypointManager.virOfWorld(Self.position());
    if (graphId == null || nodeVir == null) {
      Api.message("Failed to save waypoint recording: waypoint coordinates are not calibrated.");
      return null;
    }

    CreateNodeResult createNodeResult = WaypointStore.createNode(
      nodeName,
      graphId,
      nodeVir.x,
      nodeVir.y
    );
    if (!createNodeResult.created) {
      Api.message("Failed to save waypoint recording: " + createNodeResult.errorMessage);
      return null;
    }

    WpNode endNode = WaypointStore.findNodeByGraphAndVir(graphId, nodeVir.x, nodeVir.y);
    if (endNode == null) {
      Api.message("Failed to save waypoint recording: created end node cannot be loaded.");
      return null;
    }
    return endNode;
  }

  private static String _inputEndNodeName() {
    Api.message("Area chat 에 끝 node 이름을 입력해 주세요");
    String nodeName = ChatInputMonitor.waitAreaChat();
    if (nodeName == null || nodeName.isBlank()) {
      Api.message("Failed to save waypoint recording: node name is empty.");
      return null;
    }
    return nodeName.trim();
  }

  private static void _saveEdge(RecordingSession session, WpNode endNode, Gob gob) {
    SaveEdgeResult result = WaypointEdgeWriter.save(session, endNode.id);
    if (!result.saved) {
      Api.message("Failed to save waypoint recording.");
      Api.message(result.errorMessage);
      return;
    }

    WaypointManager.calibrate(gob);
    Api.message("Saved waypoint recording (" + session.pointCount() + " clicks)");
    Api.message("Saved edge id: " + result.edgeId);
  }

  public static String info() {
    return "Stops the current waypoint recording, resolves the end node, and saves the edge.";
  }
}
