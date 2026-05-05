package lmi.waypoint;

import haven.Coord;
import haven.Gob;
import haven.Area;
import lmi.Array;
import lmi.Api;
import lmi.Self;
import lmi.waypoint.calibration.WaypointCalibrator;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.persistence.WaypointStore;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpAnchor;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.model.LoadCounterpartPortalsResult;
import lmi.waypoint.model.LoadEdgesByGraphResult;
import lmi.waypoint.model.LoadNodesByGraphResult;
import lmi.waypoint.model.LoadPointsByCutResult;
import lmi.waypoint.model.LoadPortalsResult;
import lmi.waypoint.model.LoadSegmentsByCutResult;
import lmi.waypoint.object.WpAnchor;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPortal;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;
import lmi.waypoint.runtime.WaypointCalibrationState;
import lmi.waypoint.runtime.WaypointRuntimeContext;
import lmi.waypoint.runtime.WaypointSceneBuilder;
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
    runtimeContext.clearResident();
    refresh();
    Api.message("[WaypointManager.calibrate] success graphId=" + calibration.graphId() + " world=" + calibration.world() + " vir=" + calibration.vir());
    return true;
  }

  public static boolean calibrate(Gob gob) {
    if (!WaypointCalibrator.calibrateFromPortal(calibration, gob))
      return false;
    runtimeContext.clearResident();
    refresh();
    Api.message("[WaypointManager.calibrate] success graphId=" + calibration.graphId() + " world=" + calibration.world() + " vir=" + calibration.vir());
    return true;
  }

  public static boolean isCalibrated() {
    return calibration.isCalibrated();
  }

  public static boolean hasAnchor() {
    ManagedWpAnchor anchor = runtimeContext.managedAnchor();
    return (anchor != null) && (anchor.toWpAnchor() != null);
  }

  public static void markAnchorPresent() {
    calibration.markAnchorPresent();
  }

  public static void setAnchorPresent(boolean anchorPresent) {
    calibration.setAnchorPresent(anchorPresent);
  }

  public static ManagedObjectContext managedAnchorContext() {
    return runtimeContext.managedAnchorContext();
  }

  public static ManagedWpAnchor managedAnchor() {
    return runtimeContext.managedAnchor();
  }

  public static void setManagedAnchor(ManagedWpAnchor managedAnchor) {
    runtimeContext.setManagedAnchor(managedAnchor);
    calibration.setAnchorPresent((managedAnchor != null) && (managedAnchor.toWpAnchor() != null));
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

  public static Coord worldOfVir(int virX, int virY) {
    return calibration.worldOfVir(virX, virY);
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

  public static WpNode findNode(long nodeId) {
    return runtimeContext.findNode(nodeId);
  }

  public static WpNode findNodeByGraphAndVir(long graphId, int virX, int virY) {
    return runtimeContext.findNodeByGraphAndVir(graphId, virX, virY);
  }

  public static void setNodes(long graphId, Array<WpNode> nodes) {
    runtimeContext.setNodes(graphId, nodes);
  }

  public static void appendNode(WpNode node) {
    runtimeContext.appendNode(node);
  }

  public static void appendEdge(long graphId, WpEdge edge) {
    runtimeContext.appendEdge(graphId, edge);
  }

  public static void appendSegment(WpSegment segment) {
    runtimeContext.appendSegment(segment);
  }

  public static void appendPoint(WpSegment segment, WpPoint point) {
    runtimeContext.appendPoint(segment, point);
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

  public static Array<WpEdge> edgesByGraph(long graphId) {
    return runtimeContext.edgesByGraph(graphId);
  }

  public static void setEdgesByGraph(long graphId, Array<WpEdge> edges) {
    runtimeContext.setEdgesByGraph(graphId, edges);
  }

  public static boolean edgesByGraphLoaded(long graphId) {
    return runtimeContext.edgesByGraphLoaded(graphId);
  }

  public static void preloadEdgesByGraph(long graphId) {
    if (!runtimeContext.beginEdgesByGraphLoad(graphId))
      return;
    WaypointStore.loadEdgesByGraphAsync(graphId, new WaypointResultHandler<LoadEdgesByGraphResult>() {
      @Override
      public void onSuccess(LoadEdgesByGraphResult result) {
        setEdgesByGraph(result.graphId, result.edges);
        if (isCalibrated() && calibrationGraphId() != null && calibrationGraphId() == result.graphId)
          requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endEdgesByGraphLoad(graphId);
      }
    });
  }

  public static Array<WpSegment> segmentsByCut(long graphId, long cutId) {
    return runtimeContext.segmentsByCut(graphId, cutId);
  }

  public static void setSegmentsByCut(long graphId, long cutId, Array<WpSegment> segments) {
    runtimeContext.setSegmentsByCut(graphId, cutId, segments);
  }

  public static boolean segmentsByCutLoaded(long graphId, long cutId) {
    return runtimeContext.segmentsByCutLoaded(graphId, cutId);
  }

  public static void preloadSegmentsByCut(long graphId, long cutId) {
    if (!runtimeContext.beginSegmentsByCutLoad(graphId, cutId))
      return;
    WaypointStore.loadSegmentsByCutAsync(graphId, cutId, new WaypointResultHandler<LoadSegmentsByCutResult>() {
      @Override
      public void onSuccess(LoadSegmentsByCutResult result) {
        setSegmentsByCut(result.graphId, result.cutId, result.segments);
        if (isCalibrated() && calibrationGraphId() != null && calibrationGraphId() == result.graphId)
          requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endSegmentsByCutLoad(graphId, cutId);
      }
    });
  }

  public static Array<WpPoint> pointsByCut(long graphId, long cutId) {
    return runtimeContext.pointsByCut(graphId, cutId);
  }

  public static void setPointsByCut(long graphId, long cutId, Array<WpPoint> points) {
    runtimeContext.setPointsByCut(graphId, cutId, points);
  }

  public static boolean pointsByCutLoaded(long graphId, long cutId) {
    return runtimeContext.pointsByCutLoaded(graphId, cutId);
  }

  public static void preloadPointsByCut(long graphId, long cutId) {
    if (!runtimeContext.beginPointsByCutLoad(graphId, cutId))
      return;
    WaypointStore.loadPointsByCutAsync(graphId, cutId, new WaypointResultHandler<LoadPointsByCutResult>() {
      @Override
      public void onSuccess(LoadPointsByCutResult result) {
        setPointsByCut(result.graphId, result.cutId, result.points);
        if (isCalibrated() && calibrationGraphId() != null && calibrationGraphId() == result.graphId)
          requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endPointsByCutLoad(graphId, cutId);
      }
    });
  }

  public static Array<WpSegment> residentSegments(long edgeId) {
    return runtimeContext.residentSegments(edgeId);
  }

  public static Array<WpPoint> residentPoints(long segmentId) {
    return runtimeContext.residentPoints(segmentId);
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
    Coord selfVir = calibration.virOfWorld(Self.position());
    WaypointCutBounds bounds = (selfVir == null) ? WaypointCutBounds.aroundVir(Coord.z) : WaypointCutBounds.aroundVir(selfVir);
    _syncResidentCuts(bounds);
    runtimeContext.setSceneSnapshot(new Array<>(), new Array<>(), new Array<>(), new WaypointScene(bounds));
    managedNodeContext.clear();

    WaypointSceneBuilder.BuildResult result = WaypointSceneBuilder.build(calibration, Self.position(), managedNodeContext);
    runtimeContext.setSceneSnapshot(result.scene.drawableNodes, result.scene.drawablePoints, result.selectedManagedNodes, result.scene);
  }

  public static void requestRefresh() {
    refreshRequested = true;
  }

  public static void processRefreshRequests() {
    if (calibration.graphId() == null) return;
    Coord selfVir = calibration.virOfWorld(Self.position());
    WaypointCutBounds nextBounds = (selfVir == null) ? WaypointCutBounds.aroundVir(Coord.z) : WaypointCutBounds.aroundVir(selfVir);
    if (refreshRequested || !_sameBounds(runtimeContext.scene().bounds, nextBounds)) {
      refreshRequested = false;
      refresh();
    }
  }

  private static boolean _sameBounds(WaypointCutBounds a, WaypointCutBounds b) {
    return a.centerCut.equals(b.centerCut);
  }

  private static void _syncResidentCuts(WaypointCutBounds bounds) {
    Long graphId = calibration.graphId();
    if (graphId == null)
      return;

    java.util.HashSet<Long> desiredCutIds = new java.util.HashSet<>();
    for (Coord cut : bounds.loadArea)
      desiredCutIds.add(WaypointCutBounds.cutIdOfCut(cut.x, cut.y));

    java.util.HashSet<Long> currentCutIds = new java.util.HashSet<>(runtimeContext.residentCutIds());

    for (Long cutId : currentCutIds) {
      if (!desiredCutIds.contains(cutId))
        runtimeContext.removeResidentCut(graphId, cutId);
    }

    for (Long cutId : desiredCutIds) {
      if (currentCutIds.contains(cutId))
        continue;
      if (!segmentsByCutLoaded(graphId, cutId)) {
        preloadSegmentsByCut(graphId, cutId);
        continue;
      }
      if (!pointsByCutLoaded(graphId, cutId)) {
        preloadPointsByCut(graphId, cutId);
        continue;
      }
      runtimeContext.addResidentCut(graphId, cutId);
    }
  }

}
