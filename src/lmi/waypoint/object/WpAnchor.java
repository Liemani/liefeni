package lmi.waypoint.object;

import lmi.waypoint.db.WpAnchorRecord;

public final class WpAnchor {
  public final long id;
  public final long graphId;
  public final int virX;
  public final int virY;

  private WpAnchor(long id, long graphId, int virX, int virY) {
    this.id = id;
    this.graphId = graphId;
    this.virX = virX;
    this.virY = virY;
  }

  public static WpAnchor of(long id, long graphId, int virX, int virY) {
    return new WpAnchor(id, graphId, virX, virY);
  }

  public static WpAnchor fromRecord(WpAnchorRecord record) {
    if (record == null) return null;
    return new WpAnchor(record.id, record.graphId, record.virX, record.virY);
  }
}
