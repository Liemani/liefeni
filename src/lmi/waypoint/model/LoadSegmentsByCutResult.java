package lmi.waypoint.model;

import lmi.core.Array;
import lmi.waypoint.object.WpSegment;
import lmi.waypoint.persistence.WaypointResult;

public final class LoadSegmentsByCutResult implements WaypointResult {
  public final long graphId;
  public final long gridId;
  public final Array<WpSegment> segments;

  public LoadSegmentsByCutResult(long graphId, long gridId, Array<WpSegment> segments) {
    this.graphId = graphId;
    this.gridId = gridId;
    this.segments = segments;
  }
}
