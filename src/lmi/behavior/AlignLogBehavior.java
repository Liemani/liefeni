package lmi.behavior;

import lmi.AgentContext;
import lmi.task.MoveTask;
import lmi.task.LiftTask;
import lmi.task.PutTask;

import haven.Coord;
import haven.Gob;

public class AlignLogBehavior {
  public void run(AgentContext ctx, Coord root, Coord trunk, Coord branch, Coord leaf, Gob targetLog) {
    new MoveTask(root, true).execute(ctx);
    new LiftTask(targetLog).execute(ctx);
    new MoveTask(root, true).execute(ctx);
    new MoveTask(trunk, true).execute(ctx);
    new MoveTask(branch, true).execute(ctx);
    new PutTask(leaf).execute(ctx);
    new MoveTask(trunk, true).execute(ctx);
  }
}
