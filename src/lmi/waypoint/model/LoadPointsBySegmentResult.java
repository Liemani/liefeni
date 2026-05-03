package lmi.waypoint.model;

import lmi.Array;
import lmi.waypoint.WaypointResult;
import lmi.waypoint.object.WpPoint;

public final class LoadPointsBySegmentResult implements WaypointResult {
  public final long segmentId;
  public final Array<WpPoint> points;

  public LoadPointsBySegmentResult(long segmentId, Array<WpPoint> points) {
    this.segmentId = segmentId;
    this.points = points;
  }
}
