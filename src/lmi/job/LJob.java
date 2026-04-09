package lmi.job;

import lmi.Api;
import lmi.AgentContext;

public class LJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveEast();
  }

  public static String man() {
    return "Moves the character East.\nUsage: a L";
  }
}
