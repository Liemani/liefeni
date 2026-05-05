package lmi.waypoint.calibration;

import haven.Gob;
import lmi.GobFinder;
import lmi.Self;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.object.WpPortal;
import lmi.waypoint.runtime.EnteringPortal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class WaypointPortalResolver {
  private WaypointPortalResolver() {}

  public static Gob closestCounterpartGob(String resname) {
    List<String> candidates = _candidatePortalResnamesForCounterpart(resname);
    if (candidates.isEmpty())
      return null;

    Gob closest = null;
    double best = Double.MAX_VALUE;
    for (Gob gob : GobFinder.all()) {
      if (!candidates.contains(gob.resourceName()))
        continue;
      double distance = Self.distance(gob);
      if (distance < best) {
        best = distance;
        closest = gob;
      }
    }
    return closest;
  }

  public static Gob closestPortalForRecalibration() {
    EnteringPortal enteringPortal = WaypointManager.enteringPortal();
    List<String> candidates = _candidatePortalResnamesForRecalibration(enteringPortal);
    if (candidates.isEmpty())
      return null;

    Gob closest = null;
    double best = Double.MAX_VALUE;
    for (Gob gob : GobFinder.all()) {
      if (!candidates.contains(gob.resourceName()))
        continue;
      double distance = Self.distance(gob);
      if (distance < best) {
        best = distance;
        closest = gob;
      }
    }
    return closest;
  }

  private static List<String> _candidatePortalResnamesForCounterpart(String counterpartResname) {
    Long graphId = WaypointManager.calibrationGraphId();
    if (graphId == null || counterpartResname == null)
      return WaypointPortal.counterpartResnames(counterpartResname);

    if (!WaypointManager.portalsLoaded(graphId)) {
      WaypointManager.preloadPortals(graphId);
      return WaypointPortal.counterpartResnames(counterpartResname);
    }

    HashSet<String> candidates = new HashSet<>();
    for (WpPortal portal : WaypointManager.portals(graphId)) {
      if (!WaypointManager.counterpartPortalsLoaded(portal.id)) {
        WaypointManager.preloadCounterpartPortals(portal.id);
        continue;
      }

      for (WpPortal counterpart : WaypointManager.counterpartPortals(portal.id)) {
        if (counterpartResname.contentEquals(counterpart.resname))
          candidates.add(portal.resname);
      }
    }
    if (candidates.isEmpty())
      return WaypointPortal.counterpartResnames(counterpartResname);
    return new ArrayList<>(candidates);
  }

  private static List<String> _candidatePortalResnamesForRecalibration(EnteringPortal enteringPortal) {
    if (enteringPortal == null)
      return _fallbackCandidatePortalResnamesForRecalibration();
    long graphId = enteringPortal.graphId;

    if (!WaypointManager.portalsLoaded(graphId)) {
      WaypointManager.preloadPortals(graphId);
      return new ArrayList<>();
    }

    WpPortal entryPortal = _findEntryPortal(enteringPortal);
    if (entryPortal == null)
      return _fallbackCandidatePortalResnamesForRecalibration();

    if (!WaypointManager.counterpartPortalsLoaded(entryPortal.id)) {
      WaypointManager.preloadCounterpartPortals(entryPortal.id);
      return new ArrayList<>();
    }

    HashSet<String> candidates = new HashSet<>();
    for (WpPortal counterpart : WaypointManager.counterpartPortals(entryPortal.id))
      candidates.add(counterpart.resname);
    return new ArrayList<>(candidates);
  }

  private static List<String> _fallbackCandidatePortalResnamesForRecalibration() {
    Long graphId = WaypointManager.calibrationGraphId();
    if (graphId == null)
      return new ArrayList<>();

    if (!WaypointManager.portalsLoaded(graphId)) {
      WaypointManager.preloadPortals(graphId);
      return new ArrayList<>();
    }

    HashSet<String> candidates = new HashSet<>();
    for (WpPortal portal : WaypointManager.portals(graphId)) {
      if (!WaypointManager.counterpartPortalsLoaded(portal.id)) {
        WaypointManager.preloadCounterpartPortals(portal.id);
        continue;
      }

      for (WpPortal counterpart : WaypointManager.counterpartPortals(portal.id)) {
        candidates.add(counterpart.resname);
      }
    }
    return new ArrayList<>(candidates);
  }

  static WpPortal findEntryPortal(EnteringPortal enteringPortal) {
    return _findEntryPortal(enteringPortal);
  }

  private static WpPortal _findEntryPortal(EnteringPortal enteringPortal) {
    if (enteringPortal == null)
      return null;

    WpPortal nearest = null;
    long best = Long.MAX_VALUE;
    for (WpPortal portal : WaypointManager.portals(enteringPortal.graphId)) {
      if (!enteringPortal.resname.contentEquals(portal.resname))
        continue;
      long dx = (long)portal.virX - enteringPortal.virX;
      long dy = (long)portal.virY - enteringPortal.virY;
      long distance = (dx * dx) + (dy * dy);
      if (distance < best) {
        best = distance;
        nearest = portal;
      }
    }
    return nearest;
  }
}
