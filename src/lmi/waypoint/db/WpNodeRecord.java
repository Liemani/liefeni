package lmi.waypoint.db;

public final class WpNodeRecord {
  public final long id;
  public final long graphId;
  public final long nodeRefId;
  public final int virX;
  public final int virY;
  public final String name;

  public WpNodeRecord(long id, long graphId, long nodeRefId, int virX, int virY, String name) {
    this.id = id;
    this.graphId = graphId;
    this.nodeRefId = nodeRefId;
    this.virX = virX;
    this.virY = virY;
    this.name = name;
  }

  public WpNodeRecord(long id, long graphId, int virX, int virY, String name) {
    this.id = id;
    this.graphId = graphId;
    this.nodeRefId = -1L;
    this.virX = virX;
    this.virY = virY;
    this.name = name;
  }
}
