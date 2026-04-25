package lmi;

import java.util.function.Predicate;

import haven.*;

import lmi.*;
import static lmi.Constant.*;
import static lmi.Constant.ExceptionReason.*;
import static lmi.Constant.Timeout.*;
import static lmi.Constant.Action.*;
import static lmi.Constant.Plan.*;
import static lmi.Constant.WindowTitle.*;
import static lmi.Constant.Message.*;

public class Api {
  /// - Throws: ER_INTERRUPTED
  ///     - ER_FAIL
  ///     - ER_NO_PATH
  public static void pathfindMove(Gob gob) { Pathfinder.move(gob); }
  public static void pathfindMove(Coord coord) { Pathfinder.move(coord); }

  /// - Throws: ER_INTERRUPTED
  ///     - ER_FAIL
  ///     - ER_NO_PATH
  public static Gob pathfindMove(Array<Gob> gobArray) {
    for (Gob gob : gobArray) {
      try {
        Api.pathfindMove(gob);
        return gob;
      } catch (LMIException e) {
        if (e.reason == ER_NO_PATH) continue;
        else throw e;
      }
    }
    throw new LMIException(ER_NO_PATH);
  }

  /// - Throws: ER_INTERRUPTED
  ///     - ER_FAIL
  ///     - ER_NO_PATH
  ///     - ER_NO_INPUT
  public static void pathfindTakeItemFromStockpileArray(Array<Gob> stockpileArray, int count) {
    for (Gob stockpile : stockpileArray) {
      try {
        count -= Api.pathfindTakeItemFromStockpile(stockpile, count);
        if (count == 0) return;
      } catch (LMIException e) {
        if (e.reason == ER_NO_PATH) continue;
        else throw e;
      }
    }

    if (stockpileArray.count() == 0)
      throw new LMIException(ER_NO_INPUT);
    else
      throw new LMIException(ER_NO_PATH);
  }

  /// - Throws: ER_INTERRUPTED
  ///     - ER_FAIL
  ///     - ER_NO_PATH
  ///     - ER_NO_INPUT
  public static void pathfindTakeItemFromContainerArray(Array<Gob> containerArray, String[] nameSet, int count) {
    for (Gob container : containerArray) {
      try {
        count -= pathfindTakeItemFromContainer(container, nameSet, count);
        if (count == 0) return;
      } catch (LMIException e) {
        if (e.reason == ER_NO_PATH) continue;
        else throw e;
      }
    }
    if (containerArray.count() == 0)
      throw new LMIException(ER_NO_INPUT);
    else
      throw new LMIException(ER_NO_PATH);
  }

  /// - Throws: ER_INTERRUPTED
  ///     - ER_FAIL
  ///     - ER_NO_PATH
  public static int pathfindTakeItemFromStockpile(Gob stockpile, int count) {
    Pathfinder.move(stockpile);
    return Api.takeItemFromStockpile(stockpile, count);
  }

  /// - Throws: ER_INTERRUPTED
  ///     - ER_FAIL
  ///     - ER_NO_PATH
  public static int pathfindTakeItemFromContainer(Gob container, String[] nameSet, int count) {
    final Window window = Api.openGobWindow(container);
    return takeItemFromContainer(container, nameSet, count);
  }

  /// - Throws: ER_INTERRUPTED
  ///     - ER_FAIL
  ///     - ER_WINDOW_OPEN
  public static int takeItemFromStockpile(Gob stockpile, int count) {
    final Window window = Api.openGobWindow(stockpile);
    return Api.takeItemFromIsbox(window.getChildOf(ISBox.class), count);
  }

  /// - Throws: ER_INTERRUPTED
  ///     - ER_FAIL
  ///     - ER_WINDOW_OPEN
  public static int takeItemFromContainer(Gob container, String[] genericArray, int count) {
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
  /// - Throws: ER_INTERRUPTED
  static void planObject(String planName) {
    AppContext.menuGrid().wdgmsg(M_ACT, A_BP, planName, 0);
    while (!AppContext.mapView().isPlanningObject())
      WaitManager.sleep(TO_RETRY);
  }

  /// - Throws: ER_INTERRUPTED
  ///     - ER_DECIDE_PLAN
  public static Window planAndDecideObject(String planName, Coord location, int direction) {
    Api.planObject(planName);
//    ErrorMessageManager.clear();
    Api.decidePlan(location, direction);
    for (int retry = 0; retry < RETRY_MAX; ++retry) {
      final Window window = AppContext.window();
      if (window != null)
        return window;
      else {
        WaitManager.sleep(TO_RETRY);
//        if (ErrorMessageManager.message() != null)
          Api.decidePlan(location, direction);
      }
    }
    if (AppContext.mapView().isPlanningObject())
      Interaction.place(Self.position(), D_EAST, 3, 0);
    throw new LMIException(ER_DECIDE_PLAN);
  }

  /// - Throws: ER_INTERRUPTED 
  public static void decidePlan(Coord location, int direction) {
    Interaction.place(location, direction, 1, 0);
  }

  /// - Throws: ER_INTERRUPTED
  ///     - ER_DECIDE_PLAN
  public static void build(String planName, Coord location, int direction) {
    final Window window = planAndDecideObject(planName, location, direction);
    final Button button = window.getChildOf(Button.class);
    Interaction.activate(button);
    Self.gob().waitBuild();
  }

  // Interact Gob
  /// Interact with stockpile or container
  /// - Throws: ER_INTERRUPTED
  public static Window openGobWindow(Gob gob) {
    while (true) {
      AtomicAction.interact(gob);
      final Window window = AppContext.window();
      if (window != null)
        return window;
      else
        WaitManager.sleep(TO_RETRY);
    }
  }

  /// - Return: count of item taken
  /// - Throws: ER_INTERRUPTED
  public static int takeItemFromIsbox(ISBox isbox, int count) {
    final int transferCount = Math.min(count, isbox.count());
    for (int i = 0; i < transferCount; ++i)
      isbox.transfer();
    return transferCount;
  }

  /// - Throws: ER_INTERRUPTED
  ///     - ER_FAIL
  public static void moveNorth() { AtomicAction.move(Self.position().north()); }
  public static void moveEast() { AtomicAction.move(Self.position().east()); }
  public static void moveWest() { AtomicAction.move(Self.position().west()); }
  public static void moveSouth() { AtomicAction.move(Self.position().south()); }
  public static void moveCenter() { AtomicAction.move(Self.position().center()); }

  // Get Gob
  /// - Throws: ER_INTERRUPTED
  public static Gob closestGobIn(Array<Gob> gobArray) {
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

  /// - Throws: ER_INTERRUPTED
  public static Gob closestGob() {
    final Array<Gob> gobArray = Api.gobArrayWhere(gob -> gob != Self.gob());
    return Api.closestGobIn(gobArray);
  }

  /// - Throws: ER_INTERRUPTED
  public static Gob closestGobOf(String name) {
    final Array<Gob> gobArray = Api.gobArrayWhere(gob -> gob.resourceName().endsWith(name));
    return Api.closestGobIn(gobArray);
  }

  /// - Throws: ER_INTERRUPTED
  public static Gob getGob() { return ClickManager.getGob(); }

  // Get Gob Array
  /// - Throws: ER_INTERRUPTED
  public static Array<Gob> gobArray() {
    Array<Gob> gobArray = new Array<Gob>();

    for (Gob gob : AppContext.oCache().gobArray())
      if (gob.resource() != null)
        gobArray.append(gob);

    return gobArray;
  }

  /// - Throws: ER_INTERRUPTED
  public static Array<Gob> gobArrayWhere(Predicate<Gob> predicate) {
    Array<Gob> gobArray = new Array<Gob>();

    for (Gob gob : AppContext.oCache().gobArray()) {
      if (gob.resource() == null) continue;
      else if (predicate.test(gob)) gobArray.append(gob);
    }
    return gobArray;
  }

  /// - Throws: ER_INTERRUPTED
  public static Array<Gob> gobArrayIn(Rect area) {
    return Api.gobArrayWhere(gob -> area.contains(gob.position()));
  }

  /// - Throws: ER_INTERRUPTED
  public static Array<Gob> getGobArrayInArea() {
    final Rect area = ClickManager.getArea();
    return Api.gobArrayIn(area);
  }

  // Get Area
  /// - Throws: ER_INTERRUPTED
  public static Rect getArea() { return ClickManager.getArea(); }

  // Print Message to Console
  /// - Throws: ER_INTERRUPTED
  public static void error(String message) { AppContext.gameUI().error(message); }
  public static void alert(String message) { AppContext.gameUI().alert(message); }
  public static void message(String message) {
    if (AppContext.gameUI() != null) {
      AppContext.gameUI().print(message);
    }
  }

  // ISBox
  /// - Throws: ER_INTERRUPTED
  public static void pressButton() { Interaction.activate(AppContext.button()); }

  // Inventory
  /// - Throws: ER_INTERRUPTED
  public static Inventory inventory() { return AppContext.inventory(); }

  /// - Throws: ER_INTERRUPTED
  public static void transferItem(Array<GItem> itemArray) {
    for (GItem item : itemArray) {
      Interaction.transfer(item, 1);
    }
  }

  /// - Throws: ER_INTERRUPTED
  //      public static Array<GItem> getItemArray(String name, int count) {
  //          // TODO fix this with considering real implementation of BuildDryingFrame
  //          Widget child = AppContext.inventory().child;
  //          while (count != 0 && child != null) {
  //              if (child instanceof GItem) {
  //                  child.wdgmsg("transfer", Coord.zero(), IM_LEFT);
  //                  --count;
  //              }
  //              child = child.next;
  //          }
  //          return new Array<GItem>();
  //      }

}
