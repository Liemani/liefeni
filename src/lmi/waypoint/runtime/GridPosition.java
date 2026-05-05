package lmi.waypoint.runtime;

import haven.Coord;

public final class GridPosition {
  public final long gridId;
  public final int localX;
  public final int localY;

  public GridPosition(long gridId, int localX, int localY) {
    this.gridId = gridId;
    this.localX = localX;
    this.localY = localY;
  }

  public Coord local() {
    return Coord.of(localX, localY);
  }
}
