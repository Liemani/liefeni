package lmi.waypoint.db;

public final class WpPointRecord {
  public final long id;
  public final long segmentId;
  public final long cutId;
  public final int step;
  public final int virX;
  public final int virY;
  public final int mouseButton;
  public final Integer meshId;

  public WpPointRecord(long id, long segmentId, long cutId, int step, int virX, int virY, int mouseButton, Integer meshId) {
    this.id = id;
    this.segmentId = segmentId;
    this.cutId = cutId;
    this.step = step;
    this.virX = virX;
    this.virY = virY;
    this.mouseButton = mouseButton;
    this.meshId = meshId;
  }
}
