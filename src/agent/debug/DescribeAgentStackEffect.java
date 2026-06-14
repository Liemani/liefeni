package agent.debug;

import agent.Effect;

import lmi.runtime.Agent;
import lmi.bridge.Api;

public class DescribeAgentStackEffect extends Effect {
  @Override
  public void execute() {
    StackTraceElement[] stack = Agent.getInstance().getStackTrace();
    Api.message("AgentMind stack trace (" + stack.length + " frames)");
    for (StackTraceElement frame : stack) {
      Api.message("  at " + frame);
    }
  }

  public static String info() {
    return "Prints the current AgentMind thread stack trace.";
  }
}
