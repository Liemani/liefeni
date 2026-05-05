package lmi.waypoint.model;

import lmi.Array;
import lmi.waypoint.object.WpSegment;
import lmi.waypoint.persistence.WaypointResult;

public final class LoadSegmentsByCutResult implements WaypointResult {
  public final long graphId;
  public final int cutId;
  public final Array<WpSegment> segments;

  public LoadSegmentsByCutResult(long graphId, int cutId, Array<WpSegment> segments) {
    this.graphId = graphId;
    this.cutId = cutId;
    this.segments = segments;
  }
}
