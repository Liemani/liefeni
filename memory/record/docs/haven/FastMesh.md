---
source: [FastMesh.java](../../../../src/haven/FastMesh.java)
created: 2026-06-13
updated: 2026-06-14
---

# FastMesh

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
- Role: Caches the vert value.
- Description: Caches the `vert` value for reuse.

#### `public final ShortBuffer indb`
- Role: Caches the indb value.
- Description: Caches the `indb` value for reuse.

#### `public final int num`
- Role: Caches the num value.
- Description: Caches the `num` value for reuse.

#### `public final Model model`
- Role: Caches the model value.
- Description: Caches the `model` value for reuse.

#### `private Volume3f bounds`
- Role: Caches the bounds value.
- Description: Caches the `bounds` value for reuse.

#### `public final InstanceBatch bat`
- Role: Caches the bat value.
- Description: Caches the `bat` value for reuse.

#### `private final InstanceBatch.AttributeData attr`
- Role: Caches the attr value.
- Description: Caches the `attr` value for reuse.

#### `private final Layout fmt`
- Role: Caches the fmt value.
- Description: Caches the `fmt` value for reuse.

#### `private VertexArray data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private Model model`
- Role: Caches the model value.
- Description: Caches the `model` value for reuse.

#### `private int ninst`
- Role: Caches the ninst value.
- Description: Caches the `ninst` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Resource res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final MeshRes info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `public transient FastMesh m`
- Role: Caches the m value.
- Description: Caches the `m` value for reuse.

#### `public transient Material.Res mat`
- Role: Caches the mat value.
- Description: Caches the `mat` value for reuse.

#### `public final Map<String, Object> info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `private transient short[] tmp`
- Role: Caches the tmp value.
- Description: Caches the `tmp` value for reuse.

#### `private int vbufid`
- Role: Caches the vbufid value.
- Description: Caches the `vbufid` value for reuse.

#### `@Deprecated public final Map<String, String> rdat`
- Role: Caches the rdat value.
- Description: Caches the `rdat` value for reuse.

#### `@Deprecated public final int ref`
- Role: Caches the ref value.
- Description: Caches the `ref` value for reuse.

### Methods

#### `public FastMesh(VertexBuf vert, ShortBuffer ind)`
- Role: Creates a new FastMesh instance.
- Description: Constructs the FastMesh instance from the supplied inputs.

#### `public FastMesh(VertexBuf vert, short[] ind)`
- Role: Creates a new FastMesh instance.
- Description: Constructs the FastMesh instance from the supplied inputs.

#### `private FillBuffer indfill(Indices ibuf, Environment env)`
- Role: Handles the indfill path.
- Description: Implements the indfill operation.

#### `private void cbounds()`
- Role: Handles the cbounds path.
- Description: Implements the cbounds operation.

#### `public Volume3f bounds()`
- Role: Handles the bounds path.
- Description: Computes the rendered bounds of a part chain.

#### `public Coord3f nbounds()`
- Role: Handles the nbounds path.
- Description: Implements the nbounds operation.

#### `public Coord3f pbounds()`
- Role: Handles the pbounds path.
- Description: Implements the pbounds operation.

#### `public void draw(Pipe context, Render out)`
- Role: Draws the current content.
- Description: Draws the FastMesh content.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `private Layout mkfmt(Layout.Input[] ifmt)`
- Role: Handles the mkfmt path.
- Description: Implements the mkfmt operation.

#### `private VertexArray mkdata(Layout.Input[] ifmt, VertexArray.Buffer ibuf)`
- Role: Handles the mkdata path.
- Description: Implements the mkdata operation.

#### `private Instanced(InstanceBatch bat)`
- Role: Handles the instanced path.
- Description: Implements the instanced operation.

#### `public void draw(Pipe context, Render out)`
- Role: Draws the current content.
- Description: Draws the FastMesh content.

#### `private void modupdate(boolean batupd)`
- Role: Handles the modupdate path.
- Description: Implements the modupdate operation.

#### `private void vertupdate()`
- Role: Handles the vertupdate path.
- Description: Implements the vertupdate operation.

#### `public void iupdate(int idx)`
- Role: Handles the iupdate path.
- Description: Implements the iupdate operation.

#### `public void itrim(int idx)`
- Role: Handles the itrim path.
- Description: Implements the itrim operation.

#### `public void commit(Render g)`
- Role: Handles the commit path.
- Description: Implements the commit operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this FastMesh for debugging and logging.

#### `public Rendered.Instanced instancify(InstanceBatch bat)`
- Role: Handles the instancify path.
- Description: Implements the instancify operation.

#### `public ResourceMesh(VertexBuf vert, short[] ind, MeshRes info)`
- Role: Handles the resource mesh path.
- Description: Implements the resource mesh operation.

#### `public Map<String, Object> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this FastMesh for debugging and logging.

#### `private static int decdelta(Message buf, boolean[] pickp)`
- Role: Handles the decdelta path.
- Description: Implements the decdelta operation.

#### `private static void unstrip(Message buf, short[] ind)`
- Role: Handles the unstrip path.
- Description: Implements the unstrip operation.

#### `public MeshRes(Resource res, Message buf)`
- Role: Handles the mesh resource path.
- Description: Implements the mesh res operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.

#### `public Integer layerid()`
- Role: Handles the layerid path.
- Description: Implements the layerid operation.

#### `public Map<String, Object> info()`
- Role: Handles the info path.
- Description: Implements the info operation.