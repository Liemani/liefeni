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
import static lmi.Constant.MeshId.*;
import static lmi.Constant.Timeout.*;
import static lmi.Constant.Gauge.HitPointIndex.*;

// resource
import static lmi.Constant.gfx.borka.*;

public class Self {
  // access properties
  public static Gob gob() {
    if (AppContext.mapView() == null) return null;
    return AppContext.mapView().player();
  }

  public static Coord position() { return Self.gob().position(); }
  public static double a() { return Self.gob().a; }
  public static double velocity() { return Self.gob().velocity(); }
  public static boolean hasPose(String poseName) { return Self.gob().hasPose(poseName); }

  private static java.util.List<haven.LayerMeter.Meter> _requireMeterValues(haven.IMeter meterWidget) {
    java.util.List<haven.LayerMeter.Meter> meter = haven.LMI.meterValues(meterWidget);
    if (meter == null) throw new LMIException(ER_WIDGET_MISSING);
    return meter;
  }

  public static double hardHitPoint() {
    java.util.List<haven.LayerMeter.Meter> meter = _requireMeterValues(AppContext.hitPointMeter());
    return meter.get(GI_HARD).a;
  }

  public static double softHitPoint() {
    java.util.List<haven.LayerMeter.Meter> meter = _requireMeterValues(AppContext.hitPointMeter());
    return meter.get(GI_SOFT).a;
  }

  public static double stamina() {
    java.util.List<haven.LayerMeter.Meter> meter = _requireMeterValues(AppContext.staminaMeter());
    return meter.get(0).a;
  }

  public static double energy() {
    java.util.List<haven.LayerMeter.Meter> meter = _requireMeterValues(AppContext.energyMeter());
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
    return AppContext.cursor().get().name.endsWith(cursor);
  }

  // send message shadow
  private static void _sendClickMessage(Coord coord) {
    Interaction.click(coord, 1, 0);
  }

  private static void _sendCancelActionMessage() {
    Interaction.click(Self.position(), 3, 0);
  }
}
