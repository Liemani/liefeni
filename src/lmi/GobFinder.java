package lmi;

import java.util.function.Predicate;

import lmi.Array;
import lmi.Rect;
import haven.Coord;
import haven.Gob;
import haven.OCache;

public class GobFinder {
  public static Gob closest() {
    return _closestWhere(gob -> gob != Self.gob());
  }

  public static Gob closestOf(String name) {
    return _closestWhere(gob -> gob.resource() != null && gob.resourceName().endsWith(name));
  }

  public static Gob byId(long gobId) {
    return AppContext.oCache().getgob(gobId);
  }

  public static Gob at(Coord position) {
    final OCache oc = AppContext.oCache();

    synchronized (oc) {
      for (Gob gob : oc) {
        if (gob.resource() == null) continue;
        if (gob.position().equals(position)) return gob;
      }
    }

    return null;
  }

  public static Gob at(int x, int y) {
    return at(Coord.of(x, y));
  }

  public static Array<Gob> all() {
    return where(gob -> true);
  }

  public static Array<Gob> where(Predicate<Gob> predicate) {
    Array<Gob> gobArray = new Array<Gob>();
    final OCache oc = AppContext.oCache();

    synchronized (oc) {
      for (Gob gob : oc) {
        if (gob.resource() == null) continue;
        if (predicate.test(gob)) gobArray.append(gob);
      }
    }

    return gobArray;
  }

  public static Array<Gob> in(Rect area) {
    return where(gob -> area.contains(gob.position()));
  }

  public static Array<Gob> inSelectedArea() {
    return in(ClickManager.getArea());
  }

  private static Gob _closestWhere(java.util.function.Predicate<Gob> predicate) {
    final OCache oc = AppContext.oCache();
    Gob closestGob = null;
    double distanceToClosestGob = Double.MAX_VALUE;

    synchronized (oc) {
      for (Gob gob : oc) {
        if (gob.resource() == null) continue;
        if (!predicate.test(gob)) continue;

        final double distance = Self.distance(gob);
        if (distance < distanceToClosestGob) {
          closestGob = gob;
          distanceToClosestGob = distance;
        }
      }
    }

    return closestGob;
  }
}
