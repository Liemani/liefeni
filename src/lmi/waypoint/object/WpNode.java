package lmi.waypoint.object;

import lmi.waypoint.db.WpNodeRecord;

public final class WpNode {
  public final long id;
  public final long graphId;
  public final long mapSegmentId;
  public final long gridId;
  public final int localX;
  public final int localY;
  public final String name;

  private WpNode(long id, long graphId, long mapSegmentId, long gridId, int localX, int localY, String name) {
    this.id = id;
    this.graphId = graphId;
    this.mapSegmentId = mapSegmentId;
    this.gridId = gridId;
    this.localX = localX;
    this.localY = localY;
    this.name = name;
  }

  public static WpNode of(long id, long graphId, long mapSegmentId, long gridId, int localX, int localY, String name) {
    return new WpNode(id, graphId, mapSegmentId, gridId, localX, localY, name);
  }

  public static WpNode of(long id, long graphId, long gridId, int localX, int localY, String name) {
    return new WpNode(id, graphId, 0L, gridId, localX, localY, name);
  }

  public static WpNode fromRecord(WpNodeRecord record) {
    if (record == null) return null;
    return new WpNode(record.id, record.graphId, record.mapSegmentId, record.gridId, record.localX, record.localY, record.name);
  }
}
