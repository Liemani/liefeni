package lmi.waypoint.model;

import lmi.Array;
import lmi.waypoint.WaypointResult;
import lmi.waypoint.object.WpEdge;

public final class LoadEdgesByNodeResult implements WaypointResult {
  public final long nodeId;
  public final Array<WpEdge> edges;

  public LoadEdgesByNodeResult(long nodeId, Array<WpEdge> edges) {
    this.nodeId = nodeId;
    this.edges = edges;
  }
}
