package lmi.waypoint.model;

import java.util.ArrayList;
import java.util.List;

public final class RecordingSegment {
  public final int index;
  public Long baseGobId;
  public int baseGobX;
  public int baseGobY;
  public Long startGobId;
  public int startGobX;
  public int startGobY;
  public String startGobResname;
  public Long endGobId;
  public int endGobX;
  public int endGobY;
  public String endGobResname;
  public final List<RecordingClick> clicks = new ArrayList<>();

  public RecordingSegment(int index, Long baseGobId, int baseGobX, int baseGobY) {
    this.index = index;
    this.baseGobId = baseGobId;
    this.baseGobX = baseGobX;
    this.baseGobY = baseGobY;
    this.startGobId = baseGobId;
    this.startGobX = baseGobX;
    this.startGobY = baseGobY;
  }
}
