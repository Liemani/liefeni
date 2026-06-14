package agent.test;

import agent.Job;

import lmi.bridge.Api;
import lmi.runtime.AgentContext;

public class JJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveSouth();
  }

  public static String info() {
    return "Moves the character South.\nUsage: a J";
  }
}
