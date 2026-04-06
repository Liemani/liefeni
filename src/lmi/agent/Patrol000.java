package lmi.agent;

import lmi.Array;
import lmi.Self;
import lmi.AgentManager;
import lmi.AgentContext;
import static lmi.Constant.*;

public class Patrol000 extends AgentManager.Agent {
  private Array<haven.Coord> _path;

  @Override
  public void run(String[] args) {
    // Legacy style wrapped in run
    clearPath();
    _path.append(Self.position());
    _path.append(Self.position().add(TILE_IN_COORD, 0));

    while (true) {
      for (haven.Coord location : _path) {
        lmi.Api.move(location);
        lmi.Api.sleep(1000);
      }
    }
  }

  private void clearPath() {
    if (_path == null)
      _path = new Array<haven.Coord>();
    _path.removeAll();
  }

  public static String man() {
    return "Patrol000\nDescription: Simple patrol test.";
  }
}
