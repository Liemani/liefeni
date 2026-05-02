package lmi.waypoint.object;

import lmi.waypoint.db.WpNodeRecord;

public final class WpNode {
  public final long id;
  public final long gobGraphId;
  public final long gobNodeId;
  public final int virX;
  public final int virY;
  public final String name;

  private WpNode(long id, long gobGraphId, long gobNodeId, int virX, int virY, String name) {
    this.id = id;
    this.gobGraphId = gobGraphId;
    this.gobNodeId = gobNodeId;
    this.virX = virX;
    this.virY = virY;
    this.name = name;
  }

  public static WpNode fromRecord(WpNodeRecord record) {
    if (record == null) return null;
    return new WpNode(record.id, record.gobGraphId, record.gobNodeId, record.virX, record.virY, record.name);
  }
}
