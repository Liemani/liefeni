package lmi.behavior;

import lmi.runtime.AgentContext;
import lmi.core.AtomicAction;
import lmi.core.LMIException;

import haven.Coord;
import haven.Gob;
import static lmi.core.Constant.ExceptionReason.*;

public class AlignLogBehavior {
  public void run(AgentContext ctx, Coord root, Coord trunk, Coord branch, Coord leaf, Gob targetLog) {
    if (!AtomicAction.go(root, true, ctx)) throw new LMIException(ER_FAIL);
    if (!AtomicAction.lift(targetLog.id(), targetLog.position(), ctx)) throw new LMIException(ER_LIFT);
    if (!AtomicAction.go(root, true, ctx)) throw new LMIException(ER_FAIL);
    if (!AtomicAction.go(trunk, true, ctx)) throw new LMIException(ER_FAIL);
    if (!AtomicAction.go(branch, true, ctx)) throw new LMIException(ER_FAIL);
    if (!AtomicAction.put(leaf, ctx)) throw new LMIException(ER_PUT);
    if (!AtomicAction.go(trunk, true, ctx)) throw new LMIException(ER_FAIL);
  }
}
