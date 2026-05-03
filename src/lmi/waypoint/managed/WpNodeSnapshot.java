package lmi.waypoint.managed;

public final class WpNodeSnapshot {
  public final long id;
  public final long version;
  public final long graphId;
  public final long nodeRefId;
  public final int virX;
  public final int virY;
  public final String name;

  public WpNodeSnapshot(long id, long version, long graphId, long nodeRefId, int virX, int virY, String name) {
    this.id = id;
    this.version = version;
    this.graphId = graphId;
    this.nodeRefId = nodeRefId;
    this.virX = virX;
    this.virY = virY;
    this.name = name;
  }
}
