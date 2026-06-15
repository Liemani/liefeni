# Loader

This file documents the responsibilities and members of `Loader`.

## Meta

- Source: [Loader.java](../../../src/haven/Loader.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Loads resources or assets.

## Nested Types

### Future

- Description: TODO

## Members

### Constants

### Fields

#### `private final double timeout = 5.0`

- Description: TODO

#### `private final int maxthreads = 4`

- Description: TODO

#### `private final Queue<Future<?>> queue = new LinkedList<>()`

- Description: TODO

#### `private final Map<Future<?>, Waiting> loading = new IdentityHashMap<>()`

- Description: TODO

#### `private final Collection<Thread> pool = new ArrayList<>()`

- Description: TODO

#### `private final AtomicInteger busy = new AtomicInteger(0)`

- Description: TODO

#### `public final Supplier<T> task`

- Description: TODO

#### `private final boolean capex`

- Description: TODO

#### `private final Object runmon = new Object()`

- Description: TODO

#### `private T val`

- Description: TODO

#### `private Throwable exc`

- Description: TODO

#### `private Loading curload = null`

- Description: TODO

#### `private Thread running = null`

- Description: TODO

#### `private boolean done = false, cancelled = false, restarted = false`

- Description: TODO

#### `private boolean done = false, cancelled = false, restarted = false`

- Description: TODO

#### `private boolean done = false, cancelled = false, restarted = false`

- Description: TODO

### Methods

#### `private Future(Supplier<T> task, boolean capex)`

- Description: TODO

#### `private void run()`

- Description: TODO

#### `public boolean cancel()`

- Description: TODO

#### `public void restart()`

- Description: TODO

#### `public T get()`

- Description: TODO

#### `public boolean done()`

- Description: TODO

#### `public Loading lastload()`

- Description: TODO

#### `private void loop()`

- Description: TODO

#### `private void check()`

- Description: TODO

#### `public <T> Future<T> defer(Supplier<T> task, boolean capex)`

- Description: TODO

#### `public <T> Future<T> defer(Supplier<T> task)`

- Description: TODO

#### `public <T> Future<T> defer(Runnable task, T result)`

- Description: TODO

#### `public String stats()`

- Description: TODO
