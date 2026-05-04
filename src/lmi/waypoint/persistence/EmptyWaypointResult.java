package lmi.waypoint.persistence;

public final class EmptyWaypointResult implements WaypointResult {
  public static final EmptyWaypointResult INSTANCE = new EmptyWaypointResult();

  private EmptyWaypointResult() {}
}
