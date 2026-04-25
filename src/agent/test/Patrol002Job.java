package agent.test;

import agent.Job;

import lmi.AtomicAction;
import lmi.Array;
import lmi.Self;
import lmi.AgentContext;
import static lmi.Constant.*;

public class Patrol002Job extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    haven.Coord firstPoint = Self.position().add(0, -TILE_IN_COORD);
    haven.Coord secondPoint = Self.position().add(TILE_IN_COORD, 0);

    while (true) {
      AtomicAction.go(firstPoint);
      lmi.WaitManager.sleep(2000);
      AtomicAction.go(secondPoint);
      lmi.WaitManager.sleep(2000);
    }
  }

  public static String info() {
    return "Square patrol test.\nUsage: a Patrol002";
  }
}
