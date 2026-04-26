package lmi.waypoint.model;

public final class GobNodeRecord {
  public final long id;
  public final long graphId;
  public final int virX;
  public final int virY;
  public final Long wpNodeId;
  public final String resname;

  public GobNodeRecord(long id, long graphId, int virX, int virY, Long wpNodeId, String resname) {
    this.id = id;
    this.graphId = graphId;
    this.virX = virX;
    this.virY = virY;
    this.wpNodeId = wpNodeId;
    this.resname = resname;
  }
}
