# Ridges

## Meta

- Source: [Ridges.java](../../../../src/haven/resutil/Ridges.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents ridge rendering helpers.

## Code Members

### Member Index

#### Constants

- [EPSILON](#member-1)

#### Fields

- [id](#member-2)
- [segh](#member-3)
- [tilesz](#member-4)
- [m](#member-5)
- [ms](#member-6)
- [breaks](#member-7)
- [edges](#member-8)
- [edgec](#member-9)
- [edgeo](#member-10)
- [gnd](#member-11)
- [ridge](#member-12)
- [rcx](#member-14)
- [rcy](#member-15)
- [rn](#member-16)
- [ledge](#member-17)
- [uedge](#member-18)
- [rh](#member-19)
- [tecs](#member-28)
- [tccs](#member-29)
- [srfi](#member-41)
- [d1rfi](#member-43)
- [d2rfi](#member-45)
- [cg1rfi](#member-51)
- [cg2rfi](#member-52)
- [testcons](#member-55)
- [mat](#member-56)
- [texh](#member-57)

#### Methods

- [public double breakz();](#member-13)
- [RPart(Coord lc, Coord gc, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f, float[] rcx, float[] rcy, int[] rn, float[] rh, int[][] ledge, int[][] uedge)](#member-20)
- [RPart(RPart... parts)](#member-21)
- [mapridges(RPart[] parts, int[][] vmap)](#member-22)
- [mapvertices(MPart[] mparts, int[][] vmap)](#member-23)
- [eo(int x, int y, int e)](#member-24)
- [eo(Coord c, int e)](#member-25)
- [breaks()](#member-26)
- [dc(float m, int d)](#member-27)
- [edgelc(Coord tc, int e)](#member-30)
- [makeedge(Coord tc, int e)](#member-31)
- [ensureedge(Coord tc, int e)](#member-32)
- [breaks(Coord tc)](#member-33)
- [tczs(Coord tc)](#member-34)
- [isend(boolean[] b)](#member-35)
- [isdiag(boolean[] b)](#member-36)
- [isdiag2(Coord tc, boolean[] b)](#member-37)
- [mkfaces(Vertex[] va, int[] fa)](#member-38)
- [connect(Coord tc, Vertex[] l, Vertex[] r)](#member-39)
- [modelcap(Coord tc, int dir)](#member-40)
- [modelstraight(Coord tc, int dir)](#member-42)
- [modeldiag1(Coord tc, int dir)](#member-44)
- [modeldiag2(Coord tc, int dir)](#member-46)
- [zmatch(Coord3f[] cl, float z)](#member-47)
- [colzmatch(Coord3f[] cl, float lo, float hi)](#member-48)
- [mktcx(Vertex[] v, Coord pc)](#member-49)
- [mktcy(Vertex[] v, Coord pc)](#member-50)
- [modelcomplex(Coord tc, boolean[] breaks)](#member-53)
- [model(Coord tc)](#member-54)
- [TexCons(Pipe.Op mat, float texh)](#member-58)
- [faces(MapMesh m, MPart mdesc)](#member-59)
- [laygnd(Coord tc, Tiler.MCons cons)](#member-60)
- [layridge(Coord tc, Tiler.MCons cons)](#member-61)
- [getrdesc(Coord tc)](#member-62)
- [clean()](#member-63)
- [brokenp(MapSource map, Coord tc)](#member-64)
- [edgeoff(MCache map, Coord tc, int edge, boolean hi)](#member-65)

### Member Reference

#### Constants

<a id="member-1"></a>
##### `EPSILON`

- Description: TODO

#### Fields

<a id="member-2"></a>
##### `id`

- Description: TODO

<a id="member-3"></a>
##### `segh`

- Description: TODO

<a id="member-4"></a>
##### `tilesz`

- Description: TODO

<a id="member-5"></a>
##### `m`

- Description: TODO

<a id="member-6"></a>
##### `ms`

- Description: TODO

<a id="member-7"></a>
##### `breaks`

- Description: TODO

<a id="member-8"></a>
##### `edges`

- Description: TODO

<a id="member-9"></a>
##### `edgec`

- Description: TODO

<a id="member-10"></a>
##### `edgeo`

- Description: TODO

<a id="member-11"></a>
##### `gnd`

- Description: TODO

<a id="member-12"></a>
##### `ridge`

- Description: TODO

<a id="member-14"></a>
##### `rcx`

- Description: TODO

<a id="member-15"></a>
##### `rcy`

- Description: TODO

<a id="member-16"></a>
##### `rn`

- Description: TODO

<a id="member-17"></a>
##### `ledge`

- Description: TODO

<a id="member-18"></a>
##### `uedge`

- Description: TODO

<a id="member-19"></a>
##### `rh`

- Description: TODO

<a id="member-28"></a>
##### `tecs`

- Description: TODO

<a id="member-29"></a>
##### `tccs`

- Description: TODO

<a id="member-41"></a>
##### `srfi`

- Description: TODO

<a id="member-43"></a>
##### `d1rfi`

- Description: TODO

<a id="member-45"></a>
##### `d2rfi`

- Description: TODO

<a id="member-51"></a>
##### `cg1rfi`

- Description: TODO

<a id="member-52"></a>
##### `cg2rfi`

- Description: TODO

<a id="member-55"></a>
##### `testcons`

- Description: TODO

<a id="member-56"></a>
##### `mat`

- Description: TODO

<a id="member-57"></a>
##### `texh`

- Description: TODO

#### Methods

<a id="member-13"></a>
##### `public double breakz();`

- Description: TODO

<a id="member-20"></a>
##### `RPart(Coord lc, Coord gc, Surface.Vertex[] v, float[] tcx, float[] tcy, int[] f, float[] rcx, float[] rcy, int[] rn, float[] rh, int[][] ledge, int[][] uedge)`

- Description: TODO

<a id="member-21"></a>
##### `RPart(RPart... parts)`

- Description: TODO

<a id="member-22"></a>
##### `mapridges(RPart[] parts, int[][] vmap)`

- Description: TODO

<a id="member-23"></a>
##### `mapvertices(MPart[] mparts, int[][] vmap)`

- Description: TODO

<a id="member-24"></a>
##### `eo(int x, int y, int e)`

- Description: TODO

<a id="member-25"></a>
##### `eo(Coord c, int e)`

- Description: TODO

<a id="member-26"></a>
##### `breaks()`

- Description: TODO

<a id="member-27"></a>
##### `dc(float m, int d)`

- Description: TODO

<a id="member-30"></a>
##### `edgelc(Coord tc, int e)`

- Description: TODO

<a id="member-31"></a>
##### `makeedge(Coord tc, int e)`

- Description: TODO

<a id="member-32"></a>
##### `ensureedge(Coord tc, int e)`

- Description: TODO

<a id="member-33"></a>
##### `breaks(Coord tc)`

- Description: TODO

<a id="member-34"></a>
##### `tczs(Coord tc)`

- Description: TODO

<a id="member-35"></a>
##### `isend(boolean[] b)`

- Description: TODO

<a id="member-36"></a>
##### `isdiag(boolean[] b)`

- Description: TODO

<a id="member-37"></a>
##### `isdiag2(Coord tc, boolean[] b)`

- Description: TODO

<a id="member-38"></a>
##### `mkfaces(Vertex[] va, int[] fa)`

- Description: TODO

<a id="member-39"></a>
##### `connect(Coord tc, Vertex[] l, Vertex[] r)`

- Description: TODO

<a id="member-40"></a>
##### `modelcap(Coord tc, int dir)`

- Description: TODO

<a id="member-42"></a>
##### `modelstraight(Coord tc, int dir)`

- Description: TODO

<a id="member-44"></a>
##### `modeldiag1(Coord tc, int dir)`

- Description: TODO

<a id="member-46"></a>
##### `modeldiag2(Coord tc, int dir)`

- Description: TODO

<a id="member-47"></a>
##### `zmatch(Coord3f[] cl, float z)`

- Description: TODO

<a id="member-48"></a>
##### `colzmatch(Coord3f[] cl, float lo, float hi)`

- Description: TODO

<a id="member-49"></a>
##### `mktcx(Vertex[] v, Coord pc)`

- Description: TODO

<a id="member-50"></a>
##### `mktcy(Vertex[] v, Coord pc)`

- Description: TODO

<a id="member-53"></a>
##### `modelcomplex(Coord tc, boolean[] breaks)`

- Description: TODO

<a id="member-54"></a>
##### `model(Coord tc)`

- Description: TODO

<a id="member-58"></a>
##### `TexCons(Pipe.Op mat, float texh)`

- Description: TODO

<a id="member-59"></a>
##### `faces(MapMesh m, MPart mdesc)`

- Description: TODO

<a id="member-60"></a>
##### `laygnd(Coord tc, Tiler.MCons cons)`

- Description: TODO

<a id="member-61"></a>
##### `layridge(Coord tc, Tiler.MCons cons)`

- Description: TODO

<a id="member-62"></a>
##### `getrdesc(Coord tc)`

- Description: TODO

<a id="member-63"></a>
##### `clean()`

- Description: TODO

<a id="member-64"></a>
##### `brokenp(MapSource map, Coord tc)`

- Description: TODO

<a id="member-65"></a>
##### `edgeoff(MCache map, Coord tc, int edge, boolean hi)`

- Description: TODO
