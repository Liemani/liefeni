package lmi.waypoint.object;

import lmi.waypoint.db.WpSegmentRecord;

public final class WpSegment {
  public final long id;
  public final long edgeId;
  public final long gobGraphId;
  public final int step;

  private WpSegment(long id, long edgeId, long gobGraphId, int step) {
    this.id = id;
    this.edgeId = edgeId;
    this.gobGraphId = gobGraphId;
    this.step = step;
  }

  public static WpSegment fromRecord(WpSegmentRecord record) {
    if (record == null) return null;
    return new WpSegment(record.id, record.edgeId, record.gobGraphId, record.step);
  }
}
