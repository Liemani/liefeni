package agent.test;

import agent.Job;

import lmi.bridge.Api;
import lmi.runtime.AgentContext;

public class LJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveEast();
  }

  public static String info() {
    return "Moves the character East.\nUsage: a L";
  }
}
