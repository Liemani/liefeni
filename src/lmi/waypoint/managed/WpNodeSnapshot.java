package lmi.waypoint.managed;

public final class WpNodeSnapshot {
  public final long id;
  public final long version;
  public final long graphId;
  public final long gridId;
  public final int localX;
  public final int localY;
  public final String name;

  public WpNodeSnapshot(long id, long version, long graphId, long gridId, int localX, int localY, String name) {
    this.id = id;
    this.version = version;
    this.graphId = graphId;
    this.gridId = gridId;
    this.localX = localX;
    this.localY = localY;
    this.name = name;
  }
}
