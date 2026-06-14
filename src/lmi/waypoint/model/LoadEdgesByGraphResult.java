package lmi.waypoint.model;

import lmi.core.Array;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.persistence.WaypointResult;

public final class LoadEdgesByGraphResult implements WaypointResult {
  public final long graphId;
  public final Array<WpEdge> edges;

  public LoadEdgesByGraphResult(long graphId, Array<WpEdge> edges) {
    this.graphId = graphId;
    this.edges = edges;
  }
}
