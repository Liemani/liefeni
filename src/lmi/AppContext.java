package lmi;

import haven.*;
import lmi.job.Job;
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
  public static MapView mapView;
  public static Session session;
  public static IMeter[] gaugeWidgetArray;
  public static Glob glob;
  public static OCache oCache;
  public static Equipory equipory;
  public static Inventory mainInventory;

  // Unified Initialization
  public static void init() {
    Console.setscmd("lmi", new Command());
    Console.setscmd("man", new Manual());
    Scanner.init(System.in);
    ObjectFinder.init();
    Debug.init();
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
  public static void setMapView(MapView val) { mapView = val; }
  public static void setSession(Session val) { session = val; }
  public static void setGlob(Glob val) { glob = val; }
  public static void setOCache(OCache val) { oCache = val; }

  public static void setEquipory(Equipory val) {
    if (equipory == null) equipory = val;
  }

  public static void setMainInventory(Inventory val) {
    if (mainInventory == null) mainInventory = val;
  }

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

  // Helper Methods
  static Coord getMouseLocation() { return ui.mc; }
  static void interruptMainThread() { mainThread.interrupt(); }
  static void closeSession() { ui.sess.close(); }
}
