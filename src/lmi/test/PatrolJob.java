package lmi.test;
import lmi.Job;

import lmi.Array;
import lmi.Self;
import lmi.AgentContext;
import static lmi.Constant.*;

public class PatrolJob extends Job {
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
        lmi.WaitManager.sleep(1000);
      }
    }
  }

  public static String info() {
    return "Patrols between two points.\nUsage: a PatrolJob";
  }
}
