package agent.tool.waypoint;

import agent.Job;

import lmi.runtime.AgentContext;
import lmi.bridge.Api;

public class NavigateJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    Api.message("NavigateJob is not implemented for the new wp_graph schema yet.");
  }

  public static String info() {
    return "Not implemented yet for the new wp_graph schema.";
  }
}
