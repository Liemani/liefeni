package lmi.waypoint;

import haven.ClickData;
import haven.Coord;
import haven.Coord2d;
import haven.FastMesh;
import haven.Gob;
import haven.OCache;

import java.util.ArrayList;
import java.util.List;

public final class WaypointRecorder {
  private static final Object lock = new Object();
  private static Session activeSession;

  private WaypointRecorder() {}

  public static Session start(String name) {
    synchronized (lock) {
      if (activeSession != null)
        throw new IllegalStateException("A waypoint recording is already active.");
      activeSession = new Session(name);
      return activeSession;
    }
  }

  public static boolean isActive(Session session) {
    synchronized (lock) {
      return activeSession == session;
    }
  }

  public static void discard(Session session) {
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
      activeSession.clicks.add(new ClickRecord(
        activeSession.clicks.size(),
        pos.x,
        pos.y,
        mouseButton,
        gobId,
        _meshId(clickData)
      ));
    }
  }

  public static StopResult stopAndSave() {
    final Session session;
    synchronized (lock) {
      if (activeSession == null)
        return StopResult.noActiveSession();
      session = activeSession;
      session.stoppedAtMillis = System.currentTimeMillis();
      activeSession = null;
    }

    String error = WaypointDatabase.save(session);
    if (error == null)
      return StopResult.saved(session.name, session.clicks.size());
    return StopResult.failed(session.name, session.clicks.size(), error);
  }

  private static Long _gobId(ClickData clickData) {
    if (clickData == null || clickData.ci == null) return null;
    if (clickData.ci instanceof Gob.GobClick)
      return ((Gob.GobClick)clickData.ci).gob.id;
    if (clickData.ci instanceof haven.Composited.CompositeClick)
      return ((haven.Composited.CompositeClick)clickData.ci).gi.gob.id;
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

  public static final class Session {
    public final String name;
    final List<ClickRecord> clicks = new ArrayList<>();
    final long startedAtMillis;
    long stoppedAtMillis;

    private Session(String name) {
      this.name = name;
      this.startedAtMillis = System.currentTimeMillis();
    }
  }

  public static final class ClickRecord {
    final int index;
    final int x;
    final int y;
    final int mouseButton;
    final Long gobId;
    final Integer meshId;

    private ClickRecord(int index, int x, int y, int mouseButton, Long gobId, Integer meshId) {
      this.index = index;
      this.x = x;
      this.y = y;
      this.mouseButton = mouseButton;
      this.gobId = gobId;
      this.meshId = meshId;
    }
  }

  public static final class StopResult {
    public final boolean hadActiveSession;
    public final boolean saved;
    public final String recordingName;
    public final int clickCount;
    public final String errorMessage;

    private StopResult(boolean hadActiveSession, boolean saved, String recordingName, int clickCount, String errorMessage) {
      this.hadActiveSession = hadActiveSession;
      this.saved = saved;
      this.recordingName = recordingName;
      this.clickCount = clickCount;
      this.errorMessage = errorMessage;
    }

    private static StopResult noActiveSession() {
      return new StopResult(false, false, null, 0, null);
    }

    private static StopResult saved(String recordingName, int clickCount) {
      return new StopResult(true, true, recordingName, clickCount, null);
    }

    private static StopResult failed(String recordingName, int clickCount, String errorMessage) {
      return new StopResult(true, false, recordingName, clickCount, errorMessage);
    }
  }
}
