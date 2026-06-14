package agent.test;

import agent.Job;

import lmi.core.AppContext;
import lmi.bridge.Api;
import lmi.runtime.AgentContext;

public class Test001Job extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.message(AppContext.isbox().text());
  }

  public static String info() {
    return "Test 001: Prints isbox text.\nUsage: a Test001";
  }
}
