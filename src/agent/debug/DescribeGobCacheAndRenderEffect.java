package agent.debug;

import agent.Effect;
import haven.Gob;
import haven.MapView;
import haven.OCache;
import lmi.bridge.Api;
import lmi.core.AppContext;
import lmi.bridge.MapViewBridge;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;

public class DescribeGobCacheAndRenderEffect extends Effect {
  @Override
  public void execute() {
    OCache oc = AppContext.oCache();
    MapView mapView = MapViewBridge.mapView();
    if (oc == null) {
      Api.message("OCache is unavailable.");
      return;
    }
    if (mapView == null) {
      Api.message("MapView is unavailable.");
      return;
    }

    int ocacheCount = _ocacheGobCount(oc);
    ArrayList<Gob> snapshot = oc.gobArray();
    int publishedGobArrayCount = (snapshot == null) ? -1 : snapshot.size();

    Object gobs = _field(mapView, "gobs");
    Map<?, ?> current = _mapField(gobs, "current");
    Map<?, ?> adding = _mapField(gobs, "adding");
    Object slot = _field(gobs, "slot");

    Api.message("OCache iterator count: " + ocacheCount);
    Api.message("OCache published gobArray count: " + publishedGobArrayCount);
    Api.message("MapView.Gobs.current count: " + current.size());
    Api.message("MapView.Gobs.adding count: " + adding.size());
    Api.message("MapView.Gobs.slot attached: " + (slot != null));
  }

  public static String name() {
    return "Describe Gob Cache And Render";
  }

  public static String info() {
    return "Prints OCache gob count and MapView.Gobs current/adding counts for render-state debugging.";
  }

  private static int _ocacheGobCount(OCache oc) {
    int count = 0;
    synchronized (oc) {
      for (Gob ignored : oc)
        count += 1;
    }
    return count;
  }

  private static Object _field(Object object, String fieldName) {
    try {
      Field field = object.getClass().getDeclaredField(fieldName);
      field.setAccessible(true);
      return field.get(object);
    } catch (Exception e) {
      throw new RuntimeException("Failed to read " + object.getClass().getSimpleName() + "." + fieldName + ": " + e.getMessage(), e);
    }
  }

  @SuppressWarnings("unchecked")
  private static Map<?, ?> _mapField(Object object, String fieldName) {
    Object value = _field(object, fieldName);
    if (!(value instanceof Map<?, ?>))
      throw new RuntimeException("Field " + object.getClass().getSimpleName() + "." + fieldName + " is not a Map.");
    return (Map<?, ?>) value;
  }
}
