---
source: [ManagedObject.java](../../../../../src/lmi/waypoint/managed/ManagedObject.java)
created: 2026-06-13
updated: 2026-06-14
---

# ManagedObject

Represents a managed waypoint domain object.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private final ManagedObjectContext context`
- Role: Stores the context value.
- Description: Backs the cached state for this file.

#### `private long version`
- Role: Stores the version value.
- Description: Backs the cached state for this file.

#### `private boolean dirty`
- Role: Tracks whether dirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private boolean deleted`
- Role: Tracks the deleted flag.
- Description: Supports the deleted operation used by the surrounding class.

#### `private boolean saving`
- Role: Tracks the saving flag.
- Description: Supports the saving operation used by the surrounding class.

#### `private boolean saveFailed`
- Role: Tracks the save failed flag.
- Description: Supports the save failed operation used by the surrounding class.

### Methods

#### `protected ManagedObject(ManagedObjectContext context, long id, long version)`
- Role: Creates a new ManagedObject instance.
- Description: Constructs the instance and initializes its default state.

#### `public final long version()`
- Role: Performs version.
- Description: Supports the version operation used by the surrounding class.

#### `public final boolean isDirty()`
- Role: Checks whether the dirty.
- Description: Returns a boolean result for the described condition.

#### `public final boolean isDeleted()`
- Role: Checks whether the deleted.
- Description: Returns a boolean result for the described condition.

#### `public final boolean isSaving()`
- Role: Checks whether the saving.
- Description: Returns a boolean result for the described condition.

#### `public final boolean isSaveFailed()`
- Role: Checks whether the save failed.
- Description: Returns a boolean result for the described condition.

#### `protected final ManagedObjectContext context()`
- Role: Returns the avatar owner context.
- Description: Exposes the requested value without mutating state.

#### `protected final void markDirty()`
- Role: Performs mark dirty.
- Description: Supports the mark dirty operation used by the surrounding class.

#### `public final void markDeleted()`
- Role: Performs mark deleted.
- Description: Supports the mark deleted operation used by the surrounding class.

#### `final void onSaveQueued()`
- Role: Performs on save queued.
- Description: Supports the on save queued operation used by the surrounding class.

#### `final void onSaveSucceeded(long savedVersion)`
- Role: Performs on save succeeded.
- Description: Supports the on save succeeded operation used by the surrounding class.

#### `final void onSaveFailed()`
- Role: Performs on save failed.
- Description: Supports the on save failed operation used by the surrounding class.

#### `final void onSaveRolledBack()`
- Role: Performs on save rolled back.
- Description: Supports the on save rolled back operation used by the surrounding class.
