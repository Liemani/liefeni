---
source: [Loader.java](../../../../src/haven/Loader.java)
created: 2026-06-13
updated: 2026-06-14
---

# Loader

Represents the loader Haven component.

## Nested Types

### Future

- Role: Represents one deferred task managed by `Loader`.
- Description: Stores the supplier, completion state, cancellation state, and last loading exception.

## Members

### Constants

### Fields

#### `private final double timeout = 5.0`
- Role: Caches the timeout value.
- Description: Caches the `timeout` value for reuse.

#### `private final int maxthreads = 4`
- Role: Caches the maxthreads value.
- Description: Caches the `maxthreads` value for reuse.

#### `private final Queue<Future<?>> queue = new LinkedList<>()`
- Role: Implements the queue operation.
- Description: Implements the private final queue<future<?>> queue = new linked list<>() operation.

#### `private final Map<Future<?>, Waiting> loading = new IdentityHashMap<>()`
- Role: Loads the ing.
- Description: Loads the ing.

#### `private final Collection<Thread> pool = new ArrayList<>()`
- Role: Implements the pool operation.
- Description: Implements the private final collection<thread> pool = new array list<>() operation.

#### `private final AtomicInteger busy = new AtomicInteger(0)`
- Role: Implements the busy operation.
- Description: Implements the atomic integer operation.

#### `public final Supplier<T> task`
- Role: Caches the task value.
- Description: Caches the `task` value for reuse.

#### `private final boolean capex`
- Role: Tracks the capex flag.
- Description: Caches the `capex` value for reuse.

#### `private final Object runmon = new Object()`
- Role: Implements the runmon operation.
- Description: Implements the object operation.

#### `private T val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `private Throwable exc`
- Role: Caches the exc value.
- Description: Caches the `exc` value for reuse.

#### `private Loading curload = null`
- Role: Caches the curload value.
- Description: Caches the `curload` value for reuse.

#### `private Thread running = null`
- Role: Caches the running value.
- Description: Caches the `running` value for reuse.

#### `private boolean done = false, cancelled = false, restarted = false`
- Role: Tracks the done flag.
- Description: Finalizes the current line of input.

#### `private boolean done = false, cancelled = false, restarted = false`
- Role: Tracks the done flag.
- Description: Finalizes the current line of input.

#### `private boolean done = false, cancelled = false, restarted = false`
- Role: Tracks the done flag.
- Description: Finalizes the current line of input.

### Methods

#### `private Future(Supplier<T> task, boolean capex)`
- Role: Handles the future path.
- Description: Implements the future operation.

#### `private void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public boolean cancel()`
- Role: Cancels the current waiting registration.
- Description: Cancels the current waiting registration.

#### `public void restart()`
- Role: Handles the restart path.
- Description: Implements the restart operation.

#### `public T get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public boolean done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public Loading lastload()`
- Role: Handles the lastload path.
- Description: Implements the lastload operation.

#### `private void loop()`
- Role: Handles the loop path.
- Description: Implements the loop operation.

#### `private void check()`
- Role: Handles the check path.
- Description: Implements the check operation.

#### `public <T> Future<T> defer(Supplier<T> task, boolean capex)`
- Role: Handles the defer path.
- Description: Implements the defer operation.

#### `public <T> Future<T> defer(Supplier<T> task)`
- Role: Handles the defer path.
- Description: Implements the defer operation.

#### `public <T> Future<T> defer(Runnable task, T result)`
- Role: Handles the defer path.
- Description: Implements the defer operation.

#### `public String stats()`
- Role: Handles the stats path.
- Description: Implements the stats operation.