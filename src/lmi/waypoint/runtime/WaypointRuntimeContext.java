package lmi.waypoint.runtime;

import haven.Coord;
import lmi.Array;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class WaypointRuntimeContext {
  private final ManagedObjectContext managedNodeContext = new ManagedObjectContext();
  private Long currentGraphId;
  private EnteringPortal enteringPortal;

  private WaypointScene scene = new WaypointScene(WaypointGridBounds.empty());
  private Array<ResolvedNode> nearbyNodes = new Array<>();
  private Array<ResolvedPoint> nearbyPoints = new Array<>();
  private Array<ManagedWpNode> selectedManagedNodes = new Array<>();

  private final Map<Long, Array<WpNode>> nodesByGraph = new HashMap<>();
  private final Set<Long> loadedNodeGraphs = new HashSet<>();
  private final Set<Long> loadingNodeGraphs = new HashSet<>();
  private final Map<Long, Array<WpEdge>> edgesByGraph = new HashMap<>();
  private final Set<Long> loadedEdgeGraphs = new HashSet<>();
  private final Set<Long> loadingEdgeGraphs = new HashSet<>();
  private final Map<String, Array<WpSegment>> segmentsByGraphGrid = new HashMap<>();
  private final Set<String> loadedSegmentGrids = new HashSet<>();
  private final Set<String> loadingSegmentGrids = new HashSet<>();
  private final Map<String, Array<WpPoint>> pointsByGraphGrid = new HashMap<>();
  private final Set<String> loadedPointGrids = new HashSet<>();
  private final Set<String> loadingPointGrids = new HashSet<>();
  private final Set<Long> residentGridIds = new HashSet<>();
  private final Map<Long, Array<WpSegment>> residentSegmentsByEdge = new HashMap<>();
  private final Map<Long, Array<WpPoint>> residentPointsBySegment = new HashMap<>();

  public synchronized void clear() {
    managedNodeContext.clear();
    currentGraphId = null;
    enteringPortal = null;
    scene = new WaypointScene(WaypointGridBounds.empty());
    nearbyNodes = new Array<>();
    nearbyPoints = new Array<>();
    selectedManagedNodes = new Array<>();
    nodesByGraph.clear();
    loadedNodeGraphs.clear();
    loadingNodeGraphs.clear();
    edgesByGraph.clear();
    loadedEdgeGraphs.clear();
    loadingEdgeGraphs.clear();
    segmentsByGraphGrid.clear();
    loadedSegmentGrids.clear();
    loadingSegmentGrids.clear();
    pointsByGraphGrid.clear();
    loadedPointGrids.clear();
    loadingPointGrids.clear();
    residentGridIds.clear();
    residentSegmentsByEdge.clear();
    residentPointsBySegment.clear();
  }

  public synchronized ManagedObjectContext managedNodeContext() {
    return managedNodeContext;
  }

  public synchronized Long currentGraphId() {
    return currentGraphId;
  }

  public synchronized void setCurrentGraphId(Long currentGraphId) {
    this.currentGraphId = currentGraphId;
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

  public synchronized EnteringPortal enteringPortal() {
    return enteringPortal;
  }

  public synchronized void setEnteringPortal(EnteringPortal enteringPortal) {
    this.enteringPortal = enteringPortal;
  }

  public synchronized void clearEnteringPortal() {
    this.enteringPortal = null;
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

  public synchronized WpNode findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY) {
    for (WpNode node : nodes(graphId)) {
      if (node.gridId == gridId && node.localX == localX && node.localY == localY)
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
    long graphId = findEdgeGraphId(segment.edgeId);
    String key = gridKey(graphId, segment.gridId);
    Array<WpSegment> segments = segmentsByGraphGrid.get(key);
    if (segments == null) {
      segments = new Array<>();
      segmentsByGraphGrid.put(key, segments);
    }
    segments.removeAllWhere(candidate -> candidate.id == segment.id);
    segments.append(segment);
    loadedSegmentGrids.add(key);
    loadingSegmentGrids.remove(key);
    if (residentGridIds.contains(segment.gridId)) {
      Array<WpSegment> residentSegments = arrayFor(residentSegmentsByEdge, segment.edgeId);
      residentSegments.removeAllWhere(candidate -> candidate.id == segment.id);
      residentSegments.append(segment);
    }
  }

  public synchronized void appendPoint(WpSegment segment, WpPoint point) {
    long graphId = findEdgeGraphId(segment.edgeId);
    String key = gridKey(graphId, point.gridId);
    Array<WpPoint> points = pointsByGraphGrid.get(key);
    if (points == null) {
      points = new Array<>();
      pointsByGraphGrid.put(key, points);
    }
    points.removeAllWhere(candidate -> candidate.id == point.id);
    points.append(point);
    loadedPointGrids.add(key);
    loadingPointGrids.remove(key);
    if (residentGridIds.contains(point.gridId)) {
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

  public synchronized Array<WpSegment> segmentsByGrid(long graphId, long gridId) {
    Array<WpSegment> segments = segmentsByGraphGrid.get(gridKey(graphId, gridId));
    return (segments == null) ? new Array<>() : segments;
  }

  public synchronized void setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments) {
    String key = gridKey(graphId, gridId);
    segmentsByGraphGrid.put(key, segments);
    loadedSegmentGrids.add(key);
    loadingSegmentGrids.remove(key);
  }

  public synchronized boolean segmentsByGridLoaded(long graphId, long gridId) {
    return loadedSegmentGrids.contains(gridKey(graphId, gridId));
  }

  public synchronized boolean beginSegmentsByGridLoad(long graphId, long gridId) {
    String key = gridKey(graphId, gridId);
    if (loadedSegmentGrids.contains(key) || loadingSegmentGrids.contains(key))
      return false;
    loadingSegmentGrids.add(key);
    return true;
  }

  public synchronized void endSegmentsByGridLoad(long graphId, long gridId) {
    loadingSegmentGrids.remove(gridKey(graphId, gridId));
  }

  public synchronized Array<WpPoint> pointsByGrid(long graphId, long gridId) {
    Array<WpPoint> points = pointsByGraphGrid.get(gridKey(graphId, gridId));
    return (points == null) ? new Array<>() : points;
  }

  public synchronized void setPointsByGrid(long graphId, long gridId, Array<WpPoint> points) {
    String key = gridKey(graphId, gridId);
    pointsByGraphGrid.put(key, points);
    loadedPointGrids.add(key);
    loadingPointGrids.remove(key);
  }

  public synchronized boolean pointsByGridLoaded(long graphId, long gridId) {
    return loadedPointGrids.contains(gridKey(graphId, gridId));
  }

  public synchronized boolean beginPointsByGridLoad(long graphId, long gridId) {
    String key = gridKey(graphId, gridId);
    if (loadedPointGrids.contains(key) || loadingPointGrids.contains(key))
      return false;
    loadingPointGrids.add(key);
    return true;
  }

  public synchronized void endPointsByGridLoad(long graphId, long gridId) {
    loadingPointGrids.remove(gridKey(graphId, gridId));
  }

  public synchronized void clearResident() {
    residentGridIds.clear();
    residentSegmentsByEdge.clear();
    residentPointsBySegment.clear();
  }

  public synchronized Set<Long> residentGridIds() {
    return new HashSet<>(residentGridIds);
  }

  public synchronized void addResidentGrid(long graphId, long gridId) {
    if (!residentGridIds.add(gridId))
      return;

    for (WpSegment segment : segmentsByGrid(graphId, gridId))
      arrayFor(residentSegmentsByEdge, segment.edgeId).append(segment);
    for (WpPoint point : pointsByGrid(graphId, gridId))
      arrayFor(residentPointsBySegment, point.segmentId).append(point);
  }

  public synchronized void removeResidentGrid(long graphId, long gridId) {
    if (!residentGridIds.remove(gridId))
      return;

    for (WpSegment segment : segmentsByGrid(graphId, gridId)) {
      Array<WpSegment> residentSegments = residentSegmentsByEdge.get(segment.edgeId);
      if (residentSegments == null)
        continue;
      residentSegments.removeAllWhere(candidate -> candidate.id == segment.id);
      if (residentSegments.isEmpty())
        residentSegmentsByEdge.remove(segment.edgeId);
    }

    for (WpPoint point : pointsByGrid(graphId, gridId)) {
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

  private static String gridKey(long graphId, long gridId) {
    return graphId + ":" + gridId;
  }

  private long findEdgeGraphId(long edgeId) {
    for (Map.Entry<Long, Array<WpEdge>> entry : edgesByGraph.entrySet()) {
      for (WpEdge edge : entry.getValue()) {
        if (edge.id == edgeId)
          return entry.getKey();
      }
    }
    return 0L;
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
