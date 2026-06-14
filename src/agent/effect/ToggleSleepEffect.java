package agent.effect;

import agent.Effect;
import lmi.runtime.Agent;
import lmi.bridge.Api;

public class ToggleSleepEffect extends Effect {
  @Override
  public void execute() {
    Agent agent = Agent.getInstance();
    boolean sleeping = !agent.isSleeping();
    agent.setSleep(sleeping);

    if (sleeping) {
      Api.message("Agent is now sleeping (Survival drives disabled).");
    } else {
      Api.message("Agent is now awake.");
    }
  }

  public static String name() {
    return "Toggle Sleep";
  }

  public static String info() {
    return "Immediately toggles the Agent sleep state.";
  }

  public static String sortkey() {
    return "\ufffe\uffff00_toggle_sleep";
  }
}
