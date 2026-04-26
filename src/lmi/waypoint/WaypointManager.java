package lmi.waypoint;

import haven.Coord;
import haven.Gob;
import lmi.Array;
import lmi.Self;

public final class WaypointManager {
  private static final int RANGE = 30 * 1024;

  private static Gob resolvedGob;
  private static Array<ResolvedNode> nearbyNodes = new Array<>();
  private static Array<ResolvedGob> nearbyGobs = new Array<>();
  private static Array<ResolvedPoint> nearbyPoints = new Array<>();

  private WaypointManager() {}

  public static void clear() {
    resolvedGob = null;
    nearbyNodes = new Array<>();
    nearbyGobs = new Array<>();
    nearbyPoints = new Array<>();
  }

  public static boolean resolve(Gob gob) {
    if (gob == null) return false;

    WaypointDatabase.GobNodeRecord record = WaypointDatabase.findGob(gob.id());
    if (record == null) return false;

    resolvedGob = gob;
    refresh();
    return true;
  }

  public static boolean isResolved() {
    return resolvedGob != null;
  }

  public static Gob resolvedGob() {
    return resolvedGob;
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
    nearbyNodes = new Array<>();
    nearbyGobs = new Array<>();
    nearbyPoints = new Array<>();

    if (resolvedGob == null) return;

    WaypointDatabase.GobNodeRecord resolvedRecord = WaypointDatabase.findGob(resolvedGob.id());
    if (resolvedRecord == null) return;

    Coord resolvedWorld = resolvedGob.position();
    Coord selfWorld = Self.position();
    int currentVirX = resolvedRecord.virX + (selfWorld.x - resolvedWorld.x);
    int currentVirY = resolvedRecord.virY + (selfWorld.y - resolvedWorld.y);

    for (WaypointDatabase.WpNodeRecord node : WaypointDatabase.loadNearbyNodes(
      resolvedRecord.graphId, currentVirX, currentVirY, RANGE)) {
      Coord world = _world(resolvedWorld, resolvedRecord.virX, resolvedRecord.virY, node.virX, node.virY);
      nearbyNodes.append(new ResolvedNode(node.id, node.name, node.gobGraphId, node.gobNodeId, node.virX, node.virY, world));
    }

    for (WaypointDatabase.GobNodeRecord gob : WaypointDatabase.loadNearbyGobs(
      resolvedRecord.graphId, currentVirX, currentVirY, RANGE)) {
      Coord world = _world(resolvedWorld, resolvedRecord.virX, resolvedRecord.virY, gob.virX, gob.virY);
      nearbyGobs.append(new ResolvedGob(gob.id, gob.wpNodeId, gob.graphId, gob.virX, gob.virY, gob.resname, world));
    }

    for (WaypointDatabase.WpPointRecord point : WaypointDatabase.loadNearbyPoints(resolvedRecord.graphId, currentVirX, currentVirY, RANGE)) {
      if (Math.abs(point.virX - currentVirX) > RANGE) continue;
      if (Math.abs(point.virY - currentVirY) > RANGE) continue;

      Coord world = _world(resolvedWorld, resolvedRecord.virX, resolvedRecord.virY, point.virX, point.virY);
      nearbyPoints.append(new ResolvedPoint(
        point.segmentId, point.step, point.virX, point.virY, point.mouseButton, point.gobId, point.meshId, world));
    }
  }

  private static Coord _world(Coord resolvedWorld, int resolvedRelX, int resolvedRelY, int targetRelX, int targetRelY) {
    return resolvedWorld.add(targetRelX - resolvedRelX, targetRelY - resolvedRelY);
  }

  public static final class ResolvedNode {
    public final long id;
    public final String name;
    public final long gobGraphId;
    public final long gobNodeId;
    public final int virX;
    public final int virY;
    public final Coord world;

    ResolvedNode(long id, String name, long gobGraphId, long gobNodeId, int virX, int virY, Coord world) {
      this.id = id;
      this.name = name;
      this.gobGraphId = gobGraphId;
      this.gobNodeId = gobNodeId;
      this.virX = virX;
      this.virY = virY;
      this.world = world;
    }
  }

  public static final class ResolvedGob {
    public final long id;
    public final Long wpNodeId;
    public final long graphId;
    public final int virX;
    public final int virY;
    public final String resname;
    public final Coord world;

    ResolvedGob(long id, Long wpNodeId, long graphId, int virX, int virY, String resname, Coord world) {
      this.id = id;
      this.wpNodeId = wpNodeId;
      this.graphId = graphId;
      this.virX = virX;
      this.virY = virY;
      this.resname = resname;
      this.world = world;
    }
  }

  public static final class ResolvedPoint {
    public final long segmentId;
    public final int step;
    public final int virX;
    public final int virY;
    public final int mouseButton;
    public final Long gobId;
    public final Integer meshId;
    public final Coord world;

    ResolvedPoint(long segmentId, int step, int virX, int virY,
                  int mouseButton, Long gobId, Integer meshId, Coord world) {
      this.segmentId = segmentId;
      this.step = step;
      this.virX = virX;
      this.virY = virY;
      this.mouseButton = mouseButton;
      this.gobId = gobId;
      this.meshId = meshId;
      this.world = world;
    }
  }
}
