# MeshBuf

## Meta

- Source: [MeshBuf.java](../../../src/haven/MeshBuf.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

- Stores mutable mesh buffers.

## Code Members

### Member Index

#### Fields

- [v](#member-1)
- [f](#member-2)
- [vbuf](#member-3)
- [nextid](#member-4)
- [layers](#member-5)
- [lids](#member-6)
- [idx](#member-7)
- [cl](#member-14)
- [cons](#member-15)
- [tex](#member-20)
- [col](#member-22)
- [attrib](#member-24)
- [attrib](#member-34)
- [pos](#member-45)
- [nrm](#member-46)
- [attrs](#member-47)
- [idx](#member-48)
- [v1](#member-51)
- [v2](#member-52)
- [v3](#member-53)
- [defmapper](#member-57)

#### Methods

- [Layer()](#member-8)
- [set(Vertex v, T data)](#member-9)
- [get(Vertex v)](#member-10)
- [public abstract VertexBuf.AttribData build(Collection<T> in);](#member-11)
- [copy(VertexBuf src, Vertex[] vmap, int off)](#member-12)
- [public abstract L cons(MeshBuf buf);](#member-13)
- [CLayerID(Class<L> cl)](#member-16)
- [cons(MeshBuf buf)](#member-17)
- [build(Collection<Coord3f> in)](#member-18)
- [copy(VertexBuf buf, Vertex[] vmap, int off)](#member-19)
- [build(Collection<Color> in)](#member-21)
- [AttribData(Attribute attrib, int nc, FloatBuffer data)](#member-23)
- [AttribLayer(Attribute attrib)](#member-25)
- [Vec1Layer(Attribute attrib)](#member-26)
- [build(Collection<Float> in)](#member-27)
- [Vec2Layer(Attribute attrib)](#member-28)
- [build(Collection<Coord3f> in)](#member-29)
- [Vec3Layer(Attribute attrib)](#member-30)
- [build(Collection<Coord3f> in)](#member-31)
- [Vec4Layer(Attribute attrib)](#member-32)
- [build(Collection<float[]> in)](#member-33)
- [ALayerID(Attribute attrib)](#member-35)
- [V1LayerID(Attribute attrib)](#member-36)
- [cons(MeshBuf buf)](#member-37)
- [V2LayerID(Attribute attrib)](#member-38)
- [cons(MeshBuf buf)](#member-39)
- [V3LayerID(Attribute attrib)](#member-40)
- [cons(MeshBuf buf)](#member-41)
- [V4LayerID(Attribute attrib)](#member-42)
- [cons(MeshBuf buf)](#member-43)
- [layer(LayerID<L> id)](#member-44)
- [Vertex(Coord3f pos, Coord3f nrm)](#member-49)
- [toString()](#member-50)
- [Face(Vertex v1, Vertex v2, Vertex v3)](#member-54)
- [public Layer mapbuf(MeshBuf buf, VertexBuf.AttribData src);](#member-55)
- [copy(FastMesh src, LayerMapper mapper)](#member-56)
- [copy(FastMesh src)](#member-58)
- [mklayer(Layer<T> l, Object[] abuf)](#member-59)
- [mkvbuf()](#member-60)
- [clearfaces()](#member-61)
- [mkmesh()](#member-62)
- [emptyp()](#member-63)

### Member Reference

#### Fields

<a id="member-1"></a>
##### `v`

- Description: TODO

<a id="member-2"></a>
##### `f`

- Description: TODO

<a id="member-3"></a>
##### `vbuf`

- Description: TODO

<a id="member-4"></a>
##### `nextid`

- Description: TODO

<a id="member-5"></a>
##### `layers`

- Description: TODO

<a id="member-6"></a>
##### `lids`

- Description: TODO

<a id="member-7"></a>
##### `idx`

- Description: TODO

<a id="member-14"></a>
##### `cl`

- Description: TODO

<a id="member-15"></a>
##### `cons`

- Description: TODO

<a id="member-20"></a>
##### `tex`

- Description: TODO

<a id="member-22"></a>
##### `col`

- Description: TODO

<a id="member-24"></a>
##### `attrib`

- Description: TODO

<a id="member-34"></a>
##### `attrib`

- Description: TODO

<a id="member-45"></a>
##### `pos`

- Description: TODO

<a id="member-46"></a>
##### `nrm`

- Description: TODO

<a id="member-47"></a>
##### `attrs`

- Description: TODO

<a id="member-48"></a>
##### `idx`

- Description: TODO

<a id="member-51"></a>
##### `v1`

- Description: TODO

<a id="member-52"></a>
##### `v2`

- Description: TODO

<a id="member-53"></a>
##### `v3`

- Description: TODO

<a id="member-57"></a>
##### `defmapper`

- Description: TODO

#### Methods

<a id="member-8"></a>
##### `Layer()`

- Description: TODO

<a id="member-9"></a>
##### `set(Vertex v, T data)`

- Description: TODO

<a id="member-10"></a>
##### `get(Vertex v)`

- Description: TODO

<a id="member-11"></a>
##### `public abstract VertexBuf.AttribData build(Collection<T> in);`

- Description: TODO

<a id="member-12"></a>
##### `copy(VertexBuf src, Vertex[] vmap, int off)`

- Description: TODO

<a id="member-13"></a>
##### `public abstract L cons(MeshBuf buf);`

- Description: TODO

<a id="member-16"></a>
##### `CLayerID(Class<L> cl)`

- Description: TODO

<a id="member-17"></a>
##### `cons(MeshBuf buf)`

- Description: TODO

<a id="member-18"></a>
##### `build(Collection<Coord3f> in)`

- Description: TODO

<a id="member-19"></a>
##### `copy(VertexBuf buf, Vertex[] vmap, int off)`

- Description: TODO

<a id="member-21"></a>
##### `build(Collection<Color> in)`

- Description: TODO

<a id="member-23"></a>
##### `AttribData(Attribute attrib, int nc, FloatBuffer data)`

- Description: TODO

<a id="member-25"></a>
##### `AttribLayer(Attribute attrib)`

- Description: TODO

<a id="member-26"></a>
##### `Vec1Layer(Attribute attrib)`

- Description: TODO

<a id="member-27"></a>
##### `build(Collection<Float> in)`

- Description: TODO

<a id="member-28"></a>
##### `Vec2Layer(Attribute attrib)`

- Description: TODO

<a id="member-29"></a>
##### `build(Collection<Coord3f> in)`

- Description: TODO

<a id="member-30"></a>
##### `Vec3Layer(Attribute attrib)`

- Description: TODO

<a id="member-31"></a>
##### `build(Collection<Coord3f> in)`

- Description: TODO

<a id="member-32"></a>
##### `Vec4Layer(Attribute attrib)`

- Description: TODO

<a id="member-33"></a>
##### `build(Collection<float[]> in)`

- Description: TODO

<a id="member-35"></a>
##### `ALayerID(Attribute attrib)`

- Description: TODO

<a id="member-36"></a>
##### `V1LayerID(Attribute attrib)`

- Description: TODO

<a id="member-37"></a>
##### `cons(MeshBuf buf)`

- Description: TODO

<a id="member-38"></a>
##### `V2LayerID(Attribute attrib)`

- Description: TODO

<a id="member-39"></a>
##### `cons(MeshBuf buf)`

- Description: TODO

<a id="member-40"></a>
##### `V3LayerID(Attribute attrib)`

- Description: TODO

<a id="member-41"></a>
##### `cons(MeshBuf buf)`

- Description: TODO

<a id="member-42"></a>
##### `V4LayerID(Attribute attrib)`

- Description: TODO

<a id="member-43"></a>
##### `cons(MeshBuf buf)`

- Description: TODO

<a id="member-44"></a>
##### `layer(LayerID<L> id)`

- Description: TODO

<a id="member-49"></a>
##### `Vertex(Coord3f pos, Coord3f nrm)`

- Description: TODO

<a id="member-50"></a>
##### `toString()`

- Description: TODO

<a id="member-54"></a>
##### `Face(Vertex v1, Vertex v2, Vertex v3)`

- Description: TODO

<a id="member-55"></a>
##### `public Layer mapbuf(MeshBuf buf, VertexBuf.AttribData src);`

- Description: TODO

<a id="member-56"></a>
##### `copy(FastMesh src, LayerMapper mapper)`

- Description: TODO

<a id="member-58"></a>
##### `copy(FastMesh src)`

- Description: TODO

<a id="member-59"></a>
##### `mklayer(Layer<T> l, Object[] abuf)`

- Description: TODO

<a id="member-60"></a>
##### `mkvbuf()`

- Description: TODO

<a id="member-61"></a>
##### `clearfaces()`

- Description: TODO

<a id="member-62"></a>
##### `mkmesh()`

- Description: TODO

<a id="member-63"></a>
##### `emptyp()`

- Description: TODO
