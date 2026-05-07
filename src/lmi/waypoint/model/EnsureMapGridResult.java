package lmi.waypoint.model;

import lmi.waypoint.persistence.WaypointResult;

public final class EnsureMapGridResult implements WaypointResult {
  public final long mapGridId;
  public final long mapSegmentId;
  public final long havenGridId;
  public final int localX;
  public final int localY;

  public EnsureMapGridResult(long mapGridId, long mapSegmentId, long havenGridId, int localX, int localY) {
    this.mapGridId = mapGridId;
    this.mapSegmentId = mapSegmentId;
    this.havenGridId = havenGridId;
    this.localX = localX;
    this.localY = localY;
  }
}
