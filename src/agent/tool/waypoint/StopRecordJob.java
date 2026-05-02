package agent.tool.waypoint;

import agent.Job;

import haven.Gob;
import lmi.AgentContext;
import lmi.Api;
import lmi.ChatInputManager;
import lmi.ClickManager;
import lmi.Self;
import lmi.waypoint.WaypointEdgeWriter;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.WaypointRecorder;
import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.model.RecordingSession;
import lmi.waypoint.model.SaveEdgeResult;
import lmi.waypoint.WaypointStore;
import lmi.waypoint.object.GobNode;
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
    WpNode endNode = WaypointStore.findNodeByGob(gob.id());
    if (endNode != null) return endNode;

    return _createEndNode(gob);
  }

  private static WpNode _createEndNode(Gob gob) {
    if (!WaypointManager.isCalibrated() || WaypointManager.calibrationGob() == null) {
      Api.message("Failed to save waypoint recording: waypoint coordinates are not calibrated.");
      return null;
    }

    GobNode calibrationRecord = WaypointStore.findGob(WaypointManager.calibrationGob().id());
    if (calibrationRecord == null) {
      Api.message("Failed to save waypoint recording: calibration gob is not registered.");
      return null;
    }

    String nodeName = _inputEndNodeName();
    if (nodeName == null) return null;

    int nodeVirX = calibrationRecord.virX + (Self.position().x - WaypointManager.calibrationGob().position().x);
    int nodeVirY = calibrationRecord.virY + (Self.position().y - WaypointManager.calibrationGob().position().y);
    int gobVirX = calibrationRecord.virX + (gob.position().x - WaypointManager.calibrationGob().position().x);
    int gobVirY = calibrationRecord.virY + (gob.position().y - WaypointManager.calibrationGob().position().y);

    CreateNodeResult createNodeResult = WaypointStore.createNode(
      nodeName,
      calibrationRecord.graphId,
      gob.id(),
      nodeVirX,
      nodeVirY,
      gobVirX,
      gobVirY,
      gob.resourceName()
    );
    if (!createNodeResult.created) {
      Api.message("Failed to save waypoint recording: " + createNodeResult.errorMessage);
      return null;
    }

    WpNode endNode = WaypointStore.findNodeByGob(gob.id());
    if (endNode == null) {
      Api.message("Failed to save waypoint recording: created end node cannot be loaded.");
      return null;
    }
    return endNode;
  }

  private static String _inputEndNodeName() {
    Api.message("Area chat 에 끝 node 이름을 입력해 주세요");
    String nodeName = ChatInputManager.waitAreaChat();
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
