# DeadlockWatchdog

This file documents the responsibilities and members of `DeadlockWatchdog`.

## Meta

- Source: [DeadlockWatchdog.java](../../../src/haven/DeadlockWatchdog.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Detects potential deadlocks.

## Nested Types

### DeadlockException

- Description: TODO

### ThreadState

- Description: TODO

## Members

### Constants

### Fields

#### `private boolean running = true`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final StackTraceElement[] trace`

- Description: TODO

#### `public final String[] locks`

- Description: TODO

#### `public final int[] lockdepth`

- Description: TODO

#### `public final ThreadState[] threads`

- Description: TODO

### Methods

#### `public DeadlockWatchdog(ThreadGroup tg)`

- Description: TODO

#### `public DeadlockWatchdog()`

- Description: TODO

#### `public ThreadState(ThreadInfo mi)`

- Description: TODO

#### `public DeadlockException(ThreadState[] threads)`

- Description: TODO

#### `protected void report(ThreadInfo[] threads)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public void quit()`

- Description: TODO
