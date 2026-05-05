package lmi.waypoint.model;

import java.util.ArrayList;
import java.util.List;

public final class RecordingSession {
  public final long startNodeId;
  public final List<RecordingSegment> segments = new ArrayList<>();
  public final long startedAtMillis;
  public PendingPortalTransition pendingPortalTransition;

  public RecordingSession(long startNodeId, long baseGraphId, long baseGridId, int baseLocalX, int baseLocalY) {
    this.startNodeId = startNodeId;
    this.startedAtMillis = System.currentTimeMillis();
    this.segments.add(new RecordingSegment(0, baseGraphId, baseGridId, baseLocalX, baseLocalY));
  }

  public int pointCount() {
    int count = 0;
    for (RecordingSegment segment : segments) {
      count += segment.clicks.size();
    }
    return count;
  }

  public RecordingSegment currentSegment() {
    return segments.get(segments.size() - 1);
  }

  public RecordingClick lastClick() {
    for (int i = segments.size() - 1; i >= 0; --i) {
      RecordingSegment segment = segments.get(i);
      if (!segment.clicks.isEmpty())
        return segment.clicks.get(segment.clicks.size() - 1);
    }
    return null;
  }
}
