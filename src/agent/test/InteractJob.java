package agent.test;

import agent.Job;

import lmi.core.AtomicAction;
import lmi.bridge.Api;
import lmi.runtime.AgentContext;
import lmi.core.GobFinder;
import haven.Gob;

public class InteractJob extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    final Gob gob = (args.length >= 3) ? GobFinder.closestOf(args[2]) : GobFinder.closest();
    AtomicAction.interact(gob.id(), gob.position());
  }

  public static String info() {
    return "Interacts with the closest gob.\nUsage: a Interact [resource_name]";
  }
}
