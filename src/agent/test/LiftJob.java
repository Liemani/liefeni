package agent.test;

import agent.Job;

import lmi.Api;
import lmi.AgentContext;

public class LiftJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (args.length >= 3)
      Api.lift(Api.closestGobOf(args[2]));
    else
      Api.lift(Api.closestGob());
  }

  public static String info() {
    return "Lifts the closest gob.\nUsage: a Lift [resource_name]";
  }
}
