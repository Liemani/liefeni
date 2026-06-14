# ActAudio

## Meta

- Source: [ActAudio.java](../../../src/haven/ActAudio.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Handles action-triggered audio playback.

## Code Members

### Member Index

#### Fields

- [audio](#member-1)
- [pos](#member-2)
- [amb](#member-3)
- [global](#member-4)
- [parent](#member-11)
- [clips](#member-12)
- [name](#member-18)
- [volume](#member-19)
- [volc](#member-20)
- [mixer](#member-21)
- [aui](#member-29)
- [pos](#member-30)
- [amb](#member-31)
- [clip](#member-36)
- [slots](#member-37)
- [res](#member-44)
- [bvol](#member-45)
- [res](#member-48)
- [clip](#member-49)
- [active](#member-50)
- [lastupd](#member-51)
- [added](#member-52)
- [hasvol](#member-53)

#### Methods

- [shader()](#member-5)
- [apply(Pipe st)](#member-6)
- [public void add(CS clip);](#member-7)
- [public void remove(CS clip);](#member-8)
- [public void clear();](#member-9)
- [public int size();](#member-10)
- [Adapter(Channel parent)](#member-13)
- [add(CS clip)](#member-14)
- [remove(CS clip)](#member-15)
- [clear()](#member-16)
- [size()](#member-17)
- [RootChannel(String name)](#member-22)
- [mixer()](#member-23)
- [setvolume(double volume)](#member-24)
- [clear()](#member-25)
- [add(CS clip)](#member-26)
- [remove(CS clip)](#member-27)
- [size()](#member-28)
- [clear()](#member-32)
- [stats()](#member-33)
- [public boolean cycle(ActAudio list);](#member-34)
- [spos(Pipe st)](#member-35)
- [PosClip(VolAdjust clip)](#member-38)
- [PosClip(CS clip)](#member-39)
- [added(RenderTree.Slot slot)](#member-40)
- [removed(RenderTree.Slot slot)](#member-41)
- [ticker()](#member-42)
- [autotick(double dt)](#member-43)
- [Ambience(Resource res, double bvol)](#member-46)
- [Ambience(Resource res)](#member-47)
- [Glob(Resource res)](#member-54)
- [hashCode()](#member-55)
- [equals(Object other)](#member-56)
- [curvol()](#member-57)
- [cycle(ActAudio list)](#member-58)
- [add(RenderList.Slot<Ambience> slot)](#member-59)
- [remove(RenderList.Slot<Ambience> slot)](#member-60)
- [added(RenderTree.Slot slot)](#member-61)
- [removed(RenderTree.Slot slot)](#member-62)
- [intern(T glob)](#member-63)
- [cycle()](#member-64)
- [clear()](#member-65)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `audio`

- Description: TODO

<a id="member-2"></a>
##### `pos`

- Description: TODO

<a id="member-3"></a>
##### `amb`

- Description: TODO

<a id="member-4"></a>
##### `global`

- Description: TODO

<a id="member-11"></a>
##### `parent`

- Description: TODO

<a id="member-12"></a>
##### `clips`

- Description: TODO

<a id="member-18"></a>
##### `name`

- Description: TODO

<a id="member-19"></a>
##### `volume`

- Description: TODO

<a id="member-20"></a>
##### `volc`

- Description: TODO

<a id="member-21"></a>
##### `mixer`

- Description: TODO

<a id="member-29"></a>
##### `aui`

- Description: TODO

<a id="member-30"></a>
##### `pos`

- Description: TODO

<a id="member-31"></a>
##### `amb`

- Description: TODO

<a id="member-36"></a>
##### `clip`

- Description: TODO

<a id="member-37"></a>
##### `slots`

- Description: TODO

<a id="member-44"></a>
##### `res`

- Description: TODO

<a id="member-45"></a>
##### `bvol`

- Description: TODO

<a id="member-48"></a>
##### `res`

- Description: TODO

<a id="member-49"></a>
##### `clip`

- Description: TODO

<a id="member-50"></a>
##### `active`

- Description: TODO

<a id="member-51"></a>
##### `lastupd`

- Description: TODO

<a id="member-52"></a>
##### `added`

- Description: TODO

<a id="member-53"></a>
##### `hasvol`

- Description: TODO

#### Methods

<a id="member-5"></a>
##### `shader()`

- Description: TODO

<a id="member-6"></a>
##### `apply(Pipe st)`

- Description: TODO

<a id="member-7"></a>
##### `public void add(CS clip);`

- Description: TODO

<a id="member-8"></a>
##### `public void remove(CS clip);`

- Description: TODO

<a id="member-9"></a>
##### `public void clear();`

- Description: TODO

<a id="member-10"></a>
##### `public int size();`

- Description: TODO

<a id="member-13"></a>
##### `Adapter(Channel parent)`

- Description: TODO

<a id="member-14"></a>
##### `add(CS clip)`

- Description: TODO

<a id="member-15"></a>
##### `remove(CS clip)`

- Description: TODO

<a id="member-16"></a>
##### `clear()`

- Description: TODO

<a id="member-17"></a>
##### `size()`

- Description: TODO

<a id="member-22"></a>
##### `RootChannel(String name)`

- Description: TODO

<a id="member-23"></a>
##### `mixer()`

- Description: TODO

<a id="member-24"></a>
##### `setvolume(double volume)`

- Description: TODO

<a id="member-25"></a>
##### `clear()`

- Description: TODO

<a id="member-26"></a>
##### `add(CS clip)`

- Description: TODO

<a id="member-27"></a>
##### `remove(CS clip)`

- Description: TODO

<a id="member-28"></a>
##### `size()`

- Description: TODO

<a id="member-32"></a>
##### `clear()`

- Description: TODO

<a id="member-33"></a>
##### `stats()`

- Description: TODO

<a id="member-34"></a>
##### `public boolean cycle(ActAudio list);`

- Description: TODO

<a id="member-35"></a>
##### `spos(Pipe st)`

- Description: TODO

<a id="member-38"></a>
##### `PosClip(VolAdjust clip)`

- Description: TODO

<a id="member-39"></a>
##### `PosClip(CS clip)`

- Description: TODO

<a id="member-40"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-41"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-42"></a>
##### `ticker()`

- Description: TODO

<a id="member-43"></a>
##### `autotick(double dt)`

- Description: TODO

<a id="member-46"></a>
##### `Ambience(Resource res, double bvol)`

- Description: TODO

<a id="member-47"></a>
##### `Ambience(Resource res)`

- Description: TODO

<a id="member-54"></a>
##### `Glob(Resource res)`

- Description: TODO

<a id="member-55"></a>
##### `hashCode()`

- Description: TODO

<a id="member-56"></a>
##### `equals(Object other)`

- Description: TODO

<a id="member-57"></a>
##### `curvol()`

- Description: TODO

<a id="member-58"></a>
##### `cycle(ActAudio list)`

- Description: TODO

<a id="member-59"></a>
##### `add(RenderList.Slot<Ambience> slot)`

- Description: TODO

<a id="member-60"></a>
##### `remove(RenderList.Slot<Ambience> slot)`

- Description: TODO

<a id="member-61"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-62"></a>
##### `removed(RenderTree.Slot slot)`

- Description: TODO

<a id="member-63"></a>
##### `intern(T glob)`

- Description: TODO

<a id="member-64"></a>
##### `cycle()`

- Description: TODO

<a id="member-65"></a>
##### `clear()`

- Description: TODO
