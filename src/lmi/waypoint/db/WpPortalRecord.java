package lmi.waypoint.db;

public final class WpPortalRecord {
  public final long id;
  public final long graphId;
  public final int virX;
  public final int virY;
  public final String resname;

  public WpPortalRecord(long id, long graphId, int virX, int virY, String resname) {
    this.id = id;
    this.graphId = graphId;
    this.virX = virX;
    this.virY = virY;
    this.resname = resname;
  }
}
