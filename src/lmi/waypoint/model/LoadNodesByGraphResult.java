package lmi.waypoint.model;

import lmi.Array;
import lmi.waypoint.WaypointResult;
import lmi.waypoint.object.WpNode;

public final class LoadNodesByGraphResult implements WaypointResult {
  public final long graphId;
  public final Array<WpNode> nodes;

  public LoadNodesByGraphResult(long graphId, Array<WpNode> nodes) {
    this.graphId = graphId;
    this.nodes = nodes;
  }
}
