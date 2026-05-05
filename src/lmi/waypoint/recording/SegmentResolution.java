package lmi.waypoint.recording;

final class SegmentResolution {
  final boolean resolved;
  final long graphId;
  final long referenceGridId;
  final int referenceLocalX;
  final int referenceLocalY;
  final String errorMessage;

  private SegmentResolution(boolean resolved, long graphId, long referenceGridId, int referenceLocalX,
                            int referenceLocalY, String errorMessage) {
    this.resolved = resolved;
    this.graphId = graphId;
    this.referenceGridId = referenceGridId;
    this.referenceLocalX = referenceLocalX;
    this.referenceLocalY = referenceLocalY;
    this.errorMessage = errorMessage;
  }

  static SegmentResolution resolved(long graphId, long referenceGridId, int referenceLocalX, int referenceLocalY) {
    return new SegmentResolution(true, graphId, referenceGridId, referenceLocalX, referenceLocalY, null);
  }

  static SegmentResolution failed(String errorMessage) {
    return new SegmentResolution(false, -1L, 0L, 0, 0, errorMessage);
  }
}
