package lmi.waypoint.db;

public final class WpSegmentRecord {
  public final long id;
  public final long edgeId;
  public final long graphId;
  public final long cutId;
  public final int step;

  public WpSegmentRecord(long id, long edgeId, long graphId, long cutId, int step) {
    this.id = id;
    this.edgeId = edgeId;
    this.graphId = graphId;
    this.cutId = cutId;
    this.step = step;
  }
}
