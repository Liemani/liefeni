package lmi.automation;

import lmi.Array;
import lmi.Self;
import lmi.AutomationManager.Automation;
import static lmi.Constant.*;
import static lmi.Constant.ExceptionType.*;

public class Patrol000 extends Automation {
  private Array<haven.Coord> _path;

  public void run() {
    willRun();

    try {
      while (true)
        patrolPath();
    } catch (lmi.LMIException e) {
      if (e.type != ET_INTERRUPTED) throw e;
    } catch (Exception e) { e.printStackTrace(); }
  }

  private void willRun() {
    clearPath();
    _path.append(Self.location());
    _path.append(Self.location().add(TILE_IN_COORD, 0));
  }

  private void clearPath() {
    if (_path == null)
      _path = new Array<haven.Coord>();
    _path.removeAll();
  }

  public void patrolPath() throws InterruptedException {
    for (haven.Coord location : _path) {
      lmi.Api.move(location);
      lmi.Api.sleep(1000);
    }
  }

  public static String man() {
    return "Patrol000\nDescription: Simple patrol test.";
  }
}
