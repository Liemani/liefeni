package agent.tool.waypoint;

import agent.Job;
import lmi.AgentContext;
import lmi.Api;
import lmi.ChatInputMonitor;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.persistence.WaypointStore;
import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.runtime.GridPosition;

public class CreateNodeJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    String nodeName = _inputNodeName();
    if (nodeName == null)
      return;

    _createNodeAtCurrentPositionAsync(nodeName);
  }

  private static void _createNodeAtCurrentPositionAsync(String nodeName) {
    Long graphId = WaypointManager.activeGraphId();

    GridPosition position = WaypointManager.currentGridPosition();
    if (position == null) {
      Api.message("CreateNode failed: current grid position is unavailable.");
      return;
    }

    WaypointStore.createNodeAsync(
      nodeName,
      graphId,
      position.gridId,
      position.localX,
      position.localY,
      new WaypointResultHandler<CreateNodeResult>() {
        @Override
        public void onSuccess(CreateNodeResult result) {
          if (!result.created) {
            Api.message(result.errorMessage);
            return;
          }

          WaypointManager.setCurrentGraphId(result.graphId);
          WaypointManager.appendNode(WpNode.of(result.nodeId, result.graphId, position.gridId, position.localX, position.localY, nodeName));
          WaypointManager.refresh();
          Api.message("Created node: " + nodeName);
        }

        @Override
        public void onFailure(Exception error) {
          Api.message("CreateNode failed: " + error.getMessage());
        }
      }
    );
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

  public static String info() {
    return "Creates a node at the current position. If no active graph exists yet, starts a new graph.";
  }
}
