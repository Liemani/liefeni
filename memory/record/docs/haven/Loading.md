---
source: [Loading.java](../../../../src/haven/Loading.java)
created: 2026-06-13
updated: 2026-06-14
---

# Loading

Represents the loading Haven component.

## Nested Types

### UnwaitableEvent

- Role: Signals that a Loading instance cannot be waited on.
- Description: Exception thrown when code tries to wait on a non-waitable Loading wrapper.

## Members

### Constants

### Fields

#### `public final Loading rec`
- Role: Caches the rec value.
- Description: Chains this loading exception to an earlier loading cause.

#### `public final Loading event`
- Role: Caches the event value.
- Description: Stores the loading event that could not be waited on.

### Methods

#### `public Loading()`
- Role: Creates a new Loading instance.
- Description: Constructs the Loading instance from the supplied inputs.

#### `public Loading(String msg)`
- Role: Creates a new Loading instance.
- Description: Constructs the Loading instance from the supplied inputs.

#### `public Loading(Throwable cause)`
- Role: Creates a new Loading instance.
- Description: Constructs the Loading instance from the supplied inputs.

#### `public Loading(String msg, Throwable cause)`
- Role: Creates a new Loading instance.
- Description: Constructs the Loading instance from the supplied inputs.

#### `public Loading(Loading rec)`
- Role: Creates a new Loading instance.
- Description: Constructs the Loading instance from the supplied inputs.

#### `public Loading(String msg, Loading rec)`
- Role: Creates a new Loading instance.
- Description: Constructs the Loading instance from the supplied inputs.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Returns the message.

#### `public UnwaitableEvent(String message, Loading event)`
- Role: Wraps a loading event that cannot be waited on.
- Description: Wraps a loading event that cannot be waited on.

#### `public UnwaitableEvent(Loading event)`
- Role: Wraps a loading event that cannot be waited on.
- Description: Wraps a loading event that cannot be waited on.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Registers a callback to run when the waitable becomes ready.
- Description: Registers a callback to run when the waitable becomes ready.

#### `public boolean boostprio(int prio)`
- Role: Handles the boostprio path.
- Description: Loading exceptions cannot raise priority here, so this returns false.

#### `private void queuewait() throws InterruptedException`
- Role: Handles the queuewait workflow.
- Description: Waits for the loading callback by parking the current thread.

#### `public void waitfor() throws InterruptedException`
- Role: Handles the waitfor workflow.
- Description: Waits for the chained loading exception or the local callback path.

#### `public static <T> T waitforint(Indir<T> x) throws InterruptedException`
- Role: Handles the waitforint workflow.
- Description: Repeatedly resolves the indir while boosting and waiting on any loading exception.

#### `public static <T> T waitfor(Indir<T> x)`
- Role: Registers a callback to run when the waitable becomes ready.
- Description: Repeatedly resolves the indir and preserves interruption state if needed.

#### `public static <T> T or(Supplier<T> x, T def)`
- Role: Registers a callback that fires when any supplied waitable becomes ready.
- Description: Returns the supplier value, or a default value if it is still loading.

#### `public static <T> T or(Supplier<T> x, Supplier<T> def)`
- Role: Registers a callback that fires when any supplied waitable becomes ready.
- Description: Returns the supplier value, or falls back to another supplier if it is still loading.
