---
source: [GLObject.java](../../../../../../src/haven/render/gl/GLObject.java)
created: 2026-06-13
updated: 2026-06-14
---

# GLObject

Provides GL backend support for globject.

## Nested Types

### UseAfterFreeException

- Role: Represents use after free exception within GLObject.
- Description: Describes the nested use after free exception type used by the enclosing class.

## Members

### Constants

#### `public static final boolean LEAK_CHECK = true`
- Role: Caches the leak check value.
- Description: Caches the `LEAK_CHECK` value for reuse.
- Value: `true`

#### `private static final java.util.concurrent.atomic.AtomicInteger ar = new java.util.concurrent.atomic.AtomicInteger(0)`
- Role: Implements the ar operation.
- Description: Implements the atomic integer operation.
- Value: `new java.util.concurrent.atomic.AtomicInteger(0)`

### Fields

#### `public final GLEnvironment env`
- Role: Caches the env value.
- Description: Caches the `env` value for reuse.

#### `private boolean del = false, disp = false`
- Role: Tracks the del flag.
- Description: Caches the `del` value for reuse.

#### `private boolean del = false, disp = false`
- Role: Tracks the del flag.
- Description: Caches the `del` value for reuse.

#### `private GLEnvironment.MemStats pool = null`
- Role: Caches the pool value.
- Description: Caches the `pool` value for reuse.

#### `private long mem`
- Role: Caches the mem value.
- Description: Caches the `mem` value for reuse.

#### `private int rc = 0`
- Role: Caches the rc value.
- Description: Caches the `rc` value for reuse.

#### `int dispseq`
- Role: Caches the dispseq value.
- Description: Caches the `dispseq` value for reuse.

#### `private final Disposable lck = (LEAK_CHECK && leakcheck()) ? Finalizer.leakcheck(this) : null`
- Role: Implements the lck operation.
- Description: Implements the leakcheck operation.

#### `public Throwable disptrace = null`
- Role: Caches the disptrace value.
- Description: Caches the `disptrace` value for reuse.

### Methods

#### `public GLObject(GLEnvironment env)`
- Role: Creates a new GLObject instance.
- Description: Constructs the GLObject instance from the supplied inputs.

#### `public abstract void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void abortcreate()`
- Role: Handles the abortcreate path.
- Description: Implements the abortcreate operation.

#### `protected abstract void delete(GL gl)`
- Role: Removes or disposes the object.
- Description: Removes or disposes the object.

#### `protected boolean leakcheck()`
- Role: Handles the leakcheck path.
- Description: Implements the leakcheck operation.

#### `protected void dispose0()`
- Role: Handles the dispose0 path.
- Description: Implements the dispose0 operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public UseAfterFreeException(Throwable cause)`
- Role: Handles the use after free exception path.
- Description: Implements the use after free exception operation.

#### `void get()`
- Role: Handles the get path.
- Description: Returns the cached get.

#### `void put()`
- Role: Stores or releases the supplied value in the owning container.
- Description: Stores or releases the supplied value in the owning container.

#### `protected void ckstate(int st, int ex)`
- Role: Handles the ckstate path.
- Description: Implements the ckstate operation.

#### `protected void setmem(GLEnvironment.MemStats pool, long mem)`
- Role: Handles the setmem path.
- Description: Updates the mem.