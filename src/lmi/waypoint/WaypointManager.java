package lmi.waypoint;

import haven.Coord;
import haven.Gob;
import lmi.Array;
import lmi.Api;
import lmi.Self;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.model.LoadCounterpartPortalsResult;
import lmi.waypoint.model.LoadEdgesByNodeResult;
import lmi.waypoint.model.LoadNodesByGraphResult;
import lmi.waypoint.model.LoadPointsBySegmentResult;
import lmi.waypoint.model.LoadPortalsResult;
import lmi.waypoint.model.LoadSegmentsByEdgeResult;
import lmi.waypoint.object.WpAnchor;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPortal;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;
import lmi.waypoint.runtime.ResolvedNode;
import lmi.waypoint.runtime.ResolvedPoint;
import lmi.waypoint.runtime.WaypointCutBounds;
import lmi.waypoint.runtime.WaypointScene;

import lmi.Rect;

public final class WaypointManager {
  private static final WaypointRuntimeContext runtimeContext = new WaypointRuntimeContext();
  private static final ManagedObjectContext managedNodeContext = runtimeContext.managedNodeContext();
  private static final WaypointCalibrationState calibration = runtimeContext.calibration();
  private static boolean refreshRequested;

  private WaypointManager() {}

  public static void clear() {
    runtimeContext.clear();
    refreshRequested = false;
  }

  public static boolean calibrate(Rect area) {
    if (!WaypointCalibrator.calibrateFromAnchorArea(calibration, area))
      return false;
    refresh();
    Api.message("[WaypointManager.calibrate] success graphId=" + calibration.graphId() + " world=" + calibration.world() + " vir=" + calibration.vir());
    return true;
  }

  public static boolean calibrate(Gob gob) {
    if (!WaypointCalibrator.calibrateFromPortal(calibration, gob))
      return false;
    refresh();
    Api.message("[WaypointManager.calibrate] success graphId=" + calibration.graphId() + " world=" + calibration.world() + " vir=" + calibration.vir());
    return true;
  }

  public static boolean isCalibrated() {
    return calibration.isCalibrated();
  }

  public static boolean hasAnchor() {
    return calibration.hasAnchor();
  }

  public static void markAnchorPresent() {
    calibration.markAnchorPresent();
  }

  public static void setAnchorPresent(boolean anchorPresent) {
    calibration.setAnchorPresent(anchorPresent);
  }

  public static Gob calibrationGob() {
    return calibration.gob();
  }

  public static Long calibrationGraphId() {
    return calibration.graphId();
  }

  public static Coord calibrationVir() {
    return calibration.vir();
  }

  public static Coord calibrationWorld() {
    return calibration.world();
  }

  public static Coord virOfWorld(Coord world) {
    return calibration.virOfWorld(world);
  }

  public static Array<ResolvedNode> nearbyNodes() {
    return runtimeContext.nearbyNodes();
  }

  public static Array<ResolvedPoint> nearbyPoints() {
    return runtimeContext.nearbyPoints();
  }

  public static Array<ManagedWpNode> selectedManagedNodes() {
    return runtimeContext.selectedManagedNodes();
  }

  public static WaypointScene scene() {
    return runtimeContext.scene();
  }

  public static Array<WpAnchor> anchors() {
    return runtimeContext.anchors();
  }

  public static boolean beginAnchorsLoad() {
    return runtimeContext.beginAnchorsLoad();
  }

  public static void endAnchorsLoad() {
    runtimeContext.endAnchorsLoad();
  }

  public static void setAnchors(Array<WpAnchor> anchors) {
    runtimeContext.setAnchors(anchors);
    calibration.setAnchorPresent(!anchors.isEmpty());
  }

  public static boolean anchorsLoaded() {
    return runtimeContext.anchorsLoaded();
  }

  public static Array<WpPortal> portals(long graphId) {
    return runtimeContext.portals(graphId);
  }

  public static void setPortals(long graphId, Array<WpPortal> portals) {
    runtimeContext.setPortals(graphId, portals);
  }

  public static boolean portalsLoaded(long graphId) {
    return runtimeContext.portalsLoaded(graphId);
  }

  public static Array<WpPortal> counterpartPortals(long portalId) {
    return runtimeContext.counterpartPortals(portalId);
  }

  public static void setCounterpartPortals(long portalId, Array<WpPortal> portals) {
    runtimeContext.setCounterpartPortals(portalId, portals);
  }

  public static boolean counterpartPortalsLoaded(long portalId) {
    return runtimeContext.counterpartPortalsLoaded(portalId);
  }

  public static void preloadPortals(long graphId) {
    if (!runtimeContext.beginPortalsLoad(graphId))
      return;
    WaypointStore.loadPortalsByGraphAsync(graphId, new WaypointResultHandler<LoadPortalsResult>() {
      @Override
      public void onSuccess(LoadPortalsResult result) {
        setPortals(result.graphId, result.portals);
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endPortalsLoad(graphId);
      }
    });
  }

  public static void preloadCounterpartPortals(long portalId) {
    if (!runtimeContext.beginCounterpartPortalsLoad(portalId))
      return;
    WaypointStore.findCounterpartPortalsAsync(portalId, new WaypointResultHandler<LoadCounterpartPortalsResult>() {
      @Override
      public void onSuccess(LoadCounterpartPortalsResult result) {
        setCounterpartPortals(result.portalId, result.portals);
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endCounterpartPortalsLoad(portalId);
      }
    });
  }

  public static Array<WpNode> nodes(long graphId) {
    return runtimeContext.nodes(graphId);
  }

  public static void setNodes(long graphId, Array<WpNode> nodes) {
    runtimeContext.setNodes(graphId, nodes);
  }

  public static boolean nodesLoaded(long graphId) {
    return runtimeContext.nodesLoaded(graphId);
  }

  public static void preloadNodes(long graphId) {
    if (!runtimeContext.beginNodesLoad(graphId))
      return;
    WaypointStore.loadNodesByGraphAsync(graphId, new WaypointResultHandler<LoadNodesByGraphResult>() {
      @Override
      public void onSuccess(LoadNodesByGraphResult result) {
        setNodes(result.graphId, result.nodes);
        if (isCalibrated() && calibrationGraphId() != null && calibrationGraphId() == result.graphId)
          requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endNodesLoad(graphId);
      }
    });
  }

  public static Array<WpEdge> edges(long nodeId) {
    return runtimeContext.edges(nodeId);
  }

  public static void setEdges(long nodeId, Array<WpEdge> edges) {
    runtimeContext.setEdges(nodeId, edges);
  }

  public static boolean edgesLoaded(long nodeId) {
    return runtimeContext.edgesLoaded(nodeId);
  }

  public static void preloadEdges(long nodeId) {
    if (!runtimeContext.beginEdgesLoad(nodeId))
      return;
    WaypointStore.loadEdgesByNodeAsync(nodeId, new WaypointResultHandler<LoadEdgesByNodeResult>() {
      @Override
      public void onSuccess(LoadEdgesByNodeResult result) {
        setEdges(result.nodeId, result.edges);
        if (isCalibrated())
          requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endEdgesLoad(nodeId);
      }
    });
  }

  public static Array<WpSegment> segments(long edgeId) {
    return runtimeContext.segments(edgeId);
  }

  public static void setSegments(long edgeId, Array<WpSegment> segments) {
    runtimeContext.setSegments(edgeId, segments);
  }

  public static boolean segmentsLoaded(long edgeId) {
    return runtimeContext.segmentsLoaded(edgeId);
  }

  public static void preloadSegments(long edgeId) {
    if (!runtimeContext.beginSegmentsLoad(edgeId))
      return;
    WaypointStore.loadSegmentsByEdgeAsync(edgeId, new WaypointResultHandler<LoadSegmentsByEdgeResult>() {
      @Override
      public void onSuccess(LoadSegmentsByEdgeResult result) {
        setSegments(result.edgeId, result.segments);
        if (isCalibrated())
          requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endSegmentsLoad(edgeId);
      }
    });
  }

  public static Array<WpPoint> points(long segmentId) {
    return runtimeContext.points(segmentId);
  }

  public static void setPoints(long segmentId, Array<WpPoint> points) {
    runtimeContext.setPoints(segmentId, points);
  }

  public static boolean pointsLoaded(long segmentId) {
    return runtimeContext.pointsLoaded(segmentId);
  }

  public static void preloadPoints(long segmentId) {
    if (!runtimeContext.beginPointsLoad(segmentId))
      return;
    WaypointStore.loadPointsBySegmentAsync(segmentId, new WaypointResultHandler<LoadPointsBySegmentResult>() {
      @Override
      public void onSuccess(LoadPointsBySegmentResult result) {
        setPoints(result.segmentId, result.points);
        if (isCalibrated())
          requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endPointsLoad(segmentId);
      }
    });
  }

  public static ResolvedNode nearestNode() {
    ResolvedNode nearest = null;
    long best = Long.MAX_VALUE;
    Coord self = Self.position();

    for (ResolvedNode node : runtimeContext.nearbyNodes()) {
      long dx = (long)node.world.x - self.x;
      long dy = (long)node.world.y - self.y;
      long distance = (dx * dx) + (dy * dy);
      if (distance < best) {
        best = distance;
        nearest = node;
      }
    }

    return nearest;
  }

  public static void refresh() {
    runtimeContext.setSceneSnapshot(new Array<>(), new Array<>(), new Array<>(), new WaypointScene(WaypointCutBounds.aroundWorld(Self.position())));
    managedNodeContext.clear();

    WaypointSceneBuilder.BuildResult result = WaypointSceneBuilder.build(calibration, Self.position(), managedNodeContext);
    runtimeContext.setSceneSnapshot(result.scene.drawableNodes, result.scene.drawablePoints, result.selectedManagedNodes, result.scene);
  }

  public static void requestRefresh() {
    refreshRequested = true;
  }

  public static void processRefreshRequests() {
    if (calibration.graphId() == null) return;
    WaypointCutBounds nextBounds = WaypointCutBounds.aroundWorld(Self.position());
    if (refreshRequested || !_sameBounds(runtimeContext.scene().bounds, nextBounds)) {
      refreshRequested = false;
      refresh();
    }
  }

  private static boolean _sameBounds(WaypointCutBounds a, WaypointCutBounds b) {
    return a.centerCut.equals(b.centerCut);
  }
}
