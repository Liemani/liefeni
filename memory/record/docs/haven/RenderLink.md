---
source: [RenderLink.java](../../../src/haven/RenderLink.java)
created: 2026-06-13
updated: 2026-06-14
---

# RenderLink

Represents the render link Haven component.

## Members

### Constants

### Fields

#### `public final Resource srcres`
- Role: Stores the srcres value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> mesh, mat`
- Role: Stores the mat value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> mesh, mat`
- Role: Stores the mat value.
- Description: Backs the cached state for this file.

#### `public final int meshid, matid`
- Role: Stores the matid value.
- Description: Backs the cached state for this file.

#### `public final int meshid, matid`
- Role: Stores the matid value.
- Description: Backs the cached state for this file.

#### `private Node res = null`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> from`
- Role: Stores the from value.
- Description: Backs the cached state for this file.

#### `public final int meshid, meshmask`
- Role: Stores the meshmask value.
- Description: Backs the cached state for this file.

#### `public final int meshid, meshmask`
- Role: Stores the meshmask value.
- Description: Backs the cached state for this file.

#### `private Node res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Resource from`
- Role: Stores the from value.
- Description: Backs the cached state for this file.

#### `public final Indir<Resource> res`
- Role: Stores the res value.
- Description: Backs the cached state for this file.

#### `public final Object[] args`
- Role: Holds the args state.
- Description: Backs the cached state for this file.

#### `private Resource lres`
- Role: Stores the lres value.
- Description: Backs the cached state for this file.

#### `private RenderLink link = null`
- Role: Holds the link state.
- Description: Backs the cached state for this file.

#### `public transient final RenderLink l`
- Role: Holds the l state.
- Description: Backs the cached state for this file.

#### `public final int id`
- Role: Stores the id value.
- Description: Backs the cached state for this file.

#### `public final Map<String, Object> info`
- Role: Caches info entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public Node make(Owner owner)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public default Node make()`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public MeshMat(Resource srcres, Indir<Resource> mesh, int meshid, Indir<Resource> mat, int matid)`
- Role: Performs mesh mat.
- Description: Supports the mesh mat operation used by the surrounding class.

#### `public static MeshMat parse(Resource res, Message buf)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public Node make(Owner owner)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public AmbientLink(Indir<Resource> res)`
- Role: Performs ambient link.
- Description: Supports the ambient link operation used by the surrounding class.

#### `public static AmbientLink parse(Resource res, Message buf)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public Node make(Owner owner)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public Collect(Indir<Resource> from, int meshid, int meshmask)`
- Role: Performs collect.
- Description: Supports the collect operation used by the surrounding class.

#### `public static Collect parse(Resource res, Message buf)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public Node make(Owner owner)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public ResSprite(Indir<Resource> res)`
- Role: Performs res sprite.
- Description: Supports the res sprite operation used by the surrounding class.

#### `public static ResSprite parse(Resource res, Message buf)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public Node make(Owner owner)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public Parameters(Resource from, Indir<Resource> res, Object[] args)`
- Role: Performs parameters.
- Description: Supports the parameters operation used by the surrounding class.

#### `public static Parameters parse(Resource res, Message buf)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public Node make(Owner owner)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public ArgMaker()`
- Role: Performs arg maker.
- Description: Supports the arg maker operation used by the surrounding class.

#### `public RenderLink parse(Resource res, Object... args)`
- Role: Performs parse.
- Description: Supports the parse operation used by the surrounding class.

#### `public Res(Resource res, Message buf)`
- Role: Performs res.
- Description: Supports the res operation used by the surrounding class.

#### `public Integer layerid()`
- Role: Performs layerid.
- Description: Supports the layerid operation used by the surrounding class.

#### `public Map<String, Object> info()`
- Role: Performs info.
- Description: Supports the info operation used by the surrounding class.

#### `public void init()`
- Role: Performs init.
- Description: Supports the init operation used by the surrounding class.
