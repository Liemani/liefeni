package lmi.waypoint.recording;

import haven.ClickData;
import haven.Coord;
import haven.Coord2d;
import haven.FastMesh;
import haven.Gob;
import haven.OCache;

import lmi.waypoint.model.RecordingClick;
import lmi.waypoint.model.RecordingSegment;
import lmi.waypoint.model.RecordingSession;

public final class WaypointRecorder {
  private static final Object lock = new Object();
  private static RecordingSession activeSession;

  private WaypointRecorder() {}

  public static RecordingSession start(
    long startNodeId,
    long baseGraphId,
    long baseGridId,
    int baseLocalX,
    int baseLocalY
  ) {
    synchronized (lock) {
      if (activeSession != null)
        throw new IllegalStateException("A waypoint recording is already active.");
      activeSession = new RecordingSession(startNodeId, baseGraphId, baseGridId, baseLocalX, baseLocalY);
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

      Long gobId = _gobId(clickData);
      Integer meshId = _meshId(clickData);
      Coord gobPosition = _gobPosition(clickData);
      String gobResname = _gobResname(clickData);
      Coord pos = (gobPosition != null) ? gobPosition : mapCoord.floor(OCache.posres);

      RecordingSegment segment = activeSession.currentSegment();
      if (segment.baseGraphId == null && gobPosition != null) {
        lmi.waypoint.runtime.GridPosition position = lmi.waypoint.WaypointManager.gridPositionOfWorld(gobPosition);
        if (position != null) {
          segment.baseGraphId = lmi.waypoint.WaypointManager.activeGraphId();
          segment.baseGridId = position.gridId;
          segment.baseLocalX = position.localX;
          segment.baseLocalY = position.localY;
        }
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
      activeSession = null;
    }
    return session;
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
}
