package lmi.job;

import lmi.Array;
import lmi.Self;
import lmi.AgentContext;
import static lmi.Constant.*;

public class Patrol000Job extends Job {
  private Array<haven.Coord> _path = new Array<>();

  @Override
  public void run(AgentContext ctx, String[] args) {
    if (_path.isEmpty()) {
      _path.append(Self.position());
      _path.append(Self.position().add(TILE_IN_COORD, 0));
    }

    while (true) {
      for (haven.Coord location : _path) {
        lmi.Api.move(location);
        lmi.Api.sleep(1000);
      }
    }
  }

  public static String man() {
    return "Simple patrol test between two points.\nUsage: a Patrol000";
  }
}
