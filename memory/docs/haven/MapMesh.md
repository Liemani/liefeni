# MapMesh

## Meta

- Source: [MapMesh.java](../../../src/haven/MapMesh.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents map mesh rendering data.

## Code Members

### Member Index

#### Fields

- [ul](#member-1)
- [sz](#member-2)
- [map](#member-3)
- [flat](#member-4)
- [rnd](#member-5)
- [data](#member-6)
- [extras](#member-7)
- [dparts](#member-8)
- [ul](#member-16)
- [sz](#member-17)
- [br](#member-18)
- [l](#member-19)
- [vs](#member-25)
- [ts](#member-26)
- [bs](#member-27)
- [surf](#member-28)
- [split](#member-29)
- [gnd](#member-38)
- [z](#member-39)
- [cmp](#member-45)
- [premap](#member-47)
- [postmap](#member-48)
- [m](#member-53)
- [mat](#member-54)
- [mat](#member-60)
- [hash](#member-61)
- [gmmat](#member-68)
- [zsurfaces](#member-70)
- [id](#member-72)
- [cmp](#member-77)
- [olvfmt](#member-79)
- [dat](#member-80)
- [vl](#member-81)
- [olvert](#member-84)
- [r](#member-85)
- [st](#member-86)
- [clickmain](#member-94)
- [clickpost](#member-95)
- [gridfmt](#member-97)
- [grid](#member-99)

#### Methods

- [public T make(MapMesh m);](#member-9)
- [makeid(Class<T> cl)](#member-10)
- [sfin()](#member-11)
- [calcnrm()](#member-12)
- [postcalcnrm(Random rnd)](#member-13)
- [clean()](#member-14)
- [data(DataID<T> id)](#member-15)
- [Scan(Coord ul, Coord sz)](#member-20)
- [o(int x, int y)](#member-21)
- [o(Coord in)](#member-22)
- [has(int x, int y)](#member-23)
- [has(Coord in)](#member-24)
- [MapSurface()](#member-30)
- [modelborder()](#member-31)
- [fortile(Coord c)](#member-32)
- [fortilea(Coord c)](#member-33)
- [sfin()](#member-34)
- [calcnrm()](#member-35)
- [postcalcnrm(Random rnd)](#member-36)
- [clean()](#member-37)
- [MLOrder(int z, int subz)](#member-40)
- [MLOrder(int z)](#member-41)
- [mainorder()](#member-42)
- [equals(Object x)](#member-43)
- [hashCode()](#member-44)
- [comparator()](#member-46)
- [rnd()](#member-49)
- [rnd(Coord c)](#member-50)
- [grnd(Coord c)](#member-51)
- [dotrans(MapMesh m, Random rnd, Coord lc, Coord gc)](#member-52)
- [Model(MapMesh m, NodeWrap mat)](#member-55)
- [sfin()](#member-56)
- [calcnrm()](#member-57)
- [clean()](#member-58)
- [postcalcnrm(Random rnd)](#member-59)
- [MatKey(NodeWrap mat)](#member-62)
- [hashCode()](#member-63)
- [equals(Object x)](#member-64)
- [make(MapMesh m)](#member-65)
- [get(MapMesh m, NodeWrap mat)](#member-66)
- [build(MCache mc, Random rnd, Coord ul, Coord sz)](#member-67)
- [groundmod(MCache map, Coord2d cc, Coord2d ul, Coord2d br, double a)](#member-69)
- [getsurf(MCache.SurfaceID id, Tiler tile)](#member-71)
- [OLOrder(MCache.OverlayInfo id)](#member-73)
- [mainorder()](#member-74)
- [equals(Object x)](#member-75)
- [hashCode()](#member-76)
- [comparator()](#member-78)
- [OLArray(VertexArray dat, int[] vl)](#member-82)
- [makeolvbuf()](#member-83)
- [ShallowWrap(Rendered r, Pipe.Op st)](#member-87)
- [added(RenderTree.Slot slot)](#member-88)
- [draw(Pipe context, Render out)](#member-89)
- [dispose()](#member-90)
- [makeol(MCache.OverlayInfo id)](#member-91)
- [makeolol(MCache.OverlayInfo id)](#member-92)
- [clean()](#member-93)
- [consflat()](#member-96)
- [consgrid()](#member-98)
- [grid()](#member-100)
- [dispose()](#member-101)
- [added(RenderTree.Slot slot)](#member-102)
- [toString()](#member-103)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `ul`

- Description: TODO

<a id="member-2"></a>
##### `sz`

- Description: TODO

<a id="member-3"></a>
##### `map`

- Description: TODO

<a id="member-4"></a>
##### `flat`

- Description: TODO

<a id="member-5"></a>
##### `rnd`

- Description: TODO

<a id="member-6"></a>
##### `data`

- Description: TODO

<a id="member-7"></a>
##### `extras`

- Description: TODO

<a id="member-8"></a>
##### `dparts`

- Description: TODO

<a id="member-16"></a>
##### `ul`

- Description: TODO

<a id="member-17"></a>
##### `sz`

- Description: TODO

<a id="member-18"></a>
##### `br`

- Description: TODO

<a id="member-19"></a>
##### `l`

- Description: TODO

<a id="member-25"></a>
##### `vs`

- Description: TODO

<a id="member-26"></a>
##### `ts`

- Description: TODO

<a id="member-27"></a>
##### `bs`

- Description: TODO

<a id="member-28"></a>
##### `surf`

- Description: TODO

<a id="member-29"></a>
##### `split`

- Description: TODO

<a id="member-38"></a>
##### `gnd`

- Description: TODO

<a id="member-39"></a>
##### `z`

- Description: TODO

<a id="member-45"></a>
##### `cmp`

- Description: TODO

<a id="member-47"></a>
##### `premap`

- Description: TODO

<a id="member-48"></a>
##### `postmap`

- Description: TODO

<a id="member-53"></a>
##### `m`

- Description: TODO

<a id="member-54"></a>
##### `mat`

- Description: TODO

<a id="member-60"></a>
##### `mat`

- Description: TODO

<a id="member-61"></a>
##### `hash`

- Description: TODO

<a id="member-68"></a>
##### `gmmat`

- Description: TODO

<a id="member-70"></a>
##### `zsurfaces`

- Description: TODO

<a id="member-72"></a>
##### `id`

- Description: TODO

<a id="member-77"></a>
##### `cmp`

- Description: TODO

<a id="member-79"></a>
##### `olvfmt`

- Description: TODO

<a id="member-80"></a>
##### `dat`

- Description: TODO

<a id="member-81"></a>
##### `vl`

- Description: TODO

<a id="member-84"></a>
##### `olvert`

- Description: TODO

<a id="member-85"></a>
##### `r`

- Description: TODO

<a id="member-86"></a>
##### `st`

- Description: TODO

<a id="member-94"></a>
##### `clickmain`

- Description: TODO

<a id="member-95"></a>
##### `clickpost`

- Description: TODO

<a id="member-97"></a>
##### `gridfmt`

- Description: TODO

<a id="member-99"></a>
##### `grid`

- Description: TODO

#### Methods

<a id="member-9"></a>
##### `public T make(MapMesh m);`

- Description: TODO

<a id="member-10"></a>
##### `makeid(Class<T> cl)`

- Description: TODO

<a id="member-11"></a>
##### `sfin()`

- Description: TODO

<a id="member-12"></a>
##### `calcnrm()`

- Description: TODO

<a id="member-13"></a>
##### `postcalcnrm(Random rnd)`

- Description: TODO

<a id="member-14"></a>
##### `clean()`

- Description: TODO

<a id="member-15"></a>
##### `data(DataID<T> id)`

- Description: TODO

<a id="member-20"></a>
##### `Scan(Coord ul, Coord sz)`

- Description: TODO

<a id="member-21"></a>
##### `o(int x, int y)`

- Description: TODO

<a id="member-22"></a>
##### `o(Coord in)`

- Description: TODO

<a id="member-23"></a>
##### `has(int x, int y)`

- Description: TODO

<a id="member-24"></a>
##### `has(Coord in)`

- Description: TODO

<a id="member-30"></a>
##### `MapSurface()`

- Description: TODO

<a id="member-31"></a>
##### `modelborder()`

- Description: TODO

<a id="member-32"></a>
##### `fortile(Coord c)`

- Description: TODO

<a id="member-33"></a>
##### `fortilea(Coord c)`

- Description: TODO

<a id="member-34"></a>
##### `sfin()`

- Description: TODO

<a id="member-35"></a>
##### `calcnrm()`

- Description: TODO

<a id="member-36"></a>
##### `postcalcnrm(Random rnd)`

- Description: TODO

<a id="member-37"></a>
##### `clean()`

- Description: TODO

<a id="member-40"></a>
##### `MLOrder(int z, int subz)`

- Description: TODO

<a id="member-41"></a>
##### `MLOrder(int z)`

- Description: TODO

<a id="member-42"></a>
##### `mainorder()`

- Description: TODO

<a id="member-43"></a>
##### `equals(Object x)`

- Description: TODO

<a id="member-44"></a>
##### `hashCode()`

- Description: TODO

<a id="member-46"></a>
##### `comparator()`

- Description: TODO

<a id="member-49"></a>
##### `rnd()`

- Description: TODO

<a id="member-50"></a>
##### `rnd(Coord c)`

- Description: TODO

<a id="member-51"></a>
##### `grnd(Coord c)`

- Description: TODO

<a id="member-52"></a>
##### `dotrans(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

<a id="member-55"></a>
##### `Model(MapMesh m, NodeWrap mat)`

- Description: TODO

<a id="member-56"></a>
##### `sfin()`

- Description: TODO

<a id="member-57"></a>
##### `calcnrm()`

- Description: TODO

<a id="member-58"></a>
##### `clean()`

- Description: TODO

<a id="member-59"></a>
##### `postcalcnrm(Random rnd)`

- Description: TODO

<a id="member-62"></a>
##### `MatKey(NodeWrap mat)`

- Description: TODO

<a id="member-63"></a>
##### `hashCode()`

- Description: TODO

<a id="member-64"></a>
##### `equals(Object x)`

- Description: TODO

<a id="member-65"></a>
##### `make(MapMesh m)`

- Description: TODO

<a id="member-66"></a>
##### `get(MapMesh m, NodeWrap mat)`

- Description: TODO

<a id="member-67"></a>
##### `build(MCache mc, Random rnd, Coord ul, Coord sz)`

- Description: TODO

<a id="member-69"></a>
##### `groundmod(MCache map, Coord2d cc, Coord2d ul, Coord2d br, double a)`

- Description: TODO

<a id="member-71"></a>
##### `getsurf(MCache.SurfaceID id, Tiler tile)`

- Description: TODO

<a id="member-73"></a>
##### `OLOrder(MCache.OverlayInfo id)`

- Description: TODO

<a id="member-74"></a>
##### `mainorder()`

- Description: TODO

<a id="member-75"></a>
##### `equals(Object x)`

- Description: TODO

<a id="member-76"></a>
##### `hashCode()`

- Description: TODO

<a id="member-78"></a>
##### `comparator()`

- Description: TODO

<a id="member-82"></a>
##### `OLArray(VertexArray dat, int[] vl)`

- Description: TODO

<a id="member-83"></a>
##### `makeolvbuf()`

- Description: TODO

<a id="member-87"></a>
##### `ShallowWrap(Rendered r, Pipe.Op st)`

- Description: TODO

<a id="member-88"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-89"></a>
##### `draw(Pipe context, Render out)`

- Description: TODO

<a id="member-90"></a>
##### `dispose()`

- Description: TODO

<a id="member-91"></a>
##### `makeol(MCache.OverlayInfo id)`

- Description: TODO

<a id="member-92"></a>
##### `makeolol(MCache.OverlayInfo id)`

- Description: TODO

<a id="member-93"></a>
##### `clean()`

- Description: TODO

<a id="member-96"></a>
##### `consflat()`

- Description: TODO

<a id="member-98"></a>
##### `consgrid()`

- Description: TODO

<a id="member-100"></a>
##### `grid()`

- Description: TODO

<a id="member-101"></a>
##### `dispose()`

- Description: TODO

<a id="member-102"></a>
##### `added(RenderTree.Slot slot)`

- Description: TODO

<a id="member-103"></a>
##### `toString()`

- Description: TODO
