package lmi.waypoint.model;

import java.util.ArrayList;
import java.util.List;

public final class Session {
  public final String name;
  public final long startNodeId;
  public final List<SegmentRecord> segments = new ArrayList<>();
  public final long startedAtMillis;
  public long stoppedAtMillis;
  public PendingDoorTransition pendingDoorTransition;

  public Session(String name, long startNodeId, long baseGobId, int baseGobX, int baseGobY) {
    this.name = name;
    this.startNodeId = startNodeId;
    this.startedAtMillis = System.currentTimeMillis();
    this.segments.add(new SegmentRecord(0, baseGobId, baseGobX, baseGobY));
  }

  public int pointCount() {
    int count = 0;
    for (SegmentRecord segment : segments) {
      count += segment.points.size();
    }
    return count;
  }

  public SegmentRecord currentSegment() {
    return segments.get(segments.size() - 1);
  }

  public PointRecord lastPoint() {
    for (int i = segments.size() - 1; i >= 0; --i) {
      SegmentRecord segment = segments.get(i);
      if (!segment.points.isEmpty())
        return segment.points.get(segment.points.size() - 1);
    }
    return null;
  }
}
