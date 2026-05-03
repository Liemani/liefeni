package lmi.waypoint.managed;

import lmi.waypoint.object.WpNode;

public final class ManagedWpNode extends ManagedObject {
  private long graphId;
  private long nodeRefId;
  private int virX;
  private int virY;
  private String name;

  public ManagedWpNode(
    ManagedObjectContext context,
    long id,
    long version,
    long graphId,
    long nodeRefId,
    int virX,
    int virY,
    String name
  ) {
    super(context, id, version);
    this.graphId = graphId;
    this.nodeRefId = nodeRefId;
    this.virX = virX;
    this.virY = virY;
    this.name = name;
  }

  public static ManagedWpNode fromWpNode(ManagedObjectContext context, WpNode node) {
    return new ManagedWpNode(context, node.id, 0, node.graphId, node.nodeRefId, node.virX, node.virY, node.name);
  }

  public long graphId() {
    return graphId;
  }

  public long nodeRefId() {
    return nodeRefId;
  }

  public int virX() {
    return virX;
  }

  public int virY() {
    return virY;
  }

  public String name() {
    return name;
  }

  public void setGraphId(long graphId) {
    if (this.graphId == graphId) return;
    this.graphId = graphId;
    markDirty();
  }

  public void setNodeRefId(long nodeRefId) {
    if (this.nodeRefId == nodeRefId) return;
    this.nodeRefId = nodeRefId;
    markDirty();
  }

  public void setVirX(int virX) {
    if (this.virX == virX) return;
    this.virX = virX;
    markDirty();
  }

  public void setVirY(int virY) {
    if (this.virY == virY) return;
    this.virY = virY;
    markDirty();
  }

  public void setName(String name) {
    if (this.name.equals(name)) return;
    this.name = name;
    markDirty();
  }

  public WpNodeSnapshot snapshot() {
    return new WpNodeSnapshot(id, version(), graphId, nodeRefId, virX, virY, name);
  }
}
