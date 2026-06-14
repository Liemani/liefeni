package agent.test;

import agent.Job;

import lmi.core.AtomicAction;
import lmi.core.Array;
import lmi.core.LocalPlayer;
import lmi.runtime.AgentContext;
import static lmi.core.Constant.*;

public class Patrol002Job extends Job {
  @Override
  public void run(AgentContext ctx, String[] args) {
    haven.Coord firstPoint = LocalPlayer.position().add(0, -TILE_IN_COORD);
    haven.Coord secondPoint = LocalPlayer.position().add(TILE_IN_COORD, 0);

    while (true) {
      AtomicAction.go(firstPoint);
      lmi.runtime.WaitManager.sleep(2000);
      AtomicAction.go(secondPoint);
      lmi.runtime.WaitManager.sleep(2000);
    }
  }

  public static String info() {
    return "Square patrol test.\nUsage: a Patrol002";
  }
}
