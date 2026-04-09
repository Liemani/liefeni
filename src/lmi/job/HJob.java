package lmi.job;

import lmi.Api;
import lmi.AgentContext;

public class HJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveWest();
  }

  public static String man() {
    return "Moves the character West.\nUsage: a H";
  }
}
