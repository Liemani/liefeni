package agent.debug;

import agent.Effect;
import lmi.bridge.Api;
import lmi.draw.CurrentGridDebugOverlay;

public class ToggleCurrentGridDebugOverlayEffect extends Effect {
  @Override
  public void execute() {
    boolean enabled = CurrentGridDebugOverlay.toggle();
    Api.message("Current grid debug overlay is now " + (enabled ? "enabled." : "disabled."));
  }

  public static String name() {
    return "Toggle Current Grid Debug Overlay";
  }

  public static String info() {
    return "Toggles the current-grid debug overlay.";
  }
}
