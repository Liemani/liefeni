# Finalizer

## Meta

- Source: [Finalizer.java](../../../src/haven/Finalizer.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Handles finalization helpers.

## Code Members

### Member Index

#### Fields

- [CHECK_CYCLES](#member-1)
- [queue](#member-2)
- [ctx](#member-3)
- [th](#member-4)
- [list](#member-5)
- [n](#member-6)
- [action](#member-9)
- [linked](#member-10)
- [next](#member-11)
- [prev](#member-12)
- [groups](#member-21)
- [refs](#member-24)
- [id](#member-25)
- [desc](#member-26)
- [ref](#member-27)
- [leaking](#member-38)
- [desc](#member-39)
- [fin](#member-40)
- [cls](#member-41)
- [create](#member-42)
- [clean](#member-43)
- [tgt](#member-51)
- [ob](#member-55)
- [clean](#member-56)

#### Methods

- [public void clean();](#member-7)
- [public String format();](#member-8)
- [Ref(Object x, Cleaner action)](#member-13)
- [add()](#member-14)
- [remove()](#member-15)
- [run()](#member-16)
- [clear()](#member-17)
- [run()](#member-18)
- [ckrun()](#member-19)
- [add(Object x, Cleaner action)](#member-20)
- [get()](#member-22)
- [finalize(Object x, Cleaner action)](#member-23)
- [Entry(Ref ref)](#member-28)
- [equals(Entry that)](#member-29)
- [equals(Object that)](#member-30)
- [hashCode()](#member-31)
- [Snapshot(Finalizer from)](#member-32)
- [weaken()](#member-33)
- [summary()](#member-34)
- [delta(Snapshot prev)](#member-35)
- [snapshot()](#member-36)
- [checkcycle(Object ref, Object root)](#member-37)
- [LeakCheck(Object guarded, String desc)](#member-44)
- [LeakCheck(Object guarded)](#member-45)
- [clean()](#member-46)
- [dispose()](#member-47)
- [format()](#member-48)
- [leakcheck(Object guarded, String desc)](#member-49)
- [leakcheck(Object guarded)](#member-50)
- [Disposer(Disposable tgt)](#member-52)
- [clean()](#member-53)
- [format()](#member-54)
- [Reference(T ob)](#member-57)
- [get()](#member-58)
- [dispose()](#member-59)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `CHECK_CYCLES`

- Description: TODO

<a id="member-2"></a>
##### `queue`

- Description: TODO

<a id="member-3"></a>
##### `ctx`

- Description: TODO

<a id="member-4"></a>
##### `th`

- Description: TODO

<a id="member-5"></a>
##### `list`

- Description: TODO

<a id="member-6"></a>
##### `n`

- Description: TODO

<a id="member-9"></a>
##### `action`

- Description: TODO

<a id="member-10"></a>
##### `linked`

- Description: TODO

<a id="member-11"></a>
##### `next`

- Description: TODO

<a id="member-12"></a>
##### `prev`

- Description: TODO

<a id="member-21"></a>
##### `groups`

- Description: TODO

<a id="member-24"></a>
##### `refs`

- Description: TODO

<a id="member-25"></a>
##### `id`

- Description: TODO

<a id="member-26"></a>
##### `desc`

- Description: TODO

<a id="member-27"></a>
##### `ref`

- Description: TODO

<a id="member-38"></a>
##### `leaking`

- Description: TODO

<a id="member-39"></a>
##### `desc`

- Description: TODO

<a id="member-40"></a>
##### `fin`

- Description: TODO

<a id="member-41"></a>
##### `cls`

- Description: TODO

<a id="member-42"></a>
##### `create`

- Description: TODO

<a id="member-43"></a>
##### `clean`

- Description: TODO

<a id="member-51"></a>
##### `tgt`

- Description: TODO

<a id="member-55"></a>
##### `ob`

- Description: TODO

<a id="member-56"></a>
##### `clean`

- Description: TODO

#### Methods

<a id="member-7"></a>
##### `public void clean();`

- Description: TODO

<a id="member-8"></a>
##### `public String format();`

- Description: TODO

<a id="member-13"></a>
##### `Ref(Object x, Cleaner action)`

- Description: TODO

<a id="member-14"></a>
##### `add()`

- Description: TODO

<a id="member-15"></a>
##### `remove()`

- Description: TODO

<a id="member-16"></a>
##### `run()`

- Description: TODO

<a id="member-17"></a>
##### `clear()`

- Description: TODO

<a id="member-18"></a>
##### `run()`

- Description: TODO

<a id="member-19"></a>
##### `ckrun()`

- Description: TODO

<a id="member-20"></a>
##### `add(Object x, Cleaner action)`

- Description: TODO

<a id="member-22"></a>
##### `get()`

- Description: TODO

<a id="member-23"></a>
##### `finalize(Object x, Cleaner action)`

- Description: TODO

<a id="member-28"></a>
##### `Entry(Ref ref)`

- Description: TODO

<a id="member-29"></a>
##### `equals(Entry that)`

- Description: TODO

<a id="member-30"></a>
##### `equals(Object that)`

- Description: TODO

<a id="member-31"></a>
##### `hashCode()`

- Description: TODO

<a id="member-32"></a>
##### `Snapshot(Finalizer from)`

- Description: TODO

<a id="member-33"></a>
##### `weaken()`

- Description: TODO

<a id="member-34"></a>
##### `summary()`

- Description: TODO

<a id="member-35"></a>
##### `delta(Snapshot prev)`

- Description: TODO

<a id="member-36"></a>
##### `snapshot()`

- Description: TODO

<a id="member-37"></a>
##### `checkcycle(Object ref, Object root)`

- Description: TODO

<a id="member-44"></a>
##### `LeakCheck(Object guarded, String desc)`

- Description: TODO

<a id="member-45"></a>
##### `LeakCheck(Object guarded)`

- Description: TODO

<a id="member-46"></a>
##### `clean()`

- Description: TODO

<a id="member-47"></a>
##### `dispose()`

- Description: TODO

<a id="member-48"></a>
##### `format()`

- Description: TODO

<a id="member-49"></a>
##### `leakcheck(Object guarded, String desc)`

- Description: TODO

<a id="member-50"></a>
##### `leakcheck(Object guarded)`

- Description: TODO

<a id="member-52"></a>
##### `Disposer(Disposable tgt)`

- Description: TODO

<a id="member-53"></a>
##### `clean()`

- Description: TODO

<a id="member-54"></a>
##### `format()`

- Description: TODO

<a id="member-57"></a>
##### `Reference(T ob)`

- Description: TODO

<a id="member-58"></a>
##### `get()`

- Description: TODO

<a id="member-59"></a>
##### `dispose()`

- Description: TODO
