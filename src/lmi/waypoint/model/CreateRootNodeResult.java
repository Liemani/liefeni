package lmi.waypoint.model;

import lmi.waypoint.persistence.WaypointResult;

public final class CreateRootNodeResult implements WaypointResult {
  public final boolean created;
  public final Long nodeId;
  public final Long graphId;
  public final String errorMessage;

  private CreateRootNodeResult(boolean created, Long nodeId, Long graphId, String errorMessage) {
    this.created = created;
    this.nodeId = nodeId;
    this.graphId = graphId;
    this.errorMessage = errorMessage;
  }

  public static CreateRootNodeResult created(long nodeId, long graphId) {
    return new CreateRootNodeResult(true, nodeId, graphId, null);
  }

  public static CreateRootNodeResult failed(String errorMessage) {
    return new CreateRootNodeResult(false, null, null, errorMessage);
  }
}
