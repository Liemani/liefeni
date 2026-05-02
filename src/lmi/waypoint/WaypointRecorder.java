package lmi.waypoint;

import haven.ClickData;
import haven.Coord;
import haven.Coord2d;
import haven.FastMesh;
import haven.Gob;
import haven.OCache;

import lmi.waypoint.model.PendingPortalTransition;
import lmi.waypoint.model.RecordingClick;
import lmi.waypoint.model.RecordingSegment;
import lmi.waypoint.model.RecordingSession;

public final class WaypointRecorder {
  private static final Object lock = new Object();
  private static RecordingSession activeSession;

  private WaypointRecorder() {}

  public static RecordingSession start(long startNodeId, long baseGobId, int baseGobX, int baseGobY) {
    synchronized (lock) {
      if (activeSession != null)
        throw new IllegalStateException("A waypoint recording is already active.");
      activeSession = new RecordingSession(startNodeId, baseGobId, baseGobX, baseGobY);
      return activeSession;
    }
  }

  public static boolean isActive(RecordingSession session) {
    synchronized (lock) {
      return activeSession == session;
    }
  }

  public static void discard(RecordingSession session) {
    synchronized (lock) {
      if (activeSession == session)
        activeSession = null;
    }
  }

  public static void recordMapClick(Coord2d mapCoord, int mouseButton, ClickData clickData) {
    if (mapCoord == null) return;
    if (mouseButton != 1 && mouseButton != 3) return;

    synchronized (lock) {
      if (activeSession == null) return;

      Coord pos = mapCoord.floor(OCache.posres);
      Long gobId = _gobId(clickData);
      Integer meshId = _meshId(clickData);
      Coord gobPosition = _gobPosition(clickData);
      String gobResname = _gobResname(clickData);

      _resolvePendingPortalTransition(activeSession);
      _rotateSegmentIfPreviousWasPortal(activeSession);

      RecordingSegment segment = activeSession.currentSegment();
      if (segment.baseGobId == null && gobId != null && gobPosition != null) {
        segment.baseGobId = gobId;
        segment.baseGobX = gobPosition.x;
        segment.baseGobY = gobPosition.y;
        segment.startGobId = gobId;
        segment.startGobX = gobPosition.x;
        segment.startGobY = gobPosition.y;
        segment.startGobResname = gobResname;
      }

      segment.clicks.add(new RecordingClick(
        segment.clicks.size(),
        pos.x,
        pos.y,
        mouseButton,
        gobId,
        meshId,
        gobResname
      ));
    }
  }

  public static RecordingSession stop() {
    final RecordingSession session;
    synchronized (lock) {
      if (activeSession == null)
        return null;
      session = activeSession;
      _finalizeLastPortalClick(session);
      _resolvePendingPortalTransition(session);
      activeSession = null;
    }
    return session;
  }

  public static void setTerminalGob(Gob gob) {
    if (gob == null) return;

    synchronized (lock) {
      if (activeSession != null)
        throw new IllegalStateException("Cannot set terminal gob while recording is still active.");
    }
  }

  public static void setTerminalGob(RecordingSession session, Gob gob) {
    if (session == null || gob == null) return;

    synchronized (lock) {
      _resolvePendingPortalTransition(session);

      RecordingSegment current = session.currentSegment();
      current.endGobId = (long)gob.id();
      current.endGobX = gob.position().x;
      current.endGobY = gob.position().y;
      current.endGobResname = gob.resourceName();
    }
  }

  private static void _rotateSegmentIfPreviousWasPortal(RecordingSession session) {
    RecordingClick previous = session.lastClick();
    if (previous == null) return;
    if (previous.mouseButton != 3) return;
    if (!WaypointPortal.isPortalResname(previous.gobResname)) return;

    previous.isPortal = true;

    RecordingSegment current = session.currentSegment();
    current.endGobId = previous.gobId;
    current.endGobX = previous.x;
    current.endGobY = previous.y;
    current.endGobResname = previous.gobResname;

    String entryPortalResname = previous.gobResname;
    if (entryPortalResname != null) {
      session.pendingPortalTransition = new PendingPortalTransition(entryPortalResname);
    }

    RecordingSegment next = new RecordingSegment(
      session.segments.size(),
      null,
      0,
      0
    );
    session.segments.add(next);
  }

  private static void _finalizeLastPortalClick(RecordingSession session) {
    RecordingClick last = session.lastClick();
    if (last == null) return;
    if (last.mouseButton != 3) return;
    if (!WaypointPortal.isPortalResname(last.gobResname)) return;
    last.isPortal = true;
  }

  private static Long _gobId(ClickData clickData) {
    if (clickData == null || clickData.ci == null) return null;
    if (clickData.ci instanceof Gob.GobClick)
      return ((Gob.GobClick)clickData.ci).gob.id;
    if (clickData.ci instanceof haven.Composited.CompositeClick)
      return ((haven.Composited.CompositeClick)clickData.ci).gi.gob.id;
    return null;
  }

  private static String _gobResname(ClickData clickData) {
    if (clickData == null || clickData.ci == null) return null;
    if (clickData.ci instanceof Gob.GobClick)
      return ((Gob.GobClick)clickData.ci).gob.resourceName();
    if (clickData.ci instanceof haven.Composited.CompositeClick)
      return ((haven.Composited.CompositeClick)clickData.ci).gi.gob.resourceName();
    return null;
  }

  private static Integer _meshId(ClickData clickData) {
    if (clickData == null) return null;
    for (Object node : clickData.array()) {
      if (node instanceof FastMesh.ResourceMesh)
        return ((FastMesh.ResourceMesh)node).id;
    }
    return null;
  }

  private static Coord _gobPosition(ClickData clickData) {
    if (clickData == null || clickData.ci == null) return null;
    if (clickData.ci instanceof Gob.GobClick)
      return ((Gob.GobClick)clickData.ci).gob.position();
    if (clickData.ci instanceof haven.Composited.CompositeClick)
      return ((haven.Composited.CompositeClick)clickData.ci).gi.gob.position();
    return null;
  }

  private static void _resolvePendingPortalTransition(RecordingSession session) {
    PendingPortalTransition pending = session.pendingPortalTransition;
    if (pending == null) return;

    Gob exitPortal = WaypointPortal.closestCounterpartGob(pending.entryPortalResname);
    if (exitPortal == null) return;

    RecordingSegment current = session.currentSegment();
    current.baseGobId = (long)exitPortal.id();
    current.baseGobX = exitPortal.position().x;
    current.baseGobY = exitPortal.position().y;
    current.startGobId = (long)exitPortal.id();
    current.startGobX = exitPortal.position().x;
    current.startGobY = exitPortal.position().y;
    current.startGobResname = exitPortal.resourceName();
    session.pendingPortalTransition = null;
  }

}
