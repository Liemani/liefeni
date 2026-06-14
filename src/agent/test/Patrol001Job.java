package agent.test;

import agent.Job;

import lmi.core.Array;
import lmi.core.AtomicAction;
import lmi.core.LocalPlayer;
import lmi.runtime.AgentContext;
import static lmi.core.Constant.*;

public class Patrol001Job extends Job {
  private Array<haven.Coord> _path = new Array<>();

  @Override
  public void run(AgentContext ctx, String[] args) {
    if (_path.isEmpty()) {
      _path.append(LocalPlayer.position());
      _path.append(LocalPlayer.position().add(0, -TILE_IN_COORD));
    }

    while (true) {
      for (haven.Coord location : _path) {
        AtomicAction.go(location);
        lmi.runtime.WaitManager.sleep(1000);
      }
    }
  }

  public static String info() {
    return "Northward patrol test.\nUsage: a Patrol001";
  }
}
