package lmi.waypoint.runtime;

import haven.Coord;

public final class ResolvedGrid {
  public final long mapGridId;
  public final long havenGridId;
  public final long mapSegmentId;
  public final Coord originWorld;

  public ResolvedGrid(long mapGridId, long havenGridId, long mapSegmentId, Coord originWorld) {
    this.mapGridId = mapGridId;
    this.havenGridId = havenGridId;
    this.mapSegmentId = mapSegmentId;
    this.originWorld = originWorld;
  }
}
