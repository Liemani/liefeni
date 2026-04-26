package agent.tool.waypoint;

import agent.Job;

import haven.Gob;
import lmi.AgentContext;
import lmi.Api;
import lmi.ChatInputManager;
import lmi.ClickManager;
import lmi.Self;
import lmi.waypoint.WaypointDatabase;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.model.CreateRootNodeResult;

public class CreateNodeJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.alert("새 root node 에 연결할 gob 을 클릭해 주세요");
    Gob gob = ClickManager.getGob();
    if (gob == null) {
      Api.message("CreateNode failed: no gob selected.");
      return;
    }

    Api.message("Area chat 에 새 node 이름을 입력해 주세요");
    String nodeName = ChatInputManager.waitAreaChat();
    if (nodeName == null || nodeName.isBlank()) {
      Api.message("CreateNode failed: node name is empty.");
      return;
    }

    CreateRootNodeResult result = WaypointDatabase.createRootNode(
      nodeName.trim(),
      Self.position().x,
      Self.position().y,
      gob.id(),
      gob.position().x,
      gob.position().y,
      gob.resourceName()
    );

    if (!result.created) {
      Api.message(result.errorMessage);
      return;
    }

    WaypointManager.resolve(gob);
    Api.message("Created root node: " + nodeName.trim());
    Api.message("Waypoint resolved with gob id: " + gob.id());
  }

  public static String info() {
    return "Creates a new root waypoint node using the current player position and a selected gob.";
  }
}
