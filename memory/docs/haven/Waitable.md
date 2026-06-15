# Waitable

This file documents the responsibilities and members of `Waitable`.

## Meta

- Source: [Waitable.java](../../../src/haven/Waitable.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines a waitable contract.

## Nested Types

### Waiter

- Description: TODO

## Members

### Constants

### Fields

#### `public static Waiting dummy = new Waiting()`

- Description: TODO

#### `private Collection<Waiter> waiters = null`

- Description: TODO

#### `final Runnable callback`

- Description: TODO

#### `private final Waiting[] ops`

- Description: TODO

#### `private final Runnable callback`

- Description: TODO

#### `private boolean done = false, ready = false`

- Description: TODO

#### `private boolean done = false, ready = false`

- Description: TODO

#### `public final Runnable callback`

- Description: TODO

#### `private Waiting cw`

- Description: TODO

### Methods

#### `public void waitfor(Runnable callback, Consumer<Waiting> reg)`

- Description: TODO

#### `public void cancel()`

- Description: TODO

#### `Waiter(Runnable callback)`

- Description: TODO

#### `public void cancel()`

- Description: TODO

#### `public void wnotify()`

- Description: TODO

#### `private Waiter add(Waiter w)`

- Description: TODO

#### `public Waiter add(Runnable callback)`

- Description: TODO

#### `public void waitfor(Runnable callback, Consumer<Waiting> reg)`

- Description: TODO

#### `public Disjunction(Runnable callback, Waitable... ops)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public void cancel()`

- Description: TODO

#### `public static void or(Runnable callback, Consumer<Waiting> reg, Waitable... ops)`

- Description: TODO

#### `public Checker(Runnable callback)`

- Description: TODO

#### `protected abstract Object monitor()`

- Description: TODO

#### `protected abstract boolean check()`

- Description: TODO

#### `protected abstract Waiting add()`

- Description: TODO

#### `public Checker addi()`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public void cancel()`

- Description: TODO
