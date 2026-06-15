# Loading

This file documents the responsibilities and members of `Loading`.

## Meta

- Source: [Loading.java](../../../src/haven/Loading.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents loading state or loading widget.

## Nested Types

### UnwaitableEvent

- Description: TODO

## Members

### Constants

### Fields

#### `public final Loading rec`

- Description: TODO

#### `public final Loading event`

- Description: TODO

### Methods

#### `public Loading()`

- Description: TODO

#### `public Loading(String msg)`

- Description: TODO

#### `public Loading(Throwable cause)`

- Description: TODO

#### `public Loading(String msg, Throwable cause)`

- Description: TODO

#### `public Loading(Loading rec)`

- Description: TODO

#### `public Loading(String msg, Loading rec)`

- Description: TODO

#### `public String getMessage()`

- Description: TODO

#### `public UnwaitableEvent(String message, Loading event)`

- Description: TODO

#### `public UnwaitableEvent(Loading event)`

- Description: TODO

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

#### `public boolean boostprio(int prio)`

- Description: TODO

#### `private void queuewait() throws InterruptedException`

- Description: TODO

#### `public void waitfor() throws InterruptedException`

- Description: TODO

#### `public static <T> T waitforint(Indir<T> x) throws InterruptedException`

- Description: TODO

#### `public static <T> T waitfor(Indir<T> x)`

- Description: TODO

#### `public static <T> T or(Supplier<T> x, T def)`

- Description: TODO

#### `public static <T> T or(Supplier<T> x, Supplier<T> def)`

- Description: TODO
