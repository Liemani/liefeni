package lmi.waypoint.db;

public final class WpPointRecord {
  public final long id;
  public final long segmentId;
  public final long gridId;
  public final int step;
  public final int localX;
  public final int localY;
  public final int mouseButton;
  public final Integer meshId;

  public WpPointRecord(long id, long segmentId, long gridId, int step, int localX, int localY, int mouseButton, Integer meshId) {
    this.id = id;
    this.segmentId = segmentId;
    this.gridId = gridId;
    this.step = step;
    this.localX = localX;
    this.localY = localY;
    this.mouseButton = mouseButton;
    this.meshId = meshId;
  }
}
