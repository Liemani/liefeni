# ManagedObject

This file documents the responsibilities and members of `ManagedObject`.

## Meta

- Source: [ManagedObject.java](../../../../../src/lmi/waypoint/managed/ManagedObject.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a waypoint object shared between runtime and persistence.

## Members

### Constants

### Fields

#### `public final long id`

- Description: TODO

#### `private final ManagedObjectContext context`

- Description: TODO

#### `private long version`

- Description: TODO

#### `private boolean dirty`

- Description: TODO

#### `private boolean deleted`

- Description: TODO

#### `private boolean saving`

- Description: TODO

#### `private boolean saveFailed`

- Description: TODO

### Methods

#### `protected ManagedObject(ManagedObjectContext context, long id, long version)`

- Description: TODO

#### `public final long version()`

- Description: TODO

#### `public final boolean isDirty()`

- Description: TODO

#### `public final boolean isDeleted()`

- Description: TODO

#### `public final boolean isSaving()`

- Description: TODO

#### `public final boolean isSaveFailed()`

- Description: TODO

#### `protected final ManagedObjectContext context()`

- Description: TODO

#### `protected final void markDirty()`

- Description: TODO

#### `public final void markDeleted()`

- Description: TODO

#### `final void onSaveQueued()`

- Description: TODO

#### `final void onSaveSucceeded(long savedVersion)`

- Description: TODO

#### `final void onSaveFailed()`

- Description: TODO

#### `final void onSaveRolledBack()`

- Description: TODO
