package lmi.waypoint.db;

public final class WpSegmentRecord {
  public final long id;
  public final long edgeId;
  public final long gobGraphId;
  public final int step;

  public WpSegmentRecord(long id, long edgeId, long gobGraphId, int step) {
    this.id = id;
    this.edgeId = edgeId;
    this.gobGraphId = gobGraphId;
    this.step = step;
  }
}
