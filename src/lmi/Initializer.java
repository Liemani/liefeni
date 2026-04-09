package lmi;

import haven.*;

public class Initializer {
  public static void init() {
    Console.setscmd("lmi", new Command());
    Console.setscmd("man", new Manual());
    Scanner.init(System.in);
    ObjectFinder.init();
    AppContext.init();
    Debug.init();
    WaitManager.init();
    AgentManager.init();
    Pathfinder.init();
  }

  // set AppContext
  public static void initMainFrame(MainFrame mainFrame) { AppContext.mainFrame = mainFrame; }
  public static void initMainThread(Thread mainThread) { AppContext.mainThread = mainThread; }
  public static void initJOGLPanel(JOGLPanel joglPanel) { AppContext.joglPanel = joglPanel; }
  public static void initDispatcher(UIPanel.Dispatcher dispatcher) { AppContext.dispatcher = dispatcher; }
  public static void initRemoteUI(RemoteUI remoteUI) { AppContext.remoteUI = remoteUI; }
  public static void initUI(UI ui) { AppContext.ui = ui; }
  public static void initRootWidget(RootWidget rootWidget) { AppContext.rootWidget = rootWidget; }
  public static void initGameUI(GameUI gameUI) { AppContext.gameUI = gameUI; }
  public static void initMapView(MapView mapView) {
    AppContext.mapView = mapView;
    Util.initMapViewCenterByMapView(AppContext.mapView);
  }
  public static void initSession(Session session) { AppContext.session = session; }
  public static void initGlob(Glob glob) { AppContext.glob = glob; }
  public static void initObjectCache(OCache objectCache) { AppContext.objectCache = objectCache; }

  public static void initGaugeArray(IMeter gauge) { AppContext.setGaugeArray(gauge); }
}
