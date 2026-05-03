package agent.test;

import agent.Job;

import lmi.AtomicAction;
import lmi.Api;
import lmi.AgentContext;
import lmi.GobFinder;
import haven.Gob;

public class LiftJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    final Gob gob = (args.length >= 3) ? GobFinder.closestOf(args[2]) : GobFinder.closest();
    AtomicAction.lift(gob.id(), gob.position());
  }

  public static String info() {
    return "Lifts the closest gob.\nUsage: a Lift [resource_name]";
  }
}
