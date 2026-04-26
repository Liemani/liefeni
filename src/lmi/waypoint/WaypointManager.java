package lmi.waypoint;

import haven.Coord;
import haven.Gob;
import lmi.Array;
import lmi.Self;
import lmi.waypoint.model.GobNodeRecord;
import lmi.waypoint.model.WpNodeRecord;
import lmi.waypoint.model.WpPointRecord;
import lmi.waypoint.runtime.ResolvedGob;
import lmi.waypoint.runtime.ResolvedNode;
import lmi.waypoint.runtime.ResolvedPoint;

public final class WaypointManager {
  private static final int RANGE = 30 * 1024;

  private static Gob calibrationGob;
  private static Array<ResolvedNode> nearbyNodes = new Array<>();
  private static Array<ResolvedGob> nearbyGobs = new Array<>();
  private static Array<ResolvedPoint> nearbyPoints = new Array<>();

  private WaypointManager() {}

  public static void clear() {
    calibrationGob = null;
    nearbyNodes = new Array<>();
    nearbyGobs = new Array<>();
    nearbyPoints = new Array<>();
  }

  public static boolean calibrate(Gob gob) {
    if (gob == null) return false;

    GobNodeRecord record = WaypointDatabase.findGob(gob.id());
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

    if (calibrationGob == null) return;

    GobNodeRecord resolvedRecord = WaypointDatabase.findGob(calibrationGob.id());
    if (resolvedRecord == null) return;

    Coord resolvedWorld = calibrationGob.position();
    Coord selfWorld = Self.position();
    int currentVirX = resolvedRecord.virX + (selfWorld.x - resolvedWorld.x);
    int currentVirY = resolvedRecord.virY + (selfWorld.y - resolvedWorld.y);

    for (WpNodeRecord node : WaypointDatabase.loadNearbyNodes(
      resolvedRecord.graphId, currentVirX, currentVirY, RANGE)) {
      Coord world = _world(resolvedWorld, resolvedRecord.virX, resolvedRecord.virY, node.virX, node.virY);
      nearbyNodes.append(new ResolvedNode(node.id, node.name, node.gobGraphId, node.gobNodeId, node.virX, node.virY, world));
    }

    for (GobNodeRecord gob : WaypointDatabase.loadNearbyGobs(
      resolvedRecord.graphId, currentVirX, currentVirY, RANGE)) {
      Coord world = _world(resolvedWorld, resolvedRecord.virX, resolvedRecord.virY, gob.virX, gob.virY);
      nearbyGobs.append(new ResolvedGob(gob.id, gob.wpNodeId, gob.graphId, gob.virX, gob.virY, gob.resname, world));
    }

    for (WpPointRecord point : WaypointDatabase.loadNearbyPoints(resolvedRecord.graphId, currentVirX, currentVirY, RANGE)) {
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

}
