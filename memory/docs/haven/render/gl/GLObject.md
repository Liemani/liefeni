# GLObject

This file documents the responsibilities and members of `GLObject`.

## Meta

- Source: [GLObject.java](../../../../../src/haven/render/gl/GLObject.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides GL backend support for globject.

## Nested Types

### UseAfterFreeException

- Role: Represents use after free exception within GLObject.
- Description: Describes the nested use after free exception type used by the enclosing class.

## Members

### Constants

#### `public static final boolean LEAK_CHECK = true`
- Role: Defines the shared leak check constant.
- Description: Shared constant used by the rest of the class.

#### `private static final java.util.concurrent.atomic.AtomicInteger ar = new java.util.concurrent.atomic.AtomicInteger(0)`
- Role: Defines the shared ar constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final GLEnvironment env`
- Role: Holds the env state.
- Description: Backs the cached state for this file.

#### `private boolean del = false, disp = false`
- Role: Tracks the del flag.
- Description: Supports the del operation used by the surrounding class.

#### `private boolean del = false, disp = false`
- Role: Tracks the del flag.
- Description: Supports the del operation used by the surrounding class.

#### `private GLEnvironment.MemStats pool = null`
- Role: Holds the pool state.
- Description: Backs the cached state for this file.

#### `private long mem`
- Role: Stores the mem value.
- Description: Backs the cached state for this file.

#### `private int rc = 0`
- Role: Stores the rc value.
- Description: Backs the cached state for this file.

#### `int dispseq`
- Role: Stores the dispseq value.
- Description: Backs the cached state for this file.

#### `private final Disposable lck = (LEAK_CHECK && leakcheck()) ? Finalizer.leakcheck(this) : null`
- Role: Holds the lck state.
- Description: Backs the cached state for this file.

#### `public Throwable disptrace = null`
- Role: Holds the disptrace state.
- Description: Backs the cached state for this file.

### Methods

#### `public GLObject(GLEnvironment env)`
- Role: Creates a new GLObject instance.
- Description: Constructs the instance and initializes its default state.

#### `public abstract void create(GL gl)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public void abortcreate()`
- Role: Performs abortcreate.
- Description: Supports the abortcreate operation used by the surrounding class.

#### `protected abstract void delete(GL gl)`
- Role: Performs delete.
- Description: Supports the delete operation used by the surrounding class.

#### `protected boolean leakcheck()`
- Role: Performs leakcheck.
- Description: Supports the leakcheck operation used by the surrounding class.

#### `protected void dispose0()`
- Role: Performs dispose0.
- Description: Supports the dispose0 operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public UseAfterFreeException(Throwable cause)`
- Role: Performs use after free exception.
- Description: Supports the use after free exception operation used by the surrounding class.

#### `void get()`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `void put()`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `protected void ckstate(int st, int ex)`
- Role: Performs ckstate.
- Description: Supports the ckstate operation used by the surrounding class.

#### `protected void setmem(GLEnvironment.MemStats pool, long mem)`
- Role: Performs setmem.
- Description: Supports the setmem operation used by the surrounding class.
