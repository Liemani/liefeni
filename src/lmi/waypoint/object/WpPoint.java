package lmi.waypoint.object;

import lmi.waypoint.db.WpPointRecord;

public final class WpPoint {
  public final long id;
  public final long segmentId;
  public final long gridId;
  public final int step;
  public final int localX;
  public final int localY;
  public final int mouseButton;
  public final Integer meshId;

  private WpPoint(long id, long segmentId, long gridId, int step, int localX, int localY,
                  int mouseButton, Integer meshId) {
    this.id = id;
    this.segmentId = segmentId;
    this.gridId = gridId;
    this.step = step;
    this.localX = localX;
    this.localY = localY;
    this.mouseButton = mouseButton;
    this.meshId = meshId;
  }

  public static WpPoint of(long id, long segmentId, long gridId, int step, int localX, int localY,
                           int mouseButton, Integer meshId) {
    return new WpPoint(id, segmentId, gridId, step, localX, localY, mouseButton, meshId);
  }

  public static WpPoint fromRecord(WpPointRecord record) {
    if (record == null) return null;
    return new WpPoint(
      record.id,
      record.segmentId,
      record.gridId,
      record.step,
      record.localX,
      record.localY,
      record.mouseButton,
      record.meshId
    );
  }
}
