package lmi.job;

import lmi.Api;
import lmi.AgentContext;

public class KJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveNorth();
  }

  public static String man() {
    return "Moves the character North.\nUsage: a K";
  }
}
