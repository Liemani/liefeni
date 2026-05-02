package agent.tool.waypoint;

import agent.Job;

import haven.Gob;
import lmi.AgentContext;
import lmi.Api;
import lmi.ChatInputManager;
import lmi.ClickManager;
import lmi.Self;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.WaypointStore;
import lmi.waypoint.model.CreateRootNodeResult;

public class CreateNodeJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Gob gob = _selectRootGob();
    if (gob == null) {
      Api.message("CreateNode failed: no gob selected.");
      return;
    }

    String nodeName = _inputNodeName();
    if (nodeName == null) {
      return;
    }

    CreateRootNodeResult result = _createRootNode(gob, nodeName);
    if (!result.created) {
      Api.message(result.errorMessage);
      return;
    }

    _finishCreateNode(gob, nodeName);
  }

  private static Gob _selectRootGob() {
    Api.alert("새 root node 에 연결할 gob 을 클릭해 주세요");
    return ClickManager.getGob();
  }

  private static String _inputNodeName() {
    Api.message("Area chat 에 새 node 이름을 입력해 주세요");
    String nodeName = ChatInputManager.waitAreaChat();
    if (nodeName == null || nodeName.isBlank()) {
      Api.message("CreateNode failed: node name is empty.");
      return null;
    }
    return nodeName.trim();
  }

  private static CreateRootNodeResult _createRootNode(Gob gob, String nodeName) {
    return WaypointStore.createRootNode(
      nodeName,
      Self.position().x,
      Self.position().y,
      gob.id(),
      gob.position().x,
      gob.position().y,
      gob.resourceName()
    );
  }

  private static void _finishCreateNode(Gob gob, String nodeName) {
    WaypointManager.calibrate(gob);
    Api.message("Created root node: " + nodeName);
    Api.message("Waypoint calibrated with gob id: " + gob.id());
  }

  public static String info() {
    return "Creates a new root waypoint node using the current player position and a selected gob.";
  }
}
