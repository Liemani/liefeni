# Finalizer

This file documents the responsibilities and members of `Finalizer`.

## Meta

- Source: [Finalizer.java](../../../src/haven/Finalizer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Handles finalization helpers.

## Nested Types

### Cleaner

- Description: TODO

### Disposer

- Description: TODO

### Entry

- Description: TODO

### Formattable

- Description: TODO

### LeakCheck

- Description: TODO

### Ref

- Description: TODO

### Reference

- Description: TODO

### Snapshot

- Description: TODO

## Members

### Constants

#### `private static final Map<ThreadGroup, Finalizer> groups = new WeakHashMap<>()`

- Description: TODO

### Fields

#### `private static boolean CHECK_CYCLES = false`

- Description: TODO

#### `private final ReferenceQueue<Object> queue = new ReferenceQueue<>()`

- Description: TODO

#### `private Function<Runnable, Thread> ctx`

- Description: TODO

#### `private Thread th`

- Description: TODO

#### `private Ref list`

- Description: TODO

#### `private int n`

- Description: TODO

#### `final Cleaner action`

- Description: TODO

#### `boolean linked`

- Description: TODO

#### `Ref next, prev`

- Description: TODO

#### `Ref next, prev`

- Description: TODO

#### `private final Collection<Entry> refs`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final String desc`

- Description: TODO

#### `private Ref ref`

- Description: TODO

#### `private static boolean leaking = false`

- Description: TODO

#### `public final String desc`

- Description: TODO

#### `private final Runnable fin`

- Description: TODO

#### `private final Class<?> cls`

- Description: TODO

#### `private final Throwable create`

- Description: TODO

#### `private boolean clean = false`

- Description: TODO

#### `public final Disposable tgt`

- Description: TODO

#### `public final T ob`

- Description: TODO

#### `private final Runnable clean`

- Description: TODO

### Methods

#### `public Finalizer(Function<Runnable, Thread> ctx)`

- Description: TODO

#### `public Finalizer()`

- Description: TODO

#### `public void clean()`

- Description: TODO

#### `public String format()`

- Description: TODO

#### `Ref(Object x, Cleaner action)`

- Description: TODO

#### `private void add()`

- Description: TODO

#### `private void remove()`

- Description: TODO

#### `public void run()`

- Description: TODO

#### `public void clear()`

- Description: TODO

#### `private void run()`

- Description: TODO

#### `private void ckrun()`

- Description: TODO

#### `public Runnable add(Object x, Cleaner action)`

- Description: TODO

#### `public static Finalizer get()`

- Description: TODO

#### `public static Runnable finalize(Object x, Cleaner action)`

- Description: TODO

#### `private Entry(Ref ref)`

- Description: TODO

#### `public boolean equals(Entry that)`

- Description: TODO

#### `public boolean equals(Object that)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `private Snapshot(Finalizer from)`

- Description: TODO

#### `public Snapshot weaken()`

- Description: TODO

#### `public String summary()`

- Description: TODO

#### `public String delta(Snapshot prev)`

- Description: TODO

#### `public Snapshot snapshot()`

- Description: TODO

#### `private static void checkcycle(Object ref, Object root)`

- Description: TODO

#### `public LeakCheck(Object guarded, String desc)`

- Description: TODO

#### `public LeakCheck(Object guarded)`

- Description: TODO

#### `public void clean()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public String format()`

- Description: TODO

#### `public static Disposable leakcheck(Object guarded, String desc)`

- Description: TODO

#### `public static Disposable leakcheck(Object guarded)`

- Description: TODO

#### `public Disposer(Disposable tgt)`

- Description: TODO

#### `public void clean()`

- Description: TODO

#### `public String format()`

- Description: TODO

#### `public Reference(T ob)`

- Description: TODO

#### `public T get()`

- Description: TODO

#### `public void dispose()`

- Description: TODO
