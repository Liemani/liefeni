package lmi.behavior;

import lmi.AgentContext;
import lmi.AtomicAction;
import lmi.LMIException;

import haven.Coord;
import haven.Gob;
import static lmi.Constant.ExceptionReason.*;

public class AlignLogBehavior {
  public void run(AgentContext ctx, Coord root, Coord trunk, Coord branch, Coord leaf, Gob targetLog) {
    if (!AtomicAction.move(root, true, ctx)) throw new LMIException(ER_FAIL);
    if (!AtomicAction.lift(targetLog, ctx)) throw new LMIException(ER_LIFT);
    if (!AtomicAction.move(root, true, ctx)) throw new LMIException(ER_FAIL);
    if (!AtomicAction.move(trunk, true, ctx)) throw new LMIException(ER_FAIL);
    if (!AtomicAction.move(branch, true, ctx)) throw new LMIException(ER_FAIL);
    if (!AtomicAction.put(leaf, ctx)) throw new LMIException(ER_PUT);
    if (!AtomicAction.move(trunk, true, ctx)) throw new LMIException(ER_FAIL);
  }
}
