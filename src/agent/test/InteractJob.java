package agent.test;

import agent.Job;

import lmi.Api;
import lmi.AgentContext;

public class InteractJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (args.length >= 3)
      Api.interact(Api.closestGobOf(args[2]));
    else
      Api.interact(Api.closestGob());
  }

  public static String info() {
    return "Interacts with the closest gob.\nUsage: a Interact [resource_name]";
  }
}
