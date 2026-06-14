package agent.test;

import agent.Job;

import lmi.bridge.Api;
import lmi.runtime.AgentContext;

public class HJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveWest();
  }

  public static String info() {
    return "Moves the character West.\nUsage: a H";
  }
}
