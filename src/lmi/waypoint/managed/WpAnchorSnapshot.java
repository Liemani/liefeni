package lmi.waypoint.managed;

public final class WpAnchorSnapshot {
  public final long id;
  public final long version;
  public final Long graphId;
  public final int virX;
  public final int virY;

  public WpAnchorSnapshot(long id, long version, Long graphId, int virX, int virY) {
    this.id = id;
    this.version = version;
    this.graphId = graphId;
    this.virX = virX;
    this.virY = virY;
  }
}
