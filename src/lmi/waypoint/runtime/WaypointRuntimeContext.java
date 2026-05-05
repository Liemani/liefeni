package lmi.waypoint.runtime;

import haven.Coord;
import lmi.Array;
import lmi.waypoint.managed.ManagedWpAnchor;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.object.WpAnchor;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpPortal;
import lmi.waypoint.object.WpSegment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class WaypointRuntimeContext {
  private final WaypointCalibrationState calibration = new WaypointCalibrationState();
  private final ManagedObjectContext managedAnchorContext = new ManagedObjectContext();
  private final ManagedObjectContext managedNodeContext = new ManagedObjectContext();
  private ManagedWpAnchor managedAnchor;
  private EnteringPortal enteringPortal;

  private WaypointScene scene = new WaypointScene(WaypointCutBounds.aroundWorld(Coord.z));
  private Array<ResolvedNode> nearbyNodes = new Array<>();
  private Array<ResolvedPoint> nearbyPoints = new Array<>();
  private Array<ManagedWpNode> selectedManagedNodes = new Array<>();

  private Array<WpAnchor> anchors = new Array<>();
  private boolean anchorsLoaded;
  private boolean anchorsLoading;
  private final Map<Long, Array<WpPortal>> portalsByGraph = new HashMap<>();
  private final Set<Long> loadedPortalGraphs = new HashSet<>();
  private final Set<Long> loadingPortalGraphs = new HashSet<>();
  private final Map<Long, Array<WpPortal>> counterpartPortalsByPortalId = new HashMap<>();
  private final Set<Long> loadedCounterpartPortalIds = new HashSet<>();
  private final Set<Long> loadingCounterpartPortalIds = new HashSet<>();
  private final Map<Long, Array<WpNode>> nodesByGraph = new HashMap<>();
  private final Set<Long> loadedNodeGraphs = new HashSet<>();
  private final Set<Long> loadingNodeGraphs = new HashSet<>();
  private final Map<Long, Array<WpEdge>> edgesByGraph = new HashMap<>();
  private final Set<Long> loadedEdgeGraphs = new HashSet<>();
  private final Set<Long> loadingEdgeGraphs = new HashSet<>();
  private final Map<String, Array<WpSegment>> segmentsByGraphCut = new HashMap<>();
  private final Set<String> loadedSegmentCuts = new HashSet<>();
  private final Set<String> loadingSegmentCuts = new HashSet<>();
  private final Map<String, Array<WpPoint>> pointsByGraphCut = new HashMap<>();
  private final Set<String> loadedPointCuts = new HashSet<>();
  private final Set<String> loadingPointCuts = new HashSet<>();
  private final Set<Integer> residentCutIds = new HashSet<>();
  private final Map<Long, Array<WpSegment>> residentSegmentsByEdge = new HashMap<>();
  private final Map<Long, Array<WpPoint>> residentPointsBySegment = new HashMap<>();

  public synchronized void clear() {
    calibration.clear();
    managedAnchorContext.clear();
    managedNodeContext.clear();
    managedAnchor = null;
    enteringPortal = null;
    scene = new WaypointScene(WaypointCutBounds.aroundWorld(Coord.z));
    nearbyNodes = new Array<>();
    nearbyPoints = new Array<>();
    selectedManagedNodes = new Array<>();
    anchors = new Array<>();
    anchorsLoaded = false;
    anchorsLoading = false;
    portalsByGraph.clear();
    loadedPortalGraphs.clear();
    loadingPortalGraphs.clear();
    counterpartPortalsByPortalId.clear();
    loadedCounterpartPortalIds.clear();
    loadingCounterpartPortalIds.clear();
    nodesByGraph.clear();
    loadedNodeGraphs.clear();
    loadingNodeGraphs.clear();
    edgesByGraph.clear();
    loadedEdgeGraphs.clear();
    loadingEdgeGraphs.clear();
    segmentsByGraphCut.clear();
    loadedSegmentCuts.clear();
    loadingSegmentCuts.clear();
    pointsByGraphCut.clear();
    loadedPointCuts.clear();
    loadingPointCuts.clear();
    residentCutIds.clear();
    residentSegmentsByEdge.clear();
    residentPointsBySegment.clear();
  }

  public synchronized WaypointCalibrationState calibration() {
    return calibration;
  }

  public synchronized ManagedObjectContext managedNodeContext() {
    return managedNodeContext;
  }

  public synchronized ManagedObjectContext managedAnchorContext() {
    return managedAnchorContext;
  }

  public synchronized WaypointScene scene() {
    return scene;
  }

  public synchronized void setScene(WaypointScene scene) {
    this.scene = scene;
  }

  public synchronized Array<ResolvedNode> nearbyNodes() {
    return nearbyNodes;
  }

  public synchronized Array<ResolvedPoint> nearbyPoints() {
    return nearbyPoints;
  }

  public synchronized Array<ManagedWpNode> selectedManagedNodes() {
    return selectedManagedNodes;
  }

  public synchronized void setSceneSnapshot(
    Array<ResolvedNode> nearbyNodes,
    Array<ResolvedPoint> nearbyPoints,
    Array<ManagedWpNode> selectedManagedNodes,
    WaypointScene scene
  ) {
    this.nearbyNodes = nearbyNodes;
    this.nearbyPoints = nearbyPoints;
    this.selectedManagedNodes = selectedManagedNodes;
    this.scene = scene;
  }

  public synchronized Array<WpAnchor> anchors() {
    if (managedAnchor != null) {
      WpAnchor anchor = managedAnchor.toWpAnchor();
      if (anchor != null) {
        Array<WpAnchor> current = new Array<>();
        current.append(anchor);
        return current;
      }
    }
    return anchors;
  }

  public synchronized void setAnchors(Array<WpAnchor> anchors) {
    this.anchors = anchors;
    managedAnchorContext.clear();
    managedAnchor = anchors.isEmpty() ? null : managedAnchorContext.registerLoaded(ManagedWpAnchor.fromWpAnchor(managedAnchorContext, anchors.first()));
    this.anchorsLoaded = true;
    this.anchorsLoading = false;
  }

  public synchronized boolean anchorsLoaded() {
    return anchorsLoaded;
  }

  public synchronized boolean beginAnchorsLoad() {
    if (anchorsLoaded || anchorsLoading)
      return false;
    anchorsLoading = true;
    return true;
  }

  public synchronized void endAnchorsLoad() {
    anchorsLoading = false;
  }

  public synchronized ManagedWpAnchor managedAnchor() {
    return managedAnchor;
  }

  public synchronized void setManagedAnchor(ManagedWpAnchor managedAnchor) {
    this.managedAnchor = managedAnchor;
  }

  public synchronized EnteringPortal enteringPortal() {
    return enteringPortal;
  }

  public synchronized void setEnteringPortal(EnteringPortal enteringPortal) {
    this.enteringPortal = enteringPortal;
  }

  public synchronized void clearEnteringPortal() {
    this.enteringPortal = null;
  }

  public synchronized Array<WpPortal> portals(long graphId) {
    Array<WpPortal> portals = portalsByGraph.get(graphId);
    return (portals == null) ? new Array<>() : portals;
  }

  public synchronized void setPortals(long graphId, Array<WpPortal> portals) {
    portalsByGraph.put(graphId, portals);
    loadedPortalGraphs.add(graphId);
    loadingPortalGraphs.remove(graphId);
  }

  public synchronized boolean portalsLoaded(long graphId) {
    return loadedPortalGraphs.contains(graphId);
  }

  public synchronized boolean beginPortalsLoad(long graphId) {
    if (loadedPortalGraphs.contains(graphId) || loadingPortalGraphs.contains(graphId))
      return false;
    loadingPortalGraphs.add(graphId);
    return true;
  }

  public synchronized void endPortalsLoad(long graphId) {
    loadingPortalGraphs.remove(graphId);
  }

  public synchronized Array<WpPortal> counterpartPortals(long portalId) {
    Array<WpPortal> portals = counterpartPortalsByPortalId.get(portalId);
    return (portals == null) ? new Array<>() : portals;
  }

  public synchronized void setCounterpartPortals(long portalId, Array<WpPortal> portals) {
    counterpartPortalsByPortalId.put(portalId, portals);
    loadedCounterpartPortalIds.add(portalId);
    loadingCounterpartPortalIds.remove(portalId);
  }

  public synchronized boolean counterpartPortalsLoaded(long portalId) {
    return loadedCounterpartPortalIds.contains(portalId);
  }

  public synchronized boolean beginCounterpartPortalsLoad(long portalId) {
    if (loadedCounterpartPortalIds.contains(portalId) || loadingCounterpartPortalIds.contains(portalId))
      return false;
    loadingCounterpartPortalIds.add(portalId);
    return true;
  }

  public synchronized void endCounterpartPortalsLoad(long portalId) {
    loadingCounterpartPortalIds.remove(portalId);
  }

  public synchronized Array<WpNode> nodes(long graphId) {
    Array<WpNode> nodes = nodesByGraph.get(graphId);
    return (nodes == null) ? new Array<>() : nodes;
  }

  public synchronized WpNode findNode(long nodeId) {
    for (Array<WpNode> nodes : nodesByGraph.values()) {
      for (WpNode node : nodes) {
        if (node.id == nodeId)
          return node;
      }
    }
    return null;
  }

  public synchronized WpNode findNodeByGraphAndVir(long graphId, int virX, int virY) {
    for (WpNode node : nodes(graphId)) {
      if (node.virX == virX && node.virY == virY)
        return node;
    }
    return null;
  }

  public synchronized void setNodes(long graphId, Array<WpNode> nodes) {
    Array<WpNode> merged = new Array<>();
    merged.addAll(nodes);
    Array<WpNode> existing = nodesByGraph.get(graphId);
    if (existing != null) {
      for (WpNode node : existing) {
        if (!merged.containsWhere(candidate -> candidate.id == node.id))
          merged.append(node);
      }
    }
    nodesByGraph.put(graphId, merged);
    loadedNodeGraphs.add(graphId);
    loadingNodeGraphs.remove(graphId);
  }

  public synchronized void appendNode(WpNode node) {
    Array<WpNode> nodes = nodesByGraph.get(node.graphId);
    if (nodes == null) {
      nodes = new Array<>();
      nodesByGraph.put(node.graphId, nodes);
    }
    nodes.removeAllWhere(candidate -> candidate.id == node.id);
    nodes.append(node);
    loadedNodeGraphs.add(node.graphId);
    loadingNodeGraphs.remove(node.graphId);
  }

  public synchronized void appendEdge(long graphId, WpEdge edge) {
    Array<WpEdge> edges = edgesByGraph.get(graphId);
    if (edges == null) {
      edges = new Array<>();
      edgesByGraph.put(graphId, edges);
    }
    edges.removeAllWhere(candidate -> candidate.id == edge.id);
    edges.append(edge);
    loadedEdgeGraphs.add(graphId);
    loadingEdgeGraphs.remove(graphId);
  }

  public synchronized void appendSegment(WpSegment segment) {
    String key = cutKey(segment.graphId, segment.cutId);
    Array<WpSegment> segments = segmentsByGraphCut.get(key);
    if (segments == null) {
      segments = new Array<>();
      segmentsByGraphCut.put(key, segments);
    }
    segments.removeAllWhere(candidate -> candidate.id == segment.id);
    segments.append(segment);
    loadedSegmentCuts.add(key);
    loadingSegmentCuts.remove(key);
    if (residentCutIds.contains(segment.cutId)) {
      Array<WpSegment> residentSegments = arrayFor(residentSegmentsByEdge, segment.edgeId);
      residentSegments.removeAllWhere(candidate -> candidate.id == segment.id);
      residentSegments.append(segment);
    }
  }

  public synchronized void appendPoint(WpSegment segment, WpPoint point) {
    String key = cutKey(segment.graphId, point.cutId);
    Array<WpPoint> points = pointsByGraphCut.get(key);
    if (points == null) {
      points = new Array<>();
      pointsByGraphCut.put(key, points);
    }
    points.removeAllWhere(candidate -> candidate.id == point.id);
    points.append(point);
    loadedPointCuts.add(key);
    loadingPointCuts.remove(key);
    if (residentCutIds.contains(point.cutId)) {
      Array<WpPoint> residentPoints = arrayFor(residentPointsBySegment, point.segmentId);
      residentPoints.removeAllWhere(candidate -> candidate.id == point.id);
      residentPoints.append(point);
    }
  }

  public synchronized boolean nodesLoaded(long graphId) {
    return loadedNodeGraphs.contains(graphId);
  }

  public synchronized boolean beginNodesLoad(long graphId) {
    if (loadedNodeGraphs.contains(graphId) || loadingNodeGraphs.contains(graphId))
      return false;
    loadingNodeGraphs.add(graphId);
    return true;
  }

  public synchronized void endNodesLoad(long graphId) {
    loadingNodeGraphs.remove(graphId);
  }

  public synchronized Array<WpEdge> edgesByGraph(long graphId) {
    Array<WpEdge> edges = edgesByGraph.get(graphId);
    return (edges == null) ? new Array<>() : edges;
  }

  public synchronized void setEdgesByGraph(long graphId, Array<WpEdge> edges) {
    edgesByGraph.put(graphId, edges);
    loadedEdgeGraphs.add(graphId);
    loadingEdgeGraphs.remove(graphId);
  }

  public synchronized boolean edgesByGraphLoaded(long graphId) {
    return loadedEdgeGraphs.contains(graphId);
  }

  public synchronized boolean beginEdgesByGraphLoad(long graphId) {
    if (loadedEdgeGraphs.contains(graphId) || loadingEdgeGraphs.contains(graphId))
      return false;
    loadingEdgeGraphs.add(graphId);
    return true;
  }

  public synchronized void endEdgesByGraphLoad(long graphId) {
    loadingEdgeGraphs.remove(graphId);
  }

  public synchronized Array<WpSegment> segmentsByCut(long graphId, int cutId) {
    Array<WpSegment> segments = segmentsByGraphCut.get(cutKey(graphId, cutId));
    return (segments == null) ? new Array<>() : segments;
  }

  public synchronized void setSegmentsByCut(long graphId, int cutId, Array<WpSegment> segments) {
    String key = cutKey(graphId, cutId);
    segmentsByGraphCut.put(key, segments);
    loadedSegmentCuts.add(key);
    loadingSegmentCuts.remove(key);
  }

  public synchronized boolean segmentsByCutLoaded(long graphId, int cutId) {
    return loadedSegmentCuts.contains(cutKey(graphId, cutId));
  }

  public synchronized boolean beginSegmentsByCutLoad(long graphId, int cutId) {
    String key = cutKey(graphId, cutId);
    if (loadedSegmentCuts.contains(key) || loadingSegmentCuts.contains(key))
      return false;
    loadingSegmentCuts.add(key);
    return true;
  }

  public synchronized void endSegmentsByCutLoad(long graphId, int cutId) {
    loadingSegmentCuts.remove(cutKey(graphId, cutId));
  }

  public synchronized Array<WpPoint> pointsByCut(long graphId, int cutId) {
    Array<WpPoint> points = pointsByGraphCut.get(cutKey(graphId, cutId));
    return (points == null) ? new Array<>() : points;
  }

  public synchronized void setPointsByCut(long graphId, int cutId, Array<WpPoint> points) {
    String key = cutKey(graphId, cutId);
    pointsByGraphCut.put(key, points);
    loadedPointCuts.add(key);
    loadingPointCuts.remove(key);
  }

  public synchronized boolean pointsByCutLoaded(long graphId, int cutId) {
    return loadedPointCuts.contains(cutKey(graphId, cutId));
  }

  public synchronized boolean beginPointsByCutLoad(long graphId, int cutId) {
    String key = cutKey(graphId, cutId);
    if (loadedPointCuts.contains(key) || loadingPointCuts.contains(key))
      return false;
    loadingPointCuts.add(key);
    return true;
  }

  public synchronized void endPointsByCutLoad(long graphId, int cutId) {
    loadingPointCuts.remove(cutKey(graphId, cutId));
  }

  public synchronized void clearResident() {
    residentCutIds.clear();
    residentSegmentsByEdge.clear();
    residentPointsBySegment.clear();
  }

  public synchronized Set<Integer> residentCutIds() {
    return new HashSet<>(residentCutIds);
  }

  public synchronized void addResidentCut(long graphId, int cutId) {
    if (!residentCutIds.add(cutId))
      return;

    for (WpSegment segment : segmentsByCut(graphId, cutId))
      arrayFor(residentSegmentsByEdge, segment.edgeId).append(segment);
    for (WpPoint point : pointsByCut(graphId, cutId))
      arrayFor(residentPointsBySegment, point.segmentId).append(point);
  }

  public synchronized void removeResidentCut(long graphId, int cutId) {
    if (!residentCutIds.remove(cutId))
      return;

    for (WpSegment segment : segmentsByCut(graphId, cutId)) {
      Array<WpSegment> residentSegments = residentSegmentsByEdge.get(segment.edgeId);
      if (residentSegments == null)
        continue;
      residentSegments.removeAllWhere(candidate -> candidate.id == segment.id);
      if (residentSegments.isEmpty())
        residentSegmentsByEdge.remove(segment.edgeId);
    }

    for (WpPoint point : pointsByCut(graphId, cutId)) {
      Array<WpPoint> residentPoints = residentPointsBySegment.get(point.segmentId);
      if (residentPoints == null)
        continue;
      residentPoints.removeAllWhere(candidate -> candidate.id == point.id);
      if (residentPoints.isEmpty())
        residentPointsBySegment.remove(point.segmentId);
    }
  }

  public synchronized Array<WpSegment> residentSegments(long edgeId) {
    Array<WpSegment> segments = residentSegmentsByEdge.get(edgeId);
    return (segments == null) ? new Array<>() : segments;
  }

  public synchronized Array<WpPoint> residentPoints(long segmentId) {
    Array<WpPoint> points = residentPointsBySegment.get(segmentId);
    return (points == null) ? new Array<>() : points;
  }

  private static String cutKey(long graphId, int cutId) {
    return graphId + ":" + cutId;
  }

  private static <K, V> Array<V> arrayFor(Map<K, Array<V>> map, K key) {
    Array<V> array = map.get(key);
    if (array == null) {
      array = new Array<>();
      map.put(key, array);
    }
    return array;
  }
}
