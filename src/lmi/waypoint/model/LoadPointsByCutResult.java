package lmi.waypoint.model;

import lmi.Array;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.persistence.WaypointResult;

public final class LoadPointsByCutResult implements WaypointResult {
  public final long graphId;
  public final long gridId;
  public final Array<WpPoint> points;

  public LoadPointsByCutResult(long graphId, long gridId, Array<WpPoint> points) {
    this.graphId = graphId;
    this.gridId = gridId;
    this.points = points;
  }
}
