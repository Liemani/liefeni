package lmi.waypoint;

final class Endpoint {
  final Long gobId;
  final int x;
  final int y;
  final String resname;

  Endpoint(Long gobId, int x, int y, String resname) {
    this.gobId = gobId;
    this.x = x;
    this.y = y;
    this.resname = resname;
  }
}
