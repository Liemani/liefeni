package agent.debug.tool;

import agent.Job;

import lmi.bridge.Api;
import lmi.core.Util;
import lmi.runtime.AgentContext;

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
