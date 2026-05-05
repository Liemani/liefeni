package lmi.waypoint.managed;

public abstract class ManagedObject {
  public final long id;

  private final ManagedObjectContext context;
  private long version;
  private boolean dirty;
  private boolean deleted;
  private boolean saving;
  private boolean saveFailed;

  protected ManagedObject(ManagedObjectContext context, long id, long version) {
    this.context = context;
    this.id = id;
    this.version = version;
  }

  public final long version() {
    return version;
  }

  public final boolean isDirty() {
    return dirty;
  }

  public final boolean isDeleted() {
    return deleted;
  }

  public final boolean isSaving() {
    return saving;
  }

  public final boolean isSaveFailed() {
    return saveFailed;
  }

  protected final ManagedObjectContext context() {
    return context;
  }

  protected final void markDirty() {
    version += 1;
    dirty = true;
    saveFailed = false;
    context.markDirty(this);
  }

  public final void markDeleted() {
    deleted = true;
    dirty = false;
    saving = false;
    saveFailed = false;
    context.markDeleted(this);
  }

  final void onSaveQueued() {
    saving = true;
    saveFailed = false;
  }

  final void onSaveSucceeded(long savedVersion) {
    saving = false;
    saveFailed = false;
    deleted = false;
    if (version == savedVersion) {
      dirty = false;
      context.markClean(this);
    }
  }

  final void onSaveFailed() {
    saving = false;
    saveFailed = true;
  }

  final void onSaveRolledBack() {
    saving = false;
    dirty = false;
    deleted = false;
    saveFailed = true;
    context.markClean(this);
  }
}
