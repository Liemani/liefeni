---
source: [Waitable.java](../../../../src/haven/Waitable.java)
created: 2026-06-13
updated: 2026-06-14
---

# Waitable

Defines a callback-based wait/notify abstraction for deferred runtime work.

## Nested Types

### Waiter

- Role: Represents one queued callback.
- Description: Stores the callback and lets the waiter cancel itself before notification.

## Members

### Constants

### Fields

#### `public static Waiting dummy = new Waiting()`
- Role: Provides a no-op waiting token.
- Description: Used when a callback is already ready and no cancellation handle is needed.

#### `private Collection<Waiter> waiters = null`
- Role: Stores registered waiters.
- Description: Holds callbacks that are waiting for the next notification.

#### `final Runnable callback`
- Role: Stores the callback.
- Description: Runs when this waiter is notified.

#### `private final Waiting[] ops`
- Role: Stores operand wait handles.
- Description: Tracks the cancellation tokens for each waitable in a disjunction.

#### `private final Runnable callback`
- Role: Stores the callback.
- Description: Runs once the checked condition becomes true.

#### `private boolean done = false, ready = false`
- Role: Tracks disjunction state.
- Description: Records whether the OR wait has fired and whether registration has finished.

#### `private boolean done = false, ready = false`
- Role: Tracks checker state.
- Description: Records whether the checker has already fired or been queued.

#### `public final Runnable callback`
- Role: Stores the callback.
- Description: Runs when the checked condition becomes true.

#### `private Waiting cw`
- Role: Stores the active wait token.
- Description: Keeps the cancellation handle for the current checked wait.

### Methods

#### `public void waitfor(Runnable callback, Consumer<Waiting> reg)`
- Role: Registers a callback for later notification.
- Description: Adds the callback to the queue and hands back a cancellation token.

#### `public void cancel()`
- Role: Cancels the wait.
- Description: Removes the callback from the queue if it has not fired yet.

#### `Waiter(Runnable callback)`
- Role: Creates a queued waiter.
- Description: Stores the callback that will run when the queue is notified.

#### `public void cancel()`
- Role: Cancels the queued waiter.
- Description: Removes this waiter from the queue before notification.

#### `public void wnotify()`
- Role: Notifies all waiters.
- Description: Runs every queued callback and clears the queue.

#### `private Waiter add(Waiter w)`
- Role: Registers a waiter.
- Description: Inserts a waiter into the queue and returns it.

#### `public Waiter add(Runnable callback)`
- Role: Registers a runnable callback.
- Description: Wraps the runnable in a waiter and adds it to the queue.

#### `public void waitfor(Runnable callback, Consumer<Waiting> reg)`
- Role: Registers a callback for later notification.
- Description: Adds the callback to the queue and hands back a cancellation token.

#### `public Disjunction(Runnable callback, Waitable... ops)`
- Role: Waits for any operand.
- Description: Subscribes to multiple waitables and fires when the first one becomes ready.

#### `public void run()`
- Role: Handles one operand firing.
- Description: Marks the disjunction complete and triggers the callback when ready.

#### `public void cancel()`
- Role: Cancels the disjunction.
- Description: Cancels every registered operand wait token.

#### `public static void or(Runnable callback, Consumer<Waiting> reg, Waitable... ops)`
- Role: Registers an OR wait.
- Description: Runs the callback when any supplied waitable becomes ready.

#### `public Checker(Runnable callback)`
- Role: Creates a condition checker.
- Description: Stores the callback that runs once the condition is satisfied.

#### `protected abstract Object monitor()`
- Role: Returns the monitor object.
- Description: Supplies the lock used to guard condition checks.

#### `protected abstract boolean check()`
- Role: Evaluates the condition.
- Description: Returns whether the awaited condition is currently satisfied.

#### `protected abstract Waiting add()`
- Role: Registers the checker.
- Description: Adds the checker to the underlying wait source.

#### `public Checker addi()`
- Role: Adds this checker immediately.
- Description: Registers the checker and returns itself for chaining.

#### `public void run()`
- Role: Evaluates the checker.
- Description: Rechecks the condition and either runs the callback or requeues the wait.

#### `public void cancel()`
- Role: Cancels the checker.
- Description: Cancels the active wait token if one has been registered.