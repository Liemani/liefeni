# FastMesh

This file documents the responsibilities and members of `FastMesh`.

## Meta

- Source: [FastMesh.java](../../../src/haven/FastMesh.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the fast mesh Haven component.

## Nested Types

### Instanced

- Role: Represents instanced within FastMesh.
- Description: Describes the nested instanced type used by the enclosing class.

### MeshRes

- Role: Represents mesh res within FastMesh.
- Description: Describes the nested mesh res type used by the enclosing class.

### ResourceMesh

- Role: Represents resource mesh within FastMesh.
- Description: Describes the nested resource mesh type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final VertexBuf vert`
- Role: Stores the vert value.
- Description: Backs the cached state for this file.

#### `public final ShortBuffer indb`
- Role: Stores the indb value.
- Description: Backs the cached state for this file.

#### `public final int num`
- Role: Stores the num value.
- Description: Backs the cached state for this file.

#### `public final Model model`
- Role: Holds the model state.
- Description: Backs the cached state for this file.

#### `private Volume3f bounds`
- Role: Holds the bounds state.
- Description: Backs the cached state for this file.

#### `public final InstanceBatch bat`
- Role: Holds the bat state.
- Description: Backs the cached state for this file.

#### `private final InstanceBatch.AttributeData attr`
- Role: Holds the attr state.
- Description: Backs the cached state for this file.

#### `private final Layout fmt`
- Role: Holds the fmt state.
- Description: Backs the cached state for this file.

#### `private VertexArray data`
- Role: Caches data entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private Model model`
- Role: Holds the model state.
- Description: Backs the cached state for this file.

#### `private int ninst`
- Role: Stores the ninst value.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Resource res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final MeshRes info`
- Role: Holds the info state.
- Description: Backs the cached state for this file.

#### `public transient FastMesh m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `public transient Material.Res mat`
- Role: Holds the mat state.
- Description: Backs the cached state for this file.

#### `public final Map<String, Object> info`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `private transient short[] tmp`
- Role: Stores the tmp value.
- Description: Backs the cached state for this file.

#### `private int vbufid`
- Role: Stores the vbufid value.
- Description: Backs the cached state for this file.

#### `@Deprecated public final Map<String, String> rdat`
- Role: Caches rdat entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `@Deprecated public final int ref`
- Role: Stores the ref value.
- Description: Backs the cached state for this file.

### Methods

#### `public FastMesh(VertexBuf vert, ShortBuffer ind)`
- Role: Creates a new FastMesh instance.
- Description: Constructs the instance and initializes its default state.

#### `public FastMesh(VertexBuf vert, short[] ind)`
- Role: Creates a new FastMesh instance.
- Description: Constructs the instance and initializes its default state.

#### `private FillBuffer indfill(Indices ibuf, Environment env)`
- Role: Performs indfill.
- Description: Supports the indfill operation used by the surrounding class.

#### `private void cbounds()`
- Role: Performs cbounds.
- Description: Supports the cbounds operation used by the surrounding class.

#### `public Volume3f bounds()`
- Role: Performs bounds.
- Description: Supports the bounds operation used by the surrounding class.

#### `public Coord3f nbounds()`
- Role: Performs nbounds.
- Description: Supports the nbounds operation used by the surrounding class.

#### `public Coord3f pbounds()`
- Role: Performs pbounds.
- Description: Supports the pbounds operation used by the surrounding class.

#### `public void draw(Pipe context, Render out)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `private Layout mkfmt(Layout.Input[] ifmt)`
- Role: Performs mkfmt.
- Description: Supports the mkfmt operation used by the surrounding class.

#### `private VertexArray mkdata(Layout.Input[] ifmt, VertexArray.Buffer ibuf)`
- Role: Performs mkdata.
- Description: Supports the mkdata operation used by the surrounding class.

#### `private Instanced(InstanceBatch bat)`
- Role: Performs instanced.
- Description: Supports the instanced operation used by the surrounding class.

#### `public void draw(Pipe context, Render out)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `private void modupdate(boolean batupd)`
- Role: Performs modupdate.
- Description: Supports the modupdate operation used by the surrounding class.

#### `private void vertupdate()`
- Role: Performs vertupdate.
- Description: Supports the vertupdate operation used by the surrounding class.

#### `public void iupdate(int idx)`
- Role: Performs iupdate.
- Description: Supports the iupdate operation used by the surrounding class.

#### `public void itrim(int idx)`
- Role: Performs itrim.
- Description: Supports the itrim operation used by the surrounding class.

#### `public void commit(Render g)`
- Role: Performs commit.
- Description: Supports the commit operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Rendered.Instanced instancify(InstanceBatch bat)`
- Role: Performs instancify.
- Description: Supports the instancify operation used by the surrounding class.

#### `public ResourceMesh(VertexBuf vert, short[] ind, MeshRes info)`
- Role: Performs resource mesh.
- Description: Supports the resource mesh operation used by the surrounding class.

#### `public Map<String, Object> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `private static int decdelta(Message buf, boolean[] pickp)`
- Role: Performs decdelta.
- Description: Supports the decdelta operation used by the surrounding class.

#### `private static void unstrip(Message buf, short[] ind)`
- Role: Performs unstrip.
- Description: Supports the unstrip operation used by the surrounding class.

#### `public MeshRes(Resource res, Message buf)`
- Role: Performs mesh res.
- Description: Supports the mesh res operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.

#### `public Integer layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.

#### `public Map<String, Object> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.
