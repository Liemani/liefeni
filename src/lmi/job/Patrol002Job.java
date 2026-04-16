package lmi.job;

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
      lmi.Api.move(firstPoint);
      lmi.WaitManager.sleep(2000);
      lmi.Api.move(secondPoint);
      lmi.WaitManager.sleep(2000);
    }
  }

  public static String man() {
    return "Square patrol test.\nUsage: a Patrol002";
  }
}
