package lmi.waypoint.persistence;

public final class SaveBatchResult implements WaypointResult {
  public final Long anchorGraphId;

  public SaveBatchResult(Long anchorGraphId) {
    this.anchorGraphId = anchorGraphId;
  }
}
