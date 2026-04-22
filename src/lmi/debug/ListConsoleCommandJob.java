package lmi.debug;
import lmi.Job;

import lmi.Api;
import lmi.Util;
import lmi.AgentContext;

public class ListConsoleCommandJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.message("console command:");
    for (String command : Util.consoleCommands())
      Api.message("  " + command);
  }

  public static String info() {
    return "Lists all registered console commands.\nUsage: a ListConsoleCommand";
  }
}
