package lmi.test;
import lmi.Job;

import lmi.Api;
import lmi.WidgetManager;
import lmi.AgentContext;

public class Test002Job extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.message("" + WidgetManager.isbox().count());
  }

  public static String info() {
    return "Test 002: Prints isbox count.\nUsage: a Test002";
  }
}
