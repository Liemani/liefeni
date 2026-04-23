package lmi;

import haven.*;
import static lmi.Constant.gfx.hud.meter.*;
import static lmi.Constant.Gauge.Index.*;

public class AppContext {
  // Fields (Accessible directly)
  public static MainFrame mainFrame;
  public static Thread mainThread;
  public static JOGLPanel joglPanel;
  public static UIPanel.Dispatcher dispatcher;
  public static RemoteUI remoteUI;
  public static UI ui;
  public static RootWidget rootWidget;
  public static GameUI gameUI;
  public static MenuGrid menuGrid;
  public static MapView mapView;
  public static Session session;
  public static IMeter[] gaugeWidgetArray;
  public static Glob glob;
  public static OCache oCache;
  public static Equipory equipory;
  public static Inventory mainInventory;

  // Unified Initialization
  public static void init() {
    WaitManager.init();
    AgentManager.init();
    Pathfinder.init();
    
    gaugeWidgetArray = new IMeter[3];
  }

  // Setters (Called from haven/*.java)
  public static void setMainFrame(MainFrame val) { mainFrame = val; }
  public static void setMainThread(Thread val) { mainThread = val; }
  public static void setJOGLPanel(JOGLPanel val) { joglPanel = val; }
  public static void setDispatcher(UIPanel.Dispatcher val) { dispatcher = val; }
  public static void setRemoteUI(RemoteUI val) { remoteUI = val; }
  public static void setUI(UI val) { ui = val; }
  public static void setRootWidget(RootWidget val) { rootWidget = val; }
  public static void setGameUI(GameUI val) { gameUI = val; }
  public static void setMenuGrid(MenuGrid val) {
    menuGrid = val;
    MenuGridProxy.init();
  }
  public static void setMapView(MapView val) { mapView = val; }
  public static void setSession(Session val) { session = val; }
  public static void setGlob(Glob val) { glob = val; }
  public static void setOCache(OCache val) { oCache = val; }
  public static void setEquipory(Equipory val) { equipory = val; }
  public static void setMainInventory(Inventory val) { mainInventory = val; }

  public static void setGaugeArray(IMeter gauge) {
    System.out.printf("gauge.resourceName(): " + gauge.resourceName() + "\n");
    final String resourceName = gauge.resourceName();
    if (resourceName.endsWith(RN_HIT_POINT))
      gaugeWidgetArray[GI_HIT_POINT] = gauge;
    else if (resourceName.endsWith(RN_STAMINA))
      gaugeWidgetArray[GI_STAMINA] = gauge;
    else if (resourceName.endsWith(RN_ENERGY))
      gaugeWidgetArray[GI_ENERGY] = gauge;
  }

  // Accessors
  public static GItem cursorGItem() {
    if (gameUI == null) return null;

    Widget child = gameUI.child;
    while (child != null) {
      if (child instanceof GItem)
        return (GItem)child;
      child = child.next;
    }
    return null;
  }

  public static MenuGrid menuGrid() { return menuGrid; }
  public static MapView mapView() { return mapView; }
  public static GameUI gameUI() { return gameUI; }
  public static RootWidget rootWidget() { return rootWidget; }
  public static UI ui() { return ui; }
  public static Session session() { return session; }
  public static OCache oCache() { return oCache; }
  public static Equipory equipory() { return equipory; }
  public static Inventory mainInventory() { return mainInventory; }

  public static Indir<Resource> cursor() {
    return (rootWidget != null) ? rootWidget.cursor : null;
  }

  public static ChatUI chatUI() {
    return (gameUI != null) ? gameUI.getChildOf(ChatUI.class) : null;
  }

  public static Window window() {
    return (gameUI != null) ? gameUI.getChildOf(Window.class) : null;
  }

  public static Button button() {
    Window window = window();
    return (window != null) ? window.getChildOf(Button.class) : null;
  }

  public static ISBox isbox() {
    Window window = window();
    return (window != null) ? window.getChildOf(ISBox.class) : null;
  }

  public static Inventory inventory() {
    Window window = window();
    return (window != null) ? window.getChildOf(Inventory.class) : null;
  }

  public static GItem gitem() {
    Inventory inventory = inventory();
    return (inventory != null) ? inventory.getChildOf(GItem.class) : null;
  }

  public static WItem witem() {
    Inventory inventory = inventory();
    return (inventory != null) ? inventory.getChildOf(WItem.class) : null;
  }

  // Helper Methods
  static Coord getMouseLocation() { return ui.mc; }
  static void interruptMainThread() { mainThread.interrupt(); }
  static void closeSession() { ui.sess.close(); }
}
