package lmi.agent;

import lmi.Array;
import lmi.Self;
import lmi.AgentManager;
import lmi.AgentContext;
import static lmi.Constant.*;

public class Patrol002 extends AgentManager.Agent {
  private Array<haven.Coord> _path;

  @Override
  public void run(String[] args) {
    clearPath();
    haven.Coord firstPoint = Self.position().add(0, -TILE_IN_COORD);
    haven.Coord secondPoint = Self.position().add(TILE_IN_COORD, 0);

    while (true) {
      lmi.Api.move(firstPoint);
      lmi.Api.sleep(2000);
      lmi.Api.move(secondPoint);
      lmi.Api.sleep(2000);
    }
  }

  private void clearPath() {
    if (_path == null)
      _path = new Array<haven.Coord>();
    _path.removeAll();
  }

  public static String man() {
    return "Patrol002\nDescription: Square patrol test.";
  }
}
