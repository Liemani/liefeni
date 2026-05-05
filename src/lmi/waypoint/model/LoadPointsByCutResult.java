package lmi.waypoint.model;

import lmi.Array;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.persistence.WaypointResult;

public final class LoadPointsByCutResult implements WaypointResult {
  public final long graphId;
  public final long cutId;
  public final Array<WpPoint> points;

  public LoadPointsByCutResult(long graphId, long cutId, Array<WpPoint> points) {
    this.graphId = graphId;
    this.cutId = cutId;
    this.points = points;
  }
}
