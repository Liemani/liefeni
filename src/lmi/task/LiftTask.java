package lmi.task;

import haven.Gob;
import lmi.Api;
import lmi.AgentContext;

public class LiftTask implements Task {
  private final Gob target;

  public LiftTask(Gob target) {
    this.target = target;
  }

  @Override
  public boolean execute(AgentContext ctx) {
    try {
      Api.forceLift(target);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
