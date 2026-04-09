package lmi;

import haven.*;

import static lmi.Constant.gfx.hud.meter.*;
import static lmi.Constant.Gauge.Index.*;

public class AppContext {
  // Field
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
  public static OCache objectCache;

  // Initialize
  static void init() { gaugeWidgetArray = new IMeter[3]; }

  static void setGaugeArray(IMeter gauge) {
    final String resourceName = gauge.resourceName();
    if (resourceName.endsWith(RN_HIT_POINT))
      gaugeWidgetArray[GI_HIT_POINT] = gauge;
    else if (resourceName.endsWith(RN_STAMINA))
      gaugeWidgetArray[GI_STAMINA] = gauge;
    else if (resourceName.endsWith(RN_ENERGY))
      gaugeWidgetArray[GI_ENERGY] = gauge;
  }

  // Package Method
  static Coord getMouseLocation() {
    return ui.mc;
  }

  static void interruptMainThread() {
    mainThread.interrupt();
  }

  static void closeSession() {
    ui.sess.close();
  }
}
