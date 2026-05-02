package lmi.waypoint.managed;

import lmi.waypoint.object.WpNode;

public final class ManagedWpNode extends ManagedObject {
  private long gobGraphId;
  private long gobNodeId;
  private int virX;
  private int virY;
  private String name;

  public ManagedWpNode(
    ManagedObjectContext context,
    long id,
    long version,
    long gobGraphId,
    long gobNodeId,
    int virX,
    int virY,
    String name
  ) {
    super(context, id, version);
    this.gobGraphId = gobGraphId;
    this.gobNodeId = gobNodeId;
    this.virX = virX;
    this.virY = virY;
    this.name = name;
  }

  public static ManagedWpNode fromWpNode(ManagedObjectContext context, WpNode node) {
    return new ManagedWpNode(context, node.id, 0, node.gobGraphId, node.gobNodeId, node.virX, node.virY, node.name);
  }

  public long gobGraphId() {
    return gobGraphId;
  }

  public long gobNodeId() {
    return gobNodeId;
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

  public void setGobGraphId(long gobGraphId) {
    if (this.gobGraphId == gobGraphId) return;
    this.gobGraphId = gobGraphId;
    markDirty();
  }

  public void setGobNodeId(long gobNodeId) {
    if (this.gobNodeId == gobNodeId) return;
    this.gobNodeId = gobNodeId;
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
    return new WpNodeSnapshot(id, version(), gobGraphId, gobNodeId, virX, virY, name);
  }
}
