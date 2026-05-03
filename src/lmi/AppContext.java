package lmi;

import haven.*;
import java.util.ArrayList;
import java.util.List;
import lmi.waypoint.WaypointManager;
import static lmi.Constant.gfx.hud.meter.*;

public class AppContext {
  // Process-level fields
  public static MainFrame mainFrame;
  public static Thread mainThread;
  public static JOGLPanel joglPanel;
  public static UIPanel.Dispatcher dispatcher;

  // Session-level fields
  public static RemoteUI remoteUI;
  public static UI ui;
  public static Session session;
  public static Glob glob;
  public static OCache oCache;

  // Widget-cache fields
  public static RootWidget rootWidget;
  public static GameUI gameUI;
  public static MenuGrid menuGrid;
  public static MapView mapView;
  public static List<IMeter> meterWidgets;
  public static IMeter hitPointMeter;
  public static IMeter staminaMeter;
  public static IMeter energyMeter;
  public static Equipory equipory;
  public static Inventory mainInventory;

  // Unified Initialization
  public static void init() {
    WaitManager.init();
    AgentManager.init();
    Pathfinder.init();
    RuntimeEventManager.init();
    ChatInputMonitor.clear();
    PortalMonitor.clear();
    WaypointManager.clear();

    meterWidgets = new ArrayList<>();
  }

  public static void resetWidgetCache() {
    rootWidget = null;
    gameUI = null;
    menuGrid = null;
    mapView = null;
    equipory = null;
    mainInventory = null;
    meterWidgets = new ArrayList<>();
    hitPointMeter = null;
    staminaMeter = null;
    energyMeter = null;
  }

  public static void resetSessionState() {
    remoteUI = null;
    ui = null;
    session = null;
    glob = null;
    oCache = null;
    RuntimeEventManager.clear();
    ChatInputMonitor.clear();
    PortalMonitor.clear();
    WaypointManager.clear();
    resetWidgetCache();
  }

  // Setters (Called from haven/*.java)
  public static void setMainFrame(MainFrame val) { mainFrame = val; }
  public static void setMainThread(Thread val) { mainThread = val; }
  public static void setJOGLPanel(JOGLPanel val) { joglPanel = val; }
  public static void setDispatcher(UIPanel.Dispatcher val) { dispatcher = val; }
  public static void setRemoteUI(RemoteUI val) { remoteUI = val; }
  public static void setUI(UI val) { ui = val; }
  public static void setRootWidget(RootWidget val) {
    if ((rootWidget != null) && (rootWidget != val))
      resetWidgetCache();
    rootWidget = val;
  }
  public static void setGameUI(GameUI val) { gameUI = val; }
  public static void setMenuGrid(MenuGrid val) { menuGrid = val; }
  public static void setMapView(MapView val) { mapView = val; }
  public static void setSession(Session val) {
    if ((session != null) && (session != val))
      resetSessionState();
    session = val;
  }
  public static void setGlob(Glob val) { glob = val; }
  public static void setOCache(OCache val) { oCache = val; }
  public static void setEquipory(Equipory val) { equipory = val; }
  public static void setMainInventory(Inventory val) { mainInventory = val; }

  public static void addMeterWidget(IMeter meter) {
    if ((meter != null) && !meterWidgets.contains(meter))
      meterWidgets.add(meter);
  }

  private static IMeter findMeterWidget(String resourceSuffix) {
    for (IMeter meter : meterWidgets) {
      if (meter.resourceName().endsWith(resourceSuffix))
        return meter;
    }
    throw new LMIException(Constant.ExceptionReason.ER_WIDGET_MISSING);
  }

  public static IMeter hitPointMeter() {
    if (hitPointMeter == null)
      hitPointMeter = findMeterWidget(RN_HIT_POINT);
    return hitPointMeter;
  }

  public static IMeter staminaMeter() {
    if (staminaMeter == null)
      staminaMeter = findMeterWidget(RN_STAMINA);
    return staminaMeter;
  }

  public static IMeter energyMeter() {
    if (energyMeter == null)
      energyMeter = findMeterWidget(RN_ENERGY);
    return energyMeter;
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
