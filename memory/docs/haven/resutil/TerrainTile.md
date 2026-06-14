# TerrainTile

## Meta

- Source: [TerrainTile.java](../../../../src/haven/resutil/TerrainTile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Represents a terrain tile helper.

## Code Members

### Member Index

#### Fields

- [base](#member-1)
- [noise](#member-2)
- [var](#member-3)
- [transset](#member-4)
- [draw](#member-5)
- [mat](#member-6)
- [thrl](#member-7)
- [thrh](#member-8)
- [nz](#member-9)
- [draw](#member-10)
- [sr](#member-12)
- [m](#member-13)
- [vs](#member-14)
- [es](#member-15)
- [bv](#member-16)
- [en](#member-17)
- [lvfac](#member-20)
- [blend](#member-21)
- [transtex](#member-25)
- [rcons](#member-30)
- [rth](#member-31)

#### Methods

- [Var(NodeWrap mat, double thrl, double thrh, double nz)](#member-11)
- [Blend(MapMesh m)](#member-18)
- [setbase(float[][] bv)](#member-19)
- [create(int id, Tileset set)](#member-22)
- [lay(MapMesh m, Random rnd, Coord lc, Coord gc)](#member-23)
- [faces(MapMesh m, MPart d)](#member-24)
- [_faces(MapMesh m, int z, Tile trans, MPart d)](#member-26)
- [tcons(final int z, final Tile t)](#member-27)
- [tcons(final int z, final int bmask, final int cmask)](#member-28)
- [trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)](#member-29)
- [create(int id, Tileset set)](#member-32)
- [RidgeTile(int id, SNoise3 noise, NodeWrap base, Var[] var, Tileset transset, int rth, Pipe.Op rmat, float texh)](#member-33)
- [RidgeTile(int id, RidgeTile from)](#member-34)
- [breakz()](#member-35)
- [model(MapMesh m, Random rnd, Coord lc, Coord gc)](#member-36)
- [lay(MapMesh m, Coord lc, Coord gc, MCons cons, boolean cover)](#member-37)
- [lay(MapMesh m, Random rnd, Coord lc, Coord gc)](#member-38)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `base`

- Description: TODO

<a id="member-2"></a>
##### `noise`

- Description: TODO

<a id="member-3"></a>
##### `var`

- Description: TODO

<a id="member-4"></a>
##### `transset`

- Description: TODO

<a id="member-5"></a>
##### `draw`

- Description: TODO

<a id="member-6"></a>
##### `mat`

- Description: TODO

<a id="member-7"></a>
##### `thrl`

- Description: TODO

<a id="member-8"></a>
##### `thrh`

- Description: TODO

<a id="member-9"></a>
##### `nz`

- Description: TODO

<a id="member-10"></a>
##### `draw`

- Description: TODO

<a id="member-12"></a>
##### `sr`

- Description: TODO

<a id="member-13"></a>
##### `m`

- Description: TODO

<a id="member-14"></a>
##### `vs`

- Description: TODO

<a id="member-15"></a>
##### `es`

- Description: TODO

<a id="member-16"></a>
##### `bv`

- Description: TODO

<a id="member-17"></a>
##### `en`

- Description: TODO

<a id="member-20"></a>
##### `lvfac`

- Description: TODO

<a id="member-21"></a>
##### `blend`

- Description: TODO

<a id="member-25"></a>
##### `transtex`

- Description: TODO

<a id="member-30"></a>
##### `rcons`

- Description: TODO

<a id="member-31"></a>
##### `rth`

- Description: TODO

#### Methods

<a id="member-11"></a>
##### `Var(NodeWrap mat, double thrl, double thrh, double nz)`

- Description: TODO

<a id="member-18"></a>
##### `Blend(MapMesh m)`

- Description: TODO

<a id="member-19"></a>
##### `setbase(float[][] bv)`

- Description: TODO

<a id="member-22"></a>
##### `create(int id, Tileset set)`

- Description: TODO

<a id="member-23"></a>
##### `lay(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

<a id="member-24"></a>
##### `faces(MapMesh m, MPart d)`

- Description: TODO

<a id="member-26"></a>
##### `_faces(MapMesh m, int z, Tile trans, MPart d)`

- Description: TODO

<a id="member-27"></a>
##### `tcons(final int z, final Tile t)`

- Description: TODO

<a id="member-28"></a>
##### `tcons(final int z, final int bmask, final int cmask)`

- Description: TODO

<a id="member-29"></a>
##### `trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`

- Description: TODO

<a id="member-32"></a>
##### `create(int id, Tileset set)`

- Description: TODO

<a id="member-33"></a>
##### `RidgeTile(int id, SNoise3 noise, NodeWrap base, Var[] var, Tileset transset, int rth, Pipe.Op rmat, float texh)`

- Description: TODO

<a id="member-34"></a>
##### `RidgeTile(int id, RidgeTile from)`

- Description: TODO

<a id="member-35"></a>
##### `breakz()`

- Description: TODO

<a id="member-36"></a>
##### `model(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

<a id="member-37"></a>
##### `lay(MapMesh m, Coord lc, Coord gc, MCons cons, boolean cover)`

- Description: TODO

<a id="member-38"></a>
##### `lay(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO
