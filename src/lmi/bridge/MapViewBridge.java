package lmi.bridge;

import haven.MapView;

public final class MapViewBridge {
  private static MapView mapView;

  private MapViewBridge() {}

  public static void setMapView(MapView val) {
    mapView = val;
  }

  public static void clear() {
    mapView = null;
  }

  public static MapView mapView() {
    return mapView;
  }
}
