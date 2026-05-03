package lmi.waypoint.object;

import lmi.waypoint.db.WpPointRecord;

public final class WpPoint {
  public final long id;
  public final long segmentId;
  public final int step;
  public final int virX;
  public final int virY;
  public final int mouseButton;
  public final Integer meshId;

  private WpPoint(long id, long segmentId, int step, int virX, int virY,
                  int mouseButton, Integer meshId) {
    this.id = id;
    this.segmentId = segmentId;
    this.step = step;
    this.virX = virX;
    this.virY = virY;
    this.mouseButton = mouseButton;
    this.meshId = meshId;
  }

  public static WpPoint fromRecord(WpPointRecord record) {
    if (record == null) return null;
    return new WpPoint(
      record.id,
      record.segmentId,
      record.step,
      record.virX,
      record.virY,
      record.mouseButton,
      record.meshId
    );
  }
}
