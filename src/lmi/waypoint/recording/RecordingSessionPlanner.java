package lmi.waypoint.recording;

import haven.Gob;
import lmi.waypoint.WaypointManager;
import lmi.waypoint.runtime.GridPosition;
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
          plannedSegments.add(current);

          pending = (click.gobResname == null) ? null : new PendingPortalTransition(click.gobResname);
          current = new RecordingSegment(plannedSegments.size(), null, 0L, 0, 0);
          _resolvePendingPortalTransition(current, pending);
          continue;
        }

        current.clicks.add(click);
      }
    }

    _resolvePendingPortalTransition(current, pending);
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
      original.baseGridId,
      original.baseLocalX,
      original.baseLocalY
    );
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

    GridPosition position = WaypointManager.gridPositionOfWorld(exitPortal.position());
    if (position == null)
      return;
    current.baseGraphId = WaypointManager.activeGraphId();
    current.baseGridId = position.gridId;
    current.baseLocalX = position.localX;
    current.baseLocalY = position.localY;
  }
}
