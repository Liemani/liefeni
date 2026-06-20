---
source: [Future.java](../../../src/haven/Future.java)
created: 2026-06-13
updated: 2026-06-14
---

# Future

Represents the future Haven component.

## Nested Types

### NotDone

- Role: Represents not done within Future.
- Description: Describes the nested not done type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final Waitable.Queue wq = new Waitable.Queue()`
- Role: Caches wq entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private T val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

#### `private Throwable exc`
- Role: Holds the exc state.
- Description: Backs the cached state for this file.

#### `private boolean set = false`
- Role: Tracks the set flag.
- Description: Supports the set operation used by the surrounding class.

#### `public final transient Simple future`
- Role: Holds the future state.
- Description: Backs the cached state for this file.

### Methods

#### `public T get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public boolean done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public PastException(Throwable cause)`
- Role: Performs past exception.
- Description: Supports the past exception operation used by the surrounding class.

#### `public boolean done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `private NotDone(Simple future)`
- Role: Performs not done.
- Description: Supports the not done operation used by the surrounding class.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Performs waitfor.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public T get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void set(T val)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public void error(Throwable cause)`
- Role: Displays an error message.
- Description: Supports the error operation used by the surrounding class.
