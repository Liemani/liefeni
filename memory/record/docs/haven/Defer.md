---
source: [Defer.java](../../../src/haven/Defer.java)
created: 2026-06-13
updated: 2026-06-14
---

# Defer

Represents the defer Haven component.

## Nested Types

### Callable

- Role: Represents callable within Defer.
- Description: Describes the nested callable type used by the enclosing class.

### CancelledException

- Role: Represents cancelled exception within Defer.
- Description: Describes the nested cancelled exception type used by the enclosing class.

### DeferredException

- Role: Represents deferred exception within Defer.
- Description: Describes the nested deferred exception type used by the enclosing class.

### Future

- Role: Represents future within Defer.
- Description: Describes the nested future type used by the enclosing class.

### NotDoneException

- Role: Represents not done exception within Defer.
- Description: Describes the nested not done exception type used by the enclosing class.

### Worker

- Role: Represents worker within Defer.
- Description: Describes the nested worker type used by the enclosing class.

## Members

### Constants

#### `private static final Map<ThreadGroup, Defer> groups = new WeakHashMap<ThreadGroup, Defer>()`
- Role: Defines the shared groups constant.
- Description: Shared constant used by the rest of the class.

#### `private static final AtomicInteger threadno = new AtomicInteger(0)`
- Role: Defines the shared threadno constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final Queue<Future<?>> queue = new PrioQueue<Future<?>>()`
- Role: Caches queue entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Collection<Thread> pool = new LinkedList<Thread>()`
- Role: Caches pool entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final int maxthreads = Math.max(2, Runtime.getRuntime().availableProcessors() - 1)`
- Role: Stores the maxthreads value.
- Description: Backs the cached state for this file.

#### `private final AtomicInteger busy = new AtomicInteger(0)`
- Role: Stores the busy value.
- Description: Backs the cached state for this file.

#### `public final transient Future future`
- Role: Holds the future state.
- Description: Backs the cached state for this file.

#### `public final Callable<T> task`
- Role: Holds the task state.
- Description: Backs the cached state for this file.

#### `private final Waitable.Queue wq = new Waitable.Queue()`
- Role: Caches wq entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private int prio = -1`
- Role: Stores the prio value.
- Description: Backs the cached state for this file.

#### `private T val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

#### `private volatile String state = ""`
- Role: Stores the state value.
- Description: Backs the cached state for this file.

#### `private Throwable exc = null`
- Role: Holds the exc state.
- Description: Backs the cached state for this file.

#### `private Loading lastload = null`
- Role: Holds the lastload state.
- Description: Backs the cached state for this file.

#### `private volatile Thread running = null`
- Role: Holds the running state.
- Description: Backs the cached state for this file.

### Methods

#### `public T call() throws InterruptedException`
- Role: Handles the call workflow.
- Description: Supports the call operation used by the surrounding class.

#### `public CancelledException()`
- Role: Performs cancelled exception.
- Description: Supports the cancelled exception operation used by the surrounding class.

#### `public CancelledException(Throwable cause)`
- Role: Performs cancelled exception.
- Description: Supports the cancelled exception operation used by the surrounding class.

#### `public DeferredException(Throwable cause)`
- Role: Performs deferred exception.
- Description: Supports the deferred exception operation used by the surrounding class.

#### `public NotDoneException(Future future)`
- Role: Performs not done exception.
- Description: Supports the not done exception operation used by the surrounding class.

#### `public NotDoneException(Future future, Loading cause)`
- Role: Performs not done exception.
- Description: Supports the not done exception operation used by the surrounding class.

#### `public String getMessage()`
- Role: Returns the message.
- Description: Exposes the requested value without mutating state.

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`
- Role: Performs waitfor.
- Description: Supports the waitfor operation used by the surrounding class.

#### `public boolean boostprio(int prio)`
- Role: Performs boostprio.
- Description: Supports the boostprio operation used by the surrounding class.

#### `private Future(Callable<T> task)`
- Role: Performs future.
- Description: Supports the future operation used by the surrounding class.

#### `public void cancel()`
- Role: Performs cancel.
- Description: Supports the cancel operation used by the surrounding class.

#### `private void chstate(String nst)`
- Role: Performs chstate.
- Description: Supports the chstate operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public T get(int prio)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public T get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public boolean done(int prio)`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public boolean done()`
- Role: Performs done.
- Description: Supports the done operation used by the surrounding class.

#### `public int priority()`
- Role: Performs priority.
- Description: Supports the priority operation used by the surrounding class.

#### `public void boostprio(int prio)`
- Role: Performs boostprio.
- Description: Supports the boostprio operation used by the surrounding class.

#### `private Worker()`
- Role: Performs worker.
- Description: Supports the worker operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public Defer(ThreadGroup parent)`
- Role: Creates a new Defer instance.
- Description: Constructs the instance and initializes its default state.

#### `private void defer(final Future<?> f)`
- Role: Performs defer.
- Description: Supports the defer operation used by the surrounding class.

#### `public <T> Future<T> defer(Callable<T> task)`
- Role: Performs defer.
- Description: Supports the defer operation used by the surrounding class.

#### `private static Defer getgroup()`
- Role: Performs getgroup.
- Description: Supports the getgroup operation used by the surrounding class.

#### `public static <T> Future<T> later(Callable<T> task)`
- Role: Performs later.
- Description: Supports the later operation used by the surrounding class.

#### `public static <T> Future<T> later(Runnable task, T result)`
- Role: Performs later.
- Description: Supports the later operation used by the surrounding class.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.

#### `public static String gstats()`
- Role: Performs gstats.
- Description: Supports the gstats operation used by the surrounding class.
