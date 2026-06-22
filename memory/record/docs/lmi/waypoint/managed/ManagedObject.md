---
source: [ManagedObject.java](../../../../../../src/lmi/waypoint/managed/ManagedObject.java)
created: 2026-06-13
updated: 2026-06-14
---

# ManagedObject

Represents a managed waypoint domain object.

## Members

### Constants

### Fields

#### `public final long id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private final ManagedObjectContext context`
- Role: Caches the context value.
- Description: Caches the `context` value for reuse.

#### `private long version`
- Role: Caches the version value.
- Description: Caches the `version` value for reuse.

#### `private boolean dirty`
- Role: Tracks whether dirty is dirty.
- Description: Boolean flag used to guard the surrounding lifecycle state.

#### `private boolean deleted`
- Role: Tracks the deleted flag.
- Description: Caches the `deleted` value for reuse.

#### `private boolean saving`
- Role: Tracks the saving flag.
- Description: Caches the `saving` value for reuse.

#### `private boolean saveFailed`
- Role: Tracks the save failed flag.
- Description: Caches the `saveFailed` value for reuse.

### Methods

#### `protected ManagedObject(ManagedObjectContext context, long id, long version)`
- Role: Creates a new ManagedObject instance.
- Description: Constructs the ManagedObject instance from the supplied inputs.

#### `public final long version()`
- Role: Handles the version path.
- Description: Implements the version operation.

#### `public final boolean isDirty()`
- Role: Checks whether the dirty.
- Description: Returns whether the condition is satisfied.

#### `public final boolean isDeleted()`
- Role: Checks whether the deleted.
- Description: Returns whether the condition is satisfied.

#### `public final boolean isSaving()`
- Role: Checks whether the saving.
- Description: Returns whether the condition is satisfied.

#### `public final boolean isSaveFailed()`
- Role: Checks whether the save failed.
- Description: Returns whether the condition is satisfied.

#### `protected final ManagedObjectContext context()`
- Role: Returns the avatar owner context.
- Description: Implements the context operation.

#### `protected final void markDirty()`
- Role: Handles the mark dirty path.
- Description: Implements the mark dirty operation.

#### `public final void markDeleted()`
- Role: Handles the mark deleted path.
- Description: Implements the mark deleted operation.

#### `final void onSaveQueued()`
- Role: Handles the on save queued path.
- Description: Implements the on save queued operation.

#### `final void onSaveSucceeded(long savedVersion)`
- Role: Handles the on save succeeded path.
- Description: Implements the on save succeeded operation.

#### `final void onSaveFailed()`
- Role: Handles the on save failed path.
- Description: Implements the on save failed operation.

#### `final void onSaveRolledBack()`
- Role: Handles the on save rolled backing data path.
- Description: Implements the on save rolled back operation.