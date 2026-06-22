---
source: [Defer.java](../../../../src/haven/Defer.java)
created: 2026-06-13
updated: 2026-06-14
---

# Defer

Represents the defer Haven component.

## Nested Types

### Callable

- Role: Declares the deferred task body executed by `Defer.Future`.
- Description: Represents one interruptible computation that may block while it runs.

### CancelledException

- Role: Signals that a deferred task was cancelled before completion.
- Description: Wraps the cancellation path so callers can distinguish it from other failures.

### DeferredException

- Role: Wraps a failure that happened while resolving a deferred result.
- Description: Re-throws the stored cause when a caller reads the future result.

### Future

- Role: Manages one queued deferred task and its completion state.
- Description: Tracks the task, result, exception, priority, and waiting listeners.

### NotDoneException

- Role: Reports that a deferred value is still pending.
- Description: Lets callers wait for a deferred computation without treating it as an error.

### Worker

- Role: Executes queued deferred tasks on a background thread.
- Description: Pulls work from the defer queue and stops when the queue stays idle.

## Members

### Constants

#### `private static final Map<ThreadGroup, Defer> groups = new WeakHashMap<ThreadGroup, Defer>()`
- Role: Implements the groups operation.
- Description: Implements the private static final map<thread group, defer> groups = new weak hash map<thread group, defer>() operation.
- Value: `new WeakHashMap<ThreadGroup, Defer>()`

#### `private static final AtomicInteger threadno = new AtomicInteger(0)`
- Role: Implements the threadno operation.
- Description: Implements the atomic integer operation.
- Value: `new AtomicInteger(0)`

### Fields

#### `private final Queue<Future<?>> queue = new PrioQueue<Future<?>>()`
- Role: Implements the queue operation.
- Description: Implements the private final queue<future<?>> queue = new prio queue<future<?>>() operation.

#### `private final Collection<Thread> pool = new LinkedList<Thread>()`
- Role: Implements the pool operation.
- Description: Implements the private final collection<thread> pool = new linked list<thread>() operation.

#### `private final int maxthreads = Math.max(2, Runtime.getRuntime().availableProcessors() - 1)`
- Role: Implements the maxthreads operation.
- Description: Implements the available processors operation.

#### `private final AtomicInteger busy = new AtomicInteger(0)`
- Role: Implements the busy operation.
- Description: Implements the atomic integer operation.

#### `public final transient Future future`
- Role: Caches the future value.
- Description: Caches the `future` value for reuse.

#### `public final Callable<T> task`
- Role: Caches the task value.
- Description: Caches the `task` value for reuse.

#### `private final Waitable.Queue wq = new Waitable.Queue()`
- Role: Implements the wq operation.
- Description: Implements the queue operation.

#### `private int prio = -1`
- Role: Caches the prio value.
- Description: Caches the `prio` value for reuse.

#### `private T val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `private volatile String state = ""`
- Role: Caches the state value.
- Description: Caches the `state` value for reuse.

#### `private Throwable exc = null`
- Role: Caches the exc value.
- Description: Caches the `exc` value for reuse.

#### `private Loading lastload = null`
- Role: Caches the last load.
- Description: Caches the last load value.

#### `private volatile Thread running = null`
- Role: Caches the running value.
- Description: Caches the `running` value for reuse.

### Methods

#### `public T call() throws InterruptedException`
- Role: Handles the call workflow.
- Description: Implements the call operation.

#### `public CancelledException()`
- Role: Handles the cancelled exception path.
- Description: Implements the cancelled exception operation.

#### `public CancelledException(Throwable cause)`
- Role: Handles the cancelled exception path.
- Description: Implements the cancelled exception operation.

#### `public DeferredException(Throwable cause)`
- Role: Handles the deferred exception path.
- Description: Implements the deferred exception operation.

#### `public NotDoneException(Future future)`
- Role: Handles the not done exception path.
- Description: Implements the not done exception operation.

#### `public NotDoneException(Future future, Loading cause)`
- Role: Handles the not done exception path.
- Description: Implements the not done exception operation.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Returns the message.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Registers a callback to run when the waitable becomes ready.
- Description: Registers a callback to run when the waitable becomes ready.

#### `public boolean boostprio(int prio)`
- Role: Handles the boostprio path.
- Description: Requests a higher priority for the loading wait.

#### `private Future(Callable<T> task)`
- Role: Handles the future path.
- Description: Implements the future operation.

#### `public void cancel()`
- Role: Cancels the current waiting registration.
- Description: Cancels the current waiting registration.

#### `private void chstate(String nst)`
- Role: Handles the chstate path.
- Description: Implements the chstate operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public T get(int prio)`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public T get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public boolean done(int prio)`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public boolean done()`
- Role: Finalizes the current line of input.
- Description: Finalizes the current line of input.

#### `public int priority()`
- Role: Handles the priority path.
- Description: Implements the priority operation.

#### `public void boostprio(int prio)`
- Role: Handles the boostprio path.
- Description: Requests a higher priority for the loading wait.

#### `private Worker()`
- Role: Handles the worker path.
- Description: Implements the worker operation.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public Defer(ThreadGroup parent)`
- Role: Creates a new Defer instance.
- Description: Constructs the Defer instance from the supplied inputs.

#### `private void defer(final Future<?> f)`
- Role: Handles the defer path.
- Description: Implements the defer operation.

#### `public <T> Future<T> defer(Callable<T> task)`
- Role: Handles the defer path.
- Description: Implements the defer operation.

#### `private static Defer getgroup()`
- Role: Handles the getgroup path.
- Description: Returns the group.

#### `public static <T> Future<T> later(Callable<T> task)`
- Role: Handles the later path.
- Description: Implements the later operation.

#### `public static <T> Future<T> later(Runnable task, T result)`
- Role: Handles the later path.
- Description: Implements the later operation.

#### `public String stats()`
- Role: Handles the stats path.
- Description: Implements the stats operation.

#### `public static String gstats()`
- Role: Handles the gstats path.
- Description: Implements the gstats operation.