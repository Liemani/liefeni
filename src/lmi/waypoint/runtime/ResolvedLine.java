package lmi.waypoint.runtime;

import haven.Coord;

public final class ResolvedLine {
  public final Coord fromWorld;
  public final Coord toWorld;

  public ResolvedLine(Coord fromWorld, Coord toWorld) {
    this.fromWorld = fromWorld;
    this.toWorld = toWorld;
  }
}
