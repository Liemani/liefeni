package lmi.waypoint.object;

import lmi.waypoint.db.WpSegmentRecord;

public final class WpSegment {
  public final long id;
  public final long edgeId;
  public final long gridId;
  public final int step;

  private WpSegment(long id, long edgeId, long gridId, int step) {
    this.id = id;
    this.edgeId = edgeId;
    this.gridId = gridId;
    this.step = step;
  }

  public static WpSegment of(long id, long edgeId, long gridId, int step) {
    return new WpSegment(id, edgeId, gridId, step);
  }

  public static WpSegment fromRecord(WpSegmentRecord record) {
    if (record == null) return null;
    return new WpSegment(record.id, record.edgeId, record.gridId, record.step);
  }
}
