package lmi.waypoint.db;

public final class WpEdgeRecord {
  public final long id;
  public final long node0Id;
  public final long node1Id;
  public final int direction;
  public final double timeCost;
  public final double fatigueCost;

  public WpEdgeRecord(long id, long node0Id, long node1Id, int direction, double timeCost, double fatigueCost) {
    this.id = id;
    this.node0Id = node0Id;
    this.node1Id = node1Id;
    this.direction = direction;
    this.timeCost = timeCost;
    this.fatigueCost = fatigueCost;
  }
}
