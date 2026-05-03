package lmi.waypoint.model;

import lmi.waypoint.WaypointResult;

public final class SaveEdgeResult implements WaypointResult {
  public final boolean saved;
  public final Long edgeId;
  public final Integer pointCount;
  public final String errorMessage;

  private SaveEdgeResult(boolean saved, Long edgeId, Integer pointCount, String errorMessage) {
    this.saved = saved;
    this.edgeId = edgeId;
    this.pointCount = pointCount;
    this.errorMessage = errorMessage;
  }

  public static SaveEdgeResult saved(long edgeId, int pointCount) {
    return new SaveEdgeResult(true, edgeId, pointCount, null);
  }

  public static SaveEdgeResult failed(String errorMessage) {
    return new SaveEdgeResult(false, null, null, errorMessage);
  }
}
