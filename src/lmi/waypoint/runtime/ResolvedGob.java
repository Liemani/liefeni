package lmi.waypoint.runtime;

import haven.Coord;

public final class ResolvedGob {
  public final long id;
  public final Long wpNodeId;
  public final long graphId;
  public final int virX;
  public final int virY;
  public final String resname;
  public final Coord world;

  public ResolvedGob(long id, Long wpNodeId, long graphId, int virX, int virY, String resname, Coord world) {
    this.id = id;
    this.wpNodeId = wpNodeId;
    this.graphId = graphId;
    this.virX = virX;
    this.virY = virY;
    this.resname = resname;
    this.world = world;
  }
}
