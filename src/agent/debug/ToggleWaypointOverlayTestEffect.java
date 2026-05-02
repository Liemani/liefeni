package agent.debug;

import agent.Effect;
import lmi.Api;
import lmi.waypoint.WaypointOverlay;

public class ToggleWaypointOverlayTestEffect extends Effect {
  @Override
  public void execute() {
    boolean enabled = WaypointOverlay.toggleTest();
    Api.message("Waypoint overlay test is now " + (enabled ? "enabled." : "disabled."));
  }

  public static String name() {
    return "Toggle Waypoint Overlay Test";
  }

  public static String info() {
    return "Toggles a simple test overlay to verify MapView -> Hook -> WaypointOverlay drawing.";
  }
}
