---
source: [Loader.java](../../../src/haven/Loader.java)
created: 2026-06-13
updated: 2026-06-14
---

# Loader

Represents the loader Haven component.

## Nested Types

### Future

- Role: Represents future within Loader.
- Description: Describes the nested future type used by the enclosing class.

## Members

### Constants

### Fields

#### `private final double timeout = 5.0`
- Role: Stores the timeout value.
- Description: Backs the cached state for this file.

#### `private final int maxthreads = 4`
- Role: Stores the maxthreads value.
- Description: Backs the cached state for this file.

#### `private final Queue<Future<?>> queue = new LinkedList<>()`
- Role: Caches queue entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Map<Future<?>, Waiting> loading = new IdentityHashMap<>()`
- Role: Caches loading entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Collection<Thread> pool = new ArrayList<>()`
- Role: Caches pool entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final AtomicInteger busy = new AtomicInteger(0)`
- Role: Stores the busy value.
- Description: Backs the cached state for this file.

#### `public final Supplier<T> task`
- Role: Holds the task state.
- Description: Backs the cached state for this file.

#### `private final boolean capex`
- Role: Tracks the capex flag.
- Description: Supports the capex operation used by the surrounding class.

#### `private final Object runmon = new Object()`
- Role: Holds the runmon state.
- Description: Backs the cached state for this file.

#### `private T val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

#### `private Throwable exc`
- Role: Holds the exc state.
- Description: Backs the cached state for this file.

#### `private Loading curload = null`
- Role: Holds the curload state.
- Description: Backs the cached state for this file.

#### `private Thread running = null`
- Role: Holds the running state.
- Description: Backs the cached state for this file.

#### `private boolean done = false, cancelled = false, restarted = false`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `private boolean done = false, cancelled = false, restarted = false`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

#### `private boolean done = false, cancelled = false, restarted = false`
- Role: Tracks the done flag.
- Description: Supports the done operation used by the surrounding class.

### Methods

#### `private Future(Supplier<T> task, boolean capex)`
- Role: Performs future.
- Description: Supports the future operation used by the surrounding class.

#### `private void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public boolean cancel()`
- Role: Performs cancel.
- Description: Supports the cancel operation used by the surrounding class.

#### `public void restart()`
- Role: Performs restart.
- Description: Supports the restart operation used by the surrounding class.

#### `public T get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public boolean done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public Loading lastload()`
- Role: Performs lastload.
- Description: Supports the lastload operation used by the surrounding class.

#### `private void loop()`
- Role: Performs loop.
- Description: Supports the loop operation used by the surrounding class.

#### `private void check()`
- Role: Performs check.
- Description: Supports the check operation used by the surrounding class.

#### `public <T> Future<T> defer(Supplier<T> task, boolean capex)`
- Role: Performs defer.
- Description: Supports the defer operation used by the surrounding class.

#### `public <T> Future<T> defer(Supplier<T> task)`
- Role: Performs defer.
- Description: Supports the defer operation used by the surrounding class.

#### `public <T> Future<T> defer(Runnable task, T result)`
- Role: Performs defer.
- Description: Supports the defer operation used by the surrounding class.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.
