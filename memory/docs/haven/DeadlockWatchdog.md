# DeadlockWatchdog

This file documents the responsibilities and members of `DeadlockWatchdog`.

## Meta

- Source: [DeadlockWatchdog.java](../../../src/haven/DeadlockWatchdog.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the deadlock watchdog Haven component.

## Nested Types

### DeadlockException

- Role: Represents deadlock exception within DeadlockWatchdog.
- Description: Describes the nested deadlock exception type used by the enclosing class.

### ThreadState

- Role: Represents thread state within DeadlockWatchdog.
- Description: Describes the nested thread state type used by the enclosing class.

## Members

### Constants

### Fields

#### `private boolean running = true`
- Role: Tracks the running flag.
- Description: Supports the running operation used by the surrounding class.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final StackTraceElement[] trace`
- Role: Holds the trace state.
- Description: Backs the cached state for this file.

#### `public final String[] locks`
- Role: Stores the locks value.
- Description: Backs the cached state for this file.

#### `public final int[] lockdepth`
- Role: Stores the lockdepth value.
- Description: Backs the cached state for this file.

#### `public final ThreadState[] threads`
- Role: Holds the threads state.
- Description: Backs the cached state for this file.

### Methods

#### `public DeadlockWatchdog(ThreadGroup tg)`
- Role: Creates a new DeadlockWatchdog instance.
- Description: Constructs the instance and initializes its default state.

#### `public DeadlockWatchdog()`
- Role: Creates a new DeadlockWatchdog instance.
- Description: Constructs the instance and initializes its default state.

#### `public ThreadState(ThreadInfo mi)`
- Role: Performs thread state.
- Description: Supports the thread state operation used by the surrounding class.

#### `public DeadlockException(ThreadState[] threads)`
- Role: Performs deadlock exception.
- Description: Supports the deadlock exception operation used by the surrounding class.

#### `protected void report(ThreadInfo[] threads)`
- Role: Performs report.
- Description: Supports the report operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void quit()`
- Role: Performs quit.
- Description: Supports the quit operation used by the surrounding class.
