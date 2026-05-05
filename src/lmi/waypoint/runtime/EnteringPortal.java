package lmi.waypoint.runtime;

public final class EnteringPortal {
  public final long graphId;
  public final long gridId;
  public final int localX;
  public final int localY;
  public final String resname;

  public EnteringPortal(long graphId, long gridId, int localX, int localY, String resname) {
    this.graphId = graphId;
    this.gridId = gridId;
    this.localX = localX;
    this.localY = localY;
    this.resname = resname;
  }
}
