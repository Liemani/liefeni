package lmi.waypoint.db;

public final class WpSegmentRecord {
  public final long id;
  public final long edgeId;
  public final long gridId;
  public final int step;

  public WpSegmentRecord(long id, long edgeId, long gridId, int step) {
    this.id = id;
    this.edgeId = edgeId;
    this.gridId = gridId;
    this.step = step;
  }
}
