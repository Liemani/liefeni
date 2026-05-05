package lmi.waypoint.runtime;

import haven.Coord;

public final class ResolvedPoint {
  public final long segmentId;
  public final long gridId;
  public final int step;
  public final int localX;
  public final int localY;
  public final int mouseButton;
  public final Integer meshId;
  public final Coord world;

  public ResolvedPoint(long segmentId, long gridId, int step, int localX, int localY,
                       int mouseButton, Integer meshId, Coord world) {
    this.segmentId = segmentId;
    this.gridId = gridId;
    this.step = step;
    this.localX = localX;
    this.localY = localY;
    this.mouseButton = mouseButton;
    this.meshId = meshId;
    this.world = world;
  }
}
