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

  public static Session start(String name, long startNodeId, long baseGobId, int baseGobX, int baseGobY) {
    synchronized (lock) {
      if (activeSession != null)
        throw new IllegalStateException("A waypoint recording is already active.");
      activeSession = new Session(name, startNodeId, baseGobId, baseGobX, baseGobY);
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
      Coord gobPosition = _gobPosition(clickData);
      String gobResname = _gobResname(clickData);

      _resolvePendingDoorTransition(activeSession);
      _rotateSegmentIfPreviousWasDoor(activeSession, pos.x, gobId, gobPosition, gobResname);

      SegmentRecord segment = activeSession.currentSegment();
      if (segment.baseGobId == null && gobId != null && gobPosition != null) {
        segment.baseGobId = gobId;
        segment.baseGobX = gobPosition.x;
        segment.baseGobY = gobPosition.y;
        segment.startGobId = gobId;
        segment.startGobX = gobPosition.x;
        segment.startGobY = gobPosition.y;
        segment.startGobResname = gobResname;
      }

      segment.points.add(new PointRecord(
        segment.points.size(),
        pos.x,
        pos.y,
        mouseButton,
        gobId,
        meshId,
        gobResname
      ));
    }
  }

  public static Session stop() {
    final Session session;
    synchronized (lock) {
      if (activeSession == null)
        return null;
      session = activeSession;
      session.stoppedAtMillis = System.currentTimeMillis();
      _markLastDoorPoint(session);
      _resolvePendingDoorTransition(session);
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

  public static void setTerminalGob(Session session, Gob gob) {
    if (session == null || gob == null) return;

    SegmentRecord current = session.currentSegment();
    current.endGobId = (long)gob.id();
    current.endGobX = gob.position().x;
    current.endGobY = gob.position().y;
    current.endGobResname = gob.resourceName();
  }

  private static void _rotateSegmentIfPreviousWasDoor(Session session, int currentX, Long currentGobId, Coord currentGobPosition, String currentGobResname) {
    PointRecord previous = session.lastPoint();
    if (previous == null) return;

    if (Math.abs(currentX - previous.x) < 1000) return;

    previous.isDoor = true;

    SegmentRecord current = session.currentSegment();
    current.endGobId = previous.gobId;
    current.endGobX = previous.x;
    current.endGobY = previous.y;
    current.endGobResname = previous.gobResname;

    String entryDoorResname = previous.gobResname;
    if (entryDoorResname != null) {
      session.pendingDoorTransition = new PendingDoorTransition(entryDoorResname);
    }

    SegmentRecord next = new SegmentRecord(
      session.segments.size(),
      null,
      0,
      0
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

  private static void _resolvePendingDoorTransition(Session session) {
    PendingDoorTransition pending = session.pendingDoorTransition;
    if (pending == null) return;

    Gob exitDoor = WaypointDoor.closestCounterpartGob(pending.entryDoorResname);
    if (exitDoor == null) return;

    SegmentRecord current = session.currentSegment();
    current.baseGobId = (long)exitDoor.id();
    current.baseGobX = exitDoor.position().x;
    current.baseGobY = exitDoor.position().y;
    current.startGobId = (long)exitDoor.id();
    current.startGobX = exitDoor.position().x;
    current.startGobY = exitDoor.position().y;
    current.startGobResname = exitDoor.resourceName();
    session.pendingDoorTransition = null;
  }

  public static final class Session {
    public final String name;
    public final long startNodeId;
    public final List<SegmentRecord> segments = new ArrayList<>();
    public final long startedAtMillis;
    public long stoppedAtMillis;
    public PendingDoorTransition pendingDoorTransition;

    private Session(String name, long startNodeId, long baseGobId, int baseGobX, int baseGobY) {
      this.name = name;
      this.startNodeId = startNodeId;
      this.startedAtMillis = System.currentTimeMillis();
      this.segments.add(new SegmentRecord(0, baseGobId, baseGobX, baseGobY));
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
    public int baseGobX;
    public int baseGobY;
    public Long startGobId;
    public int startGobX;
    public int startGobY;
    public String startGobResname;
    public Long endGobId;
    public int endGobX;
    public int endGobY;
    public String endGobResname;
    public final List<PointRecord> points = new ArrayList<>();

    private SegmentRecord(int index, Long baseGobId, int baseGobX, int baseGobY) {
      this.index = index;
      this.baseGobId = baseGobId;
      this.baseGobX = baseGobX;
      this.baseGobY = baseGobY;
      this.startGobId = baseGobId;
      this.startGobX = baseGobX;
      this.startGobY = baseGobY;
    }
  }

  public static final class PointRecord {
    public final int index;
    public final int x;
    public final int y;
    public final int mouseButton;
    public final Long gobId;
    public final Integer meshId;
    public final String gobResname;
    public boolean isDoor;

    private PointRecord(int index, int x, int y, int mouseButton, Long gobId, Integer meshId, String gobResname) {
      this.index = index;
      this.x = x;
      this.y = y;
      this.mouseButton = mouseButton;
      this.gobId = gobId;
      this.meshId = meshId;
      this.gobResname = gobResname;
      this.isDoor = false;
    }
  }

  public static final class PendingDoorTransition {
    public final String entryDoorResname;

    private PendingDoorTransition(String entryDoorResname) {
      this.entryDoorResname = entryDoorResname;
    }
  }

}
