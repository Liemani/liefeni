package lmi.waypoint.runtime;

import haven.Coord;

public final class GridPosition {
  public final long gridId;
  public final long havenGridId;
  public final long mapSegmentId;
  public final int localX;
  public final int localY;

  public GridPosition(long gridId, long havenGridId, long mapSegmentId, int localX, int localY) {
    this.gridId = gridId;
    this.havenGridId = havenGridId;
    this.mapSegmentId = mapSegmentId;
    this.localX = localX;
    this.localY = localY;
  }

  public Coord local() {
    return Coord.of(localX, localY);
  }
}
