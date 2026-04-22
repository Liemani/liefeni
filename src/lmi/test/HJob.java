package lmi.test;
import lmi.Job;

import lmi.Api;
import lmi.AgentContext;

public class HJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.moveWest();
  }

  public static String info() {
    return "Moves the character West.\nUsage: a H";
  }
}
