package lmi.job;

import lmi.Api;
import lmi.AgentContext;

public class MoveCenterJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveCenter();
  }

  public static String man() {
    return "Moves the character to the center of the current tile.\nUsage: a MoveCenter";
  }
}
