package agent.test;

import agent.Job;

import lmi.bridge.Api;
import lmi.runtime.AgentContext;

public class KJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveNorth();
  }

  public static String info() {
    return "Moves the character North.\nUsage: a K";
  }
}
