package lmi.waypoint.model;

import lmi.waypoint.WaypointResult;

public final class UpdateAnchorResult implements WaypointResult {
  public final boolean updated;
  public final String errorMessage;

  private UpdateAnchorResult(boolean updated, String errorMessage) {
    this.updated = updated;
    this.errorMessage = errorMessage;
  }

  public static UpdateAnchorResult updated() {
    return new UpdateAnchorResult(true, null);
  }

  public static UpdateAnchorResult failed(String errorMessage) {
    return new UpdateAnchorResult(false, errorMessage);
  }
}
