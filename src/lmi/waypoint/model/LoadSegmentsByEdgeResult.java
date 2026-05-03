package lmi.waypoint.model;

import lmi.Array;
import lmi.waypoint.WaypointResult;
import lmi.waypoint.object.WpSegment;

public final class LoadSegmentsByEdgeResult implements WaypointResult {
  public final long edgeId;
  public final Array<WpSegment> segments;

  public LoadSegmentsByEdgeResult(long edgeId, Array<WpSegment> segments) {
    this.edgeId = edgeId;
    this.segments = segments;
  }
}
