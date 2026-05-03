package lmi.waypoint.runtime;

import haven.Coord;

public final class ResolvedNode {
  public final long id;
  public final String name;
  public final long graphId;
  public final long nodeRefId;
  public final int virX;
  public final int virY;
  public final Coord world;

  public ResolvedNode(long id, String name, long graphId, long nodeRefId, int virX, int virY, Coord world) {
    this.id = id;
    this.name = name;
    this.graphId = graphId;
    this.nodeRefId = nodeRefId;
    this.virX = virX;
    this.virY = virY;
    this.world = world;
  }
}
