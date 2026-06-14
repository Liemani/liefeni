# WaterTile

## Meta

- Source: [WaterTile.java](../../../../src/haven/resutil/WaterTile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a water tile helper.

## Code Members

### Member Index

#### Constants

- [I](#member-5)

#### Fields

- [depth](#member-1)
- [bottom](#member-2)
- [nxpcw](#member-3)
- [nypcw](#member-4)
- [xv](#member-6)
- [yv](#member-7)
- [vs](#member-8)
- [m](#member-9)
- [map](#member-10)
- [xs](#member-11)
- [ys](#member-12)
- [xv](#member-13)
- [yv](#member-14)
- [wv](#member-15)
- [vs](#member-16)
- [fs](#member-17)
- [ts](#member-18)
- [id](#member-26)
- [depth](#member-27)
- [ds](#member-28)
- [id](#member-31)
- [m](#member-32)
- [s](#member-33)
- [surf](#member-34)
- [split](#member-35)
- [ed](#member-36)
- [vs](#member-37)
- [ss](#member-38)
- [prs](#member-39)
- [d](#member-41)
- [id](#member-47)
- [sky](#member-49)
- [nrm](#member-50)
- [flow](#member-51)
- [surfslot](#member-52)
- [surfextra](#member-53)
- [baseextra](#member-54)
- [ssky](#member-55)
- [snrm](#member-56)
- [icam](#member-57)
- [shader](#member-59)
- [surfmat](#member-62)
- [foamextra](#member-63)
- [vertv](#member-64)
- [lvertv](#member-65)
- [vvertv](#member-66)
- [vverti](#member-67)
- [vipol](#member-68)
- [lvipol](#member-69)
- [ssky](#member-70)
- [snrm](#member-71)
- [sflow](#member-72)
- [icam](#member-73)
- [shader](#member-75)
- [foammat](#member-78)
- [depthlayer](#member-79)
- [maxdepth](#member-80)
- [fogcolor](#member-81)
- [mfogcolor](#member-82)
- [rgbmix](#member-83)
- [depth](#member-84)
- [fragd](#member-85)
- [shader](#member-86)
- [waterfog](#member-89)
- [botmat](#member-90)
- [slot](#member-91)
- [basez](#member-92)
- [cbasez](#member-97)
- [fragd](#member-98)
- [shader](#member-99)
- [instancer](#member-102)
- [b](#member-107)
- [clickstate](#member-111)

#### Methods

- [Field(MapMesh m)](#member-19)
- [calc()](#member-20)
- [water()](#member-21)
- [slopes()](#member-22)
- [iter()](#member-23)
- [FlowData(MapMesh m)](#member-24)
- [vel(Coord tc)](#member-25)
- [BottomData(MapMesh m)](#member-29)
- [clean()](#member-30)
- [Bottom(MapMesh m)](#member-40)
- [BottomVertex(Surface surf, Coord3f c, float d)](#member-42)
- [modify(MeshBuf buf, MeshBuf.Vertex v)](#member-43)
- [d(int x, int y)](#member-44)
- [fortilea(Coord c)](#member-45)
- [calcnrm()](#member-46)
- [model(MapMesh m, Random rnd, Coord lc, Coord gc)](#member-48)
- [BaseSurface()](#member-58)
- [shader()](#member-60)
- [apply(Pipe buf)](#member-61)
- [FoamSurface()](#member-74)
- [shader()](#member-76)
- [apply(Pipe buf)](#member-77)
- [BottomFog()](#member-87)
- [shader()](#member-88)
- [ObFog(float basez)](#member-93)
- [equals(ObFog that)](#member-94)
- [equals(Object x)](#member-95)
- [hashCode()](#member-96)
- [shader()](#member-100)
- [apply(Pipe p)](#member-101)
- [attribs()](#member-103)
- [create(int id, Tileset set)](#member-104)
- [lay(MapMesh m, Random rnd, Coord lc, Coord gc)](#member-105)
- [trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)](#member-106)
- [BottomSurface(MapMesh m)](#member-108)
- [getz(Coord tc)](#member-109)
- [getsurf(MapMesh m, MCache.SurfaceID id)](#member-110)
- [clickstate()](#member-112)
- [drawstate(Glob glob, Coord3f c)](#member-113)

### Member Reference

#### Constants

<a id="member-5"></a>
##### `I`

- Description: TODO

#### Fields

<a id="member-1"></a>
##### `depth`

- Description: TODO

<a id="member-2"></a>
##### `bottom`

- Description: TODO

<a id="member-3"></a>
##### `nxpcw`

- Description: TODO

<a id="member-4"></a>
##### `nypcw`

- Description: TODO

<a id="member-6"></a>
##### `xv`

- Description: TODO

<a id="member-7"></a>
##### `yv`

- Description: TODO

<a id="member-8"></a>
##### `vs`

- Description: TODO

<a id="member-9"></a>
##### `m`

- Description: TODO

<a id="member-10"></a>
##### `map`

- Description: TODO

<a id="member-11"></a>
##### `xs`

- Description: TODO

<a id="member-12"></a>
##### `ys`

- Description: TODO

<a id="member-13"></a>
##### `xv`

- Description: TODO

<a id="member-14"></a>
##### `yv`

- Description: TODO

<a id="member-15"></a>
##### `wv`

- Description: TODO

<a id="member-16"></a>
##### `vs`

- Description: TODO

<a id="member-17"></a>
##### `fs`

- Description: TODO

<a id="member-18"></a>
##### `ts`

- Description: TODO

<a id="member-26"></a>
##### `id`

- Description: TODO

<a id="member-27"></a>
##### `depth`

- Description: TODO

<a id="member-28"></a>
##### `ds`

- Description: TODO

<a id="member-31"></a>
##### `id`

- Description: TODO

<a id="member-32"></a>
##### `m`

- Description: TODO

<a id="member-33"></a>
##### `s`

- Description: TODO

<a id="member-34"></a>
##### `surf`

- Description: TODO

<a id="member-35"></a>
##### `split`

- Description: TODO

<a id="member-36"></a>
##### `ed`

- Description: TODO

<a id="member-37"></a>
##### `vs`

- Description: TODO

<a id="member-38"></a>
##### `ss`

- Description: TODO

<a id="member-39"></a>
##### `prs`

- Description: TODO

<a id="member-41"></a>
##### `d`

- Description: TODO

<a id="member-47"></a>
##### `id`

- Description: TODO

<a id="member-49"></a>
##### `sky`

- Description: TODO

<a id="member-50"></a>
##### `nrm`

- Description: TODO

<a id="member-51"></a>
##### `flow`

- Description: TODO

<a id="member-52"></a>
##### `surfslot`

- Description: TODO

<a id="member-53"></a>
##### `surfextra`

- Description: TODO

<a id="member-54"></a>
##### `baseextra`

- Description: TODO

<a id="member-55"></a>
##### `ssky`

- Description: TODO

<a id="member-56"></a>
##### `snrm`

- Description: TODO

<a id="member-57"></a>
##### `icam`

- Description: TODO

<a id="member-59"></a>
##### `shader`

- Description: TODO

<a id="member-62"></a>
##### `surfmat`

- Description: TODO

<a id="member-63"></a>
##### `foamextra`

- Description: TODO

<a id="member-64"></a>
##### `vertv`

- Description: TODO

<a id="member-65"></a>
##### `lvertv`

- Description: TODO

<a id="member-66"></a>
##### `vvertv`

- Description: TODO

<a id="member-67"></a>
##### `vverti`

- Description: TODO

<a id="member-68"></a>
##### `vipol`

- Description: TODO

<a id="member-69"></a>
##### `lvipol`

- Description: TODO

<a id="member-70"></a>
##### `ssky`

- Description: TODO

<a id="member-71"></a>
##### `snrm`

- Description: TODO

<a id="member-72"></a>
##### `sflow`

- Description: TODO

<a id="member-73"></a>
##### `icam`

- Description: TODO

<a id="member-75"></a>
##### `shader`

- Description: TODO

<a id="member-78"></a>
##### `foammat`

- Description: TODO

<a id="member-79"></a>
##### `depthlayer`

- Description: TODO

<a id="member-80"></a>
##### `maxdepth`

- Description: TODO

<a id="member-81"></a>
##### `fogcolor`

- Description: TODO

<a id="member-82"></a>
##### `mfogcolor`

- Description: TODO

<a id="member-83"></a>
##### `rgbmix`

- Description: TODO

<a id="member-84"></a>
##### `depth`

- Description: TODO

<a id="member-85"></a>
##### `fragd`

- Description: TODO

<a id="member-86"></a>
##### `shader`

- Description: TODO

<a id="member-89"></a>
##### `waterfog`

- Description: TODO

<a id="member-90"></a>
##### `botmat`

- Description: TODO

<a id="member-91"></a>
##### `slot`

- Description: TODO

<a id="member-92"></a>
##### `basez`

- Description: TODO

<a id="member-97"></a>
##### `cbasez`

- Description: TODO

<a id="member-98"></a>
##### `fragd`

- Description: TODO

<a id="member-99"></a>
##### `shader`

- Description: TODO

<a id="member-102"></a>
##### `instancer`

- Description: TODO

<a id="member-107"></a>
##### `b`

- Description: TODO

<a id="member-111"></a>
##### `clickstate`

- Description: TODO

#### Methods

<a id="member-19"></a>
##### `Field(MapMesh m)`

- Description: TODO

<a id="member-20"></a>
##### `calc()`

- Description: TODO

<a id="member-21"></a>
##### `water()`

- Description: TODO

<a id="member-22"></a>
##### `slopes()`

- Description: TODO

<a id="member-23"></a>
##### `iter()`

- Description: TODO

<a id="member-24"></a>
##### `FlowData(MapMesh m)`

- Description: TODO

<a id="member-25"></a>
##### `vel(Coord tc)`

- Description: TODO

<a id="member-29"></a>
##### `BottomData(MapMesh m)`

- Description: TODO

<a id="member-30"></a>
##### `clean()`

- Description: TODO

<a id="member-40"></a>
##### `Bottom(MapMesh m)`

- Description: TODO

<a id="member-42"></a>
##### `BottomVertex(Surface surf, Coord3f c, float d)`

- Description: TODO

<a id="member-43"></a>
##### `modify(MeshBuf buf, MeshBuf.Vertex v)`

- Description: TODO

<a id="member-44"></a>
##### `d(int x, int y)`

- Description: TODO

<a id="member-45"></a>
##### `fortilea(Coord c)`

- Description: TODO

<a id="member-46"></a>
##### `calcnrm()`

- Description: TODO

<a id="member-48"></a>
##### `model(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

<a id="member-58"></a>
##### `BaseSurface()`

- Description: TODO

<a id="member-60"></a>
##### `shader()`

- Description: TODO

<a id="member-61"></a>
##### `apply(Pipe buf)`

- Description: TODO

<a id="member-74"></a>
##### `FoamSurface()`

- Description: TODO

<a id="member-76"></a>
##### `shader()`

- Description: TODO

<a id="member-77"></a>
##### `apply(Pipe buf)`

- Description: TODO

<a id="member-87"></a>
##### `BottomFog()`

- Description: TODO

<a id="member-88"></a>
##### `shader()`

- Description: TODO

<a id="member-93"></a>
##### `ObFog(float basez)`

- Description: TODO

<a id="member-94"></a>
##### `equals(ObFog that)`

- Description: TODO

<a id="member-95"></a>
##### `equals(Object x)`

- Description: TODO

<a id="member-96"></a>
##### `hashCode()`

- Description: TODO

<a id="member-100"></a>
##### `shader()`

- Description: TODO

<a id="member-101"></a>
##### `apply(Pipe p)`

- Description: TODO

<a id="member-103"></a>
##### `attribs()`

- Description: TODO

<a id="member-104"></a>
##### `create(int id, Tileset set)`

- Description: TODO

<a id="member-105"></a>
##### `lay(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

<a id="member-106"></a>
##### `trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`

- Description: TODO

<a id="member-108"></a>
##### `BottomSurface(MapMesh m)`

- Description: TODO

<a id="member-109"></a>
##### `getz(Coord tc)`

- Description: TODO

<a id="member-110"></a>
##### `getsurf(MapMesh m, MCache.SurfaceID id)`

- Description: TODO

<a id="member-112"></a>
##### `clickstate()`

- Description: TODO

<a id="member-113"></a>
##### `drawstate(Glob glob, Coord3f c)`

- Description: TODO
