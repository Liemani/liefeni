package lmi.waypoint;

final class SegmentResolution {
  final boolean resolved;
  final long graphId;
  final int referenceActualX;
  final int referenceActualY;
  final int referenceVirX;
  final int referenceVirY;
  final String errorMessage;

  private SegmentResolution(boolean resolved, long graphId, int referenceActualX, int referenceActualY,
                            int referenceVirX, int referenceVirY, String errorMessage) {
    this.resolved = resolved;
    this.graphId = graphId;
    this.referenceActualX = referenceActualX;
    this.referenceActualY = referenceActualY;
    this.referenceVirX = referenceVirX;
    this.referenceVirY = referenceVirY;
    this.errorMessage = errorMessage;
  }

  static SegmentResolution resolved(long graphId, int referenceActualX, int referenceActualY, int referenceVirX, int referenceVirY) {
    return new SegmentResolution(true, graphId, referenceActualX, referenceActualY, referenceVirX, referenceVirY, null);
  }

  static SegmentResolution failed(String errorMessage) {
    return new SegmentResolution(false, -1L, 0, 0, 0, 0, errorMessage);
  }
}
