# ShadowMap

## Meta

- Source: [ShadowMap.java](../../../src/haven/ShadowMap.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents shadow map state.

## Code Members

### Member Index

#### Fields

- [smap](#member-1)
- [maskshadow](#member-2)
- [lbuf](#member-3)
- [lsamp](#member-4)
- [lproj](#member-5)
- [basic](#member-6)
- [light](#member-7)
- [lcam](#member-8)
- [curbasic](#member-9)
- [texbias](#member-10)
- [shadowbasic](#member-13)
- [master](#member-14)
- [basic](#member-15)
- [slots](#member-16)
- [back](#member-17)
- [curbasic](#member-18)
- [idx_bas](#member-20)
- [idx_back](#member-21)
- [bk](#member-22)
- [txf](#member-45)
- [sl](#member-46)
- [map](#member-47)
- [stc](#member-48)
- [shcalc](#member-49)
- [id](#member-50)
- [interned](#member-55)
- [shader](#member-57)

#### Methods

- [cons(Material.Buffer buf, Object... args)](#member-11)
- [dispose()](#member-12)
- [ShadowList(RenderList.Adapter master)](#member-19)
- [Shadowslot(Slot<? extends Rendered> bk)](#member-23)
- [obj()](#member-24)
- [state()](#member-25)
- [group(int idx)](#member-26)
- [gstate(int id)](#member-27)
- [nstates()](#member-28)
- [add(Slot<? extends Rendered> slot)](#member-29)
- [remove(Slot<? extends Rendered> slot)](#member-30)
- [update(Slot<? extends Rendered> slot)](#member-31)
- [update(Pipe group, int[] statemask)](#member-32)
- [lock()](#member-33)
- [slots()](#member-34)
- [add(RenderList<R> list, Class<? extends R> type)](#member-35)
- [remove(RenderList<?> list)](#member-36)
- [basic(Pipe.Op st)](#member-37)
- [draw(Render out)](#member-38)
- [dispose()](#member-39)
- [light(DirLight light)](#member-40)
- [haspos()](#member-41)
- [setpos(Coord3f base, Coord3f dir)](#member-42)
- [update(Render out, ShadowList data)](#member-43)
- [apply(Pipe buf)](#member-44)
- [Shader(double xd, double yd, int res, double thr)](#member-51)
- [modify(ProgramContext prog)](#member-52)
- [hashCode()](#member-53)
- [equals(Object that)](#member-54)
- [get(double xd, double yd, int res, double thr)](#member-56)
- [shader()](#member-58)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `smap`

- Description: TODO

<a id="member-2"></a>
##### `maskshadow`

- Description: TODO

<a id="member-3"></a>
##### `lbuf`

- Description: TODO

<a id="member-4"></a>
##### `lsamp`

- Description: TODO

<a id="member-5"></a>
##### `lproj`

- Description: TODO

<a id="member-6"></a>
##### `basic`

- Description: TODO

<a id="member-7"></a>
##### `light`

- Description: TODO

<a id="member-8"></a>
##### `lcam`

- Description: TODO

<a id="member-9"></a>
##### `curbasic`

- Description: TODO

<a id="member-10"></a>
##### `texbias`

- Description: TODO

<a id="member-13"></a>
##### `shadowbasic`

- Description: TODO

<a id="member-14"></a>
##### `master`

- Description: TODO

<a id="member-15"></a>
##### `basic`

- Description: TODO

<a id="member-16"></a>
##### `slots`

- Description: TODO

<a id="member-17"></a>
##### `back`

- Description: TODO

<a id="member-18"></a>
##### `curbasic`

- Description: TODO

<a id="member-20"></a>
##### `idx_bas`

- Description: TODO

<a id="member-21"></a>
##### `idx_back`

- Description: TODO

<a id="member-22"></a>
##### `bk`

- Description: TODO

<a id="member-45"></a>
##### `txf`

- Description: TODO

<a id="member-46"></a>
##### `sl`

- Description: TODO

<a id="member-47"></a>
##### `map`

- Description: TODO

<a id="member-48"></a>
##### `stc`

- Description: TODO

<a id="member-49"></a>
##### `shcalc`

- Description: TODO

<a id="member-50"></a>
##### `id`

- Description: TODO

<a id="member-55"></a>
##### `interned`

- Description: TODO

<a id="member-57"></a>
##### `shader`

- Description: TODO

#### Methods

<a id="member-11"></a>
##### `cons(Material.Buffer buf, Object... args)`

- Description: TODO

<a id="member-12"></a>
##### `dispose()`

- Description: TODO

<a id="member-19"></a>
##### `ShadowList(RenderList.Adapter master)`

- Description: TODO

<a id="member-23"></a>
##### `Shadowslot(Slot<? extends Rendered> bk)`

- Description: TODO

<a id="member-24"></a>
##### `obj()`

- Description: TODO

<a id="member-25"></a>
##### `state()`

- Description: TODO

<a id="member-26"></a>
##### `group(int idx)`

- Description: TODO

<a id="member-27"></a>
##### `gstate(int id)`

- Description: TODO

<a id="member-28"></a>
##### `nstates()`

- Description: TODO

<a id="member-29"></a>
##### `add(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-30"></a>
##### `remove(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-31"></a>
##### `update(Slot<? extends Rendered> slot)`

- Description: TODO

<a id="member-32"></a>
##### `update(Pipe group, int[] statemask)`

- Description: TODO

<a id="member-33"></a>
##### `lock()`

- Description: TODO

<a id="member-34"></a>
##### `slots()`

- Description: TODO

<a id="member-35"></a>
##### `add(RenderList<R> list, Class<? extends R> type)`

- Description: TODO

<a id="member-36"></a>
##### `remove(RenderList<?> list)`

- Description: TODO

<a id="member-37"></a>
##### `basic(Pipe.Op st)`

- Description: TODO

<a id="member-38"></a>
##### `draw(Render out)`

- Description: TODO

<a id="member-39"></a>
##### `dispose()`

- Description: TODO

<a id="member-40"></a>
##### `light(DirLight light)`

- Description: TODO

<a id="member-41"></a>
##### `haspos()`

- Description: TODO

<a id="member-42"></a>
##### `setpos(Coord3f base, Coord3f dir)`

- Description: TODO

<a id="member-43"></a>
##### `update(Render out, ShadowList data)`

- Description: TODO

<a id="member-44"></a>
##### `apply(Pipe buf)`

- Description: TODO

<a id="member-51"></a>
##### `Shader(double xd, double yd, int res, double thr)`

- Description: TODO

<a id="member-52"></a>
##### `modify(ProgramContext prog)`

- Description: TODO

<a id="member-53"></a>
##### `hashCode()`

- Description: TODO

<a id="member-54"></a>
##### `equals(Object that)`

- Description: TODO

<a id="member-56"></a>
##### `get(double xd, double yd, int res, double thr)`

- Description: TODO

<a id="member-58"></a>
##### `shader()`

- Description: TODO
