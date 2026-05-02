package lmi.waypoint.object;

import lmi.waypoint.db.GobNodeRecord;

public final class GobNode {
  public final long id;
  public final long graphId;
  public final int virX;
  public final int virY;
  public final Long wpNodeId;
  public final String resname;

  private GobNode(long id, long graphId, int virX, int virY, Long wpNodeId, String resname) {
    this.id = id;
    this.graphId = graphId;
    this.virX = virX;
    this.virY = virY;
    this.wpNodeId = wpNodeId;
    this.resname = resname;
  }

  public static GobNode fromRecord(GobNodeRecord record) {
    if (record == null) return null;
    return new GobNode(record.id, record.graphId, record.virX, record.virY, record.wpNodeId, record.resname);
  }
}
