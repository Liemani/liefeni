package lmi.waypoint.object;

import lmi.waypoint.db.WpPortalRecord;

public final class WpPortal {
  public final long id;
  public final long graphId;
  public final int virX;
  public final int virY;
  public final String resname;

  private WpPortal(long id, long graphId, int virX, int virY, String resname) {
    this.id = id;
    this.graphId = graphId;
    this.virX = virX;
    this.virY = virY;
    this.resname = resname;
  }

  public static WpPortal fromRecord(WpPortalRecord record) {
    if (record == null) return null;
    return new WpPortal(record.id, record.graphId, record.virX, record.virY, record.resname);
  }
}
