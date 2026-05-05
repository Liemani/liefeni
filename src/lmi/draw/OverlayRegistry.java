package lmi.draw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class OverlayRegistry {
  private static final ArrayList<MapOverlay> overlays = new ArrayList<>();

  private OverlayRegistry() {}

  public static synchronized void register(MapOverlay overlay) {
    if (overlay == null || overlays.contains(overlay))
      return;
    overlays.add(overlay);
    overlays.sort(Comparator.comparingInt(MapOverlay::zOrder));
  }

  public static synchronized void unregister(MapOverlay overlay) {
    overlays.remove(overlay);
  }

  public static synchronized List<MapOverlay> overlays() {
    return new ArrayList<>(overlays);
  }
}
