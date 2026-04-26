package lmi.waypoint.runtime;

import haven.Coord;

public final class ResolvedNode {
  public final long id;
  public final String name;
  public final long gobGraphId;
  public final long gobNodeId;
  public final int virX;
  public final int virY;
  public final Coord world;

  public ResolvedNode(long id, String name, long gobGraphId, long gobNodeId, int virX, int virY, Coord world) {
    this.id = id;
    this.name = name;
    this.gobGraphId = gobGraphId;
    this.gobNodeId = gobNodeId;
    this.virX = virX;
    this.virY = virY;
    this.world = world;
  }
}
