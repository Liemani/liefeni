package lmi.waypoint.model;

import lmi.waypoint.WaypointResult;

public final class CreateNodeResult implements WaypointResult {
  public final boolean created;
  public final Long nodeId;
  public final String errorMessage;

  private CreateNodeResult(boolean created, Long nodeId, String errorMessage) {
    this.created = created;
    this.nodeId = nodeId;
    this.errorMessage = errorMessage;
  }

  public static CreateNodeResult created(long nodeId) {
    return new CreateNodeResult(true, nodeId, null);
  }

  public static CreateNodeResult failed(String errorMessage) {
    return new CreateNodeResult(false, null, errorMessage);
  }
}
