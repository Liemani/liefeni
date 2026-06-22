---
source: [ManagedObjectContext.java](../../../../../../src/lmi/waypoint/managed/ManagedObjectContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# ManagedObjectContext

Carries managed-object state for waypoint persistence.

## Nested Types

### Key
- Role: Identifies one managed object by type and id.
- Description: Combines the Java class and database id into a stable lookup key for the context maps.

## Members

### Constants

### Fields

#### `private final Map<Key, ManagedObject> identityMap = new HashMap<>()`
- Role: Implements the identity map operation.
- Description: Implements the private final map<key, managed object> identity map = new hash map<>() operation.

#### `private final LinkedHashSet<ManagedObject> selectedObjects = new LinkedHashSet<>()`
- Role: Implements the selected objects operation.
- Description: Implements the private final linked hash set<managed object> selected objects = new linked hash set<>() operation.

#### `private final LinkedHashSet<ManagedObject> dirtyObjects = new LinkedHashSet<>()`
- Role: Implements the dirty objects operation.
- Description: Implements the private final linked hash set<managed object> dirty objects = new linked hash set<>() operation.

#### `private final LinkedHashSet<ManagedObject> deletedObjects = new LinkedHashSet<>()`
- Role: Implements the deleted objects operation.
- Description: Implements the private final linked hash set<managed object> deleted objects = new linked hash set<>() operation.

#### `private final Class<? extends ManagedObject> type`
- Role: Caches the type value.
- Description: Caches the `type` value for reuse.

#### `private final long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

### Methods

#### `public synchronized <T extends ManagedObject> T registerLoaded(T object)`
- Role: Handles the register loaded path.
- Description: Implements the register loaded operation.

#### `public synchronized <T extends ManagedObject> T find(Class<T> type, long id)`
- Role: Handles the find path.
- Description: Finds the requested data.

#### `public synchronized Array<ManagedObject> takeSelectedObjects()`
- Role: Handles the take selected objects path.
- Description: Implements the take selected objects operation.

#### `public synchronized Array<ManagedWpNode> takeSelectedWpNodes()`
- Role: Handles the take selected wp nodes path.
- Description: Implements the take selected wp nodes operation.

#### `public synchronized void save()`
- Role: Coordinates save persistence or lookup.
- Description: Persists the requested data.

#### `public synchronized void save(WaypointResultHandler<SaveBatchResult> handler)`
- Role: Coordinates save persistence or lookup.
- Description: Persists the requested data.

#### `synchronized void markDirty(ManagedObject object)`
- Role: Handles the mark dirty path.
- Description: Implements the mark dirty operation.

#### `synchronized void markDeleted(ManagedObject object)`
- Role: Handles the mark deleted path.
- Description: Implements the mark deleted operation.

#### `synchronized void markClean(ManagedObject object)`
- Role: Handles the mark clean path.
- Description: Implements the mark clean operation.

#### `synchronized void onSaveSucceeded(SaveBatch batch, SaveBatchResult result)`
- Role: Handles the on save succeeded path.
- Description: Implements the on save succeeded operation.

#### `synchronized void onSaveFailed(SaveBatch batch)`
- Role: Handles the on save failed path.
- Description: Implements the on save failed operation.

#### `public synchronized void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `private synchronized SaveBatch buildSaveBatch()`
- Role: Handles the build save batch path.
- Description: Implements the build save batch operation.

#### `private Key(Class<? extends ManagedObject> type, long id)`
- Role: Handles the key path.
- Description: Implements the key operation.

#### `public boolean equals(Object other)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.