package lmi.waypoint.runtime;

import lmi.Array;

public final class WaypointScene {
  public final WaypointGridBounds bounds;
  public final Array<ResolvedLine> drawableLines = new Array<>();
  public final Array<ResolvedNode> drawableNodes = new Array<>();
  public final Array<ResolvedNode> hiddenNodes = new Array<>();
  public final Array<ResolvedPoint> drawablePoints = new Array<>();
  public final Array<ResolvedPoint> hiddenPoints = new Array<>();

  public WaypointScene(WaypointGridBounds bounds) {
    this.bounds = bounds;
  }
}
