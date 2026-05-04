package lmi.waypoint.persistence;

import java.sql.Connection;

public interface WaypointRequest<R extends WaypointResult> {
  R execute(Connection conn) throws Exception;
}
