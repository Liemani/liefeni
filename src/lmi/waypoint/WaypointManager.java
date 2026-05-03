package lmi.waypoint;

import haven.Coord;
import haven.Gob;
import lmi.Array;
import lmi.Api;
import lmi.Self;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.object.WpAnchor;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPortal;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.runtime.ResolvedNode;
import lmi.waypoint.runtime.ResolvedPoint;
import lmi.waypoint.runtime.WaypointCutBounds;
import lmi.waypoint.runtime.WaypointScene;

import java.util.HashSet;
import lmi.Rect;

public final class WaypointManager {
  private static final ManagedObjectContext managedNodeContext = new ManagedObjectContext();

  private static Long calibrationGraphId;
  private static Coord calibrationVir = Coord.z;
  private static Coord calibrationWorld = Coord.z;
  private static Gob calibrationGob;
  private static WaypointScene scene = new WaypointScene(WaypointCutBounds.aroundWorld(Coord.z));
  private static Array<ResolvedNode> nearbyNodes = new Array<>();
  private static Array<ResolvedPoint> nearbyPoints = new Array<>();
  private static Array<ManagedWpNode> selectedManagedNodes = new Array<>();

  private WaypointManager() {}

  public static void clear() {
    calibrationGraphId = null;
    calibrationVir = Coord.z;
    calibrationWorld = Coord.z;
    calibrationGob = null;
    scene = new WaypointScene(WaypointCutBounds.aroundWorld(Coord.z));
    managedNodeContext.clear();
    nearbyNodes = new Array<>();
    nearbyPoints = new Array<>();
    selectedManagedNodes = new Array<>();
  }

  public static boolean calibrate(Rect area) {
    if (area == null) {
      Api.message("[WaypointManager.calibrate] area is null");
      return false;
    }

    Array<WpAnchor> anchors = WaypointStore.loadAnchors();
    Api.message("[WaypointManager.calibrate] selected area=" + area);
    Api.message("[WaypointManager.calibrate] anchor count=" + anchors.count());
    if (anchors.isEmpty())
      return false;

    WpAnchor anchor = anchors.first();
    calibrationGraphId = anchor.graphId;
    calibrationVir = Coord.of(anchor.virX, anchor.virY);
    calibrationWorld = area.origin.tileMin();
    calibrationGob = null;
    refresh();
    Api.message("[WaypointManager.calibrate] success graphId=" + calibrationGraphId + " world=" + calibrationWorld + " vir=" + calibrationVir);
    return true;
  }

  public static boolean calibrate(Gob gob) {
    if (gob == null) {
      Api.message("[WaypointManager.calibrate] gob is null");
      return false;
    }

    Api.message("[WaypointManager.calibrate] gob.id=" + gob.id() + " resname=" + gob.resourceName() + " world=" + gob.position());
    if (calibrationGraphId == null) {
      Api.message("[WaypointManager.calibrate] current graph is null");
      return false;
    }

    for (WpPortal portal : WaypointStore.loadPortalsByGraph(calibrationGraphId)) {
      for (WpPortal counterpart : WaypointStore.findCounterpartPortals(portal.id)) {
        if (!counterpart.resname.contentEquals(gob.resourceName()))
          continue;

        calibrationGraphId = counterpart.graphId;
        calibrationVir = Coord.of(counterpart.virX, counterpart.virY);
        calibrationWorld = gob.position();
        calibrationGob = gob;
        refresh();
        Api.message("[WaypointManager.calibrate] success graphId=" + calibrationGraphId + " world=" + calibrationWorld + " vir=" + calibrationVir);
        return true;
      }
    }

    Api.message("[WaypointManager.calibrate] no counterpart portal matched");
    return false;
  }

  public static boolean isCalibrated() {
    return calibrationGraphId != null;
  }

  public static Gob calibrationGob() {
    return calibrationGob;
  }

  public static Long calibrationGraphId() {
    return calibrationGraphId;
  }

  public static Coord calibrationVir() {
    return Coord.of(calibrationVir);
  }

  public static Coord calibrationWorld() {
    return Coord.of(calibrationWorld);
  }

  public static Coord virOfWorld(Coord world) {
    if (calibrationGraphId == null)
      return null;
    return _virOfWorld(calibrationVir, calibrationWorld, world);
  }

  public static Array<ResolvedNode> nearbyNodes() {
    return nearbyNodes;
  }

  public static Array<ResolvedPoint> nearbyPoints() {
    return nearbyPoints;
  }

  public static Array<ManagedWpNode> selectedManagedNodes() {
    return selectedManagedNodes;
  }

  public static WaypointScene scene() {
    return scene;
  }

  public static Array<String> debugLines() {
    Array<String> lines = new Array<>();
    lines.append("isCalibrated: " + isCalibrated());

    if (calibrationGraphId == null) {
      lines.append("calibrationGraphId: null");
      lines.append(_sceneSummary());
      return lines;
    }

    lines.append("calibrationGraphId: " + calibrationGraphId);
    lines.append("calibrationVir: " + calibrationVir);
    lines.append("calibrationWorld: " + calibrationWorld);
    lines.append("calibrationGob: " + calibrationGob);
    lines.append("self.world: " + Self.position());

    Coord currentVir = _virOfWorld(calibrationVir, calibrationWorld, Self.position());
    lines.append("self.vir: " + currentVir);
    lines.append("scene.centerCut: " + scene.bounds.centerCut);
    lines.append("scene.renderArea: " + scene.bounds.renderArea);
    lines.append("scene.loadArea: " + scene.bounds.loadArea);
    lines.append(_sceneSummary());

    for (int i = 0; i < Math.min(3, scene.drawableNodes.count()); ++i) {
      ResolvedNode node = scene.drawableNodes.get(i);
      lines.append("drawableNode[" + i + "]: id=" + node.id + " name=" + node.name + " vir=(" + node.virX + ", " + node.virY + ") world=" + node.world);
    }
    for (int i = 0; i < Math.min(3, scene.hiddenNodes.count()); ++i) {
      ResolvedNode node = scene.hiddenNodes.get(i);
      lines.append("hiddenNode[" + i + "]: id=" + node.id + " name=" + node.name + " vir=(" + node.virX + ", " + node.virY + ") world=" + node.world);
    }

    return lines;
  }

  public static ResolvedNode nearestNode() {
    ResolvedNode nearest = null;
    long best = Long.MAX_VALUE;
    Coord self = Self.position();

    for (ResolvedNode node : nearbyNodes) {
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
    scene = new WaypointScene(WaypointCutBounds.aroundWorld(Self.position()));
    nearbyNodes = new Array<>();
    nearbyPoints = new Array<>();
    selectedManagedNodes = new Array<>();
    managedNodeContext.clear();

    if (calibrationGraphId == null) return;

    scene = new WaypointScene(WaypointCutBounds.aroundWorld(Self.position()));
    _buildScene();
    nearbyNodes = scene.drawableNodes;
    nearbyPoints = scene.drawablePoints;
  }

  public static void refreshSceneIfBoundsChanged() {
    if (calibrationGraphId == null) return;
    WaypointCutBounds nextBounds = WaypointCutBounds.aroundWorld(Self.position());
    if (!_sameBounds(scene.bounds, nextBounds))
      refresh();
  }

  private static Coord _world(Coord calibrationWorld, Coord calibrationVir, int targetVirX, int targetVirY) {
    return calibrationWorld.add(targetVirX - calibrationVir.x, targetVirY - calibrationVir.y);
  }

  private static Coord _virOfWorld(Coord calibrationVir, Coord calibrationWorld, Coord world) {
    return Coord.of(
      calibrationVir.x + (world.x - calibrationWorld.x),
      calibrationVir.y + (world.y - calibrationWorld.y)
    );
  }

  private static void _buildScene() {
    HashSet<Long> visitedEdges = new HashSet<>();

    for (WpNode node : WaypointStore.loadNodesByGraph(calibrationGraphId)) {
      ManagedWpNode managed = managedNodeContext.registerLoaded(ManagedWpNode.fromWpNode(managedNodeContext, node));
      ResolvedNode resolvedNode = _resolvedNode(managed);
      NodeVisibility visibility = _classifyNode(resolvedNode.world, scene.bounds);
      if (visibility == NodeVisibility.SKIP) continue;
      if (visibility == NodeVisibility.DRAWABLE) scene.drawableNodes.append(resolvedNode);
      else scene.hiddenNodes.append(resolvedNode);
    }

    selectedManagedNodes = managedNodeContext.takeSelectedWpNodes();

    for (ResolvedNode node : scene.drawableNodes) {
      _appendEdgePoints(node.id, visitedEdges);
    }
    for (ResolvedNode node : scene.hiddenNodes) {
      _appendEdgePoints(node.id, visitedEdges);
    }
  }

  private static void _appendEdgePoints(long nodeId, HashSet<Long> visitedEdges) {
    for (WpEdge edge : WaypointStore.loadEdgesByNode(nodeId)) {
      if (!visitedEdges.add(edge.id))
        continue;

      for (lmi.waypoint.object.WpSegment segment : WaypointStore.loadSegmentsByEdge(edge.id)) {
      for (WpPoint point : WaypointStore.loadPointsBySegment(segment.id)) {
        Coord world = _world(calibrationWorld, calibrationVir, point.virX, point.virY);
        Coord pointCut = scene.bounds.cutOfWorld(world);
        boolean inLoad = scene.bounds.loadArea.contains(pointCut);
        boolean inRender = scene.bounds.renderArea.contains(pointCut);

        if (!inLoad) continue;

        ResolvedPoint resolvedPoint = new ResolvedPoint(
          point.segmentId,
          point.step,
          point.virX,
          point.virY,
          point.mouseButton,
          point.meshId,
          world
        );

        if (inRender)
          scene.drawablePoints.append(resolvedPoint);
        else
          scene.hiddenPoints.append(resolvedPoint);
      }
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

  private static ResolvedNode _resolvedNode(ManagedWpNode node) {
    Coord world = _world(calibrationWorld, calibrationVir, node.virX(), node.virY());
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

  private static boolean _sameBounds(WaypointCutBounds a, WaypointCutBounds b) {
    return a.centerCut.equals(b.centerCut);
  }

  private static String _sceneSummary() {
    return "scene drawableNodes=" + scene.drawableNodes.count() +
           " hiddenNodes=" + scene.hiddenNodes.count() +
           " drawablePoints=" + scene.drawablePoints.count() +
           " hiddenPoints=" + scene.hiddenPoints.count() +
           " selectedManagedNodes=" + selectedManagedNodes.count();
  }

  private enum NodeVisibility {
    DRAWABLE,
    HIDDEN,
    SKIP
  }

}
