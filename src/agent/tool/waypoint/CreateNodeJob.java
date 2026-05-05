package agent.tool.waypoint;

import agent.Job;
import haven.Coord;
import lmi.AgentContext;
import lmi.Api;
import lmi.ChatInputMonitor;
import lmi.ClickManager;
import lmi.Rect;
import lmi.Self;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpAnchor;
import lmi.waypoint.persistence.SaveBatchResult;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.persistence.WaypointStore;
import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.object.WpNode;

public class CreateNodeJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (!WaypointManager.anchorsLoaded()) {
      Api.message("CreateNode failed: anchor cache is not loaded yet.");
      return;
    }

    if (!WaypointManager.hasAnchor()) {
      Rect area = _selectAnchorArea();
      if (area == null) {
        Api.message("CreateNode failed: no anchor area selected.");
        return;
      }

      String nodeName = _inputNodeName();
      if (nodeName == null)
        return;

      _createAnchorAndNode(area, nodeName);
      return;
    }

    if (!WaypointManager.isCalibrated()) {
      Api.message("CreateNode failed: waypoint is not calibrated.");
      Api.message("Run CalibrateWaypoint first.");
      return;
    }

    String nodeName = _inputNodeName();
    if (nodeName == null)
      return;

    _createNodeAtCurrentPositionAsync(nodeName);
  }

  private static void _createAnchorAndNode(Rect area, String nodeName) {
    ManagedObjectContext anchorContext = WaypointManager.managedAnchorContext();
    ManagedWpAnchor managedAnchor = WaypointManager.managedAnchor();
    if (managedAnchor == null) {
      managedAnchor = anchorContext.registerLoaded(ManagedWpAnchor.missing(anchorContext));
      WaypointManager.setManagedAnchor(managedAnchor);
    }
    if (!managedAnchor.ensurePresent()) {
      Api.message("CreateNode failed: anchor creation is already pending.");
      return;
    }

    anchorContext.save(new WaypointResultHandler<SaveBatchResult>() {
      @Override
      public void onSuccess(SaveBatchResult result) {
        if (!WaypointManager.calibrate(area)) {
          Api.message("CreateNode failed: anchor was created, but waypoint calibration failed.");
          return;
        }

        Api.message("Waypoint calibrated with area origin: " + area.origin);
        _createNodeAtCurrentPositionAsync(nodeName);
      }

      @Override
      public void onFailure(Exception error) {
        Api.message("CreateNode failed: failed to save anchor: " + error.getMessage());
      }
    });
  }

  private static void _createNodeAtCurrentPositionAsync(String nodeName) {
    if (!WaypointManager.isCalibrated()) {
      Api.message("CreateNode failed: waypoint is not calibrated.");
      Api.message("Run CalibrateWaypoint first.");
      return;
    }

    Long graphId = WaypointManager.calibrationGraphId();
    if (graphId == null) {
      Api.message("CreateNode failed: current waypoint graph is unavailable.");
      return;
    }

    Coord vir = WaypointManager.virOfWorld(Self.position());
    if (vir == null) {
      Api.message("CreateNode failed: current waypoint position is unavailable.");
      return;
    }

    WaypointStore.createNodeAsync(
      nodeName,
      graphId,
      vir.x,
      vir.y,
      new WaypointResultHandler<CreateNodeResult>() {
        @Override
        public void onSuccess(CreateNodeResult result) {
          if (!result.created) {
            Api.message(result.errorMessage);
            return;
          }

          WaypointManager.appendNode(WpNode.of(result.nodeId, graphId, -1L, vir.x, vir.y, nodeName));
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

  public static String info() {
    return "Creates an anchor if needed, then creates a node at the current calibrated position.";
  }
}
