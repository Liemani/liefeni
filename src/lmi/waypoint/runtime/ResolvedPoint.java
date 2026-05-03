package lmi.waypoint.runtime;

import haven.Coord;

public final class ResolvedPoint {
  public final long segmentId;
  public final int step;
  public final int virX;
  public final int virY;
  public final int mouseButton;
  public final Integer meshId;
  public final Coord world;

  public ResolvedPoint(long segmentId, int step, int virX, int virY,
                       int mouseButton, Integer meshId, Coord world) {
    this.segmentId = segmentId;
    this.step = step;
    this.virX = virX;
    this.virY = virY;
    this.mouseButton = mouseButton;
    this.meshId = meshId;
    this.world = world;
  }
}
