package lmi.waypoint.model;

public final class PointRecord {
  public final int index;
  public final int x;
  public final int y;
  public final int mouseButton;
  public final Long gobId;
  public final Integer meshId;
  public final String gobResname;
  public boolean isDoor;

  public PointRecord(int index, int x, int y, int mouseButton, Long gobId, Integer meshId, String gobResname) {
    this.index = index;
    this.x = x;
    this.y = y;
    this.mouseButton = mouseButton;
    this.gobId = gobId;
    this.meshId = meshId;
    this.gobResname = gobResname;
    this.isDoor = false;
  }
}
