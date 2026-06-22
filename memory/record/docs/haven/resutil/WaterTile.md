---
source: [WaterTile.java](../../../../../src/haven/resutil/WaterTile.java)
created: 2026-06-13
updated: 2026-06-20
---

# WaterTile

Water-specific map tiler that builds flowing-surface data, bottom geometry, and fog behavior for water map meshes.

## Nested Types

### `FlowData`
- Role: Calculates and stores per-tile water flow vectors.

### `BottomData`
- Role: Stores depth information for the bottom surface.

### `Bottom`, `BottomSurface`, `BottomVertex`, `BottomFog`, `FoamSurface`
- Role: Build the renderable bottom and fog surfaces for water tiles.

### `Field`
- Role: Computes the local water-flow field for a `MapMesh`.

### `BaseSurface`, `Fac`, `ObFog`
- Role: Provide shared render state and helper surfaces for water rendering.

## Members

### Constants

#### `public static final int I = 10`
- Role: Defines the smoothing radius used by the flow solver.
- Value: `10`

#### `public static final MapMesh.DataID<FlowData> id = MapMesh.makeid(FlowData.class)`
- Role: Registers the flow-data payload for map meshes.
- Value: `MapMesh.makeid(FlowData.class)`

#### `public static final MapMesh.DataID<BottomData> id = MapMesh.makeid(BottomData.class)`
- Role: Registers the bottom-data payload for map meshes.
- Value: `MapMesh.makeid(BottomData.class)`

#### `public static final MapMesh.DataID<Bottom> id = MapMesh.makeid(Bottom.class)`
- Role: Registers the bottom surface payload for map meshes.
- Value: `MapMesh.makeid(Bottom.class)`

#### `static final SamplerCube sky = new SamplerCube(new RUtils.CubeFill(() -> Resource.local().load("gfx/tiles/skycube").get().layer(Resource.imgc).img).mktex())`
- Role: Provides the cube-map texture used for water reflections.
- Value: `new SamplerCube(new RUtils.CubeFill(() -> Resource.local().load("gfx/tiles/skycube").get().layer(Resource.imgc).img).mktex())`

#### `static final TexRender nrm = Resource.local().loadwait("gfx/tiles/wnrm").layer(TexR.class).tex()`
- Role: Provides the normal map texture for water.
- Value: `Resource.local().loadwait("gfx/tiles/wnrm").layer(TexR.class).tex()`

#### `static final TexRender flow = Resource.local().loadwait("gfx/tiles/wfoam").layer(TexR.class).tex()`
- Role: Provides the foam/flow texture for water.
- Value: `Resource.local().loadwait("gfx/tiles/wfoam").layer(TexR.class).tex()`

#### `private static final State.Slot<State> surfslot = new State.Slot<>(State.Slot.Type.DRAW, State.class)`
- Role: Declares the draw-state slot used by water surfaces.
- Value: `new State.Slot<>(State.Slot.Type.DRAW, State.class)`

#### `private static final Pipe.Op surfextra = Pipe.Op.compose(new States.DepthBias(2, 2), new States.Facecull())`
- Role: Adds depth bias and face culling for water surfaces.
- Value: `Pipe.Op.compose(new States.DepthBias(2, 2), new States.Facecull())`

#### `private static final Pipe.Op baseextra = Pipe.Op.compose(surfextra, FragColor.blend(new BlendMode(BlendMode.Factor.ONE, BlendMode.Factor.ONE)))`
- Role: Adds additive blending for the base water pass.
- Value: `Pipe.Op.compose(surfextra, FragColor.blend(new BlendMode(BlendMode.Factor.ONE, BlendMode.Factor.ONE)))`

#### `public static final Pipe.Op surfmat = Pipe.Op.compose(new BaseSurface(), new Rendered.Order.Default(6000))`
- Role: Defines the main water surface render order.
- Value: `Pipe.Op.compose(new BaseSurface(), new Rendered.Order.Default(6000))`

#### `private static final Pipe.Op foamextra = Pipe.Op.compose(surfextra, FragColor.blend(new BlendMode(BlendMode.Factor.ONE, BlendMode.Factor.ONE)),`
- Role: Adds foam-specific extra render state.
- Value: `Pipe.Op.compose(surfextra, FragColor.blend(new BlendMode(BlendMode.Factor.ONE, BlendMode.Factor.ONE)),`

#### `public static final Attribute[] vertv = new Attribute[4]`
- Role: Stores vertex attributes for the water mesh.
- Value: `new Attribute[4]`

#### `public static final MeshBuf.LayerID<MeshBuf.Vec2Layer>[] lvertv = new MeshBuf.LayerID[4]`
- Role: Stores mesh layer ids for water vertices.
- Value: `new MeshBuf.LayerID[4]`

#### `public static final AutoVarying[] vvertv = new AutoVarying[4]`
- Role: Stores vertex varyings for the water shader.
- Value: `new AutoVarying[4]`

#### `public static final AutoVarying[] vverti = new AutoVarying[4]`
- Role: Stores interpolated vertex varyings for the water shader.
- Value: `new AutoVarying[4]`

#### `public static final Attribute vipol = new Attribute(Type.VEC2)`
- Role: Stores the water interpolation attribute.
- Value: `new Attribute(Type.VEC2)`

#### `public static final MeshBuf.LayerID<MeshBuf.Vec2Layer> lvipol = new MeshBuf.V2LayerID(vipol)`
- Role: Stores the mesh layer id for interpolation data.
- Value: `new MeshBuf.V2LayerID(vipol)`

#### `public static final Pipe.Op foammat = Pipe.Op.compose(new FoamSurface(), new Rendered.Order.Default(6001))`
- Role: Defines the foam render order.
- Value: `Pipe.Op.compose(new FoamSurface(), new Rendered.Order.Default(6001))`

#### `public static final MeshBuf.LayerID<MeshBuf.Vec1Layer> depthlayer = new MeshBuf.V1LayerID(BottomFog.depth)`
- Role: Stores the depth layer id for bottom fog.
- Value: `new MeshBuf.V1LayerID(BottomFog.depth)`

#### `public static final double maxdepth = 8; /* XXX: These should be parameterized. */`
- Role: Caps the water depth used by the renderer.
- Value: `8; /* XXX: These should be parameterized. */`

#### `public static final Color fogcolor = new Color(0, 16, 48)`
- Role: Stores the base fog color.
- Value: `new Color(0, 16, 48)`

#### `public static final Expression mfogcolor = col3(fogcolor)`
- Role: Converts the fog color into a shader expression.
- Value: `col3(fogcolor)`

#### `public static final Attribute depth = new Attribute(Type.FLOAT)`
- Role: Stores the depth vertex attribute.
- Value: `new Attribute(Type.FLOAT)`

#### `public static final AutoVarying fragd = new AutoVarying(Type.FLOAT)`
- Role: Stores the fragment depth varying.
- Value: `new AutoVarying(Type.FLOAT)`

#### `public static final BottomFog waterfog = new BottomFog()`
- Role: Stores the reusable bottom-fog state.
- Value: `new BottomFog()`

#### `private static final Pipe.Op botmat = Pipe.Op.compose(waterfog, new States.DepthBias(4, 4))`
- Role: Defines the bottom material render state.
- Value: `Pipe.Op.compose(waterfog, new States.DepthBias(4, 4))`

#### `public static final Slot<ObFog> slot = new Slot<>(State.Slot.Type.DRAW, ObFog.class)`
- Role: Registers the overlay fog state slot.
- Value: `new Slot<>(State.Slot.Type.DRAW, ObFog.class)`

