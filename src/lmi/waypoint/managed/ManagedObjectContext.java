package lmi.waypoint.managed;

import lmi.Array;
import lmi.waypoint.EmptyWaypointResult;
import lmi.waypoint.WaypointDbExecutor;
import lmi.waypoint.WaypointResultHandler;
import lmi.waypoint.WaypointStore;
import lmi.waypoint.WaypointWriteRequest;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Map;

public final class ManagedObjectContext {
  private final Map<Key, ManagedObject> identityMap = new HashMap<>();
  private final LinkedHashSet<ManagedObject> selectedObjects = new LinkedHashSet<>();
  private final LinkedHashSet<ManagedObject> dirtyObjects = new LinkedHashSet<>();
  private final LinkedHashSet<ManagedObject> deletedObjects = new LinkedHashSet<>();

  @SuppressWarnings("unchecked")
  public synchronized <T extends ManagedObject> T registerLoaded(T object) {
    Key key = new Key(object.getClass(), object.id);
    ManagedObject existing = identityMap.get(key);
    if (existing != null)
      return (T)existing;

    identityMap.put(key, object);
    selectedObjects.add(object);
    return object;
  }

  public synchronized <T extends ManagedObject> T find(Class<T> type, long id) {
    return type.cast(identityMap.get(new Key(type, id)));
  }

  public synchronized Array<ManagedObject> takeSelectedObjects() {
    Array<ManagedObject> selected = new Array<>();
    selected.addAll(selectedObjects);
    selectedObjects.clear();
    return selected;
  }

  public synchronized Array<ManagedWpNode> takeSelectedWpNodes() {
    Array<ManagedWpNode> selected = new Array<>();
    Array<ManagedObject> all = takeSelectedObjects();
    for (ManagedObject object : all) {
      if (object instanceof ManagedWpNode)
        selected.append((ManagedWpNode)object);
    }
    return selected;
  }

  public synchronized void save() {
    SaveBatch batch = buildSaveBatch();
    if (batch.isEmpty())
      return;

    for (WpNodeSnapshot snapshot : batch.wpNodeSnapshots) {
      ManagedWpNode node = find(ManagedWpNode.class, snapshot.id);
      if (node != null)
        node.onSaveQueued();
    }

    WaypointDbExecutor.submitWrite(new WaypointWriteRequest<EmptyWaypointResult>() {
      @Override
      public EmptyWaypointResult execute(java.sql.Connection conn) throws Exception {
        WaypointStore.applySaveBatch(conn, batch);
        return EmptyWaypointResult.INSTANCE;
      }
    }, new WaypointResultHandler<EmptyWaypointResult>() {
      @Override
      public void onSuccess(EmptyWaypointResult result) {
        onSaveSucceeded(batch);
      }

      @Override
      public void onFailure(Exception error) {
        onSaveFailed(batch);
      }
    });
  }

  synchronized void markDirty(ManagedObject object) {
    deletedObjects.remove(object);
    dirtyObjects.add(object);
  }

  synchronized void markDeleted(ManagedObject object) {
    identityMap.remove(new Key(object.getClass(), object.id));
    dirtyObjects.remove(object);
    deletedObjects.add(object);
  }

  synchronized void markClean(ManagedObject object) {
    dirtyObjects.remove(object);
    deletedObjects.remove(object);
  }

  synchronized void onSaveSucceeded(SaveBatch batch) {
    for (WpNodeSnapshot snapshot : batch.wpNodeSnapshots) {
      ManagedWpNode node = find(ManagedWpNode.class, snapshot.id);
      if (node != null)
        node.onSaveSucceeded(snapshot.version);
    }
  }

  synchronized void onSaveFailed(SaveBatch batch) {
    for (WpNodeSnapshot snapshot : batch.wpNodeSnapshots) {
      ManagedWpNode node = find(ManagedWpNode.class, snapshot.id);
      if (node != null)
        node.onSaveFailed();
    }
  }

  public synchronized void clear() {
    identityMap.clear();
    selectedObjects.clear();
    dirtyObjects.clear();
    deletedObjects.clear();
  }

  private synchronized SaveBatch buildSaveBatch() {
    ArrayList<WpNodeSnapshot> wpNodeSnapshots = new ArrayList<>();
    for (ManagedObject object : dirtyObjects) {
      if (object instanceof ManagedWpNode)
        wpNodeSnapshots.add(((ManagedWpNode)object).snapshot());
    }
    return new SaveBatch(wpNodeSnapshots);
  }

  private static final class Key {
    private final Class<? extends ManagedObject> type;
    private final long id;

    private Key(Class<? extends ManagedObject> type, long id) {
      this.type = type;
      this.id = id;
    }

    @Override
    public boolean equals(Object other) {
      if (this == other) return true;
      if (!(other instanceof Key)) return false;
      Key key = (Key)other;
      return (id == key.id) && type.equals(key.type);
    }

    @Override
    public int hashCode() {
      return (31 * type.hashCode()) + (int)(id ^ (id >>> 32));
    }
  }
}
