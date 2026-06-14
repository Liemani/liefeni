# Tiler

## Meta

- Source: [Tiler.java](../../../src/haven/Tiler.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a tile helper.

## Code Members

### Member Index

#### Fields

- [id](#member-1)
- [lc](#member-2)
- [gc](#member-3)
- [v](#member-4)
- [tcx](#member-5)
- [tcy](#member-6)
- [f](#member-7)
- [mat](#member-8)
- [ctcx](#member-13)
- [ctcy](#member-14)
- [rdiag](#member-15)
- [ldiag](#member-16)
- [nil](#member-19)
- [id](#member-22)
- [f](#member-23)
- [map](#member-24)
- [mat](#member-28)
- [f](#member-29)
- [hash](#member-30)
- [m](#member-41)
- [rnames](#member-50)

#### Methods

- [MPart(Coord lc, Coord gc, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f)](#member-9)
- [MPart(MPart... parts)](#member-10)
- [mapvertices(MPart[] parts, int[][] vmap)](#member-11)
- [mcomb(Pipe.Op mat)](#member-12)
- [splitquad(Coord lc, Coord gc, Surface.Vertex[] corners, boolean diag)](#member-17)
- [public void faces(MapMesh m, MPart desc);](#member-18)
- [public MCons tcons(int z, int bmask, int cmask);](#member-20)
- [public MeshVertex make(MeshBuf buf, MPart d, int i);](#member-21)
- [SModel(MapMesh m, NodeWrap mat, VertFactory f)](#member-25)
- [get(MPart d, int i)](#member-26)
- [get(MPart d)](#member-27)
- [Key(NodeWrap mat, VertFactory f)](#member-31)
- [hashCode()](#member-32)
- [equals(Object x)](#member-33)
- [make(MapMesh m)](#member-34)
- [get(MapMesh m, NodeWrap mat, VertFactory f)](#member-35)
- [flatmodel(MapMesh m, Coord lc)](#member-36)
- [model(MapMesh m, Random rnd, Coord lc, Coord gc)](#member-37)
- [lay(MapMesh m, Coord lc, Coord gc, MCons cons, boolean cover)](#member-38)
- [public abstract void lay(MapMesh m, Random rnd, Coord lc, Coord gc);](#member-39)
- [public abstract void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask);](#member-40)
- [MapZSurface(MapMesh m)](#member-42)
- [getz(Coord tc)](#member-43)
- [getsurf(MapMesh m, MCache.SurfaceID id)](#member-44)
- [clickstate()](#member-45)
- [drawstate(Glob glob, Coord3f c)](#member-46)
- [FactMaker()](#member-47)
- [public Tiler create(int id, Tileset set);](#member-48)
- [public String value();](#member-49)
- [byname(String name)](#member-51)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `id`

- Description: TODO

<a id="member-2"></a>
##### `lc`

- Description: TODO

<a id="member-3"></a>
##### `gc`

- Description: TODO

<a id="member-4"></a>
##### `v`

- Description: TODO

<a id="member-5"></a>
##### `tcx`

- Description: TODO

<a id="member-6"></a>
##### `tcy`

- Description: TODO

<a id="member-7"></a>
##### `f`

- Description: TODO

<a id="member-8"></a>
##### `mat`

- Description: TODO

<a id="member-13"></a>
##### `ctcx`

- Description: TODO

<a id="member-14"></a>
##### `ctcy`

- Description: TODO

<a id="member-15"></a>
##### `rdiag`

- Description: TODO

<a id="member-16"></a>
##### `ldiag`

- Description: TODO

<a id="member-19"></a>
##### `nil`

- Description: TODO

<a id="member-22"></a>
##### `id`

- Description: TODO

<a id="member-23"></a>
##### `f`

- Description: TODO

<a id="member-24"></a>
##### `map`

- Description: TODO

<a id="member-28"></a>
##### `mat`

- Description: TODO

<a id="member-29"></a>
##### `f`

- Description: TODO

<a id="member-30"></a>
##### `hash`

- Description: TODO

<a id="member-41"></a>
##### `m`

- Description: TODO

<a id="member-50"></a>
##### `rnames`

- Description: TODO

#### Methods

<a id="member-9"></a>
##### `MPart(Coord lc, Coord gc, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f)`

- Description: TODO

<a id="member-10"></a>
##### `MPart(MPart... parts)`

- Description: TODO

<a id="member-11"></a>
##### `mapvertices(MPart[] parts, int[][] vmap)`

- Description: TODO

<a id="member-12"></a>
##### `mcomb(Pipe.Op mat)`

- Description: TODO

<a id="member-17"></a>
##### `splitquad(Coord lc, Coord gc, Surface.Vertex[] corners, boolean diag)`

- Description: TODO

<a id="member-18"></a>
##### `public void faces(MapMesh m, MPart desc);`

- Description: TODO

<a id="member-20"></a>
##### `public MCons tcons(int z, int bmask, int cmask);`

- Description: TODO

<a id="member-21"></a>
##### `public MeshVertex make(MeshBuf buf, MPart d, int i);`

- Description: TODO

<a id="member-25"></a>
##### `SModel(MapMesh m, NodeWrap mat, VertFactory f)`

- Description: TODO

<a id="member-26"></a>
##### `get(MPart d, int i)`

- Description: TODO

<a id="member-27"></a>
##### `get(MPart d)`

- Description: TODO

<a id="member-31"></a>
##### `Key(NodeWrap mat, VertFactory f)`

- Description: TODO

<a id="member-32"></a>
##### `hashCode()`

- Description: TODO

<a id="member-33"></a>
##### `equals(Object x)`

- Description: TODO

<a id="member-34"></a>
##### `make(MapMesh m)`

- Description: TODO

<a id="member-35"></a>
##### `get(MapMesh m, NodeWrap mat, VertFactory f)`

- Description: TODO

<a id="member-36"></a>
##### `flatmodel(MapMesh m, Coord lc)`

- Description: TODO

<a id="member-37"></a>
##### `model(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

<a id="member-38"></a>
##### `lay(MapMesh m, Coord lc, Coord gc, MCons cons, boolean cover)`

- Description: TODO

<a id="member-39"></a>
##### `public abstract void lay(MapMesh m, Random rnd, Coord lc, Coord gc);`

- Description: TODO

<a id="member-40"></a>
##### `public abstract void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask);`

- Description: TODO

<a id="member-42"></a>
##### `MapZSurface(MapMesh m)`

- Description: TODO

<a id="member-43"></a>
##### `getz(Coord tc)`

- Description: TODO

<a id="member-44"></a>
##### `getsurf(MapMesh m, MCache.SurfaceID id)`

- Description: TODO

<a id="member-45"></a>
##### `clickstate()`

- Description: TODO

<a id="member-46"></a>
##### `drawstate(Glob glob, Coord3f c)`

- Description: TODO

<a id="member-47"></a>
##### `FactMaker()`

- Description: TODO

<a id="member-48"></a>
##### `public Tiler create(int id, Tileset set);`

- Description: TODO

<a id="member-49"></a>
##### `public String value();`

- Description: TODO

<a id="member-51"></a>
##### `byname(String name)`

- Description: TODO
