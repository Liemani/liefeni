package agent.test;

import agent.Job;

import lmi.core.AtomicAction;
import lmi.bridge.Api;
import lmi.runtime.AgentContext;
import lmi.core.GobFinder;
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
