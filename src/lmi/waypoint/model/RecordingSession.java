package lmi.waypoint.model;

import java.util.ArrayList;
import java.util.List;

public final class RecordingSession {
  public final String name;
  public final long startNodeId;
  public final List<RecordingSegment> segments = new ArrayList<>();
  public final long startedAtMillis;
  public long stoppedAtMillis;
  public PendingPortalTransition pendingPortalTransition;

  public RecordingSession(String name, long startNodeId, long baseGobId, int baseGobX, int baseGobY) {
    this.name = name;
    this.startNodeId = startNodeId;
    this.startedAtMillis = System.currentTimeMillis();
    this.segments.add(new RecordingSegment(0, baseGobId, baseGobX, baseGobY));
  }

  public int pointCount() {
    int count = 0;
    for (RecordingSegment segment : segments) {
      count += segment.points.size();
    }
    return count;
  }

  public RecordingSegment currentSegment() {
    return segments.get(segments.size() - 1);
  }

  public RecordingPoint lastPoint() {
    for (int i = segments.size() - 1; i >= 0; --i) {
      RecordingSegment segment = segments.get(i);
      if (!segment.points.isEmpty())
        return segment.points.get(segment.points.size() - 1);
    }
    return null;
  }
}
