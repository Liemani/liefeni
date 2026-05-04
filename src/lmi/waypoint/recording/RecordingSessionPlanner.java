package lmi.waypoint.recording;

import haven.Coord;
import haven.Gob;
import lmi.waypoint.calibration.WaypointPortal;
import lmi.waypoint.calibration.WaypointPortalResolver;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.model.PendingPortalTransition;
import lmi.waypoint.model.RecordingClick;
import lmi.waypoint.model.RecordingSegment;
import lmi.waypoint.model.RecordingSession;

import java.util.ArrayList;

final class RecordingSessionPlanner {
  private RecordingSessionPlanner() {}

  static RecordingSession plan(RecordingSession session) {
    ArrayList<RecordingSegment> plannedSegments = new ArrayList<>();
    RecordingSegment current = _copySegmentHeader(session.segments.get(0), 0);
    PendingPortalTransition pending = null;

    for (RecordingSegment originalSegment : session.segments) {
      for (RecordingClick click : originalSegment.clicks) {
        if (_isPortalClick(click)) {
          click.isPortal = true;
          current.endGobId = click.gobId;
          current.endGobX = click.x;
          current.endGobY = click.y;
          current.endGobResname = click.gobResname;
          plannedSegments.add(current);

          pending = (click.gobResname == null) ? null : new PendingPortalTransition(click.gobResname);
          current = new RecordingSegment(plannedSegments.size(), null, 0, 0, 0, 0);
          _resolvePendingPortalTransition(current, pending);
          continue;
        }

        current.clicks.add(click);
      }
    }

    _resolvePendingPortalTransition(current, pending);
    _copyTerminalGob(session, current);
    plannedSegments.add(current);

    session.segments.clear();
    session.segments.addAll(plannedSegments);
    session.pendingPortalTransition = null;
    return session;
  }

  private static RecordingSegment _copySegmentHeader(RecordingSegment original, int index) {
    RecordingSegment copy = new RecordingSegment(
      index,
      original.baseGraphId,
      original.baseGobX,
      original.baseGobY,
      original.baseVirX,
      original.baseVirY
    );
    copy.endGobId = original.endGobId;
    copy.endGobX = original.endGobX;
    copy.endGobY = original.endGobY;
    copy.endGobResname = original.endGobResname;
    return copy;
  }

  private static boolean _isPortalClick(RecordingClick click) {
    return click.mouseButton == 3 && WaypointPortal.isPortalResname(click.gobResname);
  }

  private static void _resolvePendingPortalTransition(RecordingSegment current, PendingPortalTransition pending) {
    if (pending == null)
      return;

    Gob exitPortal = WaypointPortalResolver.closestCounterpartGob(pending.entryPortalResname);
    if (exitPortal == null)
      return;

    current.baseGraphId = WaypointManager.calibrationGraphId();
    current.baseGobX = exitPortal.position().x;
    current.baseGobY = exitPortal.position().y;
    Coord baseVir = WaypointManager.virOfWorld(exitPortal.position());
    if (baseVir != null) {
      current.baseVirX = baseVir.x;
      current.baseVirY = baseVir.y;
    }
  }

  private static void _copyTerminalGob(RecordingSession session, RecordingSegment current) {
    RecordingSegment lastOriginal = session.currentSegment();
    current.endGobId = lastOriginal.endGobId;
    current.endGobX = lastOriginal.endGobX;
    current.endGobY = lastOriginal.endGobY;
    current.endGobResname = lastOriginal.endGobResname;
  }
}
