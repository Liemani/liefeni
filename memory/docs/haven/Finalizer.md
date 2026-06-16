# Finalizer

This file documents the responsibilities and members of `Finalizer`.

## Meta

- Source: [Finalizer.java](../../../src/haven/Finalizer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the finalizer Haven component.

## Nested Types

### Cleaner

- Role: Represents cleaner within Finalizer.
- Description: Describes the nested cleaner type used by the enclosing class.

### Disposer

- Role: Represents disposer within Finalizer.
- Description: Describes the nested disposer type used by the enclosing class.

### Entry

- Role: Represents entry within Finalizer.
- Description: Describes the nested entry type used by the enclosing class.

### Formattable

- Role: Represents formattable within Finalizer.
- Description: Describes the nested formattable type used by the enclosing class.

### LeakCheck

- Role: Represents leak check within Finalizer.
- Description: Describes the nested leak check type used by the enclosing class.

### Ref

- Role: Represents ref within Finalizer.
- Description: Describes the nested ref type used by the enclosing class.

### Reference

- Role: Represents reference within Finalizer.
- Description: Describes the nested reference type used by the enclosing class.

### Snapshot

- Role: Represents snapshot within Finalizer.
- Description: Describes the nested snapshot type used by the enclosing class.

## Members

### Constants

#### `private static final Map<ThreadGroup, Finalizer> groups = new WeakHashMap<>()`
- Role: Defines the shared groups constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private static boolean CHECK_CYCLES = false`
- Role: Tracks the check cycles flag.
- Description: Supports the check cycles operation used by the surrounding class.

#### `private final ReferenceQueue<Object> queue = new ReferenceQueue<>()`
- Role: Caches queue entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Function<Runnable, Thread> ctx`
- Role: Holds the ctx state.
- Description: Backs the cached state for this file.

#### `private Thread th`
- Role: Holds the th state.
- Description: Backs the cached state for this file.

#### `private Ref list`
- Role: Holds the list state.
- Description: Backs the cached state for this file.

#### `private int n`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `final Cleaner action`
- Role: Holds the action state.
- Description: Backs the cached state for this file.

#### `boolean linked`
- Role: Tracks the linked flag.
- Description: Supports the linked operation used by the surrounding class.

#### `Ref next, prev`
- Role: Holds the prev state.
- Description: Backs the cached state for this file.

#### `Ref next, prev`
- Role: Holds the prev state.
- Description: Backs the cached state for this file.

#### `private final Collection<Entry> refs`
- Role: Caches refs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final String desc`
- Role: Stores the desc value.
- Description: Backs the cached state for this file.

#### `private Ref ref`
- Role: Holds the ref state.
- Description: Backs the cached state for this file.

#### `private static boolean leaking = false`
- Role: Tracks the leaking flag.
- Description: Supports the leaking operation used by the surrounding class.

#### `public final String desc`
- Role: Stores the desc value.
- Description: Backs the cached state for this file.

#### `private final Runnable fin`
- Role: Holds the fin state.
- Description: Backs the cached state for this file.

#### `private final Class<?> cls`
- Role: Holds the cls state.
- Description: Backs the cached state for this file.

#### `private final Throwable create`
- Role: Holds the create state.
- Description: Backs the cached state for this file.

#### `private boolean clean = false`
- Role: Tracks the clean flag.
- Description: Supports the clean operation used by the surrounding class.

#### `public final Disposable tgt`
- Role: Holds the tgt state.
- Description: Backs the cached state for this file.

#### `public final T ob`
- Role: Holds the ob state.
- Description: Backs the cached state for this file.

#### `private final Runnable clean`
- Role: Holds the clean state.
- Description: Backs the cached state for this file.

### Methods

#### `public Finalizer(Function<Runnable, Thread> ctx)`
- Role: Creates a new Finalizer instance.
- Description: Constructs the instance and initializes its default state.

#### `public Finalizer()`
- Role: Creates a new Finalizer instance.
- Description: Constructs the instance and initializes its default state.

#### `public void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public String format()`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `Ref(Object x, Cleaner action)`
- Role: Handles the ref workflow.
- Description: Supports the ref operation used by the surrounding class.

#### `private void add()`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `private void remove()`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `private void run()`
- Role: Runs the job.
- Description: Supports the run operation used by the surrounding class.

#### `private void ckrun()`
- Role: Performs ckrun.
- Description: Supports the ckrun operation used by the surrounding class.

#### `public Runnable add(Object x, Cleaner action)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public static Finalizer get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static Runnable finalize(Object x, Cleaner action)`
- Role: Performs finalize.
- Description: Supports the finalize operation used by the surrounding class.

#### `private Entry(Ref ref)`
- Role: Performs entry.
- Description: Supports the entry operation used by the surrounding class.

#### `public boolean equals(Entry that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `private Snapshot(Finalizer from)`
- Role: Performs snapshot.
- Description: Supports the snapshot operation used by the surrounding class.

#### `public Snapshot weaken()`
- Role: Performs weaken.
- Description: Supports the weaken operation used by the surrounding class.

#### `public String summary()`
- Role: Performs summary.
- Description: Supports the summary operation used by the surrounding class.

#### `public String delta(Snapshot prev)`
- Role: Performs delta.
- Description: Supports the delta operation used by the surrounding class.

#### `public Snapshot snapshot()`
- Role: Performs snapshot.
- Description: Supports the snapshot operation used by the surrounding class.

#### `private static void checkcycle(Object ref, Object root)`
- Role: Performs checkcycle.
- Description: Supports the checkcycle operation used by the surrounding class.

#### `public LeakCheck(Object guarded, String desc)`
- Role: Performs leak check.
- Description: Supports the leak check operation used by the surrounding class.

#### `public LeakCheck(Object guarded)`
- Role: Performs leak check.
- Description: Supports the leak check operation used by the surrounding class.

#### `public void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public String format()`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `public static Disposable leakcheck(Object guarded, String desc)`
- Role: Performs leakcheck.
- Description: Supports the leakcheck operation used by the surrounding class.

#### `public static Disposable leakcheck(Object guarded)`
- Role: Performs leakcheck.
- Description: Supports the leakcheck operation used by the surrounding class.

#### `public Disposer(Disposable tgt)`
- Role: Performs disposer.
- Description: Supports the disposer operation used by the surrounding class.

#### `public void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public String format()`
- Role: Performs format.
- Description: Supports the format operation used by the surrounding class.

#### `public Reference(T ob)`
- Role: Performs reference.
- Description: Supports the reference operation used by the surrounding class.

#### `public T get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.
