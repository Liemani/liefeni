package lmi;

import haven.Coord;
import haven.Gob;

import static lmi.Constant.*;
import static lmi.Constant.Action.*;
import static lmi.Constant.ExceptionReason.*;
import static lmi.Constant.Timeout.*;

public final class AtomicAction {
  private AtomicAction() {}

  public static void interact(long gobId, Coord gobPosition) {
    Interaction.click(gobId, gobPosition, 3, 0, 0, 0, -1);
  }

  public static void enter(long doorId, Coord doorPosition, int meshId) {
    double x = AppContext.mapView().cc.x;
    Interaction.click(doorId, doorPosition, 3, 0, 0, 0, meshId);

    while (Math.abs(AppContext.mapView().cc.x - x) < 1000) {
      WaitManager.sleepPolling();
    }
  }

  public static void go(Coord coord) {
    final Gob self = Self.gob();

    Interaction.click(coord, 1, 0);
    WaitManager.waitResponse();

    while (self.isMoving()) {
      WaitManager.sleepPolling();
    }

    if (!self.isAt(coord)) {
      throw new LMIException(ER_FAIL);
    }
  }

  public static void forceGo(Coord coord) {
    for (int retry = 0; retry < RETRY_MAX; ++retry) {
      try {
        go(coord);
        return;
      } catch (LMIException e) {
        if (e.reason != ER_FAIL) throw e;
      }
      WaitManager.sleep(TO_RETRY);
    }
    throw new LMIException(ER_FAIL);
  }

  public static void lift(long gobId, Coord gobPosition) {
    AppContext.menuGrid().wdgmsg(Constant.Message.M_ACT, A_CARRY, 0);
    Interaction.click(gobId, gobPosition, 1, 0, 0, 0, 0);
    try {
      Self.gob().waitMove();
    } catch (LMIException e) {
      if (e.reason != ER_FAIL) throw e;
    }
    Self.gob().waitLift(_gob(gobId));
  }

  public static void forceLift(long gobId, Coord gobPosition) {
    for (int retry = 0; retry < RETRY_MAX; ++retry) {
      try {
        lift(gobId, gobPosition);
        return;
      } catch (LMIException e) {
        if (e.reason != ER_LIFT) throw e;
      }
      WaitManager.sleep(TO_RETRY);
    }
    throw new LMIException(ER_LIFT);
  }

  public static void put(Coord coord) {
    Interaction.click(coord, 3, 0);
    try {
      Self.gob().waitMove();
    } catch (LMIException e) {
      if (e.reason != ER_FAIL) throw e;
    }
    Self.gob().waitPut();
  }

  public static void forcePut(Coord coord) {
    for (int retry = 0; retry < RETRY_MAX; ++retry) {
      try {
        put(coord);
        return;
      } catch (LMIException e) {
        if (e.reason != ER_PUT) throw e;
      }
      WaitManager.sleep(TO_RETRY);
    }
    throw new LMIException(ER_PUT);
  }

  public static boolean go(Coord coord, boolean force, AgentContext ctx) {
    try {
      if (force) forceGo(coord);
      else go(coord);
      if (ctx != null) ctx.pushBreadcrumb(coord);
      return true;
    } catch (LMIException e) {
      if (e.reason == ER_INTERRUPTED) throw e;
      if (e.reason == ER_FAIL || e.reason == ER_MOVE) return false;
      throw e;
    }
  }

  public static boolean lift(long gobId, Coord gobPosition, AgentContext ctx) {
    try {
      forceLift(gobId, gobPosition);
      return true;
    } catch (LMIException e) {
      if (e.reason == ER_INTERRUPTED) throw e;
      if (e.reason == ER_LIFT) return false;
      throw e;
    }
  }

  public static boolean put(Coord coord, AgentContext ctx) {
    try {
      forcePut(coord);
      return true;
    } catch (LMIException e) {
      if (e.reason == ER_INTERRUPTED) throw e;
      if (e.reason == ER_PUT) return false;
      throw e;
    }
  }

  private static Gob _gob(long gobId) {
    Gob gob = AppContext.oCache().getgob(gobId);
    if (gob == null) throw new LMIException(ER_FAIL);
    return gob;
  }
}
