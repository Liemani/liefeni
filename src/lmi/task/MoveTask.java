package lmi.task;

import haven.Coord;
import lmi.Api;
import lmi.AgentContext;
import lmi.LMIException;
import static lmi.Constant.ExceptionReason.*;

public class MoveTask implements Task {
  private final Coord dest;
  private final boolean force;

  public MoveTask(Coord dest, boolean force) {
    this.dest = dest;
    this.force = force;
  }

  @Override
  public boolean execute(AgentContext ctx) {
    try {
      if (force) {
        Api.forceMove(dest);
      } else {
        Api.move(dest);
      }
      if (ctx != null) {
        ctx.pushBreadcrumb(dest);
      }
      return true;
    } catch (LMIException e) {
      if (e.reason == ER_INTERRUPTED) {
        throw e;
      }
      if (e.reason == ER_FAIL || e.reason == ER_MOVE) {
        return false;
      }
      throw e;
    }
  }
}
