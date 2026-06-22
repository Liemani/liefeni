---
source: [RenderLink.java](../../../../src/haven/RenderLink.java)
created: 2026-06-13
updated: 2026-06-14
---

# RenderLink

Represents the render link Haven component.

## Members

### Constants

### Fields

#### `public final Resource srcres`
- Role: Caches the srcres value.
- Description: Caches the `srcres` value for reuse.

#### `public final Indir<Resource> mesh, mat`
- Role: Caches the mat value.
- Description: Caches the `mat` value for reuse.

#### `public final Indir<Resource> mesh, mat`
- Role: Caches the mat value.
- Description: Caches the `mat` value for reuse.

#### `public final int meshid, matid`
- Role: Caches the matid value.
- Description: Caches the `matid` value for reuse.

#### `public final int meshid, matid`
- Role: Caches the matid value.
- Description: Caches the `matid` value for reuse.

#### `private Node res = null`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Indir<Resource> from`
- Role: Caches the from value.
- Description: Caches the `from` value for reuse.

#### `public final int meshid, meshmask`
- Role: Caches the meshmask value.
- Description: Caches the `meshmask` value for reuse.

#### `public final int meshid, meshmask`
- Role: Caches the meshmask value.
- Description: Caches the `meshmask` value for reuse.

#### `private Node res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Resource from`
- Role: Caches the from value.
- Description: Caches the `from` value for reuse.

#### `public final Indir<Resource> res`
- Role: Caches the res value.
- Description: Caches the `res` value for reuse.

#### `public final Object[] args`
- Role: Caches the args value.
- Description: Caches the `args` value for reuse.

#### `private Resource lres`
- Role: Caches the lres value.
- Description: Caches the `lres` value for reuse.

#### `private RenderLink link = null`
- Role: Caches the link value.
- Description: Caches the `link` value for reuse.

#### `public transient final RenderLink l`
- Role: Caches the l value.
- Description: Caches the `l` value for reuse.

#### `public final int id`
- Role: Caches the id value.
- Description: Caches the `id` value for reuse.

#### `public final Map<String, Object> info`
- Role: Caches the info value.
- Description: Caches the `info` value for reuse.

### Methods

#### `public Node make(Owner owner)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public default Node make()`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public MeshMat(Resource srcres, Indir<Resource> mesh, int meshid, Indir<Resource> mat, int matid)`
- Role: Handles the mesh mat path.
- Description: Implements the mesh mat operation.

#### `public static MeshMat parse(Resource res, Message buf)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public Node make(Owner owner)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public AmbientLink(Indir<Resource> res)`
- Role: Handles the ambient link path.
- Description: Implements the ambient link operation.

#### `public static AmbientLink parse(Resource res, Message buf)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public Node make(Owner owner)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public Collect(Indir<Resource> from, int meshid, int meshmask)`
- Role: Handles the collect path.
- Description: Implements the collect operation.

#### `public static Collect parse(Resource res, Message buf)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public Node make(Owner owner)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public ResSprite(Indir<Resource> res)`
- Role: Handles the resource sprite path.
- Description: Implements the res sprite operation.

#### `public static ResSprite parse(Resource res, Message buf)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public Node make(Owner owner)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public Parameters(Resource from, Indir<Resource> res, Object[] args)`
- Role: Handles the parameters path.
- Description: Implements the parameters operation.

#### `public static Parameters parse(Resource res, Message buf)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public Node make(Owner owner)`
- Role: Handles the make path.
- Description: Implements the make operation.

#### `public ArgMaker()`
- Role: Handles the arg maker path.
- Description: Implements the arg maker operation.

#### `public RenderLink parse(Resource res, Object... args)`
- Role: Handles the parse path.
- Description: Implements the parse operation.

#### `public Res(Resource res, Message buf)`
- Role: Handles the resource path.
- Description: Implements the res operation.

#### `public Integer layerid()`
- Role: Handles the layerid path.
- Description: Implements the layerid operation.

#### `public Map<String, Object> info()`
- Role: Handles the info path.
- Description: Implements the info operation.

#### `public void init()`
- Role: Handles the init path.
- Description: Initializes the class-local cache or runtime state.