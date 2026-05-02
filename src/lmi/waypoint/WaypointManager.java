package lmi.waypoint;

import haven.Coord;
import haven.Gob;
import haven.MapView;
import lmi.Array;
import lmi.Api;
import lmi.AppContext;
import lmi.Self;
import lmi.waypoint.managed.ManagedObjectContext;
import lmi.waypoint.managed.ManagedWpNode;
import lmi.waypoint.object.GobNode;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.runtime.ResolvedGob;
import lmi.waypoint.runtime.ResolvedNode;
import lmi.waypoint.runtime.ResolvedPoint;
import lmi.waypoint.runtime.WaypointCutBounds;
import lmi.waypoint.runtime.WaypointScene;

import java.util.ArrayDeque;
import java.util.HashSet;

public final class WaypointManager {
  private static final ManagedObjectContext managedNodeContext = new ManagedObjectContext();

  private static Gob calibrationGob;
  private static WaypointScene scene = new WaypointScene(WaypointCutBounds.aroundWorld(Coord.z));
  private static Array<ResolvedNode> nearbyNodes = new Array<>();
  private static Array<ResolvedGob> nearbyGobs = new Array<>();
  private static Array<ResolvedPoint> nearbyPoints = new Array<>();
  private static Array<ManagedWpNode> selectedManagedNodes = new Array<>();

  private WaypointManager() {}

  public static void clear() {
    calibrationGob = null;
    scene = new WaypointScene(WaypointCutBounds.aroundWorld(Coord.z));
    managedNodeContext.clear();
    nearbyNodes = new Array<>();
    nearbyGobs = new Array<>();
    nearbyPoints = new Array<>();
    selectedManagedNodes = new Array<>();
  }

  public static boolean calibrate(Gob gob) {
    if (gob == null) return false;

    GobNode record = WaypointStore.findGob(gob.id());
    if (record == null) return false;

    calibrationGob = gob;
    refresh();
    return true;
  }

  public static boolean isCalibrated() {
    return calibrationGob != null;
  }

  public static Gob calibrationGob() {
    return calibrationGob;
  }

  public static Array<ResolvedNode> nearbyNodes() {
    return nearbyNodes;
  }

  public static Array<ResolvedGob> nearbyGobs() {
    return nearbyGobs;
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

    if (calibrationGob == null) {
      lines.append("calibrationGob: null");
      lines.append(_sceneSummary());
      return lines;
    }

    lines.append("calibrationGob.id: " + calibrationGob.id());
    lines.append("calibrationGob.resname: " + calibrationGob.resourceName());
    lines.append("calibrationGob.world: " + calibrationGob.position());
    lines.append("self.world: " + Self.position());

    GobNode calibrationRecord = WaypointStore.findGob(calibrationGob.id());
    if (calibrationRecord == null) {
      lines.append("calibrationGobRecord: null");
      lines.append(_sceneSummary());
      return lines;
    }

    lines.append("calibrationGobRecord.graphId: " + calibrationRecord.graphId);
    lines.append("calibrationGobRecord.vir: (" + calibrationRecord.virX + ", " + calibrationRecord.virY + ")");
    lines.append("calibrationGobRecord.wpNodeId: " + calibrationRecord.wpNodeId);

    Coord currentVir = _virOfWorld(calibrationRecord, calibrationGob.position(), Self.position());
    lines.append("self.vir: " + currentVir);
    lines.append("scene.centerCut: " + scene.bounds.centerCut);
    lines.append("scene.renderArea: " + scene.bounds.renderArea);
    lines.append("scene.loadArea: " + scene.bounds.loadArea);
    lines.append(_sceneSummary());

    if (calibrationRecord.wpNodeId != null) {
      WpNode startNode = WaypointStore.findNode(calibrationRecord.wpNodeId);
      if (startNode == null) {
        lines.append("startWpNode: null");
      } else {
        lines.append("startWpNode.id: " + startNode.id);
        lines.append("startWpNode.vir: (" + startNode.virX + ", " + startNode.virY + ")");
        lines.append("startWpNode.gobGraphId: " + startNode.gobGraphId);
        lines.append("startWpNode.gobNodeId: " + startNode.gobNodeId);
      }
    }

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

  public static ResolvedGob nearbyGob(long gobId) {
    for (ResolvedGob gob : nearbyGobs) {
      if (gob.id == gobId) return gob;
    }
    return null;
  }

  public static void refresh() {
    scene = new WaypointScene(WaypointCutBounds.aroundWorld(Self.position()));
    nearbyNodes = new Array<>();
    nearbyGobs = new Array<>();
    nearbyPoints = new Array<>();
    selectedManagedNodes = new Array<>();

    if (calibrationGob == null) return;

    GobNode resolvedRecord = WaypointStore.findGob(calibrationGob.id());
    if (resolvedRecord == null) return;
    if (resolvedRecord.wpNodeId == null) return;

    Coord resolvedWorld = calibrationGob.position();
    scene = new WaypointScene(WaypointCutBounds.aroundWorld(Self.position()));
    _buildScene(resolvedRecord, resolvedWorld);
    selectedManagedNodes = managedNodeContext.takeSelectedWpNodes();
    nearbyNodes = scene.drawableNodes;
    nearbyPoints = scene.drawablePoints;
  }

  public static void tick(MapView mapView) {
    if (calibrationGob == null) return;

    Gob liveCalibrationGob = AppContext.oCache().getgob(calibrationGob.id());
    if (liveCalibrationGob == null) {
      if (!_tryRecalibrateAtPortal())
        clear();
      return;
    }
    calibrationGob = liveCalibrationGob;

    GobNode calibrationRecord = WaypointStore.findGob(calibrationGob.id());
    if (calibrationRecord == null) {
      clear();
      return;
    }

    WaypointCutBounds nextBounds = WaypointCutBounds.aroundWorld(Self.position());
    if (!_sameBounds(scene.bounds, nextBounds))
      refresh();
  }

  private static Coord _world(Coord resolvedWorld, int resolvedRelX, int resolvedRelY, int targetRelX, int targetRelY) {
    return resolvedWorld.add(targetRelX - resolvedRelX, targetRelY - resolvedRelY);
  }

  private static Coord _virOfWorld(GobNode calibrationRecord, Coord calibrationWorld, Coord world) {
    return Coord.of(
      calibrationRecord.virX + (world.x - calibrationWorld.x),
      calibrationRecord.virY + (world.y - calibrationWorld.y)
    );
  }

  private static void _buildScene(GobNode calibrationRecord, Coord calibrationWorld) {
    HashSet<Long> visitedNodes = new HashSet<>();
    HashSet<Long> visitedEdges = new HashSet<>();
    HashSet<Long> visibleGobIds = new HashSet<>();
    ArrayDeque<NodeVisit> queue = new ArrayDeque<>();
    queue.add(new NodeVisit(calibrationRecord.wpNodeId, false));

    while (!queue.isEmpty()) {
      NodeVisit visit = queue.removeFirst();
      if (visitedNodes.contains(visit.wpNodeId))
        continue;

      ManagedWpNode node = WaypointStore.findManagedNode(managedNodeContext, visit.wpNodeId);
      if (node == null)
        continue;

      ResolvedNode resolvedNode = _resolvedNode(calibrationRecord, calibrationWorld, node);
      NodeVisibility visibility = _classifyNode(node, resolvedNode.world, calibrationRecord.graphId, scene.bounds, visit.terminal);
      if (visibility == NodeVisibility.SKIP)
        continue;

      visitedNodes.add(node.id);
      if (visibility == NodeVisibility.DRAWABLE) {
        scene.drawableNodes.append(resolvedNode);
        _appendGob(visibleGobIds, calibrationRecord, calibrationWorld, node.gobNodeId());
      } else {
        scene.hiddenNodes.append(resolvedNode);
      }

      for (WpEdge edge : WaypointStore.loadEdgesByNode(node.id)) {
        if (visitedEdges.add(edge.id))
          _appendEdgePoints(edge, visit, calibrationRecord, calibrationWorld);

        if (visit.terminal)
          continue;

        long nextNodeId = edge.otherNodeId(node.id);
        if (nextNodeId < 0 || visitedNodes.contains(nextNodeId))
          continue;

        if (visibility == NodeVisibility.HIDDEN)
          queue.addLast(new NodeVisit(nextNodeId, true));
        else
          queue.addLast(new NodeVisit(nextNodeId, false));
      }
    }
  }

  private static void _appendEdgePoints(WpEdge edge, NodeVisit visit, GobNode calibrationRecord, Coord calibrationWorld) {
    for (lmi.waypoint.object.WpSegment segment : WaypointStore.loadSegmentsByEdge(edge.id)) {
      for (WpPoint point : WaypointStore.loadPointsBySegment(segment.id)) {
        boolean sameGraph = (segment.gobGraphId == calibrationRecord.graphId);
        Coord world = _world(calibrationWorld, calibrationRecord.virX, calibrationRecord.virY, point.virX, point.virY);
        Coord pointCut = scene.bounds.cutOfWorld(world);
        boolean inLoad = scene.bounds.loadArea.contains(pointCut);
        boolean inRender = scene.bounds.renderArea.contains(pointCut);

        if (sameGraph && !inLoad && !visit.terminal)
          continue;

        ResolvedPoint resolvedPoint = new ResolvedPoint(
          point.segmentId,
          point.step,
          point.virX,
          point.virY,
          point.mouseButton,
          point.gobId,
          point.meshId,
          world
        );

        if (sameGraph && inRender)
          scene.drawablePoints.append(resolvedPoint);
        else
          scene.hiddenPoints.append(resolvedPoint);
      }
    }
  }

  private static NodeVisibility _classifyNode(ManagedWpNode node, Coord world, long calibrationGraphId, WaypointCutBounds bounds, boolean terminal) {
    if (node.gobGraphId() != calibrationGraphId)
      return NodeVisibility.HIDDEN;

    Coord cut = bounds.cutOfWorld(world);
    if (bounds.renderArea.contains(cut))
      return NodeVisibility.DRAWABLE;
    if (bounds.loadArea.contains(cut) || terminal)
      return NodeVisibility.HIDDEN;
    return NodeVisibility.SKIP;
  }

  private static ResolvedNode _resolvedNode(GobNode calibrationRecord, Coord calibrationWorld, ManagedWpNode node) {
    Coord world = _world(calibrationWorld, calibrationRecord.virX, calibrationRecord.virY, node.virX(), node.virY());
    return new ResolvedNode(
      node.id,
      node.name(),
      node.gobGraphId(),
      node.gobNodeId(),
      node.virX(),
      node.virY(),
      world
    );
  }

  private static void _appendGob(HashSet<Long> visibleGobIds, GobNode calibrationRecord, Coord calibrationWorld, long gobId) {
    if (!visibleGobIds.add(gobId))
      return;

    GobNode gob = WaypointStore.findGob(gobId);
    if (gob == null)
      return;

    Coord world = _world(calibrationWorld, calibrationRecord.virX, calibrationRecord.virY, gob.virX, gob.virY);
    nearbyGobs.append(new ResolvedGob(gob.id, gob.wpNodeId, gob.graphId, gob.virX, gob.virY, gob.resname, world));
  }

  private static boolean _sameBounds(WaypointCutBounds a, WaypointCutBounds b) {
    return a.centerCut.equals(b.centerCut);
  }

  private static String _sceneSummary() {
    return "scene drawableNodes=" + scene.drawableNodes.count() +
           " hiddenNodes=" + scene.hiddenNodes.count() +
           " drawablePoints=" + scene.drawablePoints.count() +
           " hiddenPoints=" + scene.hiddenPoints.count() +
           " nearbyGobs=" + nearbyGobs.count() +
           " selectedManagedNodes=" + selectedManagedNodes.count();
  }

  private static boolean _tryRecalibrateAtPortal() {
    Gob nearestPortal = null;
    double best = Double.MAX_VALUE;

    for (Gob gob : Api.gobArray()) {
      if (!WaypointPortal.isPortalResname(gob.resourceName()))
        continue;
      if (WaypointStore.findGob(gob.id()) == null)
        continue;

      double distance = Self.distance(gob);
      if (distance < best) {
        best = distance;
        nearestPortal = gob;
      }
    }

    return calibrate(nearestPortal);
  }

  private static final class NodeVisit {
    private final long wpNodeId;
    private final boolean terminal;

    private NodeVisit(long wpNodeId, boolean terminal) {
      this.wpNodeId = wpNodeId;
      this.terminal = terminal;
    }
  }

  private enum NodeVisibility {
    DRAWABLE,
    HIDDEN,
    SKIP
  }

}
