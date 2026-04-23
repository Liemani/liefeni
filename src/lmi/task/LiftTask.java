package lmi.task;

import haven.Gob;
import lmi.Api;
import lmi.AgentContext;
import lmi.LMIException;
import static lmi.Constant.ExceptionReason.*;

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
    } catch (LMIException e) {
      if (e.reason == ER_INTERRUPTED) {
        throw e;
      }
      if (e.reason == ER_LIFT) {
        return false;
      }
      throw e;
    }
  }
}
