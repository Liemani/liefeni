package lmi.waypoint.model;

public final class CreateNodeResult {
  public final boolean created;
  public final Long nodeId;
  public final Long gobId;
  public final String errorMessage;

  private CreateNodeResult(boolean created, Long nodeId, Long gobId, String errorMessage) {
    this.created = created;
    this.nodeId = nodeId;
    this.gobId = gobId;
    this.errorMessage = errorMessage;
  }

  public static CreateNodeResult created(long nodeId, long gobId) {
    return new CreateNodeResult(true, nodeId, gobId, null);
  }

  public static CreateNodeResult failed(String errorMessage) {
    return new CreateNodeResult(false, null, null, errorMessage);
  }
}
