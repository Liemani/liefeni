package lmi.job;

import lmi.Api;
import lmi.WidgetManager;
import lmi.AgentContext;

public class Test001Job extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.message(WidgetManager.isbox().text());
  }

  public static String man() {
    return "Test 001: Prints isbox text.\nUsage: a Test001";
  }
}
