package lmi.waypoint.db;

public final class WpPointRecord {
  public final long id;
  public final long segmentId;
  public final int step;
  public final int virX;
  public final int virY;
  public final int mouseButton;
  public final Integer meshId;

  public WpPointRecord(long id, long segmentId, int step, int virX, int virY, int mouseButton, Integer meshId) {
    this.id = id;
    this.segmentId = segmentId;
    this.step = step;
    this.virX = virX;
    this.virY = virY;
    this.mouseButton = mouseButton;
    this.meshId = meshId;
  }
}
