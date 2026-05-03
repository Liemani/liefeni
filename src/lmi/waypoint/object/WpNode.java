package lmi.waypoint.object;

import lmi.waypoint.db.WpNodeRecord;

public final class WpNode {
  public final long id;
  public final long graphId;
  public final long nodeRefId;
  public final int virX;
  public final int virY;
  public final String name;

  private WpNode(long id, long graphId, long nodeRefId, int virX, int virY, String name) {
    this.id = id;
    this.graphId = graphId;
    this.nodeRefId = nodeRefId;
    this.virX = virX;
    this.virY = virY;
    this.name = name;
  }

  public static WpNode fromRecord(WpNodeRecord record) {
    if (record == null) return null;
    return new WpNode(record.id, record.graphId, record.nodeRefId, record.virX, record.virY, record.name);
  }
}
