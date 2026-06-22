---
source: [Finalizer.java](../../../../src/haven/Finalizer.java)
created: 2026-06-13
updated: 2026-06-14
---

# Finalizer

Represents the finalizer Haven component.

## Nested Types

### Cleaner

- Role: Handles the cleanup actions for a finalized object path.
- Description: Callback contract invoked when a tracked object is collected.

### Disposer

- Role: Disposes tracked objects.
- Description: Cleanup callback used to release resources during finalization.

### Entry

- Role: Tracks one registered finalizer entry.
- Description: Doubly linked bookkeeping node used by the finalizer registry.

### Formattable

- Role: Marks a finalizer entry that can format diagnostics.
- Description: Interface for entries that provide a formatted description.

### LeakCheck

- Role: Scans for leaked finalizer entries.
- Description: Diagnostic helper used to report tracked resource leaks.

### Ref

- Role: Represents one tracked reference.
- Description: Weak reference node that links an object into the finalizer list.

### Reference

- Role: Wraps the referent and cleanup action.
- Description: Abstract reference wrapper used by finalizer bookkeeping.

### Snapshot

- Role: Captures a finalizer state snapshot.
- Description: Immutable diagnostic snapshot of the tracked finalizer graph.

## Members

### Constants

#### `private static final Map<ThreadGroup, Finalizer> groups = new WeakHashMap<>()`
- Role: Implements the groups operation.
- Description: Implements the private static final map<thread group, finalizer> groups = new weak hash map<>() operation.
- Value: `new WeakHashMap<>()`

### Fields

#### `private static boolean CHECK_CYCLES = false`
- Role: Tracks the check cycles flag.
- Description: Caches the `CHECK_CYCLES` value for reuse.

#### `private final ReferenceQueue<Object> queue = new ReferenceQueue<>()`
- Role: Implements the queue operation.
- Description: Implements the private final reference queue<object> queue = new reference queue<>() operation.

#### `private Function<Runnable, Thread> ctx`
- Role: Caches the ctx value.
- Description: Caches the `ctx` value for reuse.

#### `private Thread th`
- Role: Caches the th value.
- Description: Caches the `th` value for reuse.

#### `private Ref list`
- Role: Caches the list value.
- Description: Caches the `list` value for reuse.

#### `private int n`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `final Cleaner action`
- Role: Caches the action value.
- Description: Caches the `action` value for reuse.

#### `boolean linked`
- Role: Tracks the linked flag.
- Description: Caches the `linked` value for reuse.

#### `Ref next, prev`
- Role: Caches the prev value.
- Description: Caches the `prev` value for reuse.

#### `Ref next, prev`
- Role: Caches the prev value.
- Description: Caches the `prev` value for reuse.

#### `private final Collection<Entry> refs`
- Role: Caches the refs value.
- Description: Caches the `refs` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final String desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `private Ref ref`
- Role: Caches the ref value.
- Description: Caches the `ref` value for reuse.

#### `private static boolean leaking = false`
- Role: Tracks the leaking flag.
- Description: Caches the `leaking` value for reuse.

#### `public final String desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `private final Runnable fin`
- Role: Caches the fin value.
- Description: Caches the `fin` value for reuse.

#### `private final Class<?> cls`
- Role: Caches the cls value.
- Description: Caches the `cls` value for reuse.

#### `private final Throwable create`
- Role: Caches the create value.
- Description: Caches the `create` value for reuse.

#### `private boolean clean = false`
- Role: Tracks the clean flag.
- Description: Caches the `clean` value for reuse.

#### `public final Disposable tgt`
- Role: Caches the tgt value.
- Description: Stores the widget that accepted the hover event.

#### `public final T ob`
- Role: Caches the ob value.
- Description: Caches the `ob` value for reuse.

#### `private final Runnable clean`
- Role: Caches the clean value.
- Description: Caches the `clean` value for reuse.

### Methods

#### `public Finalizer(Function<Runnable, Thread> ctx)`
- Role: Creates a new Finalizer instance.
- Description: Constructs the Finalizer instance from the supplied inputs.

#### `public Finalizer()`
- Role: Creates a new Finalizer instance.
- Description: Constructs the Finalizer instance from the supplied inputs.

#### `public void clean()`
- Role: Handles the clean path.
- Description: Implements the clean operation.

#### `public String format()`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `Ref(Object x, Cleaner action)`
- Role: Handles the ref workflow.
- Description: Implements the ref operation.

#### `private void add()`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `private void remove()`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `private void run()`
- Role: Runs the job.
- Description: Runs the processing step for the supplied render input.

#### `private void ckrun()`
- Role: Handles the ckrun path.
- Description: Implements the ckrun operation.

#### `public Runnable add(Object x, Cleaner action)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public static Finalizer get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public static Runnable finalize(Object x, Cleaner action)`
- Role: Handles the finalize path.
- Description: Implements the finalize operation.

#### `private Entry(Ref ref)`
- Role: Handles the entry path.
- Description: Implements the entry operation.

#### `public boolean equals(Entry that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `private Snapshot(Finalizer from)`
- Role: Handles the snapshot path.
- Description: Implements the snapshot operation.

#### `public Snapshot weaken()`
- Role: Handles the weaken path.
- Description: Implements the weaken operation.

#### `public String summary()`
- Role: Handles the summary path.
- Description: Implements the summary operation.

#### `public String delta(Snapshot prev)`
- Role: Handles the delta path.
- Description: Implements the delta operation.

#### `public Snapshot snapshot()`
- Role: Handles the snapshot path.
- Description: Implements the snapshot operation.

#### `private static void checkcycle(Object ref, Object root)`
- Role: Handles the checkcycle path.
- Description: Implements the checkcycle operation.

#### `public LeakCheck(Object guarded, String desc)`
- Role: Handles the leak check path.
- Description: Implements the leak check operation.

#### `public LeakCheck(Object guarded)`
- Role: Handles the leak check path.
- Description: Implements the leak check operation.

#### `public void clean()`
- Role: Handles the clean path.
- Description: Implements the clean operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public String format()`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `public static Disposable leakcheck(Object guarded, String desc)`
- Role: Handles the leakcheck path.
- Description: Implements the leakcheck operation.

#### `public static Disposable leakcheck(Object guarded)`
- Role: Handles the leakcheck path.
- Description: Implements the leakcheck operation.

#### `public Disposer(Disposable tgt)`
- Role: Handles the disposer path.
- Description: Implements the disposer operation.

#### `public void clean()`
- Role: Handles the clean path.
- Description: Implements the clean operation.

#### `public String format()`
- Role: Handles the format path.
- Description: Implements the format operation.

#### `public Reference(T ob)`
- Role: Handles the reference path.
- Description: Implements the reference operation.

#### `public T get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.