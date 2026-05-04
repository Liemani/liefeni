package lmi.waypoint.model;

import lmi.Array;
import lmi.waypoint.persistence.WaypointResult;
import lmi.waypoint.object.WpPortal;

public final class LoadCounterpartPortalsResult implements WaypointResult {
  public final long portalId;
  public final Array<WpPortal> portals;

  public LoadCounterpartPortalsResult(long portalId, Array<WpPortal> portals) {
    this.portalId = portalId;
    this.portals = portals;
  }
}
