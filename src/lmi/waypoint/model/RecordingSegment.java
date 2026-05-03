package lmi.waypoint.model;

import java.util.ArrayList;
import java.util.List;

public final class RecordingSegment {
  public final int index;
  public Long baseGraphId;
  public int baseGobX;
  public int baseGobY;
  public int baseVirX;
  public int baseVirY;
  public Long endGobId;
  public int endGobX;
  public int endGobY;
  public String endGobResname;
  public final List<RecordingClick> clicks = new ArrayList<>();

  public RecordingSegment(int index, Long baseGraphId, int baseGobX, int baseGobY, int baseVirX, int baseVirY) {
    this.index = index;
    this.baseGraphId = baseGraphId;
    this.baseGobX = baseGobX;
    this.baseGobY = baseGobY;
    this.baseVirX = baseVirX;
    this.baseVirY = baseVirY;
  }
}
