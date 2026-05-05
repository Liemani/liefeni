package lmi.waypoint.managed;

import lmi.waypoint.object.WpAnchor;

public final class ManagedWpAnchor extends ManagedObject {
  public static final long ID = 1L;

  private Long graphId;
  private int virX;
  private int virY;

  private Long rollbackGraphId;
  private int rollbackVirX;
  private int rollbackVirY;

  private ManagedWpAnchor(ManagedObjectContext context, long version, Long graphId, int virX, int virY) {
    super(context, ID, version);
    this.graphId = graphId;
    this.virX = virX;
    this.virY = virY;
  }

  public static ManagedWpAnchor fromWpAnchor(ManagedObjectContext context, WpAnchor anchor) {
    return new ManagedWpAnchor(context, 0, anchor.graphId, anchor.virX, anchor.virY);
  }

  public static ManagedWpAnchor missing(ManagedObjectContext context) {
    return new ManagedWpAnchor(context, 0, null, 0, 0);
  }

  public Long graphId() {
    return graphId;
  }

  public int virX() {
    return virX;
  }

  public int virY() {
    return virY;
  }

  public boolean ensurePresent() {
    if (graphId != null)
      return false;
    if (isDirty() || isSaving())
      return false;
    rememberRollbackState();
    markDirty();
    return true;
  }

  public void moveTo(long graphId, int virX, int virY) {
    if ((this.graphId != null) && (this.graphId == graphId) && (this.virX == virX) && (this.virY == virY))
      return;
    rememberRollbackState();
    this.graphId = graphId;
    this.virX = virX;
    this.virY = virY;
    markDirty();
  }

  public WpAnchorSnapshot snapshot() {
    return new WpAnchorSnapshot(id, version(), graphId, virX, virY);
  }

  public WpAnchor toWpAnchor() {
    if (graphId == null)
      return null;
    return WpAnchor.of(id, graphId, virX, virY);
  }

  void onAnchorSaveSucceeded(WpAnchorSnapshot snapshot, Long persistedGraphId) {
    if (persistedGraphId != null)
      this.graphId = persistedGraphId;
    rollbackGraphId = null;
    rollbackVirX = 0;
    rollbackVirY = 0;
    onSaveSucceeded(snapshot.version);
  }

  void onAnchorSaveFailed() {
    this.graphId = rollbackGraphId;
    this.virX = rollbackVirX;
    this.virY = rollbackVirY;
    onSaveRolledBack();
  }

  private void rememberRollbackState() {
    if (isDirty())
      return;
    rollbackGraphId = graphId;
    rollbackVirX = virX;
    rollbackVirY = virY;
  }
}
