package lmi.waypoint.model;

import lmi.waypoint.persistence.WaypointResult;

public final class CreateAnchorResult implements WaypointResult {
  public final boolean created;
  public final Long graphId;
  public final String errorMessage;

  private CreateAnchorResult(boolean created, Long graphId, String errorMessage) {
    this.created = created;
    this.graphId = graphId;
    this.errorMessage = errorMessage;
  }

  public static CreateAnchorResult created(long graphId) {
    return new CreateAnchorResult(true, graphId, null);
  }

  public static CreateAnchorResult failed(String errorMessage) {
    return new CreateAnchorResult(false, null, errorMessage);
  }
}
