package lmi.waypoint.model;

import lmi.Array;
import lmi.waypoint.WaypointResult;
import lmi.waypoint.object.WpPortal;

public final class LoadPortalsResult implements WaypointResult {
  public final long graphId;
  public final Array<WpPortal> portals;

  public LoadPortalsResult(long graphId, Array<WpPortal> portals) {
    this.graphId = graphId;
    this.portals = portals;
  }
}
