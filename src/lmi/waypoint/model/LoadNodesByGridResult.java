package lmi.waypoint.model;

import lmi.core.Array;
import lmi.waypoint.object.WpNode;
import lmi.waypoint.persistence.WaypointResult;

public final class LoadNodesByGridResult implements WaypointResult {
  public final long gridId;
  public final Array<WpNode> nodes;

  public LoadNodesByGridResult(long gridId, Array<WpNode> nodes) {
    this.gridId = gridId;
    this.nodes = nodes;
  }
}
