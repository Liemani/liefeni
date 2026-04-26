package lmi.waypoint;

final class GraphMerge {
  final boolean merged;
  final long graphId;
  final long referenceGobId;
  final String errorMessage;

  private GraphMerge(boolean merged, long graphId, long referenceGobId, String errorMessage) {
    this.merged = merged;
    this.graphId = graphId;
    this.referenceGobId = referenceGobId;
    this.errorMessage = errorMessage;
  }

  static GraphMerge merged(long graphId, long referenceGobId) {
    return new GraphMerge(true, graphId, referenceGobId, null);
  }
}
