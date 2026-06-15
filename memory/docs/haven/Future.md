# Future

This file documents the responsibilities and members of `Future`.

## Meta

- Source: [Future.java](../../../src/haven/Future.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents deferred computation state.

## Nested Types

### NotDone

- Description: TODO

## Members

### Constants

### Fields

#### `private final Waitable.Queue wq = new Waitable.Queue()`

- Description: TODO

#### `private T val`

- Description: TODO

#### `private Throwable exc`

- Description: TODO

#### `private boolean set = false`

- Description: TODO

#### `public final transient Simple future`

- Description: TODO

### Methods

#### `public T get()`

- Description: TODO

#### `public boolean done()`

- Description: TODO

#### `public PastException(Throwable cause)`

- Description: TODO

#### `public boolean done()`

- Description: TODO

#### `private NotDone(Simple future)`

- Description: TODO

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

#### `public T get()`

- Description: TODO

#### `public void set(T val)`

- Description: TODO

#### `public void error(Throwable cause)`

- Description: TODO
