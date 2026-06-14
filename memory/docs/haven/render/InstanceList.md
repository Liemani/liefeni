# InstanceList

## Meta

- Source: [InstanceList.java](../../../../src/haven/render/InstanceList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a list of instances.

## Code Members

### Member Index

#### Fields

- [clients](#member-1)
- [master](#member-2)
- [instreg](#member-3)
- [bypassed](#member-4)
- [invalid](#member-5)
- [uslotmap](#member-6)
- [islotmap](#member-7)
- [ipipemap](#member-8)
- [upipemap](#member-9)
- [dirty](#member-10)
- [nbypass](#member-11)
- [ninvalid](#member-12)
- [nuinst](#member-13)
- [nbatches](#member-14)
- [ninst](#member-15)
- [_stcounts](#member-16)
- [instid](#member-21)
- [ust](#member-22)
- [instids](#member-23)
- [instidmap](#member-24)
- [mask](#member-31)
- [key](#member-36)
- [rend](#member-37)
- [ist](#member-38)
- [ust](#member-39)
- [insts](#member-40)
- [ni](#member-41)
- [backdirty](#member-42)
- [selfdirty](#member-43)
- [slot](#member-44)
- [rpipes](#member-45)
- [idx](#member-46)
- [state](#member-64)
- [key](#member-73)
- [slot](#member-74)
- [rpipes](#member-75)

#### Methods

- [stcounts(int n)](#member-17)
- [uinststate(GroupPipe st, int ls)](#member-18)
- [instid0(Pipe buf, State.Slot<T> slot)](#member-19)
- [instids(GroupPipe st, int ls)](#member-20)
- [InstKey(Slot<? extends Rendered> slot)](#member-25)
- [valid()](#member-26)
- [hashCode()](#member-27)
- [equals(InstKey that)](#member-28)
- [equals(Object x)](#member-29)
- [toString()](#member-30)
- [inststate0(State.Slot<T> slot, GroupPipe from, InstancedSlot batch)](#member-32)
- [InstanceState(GroupPipe from, InstancedSlot batch)](#member-33)
- [compare(InstanceState x, InstanceState y)](#member-34)
- [toString()](#member-35)
- [Instance(Slot<? extends Rendered> slot)](#member-47)
- [register()](#member-48)
- [unregister()](#member-49)
- [update(Pipe group, int[] mask)](#member-50)
- [InstancedSlot(InstKey key, Slot<? extends Rendered>[] slots)](#member-51)
- [register()](#member-52)
- [unregister()](#member-53)
- [iupdate(int idx)](#member-54)
- [itrim(int idx)](#member-55)
- [add(Slot<? extends Rendered> ns, InstancedSlot replace)](#member-56)
- [remove(Instance inst)](#member-57)
- [dispose()](#member-58)
- [update(Slot<? extends Rendered> ns)](#member-59)
- [group(int idx)](#member-60)
- [gstate(int id)](#member-61)
- [nstates()](#member-62)
- [obj()](#member-63)
- [state()](#member-65)
- [batchstates()](#member-66)
- [batchstate(State.Slot<T> slot)](#member-67)
- [instances()](#member-68)
- [inststate(int idx)](#member-69)
- [instupdate()](#member-70)
- [update(State.Slot<? super T> slot, T state)](#member-71)
- [commit(Render g)](#member-72)
- [Sole(InstKey key, Slot<? extends Rendered> slot)](#member-76)
- [register()](#member-77)
- [unregister()](#member-78)
- [update(Pipe group, int[] mask)](#member-79)
- [cladd(Slot<? extends Rendered> slot)](#member-80)
- [clremove(Slot<? extends Rendered> slot)](#member-81)
- [clupdate(Slot<? extends Rendered> slot)](#member-82)
- [clupdate(Pipe group, int[] mask)](#member-83)
- [add0(Slot<? extends Rendered> slot, InstKey key, boolean prevsole, InstancedSlot previnst)](#member-84)
- [add(Slot<? extends Rendered> slot)](#member-85)
- [remove0(InstancedSlot b, InstancedSlot.Instance inst, boolean unreg)](#member-86)
- [remove(Slot<? extends Rendered> slot)](#member-87)
- [update(Slot<? extends Rendered> slot)](#member-88)
- [update(Pipe group, int[] mask)](#member-89)
- [commit(Render g)](#member-90)
- [lock()](#member-91)
- [slots()](#member-92)
- [add(RenderList<R> list, Class<? extends R> type)](#member-93)
- [remove(RenderList<?> list)](#member-94)
- [dispose()](#member-95)
- [stats()](#member-96)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `clients`

- Description: TODO

<a id="member-2"></a>
##### `master`

- Description: TODO

<a id="member-3"></a>
##### `instreg`

- Description: TODO

<a id="member-4"></a>
##### `bypassed`

- Description: TODO

<a id="member-5"></a>
##### `invalid`

- Description: TODO

<a id="member-6"></a>
##### `uslotmap`

- Description: TODO

<a id="member-7"></a>
##### `islotmap`

- Description: TODO

<a id="member-8"></a>
##### `ipipemap`

- Description: TODO

<a id="member-9"></a>
##### `upipemap`

- Description: TODO

<a id="member-10"></a>
##### `dirty`

- Description: TODO

<a id="member-11"></a>
##### `nbypass`

- Description: TODO

<a id="member-12"></a>
##### `ninvalid`

- Description: TODO

<a id="member-13"></a>
##### `nuinst`

- Description: TODO

<a id="member-14"></a>
##### `nbatches`

- Description: TODO

<a id="member-15"></a>
##### `ninst`

- Description: TODO

<a id="member-16"></a>
##### `_stcounts`

- Description: TODO

<a id="member-21"></a>
##### `instid`

- Description: TODO

<a id="member-22"></a>
##### `ust`

- Description: TODO

<a id="member-23"></a>
##### `instids`

- Description: TODO

<a id="member-24"></a>
##### `instidmap`

- Description: TODO

<a id="member-31"></a>
##### `mask`

- Description: TODO

<a id="member-36"></a>
##### `key`

- Description: TODO

<a id="member-37"></a>
##### `rend`

- Description: TODO

<a id="member-38"></a>
##### `ist`

- Description: TODO

<a id="member-39"></a>
##### `ust`

- Description: TODO

<a id="member-40"></a>
##### `insts`

- Description: TODO

<a id="member-41"></a>
##### `ni`

- Description: TODO

<a id="member-42"></a>
##### `backdirty`

- Description: TODO

<a id="member-43"></a>
##### `selfdirty`

- Description: TODO

<a id="member-44"></a>
##### `slot`

- Description: TODO

<a id="member-45"></a>
##### `rpipes`

- Description: TODO

<a id="member-46"></a>
##### `idx`

- Description: TODO

<a id="member-64"></a>
##### `state`

- Description: TODO

<a id="member-73"></a>
##### `key`

- Description: TODO

<a id="member-74"></a>
##### `slot`

- Description: TODO

<a id="member-75"></a>
##### `rpipes`

- Description: TODO

#### Methods

<a id="member-17"></a>
##### `stcounts(int n)`

- Description: TODO

<a id="member-18"></a>
##### `uinststate(GroupPipe st, int ls)`

- Description: TODO

<a id="member-19"></a>
##### `instid0(Pipe buf, State.Slot<T> slot)`

- Description: TODO

<a id="member-20"></a>
##### `instids(GroupPipe st, int ls)`

- Description: TODO

<a id="member-25"></a>
##### `InstKey(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-26"></a>
##### `valid()`

- Description: TODO

<a id="member-27"></a>
##### `hashCode()`

- Description: TODO

<a id="member-28"></a>
##### `equals(InstKey that)`

- Description: TODO

<a id="member-29"></a>
##### `equals(Object x)`

- Description: TODO

<a id="member-30"></a>
##### `toString()`

- Description: TODO

<a id="member-32"></a>
##### `inststate0(State.Slot<T> slot, GroupPipe from, InstancedSlot batch)`

- Description: TODO

<a id="member-33"></a>
##### `InstanceState(GroupPipe from, InstancedSlot batch)`

- Description: TODO

<a id="member-34"></a>
##### `compare(InstanceState x, InstanceState y)`

- Description: TODO

<a id="member-35"></a>
##### `toString()`

- Description: TODO

<a id="member-47"></a>
##### `Instance(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-48"></a>
##### `register()`

- Description: TODO

<a id="member-49"></a>
##### `unregister()`

- Description: TODO

<a id="member-50"></a>
##### `update(Pipe group, int[] mask)`

- Description: TODO

<a id="member-51"></a>
##### `InstancedSlot(InstKey key, Slot<? extends Rendered>[] slots)`

- Description: TODO

<a id="member-52"></a>
##### `register()`

- Description: TODO

<a id="member-53"></a>
##### `unregister()`

- Description: TODO

<a id="member-54"></a>
##### `iupdate(int idx)`

- Description: TODO

<a id="member-55"></a>
##### `itrim(int idx)`

- Description: TODO

<a id="member-56"></a>
##### `add(Slot<? extends Rendered> ns, InstancedSlot replace)`

- Description: TODO

<a id="member-57"></a>
##### `remove(Instance inst)`

- Description: TODO

<a id="member-58"></a>
##### `dispose()`

- Description: TODO

<a id="member-59"></a>
##### `update(Slot<? extends Rendered> ns)`

- Description: TODO

<a id="member-60"></a>
##### `group(int idx)`

- Description: TODO

<a id="member-61"></a>
##### `gstate(int id)`

- Description: TODO

<a id="member-62"></a>
##### `nstates()`

- Description: TODO

<a id="member-63"></a>
##### `obj()`

- Description: TODO

<a id="member-65"></a>
##### `state()`

- Description: TODO

<a id="member-66"></a>
##### `batchstates()`

- Description: TODO

<a id="member-67"></a>
##### `batchstate(State.Slot<T> slot)`

- Description: TODO

<a id="member-68"></a>
##### `instances()`

- Description: TODO

<a id="member-69"></a>
##### `inststate(int idx)`

- Description: TODO

<a id="member-70"></a>
##### `instupdate()`

- Description: TODO

<a id="member-71"></a>
##### `update(State.Slot<? super T> slot, T state)`

- Description: TODO

<a id="member-72"></a>
##### `commit(Render g)`

- Description: TODO

<a id="member-76"></a>
##### `Sole(InstKey key, Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-77"></a>
##### `register()`

- Description: TODO

<a id="member-78"></a>
##### `unregister()`

- Description: TODO

<a id="member-79"></a>
##### `update(Pipe group, int[] mask)`

- Description: TODO

<a id="member-80"></a>
##### `cladd(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-81"></a>
##### `clremove(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-82"></a>
##### `clupdate(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-83"></a>
##### `clupdate(Pipe group, int[] mask)`

- Description: TODO

<a id="member-84"></a>
##### `add0(Slot<? extends Rendered> slot, InstKey key, boolean prevsole, InstancedSlot previnst)`

- Description: TODO

<a id="member-85"></a>
##### `add(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-86"></a>
##### `remove0(InstancedSlot b, InstancedSlot.Instance inst, boolean unreg)`

- Description: TODO

<a id="member-87"></a>
##### `remove(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-88"></a>
##### `update(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-89"></a>
##### `update(Pipe group, int[] mask)`

- Description: TODO

<a id="member-90"></a>
##### `commit(Render g)`

- Description: TODO

<a id="member-91"></a>
##### `lock()`

- Description: TODO

<a id="member-92"></a>
##### `slots()`

- Description: TODO

<a id="member-93"></a>
##### `add(RenderList<R> list, Class<? extends R> type)`

- Description: TODO

<a id="member-94"></a>
##### `remove(RenderList<?> list)`

- Description: TODO

<a id="member-95"></a>
##### `dispose()`

- Description: TODO

<a id="member-96"></a>
##### `stats()`

- Description: TODO
