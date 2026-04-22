package lmi;

import haven.*;

import static lmi.Constant.*;
import static lmi.Constant.Timeout.*;
import static lmi.Constant.ExceptionReason.*;

public class WidgetManager {
  public static GItem cursorGItem() {
    Widget child = AppContext.gameUI.child;
    while (child != null) {
      if (child instanceof GItem)
        return (GItem)child;
      child = child.next;
    }

    return null;
  }

  public static MenuGrid menuGrid() {
    return AppContext.menuGrid;
  }

  public static Indir<Resource> cursor() {
    return AppContext.rootWidget.cursor;
  }

  public static GameUI gameUI() { return (GameUI)AppContext.rootWidget.child; }
  public static ChatUI chatUI() { return WidgetManager.gameUI().getChildOf(ChatUI.class); }
  public static Window window() { return WidgetManager.gameUI().getChildOf(Window.class); }
  public static Button button() { return WidgetManager.window().getChildOf(Button.class); }
  public static ISBox isbox() { return WidgetManager.window().getChildOf(ISBox.class); }
  public static Inventory inventory() { return WidgetManager.window().getChildOf(Inventory.class); }
  public static GItem gitem() { return WidgetManager.inventory().getChildOf(GItem.class); }
  public static WItem witem() { return WidgetManager.inventory().getChildOf(WItem.class); }
}
