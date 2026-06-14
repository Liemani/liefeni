package agent.test;

import agent.Job;

import lmi.bridge.Api;
import lmi.runtime.AgentContext;

public class MoveCenterJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveCenter();
  }

  public static String info() {
    return "Moves the character to the center of the current tile.\nUsage: a MoveCenter";
  }
}
