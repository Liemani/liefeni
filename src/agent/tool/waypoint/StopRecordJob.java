package agent.tool.waypoint;

import agent.Job;

import haven.Coord;
import lmi.AgentContext;
import lmi.Api;
import lmi.ChatInputMonitor;
import lmi.Self;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.model.CreateNodeResult;
import lmi.waypoint.model.RecordingSession;
import lmi.waypoint.model.SaveEdgeResult;
import lmi.waypoint.persistence.WaypointStore;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;
import lmi.waypoint.recording.WaypointEdgeWriter;
import lmi.waypoint.recording.WaypointRecorder;

import java.util.HashMap;

public class StopRecordJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    RecordingSession session = WaypointRecorder.stop();
    if (session == null) {
      Api.message("No active waypoint recording.");
      return;
    }

    _ensureEndNodeAsync(new EndNodeHandler() {
      @Override
      public void onResolved(WpNode endNode) {
        _saveEdgeAsync(session, endNode);
      }
    });
  }

  private static void _ensureEndNodeAsync(EndNodeHandler handler) {
    Coord nodeVir = WaypointManager.virOfWorld(Self.position());
    Long graphId = WaypointManager.calibrationGraphId();
    if (nodeVir == null || graphId == null)
      return;

    WpNode endNode = WaypointManager.findNodeByGraphAndVir(graphId, nodeVir.x, nodeVir.y);
    if (endNode != null) {
      handler.onResolved(endNode);
      return;
    }

    _createEndNodeAsync(handler);
  }

  private static void _createEndNodeAsync(EndNodeHandler handler) {
    if (!WaypointManager.isCalibrated()) {
      Api.message("[StopRecordJob] calibration missing before end node creation");
      Api.message("[StopRecordJob] isCalibrated=" + WaypointManager.isCalibrated());
      Api.message("Failed to save waypoint recording: waypoint coordinates are not calibrated.");
      return;
    }

    String nodeName = _inputEndNodeName();
    if (nodeName == null) return;

    Long graphId = WaypointManager.calibrationGraphId();
    Coord nodeVir = WaypointManager.virOfWorld(Self.position());
    if (graphId == null || nodeVir == null) {
      Api.message("Failed to save waypoint recording: waypoint coordinates are not calibrated.");
      return;
    }

    WaypointStore.createNodeAsync(
      nodeName,
      graphId,
      nodeVir.x,
      nodeVir.y,
      new WaypointResultHandler<CreateNodeResult>() {
        @Override
        public void onSuccess(CreateNodeResult createNodeResult) {
          if (!createNodeResult.created) {
            Api.message("Failed to save waypoint recording: " + createNodeResult.errorMessage);
            return;
          }

          WpNode endNode = WpNode.of(createNodeResult.nodeId, graphId, -1L, nodeVir.x, nodeVir.y, nodeName);
          WaypointManager.appendNode(endNode);
          handler.onResolved(endNode);
        }

        @Override
        public void onFailure(Exception error) {
          Api.message("Failed to save waypoint recording: " + error.getMessage());
        }
      }
    );
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

  private static void _saveEdgeAsync(RecordingSession session, WpNode endNode) {
    WaypointEdgeWriter.saveAsync(session, endNode.id, new WaypointResultHandler<SaveEdgeResult>() {
      @Override
      public void onSuccess(SaveEdgeResult result) {
        if (!result.saved) {
          Api.message("Failed to save waypoint recording.");
          Api.message(result.errorMessage);
          return;
        }

        _appendSavedEdge(result);
        WaypointManager.refresh();
        Api.message("Saved waypoint recording (" + session.pointCount() + " clicks)");
        Api.message("Saved edge id: " + result.edgeId);
      }

      @Override
      public void onFailure(Exception error) {
        Api.message("Failed to save waypoint recording.");
        Api.message(error.getMessage());
      }
    });
  }

  private static void _appendSavedEdge(SaveEdgeResult result) {
    WpEdge edge = result.edge;
    if (edge == null)
      return;

    WpNode node0 = WaypointManager.findNode(edge.node0Id);
    if (node0 != null)
      WaypointManager.appendEdge(node0.graphId, edge);

    HashMap<Long, WpSegment> segmentsById = new HashMap<>();
    for (WpSegment segment : result.segments) {
      segmentsById.put(segment.id, segment);
      WaypointManager.appendSegment(segment);
    }
    for (WpPoint point : result.points) {
      WpSegment segment = segmentsById.get(point.segmentId);
      if (segment != null)
        WaypointManager.appendPoint(segment, point);
    }
  }

  private interface EndNodeHandler {
    void onResolved(WpNode endNode);
  }

  public static String info() {
    return "Stops the current waypoint recording, resolves the end node, and saves the edge.";
  }
}
