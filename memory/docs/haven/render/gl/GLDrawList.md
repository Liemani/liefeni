# GLDrawList

## Meta

- Source: [GLDrawList.java](../../../../../src/haven/render/gl/GLDrawList.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a GL draw list.

## Code Members

### Member Index

#### Fields

- [idx_vao](#member-1)
- [idx_fbo](#member-2)
- [idx_pst](#member-3)
- [idx_uni](#member-4)
- [env](#member-5)
- [desc](#member-6)
- [settings](#member-7)
- [slotmap](#member-8)
- [psettings](#member-9)
- [orderidx](#member-10)
- [settingbuf](#member-11)
- [root](#member-12)
- [disposed](#member-13)
- [order](#member-18)
- [uniqid](#member-19)
- [sortid](#member-20)
- [tp](#member-21)
- [tl](#member-22)
- [tr](#member-23)
- [th](#member-24)
- [tsubsize](#member-25)
- [bk](#member-34)
- [prog](#member-35)
- [settings](#member-36)
- [compiled](#member-37)
- [main](#member-38)
- [gorder](#member-39)
- [ordersrc](#member-40)
- [disposed](#member-41)
- [prog](#member-52)
- [vid](#member-53)
- [depid_1](#member-54)
- [depid_v](#member-55)
- [gl](#member-62)
- [key](#member-66)
- [rc](#member-67)
- [depmask_1](#member-70)
- [depmask_v](#member-71)
- [prog](#member-81)
- [setting](#member-86)
- [prog](#member-92)
- [var](#member-93)
- [vref](#member-94)
- [st](#member-100)
- [vaos](#member-104)
- [vao_nil](#member-106)
- [slot](#member-107)
- [done](#member-108)
- [got](#member-124)
- [expected](#member-125)
- [pdump](#member-126)
- [lck](#member-134)

#### Methods

- [btheight(DrawSlot s)](#member-14)
- [btsubsize(DrawSlot s)](#member-15)
- [setp(DrawSlot s, DrawSlot p)](#member-16)
- [first()](#member-17)
- [prev()](#member-26)
- [next()](#member-27)
- [setheight()](#member-28)
- [bbtrl()](#member-29)
- [bbtrr()](#member-30)
- [insert(DrawSlot child)](#member-31)
- [tinsert()](#member-32)
- [tremove()](#member-33)
- [progfor(Slot<? extends Rendered> sl)](#member-42)
- [getsettings()](#member-43)
- [glupdate(DrawSlot prev)](#member-44)
- [orderreg()](#member-45)
- [orderunreg()](#member-46)
- [orderupdate()](#member-47)
- [DrawSlot(Slot<? extends Rendered> bk)](#member-48)
- [insert()](#member-49)
- [remove()](#member-50)
- [dispose()](#member-51)
- [SettingKey(GLProgram prog, Object vid, Pipe... depid)](#member-56)
- [ndeps()](#member-57)
- [hashCode()](#member-58)
- [equals(Object o)](#member-59)
- [nidx(GroupPipe st, int idx)](#member-60)
- [makedepid(GroupPipe state, Collection<State.Slot<?>> deps)](#member-61)
- [abstract void compile(BGL gl);](#member-63)
- [update()](#member-64)
- [put()](#member-65)
- [DepSetting(SettingKey key)](#member-68)
- [abstract State.Slot[] depslots();](#member-69)
- [ckupdate(int[] mask)](#member-72)
- [compstate()](#member-73)
- [put()](#member-74)
- [del()](#member-75)
- [delsettingp(DepSetting set, Pipe dp)](#member-76)
- [delsetting(DepSetting set)](#member-77)
- [addsettingp(DepSetting set, Pipe dp)](#member-78)
- [addsetting(DepSetting set)](#member-79)
- [progfslots(GLProgram prog)](#member-80)
- [FrameSetting(SettingKey key)](#member-82)
- [compile(BGL gl)](#member-83)
- [depslots()](#member-84)
- [getframe(GLProgram prog, GroupPipe state)](#member-85)
- [PipeSetting(SettingKey key, GLPipeState<T> setting)](#member-87)
- [compile(BGL gl)](#member-88)
- [depslots()](#member-89)
- [toString()](#member-90)
- [getpipest(GLPipeState<?> pst, GroupPipe state)](#member-91)
- [UniformSetting(SettingKey key)](#member-95)
- [compile(BGL gl)](#member-96)
- [depslots()](#member-97)
- [del()](#member-98)
- [getuniform(GLProgram prog, Uniform var, GroupPipe state)](#member-99)
- [VaoSetting(GLVertexArray vao, GLBuffer ebo)](#member-101)
- [compile(BGL gl)](#member-102)
- [put()](#member-103)
- [getvao(GLVertexArray vao, GLBuffer ebo)](#member-105)
- [SlotRender(DrawSlot slot)](#member-109)
- [env()](#member-110)
- [draw(Pipe st, Model mod)](#member-111)
- [submit(Render sub)](#member-112)
- [clear(Pipe pipe, FragData buf, FColor val)](#member-113)
- [clear(Pipe pipe, double val)](#member-114)
- [pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)](#member-115)
- [pget(Texture.Image img, VectorFormat fmt, ByteBuffer dst, Consumer<ByteBuffer> callback)](#member-116)
- [timestamp(Consumer<Long> callback)](#member-117)
- [fence(Runnable callback)](#member-118)
- [update(T buf, DataBuffer.PartFiller<? super T> data, int from, int to)](#member-119)
- [update(T buf, DataBuffer.Filler<? super T> data)](#member-120)
- [dispose()](#member-121)
- [verify(DrawSlot t)](#member-122)
- [verify()](#member-123)
- [ProgramMismatchException(GLProgram got, GLProgram expected)](#member-127)
- [draw(Render r)](#member-128)
- [add(Slot<? extends Rendered> slot)](#member-129)
- [remove(Slot<? extends Rendered> slot)](#member-130)
- [update(Slot<? extends Rendered> slot)](#member-131)
- [orderupdate(Pipe group)](#member-132)
- [update(Pipe group, int[] mask)](#member-133)
- [dispose()](#member-135)
- [treedump(java.io.PrintWriter out, DrawSlot slot)](#member-136)
- [treedump(DrawSlot root)](#member-137)
- [treedump()](#member-138)
- [stats()](#member-139)
- [toString()](#member-140)
- [desc(Object desc)](#member-141)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `idx_vao`

- Description: TODO

<a id="member-2"></a>
##### `idx_fbo`

- Description: TODO

<a id="member-3"></a>
##### `idx_pst`

- Description: TODO

<a id="member-4"></a>
##### `idx_uni`

- Description: TODO

<a id="member-5"></a>
##### `env`

- Description: TODO

<a id="member-6"></a>
##### `desc`

- Description: TODO

<a id="member-7"></a>
##### `settings`

- Description: TODO

<a id="member-8"></a>
##### `slotmap`

- Description: TODO

<a id="member-9"></a>
##### `psettings`

- Description: TODO

<a id="member-10"></a>
##### `orderidx`

- Description: TODO

<a id="member-11"></a>
##### `settingbuf`

- Description: TODO

<a id="member-12"></a>
##### `root`

- Description: TODO

<a id="member-13"></a>
##### `disposed`

- Description: TODO

<a id="member-18"></a>
##### `order`

- Description: TODO

<a id="member-19"></a>
##### `uniqid`

- Description: TODO

<a id="member-20"></a>
##### `sortid`

- Description: TODO

<a id="member-21"></a>
##### `tp`

- Description: TODO

<a id="member-22"></a>
##### `tl`

- Description: TODO

<a id="member-23"></a>
##### `tr`

- Description: TODO

<a id="member-24"></a>
##### `th`

- Description: TODO

<a id="member-25"></a>
##### `tsubsize`

- Description: TODO

<a id="member-34"></a>
##### `bk`

- Description: TODO

<a id="member-35"></a>
##### `prog`

- Description: TODO

<a id="member-36"></a>
##### `settings`

- Description: TODO

<a id="member-37"></a>
##### `compiled`

- Description: TODO

<a id="member-38"></a>
##### `main`

- Description: TODO

<a id="member-39"></a>
##### `gorder`

- Description: TODO

<a id="member-40"></a>
##### `ordersrc`

- Description: TODO

<a id="member-41"></a>
##### `disposed`

- Description: TODO

<a id="member-52"></a>
##### `prog`

- Description: TODO

<a id="member-53"></a>
##### `vid`

- Description: TODO

<a id="member-54"></a>
##### `depid_1`

- Description: TODO

<a id="member-55"></a>
##### `depid_v`

- Description: TODO

<a id="member-62"></a>
##### `gl`

- Description: TODO

<a id="member-66"></a>
##### `key`

- Description: TODO

<a id="member-67"></a>
##### `rc`

- Description: TODO

<a id="member-70"></a>
##### `depmask_1`

- Description: TODO

<a id="member-71"></a>
##### `depmask_v`

- Description: TODO

<a id="member-81"></a>
##### `prog`

- Description: TODO

<a id="member-86"></a>
##### `setting`

- Description: TODO

<a id="member-92"></a>
##### `prog`

- Description: TODO

<a id="member-93"></a>
##### `var`

- Description: TODO

<a id="member-94"></a>
##### `vref`

- Description: TODO

<a id="member-100"></a>
##### `st`

- Description: TODO

<a id="member-104"></a>
##### `vaos`

- Description: TODO

<a id="member-106"></a>
##### `vao_nil`

- Description: TODO

<a id="member-107"></a>
##### `slot`

- Description: TODO

<a id="member-108"></a>
##### `done`

- Description: TODO

<a id="member-124"></a>
##### `got`

- Description: TODO

<a id="member-125"></a>
##### `expected`

- Description: TODO

<a id="member-126"></a>
##### `pdump`

- Description: TODO

<a id="member-134"></a>
##### `lck`

- Description: TODO

#### Methods

<a id="member-14"></a>
##### `btheight(DrawSlot s)`

- Description: TODO

<a id="member-15"></a>
##### `btsubsize(DrawSlot s)`

- Description: TODO

<a id="member-16"></a>
##### `setp(DrawSlot s, DrawSlot p)`

- Description: TODO

<a id="member-17"></a>
##### `first()`

- Description: TODO

<a id="member-26"></a>
##### `prev()`

- Description: TODO

<a id="member-27"></a>
##### `next()`

- Description: TODO

<a id="member-28"></a>
##### `setheight()`

- Description: TODO

<a id="member-29"></a>
##### `bbtrl()`

- Description: TODO

<a id="member-30"></a>
##### `bbtrr()`

- Description: TODO

<a id="member-31"></a>
##### `insert(DrawSlot child)`

- Description: TODO

<a id="member-32"></a>
##### `tinsert()`

- Description: TODO

<a id="member-33"></a>
##### `tremove()`

- Description: TODO

<a id="member-42"></a>
##### `progfor(Slot<? extends Rendered> sl)`

- Description: TODO

<a id="member-43"></a>
##### `getsettings()`

- Description: TODO

<a id="member-44"></a>
##### `glupdate(DrawSlot prev)`

- Description: TODO

<a id="member-45"></a>
##### `orderreg()`

- Description: TODO

<a id="member-46"></a>
##### `orderunreg()`

- Description: TODO

<a id="member-47"></a>
##### `orderupdate()`

- Description: TODO

<a id="member-48"></a>
##### `DrawSlot(Slot<? extends Rendered> bk)`

- Description: TODO

<a id="member-49"></a>
##### `insert()`

- Description: TODO

<a id="member-50"></a>
##### `remove()`

- Description: TODO

<a id="member-51"></a>
##### `dispose()`

- Description: TODO

<a id="member-56"></a>
##### `SettingKey(GLProgram prog, Object vid, Pipe... depid)`

- Description: TODO

<a id="member-57"></a>
##### `ndeps()`

- Description: TODO

<a id="member-58"></a>
##### `hashCode()`

- Description: TODO

<a id="member-59"></a>
##### `equals(Object o)`

- Description: TODO

<a id="member-60"></a>
##### `nidx(GroupPipe st, int idx)`

- Description: TODO

<a id="member-61"></a>
##### `makedepid(GroupPipe state, Collection<State.Slot<?>> deps)`

- Description: TODO

<a id="member-63"></a>
##### `abstract void compile(BGL gl);`

- Description: TODO

<a id="member-64"></a>
##### `update()`

- Description: TODO

<a id="member-65"></a>
##### `put()`

- Description: TODO

<a id="member-68"></a>
##### `DepSetting(SettingKey key)`

- Description: TODO

<a id="member-69"></a>
##### `abstract State.Slot[] depslots();`

- Description: TODO

<a id="member-72"></a>
##### `ckupdate(int[] mask)`

- Description: TODO

<a id="member-73"></a>
##### `compstate()`

- Description: TODO

<a id="member-74"></a>
##### `put()`

- Description: TODO

<a id="member-75"></a>
##### `del()`

- Description: TODO

<a id="member-76"></a>
##### `delsettingp(DepSetting set, Pipe dp)`

- Description: TODO

<a id="member-77"></a>
##### `delsetting(DepSetting set)`

- Description: TODO

<a id="member-78"></a>
##### `addsettingp(DepSetting set, Pipe dp)`

- Description: TODO

<a id="member-79"></a>
##### `addsetting(DepSetting set)`

- Description: TODO

<a id="member-80"></a>
##### `progfslots(GLProgram prog)`

- Description: TODO

<a id="member-82"></a>
##### `FrameSetting(SettingKey key)`

- Description: TODO

<a id="member-83"></a>
##### `compile(BGL gl)`

- Description: TODO

<a id="member-84"></a>
##### `depslots()`

- Description: TODO

<a id="member-85"></a>
##### `getframe(GLProgram prog, GroupPipe state)`

- Description: TODO

<a id="member-87"></a>
##### `PipeSetting(SettingKey key, GLPipeState<T> setting)`

- Description: TODO

<a id="member-88"></a>
##### `compile(BGL gl)`

- Description: TODO

<a id="member-89"></a>
##### `depslots()`

- Description: TODO

<a id="member-90"></a>
##### `toString()`

- Description: TODO

<a id="member-91"></a>
##### `getpipest(GLPipeState<?> pst, GroupPipe state)`

- Description: TODO

<a id="member-95"></a>
##### `UniformSetting(SettingKey key)`

- Description: TODO

<a id="member-96"></a>
##### `compile(BGL gl)`

- Description: TODO

<a id="member-97"></a>
##### `depslots()`

- Description: TODO

<a id="member-98"></a>
##### `del()`

- Description: TODO

<a id="member-99"></a>
##### `getuniform(GLProgram prog, Uniform var, GroupPipe state)`

- Description: TODO

<a id="member-101"></a>
##### `VaoSetting(GLVertexArray vao, GLBuffer ebo)`

- Description: TODO

<a id="member-102"></a>
##### `compile(BGL gl)`

- Description: TODO

<a id="member-103"></a>
##### `put()`

- Description: TODO

<a id="member-105"></a>
##### `getvao(GLVertexArray vao, GLBuffer ebo)`

- Description: TODO

<a id="member-109"></a>
##### `SlotRender(DrawSlot slot)`

- Description: TODO

<a id="member-110"></a>
##### `env()`

- Description: TODO

<a id="member-111"></a>
##### `draw(Pipe st, Model mod)`

- Description: TODO

<a id="member-112"></a>
##### `submit(Render sub)`

- Description: TODO

<a id="member-113"></a>
##### `clear(Pipe pipe, FragData buf, FColor val)`

- Description: TODO

<a id="member-114"></a>
##### `clear(Pipe pipe, double val)`

- Description: TODO

<a id="member-115"></a>
##### `pget(Pipe pipe, FragData buf, Area area, VectorFormat fmt, ByteBuffer dstbuf, Consumer<ByteBuffer> callback)`

- Description: TODO

<a id="member-116"></a>
##### `pget(Texture.Image img, VectorFormat fmt, ByteBuffer dst, Consumer<ByteBuffer> callback)`

- Description: TODO

<a id="member-117"></a>
##### `timestamp(Consumer<Long> callback)`

- Description: TODO

<a id="member-118"></a>
##### `fence(Runnable callback)`

- Description: TODO

<a id="member-119"></a>
##### `update(T buf, DataBuffer.PartFiller<? super T> data, int from, int to)`

- Description: TODO

<a id="member-120"></a>
##### `update(T buf, DataBuffer.Filler<? super T> data)`

- Description: TODO

<a id="member-121"></a>
##### `dispose()`

- Description: TODO

<a id="member-122"></a>
##### `verify(DrawSlot t)`

- Description: TODO

<a id="member-123"></a>
##### `verify()`

- Description: TODO

<a id="member-127"></a>
##### `ProgramMismatchException(GLProgram got, GLProgram expected)`

- Description: TODO

<a id="member-128"></a>
##### `draw(Render r)`

- Description: TODO

<a id="member-129"></a>
##### `add(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-130"></a>
##### `remove(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-131"></a>
##### `update(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-132"></a>
##### `orderupdate(Pipe group)`

- Description: TODO

<a id="member-133"></a>
##### `update(Pipe group, int[] mask)`

- Description: TODO

<a id="member-135"></a>
##### `dispose()`

- Description: TODO

<a id="member-136"></a>
##### `treedump(java.io.PrintWriter out, DrawSlot slot)`

- Description: TODO

<a id="member-137"></a>
##### `treedump(DrawSlot root)`

- Description: TODO

<a id="member-138"></a>
##### `treedump()`

- Description: TODO

<a id="member-139"></a>
##### `stats()`

- Description: TODO

<a id="member-140"></a>
##### `toString()`

- Description: TODO

<a id="member-141"></a>
##### `desc(Object desc)`

- Description: TODO
