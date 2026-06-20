---
source: [Waitable.java](../../../src/haven/Waitable.java)
created: 2026-06-13
updated: 2026-06-14
---

# Waitable

Represents the waitable Haven component.

## Nested Types

### Waiter

- Role: Represents waiter within Waitable.
- Description: Describes the nested waiter type used by the enclosing class.

## Members

### Constants

### Fields

#### `public static Waiting dummy = new Waiting()`
- Role: Holds the dummy state.
- Description: Backs the cached state for this file.

#### `private Collection<Waiter> waiters = null`
- Role: Caches waiters entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `final Runnable callback`
- Role: Holds the callback state.
- Description: Backs the cached state for this file.

#### `private final Waiting[] ops`
- Role: Holds the ops state.
- Description: Backs the cached state for this file.

#### `private final Runnable callback`
- Role: Holds the callback state.
- Description: Backs the cached state for this file.

#### `private boolean done = false, ready = false`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `private boolean done = false, ready = false`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `public final Runnable callback`
- Role: Holds the callback state.
- Description: Backs the cached state for this file.

#### `private Waiting cw`
- Role: Holds the cw state.
- Description: Backs the cached state for this file.

### Methods

#### `public void waitfor(Runnable callback, Consumer<Waiting> reg)`
- Role: Performs waitfor.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public void cancel()`
- Role: Performs cancel.
- Description: Supports the cancel operation used by the surrounding class.

#### `Waiter(Runnable callback)`
- Role: Handles the waiter workflow.
- Description: Supports the waiter operation used by the surrounding class.

#### `public void cancel()`
- Role: Performs cancel.
- Description: Supports the cancel operation used by the surrounding class.

#### `public void wnotify()`
- Role: Performs wnotify.
- Description: Supports the wnotify operation used by the surrounding class.

#### `private Waiter add(Waiter w)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Waiter add(Runnable callback)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void waitfor(Runnable callback, Consumer<Waiting> reg)`
- Role: Performs waitfor.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public Disjunction(Runnable callback, Waitable... ops)`
- Role: Performs disjunction.
- Description: Supports the disjunction operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void cancel()`
- Role: Performs cancel.
- Description: Supports the cancel operation used by the surrounding class.

#### `public static void or(Runnable callback, Consumer<Waiting> reg, Waitable... ops)`
- Role: Performs or.
- Description: Supports the or operation used by the surrounding class.

#### `public Checker(Runnable callback)`
- Role: Performs checker.
- Description: Supports the checker operation used by the surrounding class.

#### `protected abstract Object monitor()`
- Role: Performs monitor.
- Description: Supports the monitor operation used by the surrounding class.

#### `protected abstract boolean check()`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `protected abstract Waiting add()`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Checker addi()`
- Role: Performs addi.
- Description: Supports the addi operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void cancel()`
- Role: Performs cancel.
- Description: Supports the cancel operation used by the surrounding class.
