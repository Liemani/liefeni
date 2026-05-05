package lmi.draw;

import haven.GOut;
import haven.MapView;

public interface MapOverlay {
  default boolean visible() {
    return true;
  }

  default int zOrder() {
    return 0;
  }

  void draw(MapView mapView, GOut g);
}
