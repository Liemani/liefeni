package lmi.task;

import haven.Coord;
import lmi.Api;
import lmi.AgentContext;
import lmi.LMIException;
import static lmi.Constant.ExceptionReason.*;

public class PutTask implements Task {
  private final Coord dest;

  public PutTask(Coord dest) {
    this.dest = dest;
  }

  @Override
  public boolean execute(AgentContext ctx) {
    try {
      Api.forcePut(dest);
      return true;
    } catch (LMIException e) {
      if (e.reason == ER_INTERRUPTED) {
        throw e;
      }
      if (e.reason == ER_PUT) {
        return false;
      }
      throw e;
    }
  }
}
