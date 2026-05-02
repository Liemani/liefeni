package lmi.waypoint.managed;

public final class WpNodeSnapshot {
  public final long id;
  public final long version;
  public final long gobGraphId;
  public final long gobNodeId;
  public final int virX;
  public final int virY;
  public final String name;

  public WpNodeSnapshot(long id, long version, long gobGraphId, long gobNodeId, int virX, int virY, String name) {
    this.id = id;
    this.version = version;
    this.gobGraphId = gobGraphId;
    this.gobNodeId = gobNodeId;
    this.virX = virX;
    this.virY = virY;
    this.name = name;
  }
}
