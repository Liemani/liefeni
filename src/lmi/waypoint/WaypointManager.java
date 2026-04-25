package lmi.waypoint;

import haven.Coord;
import haven.Gob;
import lmi.AppContext;
import lmi.Array;
import lmi.Self;

public final class WaypointManager {
  private static final int RANGE = 30 * 1024;

  private static Long resolvedGobId;
  private static Array<ResolvedNode> nearbyNodes = new Array<>();
  private static Array<ResolvedGob> nearbyGobs = new Array<>();
  private static Array<ResolvedPoint> nearbyPoints = new Array<>();

  private WaypointManager() {}

  public static void clear() {
    resolvedGobId = null;
    nearbyNodes = new Array<>();
    nearbyGobs = new Array<>();
    nearbyPoints = new Array<>();
  }

  public static boolean resolve(long gobId) {
    WaypointDatabase.GobRecord record = WaypointDatabase.findGob(gobId);
    if (record == null) return false;

    resolvedGobId = gobId;
    refresh();
    return true;
  }

  public static boolean isResolved() {
    return resolvedGobId != null;
  }

  public static Long resolvedGobId() {
    return resolvedGobId;
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

  public static void refresh() {
    nearbyNodes = new Array<>();
    nearbyGobs = new Array<>();
    nearbyPoints = new Array<>();

    if (resolvedGobId == null) return;

    WaypointDatabase.GobRecord resolvedRecord = WaypointDatabase.findGob(resolvedGobId);
    Gob resolvedGob = AppContext.oCache().getgob(resolvedGobId);
    if (resolvedRecord == null || resolvedGob == null) return;

    Coord resolvedWorld = resolvedGob.position();
    Coord selfWorld = Self.position();
    int currentRelX = resolvedRecord.relX + (selfWorld.x - resolvedWorld.x);
    int currentRelY = resolvedRecord.relY + (selfWorld.y - resolvedWorld.y);

    for (WaypointDatabase.NodeRecord node : WaypointDatabase.loadNearbyNodes(
      resolvedRecord.rootNodeId, currentRelX, currentRelY, RANGE)) {
      Coord world = _world(resolvedWorld, resolvedRecord.relX, resolvedRecord.relY, node.relX, node.relY);
      nearbyNodes.append(new ResolvedNode(node.id, node.name, node.rootNodeId, node.gobId, node.relX, node.relY, world));
    }

    for (WaypointDatabase.GobRecord gob : WaypointDatabase.loadNearbyGobs(
      resolvedRecord.rootNodeId, currentRelX, currentRelY, RANGE)) {
      Coord world = _world(resolvedWorld, resolvedRecord.relX, resolvedRecord.relY, gob.relX, gob.relY);
      nearbyGobs.append(new ResolvedGob(gob.id, gob.nodeId, gob.rootNodeId, gob.relX, gob.relY, gob.resname, world));
    }

    for (WaypointDatabase.PointRecord point : WaypointDatabase.loadPointsByRootNode(resolvedRecord.rootNodeId)) {
      int pointRelX = point.baseRelX + point.relX;
      int pointRelY = point.baseRelY + point.relY;
      if (Math.abs(pointRelX - currentRelX) > RANGE) continue;
      if (Math.abs(pointRelY - currentRelY) > RANGE) continue;

      Coord world = _world(resolvedWorld, resolvedRecord.relX, resolvedRecord.relY, pointRelX, pointRelY);
      nearbyPoints.append(new ResolvedPoint(
        point.segmentId, point.pointIdx, point.baseGobId, point.baseRootNodeId,
        pointRelX, pointRelY, point.mouseButton, point.gobId, point.meshId, world));
    }
  }

  private static Coord _world(Coord resolvedWorld, int resolvedRelX, int resolvedRelY, int targetRelX, int targetRelY) {
    return resolvedWorld.add(targetRelX - resolvedRelX, targetRelY - resolvedRelY);
  }

  public static final class ResolvedNode {
    public final long id;
    public final String name;
    public final long rootNodeId;
    public final long gobId;
    public final int relX;
    public final int relY;
    public final Coord world;

    ResolvedNode(long id, String name, long rootNodeId, long gobId, int relX, int relY, Coord world) {
      this.id = id;
      this.name = name;
      this.rootNodeId = rootNodeId;
      this.gobId = gobId;
      this.relX = relX;
      this.relY = relY;
      this.world = world;
    }
  }

  public static final class ResolvedGob {
    public final long id;
    public final long nodeId;
    public final long rootNodeId;
    public final int relX;
    public final int relY;
    public final String resname;
    public final Coord world;

    ResolvedGob(long id, long nodeId, long rootNodeId, int relX, int relY, String resname, Coord world) {
      this.id = id;
      this.nodeId = nodeId;
      this.rootNodeId = rootNodeId;
      this.relX = relX;
      this.relY = relY;
      this.resname = resname;
      this.world = world;
    }
  }

  public static final class ResolvedPoint {
    public final long segmentId;
    public final int pointIdx;
    public final long baseGobId;
    public final long baseRootNodeId;
    public final int relX;
    public final int relY;
    public final int mouseButton;
    public final Long gobId;
    public final Integer meshId;
    public final Coord world;

    ResolvedPoint(long segmentId, int pointIdx, long baseGobId, long baseRootNodeId,
                  int relX, int relY, int mouseButton, Long gobId, Integer meshId, Coord world) {
      this.segmentId = segmentId;
      this.pointIdx = pointIdx;
      this.baseGobId = baseGobId;
      this.baseRootNodeId = baseRootNodeId;
      this.relX = relX;
      this.relY = relY;
      this.mouseButton = mouseButton;
      this.gobId = gobId;
      this.meshId = meshId;
      this.world = world;
    }
  }
}
