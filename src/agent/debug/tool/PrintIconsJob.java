package agent.debug.tool;

import agent.Job;

import lmi.AgentContext;
import lmi.Util;
import lmi.MenuGridProxy;

public class PrintIconsJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    MenuGridProxy.dumpAllIcons();
  }

  public static String info() {
    return "Prints all Resource IDs and Paths currently in the MenuGrid.\nUsage: a PrintIcons";
  }
}
