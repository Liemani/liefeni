package agent.test;

import agent.Job;

import lmi.AppContext;
import lmi.AgentContext;

public class Test003Job extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    AppContext.gitem().describe();
  }

  public static String info() {
    return "Test 003: Describes a gitem.\nUsage: a Test003";
  }
}
