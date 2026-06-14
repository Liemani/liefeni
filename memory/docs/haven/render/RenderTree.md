# RenderTree

## Meta

- Source: [RenderTree.java](../../../../src/haven/render/RenderTree.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a render tree.

## Code Members

### Member Index

#### Fields

- [lock](#member-1)
- [root](#member-2)
- [clients](#member-3)
- [nslots](#member-4)
- [nleaves](#member-5)
- [type](#member-7)
- [list](#member-8)
- [groups](#member-14)
- [gstates](#member-15)
- [interned](#member-21)
- [states](#member-22)
- [def](#member-23)
- [deps](#member-24)
- [ndef](#member-25)
- [data](#member-32)
- [parent](#member-33)
- [lock](#member-34)
- [interned](#member-42)
- [bk](#member-43)
- [node](#member-58)
- [parent](#member-61)
- [tree](#member-62)
- [node](#member-63)
- [dstate](#member-64)
- [rdeps](#member-65)
- [deps](#member-66)
- [cstate](#member-67)
- [ostate](#member-68)
- [stlock](#member-69)
- [children](#member-70)
- [nchildren](#member-71)
- [pidx](#member-72)
- [pdstate](#member-100)
- [istate](#member-102)
- [slot](#member-109)
- [nil](#member-113)

#### Methods

- [lock()](#member-6)
- [Client(Class<? extends R> type, RenderList<R> list)](#member-9)
- [added(TreeSlot slot)](#member-10)
- [removed(TreeSlot slot)](#member-11)
- [updated(TreeSlot slot)](#member-12)
- [updated(Pipe group, int[] mask)](#member-13)
- [Inheritance(Pipe[] groups, int[] gstates)](#member-16)
- [group(int g)](#member-17)
- [gstate(int id)](#member-18)
- [nstates()](#member-19)
- [toString()](#member-20)
- [alloc(int idx)](#member-26)
- [equals(Object o)](#member-27)
- [hashCode()](#member-28)
- [intern()](#member-29)
- [defdiff(DepInfo that)](#member-30)
- [toString()](#member-31)
- [DepPipe(Pipe parent)](#member-35)
- [prep(Pipe.Op op)](#member-36)
- [lock()](#member-37)
- [get(State.Slot<T> slot)](#member-38)
- [put(State.Slot<? super T> slot, T state)](#member-39)
- [copy()](#member-40)
- [states()](#member-41)
- [StaticPipe(DepInfo bk)](#member-44)
- [get(DepInfo bk)](#member-45)
- [get(State.Slot<T> slot)](#member-46)
- [copy()](#member-47)
- [states()](#member-48)
- [public Slot add(Node n, Pipe.Op state);](#member-49)
- [add(Node n)](#member-50)
- [public void remove();](#member-51)
- [public void clear();](#member-52)
- [public void cstate(Pipe.Op state);](#member-53)
- [public void ostate(Pipe.Op state);](#member-54)
- [public Slot parent();](#member-55)
- [public void update();](#member-56)
- [lockstate()](#member-57)
- [SlotRemoved(String message, TreeSlot slot)](#member-59)
- [SlotRemoved(TreeSlot slot)](#member-60)
- [TreeSlot(RenderTree tree, TreeSlot parent, Node node)](#member-73)
- [addch(TreeSlot ch)](#member-74)
- [removech(TreeSlot ch)](#member-75)
- [children()](#member-76)
- [parent()](#member-77)
- [add(Node n, Pipe.Op state)](#member-78)
- [clear()](#member-79)
- [remove()](#member-80)
- [mkdstate(Pipe.Op cstate, Pipe.Op ostate)](#member-81)
- [remrdep(int stidx, TreeSlot rdep)](#member-82)
- [addrdep(int stidx, TreeSlot rdep)](#member-83)
- [adddep(int stidx, TreeSlot dep)](#member-84)
- [rdepupd()](#member-85)
- [setdstate(DepInfo nst)](#member-86)
- [upddstate(DepInfo nst)](#member-87)
- [updtotal(boolean setds)](#member-88)
- [dstate()](#member-89)
- [checklockdeps()](#member-90)
- [lockstate()](#member-91)
- [chstate(Pipe.Op cstate, Pipe.Op ostate)](#member-92)
- [cstate(Pipe.Op state)](#member-93)
- [ostate(Pipe.Op state)](#member-94)
- [update()](#member-95)
- [get(State.Slot<T> slot)](#member-96)
- [copy()](#member-97)
- [states()](#member-98)
- [toString()](#member-99)
- [pdstate()](#member-101)
- [istate()](#member-103)
- [obj()](#member-104)
- [state()](#member-105)
- [toString()](#member-106)
- [added(Slot slot)](#member-107)
- [removed(Slot slot)](#member-108)
- [added(RenderTree.Slot slot)](#member-110)
- [removed(RenderTree.Slot slot)](#member-111)
- [toString()](#member-112)
- [slots()](#member-114)
- [add(Node n, Pipe.Op state)](#member-115)
- [add(Node n)](#member-116)
- [add(RenderList<R> list, Class<? extends R> type)](#member-117)
- [remove(RenderList<?> list)](#member-118)
- [dispose()](#member-119)
- [dump(TreeSlot slot, int ind)](#member-120)
- [dump()](#member-121)
- [stats()](#member-122)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `lock`

- Description: TODO

<a id="member-2"></a>
##### `root`

- Description: TODO

<a id="member-3"></a>
##### `clients`

- Description: TODO

<a id="member-4"></a>
##### `nslots`

- Description: TODO

<a id="member-5"></a>
##### `nleaves`

- Description: TODO

<a id="member-7"></a>
##### `type`

- Description: TODO

<a id="member-8"></a>
##### `list`

- Description: TODO

<a id="member-14"></a>
##### `groups`

- Description: TODO

<a id="member-15"></a>
##### `gstates`

- Description: TODO

<a id="member-21"></a>
##### `interned`

- Description: TODO

<a id="member-22"></a>
##### `states`

- Description: TODO

<a id="member-23"></a>
##### `def`

- Description: TODO

<a id="member-24"></a>
##### `deps`

- Description: TODO

<a id="member-25"></a>
##### `ndef`

- Description: TODO

<a id="member-32"></a>
##### `data`

- Description: TODO

<a id="member-33"></a>
##### `parent`

- Description: TODO

<a id="member-34"></a>
##### `lock`

- Description: TODO

<a id="member-42"></a>
##### `interned`

- Description: TODO

<a id="member-43"></a>
##### `bk`

- Description: TODO

<a id="member-58"></a>
##### `node`

- Description: TODO

<a id="member-61"></a>
##### `parent`

- Description: TODO

<a id="member-62"></a>
##### `tree`

- Description: TODO

<a id="member-63"></a>
##### `node`

- Description: TODO

<a id="member-64"></a>
##### `dstate`

- Description: TODO

<a id="member-65"></a>
##### `rdeps`

- Description: TODO

<a id="member-66"></a>
##### `deps`

- Description: TODO

<a id="member-67"></a>
##### `cstate`

- Description: TODO

<a id="member-68"></a>
##### `ostate`

- Description: TODO

<a id="member-69"></a>
##### `stlock`

- Description: TODO

<a id="member-70"></a>
##### `children`

- Description: TODO

<a id="member-71"></a>
##### `nchildren`

- Description: TODO

<a id="member-72"></a>
##### `pidx`

- Description: TODO

<a id="member-100"></a>
##### `pdstate`

- Description: TODO

<a id="member-102"></a>
##### `istate`

- Description: TODO

<a id="member-109"></a>
##### `slot`

- Description: TODO

<a id="member-113"></a>
##### `nil`

- Description: TODO

#### Methods

<a id="member-6"></a>
##### `lock()`

- Description: TODO

<a id="member-9"></a>
##### `Client(Class<? extends R> type, RenderList<R> list)`

- Description: TODO

<a id="member-10"></a>
##### `added(TreeSlot slot)`

- Description: TODO

<a id="member-11"></a>
##### `removed(TreeSlot slot)`

- Description: TODO

<a id="member-12"></a>
##### `updated(TreeSlot slot)`

- Description: TODO

<a id="member-13"></a>
##### `updated(Pipe group, int[] mask)`

- Description: TODO

<a id="member-16"></a>
##### `Inheritance(Pipe[] groups, int[] gstates)`

- Description: TODO

<a id="member-17"></a>
##### `group(int g)`

- Description: TODO

<a id="member-18"></a>
##### `gstate(int id)`

- Description: TODO

<a id="member-19"></a>
##### `nstates()`

- Description: TODO

<a id="member-20"></a>
##### `toString()`

- Description: TODO

<a id="member-26"></a>
##### `alloc(int idx)`

- Description: TODO

<a id="member-27"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-28"></a>
##### `hashCode()`

- Description: TODO

<a id="member-29"></a>
##### `intern()`

- Description: TODO

<a id="member-30"></a>
##### `defdiff(DepInfo that)`

- Description: TODO

<a id="member-31"></a>
##### `toString()`

- Description: TODO

<a id="member-35"></a>
##### `DepPipe(Pipe parent)`

- Description: TODO

<a id="member-36"></a>
##### `prep(Pipe.Op op)`

- Description: TODO

<a id="member-37"></a>
##### `lock()`

- Description: TODO

<a id="member-38"></a>
##### `get(State.Slot<T> slot)`

- Description: TODO

<a id="member-39"></a>
##### `put(State.Slot<? super T> slot, T state)`

- Description: TODO

<a id="member-40"></a>
##### `copy()`

- Description: TODO

<a id="member-41"></a>
##### `states()`

- Description: TODO

<a id="member-44"></a>
##### `StaticPipe(DepInfo bk)`

- Description: TODO

<a id="member-45"></a>
##### `get(DepInfo bk)`

- Description: TODO

<a id="member-46"></a>
##### `get(State.Slot<T> slot)`

- Description: TODO

<a id="member-47"></a>
##### `copy()`

- Description: TODO

<a id="member-48"></a>
##### `states()`

- Description: TODO

<a id="member-49"></a>
##### `public Slot add(Node n, Pipe.Op state);`

- Description: TODO

<a id="member-50"></a>
##### `add(Node n)`

- Description: TODO

<a id="member-51"></a>
##### `public void remove();`

- Description: TODO

<a id="member-52"></a>
##### `public void clear();`

- Description: TODO

<a id="member-53"></a>
##### `public void cstate(Pipe.Op state);`

- Description: TODO

<a id="member-54"></a>
##### `public void ostate(Pipe.Op state);`

- Description: TODO

<a id="member-55"></a>
##### `public Slot parent();`

- Description: TODO

<a id="member-56"></a>
##### `public void update();`

- Description: TODO

<a id="member-57"></a>
##### `lockstate()`

- Description: TODO

<a id="member-59"></a>
##### `SlotRemoved(String message, TreeSlot slot)`

- Description: TODO

<a id="member-60"></a>
##### `SlotRemoved(TreeSlot slot)`

- Description: TODO

<a id="member-73"></a>
##### `TreeSlot(RenderTree tree, TreeSlot parent, Node node)`

- Description: TODO

<a id="member-74"></a>
##### `addch(TreeSlot ch)`

- Description: TODO

<a id="member-75"></a>
##### `removech(TreeSlot ch)`

- Description: TODO

<a id="member-76"></a>
##### `children()`

- Description: TODO

<a id="member-77"></a>
##### `parent()`

- Description: TODO

<a id="member-78"></a>
##### `add(Node n, Pipe.Op state)`

- Description: TODO

<a id="member-79"></a>
##### `clear()`

- Description: TODO

<a id="member-80"></a>
##### `remove()`

- Description: TODO

<a id="member-81"></a>
##### `mkdstate(Pipe.Op cstate, Pipe.Op ostate)`

- Description: TODO

<a id="member-82"></a>
##### `remrdep(int stidx, TreeSlot rdep)`

- Description: TODO

<a id="member-83"></a>
##### `addrdep(int stidx, TreeSlot rdep)`

- Description: TODO

<a id="member-84"></a>
##### `adddep(int stidx, TreeSlot dep)`

- Description: TODO

<a id="member-85"></a>
##### `rdepupd()`

- Description: TODO

<a id="member-86"></a>
##### `setdstate(DepInfo nst)`

- Description: TODO

<a id="member-87"></a>
##### `upddstate(DepInfo nst)`

- Description: TODO

<a id="member-88"></a>
##### `updtotal(boolean setds)`

- Description: TODO

<a id="member-89"></a>
##### `dstate()`

- Description: TODO

<a id="member-90"></a>
##### `checklockdeps()`

- Description: TODO

<a id="member-91"></a>
##### `lockstate()`

- Description: TODO

<a id="member-92"></a>
##### `chstate(Pipe.Op cstate, Pipe.Op ostate)`

- Description: TODO

<a id="member-93"></a>
##### `cstate(Pipe.Op state)`

- Description: TODO

<a id="member-94"></a>
##### `ostate(Pipe.Op state)`

- Description: TODO

<a id="member-95"></a>
##### `update()`

- Description: TODO

<a id="member-96"></a>
##### `get(State.Slot<T> slot)`

- Description: TODO

<a id="member-97"></a>
##### `copy()`

- Description: TODO

<a id="member-98"></a>
##### `states()`

- Description: TODO

<a id="member-99"></a>
##### `toString()`

- Description: TODO

<a id="member-101"></a>
##### `pdstate()`

- Description: TODO

<a id="member-103"></a>
##### `istate()`

- Description: TODO

<a id="member-104"></a>
##### `obj()`

- Description: TODO

<a id="member-105"></a>
##### `state()`

- Description: TODO

<a id="member-106"></a>
##### `toString()`

- Description: TODO

<a id="member-107"></a>
##### `added(Slot slot)`

- Description: TODO

<a id="member-108"></a>
##### `removed(Slot slot)`

- Description: TODO

<a id="member-110"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-111"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-112"></a>
##### `toString()`

- Description: TODO

<a id="member-114"></a>
##### `slots()`

- Description: TODO

<a id="member-115"></a>
##### `add(Node n, Pipe.Op state)`

- Description: TODO

<a id="member-116"></a>
##### `add(Node n)`

- Description: TODO

<a id="member-117"></a>
##### `add(RenderList<R> list, Class<? extends R> type)`

- Description: TODO

<a id="member-118"></a>
##### `remove(RenderList<?> list)`

- Description: TODO

<a id="member-119"></a>
##### `dispose()`

- Description: TODO

<a id="member-120"></a>
##### `dump(TreeSlot slot, int ind)`

- Description: TODO

<a id="member-121"></a>
##### `dump()`

- Description: TODO

<a id="member-122"></a>
##### `stats()`

- Description: TODO
