package lmi.waypoint.runtime;

import haven.Coord;
import haven.Gob;

public final class WaypointCalibrationState {
  private boolean anchorPresent;
  private Long graphId;
  private Coord vir = Coord.z;
  private Coord world = Coord.z;
  private Gob gob;

  public void clear() {
    anchorPresent = false;
    graphId = null;
    vir = Coord.z;
    world = Coord.z;
    gob = null;
  }

  public boolean hasAnchor() {
    return anchorPresent;
  }

  public void markAnchorPresent() {
    anchorPresent = true;
  }

  public void setAnchorPresent(boolean anchorPresent) {
    this.anchorPresent = anchorPresent;
  }

  public boolean isCalibrated() {
    return graphId != null;
  }

  public Long graphId() {
    return graphId;
  }

  public Coord vir() {
    return Coord.of(vir);
  }

  public Coord world() {
    return Coord.of(world);
  }

  public Gob gob() {
    return gob;
  }

  public void setCalibration(long graphId, Coord vir, Coord world, Gob gob) {
    this.anchorPresent = true;
    this.graphId = graphId;
    this.vir = Coord.of(vir);
    this.world = Coord.of(world);
    this.gob = gob;
  }

  public Coord virOfWorld(Coord targetWorld) {
    if (graphId == null)
      return null;
    return Coord.of(
      vir.x + (targetWorld.x - world.x),
      vir.y + (targetWorld.y - world.y)
    );
  }

  public Coord worldOfVir(int targetVirX, int targetVirY) {
    return world.add(targetVirX - vir.x, targetVirY - vir.y);
  }
}
