package agent.tool.waypoint;

import agent.Job;

import haven.Gob;
import lmi.AgentContext;
import lmi.Api;
import lmi.ChatInputManager;
import lmi.ClickManager;
import lmi.Self;
import lmi.waypoint.WaypointDatabase;
import lmi.waypoint.WaypointEdgeWriter;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.WaypointRecorder;
import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.model.GobNodeRecord;
import lmi.waypoint.model.SaveEdgeResult;
import lmi.waypoint.model.Session;
import lmi.waypoint.model.WpNodeRecord;

public class StopRecordJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Session session = WaypointRecorder.stop();
    if (session == null) {
      Api.message("No active waypoint recording.");
      return;
    }

    Api.alert("끝 node 에 연결할 gob 을 클릭해 주세요");
    Gob gob = ClickManager.getGob();
    if (gob == null) {
      Api.message("Failed to save waypoint recording: no end gob selected.");
      return;
    }

    WaypointRecorder.setTerminalGob(session, gob);

    WpNodeRecord endNode = WaypointDatabase.findNodeByGob(gob.id());
    if (endNode == null) {
      if (!WaypointManager.isResolved() || WaypointManager.resolvedGob() == null) {
        Api.message("Failed to save waypoint recording: waypoint coordinates are not resolved.");
        return;
      }

      GobNodeRecord resolvedRecord = WaypointDatabase.findGob(WaypointManager.resolvedGob().id());
      if (resolvedRecord == null) {
        Api.message("Failed to save waypoint recording: resolved gob is not registered.");
        return;
      }

      Api.message("Area chat 에 끝 node 이름을 입력해 주세요");
      String nodeName = ChatInputManager.waitAreaChat();
      if (nodeName == null || nodeName.isBlank()) {
        Api.message("Failed to save waypoint recording: node name is empty.");
        return;
      }

      int nodeVirX = resolvedRecord.virX + (Self.position().x - WaypointManager.resolvedGob().position().x);
      int nodeVirY = resolvedRecord.virY + (Self.position().y - WaypointManager.resolvedGob().position().y);
      int gobVirX = resolvedRecord.virX + (gob.position().x - WaypointManager.resolvedGob().position().x);
      int gobVirY = resolvedRecord.virY + (gob.position().y - WaypointManager.resolvedGob().position().y);

      CreateNodeResult createNodeResult = WaypointDatabase.createNode(
        nodeName.trim(),
        resolvedRecord.graphId,
        gob.id(),
        nodeVirX,
        nodeVirY,
        gobVirX,
        gobVirY,
        gob.resourceName()
      );
      if (!createNodeResult.created) {
        Api.message("Failed to save waypoint recording: " + createNodeResult.errorMessage);
        return;
      }

      endNode = WaypointDatabase.findNodeByGob(gob.id());
      if (endNode == null) {
        Api.message("Failed to save waypoint recording: created end node cannot be loaded.");
        return;
      }
    }

    SaveEdgeResult result = WaypointEdgeWriter.save(session, endNode.id);
    if (result.saved) {
      WaypointManager.resolve(gob);
      Api.message("Saved waypoint recording: " + session.name + " (" + session.pointCount() + " clicks)");
      Api.message("Saved edge id: " + result.edgeId);
    } else {
      Api.message("Failed to save waypoint recording: " + session.name);
      Api.message(result.errorMessage);
    }
  }

  public static String info() {
    return "Stops the current waypoint recording, resolves the end node, and saves the edge.";
  }
}
