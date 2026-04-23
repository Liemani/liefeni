package agent.test;

import agent.Job;

import lmi.AppContext;
import lmi.Api;
import lmi.AgentContext;

public class Test001Job extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.message(AppContext.isbox().text());
  }

  public static String info() {
    return "Test 001: Prints isbox text.\nUsage: a Test001";
  }
}
