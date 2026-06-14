package lmi.waypoint.model;

import lmi.core.Array;
import lmi.waypoint.object.WpEdge;
import lmi.waypoint.object.WpPoint;
import lmi.waypoint.object.WpSegment;
import lmi.waypoint.persistence.WaypointResult;

public final class SaveEdgeResult implements WaypointResult {
  public final boolean saved;
  public final Long edgeId;
  public final Integer pointCount;
  public final WpEdge edge;
  public final Array<WpSegment> segments;
  public final Array<WpPoint> points;
  public final String errorMessage;

  private SaveEdgeResult(boolean saved, Long edgeId, Integer pointCount, WpEdge edge,
                         Array<WpSegment> segments, Array<WpPoint> points, String errorMessage) {
    this.saved = saved;
    this.edgeId = edgeId;
    this.pointCount = pointCount;
    this.edge = edge;
    this.segments = (segments == null) ? new Array<>() : segments;
    this.points = (points == null) ? new Array<>() : points;
    this.errorMessage = errorMessage;
  }

  public static SaveEdgeResult saved(long edgeId, int pointCount, WpEdge edge, Array<WpSegment> segments, Array<WpPoint> points) {
    return new SaveEdgeResult(true, edgeId, pointCount, edge, segments, points, null);
  }

  public static SaveEdgeResult failed(String errorMessage) {
    return new SaveEdgeResult(false, null, null, null, null, null, errorMessage);
  }
}
