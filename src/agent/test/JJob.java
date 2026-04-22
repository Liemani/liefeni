package agent.test;

import agent.Job;

import lmi.Api;
import lmi.AgentContext;

public class JJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveSouth();
  }

  public static String info() {
    return "Moves the character South.\nUsage: a J";
  }
}
