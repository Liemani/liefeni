package lmi.waypoint;

import haven.Coord;
import haven.Gob;

final class WaypointCalibrationState {
  private boolean anchorPresent;
  private Long graphId;
  private Coord vir = Coord.z;
  private Coord world = Coord.z;
  private Gob gob;

  void clear() {
    anchorPresent = false;
    graphId = null;
    vir = Coord.z;
    world = Coord.z;
    gob = null;
  }

  boolean hasAnchor() {
    return anchorPresent;
  }

  void markAnchorPresent() {
    anchorPresent = true;
  }

  void setAnchorPresent(boolean anchorPresent) {
    this.anchorPresent = anchorPresent;
  }

  boolean isCalibrated() {
    return graphId != null;
  }

  Long graphId() {
    return graphId;
  }

  Coord vir() {
    return Coord.of(vir);
  }

  Coord world() {
    return Coord.of(world);
  }

  Gob gob() {
    return gob;
  }

  void setCalibration(long graphId, Coord vir, Coord world, Gob gob) {
    this.anchorPresent = true;
    this.graphId = graphId;
    this.vir = Coord.of(vir);
    this.world = Coord.of(world);
    this.gob = gob;
  }

  Coord virOfWorld(Coord targetWorld) {
    if (graphId == null)
      return null;
    return Coord.of(
      vir.x + (targetWorld.x - world.x),
      vir.y + (targetWorld.y - world.y)
    );
  }

  Coord worldOfVir(int targetVirX, int targetVirY) {
    return world.add(targetVirX - vir.x, targetVirY - vir.y);
  }
}
