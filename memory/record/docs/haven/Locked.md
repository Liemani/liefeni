---
source: [Locked.java](../../../../src/haven/Locked.java)
created: 2026-06-13
updated: 2026-06-14
---

# Locked

Represents the locked Haven component.

## Members

### Constants

### Fields

#### `private final Lock lk`
- Role: Caches the lk value.
- Description: Caches the `lk` value for reuse.

#### `private boolean held`
- Role: Tracks the held flag.
- Description: Caches the `held` value for reuse.

### Methods

#### `public Locked(Lock lk)`
- Role: Creates a new Locked instance.
- Description: Constructs the Locked instance from the supplied inputs.

#### `public void unlock()`
- Role: Handles the unlock path.
- Description: Implements the unlock operation.

#### `public void close()`
- Role: Closes the current resource.
- Description: Closes the current stream or resource.