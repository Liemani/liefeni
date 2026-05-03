package lmi.waypoint.object;

import lmi.waypoint.db.WpSegmentRecord;

public final class WpSegment {
  public final long id;
  public final long edgeId;
  public final long graphId;
  public final int step;

  private WpSegment(long id, long edgeId, long graphId, int step) {
    this.id = id;
    this.edgeId = edgeId;
    this.graphId = graphId;
    this.step = step;
  }

  public static WpSegment fromRecord(WpSegmentRecord record) {
    if (record == null) return null;
    return new WpSegment(record.id, record.edgeId, record.graphId, record.step);
  }
}
