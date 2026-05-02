package lmi.waypoint.object;

import lmi.waypoint.db.WpPointRecord;

public final class WpPoint {
  public final long segmentId;
  public final int step;
  public final long gobGraphId;
  public final int virX;
  public final int virY;
  public final int mouseButton;
  public final Long gobId;
  public final Integer meshId;

  private WpPoint(long segmentId, int step, long gobGraphId, int virX, int virY,
                  int mouseButton, Long gobId, Integer meshId) {
    this.segmentId = segmentId;
    this.step = step;
    this.gobGraphId = gobGraphId;
    this.virX = virX;
    this.virY = virY;
    this.mouseButton = mouseButton;
    this.gobId = gobId;
    this.meshId = meshId;
  }

  public static WpPoint fromRecord(WpPointRecord record) {
    if (record == null) return null;
    return new WpPoint(
      record.segmentId,
      record.step,
      record.gobGraphId,
      record.virX,
      record.virY,
      record.mouseButton,
      record.gobId,
      record.meshId
    );
  }
}
