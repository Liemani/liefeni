package lmi.automation;

import lmi.Array;
import lmi.Self;
import lmi.AutomationManager.Automation;
import static lmi.Constant.*;
import static lmi.Constant.ExceptionType.*;

public class Patrol002 extends Automation {
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
  }

  private void clearPath() {
    if (_path == null)
      _path = new Array<haven.Coord>();
    _path.removeAll();
  }

  public void patrolPath() throws InterruptedException {
    haven.Coord firstPoint = Self.position().add(0, -TILE_IN_COORD);
    haven.Coord secondPoint = Self.position().add(TILE_IN_COORD, 0);
    lmi.Api.move(firstPoint);
    lmi.Api.sleep(2000);
    lmi.Api.move(secondPoint);
    lmi.Api.sleep(2000);
  }

  public static String man() {
    return "Patrol002\nDescription: Simple patrol test.";
  }
}
