package lmi.waypoint;

import haven.ClickData;
import haven.Coord;
import haven.Coord2d;
import haven.FastMesh;
import haven.Gob;
import haven.OCache;

import java.util.ArrayList;
import java.util.List;

import lmi.Self;

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
      Integer meshId = _meshId(clickData);

      _rotateSegmentIfPreviousWasDoor(activeSession, pos.x, gobId);

      SegmentRecord segment = activeSession.currentSegment();
      if (segment.baseGobId == null && gobId != null) {
        segment.baseGobId = gobId;
      }

      segment.points.add(new PointRecord(
        segment.points.size(),
        pos.x,
        pos.y,
        mouseButton,
        gobId,
        meshId
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
      _markLastDoorPoint(session);
      activeSession = null;
    }

    String error = WaypointDatabase.save(session);
    if (error == null)
      return StopResult.saved(session.name, session.pointCount());
    return StopResult.failed(session.name, session.pointCount(), error);
  }

  private static void _rotateSegmentIfPreviousWasDoor(Session session, int currentX, Long currentGobId) {
    PointRecord previous = session.lastPoint();
    if (previous == null) return;

    if (Math.abs(currentX - previous.x) < 1000) return;

    previous.isDoor = true;

    SegmentRecord next = new SegmentRecord(
      session.segments.size(),
      (currentGobId != null) ? currentGobId : previous.gobId
    );
    session.segments.add(next);
  }

  private static void _markLastDoorPoint(Session session) {
    PointRecord last = session.lastPoint();
    if (last == null) return;
    last.isDoor = Math.abs(Self.position().x - last.x) >= 1000;
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
    public final List<SegmentRecord> segments = new ArrayList<>();
    public final long startedAtMillis;
    public long stoppedAtMillis;

    private Session(String name) {
      this.name = name;
      this.startedAtMillis = System.currentTimeMillis();
      this.segments.add(new SegmentRecord(0, null));
    }

    public int pointCount() {
      int count = 0;
      for (SegmentRecord segment : segments) {
        count += segment.points.size();
      }
      return count;
    }

    SegmentRecord currentSegment() {
      return segments.get(segments.size() - 1);
    }

    PointRecord lastPoint() {
      for (int i = segments.size() - 1; i >= 0; --i) {
        SegmentRecord segment = segments.get(i);
        if (!segment.points.isEmpty())
          return segment.points.get(segment.points.size() - 1);
      }
      return null;
    }
  }

  public static final class SegmentRecord {
    public final int index;
    public Long baseGobId;
    public final List<PointRecord> points = new ArrayList<>();

    private SegmentRecord(int index, Long baseGobId) {
      this.index = index;
      this.baseGobId = baseGobId;
    }
  }

  public static final class PointRecord {
    public final int index;
    public final int x;
    public final int y;
    public final int mouseButton;
    public final Long gobId;
    public final Integer meshId;
    public boolean isDoor;

    private PointRecord(int index, int x, int y, int mouseButton, Long gobId, Integer meshId) {
      this.index = index;
      this.x = x;
      this.y = y;
      this.mouseButton = mouseButton;
      this.gobId = gobId;
      this.meshId = meshId;
      this.isDoor = false;
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
