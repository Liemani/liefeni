# Tileset

## Meta

- Source: [Tileset.java](../../../src/haven/Tileset.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a tile set.

## Code Members

### Member Index

#### Fields

- [tn](#member-1)
- [tags](#member-2)
- [ta](#member-3)
- [tfac](#member-4)
- [flavors](#member-5)
- [flavobjmat](#member-6)
- [ground](#member-7)
- [ctrans](#member-8)
- [btrans](#member-9)
- [flavprob](#member-10)
- [img](#member-11)
- [tex](#member-12)
- [id](#member-13)
- [w](#member-14)
- [t](#member-15)
- [seed](#member-19)
- [glob](#member-26)
- [area](#member-27)
- [seed](#member-28)
- [mats](#member-29)
- [data](#member-30)
- [finish](#member-31)
- [grid](#member-39)
- [map](#member-40)
- [tile](#member-41)
- [area](#member-42)
- [toff](#member-43)
- [mask](#member-45)
- [tiles](#member-47)
- [res](#member-56)
- [args](#member-57)
- [flav](#member-58)
- [res](#member-62)
- [p](#member-63)

#### Methods

- [Tile(Resource res, Message buf)](#member-16)
- [tex()](#member-17)
- [init()](#member-18)
- [Obj(Buffer buf, Coord2d c, double a)](#member-20)
- [mkrandoom()](#member-21)
- [GridObj(Buffer buf, Coord2d c, double a)](#member-22)
- [GridObj(Buffer buf)](#member-23)
- [placer()](#member-24)
- [getmapstate(Coord3f pc)](#member-25)
- [Buffer(Glob glob, Area area, long seed)](#member-32)
- [matslot(NodeWrap mat)](#member-33)
- [add(Gob ob, NodeWrap mat)](#member-34)
- [add(Gob ob)](#member-35)
- [datum(Function<Buffer, T> id)](#member-36)
- [finish(Runnable act)](#member-37)
- [finish()](#member-38)
- [Terrain(MapSource grid, MapSource map, int tile, Area area, Coord toff)](#member-44)
- [mask()](#member-46)
- [tiles()](#member-48)
- [gettile(Coord tc)](#member-49)
- [getfz(Coord tc)](#member-50)
- [tileset(int t)](#member-51)
- [tiler(int t)](#member-52)
- [public void flavor(Buffer buf, Terrain trn, Random seed);](#member-53)
- [public Flavor make(Tileset trn, Object... args);](#member-54)
- [FactMaker()](#member-55)
- [Res(Resource res, Message buf)](#member-59)
- [get()](#member-60)
- [init()](#member-61)
- [SpriteFlavor(Indir<Resource> res, double p)](#member-64)
- [flavor(Buffer buf, Terrain trn, Random seed)](#member-65)
- [tfac()](#member-66)
- [packtiles(Collection<Tile> tiles, Coord tsz)](#member-67)
- [init()](#member-68)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `tn`

- Description: TODO

<a id="member-2"></a>
##### `tags`

- Description: TODO

<a id="member-3"></a>
##### `ta`

- Description: TODO

<a id="member-4"></a>
##### `tfac`

- Description: TODO

<a id="member-5"></a>
##### `flavors`

- Description: TODO

<a id="member-6"></a>
##### `flavobjmat`

- Description: TODO

<a id="member-7"></a>
##### `ground`

- Description: TODO

<a id="member-8"></a>
##### `ctrans`

- Description: TODO

<a id="member-9"></a>
##### `btrans`

- Description: TODO

<a id="member-10"></a>
##### `flavprob`

- Description: TODO

<a id="member-11"></a>
##### `img`

- Description: TODO

<a id="member-12"></a>
##### `tex`

- Description: TODO

<a id="member-13"></a>
##### `id`

- Description: TODO

<a id="member-14"></a>
##### `w`

- Description: TODO

<a id="member-15"></a>
##### `t`

- Description: TODO

<a id="member-19"></a>
##### `seed`

- Description: TODO

<a id="member-26"></a>
##### `glob`

- Description: TODO

<a id="member-27"></a>
##### `area`

- Description: TODO

<a id="member-28"></a>
##### `seed`

- Description: TODO

<a id="member-29"></a>
##### `mats`

- Description: TODO

<a id="member-30"></a>
##### `data`

- Description: TODO

<a id="member-31"></a>
##### `finish`

- Description: TODO

<a id="member-39"></a>
##### `grid`

- Description: TODO

<a id="member-40"></a>
##### `map`

- Description: TODO

<a id="member-41"></a>
##### `tile`

- Description: TODO

<a id="member-42"></a>
##### `area`

- Description: TODO

<a id="member-43"></a>
##### `toff`

- Description: TODO

<a id="member-45"></a>
##### `mask`

- Description: TODO

<a id="member-47"></a>
##### `tiles`

- Description: TODO

<a id="member-56"></a>
##### `res`

- Description: TODO

<a id="member-57"></a>
##### `args`

- Description: TODO

<a id="member-58"></a>
##### `flav`

- Description: TODO

<a id="member-62"></a>
##### `res`

- Description: TODO

<a id="member-63"></a>
##### `p`

- Description: TODO

#### Methods

<a id="member-16"></a>
##### `Tile(Resource res, Message buf)`

- Description: TODO

<a id="member-17"></a>
##### `tex()`

- Description: TODO

<a id="member-18"></a>
##### `init()`

- Description: TODO

<a id="member-20"></a>
##### `Obj(Buffer buf, Coord2d c, double a)`

- Description: TODO

<a id="member-21"></a>
##### `mkrandoom()`

- Description: TODO

<a id="member-22"></a>
##### `GridObj(Buffer buf, Coord2d c, double a)`

- Description: TODO

<a id="member-23"></a>
##### `GridObj(Buffer buf)`

- Description: TODO

<a id="member-24"></a>
##### `placer()`

- Description: TODO

<a id="member-25"></a>
##### `getmapstate(Coord3f pc)`

- Description: TODO

<a id="member-32"></a>
##### `Buffer(Glob glob, Area area, long seed)`

- Description: TODO

<a id="member-33"></a>
##### `matslot(NodeWrap mat)`

- Description: TODO

<a id="member-34"></a>
##### `add(Gob ob, NodeWrap mat)`

- Description: TODO

<a id="member-35"></a>
##### `add(Gob ob)`

- Description: TODO

<a id="member-36"></a>
##### `datum(Function<Buffer, T> id)`

- Description: TODO

<a id="member-37"></a>
##### `finish(Runnable act)`

- Description: TODO

<a id="member-38"></a>
##### `finish()`

- Description: TODO

<a id="member-44"></a>
##### `Terrain(MapSource grid, MapSource map, int tile, Area area, Coord toff)`

- Description: TODO

<a id="member-46"></a>
##### `mask()`

- Description: TODO

<a id="member-48"></a>
##### `tiles()`

- Description: TODO

<a id="member-49"></a>
##### `gettile(Coord tc)`

- Description: TODO

<a id="member-50"></a>
##### `getfz(Coord tc)`

- Description: TODO

<a id="member-51"></a>
##### `tileset(int t)`

- Description: TODO

<a id="member-52"></a>
##### `tiler(int t)`

- Description: TODO

<a id="member-53"></a>
##### `public void flavor(Buffer buf, Terrain trn, Random seed);`

- Description: TODO

<a id="member-54"></a>
##### `public Flavor make(Tileset trn, Object... args);`

- Description: TODO

<a id="member-55"></a>
##### `FactMaker()`

- Description: TODO

<a id="member-59"></a>
##### `Res(Resource res, Message buf)`

- Description: TODO

<a id="member-60"></a>
##### `get()`

- Description: TODO

<a id="member-61"></a>
##### `init()`

- Description: TODO

<a id="member-64"></a>
##### `SpriteFlavor(Indir<Resource> res, double p)`

- Description: TODO

<a id="member-65"></a>
##### `flavor(Buffer buf, Terrain trn, Random seed)`

- Description: TODO

<a id="member-66"></a>
##### `tfac()`

- Description: TODO

<a id="member-67"></a>
##### `packtiles(Collection<Tile> tiles, Coord tsz)`

- Description: TODO

<a id="member-68"></a>
##### `init()`

- Description: TODO
