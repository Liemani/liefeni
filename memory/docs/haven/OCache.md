# OCache

## Meta

- Source: [OCache.java](../../../src/haven/OCache.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Caches world gobs and object state.

## Code Members

### Member Index

#### Constants

- [OD_REM](#member-1)
- [OD_MOVE](#member-2)
- [OD_RES](#member-3)
- [OD_LINBEG](#member-4)
- [OD_LINSTEP](#member-5)
- [OD_SPEECH](#member-6)
- [OD_COMPOSE](#member-7)
- [OD_ZOFF](#member-8)
- [OD_LUMIN](#member-9)
- [OD_AVATAR](#member-10)
- [OD_FOLLOW](#member-11)
- [OD_HOMING](#member-12)
- [OD_OVERLAY](#member-13)
- [OD_HEALTH](#member-14)
- [OD_CMPPOSE](#member-15)
- [OD_CMPMOD](#member-16)
- [OD_CMPEQU](#member-17)
- [OD_ICON](#member-18)
- [OD_RESATTR](#member-19)
- [OD_END](#member-20)

#### Fields

- [compodmap](#member-21)
- [posres](#member-22)
- [local](#member-23)
- [objs](#member-24)
- [glob](#member-25)
- [cbs](#member-26)
- [nextvirt](#member-39)
- [fc](#member-41)
- [deltas](#member-49)
- [res](#member-51)
- [sdt](#member-52)
- [id](#member-58)
- [pending](#member-59)
- [frame](#member-60)
- [nremoved](#member-61)
- [added](#member-62)
- [gremoved](#member-63)
- [virtual](#member-64)
- [gob](#member-65)
- [applier](#member-66)
- [netinfo](#member-70)
- [fl](#member-73)
- [frame](#member-74)
- [initframe](#member-75)
- [id](#member-76)
- [attrs](#member-77)
- [rem](#member-78)
- [old](#member-83)
- [_gobArray](#member-89)

#### Methods

- [public void added(Gob ob);](#member-27)
- [public void removed(Gob ob);](#member-28)
- [callback(ChangeCallback cb)](#member-29)
- [uncallback(ChangeCallback cb)](#member-30)
- [add(Gob ob)](#member-31)
- [remove(Gob ob)](#member-32)
- [ctick(double dt)](#member-33)
- [gtick(Render g)](#member-34)
- [iterator()](#member-35)
- [ladd(Collection<Gob> gob)](#member-36)
- [lrem(Collection<Gob> gob)](#member-37)
- [getgob(long id)](#member-38)
- [Virtual(Coord2d c, double a)](#member-40)
- [FixedPlace(Coord3f fc, double a)](#member-42)
- [FixedPlace()](#member-43)
- [getc()](#member-44)
- [getmapstate(Coord3f pc)](#member-45)
- [public void apply(Gob gob, AttrDelta msg);](#member-46)
- [getres(Gob gob, int id)](#member-47)
- [public int value();](#member-48)
- [apply(Gob g, AttrDelta msg)](#member-50)
- [OlSprite(Indir<Resource> res, byte[] sdt)](#member-53)
- [create(Sprite.Owner owner)](#member-54)
- [toString()](#member-55)
- [apply(Gob g, AttrDelta msg)](#member-56)
- [apply(Gob g, AttrDelta msg)](#member-57)
- [GobInfo(long id, int frame)](#member-67)
- [apply()](#member-68)
- [checkdirty(boolean interrupt)](#member-69)
- [netremove(long id, int frame)](#member-71)
- [netget(long id, int frame)](#member-72)
- [ObjDelta(int fl, long id, int frame)](#member-79)
- [ObjDelta(ObjDelta from)](#member-80)
- [ObjDelta()](#member-81)
- [clone()](#member-82)
- [AttrDelta(ObjDelta od, int type, byte[] blob)](#member-84)
- [AttrDelta(ObjDelta od, int type, Message blob, int len)](#member-85)
- [AttrDelta(AttrDelta from)](#member-86)
- [clone()](#member-87)
- [receive(ObjDelta delta)](#member-88)
- [gobArray()](#member-90)
- [_setGobArray(ArrayList<Gob> gobArray)](#member-91)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `OD_REM`

- Description: TODO

<a id="member-2"></a>
##### `OD_MOVE`

- Description: TODO

<a id="member-3"></a>
##### `OD_RES`

- Description: TODO

<a id="member-4"></a>
##### `OD_LINBEG`

- Description: TODO

<a id="member-5"></a>
##### `OD_LINSTEP`

- Description: TODO

<a id="member-6"></a>
##### `OD_SPEECH`

- Description: TODO

<a id="member-7"></a>
##### `OD_COMPOSE`

- Description: TODO

<a id="member-8"></a>
##### `OD_ZOFF`

- Description: TODO

<a id="member-9"></a>
##### `OD_LUMIN`

- Description: TODO

<a id="member-10"></a>
##### `OD_AVATAR`

- Description: TODO

<a id="member-11"></a>
##### `OD_FOLLOW`

- Description: TODO

<a id="member-12"></a>
##### `OD_HOMING`

- Description: TODO

<a id="member-13"></a>
##### `OD_OVERLAY`

- Description: TODO

<a id="member-14"></a>
##### `OD_HEALTH`

- Description: TODO

<a id="member-15"></a>
##### `OD_CMPPOSE`

- Description: TODO

<a id="member-16"></a>
##### `OD_CMPMOD`

- Description: TODO

<a id="member-17"></a>
##### `OD_CMPEQU`

- Description: TODO

<a id="member-18"></a>
##### `OD_ICON`

- Description: TODO

<a id="member-19"></a>
##### `OD_RESATTR`

- Description: TODO

<a id="member-20"></a>
##### `OD_END`

- Description: TODO

#### Fields

<a id="member-21"></a>
##### `compodmap`

- Description: TODO

<a id="member-22"></a>
##### `posres`

- Description: TODO

<a id="member-23"></a>
##### `local`

- Description: TODO

<a id="member-24"></a>
##### `objs`

- Description: TODO

<a id="member-25"></a>
##### `glob`

- Description: TODO

<a id="member-26"></a>
##### `cbs`

- Description: TODO

<a id="member-39"></a>
##### `nextvirt`

- Description: TODO

<a id="member-41"></a>
##### `fc`

- Description: TODO

<a id="member-49"></a>
##### `deltas`

- Description: TODO

<a id="member-51"></a>
##### `res`

- Description: TODO

<a id="member-52"></a>
##### `sdt`

- Description: TODO

<a id="member-58"></a>
##### `id`

- Description: TODO

<a id="member-59"></a>
##### `pending`

- Description: TODO

<a id="member-60"></a>
##### `frame`

- Description: TODO

<a id="member-61"></a>
##### `nremoved`

- Description: TODO

<a id="member-62"></a>
##### `added`

- Description: TODO

<a id="member-63"></a>
##### `gremoved`

- Description: TODO

<a id="member-64"></a>
##### `virtual`

- Description: TODO

<a id="member-65"></a>
##### `gob`

- Description: TODO

<a id="member-66"></a>
##### `applier`

- Description: TODO

<a id="member-70"></a>
##### `netinfo`

- Description: TODO

<a id="member-73"></a>
##### `fl`

- Description: TODO

<a id="member-74"></a>
##### `frame`

- Description: TODO

<a id="member-75"></a>
##### `initframe`

- Description: TODO

<a id="member-76"></a>
##### `id`

- Description: TODO

<a id="member-77"></a>
##### `attrs`

- Description: TODO

<a id="member-78"></a>
##### `rem`

- Description: TODO

<a id="member-83"></a>
##### `old`

- Description: TODO

<a id="member-89"></a>
##### `_gobArray`

- Description: TODO

#### Methods

<a id="member-27"></a>
##### `public void added(Gob ob);`

- Description: TODO

<a id="member-28"></a>
##### `public void removed(Gob ob);`

- Description: TODO

<a id="member-29"></a>
##### `callback(ChangeCallback cb)`

- Description: TODO

<a id="member-30"></a>
##### `uncallback(ChangeCallback cb)`

- Description: TODO

<a id="member-31"></a>
##### `add(Gob ob)`

- Description: TODO

<a id="member-32"></a>
##### `remove(Gob ob)`

- Description: TODO

<a id="member-33"></a>
##### `ctick(double dt)`

- Description: TODO

<a id="member-34"></a>
##### `gtick(Render g)`

- Description: TODO

<a id="member-35"></a>
##### `iterator()`

- Description: TODO

<a id="member-36"></a>
##### `ladd(Collection<Gob> gob)`

- Description: TODO

<a id="member-37"></a>
##### `lrem(Collection<Gob> gob)`

- Description: TODO

<a id="member-38"></a>
##### `getgob(long id)`

- Description: TODO

<a id="member-40"></a>
##### `Virtual(Coord2d c, double a)`

- Description: TODO

<a id="member-42"></a>
##### `FixedPlace(Coord3f fc, double a)`

- Description: TODO

<a id="member-43"></a>
##### `FixedPlace()`

- Description: TODO

<a id="member-44"></a>
##### `getc()`

- Description: TODO

<a id="member-45"></a>
##### `getmapstate(Coord3f pc)`

- Description: TODO

<a id="member-46"></a>
##### `public void apply(Gob gob, AttrDelta msg);`

- Description: TODO

<a id="member-47"></a>
##### `getres(Gob gob, int id)`

- Description: TODO

<a id="member-48"></a>
##### `public int value();`

- Description: TODO

<a id="member-50"></a>
##### `apply(Gob g, AttrDelta msg)`

- Description: TODO

<a id="member-53"></a>
##### `OlSprite(Indir<Resource> res, byte[] sdt)`

- Description: TODO

<a id="member-54"></a>
##### `create(Sprite.Owner owner)`

- Description: TODO

<a id="member-55"></a>
##### `toString()`

- Description: TODO

<a id="member-56"></a>
##### `apply(Gob g, AttrDelta msg)`

- Description: TODO

<a id="member-57"></a>
##### `apply(Gob g, AttrDelta msg)`

- Description: TODO

<a id="member-67"></a>
##### `GobInfo(long id, int frame)`

- Description: TODO

<a id="member-68"></a>
##### `apply()`

- Description: TODO

<a id="member-69"></a>
##### `checkdirty(boolean interrupt)`

- Description: TODO

<a id="member-71"></a>
##### `netremove(long id, int frame)`

- Description: TODO

<a id="member-72"></a>
##### `netget(long id, int frame)`

- Description: TODO

<a id="member-79"></a>
##### `ObjDelta(int fl, long id, int frame)`

- Description: TODO

<a id="member-80"></a>
##### `ObjDelta(ObjDelta from)`

- Description: TODO

<a id="member-81"></a>
##### `ObjDelta()`

- Description: TODO

<a id="member-82"></a>
##### `clone()`

- Description: TODO

<a id="member-84"></a>
##### `AttrDelta(ObjDelta od, int type, byte[] blob)`

- Description: TODO

<a id="member-85"></a>
##### `AttrDelta(ObjDelta od, int type, Message blob, int len)`

- Description: TODO

<a id="member-86"></a>
##### `AttrDelta(AttrDelta from)`

- Description: TODO

<a id="member-87"></a>
##### `clone()`

- Description: TODO

<a id="member-88"></a>
##### `receive(ObjDelta delta)`

- Description: TODO

<a id="member-90"></a>
##### `gobArray()`

- Description: TODO

<a id="member-91"></a>
##### `_setGobArray(ArrayList<Gob> gobArray)`

- Description: TODO
