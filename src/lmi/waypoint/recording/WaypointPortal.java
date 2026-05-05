package lmi.waypoint.recording;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class WaypointPortal {
  private static final Map<String, List<String>> counterpartMap = new HashMap<>();

  static {
    pair("gfx/terobjs/arch/stonehut", "gfx/terobjs/arch/stonehut-door");
    pair("gfx/terobjs/burrow", "gfx/tiles/ridges/caveout");
    pair("gfx/tiles/ridges/cavein2", "gfx/tiles/ridges/caveout");
  }

  private WaypointPortal() {}

  public static List<String> counterpartResnames(String resname) {
    List<String> counterpart = counterpartMap.get(resname);
    return (counterpart != null) ? counterpart : new ArrayList<>();
  }

  public static boolean isPortalResname(String resname) {
    return resname != null && !counterpartResnames(resname).isEmpty();
  }

  private static void pair(String a, String b) {
    counterpart(a).add(b);
    counterpart(b).add(a);
  }

  private static List<String> counterpart(String resname) {
    List<String> counterpart = counterpartMap.get(resname);
    if (counterpart != null) return counterpart;

    List<String> created = new ArrayList<>();
    counterpartMap.put(resname, created);
    return created;
  }
}
