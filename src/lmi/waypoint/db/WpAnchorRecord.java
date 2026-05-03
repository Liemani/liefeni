package lmi.waypoint.db;

public final class WpAnchorRecord {
  public final long id;
  public final long graphId;
  public final int virX;
  public final int virY;

  public WpAnchorRecord(long id, long graphId, int virX, int virY) {
    this.id = id;
    this.graphId = graphId;
    this.virX = virX;
    this.virY = virY;
  }
}
