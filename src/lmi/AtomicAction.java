package lmi;

import haven.Coord;
import haven.Gob;

import static lmi.Constant.*;
import static lmi.Constant.Action.*;
import static lmi.Constant.ExceptionReason.*;
import static lmi.Constant.Timeout.*;

public final class AtomicAction {
  private AtomicAction() {}

  public static void interact(Gob gob) {
    Interaction.click(gob, 3, 0, 0, 0, -1);
  }

  public static void move(Coord coord) {
    Interaction.click(coord, 1, 0);
    Self.gob().waitMove(coord);
  }

  public static void forceMove(Coord coord) {
    for (int retry = 0; retry < RETRY_MAX; ++retry) {
      try {
        move(coord);
        return;
      } catch (LMIException e) {
        if (e.reason != ER_FAIL) throw e;
      }
      WaitManager.sleep(TO_RETRY);
    }
    throw new LMIException(ER_FAIL);
  }

  public static void lift(Gob gob) {
    AppContext.menuGrid().wdgmsg(Constant.Message.M_ACT, A_CARRY, 0);
    Interaction.click(gob, 1, 0, 0, 0, 0);
    try {
      Self.gob().waitMove();
    } catch (LMIException e) {
      if (e.reason != ER_FAIL) throw e;
    }
    Self.gob().waitLift(gob);
  }

  public static void forceLift(Gob gob) {
    for (int retry = 0; retry < RETRY_MAX; ++retry) {
      try {
        lift(gob);
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

  public static boolean move(Coord coord, boolean force, AgentContext ctx) {
    try {
      if (force) forceMove(coord);
      else move(coord);
      if (ctx != null) ctx.pushBreadcrumb(coord);
      return true;
    } catch (LMIException e) {
      if (e.reason == ER_INTERRUPTED) throw e;
      if (e.reason == ER_FAIL || e.reason == ER_MOVE) return false;
      throw e;
    }
  }

  public static boolean lift(Gob gob, AgentContext ctx) {
    try {
      forceLift(gob);
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
}
