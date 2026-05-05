package lmi.waypoint.model;

import lmi.Array;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.persistence.WaypointResult;

public final class LoadPointsByCutResult implements WaypointResult {
  public final long graphId;
  public final int cutId;
  public final Array<WpPoint> points;

  public LoadPointsByCutResult(long graphId, int cutId, Array<WpPoint> points) {
    this.graphId = graphId;
    this.cutId = cutId;
    this.points = points;
  }
}
