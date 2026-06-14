# GLObject

## Meta

- Source: [GLObject.java](../../../../../src/haven/render/gl/GLObject.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a GL object.

## Code Members

### Member Index

#### Constants

- [LEAK_CHECK](#member-1)

#### Fields

- [env](#member-2)
- [del](#member-3)
- [disp](#member-4)
- [pool](#member-5)
- [mem](#member-6)
- [rc](#member-7)
- [dispseq](#member-8)
- [lck](#member-13)
- [disptrace](#member-15)
- [ar](#member-18)

#### Methods

- [public abstract void create(GL gl);](#member-9)
- [abortcreate()](#member-10)
- [protected abstract void delete(GL gl);](#member-11)
- [leakcheck()](#member-12)
- [dispose0()](#member-14)
- [dispose()](#member-16)
- [UseAfterFreeException(Throwable cause)](#member-17)
- [get()](#member-19)
- [put()](#member-20)
- [ckstate(int st, int ex)](#member-21)
- [setmem(GLEnvironment.MemStats pool, long mem)](#member-22)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `LEAK_CHECK`

- Description: TODO

#### Fields

<a id="member-2"></a>
##### `env`

- Description: TODO

<a id="member-3"></a>
##### `del`

- Description: TODO

<a id="member-4"></a>
##### `disp`

- Description: TODO

<a id="member-5"></a>
##### `pool`

- Description: TODO

<a id="member-6"></a>
##### `mem`

- Description: TODO

<a id="member-7"></a>
##### `rc`

- Description: TODO

<a id="member-8"></a>
##### `dispseq`

- Description: TODO

<a id="member-13"></a>
##### `lck`

- Description: TODO

<a id="member-15"></a>
##### `disptrace`

- Description: TODO

<a id="member-18"></a>
##### `ar`

- Description: TODO

#### Methods

<a id="member-9"></a>
##### `public abstract void create(GL gl);`

- Description: TODO

<a id="member-10"></a>
##### `abortcreate()`

- Description: TODO

<a id="member-11"></a>
##### `protected abstract void delete(GL gl);`

- Description: TODO

<a id="member-12"></a>
##### `leakcheck()`

- Description: TODO

<a id="member-14"></a>
##### `dispose0()`

- Description: TODO

<a id="member-16"></a>
##### `dispose()`

- Description: TODO

<a id="member-17"></a>
##### `UseAfterFreeException(Throwable cause)`

- Description: TODO

<a id="member-19"></a>
##### `get()`

- Description: TODO

<a id="member-20"></a>
##### `put()`

- Description: TODO

<a id="member-21"></a>
##### `ckstate(int st, int ex)`

- Description: TODO

<a id="member-22"></a>
##### `setmem(GLEnvironment.MemStats pool, long mem)`

- Description: TODO
