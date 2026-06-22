---
source: [WeakHashedSet.java](../../../../src/haven/WeakHashedSet.java)
created: 2026-06-13
updated: 2026-06-14
---

# WeakHashedSet

Represents the weak hashed set Haven component.

## Nested Types

### Ref

- Role: Wraps a weak set entry reference.
- Description: WeakReference subclass that caches the original hash code for open-addressed lookup.

## Members

### Constants

#### `private static final double loadfac = 0.5`
- Role: Caches the loadfac value.
- Description: Caches the `loadfac` value for reuse.
- Value: `0.5`

### Fields

#### `private final ReferenceQueue<E> cleanq = new ReferenceQueue<>()`
- Role: Implements the cleanq operation.
- Description: Implements the private final reference queue<e> cleanq = new reference queue<>() operation.

#### `public final Hash<? super E> hash`
- Role: Caches the hash value.
- Description: Caches the `hash` value for reuse.

#### `private Ref<E>[] tab`
- Role: Caches the tab value.
- Description: Caches the `tab` value for reuse.

#### `private int sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `final int hash`
- Role: Caches the hash value.
- Description: Caches the `hash` value for reuse.

### Methods

#### `Ref(T ob, ReferenceQueue<T> q)`
- Role: Handles the ref workflow.
- Description: Implements the ref operation.

#### `public WeakHashedSet(Hash<? super E> hash)`
- Role: Creates a new WeakHashedSet instance.
- Description: Constructs the WeakHashedSet instance from the supplied inputs.

#### `public void clear()`
- Role: Clears waypoint manager state.
- Description: Removes the current value from the owning state.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public boolean isEmpty()`
- Role: Checks whether the empty.
- Description: Returns whether the condition is satisfied.

#### `private int nextidx(Ref[] tab, int idx)`
- Role: Handles the nextidx path.
- Description: Implements the nextidx operation.

#### `private int hashidx(Ref[] tab, E el)`
- Role: Handles the hashidx path.
- Description: Returns whether the hidx is present.

#### `private int findidx(Ref<E>[] tab, Object e)`
- Role: Handles the findidx path.
- Description: Finds the idx.

#### `private int refidx(Ref<E>[] tab, Ref ref)`
- Role: Handles the refidx path.
- Description: Implements the refidx operation.

#### `private void clean()`
- Role: Handles the clean path.
- Description: Implements the clean operation.

#### `private void remove(Ref<E>[] tab, int idx)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `public boolean remove(Object el)`
- Role: Removes the supplied value from the owning container.
- Description: Removes the supplied value from the owning container.

#### `private void ckshrink()`
- Role: Handles the ckshrink path.
- Description: Implements the ckshrink operation.

#### `private void resize(int nsz)`
- Role: Handles the resize path.
- Description: Implements the resize operation.

#### `public boolean add(E el)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public Iterator<E> iterator()`
- Role: Handles the iterator path.
- Description: Implements the iterator operation.

#### `public boolean contains(Object el)`
- Role: Handles the contains path.
- Description: Implements the contains operation.

#### `public E find(E el)`
- Role: Handles the find path.
- Description: Finds the requested data.

#### `public E intern(E el)`
- Role: Handles the intern path.
- Description: Implements the intern operation.

#### `public String stats()`
- Role: Handles the stats path.
- Description: Implements the stats operation.