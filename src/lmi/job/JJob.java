package lmi.job;

import lmi.Api;
import lmi.AgentContext;

public class JJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveSouth();
  }

  public static String man() {
    return "Moves the character South.\nUsage: a J";
  }
}
