package agent.debug;

import agent.Effect;
import haven.Coord;
import haven.MCache;
import lmi.bridge.Api;
import lmi.bridge.GlobBridge;

import java.lang.reflect.Field;
import java.util.Map;

public class DescribeMCacheGridsEffect extends Effect {
  @Override
  public void execute() {
    MCache map = GlobBridge.glob() == null ? null : GlobBridge.glob().map;
    if (map == null) {
      Api.message("MCache is unavailable.");
      return;
    }

    Map<Coord, ?> grids = _mapField(map, "grids");
    Map<Coord, ?> req = _mapField(map, "req");

    Api.message("MCache.grids.size(): " + grids.size());
    Api.message("MCache.req.size(): " + req.size());
  }

  public static String name() {
    return "Describe MCache Grids";
  }

  public static String info() {
    return "Prints how many map grids are currently loaded in MCache and how many map requests are pending.";
  }

  @SuppressWarnings("unchecked")
  private static Map<Coord, ?> _mapField(MCache map, String fieldName) {
    try {
      Field field = MCache.class.getDeclaredField(fieldName);
      field.setAccessible(true);
      return (Map<Coord, ?>) field.get(map);
    } catch (Exception e) {
      throw new RuntimeException("Failed to read MCache." + fieldName + ": " + e.getMessage(), e);
    }
  }
}
