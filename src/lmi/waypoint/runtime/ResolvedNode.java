package lmi.waypoint.runtime;

import haven.Coord;

public final class ResolvedNode {
  public final long id;
  public final String name;
  public final long graphId;
  public final long gridId;
  public final int localX;
  public final int localY;
  public final Coord world;

  public ResolvedNode(long id, String name, long graphId, long gridId, int localX, int localY, Coord world) {
    this.id = id;
    this.name = name;
    this.graphId = graphId;
    this.gridId = gridId;
    this.localX = localX;
    this.localY = localY;
    this.world = world;
  }
}
