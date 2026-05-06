package lmi.waypoint;

import haven.Coord;
import haven.Coord2d;
import haven.MCache;
import lmi.Array;
import lmi.AppContext;
import lmi.Self;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.persistence.WaypointStore;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.model.LoadEdgesByGraphResult;
import lmi.waypoint.model.LoadNodesByGraphResult;
import lmi.waypoint.model.LoadPointsByCutResult;
import lmi.waypoint.model.LoadSegmentsByCutResult;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;
import lmi.waypoint.runtime.EnteringPortal;
import lmi.waypoint.runtime.WaypointRuntimeContext;
import lmi.waypoint.runtime.WaypointSceneBuilder;
import lmi.waypoint.runtime.ResolvedNode;
import lmi.waypoint.runtime.ResolvedPoint;
import lmi.waypoint.runtime.WaypointGridBounds;
import lmi.waypoint.runtime.WaypointScene;
import lmi.waypoint.runtime.GridPosition;
import lmi.waypoint.runtime.ResolvedGrid;
import lmi.waypoint.runtime.WaypointGridResolver;

public final class WaypointManager {
  private static final WaypointRuntimeContext runtimeContext = new WaypointRuntimeContext();
  private static final ManagedObjectContext managedNodeContext = runtimeContext.managedNodeContext();
  private static boolean refreshRequested;

  private WaypointManager() {}

  public static void clear() {
    runtimeContext.clear();
    WaypointGridResolver.clear();
    refreshRequested = false;
  }

  public static Long currentGraphId() {
    return runtimeContext.currentGraphId();
  }

  public static Long activeGraphId() {
    Long graphId = runtimeContext.currentGraphId();
    return graphId;
  }

  public static void setCurrentGraphId(Long graphId) {
    runtimeContext.setCurrentGraphId(graphId);
  }

  public static EnteringPortal enteringPortal() {
    return runtimeContext.enteringPortal();
  }

  public static void captureEnteringPortal(Coord world, String resname) {
    Long graphId = activeGraphId();
    if (graphId == null || world == null || resname == null)
      return;
    GridPosition position = gridPositionOfWorld(world);
    if (position == null)
      return;
    runtimeContext.setEnteringPortal(new EnteringPortal(graphId, position.gridId, position.localX, position.localY, resname));
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

  public static Array<WpNode> nodes(long graphId) {
    return runtimeContext.nodes(graphId);
  }

  public static WpNode findNode(long nodeId) {
    return runtimeContext.findNode(nodeId);
  }

  public static WpNode findNodeByGraphAndGridLocal(long graphId, long gridId, int localX, int localY) {
    return runtimeContext.findNodeByGraphAndGridLocal(graphId, gridId, localX, localY);
  }

  public static GridPosition gridPositionOfWorld(Coord world) {
    if (world == null || AppContext.glob == null)
      return null;
    Coord tile = Coord2d.of(world).floor(MCache.tilesz);
    Coord gc = tile.div(MCache.cmaps);
    ResolvedGrid grid = WaypointGridResolver.resolveGrid(gc);
    if (grid == null)
      return null;
    Coord local = Coord.of(world.x - grid.originWorld.x, world.y - grid.originWorld.y);
    return new GridPosition(grid.mapGridId, grid.havenGridId, grid.mapSegmentId, local.x, local.y);
  }

  public static GridPosition currentGridPosition() {
    return gridPositionOfWorld(Self.position());
  }

  public static void setNodes(long graphId, Array<WpNode> nodes) {
    runtimeContext.setNodes(graphId, nodes);
  }

  public static void appendNode(WpNode node) {
    runtimeContext.setCurrentGraphId(node.graphId);
    runtimeContext.appendNode(node);
  }

  public static void appendEdge(long graphId, WpEdge edge) {
    runtimeContext.setCurrentGraphId(graphId);
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
        if (activeGraphId() != null && activeGraphId() == result.graphId)
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
        if (activeGraphId() != null && activeGraphId() == result.graphId)
          requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endEdgesByGraphLoad(graphId);
      }
    });
  }

  public static Array<WpSegment> segmentsByGrid(long graphId, long gridId) {
    return runtimeContext.segmentsByGrid(graphId, gridId);
  }

  public static void setSegmentsByGrid(long graphId, long gridId, Array<WpSegment> segments) {
    runtimeContext.setSegmentsByGrid(graphId, gridId, segments);
  }

  public static boolean segmentsByGridLoaded(long graphId, long gridId) {
    return runtimeContext.segmentsByGridLoaded(graphId, gridId);
  }

  public static void preloadSegmentsByGrid(long graphId, long gridId) {
    if (!runtimeContext.beginSegmentsByGridLoad(graphId, gridId))
      return;
    WaypointStore.loadSegmentsByGridAsync(graphId, gridId, new WaypointResultHandler<LoadSegmentsByCutResult>() {
      @Override
      public void onSuccess(LoadSegmentsByCutResult result) {
        setSegmentsByGrid(result.graphId, result.gridId, result.segments);
        if (activeGraphId() != null && activeGraphId() == result.graphId)
          requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endSegmentsByGridLoad(graphId, gridId);
      }
    });
  }

  public static Array<WpPoint> pointsByGrid(long graphId, long gridId) {
    return runtimeContext.pointsByGrid(graphId, gridId);
  }

  public static void setPointsByGrid(long graphId, long gridId, Array<WpPoint> points) {
    runtimeContext.setPointsByGrid(graphId, gridId, points);
  }

  public static boolean pointsByGridLoaded(long graphId, long gridId) {
    return runtimeContext.pointsByGridLoaded(graphId, gridId);
  }

  public static void preloadPointsByGrid(long graphId, long gridId) {
    if (!runtimeContext.beginPointsByGridLoad(graphId, gridId))
      return;
    WaypointStore.loadPointsByGridAsync(graphId, gridId, new WaypointResultHandler<LoadPointsByCutResult>() {
      @Override
      public void onSuccess(LoadPointsByCutResult result) {
        setPointsByGrid(result.graphId, result.gridId, result.points);
        if (activeGraphId() != null && activeGraphId() == result.graphId)
          requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        runtimeContext.endPointsByGridLoad(graphId, gridId);
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
    WaypointGridBounds bounds = WaypointGridBounds.aroundWorld(Self.position());
    _syncResidentGrids(bounds);
    runtimeContext.setSceneSnapshot(new Array<>(), new Array<>(), new Array<>(), new WaypointScene(bounds));
    managedNodeContext.clear();

    WaypointSceneBuilder.BuildResult result = WaypointSceneBuilder.build(activeGraphId() == null ? 0L : activeGraphId(), bounds, managedNodeContext);
    runtimeContext.setSceneSnapshot(result.scene.drawableNodes, result.scene.drawablePoints, result.selectedManagedNodes, result.scene);
  }

  public static void requestRefresh() {
    refreshRequested = true;
  }

  public static void processRefreshRequests() {
    if (activeGraphId() == null) return;
    WaypointGridBounds nextBounds = WaypointGridBounds.aroundWorld(Self.position());
    if (refreshRequested || !_sameBounds(runtimeContext.scene().bounds, nextBounds)) {
      refreshRequested = false;
      refresh();
    }
  }

  private static boolean _sameBounds(WaypointGridBounds a, WaypointGridBounds b) {
    return a.centerGrid.equals(b.centerGrid);
  }

  private static void _syncResidentGrids(WaypointGridBounds bounds) {
    Long graphId = activeGraphId();
    if (graphId == null)
      return;

    java.util.HashSet<Long> desiredGridIds = new java.util.HashSet<>(bounds.loadGridIds());

    java.util.HashSet<Long> currentGridIds = new java.util.HashSet<>(runtimeContext.residentGridIds());

    for (Long gridId : currentGridIds) {
      if (!desiredGridIds.contains(gridId))
        runtimeContext.removeResidentGrid(graphId, gridId);
    }

    for (Long gridId : desiredGridIds) {
      if (currentGridIds.contains(gridId))
        continue;
      if (!segmentsByGridLoaded(graphId, gridId)) {
        preloadSegmentsByGrid(graphId, gridId);
        continue;
      }
      if (!pointsByGridLoaded(graphId, gridId)) {
        preloadPointsByGrid(graphId, gridId);
        continue;
      }
      runtimeContext.addResidentGrid(graphId, gridId);
    }
  }

}
