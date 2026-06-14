package lmi.waypoint.recording;

import haven.Gob;
import lmi.core.GobFinder;
import lmi.core.LocalPlayer;

import java.util.List;

public final class WaypointPortalResolver {
  private WaypointPortalResolver() {}

  public static Gob closestCounterpartGob(String entryPortalResname) {
    List<String> candidates = WaypointPortal.counterpartResnames(entryPortalResname);
    if (candidates.isEmpty())
      return null;

    Gob closest = null;
    double best = Double.MAX_VALUE;
    for (Gob gob : GobFinder.all()) {
      if (!candidates.contains(gob.resourceName()))
        continue;
      double distance = LocalPlayer.distance(gob);
      if (distance < best) {
        best = distance;
        closest = gob;
      }
    }
    return closest;
  }
}
