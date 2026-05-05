package lmi.waypoint.object;

import lmi.waypoint.db.WpPointRecord;

public final class WpPoint {
  public final long id;
  public final long segmentId;
  public final long cutId;
  public final int step;
  public final int virX;
  public final int virY;
  public final int mouseButton;
  public final Integer meshId;

  private WpPoint(long id, long segmentId, long cutId, int step, int virX, int virY,
                  int mouseButton, Integer meshId) {
    this.id = id;
    this.segmentId = segmentId;
    this.cutId = cutId;
    this.step = step;
    this.virX = virX;
    this.virY = virY;
    this.mouseButton = mouseButton;
    this.meshId = meshId;
  }

  public static WpPoint of(long id, long segmentId, long cutId, int step, int virX, int virY,
                           int mouseButton, Integer meshId) {
    return new WpPoint(id, segmentId, cutId, step, virX, virY, mouseButton, meshId);
  }

  public static WpPoint fromRecord(WpPointRecord record) {
    if (record == null) return null;
    return new WpPoint(
      record.id,
      record.segmentId,
      record.cutId,
      record.step,
      record.virX,
      record.virY,
      record.mouseButton,
      record.meshId
    );
  }
}
