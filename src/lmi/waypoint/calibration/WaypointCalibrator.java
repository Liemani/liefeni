package lmi.waypoint.calibration;

import haven.Coord;
import haven.Gob;
import lmi.Api;
import lmi.Array;
import lmi.Rect;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.object.WpAnchor;
import lmi.waypoint.object.WpPortal;
import lmi.waypoint.runtime.WaypointCalibrationState;
import lmi.waypoint.runtime.WaypointCutBounds;

public final class WaypointCalibrator {
  private WaypointCalibrator() {}

  public static boolean calibrateFromAnchorArea(WaypointCalibrationState calibration, Rect area) {
    if (area == null) {
      Api.message("[WaypointManager.calibrate] area is null");
      return false;
    }

    Array<WpAnchor> anchors = WaypointManager.anchors();
    Api.message("[WaypointManager.calibrate] selected area=" + area);
    Api.message("[WaypointManager.calibrate] anchor count=" + anchors.count());
    if (anchors.isEmpty())
      return false;

    WpAnchor anchor = anchors.first();
    Coord anchorWorld = WaypointCutBounds.cutOriginOfWorld(area.origin.tileMin());
    calibration.setCalibration(anchor.graphId, Coord.of(anchor.virX, anchor.virY), anchorWorld, null);
    WaypointManager.preloadPortals(anchor.graphId);
    return true;
  }

  public static boolean calibrateFromPortal(WaypointCalibrationState calibration, Gob gob) {
    if (gob == null) {
      Api.message("[WaypointManager.calibrate] gob is null");
      return false;
    }

    Api.message("[WaypointManager.calibrate] gob.id=" + gob.id() + " resname=" + gob.resourceName() + " world=" + gob.position());
    if (calibration.graphId() == null) {
      Api.message("[WaypointManager.calibrate] current graph is null");
      return false;
    }

    long graphId = calibration.graphId();
    if (!WaypointManager.portalsLoaded(graphId)) {
      WaypointManager.preloadPortals(graphId);
      Api.message("[WaypointManager.calibrate] portal cache is not loaded yet");
      return false;
    }

    boolean waitingForCounterparts = false;
    for (WpPortal portal : WaypointManager.portals(graphId)) {
      if (!WaypointManager.counterpartPortalsLoaded(portal.id)) {
        WaypointManager.preloadCounterpartPortals(portal.id);
        waitingForCounterparts = true;
        continue;
      }

      for (WpPortal counterpart : WaypointManager.counterpartPortals(portal.id)) {
        if (!counterpart.resname.contentEquals(gob.resourceName()))
          continue;

        calibration.setCalibration(counterpart.graphId, Coord.of(counterpart.virX, counterpart.virY), gob.position(), gob);
        WaypointManager.preloadPortals(counterpart.graphId);
        return true;
      }
    }

    if (waitingForCounterparts) {
      Api.message("[WaypointManager.calibrate] counterpart portal cache is not loaded yet");
      return false;
    }

    Api.message("[WaypointManager.calibrate] no counterpart portal matched");
    return false;
  }
}
