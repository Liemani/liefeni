# ManagedObjectContext

This file documents the responsibilities and members of `ManagedObjectContext`.

## Meta

- Source: [ManagedObjectContext.java](../../../../../src/lmi/waypoint/managed/ManagedObjectContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Carries managed-object state for waypoint persistence.

## Nested Types

### Key
### Key
- Role: Represents the key helper used by ManagedObjectContext.

- Role: Identifies one managed object by type and ID.
- Description: Describes the nested key type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final Map<Key, ManagedObject> identityMap = new HashMap<>()`
- Role: Caches identity map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final LinkedHashSet<ManagedObject> selectedObjects = new LinkedHashSet<>()`
- Role: Caches selected objects entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final LinkedHashSet<ManagedObject> dirtyObjects = new LinkedHashSet<>()`
- Role: Caches dirty objects entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final LinkedHashSet<ManagedObject> deletedObjects = new LinkedHashSet<>()`
- Role: Caches deleted objects entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Class<? extends ManagedObject> type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `private final long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

### Methods

#### `public synchronized <T extends ManagedObject> T registerLoaded(T object)`
- Role: Performs register loaded.
- Description: Supports the register loaded operation used by the surrounding class.

#### `public synchronized <T extends ManagedObject> T find(Class<T> type, long id)`
- Role: Performs find.
- Description: Supports the find operation used by the surrounding class.

#### `public synchronized Array<ManagedObject> takeSelectedObjects()`
- Role: Performs take selected objects.
- Description: Supports the take selected objects operation used by the surrounding class.

#### `public synchronized Array<ManagedWpNode> takeSelectedWpNodes()`
- Role: Performs take selected wp nodes.
- Description: Supports the take selected wp nodes operation used by the surrounding class.

#### `public synchronized void save()`
- Role: Coordinates save persistence or lookup.
- Description: Supports the save operation used by the surrounding class.

#### `public synchronized void save(WaypointResultHandler<SaveBatchResult> handler)`
- Role: Coordinates save persistence or lookup.
- Description: Supports the save operation used by the surrounding class.

#### `synchronized void markDirty(ManagedObject object)`
- Role: Performs mark dirty.
- Description: Supports the mark dirty operation used by the surrounding class.

#### `synchronized void markDeleted(ManagedObject object)`
- Role: Performs mark deleted.
- Description: Supports the mark deleted operation used by the surrounding class.

#### `synchronized void markClean(ManagedObject object)`
- Role: Performs mark clean.
- Description: Supports the mark clean operation used by the surrounding class.

#### `synchronized void onSaveSucceeded(SaveBatch batch, SaveBatchResult result)`
- Role: Performs on save succeeded.
- Description: Supports the on save succeeded operation used by the surrounding class.

#### `synchronized void onSaveFailed(SaveBatch batch)`
- Role: Performs on save failed.
- Description: Supports the on save failed operation used by the surrounding class.

#### `public synchronized void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `private synchronized SaveBatch buildSaveBatch()`
- Role: Performs build save batch.
- Description: Supports the build save batch operation used by the surrounding class.

#### `private Key(Class<? extends ManagedObject> type, long id)`
- Role: Performs key.
- Description: Supports the key operation used by the surrounding class.

#### `public boolean equals(Object other)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.
