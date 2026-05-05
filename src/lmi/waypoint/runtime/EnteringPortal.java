package lmi.waypoint.runtime;

public final class EnteringPortal {
  public final long graphId;
  public final int virX;
  public final int virY;
  public final String resname;

  public EnteringPortal(long graphId, int virX, int virY, String resname) {
    this.graphId = graphId;
    this.virX = virX;
    this.virY = virY;
    this.resname = resname;
  }
}
