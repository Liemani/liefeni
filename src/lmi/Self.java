package lmi;

// import haven
import haven.Gob;
import haven.Coord;

// constant
import lmi.Constant.*;
import lmi.Constant.Message;

import static lmi.Constant.ExceptionReason.*;
import static lmi.Constant.Message.*;
import static lmi.Constant.Action.*;
import static lmi.Constant.Input.Mouse.*;
import static lmi.Constant.Input.Modifier.*;
import static lmi.Constant.InteractionType.*;
import static lmi.Constant.MeshId.*;
import static lmi.Constant.Timeout.*;
import static lmi.Constant.Gauge.Index.*;
import static lmi.Constant.Gauge.HitPointIndex.*;

// resource
import static lmi.Constant.gfx.borka.*;

public class Self {
  // access properties
  public static Gob gob() {
    if (AppContext.mapView == null) return null;
    return AppContext.mapView.player();
  }

  public static Coord position() { return Self.gob().position(); }
  public static double a() { return Self.gob().a; }
  public static double velocity() { return Self.gob().velocity(); }
  public static boolean hasPose(String poseName) { return Self.gob().hasPose(poseName); }

  public static double hardHitPoint() {
    haven.IMeter imeter = AppContext.gaugeWidgetArray[GI_HIT_POINT];
    java.util.List<haven.LayerMeter.Meter> meter = haven.LMI.gaugeWidgetGaugeArray(imeter);
    if (meter == null) return -1.0;
    return meter.get(GI_HARD).a;
  }

  public static double softHitPoint() {
    return haven.LMI.gaugeWidgetGaugeArray(AppContext.gaugeWidgetArray[GI_HIT_POINT])
      .get(GI_SOFT)
      .a;
  }

  public static double stamina() {
    return haven.LMI.gaugeWidgetGaugeArray(AppContext.gaugeWidgetArray[GI_STAMINA])
      .get(0)
      .a;
  }

  public static double energy() {
    haven.IMeter imeter = AppContext.gaugeWidgetArray[GI_ENERGY];
    java.util.List<haven.LayerMeter.Meter> meter = haven.LMI.gaugeWidgetGaugeArray(imeter);
    if (meter == null) return -1.0;
    return meter.get(0).a;
  }

  // etc
  public static double distance(Gob gob) {
    return Self.gob().distance(gob);
  }

  public static double distance(Coord coord) {
    return Self.gob().distance(coord);
  }


  private static boolean _isCursorChanged(String cursor) {
    return WidgetManager.cursor().get().name.endsWith(cursor);
  }

  // send message shadow
  private static void _sendClickMessage(Coord coord) {
    WidgetMessageHandler.sendClickMessage(
        AppContext.mapView,
        Coord.z,
        coord,
        IM_LEFT,
        IM_NONE);
  }

  private static void _sendCancelActionMessage() {
    WidgetMessageHandler.cancelAction();
  }
}
