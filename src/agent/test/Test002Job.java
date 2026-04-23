package agent.test;

import agent.Job;

import lmi.AppContext;
import lmi.Api;
import lmi.AgentContext;

public class Test002Job extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.message("" + AppContext.isbox().count());
  }

  public static String info() {
    return "Test 002: Prints isbox count.\nUsage: a Test002";
  }
}
