package lmi.waypoint.recording;

import lmi.waypoint.model.RecordingSegment;

import java.sql.Connection;
import java.sql.SQLException;

final class SegmentResolver {
  private SegmentResolver() {}

  static SegmentResolution resolve(Connection conn, RecordingSegment segment) throws SQLException {
    if (segment.baseGraphId == null)
      return SegmentResolution.failed("Segment " + segment.index + " has no calibrated base graph.");

    return SegmentResolution.resolved(
      segment.baseGraphId,
      segment.baseGridId,
      segment.baseLocalX,
      segment.baseLocalY
    );
  }
}
