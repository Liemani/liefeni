package lmi.waypoint.model;

public final class WpNodeRecord {
  public final long id;
  public final long gobGraphId;
  public final long gobNodeId;
  public final int virX;
  public final int virY;
  public final String name;

  public WpNodeRecord(long id, long gobGraphId, long gobNodeId, int virX, int virY, String name) {
    this.id = id;
    this.gobGraphId = gobGraphId;
    this.gobNodeId = gobNodeId;
    this.virX = virX;
    this.virY = virY;
    this.name = name;
  }
}
