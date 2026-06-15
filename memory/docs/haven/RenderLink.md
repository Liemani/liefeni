# RenderLink

This file documents the responsibilities and members of `RenderLink`.

## Meta

- Source: [RenderLink.java](../../../src/haven/RenderLink.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Links render state or resources.

## Members

### Constants

### Fields

#### `public final Resource srcres`

- Description: TODO

#### `public final Indir<Resource> mesh, mat`

- Description: TODO

#### `public final Indir<Resource> mesh, mat`

- Description: TODO

#### `public final int meshid, matid`

- Description: TODO

#### `public final int meshid, matid`

- Description: TODO

#### `private Node res = null`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final Indir<Resource> from`

- Description: TODO

#### `public final int meshid, meshmask`

- Description: TODO

#### `public final int meshid, meshmask`

- Description: TODO

#### `private Node res`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final Resource from`

- Description: TODO

#### `public final Indir<Resource> res`

- Description: TODO

#### `public final Object[] args`

- Description: TODO

#### `private Resource lres`

- Description: TODO

#### `private RenderLink link = null`

- Description: TODO

#### `public transient final RenderLink l`

- Description: TODO

#### `public final int id`

- Description: TODO

#### `public final Map<String, Object> info`

- Description: TODO

### Methods

#### `public Node make(Owner owner)`

- Description: TODO

#### `public default Node make()`

- Description: TODO

#### `public MeshMat(Resource srcres, Indir<Resource> mesh, int meshid, Indir<Resource> mat, int matid)`

- Description: TODO

#### `public static MeshMat parse(Resource res, Message buf)`

- Description: TODO

#### `public Node make(Owner owner)`

- Description: TODO

#### `public AmbientLink(Indir<Resource> res)`

- Description: TODO

#### `public static AmbientLink parse(Resource res, Message buf)`

- Description: TODO

#### `public Node make(Owner owner)`

- Description: TODO

#### `public Collect(Indir<Resource> from, int meshid, int meshmask)`

- Description: TODO

#### `public static Collect parse(Resource res, Message buf)`

- Description: TODO

#### `public Node make(Owner owner)`

- Description: TODO

#### `public ResSprite(Indir<Resource> res)`

- Description: TODO

#### `public static ResSprite parse(Resource res, Message buf)`

- Description: TODO

#### `public Node make(Owner owner)`

- Description: TODO

#### `public Parameters(Resource from, Indir<Resource> res, Object[] args)`

- Description: TODO

#### `public static Parameters parse(Resource res, Message buf)`

- Description: TODO

#### `public Node make(Owner owner)`

- Description: TODO

#### `public ArgMaker()`

- Description: TODO

#### `public RenderLink parse(Resource res, Object... args)`

- Description: TODO

#### `public Res(Resource res, Message buf)`

- Description: TODO

#### `public Integer layerid()`

- Description: TODO

#### `public Map<String, Object> info()`

- Description: TODO

#### `public void init()`

- Description: TODO
