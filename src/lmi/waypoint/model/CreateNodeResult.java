package lmi.waypoint.model;

import lmi.waypoint.persistence.WaypointResult;

public final class CreateNodeResult implements WaypointResult {
  public final boolean created;
  public final Long graphId;
  public final Long nodeId;
  public final String errorMessage;

  private CreateNodeResult(boolean created, Long graphId, Long nodeId, String errorMessage) {
    this.created = created;
    this.graphId = graphId;
    this.nodeId = nodeId;
    this.errorMessage = errorMessage;
  }

  public static CreateNodeResult created(long graphId, long nodeId) {
    return new CreateNodeResult(true, graphId, nodeId, null);
  }

  public static CreateNodeResult failed(String errorMessage) {
    return new CreateNodeResult(false, null, null, errorMessage);
  }
}
