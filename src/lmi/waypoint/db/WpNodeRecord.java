package lmi.waypoint.db;

public final class WpNodeRecord {
  public final long id;
  public final long graphId;
  public final long gridId;
  public final int localX;
  public final int localY;
  public final String name;

  public WpNodeRecord(long id, long graphId, long gridId, int localX, int localY, String name) {
    this.id = id;
    this.graphId = graphId;
    this.gridId = gridId;
    this.localX = localX;
    this.localY = localY;
    this.name = name;
  }
}
