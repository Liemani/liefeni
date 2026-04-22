package agent.test;

import agent.Job;

import lmi.AgentContext;

public class Test006Job extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    System.out.println("Hello, world!");
  }

  public static String info() {
    return "Test 006: Prints Hello World.\nUsage: a Test006";
  }
}
