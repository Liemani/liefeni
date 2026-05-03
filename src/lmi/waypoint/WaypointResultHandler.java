package lmi.waypoint;

public interface WaypointResultHandler<R extends WaypointResult> {
  void onSuccess(R result);
  void onFailure(Exception error);
}
