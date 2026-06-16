# WaterTile

This file documents the responsibilities and members of `WaterTile`.

## Meta

- Source: [WaterTile.java](../../../../src/haven/resutil/WaterTile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides resource helper logic for water tile.

## Nested Types

### BaseSurface

- Role: Represents base surface within WaterTile.
- Description: Describes the nested base surface type used by the enclosing class.

### Bottom

- Role: Represents bottom within WaterTile.
- Description: Describes the nested bottom type used by the enclosing class.

### BottomData

- Role: Represents bottom data within WaterTile.
- Description: Describes the nested bottom data type used by the enclosing class.

### BottomFog

- Role: Represents bottom fog within WaterTile.
- Description: Describes the nested bottom fog type used by the enclosing class.

### BottomSurface

- Role: Represents bottom surface within WaterTile.
- Description: Describes the nested bottom surface type used by the enclosing class.

### BottomVertex

- Role: Represents bottom vertex within WaterTile.
- Description: Describes the nested bottom vertex type used by the enclosing class.

### Fac

- Role: Represents fac within WaterTile.
- Description: Describes the nested fac type used by the enclosing class.

### Field

- Role: Represents field within WaterTile.
- Description: Describes the nested field type used by the enclosing class.

### FlowData

- Role: Represents flow data within WaterTile.
- Description: Describes the nested flow data type used by the enclosing class.

### FoamSurface

- Role: Represents foam surface within WaterTile.
- Description: Describes the nested foam surface type used by the enclosing class.

### ObFog

- Role: Represents ob fog within WaterTile.
- Description: Describes the nested ob fog type used by the enclosing class.

## Members

### Constants

#### `public static final float[] nxpcw, nypcw`
- Role: Defines the shared nypcw constant.
- Description: Shared constant used by the rest of the class.

#### `public static final float[] nxpcw, nypcw`
- Role: Defines the shared nypcw constant.
- Description: Shared constant used by the rest of the class.

#### `public static final int I = 10`
- Role: Defines the shared i constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MapMesh.DataID<FlowData> id = MapMesh.makeid(FlowData.class)`
- Role: Defines the shared id constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MapMesh.DataID<BottomData> id = MapMesh.makeid(BottomData.class)`
- Role: Defines the shared id constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MapMesh.DataID<Bottom> id = MapMesh.makeid(Bottom.class)`
- Role: Defines the shared id constant.
- Description: Shared constant used by the rest of the class.

#### `static final SamplerCube sky = new SamplerCube(new RUtils.CubeFill(() -> Resource.local().load("gfx/tiles/skycube").get().layer(Resource.imgc).img).mktex())`
- Role: Defines the shared sky constant.
- Description: Shared constant used by the rest of the class.

#### `static final TexRender nrm = Resource.local().loadwait("gfx/tiles/wnrm").layer(TexR.class).tex()`
- Role: Defines the shared nrm constant.
- Description: Shared constant used by the rest of the class.

#### `static final TexRender flow = Resource.local().loadwait("gfx/tiles/wfoam").layer(TexR.class).tex()`
- Role: Defines the shared flow constant.
- Description: Shared constant used by the rest of the class.

#### `private static final State.Slot<State> surfslot = new State.Slot<>(State.Slot.Type.DRAW, State.class)`
- Role: Defines the shared surfslot constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Pipe.Op surfextra = Pipe.Op.compose(new States.DepthBias(2, 2), new States.Facecull())`
- Role: Defines the shared surfextra constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Pipe.Op baseextra = Pipe.Op.compose(surfextra, FragColor.blend(new BlendMode(BlendMode.Factor.ONE, BlendMode.Factor.ONE)))`
- Role: Defines the shared baseextra constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Pipe.Op surfmat = Pipe.Op.compose(new BaseSurface(), new Rendered.Order.Default(6000))`
- Role: Defines the shared surfmat constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Pipe.Op foamextra = Pipe.Op.compose(surfextra, FragColor.blend(new BlendMode(BlendMode.Factor.ONE, BlendMode.Factor.ONE)),`
- Role: Defines the shared foamextra constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute[] vertv = new Attribute[4]`
- Role: Defines the shared vertv constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MeshBuf.LayerID<MeshBuf.Vec2Layer>[] lvertv = new MeshBuf.LayerID[4]`
- Role: Defines the shared lvertv constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying[] vvertv = new AutoVarying[4]`
- Role: Defines the shared vvertv constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying[] vverti = new AutoVarying[4]`
- Role: Defines the shared vverti constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute vipol = new Attribute(Type.VEC2)`
- Role: Defines the shared vipol constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MeshBuf.LayerID<MeshBuf.Vec2Layer> lvipol = new MeshBuf.V2LayerID(vipol)`
- Role: Defines the shared lvipol constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Pipe.Op foammat = Pipe.Op.compose(new FoamSurface(), new Rendered.Order.Default(6001))`
- Role: Defines the shared foammat constant.
- Description: Shared constant used by the rest of the class.

#### `public static final MeshBuf.LayerID<MeshBuf.Vec1Layer> depthlayer = new MeshBuf.V1LayerID(BottomFog.depth)`
- Role: Defines the shared depthlayer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final double maxdepth = 8; /* XXX: These should be parameterized. */`
- Role: Defines the shared maxdepth constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Color fogcolor = new Color(0, 16, 48)`
- Role: Defines the shared fogcolor constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Expression mfogcolor = col3(fogcolor)`
- Role: Defines the shared mfogcolor constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute depth = new Attribute(Type.FLOAT)`
- Role: Defines the shared depth constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying fragd = new AutoVarying(Type.FLOAT)`
- Role: Defines the shared fragd constant.
- Description: Shared constant used by the rest of the class.

#### `public static final BottomFog waterfog = new BottomFog()`
- Role: Defines the shared waterfog constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Pipe.Op botmat = Pipe.Op.compose(waterfog, new States.DepthBias(4, 4))`
- Role: Defines the shared botmat constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<ObFog> slot = new Slot<>(State.Slot.Type.DRAW, ObFog.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `private static final InstancedUniform cbasez = new InstancedUniform.Float1("basez", p -> p.get(slot).basez, slot)`
- Role: Defines the shared cbasez constant.
- Description: Shared constant used by the rest of the class.

#### `private static final AutoVarying fragd = new AutoVarying(Type.FLOAT)`
- Role: Defines the shared fragd constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Instancer<ObFog> instancer = new Instancer<ObFog>()`
- Role: Defines the shared instancer constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Pipe.Op clickstate = Pipe.Op.compose(MapMesh.clickpost, States.maskdepth)`
- Role: Defines the shared clickstate constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final int depth`
- Role: Stores the depth value.
- Description: Backs the cached state for this file.

#### `public final Tiler.MCons bottom`
- Role: Holds the bottom state.
- Description: Backs the cached state for this file.

#### `public final float[] xv, yv`
- Role: Stores the yv value.
- Description: Backs the cached state for this file.

#### `public final float[] xv, yv`
- Role: Stores the yv value.
- Description: Backs the cached state for this file.

#### `public final Scan vs`
- Role: Holds the vs state.
- Description: Backs the cached state for this file.

#### `public final MapMesh m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `public final MCache map`
- Role: Caches map entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final float[] xs, ys`
- Role: Stores the ys value.
- Description: Backs the cached state for this file.

#### `public final float[] xs, ys`
- Role: Stores the ys value.
- Description: Backs the cached state for this file.

#### `public float[] xv, yv`
- Role: Stores the yv value.
- Description: Backs the cached state for this file.

#### `public float[] xv, yv`
- Role: Stores the yv value.
- Description: Backs the cached state for this file.

#### `public final boolean[] wv`
- Role: Tracks the wv flag.
- Description: Supports the wv operation used by the surrounding class.

#### `public final Scan vs, fs, ts`
- Role: Holds the ts state.
- Description: Backs the cached state for this file.

#### `public final Scan vs, fs, ts`
- Role: Holds the ts state.
- Description: Backs the cached state for this file.

#### `public final Scan vs, fs, ts`
- Role: Holds the ts state.
- Description: Backs the cached state for this file.

#### `public final float[] depth`
- Role: Stores the depth value.
- Description: Backs the cached state for this file.

#### `public final Scan ds`
- Role: Holds the ds state.
- Description: Backs the cached state for this file.

#### `final MapMesh m`
- Role: Holds the m state.
- Description: Backs the cached state for this file.

#### `final boolean[] s`
- Role: Tracks the s flag.
- Description: Supports the s operation used by the surrounding class.

#### `final Vertex[] surf`
- Role: Stores the surf value.
- Description: Backs the cached state for this file.

#### `final boolean[] split`
- Role: Tracks the split flag.
- Description: Supports the split operation used by the surrounding class.

#### `float[] ed`
- Role: Stores the ed value.
- Description: Backs the cached state for this file.

#### `final Scan vs, ss`
- Role: Holds the ss state.
- Description: Backs the cached state for this file.

#### `final Scan vs, ss`
- Role: Holds the ss state.
- Description: Backs the cached state for this file.

#### `final BottomData prs`
- Role: Holds the prs state.
- Description: Backs the cached state for this file.

#### `public final float d`
- Role: Stores the d value.
- Description: Backs the cached state for this file.

#### `private final Uniform ssky = new Uniform(Type.SAMPLERCUBE, p -> sky)`
- Role: Holds the ssky state.
- Description: Backs the cached state for this file.

#### `private final Uniform snrm = new Uniform(Type.SAMPLER2D, p -> nrm.img)`
- Role: Holds the snrm state.
- Description: Backs the cached state for this file.

#### `private final Uniform icam = new Uniform(Type.MAT3, p -> Homo3D.camxf(p).transpose(), Homo3D.cam)`
- Role: Holds the icam state.
- Description: Backs the cached state for this file.

#### `private ShaderMacro shader = new ShaderMacro()`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

#### `private final Uniform ssky = new Uniform(Type.SAMPLERCUBE, p -> sky)`
- Role: Holds the ssky state.
- Description: Backs the cached state for this file.

#### `private final Uniform snrm = new Uniform(Type.SAMPLER2D, p -> nrm.img)`
- Role: Holds the snrm state.
- Description: Backs the cached state for this file.

#### `private final Uniform sflow = new Uniform(Type.SAMPLER2D, p -> flow.img)`
- Role: Holds the sflow state.
- Description: Backs the cached state for this file.

#### `private final Uniform icam = new Uniform(Type.MAT3, p -> Homo3D.camxf(p).transpose(), Homo3D.cam)`
- Role: Holds the icam state.
- Description: Backs the cached state for this file.

#### `private ShaderMacro shader = new ShaderMacro()`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

#### `public static Function rgbmix = new Function.Def(Type.VEC4)`
- Role: Holds the rgbmix state.
- Description: Backs the cached state for this file.

#### `private final ShaderMacro shader = prog ->`
- Role: Holds the shader state.
- Description: Backs the cached state for this file.

#### `public final float basez`
- Role: Stores the basez value.
- Description: Backs the cached state for this file.

#### `public final BottomData b`
- Role: Holds the b state.
- Description: Backs the cached state for this file.

### Methods

#### `public Field(MapMesh m)`
- Role: Performs field.
- Description: Supports the field operation used by the surrounding class.

#### `public void calc()`
- Role: Performs calc.
- Description: Supports the calc operation used by the surrounding class.

#### `private void water()`
- Role: Performs water.
- Description: Supports the water operation used by the surrounding class.

#### `private void slopes()`
- Role: Performs slopes.
- Description: Supports the slopes operation used by the surrounding class.

#### `private void iter()`
- Role: Performs iter.
- Description: Supports the iter operation used by the surrounding class.

#### `public FlowData(MapMesh m)`
- Role: Performs flow data.
- Description: Supports the flow data operation used by the surrounding class.

#### `public Coord3f vel(Coord tc)`
- Role: Performs vel.
- Description: Supports the vel operation used by the surrounding class.

#### `public BottomData(MapMesh m)`
- Role: Performs bottom data.
- Description: Supports the bottom data operation used by the surrounding class.

#### `public boolean clean()`
- Role: Performs clean.
- Description: Supports the clean operation used by the surrounding class.

#### `public Bottom(MapMesh m)`
- Role: Performs bottom.
- Description: Supports the bottom operation used by the surrounding class.

#### `public BottomVertex(Surface surf, Coord3f c, float d)`
- Role: Performs bottom vertex.
- Description: Supports the bottom vertex operation used by the surrounding class.

#### `public void modify(MeshBuf buf, MeshBuf.Vertex v)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public float d(int x, int y)`
- Role: Performs d.
- Description: Supports the d operation used by the surrounding class.

#### `public Vertex[] fortilea(Coord c)`
- Role: Performs fortilea.
- Description: Supports the fortilea operation used by the surrounding class.

#### `public void calcnrm()`
- Role: Performs calcnrm.
- Description: Supports the calcnrm operation used by the surrounding class.

#### `public void model(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Performs model.
- Description: Supports the model operation used by the surrounding class.

#### `private BaseSurface()`
- Role: Performs base surface.
- Description: Supports the base surface operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `private FoamSurface()`
- Role: Performs foam surface.
- Description: Supports the foam surface operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `private BottomFog()`
- Role: Performs bottom fog.
- Description: Supports the bottom fog operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public ObFog(float basez)`
- Role: Performs ob fog.
- Description: Supports the ob fog operation used by the surrounding class.

#### `public boolean equals(ObFog that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public boolean equals(Object x)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public InstancedAttribute[] attribs()`
- Role: Performs attribs.
- Description: Supports the attribs operation used by the surrounding class.

#### `public Tiler create(int id, Tileset set)`
- Role: Creates the target object.
- Description: Constructs the target object from the supplied inputs.

#### `public WaterTile(int id, Tiler.MCons bottom, int depth)`
- Role: Creates a new WaterTile instance.
- Description: Constructs the instance and initializes its default state.

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`
- Role: Performs lay.
- Description: Supports the lay operation used by the surrounding class.

#### `public void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`
- Role: Performs trans.
- Description: Supports the trans operation used by the surrounding class.

#### `public BottomSurface(MapMesh m)`
- Role: Performs bottom surface.
- Description: Supports the bottom surface operation used by the surrounding class.

#### `public double getz(Coord tc)`
- Role: Performs getz.
- Description: Supports the getz operation used by the surrounding class.

#### `public MCache.ZSurface getsurf(MapMesh m, MCache.SurfaceID id)`
- Role: Returns the surface id for the supplied surface name.
- Description: Maps a surface name to the corresponding `MCache.SurfaceID` value.

#### `public Pipe.Op clickstate()`
- Role: Performs clickstate.
- Description: Supports the clickstate operation used by the surrounding class.

#### `public Pipe.Op drawstate(Glob glob, Coord3f c)`
- Role: Performs drawstate.
- Description: Supports the drawstate operation used by the surrounding class.
