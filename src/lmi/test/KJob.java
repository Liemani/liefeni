package lmi.test;
import lmi.Job;

import lmi.Api;
import lmi.AgentContext;

public class KJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveNorth();
  }

  public static String info() {
    return "Moves the character North.\nUsage: a K";
  }
}
