package agent.tool.waypoint;

import agent.Job;
import lmi.AgentContext;
import lmi.Api;
import lmi.ChatInputMonitor;
import lmi.ClickManager;
import lmi.Rect;
import lmi.Self;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.WaypointStore;
import lmi.waypoint.model.CreateRootNodeResult;

public class CreateNodeJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Rect area = _selectAnchorArea();
    if (area == null) {
      Api.message("CreateNode failed: no anchor area selected.");
      return;
    }

    String nodeName = _inputNodeName();
    if (nodeName == null) {
      return;
    }

    CreateRootNodeResult result = _createRootNode(area, nodeName);
    if (!result.created) {
      Api.message(result.errorMessage);
      return;
    }

    _finishCreateNode(area, nodeName);
  }

  private static Rect _selectAnchorArea() {
    Api.alert("새 graph 의 anchor tile 을 포함하는 area 를 선택해 주세요");
    return ClickManager.getArea();
  }

  private static String _inputNodeName() {
    Api.message("Area chat 에 새 node 이름을 입력해 주세요");
    String nodeName = ChatInputMonitor.waitAreaChat();
    if (nodeName == null || nodeName.isBlank()) {
      Api.message("CreateNode failed: node name is empty.");
      return null;
    }
    return nodeName.trim();
  }

  private static CreateRootNodeResult _createRootNode(Rect area, String nodeName) {
    return WaypointStore.createRootNode(
      nodeName,
      area.origin.x,
      area.origin.y,
      Self.position().x,
      Self.position().y
    );
  }

  private static void _finishCreateNode(Rect area, String nodeName) {
    WaypointManager.calibrate(area);
    Api.message("Created root node: " + nodeName);
    Api.message("Waypoint calibrated with area origin: " + area.origin);
  }

  public static String info() {
    return "Creates a new root waypoint graph using an anchor tile area and the current player position.";
  }
}
