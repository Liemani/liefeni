package agent.test;

import agent.Job;

import lmi.AtomicAction;
import lmi.Api;
import lmi.AgentContext;

public class LiftJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    if (args.length >= 3)
      AtomicAction.lift(Api.closestGobOf(args[2]));
    else
      AtomicAction.lift(Api.closestGob());
  }

  public static String info() {
    return "Lifts the closest gob.\nUsage: a Lift [resource_name]";
  }
}
