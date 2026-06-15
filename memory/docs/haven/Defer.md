# Defer

This file documents the responsibilities and members of `Defer`.

## Meta

- Source: [Defer.java](../../../src/haven/Defer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Schedules deferred work.

## Nested Types

### Callable

- Description: TODO

### CancelledException

- Description: TODO

### DeferredException

- Description: TODO

### Future

- Description: TODO

### NotDoneException

- Description: TODO

### Worker

- Description: TODO

## Members

### Constants

#### `private static final Map<ThreadGroup, Defer> groups = new WeakHashMap<ThreadGroup, Defer>()`

- Description: TODO

#### `private static final AtomicInteger threadno = new AtomicInteger(0)`

- Description: TODO

### Fields

#### `private final Queue<Future<?>> queue = new PrioQueue<Future<?>>()`

- Description: TODO

#### `private final Collection<Thread> pool = new LinkedList<Thread>()`

- Description: TODO

#### `private final int maxthreads = Math.max(2, Runtime.getRuntime().availableProcessors() - 1)`

- Description: TODO

#### `private final AtomicInteger busy = new AtomicInteger(0)`

- Description: TODO

#### `public final transient Future future`

- Description: TODO

#### `public final Callable<T> task`

- Description: TODO

#### `private final Waitable.Queue wq = new Waitable.Queue()`

- Description: TODO

#### `private int prio = -1`

- Description: TODO

#### `private T val`

- Description: TODO

#### `private volatile String state = ""`

- Description: TODO

#### `private Throwable exc = null`

- Description: TODO

#### `private Loading lastload = null`

- Description: TODO

#### `private volatile Thread running = null`

- Description: TODO

### Methods

#### `public T call() throws InterruptedException`

- Description: TODO

#### `public CancelledException()`

- Description: TODO

#### `public CancelledException(Throwable cause)`

- Description: TODO

#### `public DeferredException(Throwable cause)`

- Description: TODO

#### `public NotDoneException(Future future)`

- Description: TODO

#### `public NotDoneException(Future future, Loading cause)`

- Description: TODO

#### `public String getMessage()`

- Description: TODO

#### `public void waitfor(Runnable callback, Consumer<Waitable.Waiting> reg)`

- Description: TODO

#### `public boolean boostprio(int prio)`

- Description: TODO

#### `private Future(Callable<T> task)`

- Description: TODO

#### `public void cancel()`

- Description: TODO

#### `private void chstate(String nst)`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public T get(int prio)`

- Description: TODO

#### `public T get()`

- Description: TODO

#### `public boolean done(int prio)`

- Description: TODO

#### `public boolean done()`

- Description: TODO

#### `public int priority()`

- Description: TODO

#### `public void boostprio(int prio)`

- Description: TODO

#### `private Worker()`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public Defer(ThreadGroup parent)`

- Description: TODO

#### `private void defer(final Future<?> f)`

- Description: TODO

#### `public <T> Future<T> defer(Callable<T> task)`

- Description: TODO

#### `private static Defer getgroup()`

- Description: TODO

#### `public static <T> Future<T> later(Callable<T> task)`

- Description: TODO

#### `public static <T> Future<T> later(Runnable task, T result)`

- Description: TODO

#### `public String stats()`

- Description: TODO

#### `public static String gstats()`

- Description: TODO
