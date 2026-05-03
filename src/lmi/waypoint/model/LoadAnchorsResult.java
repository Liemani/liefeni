package lmi.waypoint.model;

import lmi.Array;
import lmi.waypoint.WaypointResult;
import lmi.waypoint.object.WpAnchor;

public final class LoadAnchorsResult implements WaypointResult {
  public final Array<WpAnchor> anchors;

  public LoadAnchorsResult(Array<WpAnchor> anchors) {
    this.anchors = anchors;
  }
}
