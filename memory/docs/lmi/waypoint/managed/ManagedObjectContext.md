# ManagedObjectContext

This file documents the responsibilities and members of `ManagedObjectContext`.

## Meta

- Source: [ManagedObjectContext.java](../../../../../src/lmi/waypoint/managed/ManagedObjectContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Holds runtime state for its corresponding subsystem.

## Nested Types

### Key

- Description: TODO

## Members

### Constants

### Fields

#### `private final Map<Key, ManagedObject> identityMap = new HashMap<>()`

- Description: TODO

#### `private final LinkedHashSet<ManagedObject> selectedObjects = new LinkedHashSet<>()`

- Description: TODO

#### `private final LinkedHashSet<ManagedObject> dirtyObjects = new LinkedHashSet<>()`

- Description: TODO

#### `private final LinkedHashSet<ManagedObject> deletedObjects = new LinkedHashSet<>()`

- Description: TODO

#### `private final Class<? extends ManagedObject> type`

- Description: TODO

#### `private final long id`

- Description: TODO

### Methods

#### `public synchronized <T extends ManagedObject> T registerLoaded(T object)`

- Description: TODO

#### `public synchronized <T extends ManagedObject> T find(Class<T> type, long id)`

- Description: TODO

#### `public synchronized Array<ManagedObject> takeSelectedObjects()`

- Description: TODO

#### `public synchronized Array<ManagedWpNode> takeSelectedWpNodes()`

- Description: TODO

#### `public synchronized void save()`

- Description: TODO

#### `public synchronized void save(WaypointResultHandler<SaveBatchResult> handler)`

- Description: TODO

#### `synchronized void markDirty(ManagedObject object)`

- Description: TODO

#### `synchronized void markDeleted(ManagedObject object)`

- Description: TODO

#### `synchronized void markClean(ManagedObject object)`

- Description: TODO

#### `synchronized void onSaveSucceeded(SaveBatch batch, SaveBatchResult result)`

- Description: TODO

#### `synchronized void onSaveFailed(SaveBatch batch)`

- Description: TODO

#### `public synchronized void clear()`

- Description: TODO

#### `private synchronized SaveBatch buildSaveBatch()`

- Description: TODO

#### `private Key(Class<? extends ManagedObject> type, long id)`

- Description: TODO

#### `public boolean equals(Object other)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO
