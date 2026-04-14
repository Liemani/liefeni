package lmi;

import java.util.function.Predicate;

import haven.*;

import lmi.*;
import static lmi.Constant.*;
import static lmi.Constant.Input.Mouse.*;
import static lmi.Constant.Input.Modifier.*;
import static lmi.Constant.ExceptionType.*;
import static lmi.Constant.TimeOut.*;
import static lmi.Constant.Action.*;
import static lmi.Constant.Plan.*;
import static lmi.Constant.WindowTitle.*;
import static lmi.Constant.Message.*;

public class Api {
  public static void interact(Gob gob) throws InterruptedException {
    WidgetMessageHandler.click(gob, IM_RIGHT, IM_NONE);
  }

  /// - Throws:
  ///     - ET_MOVE
  public static void move(Coord coord) throws InterruptedException {
    _sendMoveMessage(coord);
    Self.gob().waitMove(coord);
  }

  /// - Throws:
  ///     - ET_MOVE
  public static void forceMove(Coord coord) throws InterruptedException {
    for (int retry = 0; retry < RETRY_MAX; ++retry) {
      try {
        Api.move(coord);
        return;
      } catch (LMIException e) { if (e.type != ET_MOVE) throw e; }
      Api.sleep(TO_RETRY);
    }
    throw new LMIException(ET_MOVE);
  }

  /// - Throws:
  ///     - ET_MOVE
  ///     - ET_NO_PATH
  public static void pathfindMove(Gob gob) throws InterruptedException { Pathfinder.move(gob); }
  public static void pathfindMove(Coord coord) throws InterruptedException { Pathfinder.move(coord); }

  /// - Throws:
  ///     - ET_MOVE
  ///     - ET_NO_PATH
  public static Gob pathfindMove(Array<Gob> gobArray) throws InterruptedException {
    for (Gob gob : gobArray) {
      try {
        Api.pathfindMove(gob);
        return gob;
      } catch (LMIException e) {
        if (e.type == ET_NO_PATH) continue;
        else throw e;
      }
    }
    throw new LMIException(ET_NO_PATH);
  }

  /// - Throws:
  ///     - ET_MOVE
  ///     - ET_NO_PATH
  ///     - ET_NO_INPUT
  public static void pathfindTakeItemFromStockpileArray(Array<Gob> stockpileArray, int count) throws InterruptedException {
    for (Gob stockpile : stockpileArray) {
      try {
        count -= Api.pathfindTakeItemFromStockpile(stockpile, count);
        if (count == 0) return;
      } catch (LMIException e) {
        if (e.type == ET_NO_PATH) continue;
        else throw e;
      }
    }

    if (stockpileArray.count() == 0)
      throw new LMIException(ET_NO_INPUT);
    else
      throw new LMIException(ET_NO_PATH);
  }

  /// - Throws:
  ///     - ET_MOVE
  ///     - ET_NO_PATH
  ///     - ET_NO_INPUT
  public static void pathfindTakeItemFromContainerArray(Array<Gob> containerArray, String[] nameSet, int count) throws InterruptedException {
    for (Gob container : containerArray) {
      try {
        count -= pathfindTakeItemFromContainer(container, nameSet, count);
        if (count == 0) return;
      } catch (LMIException e) {
        if (e.type == ET_NO_PATH) continue;
        else throw e;
      }
    }
    if (containerArray.count() == 0)
      throw new LMIException(ET_NO_INPUT);
    else
      throw new LMIException(ET_NO_PATH);
  }

  /// - Throws:
  ///     - ET_MOVE
  ///     - ET_NO_PATH
  public static int pathfindTakeItemFromStockpile(Gob stockpile, int count) throws InterruptedException {
    Pathfinder.move(stockpile);
    return Api.takeItemFromStockpile(stockpile, count);
  }

  /// - Throws:
  ///     - ET_MOVE
  ///     - ET_NO_PATH
  public static int pathfindTakeItemFromContainer(Gob container, String[] nameSet, int count) throws InterruptedException {
    final Window window = Api.openGobWindow(container);
    return takeItemFromContainer(container, nameSet, count);
  }

  /// - Throws:
  ///     - ET_MOVE
  ///     - ET_WINDOW_OPEN
  public static int takeItemFromStockpile(Gob stockpile, int count) throws InterruptedException {
    final Window window = Api.openGobWindow(stockpile);
    return Api.takeItemFromIsbox(window.getChildOf(ISBox.class), count);
  }

  /// - Throws:
  ///     - ET_MOVE
  ///     - ET_WINDOW_OPEN
  public static int takeItemFromContainer(Gob container, String[] genericArray, int count) throws InterruptedException {
    final Window window = Api.openGobWindow(container);
    final Inventory inventory = window.getChildOf(Inventory.class);
    Widget child = inventory.child;
    int transferedItemCount = 0;
    while (child != null) {
      if (child instanceof GItem) {
        final GItem item = (GItem)child;
        for (String element : genericArray) {
          if (item.isResourceNameEndsWith(element)) {
            item.transfer();
            ++transferedItemCount;
            if (transferedItemCount == count)
              return count;
            break;
          }
        }
      }
      child = child.next;
    }
    return transferedItemCount;
  }

  // Plan object
  static void planObject(String planName) throws InterruptedException {
    WidgetManager.menuGrid().sendMessage(M_ACT, A_BP, planName, 0);
    while (!AppContext.mapView.isPlanningObject())
      Api.sleep(TO_RETRY);
  }

  /// - Throws:
  ///     - ET_DECIDE_PLAN
  public static Window planAndDecideObject(String planName, Coord location, int direction) throws InterruptedException {
    Api.planObject(planName);
    ErrorMessageManager.clear();
    Api.decidePlan(location, direction);
    for (int retry = 0; retry < RETRY_MAX; ++retry) {
      final Window window = WidgetManager.window();
      if (window != null)
        return window;
      else {
        Api.sleep(TO_RETRY);
        if (ErrorMessageManager.message() != null)
          Api.decidePlan(location, direction);
      }
    }
    if (AppContext.mapView.isPlanningObject())
      WidgetMessageHandler.sendCancelPlanMessage();
    throw new LMIException(ET_DECIDE_PLAN);
  }

  public static void decidePlan(Coord location, int direction) throws InterruptedException {
    WidgetMessageHandler.sendPlaceMessage(location, direction, IM_LEFT, IM_NONE);
  }

  /// - Throws:
  ///     - ET_DECIDE_PLAN
  public static void build(String planName, Coord location, int direction) throws InterruptedException {
    final Window window = planAndDecideObject(planName, location, direction);
    final Button button = window.getChildOf(Button.class);
    WidgetMessageHandler.sendButtonBuildMessage(button);
    Self.gob().waitBuild();
  }

  // Interact Gob
  /// Interact with stockpile or container
  public static Window openGobWindow(Gob gob) throws InterruptedException {
    while (true) {
      Api.interact(gob);
      final Window window = WidgetManager.window();
      if (window != null)
        return window;
      else
        Api.sleep(TO_RETRY);
    }
  }

  /// - Return: count of item taken
  public static int takeItemFromIsbox(ISBox isbox, int count) throws InterruptedException {
    final int transferCount = Math.min(count, isbox.count());
    for (int i = 0; i < transferCount; ++i)
      isbox.transfer();
    return transferCount;
  }

  /// - Throws:
  ///     - ET_MOVE
  public static void moveNorth() throws InterruptedException { Api.move(Self.position().north()); }
  public static void moveEast() throws InterruptedException { Api.move(Self.position().east()); }
  public static void moveWest() throws InterruptedException { Api.move(Self.position().west()); }
  public static void moveSouth() throws InterruptedException { Api.move(Self.position().south()); }
  public static void moveCenter() throws InterruptedException { Api.move(Self.position().center()); }

  /// - Throws:
  ///     - ET_LIFT
  public static void lift(Gob gob) throws InterruptedException {
    WidgetManager.menuGrid().wdgmsg(M_ACT, A_CARRY, 0);
    _sendObjectClickMessage(gob);
    try {
      Self.gob().waitMove();
    } catch (LMIException e) { if (e.type != ET_MOVE) throw e; }
    Self.gob().waitLift(gob);
  }

  /// - Throws:
  ///     - ET_LIFT
  public static void forceLift(Gob gob) throws InterruptedException {
    for (int retry = 0; retry < RETRY_MAX; ++retry) {
      try {
        Api.lift(gob);
        return;
      } catch (LMIException e) { if (e.type != ET_LIFT) throw e; }
      Api.sleep(TO_RETRY);
    }
    throw new LMIException(ET_LIFT);
  }

  /// - Throws:
  ///     - ET_PUT
  public static void forcePut(Coord coord) throws InterruptedException {
    for (int retry = 0; retry < RETRY_MAX; ++retry) {
      try {
        Api.put(coord);
        return;
      } catch (LMIException e) { if (e.type != ET_PUT) throw e; }
      Api.sleep(TO_RETRY);
    }
    throw new LMIException(ET_PUT);
  }

  /// - Throws:
  ///     - ET_PUT
  public static void put(Coord coord) throws InterruptedException {
    _sendPutMessage(coord);
    try {
      Self.gob().waitMove();
    } catch (LMIException e) { if (e.type != ET_MOVE) throw e; }
    Self.gob().waitPut();
  }

  // Get Gob
  public static Gob closestGobIn(Array<Gob> gobArray) throws InterruptedException {
    Gob closestGob = null;
    double distanceToClosestGob = Double.MAX_VALUE;

    for (Gob gob : gobArray) {
      final double distance = Self.distance(gob);
      if (distance < distanceToClosestGob) {
        closestGob = gob;
        distanceToClosestGob = distance;
      }
    }

    return closestGob;
  }

  public static Gob closestGob() throws InterruptedException {
    final Array<Gob> gobArray = Api.gobArrayWhere(gob -> gob != Self.gob());
    return Api.closestGobIn(gobArray);
  }

  public static Gob closestGobOf(String name) throws InterruptedException {
    final Array<Gob> gobArray = Api.gobArrayWhere(gob -> gob.resourceName().endsWith(name));
    return Api.closestGobIn(gobArray);
  }

  public static Gob getGob() throws InterruptedException { return ClickManager.getGob(); }

  // Get Gob Array
  public static Array<Gob> gobArray() throws InterruptedException {
    Array<Gob> gobArray = new Array<Gob>();

    for (Gob gob : AppContext.oCache.gobArray())
      if (gob.resource() != null)
        gobArray.append(gob);

    return gobArray;
  }

  public static Array<Gob> gobArrayWhere(Predicate<Gob> predicate) throws InterruptedException {
    Array<Gob> gobArray = new Array<Gob>();

    for (Gob gob : AppContext.oCache.gobArray()) {
      if (gob.resource() == null) continue;
      else if (predicate.test(gob)) gobArray.append(gob);
    }
    return gobArray;
  }

  public static Array<Gob> gobArrayIn(Rect area) throws InterruptedException {
    return Api.gobArrayWhere(gob -> area.contains(gob.position()));
  }

  public static Array<Gob> getGobArrayInArea() throws InterruptedException {
    final Rect area = ClickManager.getArea();
    return Api.gobArrayIn(area);
  }

  // Get Area
  public static Rect getArea() throws InterruptedException { return ClickManager.getArea(); }

  // Print Message to Console
  public static void error(String message) throws InterruptedException { AppContext.gameUI.error(message); }
  public static void alert(String message) throws InterruptedException { AppContext.gameUI.alert(message); }
  public static void message(String message) throws InterruptedException {
    if (AppContext.gameUI != null) {
      AppContext.gameUI.print(message);
    }
  }

  // Etc
  public static void sleep(long microseconds) throws InterruptedException {
    Thread.sleep(microseconds);
  }

  // ISBox
  public static void pressButton() throws InterruptedException { WidgetManager.button().sendMessage(M_ACTIVATE); }

  // Inventory
  public static Inventory inventory() throws InterruptedException { return WidgetManager.inventory(); }

  public static void transferItem(Array<GItem> itemArray) throws InterruptedException {
    for (GItem item : itemArray)
      item.wdgmsg(M_TRANSFER, Coord.zero(), IM_LEFT);
  }

  //      public static Array<GItem> getItemArray(String name, int count) throws InterruptedException {
  //          // TODO fix this with considering real implementation of BuildDryingFrame
  //          Widget child = WidgetManager.inventory().child;
  //          while (count != 0 && child != null) {
  //              if (child instanceof GItem) {
  //                  child.wdgmsg("transfer", Coord.zero(), IM_LEFT);
  //                  --count;
  //              }
  //              child = child.next;
  //          }
  //          return new Array<GItem>();
  //      }

  // Private Method
  private static void _sendMoveMessage(Coord coord) throws InterruptedException {
    WidgetMessageHandler.click(coord, IM_LEFT, IM_NONE);
  }

  private static void _sendObjectClickMessage(Gob gob) throws InterruptedException {
    final Coord gobLocationInCoord = gob.position();
    WidgetMessageHandler.click(gob, IM_LEFT, IM_NONE);
  }

  private static void _sendPutMessage(Coord location) throws InterruptedException {
    WidgetMessageHandler.click(location, IM_RIGHT, IM_NONE);
  }
}
