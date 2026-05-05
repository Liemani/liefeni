package agent.debug;

import agent.Effect;
import lmi.Api;
import lmi.draw.CurrentCutDebugOverlay;

public class ToggleCurrentCutDebugOverlayEffect extends Effect {
  @Override
  public void execute() {
    boolean enabled = CurrentCutDebugOverlay.toggle();
    Api.message("Current cut debug overlay is now " + (enabled ? "enabled." : "disabled."));
  }

  public static String name() {
    return "Toggle Current Cut Debug Overlay";
  }

  public static String info() {
    return "Toggles the current-cut debug overlay.";
  }
}
