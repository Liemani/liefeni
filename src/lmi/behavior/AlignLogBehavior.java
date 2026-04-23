package lmi.behavior;

import lmi.AgentContext;
import lmi.LMIException;
import lmi.task.MoveTask;
import lmi.task.LiftTask;
import lmi.task.PutTask;

import haven.Coord;
import haven.Gob;
import static lmi.Constant.ExceptionReason.*;

public class AlignLogBehavior {
  public void run(AgentContext ctx, Coord root, Coord trunk, Coord branch, Coord leaf, Gob targetLog) {
    if (!new MoveTask(root, true).execute(ctx)) throw new LMIException(ER_FAIL);
    if (!new LiftTask(targetLog).execute(ctx)) throw new LMIException(ER_LIFT);
    if (!new MoveTask(root, true).execute(ctx)) throw new LMIException(ER_FAIL);
    if (!new MoveTask(trunk, true).execute(ctx)) throw new LMIException(ER_FAIL);
    if (!new MoveTask(branch, true).execute(ctx)) throw new LMIException(ER_FAIL);
    if (!new PutTask(leaf).execute(ctx)) throw new LMIException(ER_PUT);
    if (!new MoveTask(trunk, true).execute(ctx)) throw new LMIException(ER_FAIL);
  }
}
