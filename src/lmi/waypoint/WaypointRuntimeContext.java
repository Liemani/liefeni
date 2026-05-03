package lmi.waypoint;

import haven.Coord;
import lmi.Array;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.object.WpAnchor;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpPortal;
import lmi.waypoint.object.WpSegment;
import lmi.waypoint.runtime.ResolvedNode;
import lmi.waypoint.runtime.ResolvedPoint;
import lmi.waypoint.runtime.WaypointCutBounds;
import lmi.waypoint.runtime.WaypointScene;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class WaypointRuntimeContext {
  private final WaypointCalibrationState calibration = new WaypointCalibrationState();
  private final ManagedObjectContext managedNodeContext = new ManagedObjectContext();

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
  private final Map<Long, Array<WpEdge>> edgesByNode = new HashMap<>();
  private final Set<Long> loadedEdgeNodes = new HashSet<>();
  private final Set<Long> loadingEdgeNodes = new HashSet<>();
  private final Map<Long, Array<WpSegment>> segmentsByEdge = new HashMap<>();
  private final Set<Long> loadedSegmentEdges = new HashSet<>();
  private final Set<Long> loadingSegmentEdges = new HashSet<>();
  private final Map<Long, Array<WpPoint>> pointsBySegment = new HashMap<>();
  private final Set<Long> loadedPointSegments = new HashSet<>();
  private final Set<Long> loadingPointSegments = new HashSet<>();

  public synchronized void clear() {
    calibration.clear();
    managedNodeContext.clear();
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
    edgesByNode.clear();
    loadedEdgeNodes.clear();
    loadingEdgeNodes.clear();
    segmentsByEdge.clear();
    loadedSegmentEdges.clear();
    loadingSegmentEdges.clear();
    pointsBySegment.clear();
    loadedPointSegments.clear();
    loadingPointSegments.clear();
  }

  public synchronized WaypointCalibrationState calibration() {
    return calibration;
  }

  public synchronized ManagedObjectContext managedNodeContext() {
    return managedNodeContext;
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
    return anchors;
  }

  public synchronized void setAnchors(Array<WpAnchor> anchors) {
    this.anchors = anchors;
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

  public synchronized void setNodes(long graphId, Array<WpNode> nodes) {
    nodesByGraph.put(graphId, nodes);
    loadedNodeGraphs.add(graphId);
    loadingNodeGraphs.remove(graphId);
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

  public synchronized Array<WpEdge> edges(long nodeId) {
    Array<WpEdge> edges = edgesByNode.get(nodeId);
    return (edges == null) ? new Array<>() : edges;
  }

  public synchronized void setEdges(long nodeId, Array<WpEdge> edges) {
    edgesByNode.put(nodeId, edges);
    loadedEdgeNodes.add(nodeId);
    loadingEdgeNodes.remove(nodeId);
  }

  public synchronized boolean edgesLoaded(long nodeId) {
    return loadedEdgeNodes.contains(nodeId);
  }

  public synchronized boolean beginEdgesLoad(long nodeId) {
    if (loadedEdgeNodes.contains(nodeId) || loadingEdgeNodes.contains(nodeId))
      return false;
    loadingEdgeNodes.add(nodeId);
    return true;
  }

  public synchronized void endEdgesLoad(long nodeId) {
    loadingEdgeNodes.remove(nodeId);
  }

  public synchronized Array<WpSegment> segments(long edgeId) {
    Array<WpSegment> segments = segmentsByEdge.get(edgeId);
    return (segments == null) ? new Array<>() : segments;
  }

  public synchronized void setSegments(long edgeId, Array<WpSegment> segments) {
    segmentsByEdge.put(edgeId, segments);
    loadedSegmentEdges.add(edgeId);
    loadingSegmentEdges.remove(edgeId);
  }

  public synchronized boolean segmentsLoaded(long edgeId) {
    return loadedSegmentEdges.contains(edgeId);
  }

  public synchronized boolean beginSegmentsLoad(long edgeId) {
    if (loadedSegmentEdges.contains(edgeId) || loadingSegmentEdges.contains(edgeId))
      return false;
    loadingSegmentEdges.add(edgeId);
    return true;
  }

  public synchronized void endSegmentsLoad(long edgeId) {
    loadingSegmentEdges.remove(edgeId);
  }

  public synchronized Array<WpPoint> points(long segmentId) {
    Array<WpPoint> points = pointsBySegment.get(segmentId);
    return (points == null) ? new Array<>() : points;
  }

  public synchronized void setPoints(long segmentId, Array<WpPoint> points) {
    pointsBySegment.put(segmentId, points);
    loadedPointSegments.add(segmentId);
    loadingPointSegments.remove(segmentId);
  }

  public synchronized boolean pointsLoaded(long segmentId) {
    return loadedPointSegments.contains(segmentId);
  }

  public synchronized boolean beginPointsLoad(long segmentId) {
    if (loadedPointSegments.contains(segmentId) || loadingPointSegments.contains(segmentId))
      return false;
    loadingPointSegments.add(segmentId);
    return true;
  }

  public synchronized void endPointsLoad(long segmentId) {
    loadingPointSegments.remove(segmentId);
  }
}
