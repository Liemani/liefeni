package lmi.waypoint;

import haven.Gob;
import lmi.Api;
import lmi.Self;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class WaypointPortal {
  private static final Map<String, List<String>> counterpartMap = new HashMap<>();

  static {
    _pair("gfx/terobjs/arch/stonehut", "gfx/terobjs/arch/stonehut-door");
    _pair("gfx/terobjs/burrow", "gfx/tiles/ridges/caveout");
    _pair("gfx/tiles/ridges/cavein2", "gfx/tiles/ridges/caveout");
  }

  private WaypointPortal() {}

  public static List<String> counterpartResnames(String resname) {
    List<String> counterpart = counterpartMap.get(resname);
    return (counterpart != null) ? counterpart : new ArrayList<>();
  }

  public static boolean isPortalResname(String resname) {
    return resname != null && !counterpartResnames(resname).isEmpty();
  }

  public static Gob closestCounterpartGob(String resname) {
    List<String> candidates = counterpartResnames(resname);
    if (candidates.isEmpty()) return null;

    Gob closest = null;
    double best = Double.MAX_VALUE;
    for (Gob gob : Api.gobArray()) {
      if (!candidates.contains(gob.resourceName())) continue;
      double distance = Self.distance(gob);
      if (distance < best) {
        best = distance;
        closest = gob;
      }
    }
    return closest;
  }

  private static void _pair(String a, String b) {
    _counterpart(a).add(b);
    _counterpart(b).add(a);
  }

  private static List<String> _counterpart(String resname) {
    List<String> counterpart = counterpartMap.get(resname);
    if (counterpart != null) return counterpart;

    List<String> created = new ArrayList<>();
    counterpartMap.put(resname, created);
    return created;
  }
}
