package lmi.waypoint.model;

import java.util.ArrayList;
import java.util.List;

public final class RecordingSegment {
  public final int index;
  public Long baseGraphId;
  public long baseGridId;
  public int baseLocalX;
  public int baseLocalY;
  public final List<RecordingClick> clicks = new ArrayList<>();

  public RecordingSegment(int index, Long baseGraphId, long baseGridId, int baseLocalX, int baseLocalY) {
    this.index = index;
    this.baseGraphId = baseGraphId;
    this.baseGridId = baseGridId;
    this.baseLocalX = baseLocalX;
    this.baseLocalY = baseLocalY;
  }
}
