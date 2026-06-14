package lmi.waypoint.runtime;

import haven.Coord;
import lmi.core.Array;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public final class WaypointSceneBuilder {
  private WaypointSceneBuilder() {}

  public static BuildResult build(
    long graphId,
    WaypointGridBounds bounds,
    ManagedObjectContext managedNodeContext
  ) {
    if (graphId <= 0)
      return new BuildResult(new WaypointScene(WaypointGridBounds.empty()), new Array<>());

    WaypointScene scene = new WaypointScene(bounds);
    managedNodeContext.clear();

    HashSet<Long> visitedEdges = new HashSet<>();
    HashMap<Long, ResolvedNode> nodeMap = new HashMap<>();

    if (!WaypointManager.nodesLoaded(graphId)) {
      WaypointManager.preloadNodes(graphId);
      return new BuildResult(scene, new Array<>());
    }
    if (!WaypointManager.edgesByGraphLoaded(graphId)) {
      WaypointManager.preloadEdgesByGraph(graphId);
      return new BuildResult(scene, new Array<>());
    }

    for (WpNode node : WaypointManager.nodes(graphId)) {
      ManagedWpNode managed = managedNodeContext.registerLoaded(ManagedWpNode.fromWpNode(managedNodeContext, node));
      NodeVisibility visibility = _classifyNode(node.gridId, scene.bounds);
      if (visibility == NodeVisibility.SKIP)
        continue;
      ResolvedNode resolvedNode = _resolvedNode(scene.bounds, managed);
      if (resolvedNode == null)
        continue;
      nodeMap.put(resolvedNode.id, resolvedNode);
      if (visibility == NodeVisibility.DRAWABLE)
        scene.drawableNodes.append(resolvedNode);
      else
        scene.hiddenNodes.append(resolvedNode);
    }

    Array<ManagedWpNode> selectedManagedNodes = managedNodeContext.takeSelectedWpNodes();

    for (WpEdge edge : WaypointManager.edgesByGraph(graphId)) {
      if (!visitedEdges.add(edge.id))
        continue;
      _appendResidentEdge(scene, edge, nodeMap);
    }

    return new BuildResult(scene, selectedManagedNodes);
  }

  private static void _appendResidentEdge(
    WaypointScene scene,
    WpEdge edge,
    HashMap<Long, ResolvedNode> nodeMap
  ) {
    Array<WpSegment> edgeSegments = WaypointManager.residentSegments(edge.id);
    if (edgeSegments == null || edgeSegments.isEmpty())
      return;
    edgeSegments.sort(Comparator.comparingInt(segment -> segment.step));

    ResolvedNode node0 = nodeMap.get(edge.node0Id);
    ResolvedNode node1 = nodeMap.get(edge.node1Id);
    Coord previousDrawableTailWorld = null;
    Integer previousResidentStep = null;
    WpSegment lastResidentSegment = null;

    for (WpSegment segment : edgeSegments) {
      lastResidentSegment = segment;
      boolean segmentInRender = scene.bounds.renderContainsGridId(segment.gridId);
      Array<WpPoint> segmentPoints = WaypointManager.residentPoints(segment.id);
      segmentPoints.sort(Comparator.comparingInt(point -> point.step));

      Coord firstDrawablePointWorld = null;
      Coord lastDrawablePointWorld = null;
      Coord previousDrawablePointWorld = null;

      if (segmentPoints != null) {
        for (WpPoint point : segmentPoints) {
          haven.Coord world = scene.bounds.worldOfGridLocal(point.gridId, point.localX, point.localY);
          if (world == null)
            continue;
          ResolvedPoint resolvedPoint = new ResolvedPoint(
            point.segmentId,
            point.gridId,
            point.step,
            point.localX,
            point.localY,
            point.mouseButton,
            point.meshId,
            world
          );

          if (segmentInRender) {
            scene.drawablePoints.append(resolvedPoint);
            if (firstDrawablePointWorld == null)
              firstDrawablePointWorld = world;
            if (previousDrawablePointWorld != null)
              scene.drawableLines.append(new ResolvedLine(previousDrawablePointWorld, world));
            previousDrawablePointWorld = world;
            lastDrawablePointWorld = world;
          } else {
            scene.hiddenPoints.append(resolvedPoint);
          }
        }
      }

      if (firstDrawablePointWorld != null) {
        if (previousDrawableTailWorld != null && previousResidentStep != null && segment.step == previousResidentStep + 1)
          scene.drawableLines.append(new ResolvedLine(previousDrawableTailWorld, firstDrawablePointWorld));
        else if (previousResidentStep == null && node0 != null)
          scene.drawableLines.append(new ResolvedLine(node0.world, firstDrawablePointWorld));
        previousDrawableTailWorld = lastDrawablePointWorld;
        previousResidentStep = segment.step;
        continue;
      }

      if (segmentInRender && (segmentPoints == null || segmentPoints.isEmpty()) && edgeSegments.size() == 1 && node0 != null && node1 != null)
        scene.drawableLines.append(new ResolvedLine(node0.world, node1.world));
    }

    if (previousDrawableTailWorld != null && node1 != null && lastResidentSegment != null &&
      lastResidentSegment.gridId == node1.gridId)
      scene.drawableLines.append(new ResolvedLine(previousDrawableTailWorld, node1.world));
  }

  private static NodeVisibility _classifyNode(long gridId, WaypointGridBounds bounds) {
    if (bounds.renderContainsGridId(gridId))
      return NodeVisibility.DRAWABLE;
    if (bounds.loadContainsGridId(gridId))
      return NodeVisibility.HIDDEN;
    return NodeVisibility.SKIP;
  }

  private static ResolvedNode _resolvedNode(WaypointGridBounds bounds, ManagedWpNode node) {
    haven.Coord world = bounds.worldOfGridLocal(node.gridId(), node.localX(), node.localY());
    if (world == null)
      return null;
    return new ResolvedNode(
      node.id,
      node.name(),
      node.graphId(),
      node.gridId(),
      node.localX(),
      node.localY(),
      world
    );
  }

  public static final class BuildResult {
    public final WaypointScene scene;
    public final Array<ManagedWpNode> selectedManagedNodes;

    BuildResult(WaypointScene scene, Array<ManagedWpNode> selectedManagedNodes) {
      this.scene = scene;
      this.selectedManagedNodes = selectedManagedNodes;
    }
  }

  private enum NodeVisibility {
    DRAWABLE,
    HIDDEN,
    SKIP
  }
}
