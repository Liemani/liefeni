---
source: [Future.java](../../../../src/haven/Future.java)
created: 2026-06-13
updated: 2026-06-14
---

# Future

Represents the future Haven component.

## Nested Types

### NotDone

- Role: Signals that the `Simple` future has not been completed yet.
- Description: Carries the waiting future so callers can register for completion.

## Members

### Constants

### Fields

#### `private final Waitable.Queue wq = new Waitable.Queue()`
- Role: Implements the wq operation.
- Description: Implements the queue operation.

#### `private T val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `private Throwable exc`
- Role: Caches the exc value.
- Description: Caches the `exc` value for reuse.

#### `private boolean set = false`
- Role: Tracks the set flag.
- Description: Caches the `set` value for reuse.

#### `public final transient Simple future`
- Role: Caches the future value.
- Description: Caches the `future` value for reuse.

### Methods

#### `public T get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public boolean done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public PastException(Throwable cause)`
- Role: Handles the past exception path.
- Description: Implements the past exception operation.

#### `public boolean done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `private NotDone(Simple future)`
- Role: Handles the not done path.
- Description: Implements the not done operation.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Registers a callback to run when the waitable becomes ready.
- Description: Registers a callback to run when the waitable becomes ready.

#### `public T get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void set(T val)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public void error(Throwable cause)`
- Role: Displays an error message.
- Description: Implements the error operation.