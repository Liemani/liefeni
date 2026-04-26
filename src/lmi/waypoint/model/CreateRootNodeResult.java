package lmi.waypoint.model;

public final class CreateRootNodeResult {
  public final boolean created;
  public final Long nodeId;
  public final Long gobId;
  public final Long graphId;
  public final String errorMessage;

  private CreateRootNodeResult(boolean created, Long nodeId, Long gobId, Long graphId, String errorMessage) {
    this.created = created;
    this.nodeId = nodeId;
    this.gobId = gobId;
    this.graphId = graphId;
    this.errorMessage = errorMessage;
  }

  public static CreateRootNodeResult created(long nodeId, long gobId, long graphId) {
    return new CreateRootNodeResult(true, nodeId, gobId, graphId, null);
  }

  public static CreateRootNodeResult failed(String errorMessage) {
    return new CreateRootNodeResult(false, null, null, null, errorMessage);
  }
}
