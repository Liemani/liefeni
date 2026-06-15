# FastMesh

This file documents the responsibilities and members of `FastMesh`.

## Meta

- Source: [FastMesh.java](../../../src/haven/FastMesh.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides a fast mesh data structure.

## Nested Types

### Instanced

- Description: TODO

### MeshRes

- Description: TODO

### ResourceMesh

- Description: TODO

## Members

### Constants

### Fields

#### `public final VertexBuf vert`

- Description: TODO

#### `public final ShortBuffer indb`

- Description: TODO

#### `public final int num`

- Description: TODO

#### `public final Model model`

- Description: TODO

#### `private Volume3f bounds`

- Description: TODO

#### `public final InstanceBatch bat`

- Description: TODO

#### `private final InstanceBatch.AttributeData attr`

- Description: TODO

#### `private final Layout fmt`

- Description: TODO

#### `private VertexArray data`

- Description: TODO

#### `private Model model`

- Description: TODO

#### `private int ninst`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final Resource res`

- Description: TODO

#### `public final MeshRes info`

- Description: TODO

#### `public transient FastMesh m`

- Description: TODO

#### `public transient Material.Res mat`

- Description: TODO

#### `public final Map<String, Object> info`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `private transient short[] tmp`

- Description: TODO

#### `private int vbufid`

- Description: TODO

#### `@Deprecated public final Map<String, String> rdat`

- Description: TODO

#### `@Deprecated public final int ref`

- Description: TODO

### Methods

#### `public FastMesh(VertexBuf vert, ShortBuffer ind)`

- Description: TODO

#### `public FastMesh(VertexBuf vert, short[] ind)`

- Description: TODO

#### `private FillBuffer indfill(Indices ibuf, Environment env)`

- Description: TODO

#### `private void cbounds()`

- Description: TODO

#### `public Volume3f bounds()`

- Description: TODO

#### `public Coord3f nbounds()`

- Description: TODO

#### `public Coord3f pbounds()`

- Description: TODO

#### `public void draw(Pipe context, Render out)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `private Layout mkfmt(Layout.Input[] ifmt)`

- Description: TODO

#### `private VertexArray mkdata(Layout.Input[] ifmt, VertexArray.Buffer ibuf)`

- Description: TODO

#### `private Instanced(InstanceBatch bat)`

- Description: TODO

#### `public void draw(Pipe context, Render out)`

- Description: TODO

#### `private void modupdate(boolean batupd)`

- Description: TODO

#### `private void vertupdate()`

- Description: TODO

#### `public void iupdate(int idx)`

- Description: TODO

#### `public void itrim(int idx)`

- Description: TODO

#### `public void commit(Render g)`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Rendered.Instanced instancify(InstanceBatch bat)`

- Description: TODO

#### `public ResourceMesh(VertexBuf vert, short[] ind, MeshRes info)`

- Description: TODO

#### `public Map<String, Object> info()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `private static int decdelta(Message buf, boolean[] pickp)`

- Description: TODO

#### `private static void unstrip(Message buf, short[] ind)`

- Description: TODO

#### `public MeshRes(Resource res, Message buf)`

- Description: TODO

#### `public void init()`

- Description: TODO

#### `public Integer layerid()`

- Description: TODO

#### `public Map<String, Object> info()`

- Description: TODO
