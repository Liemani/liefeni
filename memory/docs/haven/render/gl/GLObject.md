# GLObject

This file documents the responsibilities and members of `GLObject`.

## Meta

- Source: [GLObject.java](../../../../../src/haven/render/gl/GLObject.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a GL object.

## Nested Types

### UseAfterFreeException

- Description: TODO

## Members

### Constants

#### `public static final boolean LEAK_CHECK = true`

- Description: TODO

#### `private static final java.util.concurrent.atomic.AtomicInteger ar = new java.util.concurrent.atomic.AtomicInteger(0)`

- Description: TODO

### Fields

#### `public final GLEnvironment env`

- Description: TODO

#### `private boolean del = false, disp = false`

- Description: TODO

#### `private boolean del = false, disp = false`

- Description: TODO

#### `private GLEnvironment.MemStats pool = null`

- Description: TODO

#### `private long mem`

- Description: TODO

#### `private int rc = 0`

- Description: TODO

#### `int dispseq`

- Description: TODO

#### `private final Disposable lck = (LEAK_CHECK && leakcheck()) ? Finalizer.leakcheck(this) : null`

- Description: TODO

#### `public Throwable disptrace = null`

- Description: TODO

### Methods

#### `public GLObject(GLEnvironment env)`

- Description: TODO

#### `public abstract void create(GL gl)`

- Description: TODO

#### `public void abortcreate()`

- Description: TODO

#### `protected abstract void delete(GL gl)`

- Description: TODO

#### `protected boolean leakcheck()`

- Description: TODO

#### `protected void dispose0()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public UseAfterFreeException(Throwable cause)`

- Description: TODO

#### `void get()`

- Description: TODO

#### `void put()`

- Description: TODO

#### `protected void ckstate(int st, int ex)`

- Description: TODO

#### `protected void setmem(GLEnvironment.MemStats pool, long mem)`

- Description: TODO
