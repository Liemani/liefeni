package lmi.waypoint.runtime;

import haven.Coord;
import lmi.Array;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;

import java.util.HashMap;
import java.util.HashSet;

public final class WaypointSceneBuilder {
  private WaypointSceneBuilder() {}

  public static BuildResult build(
    WaypointCalibrationState calibration,
    Coord selfWorld,
    ManagedObjectContext managedNodeContext
  ) {
    WaypointScene scene = new WaypointScene(WaypointCutBounds.aroundWorld(selfWorld));
    managedNodeContext.clear();

    if (!calibration.isCalibrated())
      return new BuildResult(scene, new Array<>());

    HashSet<Long> visitedEdges = new HashSet<>();
    HashMap<Long, ResolvedNode> nodeMap = new HashMap<>();

    long graphId = calibration.graphId();
    if (!WaypointManager.nodesLoaded(graphId)) {
      WaypointManager.preloadNodes(graphId);
      return new BuildResult(scene, new Array<>());
    }

    for (WpNode node : WaypointManager.nodes(graphId)) {
      ManagedWpNode managed = managedNodeContext.registerLoaded(ManagedWpNode.fromWpNode(managedNodeContext, node));
      ResolvedNode resolvedNode = _resolvedNode(calibration, managed);
      NodeVisibility visibility = _classifyNode(resolvedNode.world, scene.bounds);
      if (visibility == NodeVisibility.SKIP)
        continue;
      nodeMap.put(resolvedNode.id, resolvedNode);
      if (visibility == NodeVisibility.DRAWABLE)
        scene.drawableNodes.append(resolvedNode);
      else
        scene.hiddenNodes.append(resolvedNode);
    }

    Array<ManagedWpNode> selectedManagedNodes = managedNodeContext.takeSelectedWpNodes();

    for (ResolvedNode node : scene.drawableNodes)
      _appendEdgePoints(calibration, scene, node.id, nodeMap, visitedEdges);
    for (ResolvedNode node : scene.hiddenNodes)
      _appendEdgePoints(calibration, scene, node.id, nodeMap, visitedEdges);

    return new BuildResult(scene, selectedManagedNodes);
  }

  private static void _appendEdgePoints(
    WaypointCalibrationState calibration,
    WaypointScene scene,
    long nodeId,
    HashMap<Long, ResolvedNode> nodeMap,
    HashSet<Long> visitedEdges
  ) {
    if (!WaypointManager.edgesLoaded(nodeId)) {
      WaypointManager.preloadEdges(nodeId);
      return;
    }

    for (WpEdge edge : WaypointManager.edges(nodeId)) {
      if (!visitedEdges.add(edge.id))
        continue;

      ResolvedNode node0 = nodeMap.get(edge.node0Id);
      ResolvedNode node1 = nodeMap.get(edge.node1Id);

      if (!WaypointManager.segmentsLoaded(edge.id)) {
        WaypointManager.preloadSegments(edge.id);
        continue;
      }

      for (WpSegment segment : WaypointManager.segments(edge.id)) {
        Coord firstDrawablePointWorld = null;
        Coord lastDrawablePointWorld = null;
        Coord previousDrawablePointWorld = null;

        if (!WaypointManager.pointsLoaded(segment.id)) {
          WaypointManager.preloadPoints(segment.id);
          continue;
        }

        for (WpPoint point : WaypointManager.points(segment.id)) {
          Coord world = calibration.worldOfVir(point.virX, point.virY);
          Coord pointCut = scene.bounds.cutOfWorld(world);
          boolean inLoad = scene.bounds.loadArea.contains(pointCut);
          boolean inRender = scene.bounds.renderArea.contains(pointCut);

          if (!inLoad)
            continue;

          ResolvedPoint resolvedPoint = new ResolvedPoint(
            point.segmentId,
            point.step,
            point.virX,
            point.virY,
            point.mouseButton,
            point.meshId,
            world
          );

          if (inRender) {
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

        if (firstDrawablePointWorld != null && node0 != null)
          scene.drawableLines.append(new ResolvedLine(node0.world, firstDrawablePointWorld));
        if (lastDrawablePointWorld != null && node1 != null)
          scene.drawableLines.append(new ResolvedLine(lastDrawablePointWorld, node1.world));
      }
    }
  }

  private static NodeVisibility _classifyNode(Coord world, WaypointCutBounds bounds) {
    Coord cut = bounds.cutOfWorld(world);
    if (bounds.renderArea.contains(cut))
      return NodeVisibility.DRAWABLE;
    if (bounds.loadArea.contains(cut))
      return NodeVisibility.HIDDEN;
    return NodeVisibility.SKIP;
  }

  private static ResolvedNode _resolvedNode(WaypointCalibrationState calibration, ManagedWpNode node) {
    Coord world = calibration.worldOfVir(node.virX(), node.virY());
    return new ResolvedNode(
      node.id,
      node.name(),
      node.graphId(),
      node.nodeRefId(),
      node.virX(),
      node.virY(),
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
