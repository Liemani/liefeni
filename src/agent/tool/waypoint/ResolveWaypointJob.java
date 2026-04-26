package agent.tool.waypoint;

import agent.Job;

import haven.Gob;
import lmi.AgentContext;
import lmi.Api;
import lmi.ClickManager;
import lmi.waypoint.WaypointManager;

public class ResolveWaypointJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.alert("좌표 복원에 사용할 등록된 gob 을 클릭해 주세요");
    Gob gob = ClickManager.getGob();
    if (gob == null) {
      Api.message("Waypoint resolve failed: no gob selected.");
      return;
    }

    if (!WaypointManager.resolve(gob)) {
      Api.message("Waypoint resolve failed: gob is not registered in database.");
      return;
    }

    Api.message("Waypoint resolved with gob id: " + gob.id());
    Api.message("Nearby nodes: " + WaypointManager.nearbyNodes().count());
    Api.message("Nearby points: " + WaypointManager.nearbyPoints().count());
  }

  public static String info() {
    return "Resolves the current waypoint coordinate system using a registered gob.";
  }
}
