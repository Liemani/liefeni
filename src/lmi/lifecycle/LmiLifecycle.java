package lmi.lifecycle;

import haven.GameUI;
import haven.MapView;
import haven.RootWidget;
import haven.Session;
import lmi.runtime.AgentManager;
import lmi.runtime.ChatInputMonitor;
import lmi.runtime.PortalMonitor;
import lmi.bridge.MenuGridProxy;
import lmi.runtime.WaitManager;
import lmi.core.AppContext;
import lmi.core.Util;
import lmi.bridge.GlobBridge;
import lmi.bridge.MapViewBridge;
import lmi.waypoint.WaypointBootstrap;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.persistence.EmptyWaypointResult;
import lmi.waypoint.persistence.WaypointResultHandler;
import lmi.waypoint.persistence.WaypointStore;

public final class LmiLifecycle {
  private static boolean isProcessInitialized;
  private static boolean isWorldEntered;
  private static boolean isWidgetsEntered;

  private LmiLifecycle() {}

  public static synchronized void initProcess() {
    if (isProcessInitialized)
      return;
    AppContext.init();
    CommandHandler.init();
    AgentManager.init();
    Pathfinder.init();
    isProcessInitialized = true;
  }

  public static synchronized void enterSession(Session session) {
    if (AppContext.session == session)
      return;
    AppContext.setSession(session);
    WaitManager.init();
    RuntimeEventManager.init();
    WaypointBootstrap.init();
  }

  public static synchronized void leaveSession(Session session) {
    Util.debugPrintHeader("leaveSession");
    if (AppContext.session != session)
      return;
    RuntimeEventManager.clear();
    ChatInputMonitor.clear();
    PortalMonitor.clear();
    WaypointManager.clear();
    GlobBridge.clear();
    MapViewBridge.clear();
    AppContext.resetSessionState();
  }

  public static synchronized void setRootWidget(RootWidget rootWidget) {
    if ((AppContext.rootWidget != null) && (AppContext.rootWidget != rootWidget)) {
      isWidgetsEntered = false;
      MapViewBridge.clear();
      AppContext.resetWidgetCache();
    }
    AppContext.setRootWidget(rootWidget);
    syncWidgets();
  }

  public static synchronized void setGameUI(GameUI gameUI) {
    AppContext.setGameUI(gameUI);
    syncWidgets();
  }

  public static synchronized void setMenuGrid(haven.MenuGrid menuGrid) {
    AppContext.setMenuGrid(menuGrid);
    syncWidgets();
  }

  public static synchronized void setMapView(MapView mapView) {
    MapViewBridge.setMapView(mapView);
    syncWidgets();
  }

  public static synchronized void enterWorld(MapView mapView) {
    setMapView(mapView);
    if (isWorldEntered)
      return;
    WaypointStore.initializeAsync(new WaypointResultHandler<EmptyWaypointResult>() {
      @Override
      public void onSuccess(EmptyWaypointResult result) {
        WaypointManager.requestRefresh();
      }

      @Override
      public void onFailure(Exception error) {
        error.printStackTrace();
      }
    });
    RuntimeEventManager.registerWaypointRefreshHandler();
    WaypointManager.requestRefresh();
    isWorldEntered = true;
  }

  public static synchronized void leaveWorld() {
    if (!isWorldEntered)
      return;
    RuntimeEventManager.unregisterWaypointRefreshHandler();
    WaypointManager.clear();
    isWorldEntered = false;
    leaveWidgets();
  }

  public static synchronized void syncWidgets() {
    if (_widgetsReady()) {
      if (!isWidgetsEntered) {
        MenuGridProxy.init();
        isWidgetsEntered = true;
      }
    } else {
      isWidgetsEntered = false;
    }
  }

  public static synchronized void leaveWidgets() {
    if (!isWidgetsEntered)
      return;
    isWidgetsEntered = false;
  }

  private static boolean _widgetsReady() {
    return AppContext.rootWidget != null
      && AppContext.gameUI != null
      && AppContext.menuGrid != null
      && MapViewBridge.mapView() != null;
  }
}
