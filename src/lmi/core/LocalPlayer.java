package lmi.core;

// import haven
import haven.Gob;
import haven.Coord;
import haven.Coord2d;
import haven.MCache;
import lmi.bridge.MapViewBridge;
import lmi.bridge.GlobBridge;
import lmi.core.AppContext;
import lmi.core.Interaction;
import lmi.core.LMIException;

// constant
import lmi.core.Constant.*;
import lmi.core.Constant.Message;

import static lmi.core.Constant.ExceptionReason.*;
import static lmi.core.Constant.Message.*;
import static lmi.core.Constant.Action.*;
import static lmi.core.Constant.MeshId.*;
import static lmi.core.Constant.Timeout.*;
import static lmi.core.Constant.Gauge.HitPointIndex.*;

// resource
import static lmi.core.Constant.gfx.borka.*;

public class LocalPlayer {
  // access properties
  public static Gob gob() {
    if (MapViewBridge.mapView() == null) return null;
    return MapViewBridge.mapView().player();
  }

  public static Coord position() { return LocalPlayer.gob().position(); }
  public static double a() { return LocalPlayer.gob().a; }
  public static double velocity() { return LocalPlayer.gob().velocity(); }
  public static boolean hasPose(String poseName) { return LocalPlayer.gob().hasPose(poseName); }

  public static MCache.Grid currentGrid() {
    Gob gob = LocalPlayer.gob();
    if (gob == null)
      return null;
    return GlobBridge.gridAtWorld(Coord2d.of(gob.position()));
  }

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
    return LocalPlayer.gob().distance(gob);
  }

  public static double distance(Coord coord) {
    return LocalPlayer.gob().distance(coord);
  }


  private static boolean _isCursorChanged(String cursor) {
    return AppContext.cursor().get().name.endsWith(cursor);
  }

  // send message shadow
  private static void _sendClickMessage(Coord coord) {
    Interaction.click(coord, 1, 0);
  }

  private static void _sendCancelActionMessage() {
    Interaction.click(LocalPlayer.position(), 3, 0);
  }
}
