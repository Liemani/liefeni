# WeakHashedSet

This file documents the responsibilities and members of `WeakHashedSet`.

## Meta

- Source: [WeakHashedSet.java](../../../src/haven/WeakHashedSet.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the weak hashed set Haven component.

## Nested Types

### Ref

- Role: Represents ref within WeakHashedSet.
- Description: Describes the nested ref type used by the enclosing class.

## Members

### Constants

#### `private static final double loadfac = 0.5`
- Role: Defines the shared loadfac constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final ReferenceQueue<E> cleanq = new ReferenceQueue<>()`
- Role: Caches cleanq entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Hash<? super E> hash`
- Role: Holds the hash state.
- Description: Backs the cached state for this file.

#### `private Ref<E>[] tab`
- Role: Holds the tab state.
- Description: Backs the cached state for this file.

#### `private int sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

#### `final int hash`
- Role: Stores the hash value.
- Description: Backs the cached state for this file.

### Methods

#### `Ref(T ob, ReferenceQueue<T> q)`
- Role: Handles the ref workflow.
- Description: Supports the ref operation used by the surrounding class.

#### `public WeakHashedSet(Hash<? super E> hash)`
- Role: Creates a new WeakHashedSet instance.
- Description: Constructs the instance and initializes its default state.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the associated value from the current runtime state.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public boolean isEmpty()`
- Role: Checks whether the empty.
- Description: Returns a boolean result for the described condition.

#### `private int nextidx(Ref[] tab, int idx)`
- Role: Performs nextidx.
- Description: Supports the nextidx operation used by the surrounding class.

#### `private int hashidx(Ref[] tab, E el)`
- Role: Performs hashidx.
- Description: Supports the hashidx operation used by the surrounding class.

#### `private int findidx(Ref<E>[] tab, Object e)`
- Role: Performs findidx.
- Description: Supports the findidx operation used by the surrounding class.

#### `private int refidx(Ref<E>[] tab, Ref ref)`
- Role: Performs refidx.
- Description: Supports the refidx operation used by the surrounding class.

#### `private void clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `private void remove(Ref<E>[] tab, int idx)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `public boolean remove(Object el)`
- Role: Performs remove.
- Description: Supports the remove operation used by the surrounding class.

#### `private void ckshrink()`
- Role: Performs ckshrink.
- Description: Supports the ckshrink operation used by the surrounding class.

#### `private void resize(int nsz)`
- Role: Performs resize.
- Description: Supports the resize operation used by the surrounding class.

#### `public boolean add(E el)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Iterator<E> iterator()`
- Role: Performs iterator.
- Description: Supports the iterator operation used by the surrounding class.

#### `public boolean contains(Object el)`
- Role: Performs contains.
- Description: Supports the contains operation used by the surrounding class.

#### `public E find(E el)`
- Role: Performs find.
- Description: Supports the find operation used by the surrounding class.

#### `public E intern(E el)`
- Role: Performs intern.
- Description: Supports the intern operation used by the surrounding class.

#### `public String stats()`
- Role: Performs stats.
- Description: Supports the stats operation used by the surrounding class.
