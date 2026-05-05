package lmi.waypoint.object;

import lmi.waypoint.db.WpEdgeRecord;

public final class WpEdge {
  public final long id;
  public final long node0Id;
  public final long node1Id;
  public final int direction;
  public final double timeCost;
  public final double fatigueCost;

  private WpEdge(long id, long node0Id, long node1Id, int direction, double timeCost, double fatigueCost) {
    this.id = id;
    this.node0Id = node0Id;
    this.node1Id = node1Id;
    this.direction = direction;
    this.timeCost = timeCost;
    this.fatigueCost = fatigueCost;
  }

  public static WpEdge of(long id, long node0Id, long node1Id, int direction, double timeCost, double fatigueCost) {
    return new WpEdge(id, node0Id, node1Id, direction, timeCost, fatigueCost);
  }

  public static WpEdge fromRecord(WpEdgeRecord record) {
    if (record == null) return null;
    return new WpEdge(record.id, record.node0Id, record.node1Id, record.direction, record.timeCost, record.fatigueCost);
  }

  public long otherNodeId(long nodeId) {
    if (node0Id == nodeId) return node1Id;
    if (node1Id == nodeId) return node0Id;
    return -1;
  }
}
