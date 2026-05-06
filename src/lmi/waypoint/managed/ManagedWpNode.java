package lmi.waypoint.managed;

import lmi.waypoint.object.WpNode;

public final class ManagedWpNode extends ManagedObject {
  private long graphId;
  private long gridId;
  private int localX;
  private int localY;
  private String name;

  public ManagedWpNode(
    ManagedObjectContext context,
    long id,
    long version,
    long graphId,
    long gridId,
    int localX,
    int localY,
    String name
  ) {
    super(context, id, version);
    this.graphId = graphId;
    this.gridId = gridId;
    this.localX = localX;
    this.localY = localY;
    this.name = name;
  }

  public static ManagedWpNode fromWpNode(ManagedObjectContext context, WpNode node) {
    return new ManagedWpNode(context, node.id, 0, node.graphId, node.gridId, node.localX, node.localY, node.name);
  }

  public long graphId() {
    return graphId;
  }

  public long gridId() {
    return gridId;
  }

  public int localX() {
    return localX;
  }

  public int localY() {
    return localY;
  }

  public String name() {
    return name;
  }

  public void setGraphId(long graphId) {
    if (this.graphId == graphId) return;
    this.graphId = graphId;
    markDirty();
  }

  public void setGridId(long gridId) {
    if (this.gridId == gridId) return;
    this.gridId = gridId;
    markDirty();
  }

  public void setLocalX(int localX) {
    if (this.localX == localX) return;
    this.localX = localX;
    markDirty();
  }

  public void setLocalY(int localY) {
    if (this.localY == localY) return;
    this.localY = localY;
    markDirty();
  }

  public void setName(String name) {
    if (this.name.equals(name)) return;
    this.name = name;
    markDirty();
  }

  public WpNodeSnapshot snapshot() {
    return new WpNodeSnapshot(id, version(), graphId, gridId, localX, localY, name);
  }
}
