---
source: [DeadlockWatchdog.java](../../../../src/haven/DeadlockWatchdog.java)
created: 2026-06-13
updated: 2026-06-14
---

# DeadlockWatchdog

Represents the deadlock watchdog Haven component.

## Nested Types

### DeadlockException

- Role: Reports a detected deadlock.
- Description: Wraps the captured thread-state snapshot for later logging or inspection.

### ThreadState

- Role: Captures one thread's lock and stack state.
- Description: Stores the thread name, stack trace, locks, and lock depth information.

## Members

### Constants

### Fields

#### `private boolean running = true`
- Role: Tracks the running flag.
- Description: Caches the `running` value for reuse.

#### `public final String name`
- Role: Caches the name value.
- Description: Caches the `name` value for reuse.

#### `public final StackTraceElement[] trace`
- Role: Caches the trace value.
- Description: Caches the `trace` value for reuse.

#### `public final String[] locks`
- Role: Caches the locks value.
- Description: Caches the `locks` value for reuse.

#### `public final int[] lockdepth`
- Role: Caches the lockdepth value.
- Description: Caches the `lockdepth` value for reuse.

#### `public final ThreadState[] threads`
- Role: Caches the threads value.
- Description: Caches the `threads` value for reuse.

### Methods

#### `public DeadlockWatchdog(ThreadGroup tg)`
- Role: Creates a new DeadlockWatchdog instance.
- Description: Constructs the DeadlockWatchdog instance from the supplied inputs.

#### `public DeadlockWatchdog()`
- Role: Creates a new DeadlockWatchdog instance.
- Description: Constructs the DeadlockWatchdog instance from the supplied inputs.

#### `public ThreadState(ThreadInfo mi)`
- Role: Handles the thread state path.
- Description: Implements the thread state operation.

#### `public DeadlockException(ThreadState[] threads)`
- Role: Handles the deadlock exception path.
- Description: Implements the deadlock exception operation.

#### `protected void report(ThreadInfo[] threads)`
- Role: Handles the report path.
- Description: Implements the report operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void quit()`
- Role: Handles the quit path.
- Description: Implements the quit operation.