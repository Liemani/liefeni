# WaterTile

This file documents the responsibilities and members of `WaterTile`.

## Meta

- Source: [WaterTile.java](../../../../src/haven/resutil/WaterTile.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a water tile helper.

## Nested Types

### BaseSurface

- Description: TODO

### Bottom

- Description: TODO

### BottomData

- Description: TODO

### BottomFog

- Description: TODO

### BottomSurface

- Description: TODO

### BottomVertex

- Description: TODO

### Fac

- Description: TODO

### Field

- Description: TODO

### FlowData

- Description: TODO

### FoamSurface

- Description: TODO

### ObFog

- Description: TODO

## Members

### Constants

#### `public static final float[] nxpcw, nypcw`

- Description: TODO

#### `public static final float[] nxpcw, nypcw`

- Description: TODO

#### `public static final int I = 10`

- Description: TODO

#### `public static final MapMesh.DataID<FlowData> id = MapMesh.makeid(FlowData.class)`

- Description: TODO

#### `public static final MapMesh.DataID<BottomData> id = MapMesh.makeid(BottomData.class)`

- Description: TODO

#### `public static final MapMesh.DataID<Bottom> id = MapMesh.makeid(Bottom.class)`

- Description: TODO

#### `static final SamplerCube sky = new SamplerCube(new RUtils.CubeFill(() -> Resource.local().load("gfx/tiles/skycube").get().layer(Resource.imgc).img).mktex())`

- Description: TODO

#### `static final TexRender nrm = Resource.local().loadwait("gfx/tiles/wnrm").layer(TexR.class).tex()`

- Description: TODO

#### `static final TexRender flow = Resource.local().loadwait("gfx/tiles/wfoam").layer(TexR.class).tex()`

- Description: TODO

#### `private static final State.Slot<State> surfslot = new State.Slot<>(State.Slot.Type.DRAW, State.class)`

- Description: TODO

#### `private static final Pipe.Op surfextra = Pipe.Op.compose(new States.DepthBias(2, 2), new States.Facecull())`

- Description: TODO

#### `private static final Pipe.Op baseextra = Pipe.Op.compose(surfextra, FragColor.blend(new BlendMode(BlendMode.Factor.ONE, BlendMode.Factor.ONE)))`

- Description: TODO

#### `public static final Pipe.Op surfmat = Pipe.Op.compose(new BaseSurface(), new Rendered.Order.Default(6000))`

- Description: TODO

#### `private static final Pipe.Op foamextra = Pipe.Op.compose(surfextra, FragColor.blend(new BlendMode(BlendMode.Factor.ONE, BlendMode.Factor.ONE)),`

- Description: TODO

#### `public static final Attribute[] vertv = new Attribute[4]`

- Description: TODO

#### `public static final MeshBuf.LayerID<MeshBuf.Vec2Layer>[] lvertv = new MeshBuf.LayerID[4]`

- Description: TODO

#### `public static final AutoVarying[] vvertv = new AutoVarying[4]`

- Description: TODO

#### `public static final AutoVarying[] vverti = new AutoVarying[4]`

- Description: TODO

#### `public static final Attribute vipol = new Attribute(Type.VEC2)`

- Description: TODO

#### `public static final MeshBuf.LayerID<MeshBuf.Vec2Layer> lvipol = new MeshBuf.V2LayerID(vipol)`

- Description: TODO

#### `public static final Pipe.Op foammat = Pipe.Op.compose(new FoamSurface(), new Rendered.Order.Default(6001))`

- Description: TODO

#### `public static final MeshBuf.LayerID<MeshBuf.Vec1Layer> depthlayer = new MeshBuf.V1LayerID(BottomFog.depth)`

- Description: TODO

#### `public static final double maxdepth = 8; /* XXX: These should be parameterized. */`

- Description: TODO

#### `public static final Color fogcolor = new Color(0, 16, 48)`

- Description: TODO

#### `public static final Expression mfogcolor = col3(fogcolor)`

- Description: TODO

#### `public static final Attribute depth = new Attribute(Type.FLOAT)`

- Description: TODO

#### `public static final AutoVarying fragd = new AutoVarying(Type.FLOAT)`

- Description: TODO

#### `public static final BottomFog waterfog = new BottomFog()`

- Description: TODO

#### `private static final Pipe.Op botmat = Pipe.Op.compose(waterfog, new States.DepthBias(4, 4))`

- Description: TODO

#### `public static final Slot<ObFog> slot = new Slot<>(State.Slot.Type.DRAW, ObFog.class)`

- Description: TODO

#### `private static final InstancedUniform cbasez = new InstancedUniform.Float1("basez", p -> p.get(slot).basez, slot)`

- Description: TODO

#### `private static final AutoVarying fragd = new AutoVarying(Type.FLOAT)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

#### `private static final Instancer<ObFog> instancer = new Instancer<ObFog>()`

- Description: TODO

#### `public static final Pipe.Op clickstate = Pipe.Op.compose(MapMesh.clickpost, States.maskdepth)`

- Description: TODO

### Fields

#### `public final int depth`

- Description: TODO

#### `public final Tiler.MCons bottom`

- Description: TODO

#### `public final float[] xv, yv`

- Description: TODO

#### `public final float[] xv, yv`

- Description: TODO

#### `public final Scan vs`

- Description: TODO

#### `public final MapMesh m`

- Description: TODO

#### `public final MCache map`

- Description: TODO

#### `public final float[] xs, ys`

- Description: TODO

#### `public final float[] xs, ys`

- Description: TODO

#### `public float[] xv, yv`

- Description: TODO

#### `public float[] xv, yv`

- Description: TODO

#### `public final boolean[] wv`

- Description: TODO

#### `public final Scan vs, fs, ts`

- Description: TODO

#### `public final Scan vs, fs, ts`

- Description: TODO

#### `public final Scan vs, fs, ts`

- Description: TODO

#### `public final float[] depth`

- Description: TODO

#### `public final Scan ds`

- Description: TODO

#### `final MapMesh m`

- Description: TODO

#### `final boolean[] s`

- Description: TODO

#### `final Vertex[] surf`

- Description: TODO

#### `final boolean[] split`

- Description: TODO

#### `float[] ed`

- Description: TODO

#### `final Scan vs, ss`

- Description: TODO

#### `final Scan vs, ss`

- Description: TODO

#### `final BottomData prs`

- Description: TODO

#### `public final float d`

- Description: TODO

#### `private final Uniform ssky = new Uniform(Type.SAMPLERCUBE, p -> sky)`

- Description: TODO

#### `private final Uniform snrm = new Uniform(Type.SAMPLER2D, p -> nrm.img)`

- Description: TODO

#### `private final Uniform icam = new Uniform(Type.MAT3, p -> Homo3D.camxf(p).transpose(), Homo3D.cam)`

- Description: TODO

#### `private ShaderMacro shader = new ShaderMacro()`

- Description: TODO

#### `private final Uniform ssky = new Uniform(Type.SAMPLERCUBE, p -> sky)`

- Description: TODO

#### `private final Uniform snrm = new Uniform(Type.SAMPLER2D, p -> nrm.img)`

- Description: TODO

#### `private final Uniform sflow = new Uniform(Type.SAMPLER2D, p -> flow.img)`

- Description: TODO

#### `private final Uniform icam = new Uniform(Type.MAT3, p -> Homo3D.camxf(p).transpose(), Homo3D.cam)`

- Description: TODO

#### `private ShaderMacro shader = new ShaderMacro()`

- Description: TODO

#### `public static Function rgbmix = new Function.Def(Type.VEC4)`

- Description: TODO

#### `private final ShaderMacro shader = prog ->`

- Description: TODO

#### `public final float basez`

- Description: TODO

#### `public final BottomData b`

- Description: TODO

### Methods

#### `public Field(MapMesh m)`

- Description: TODO

#### `public void calc()`

- Description: TODO

#### `private void water()`

- Description: TODO

#### `private void slopes()`

- Description: TODO

#### `private void iter()`

- Description: TODO

#### `public FlowData(MapMesh m)`

- Description: TODO

#### `public Coord3f vel(Coord tc)`

- Description: TODO

#### `public BottomData(MapMesh m)`

- Description: TODO

#### `public boolean clean()`

- Description: TODO

#### `public Bottom(MapMesh m)`

- Description: TODO

#### `public BottomVertex(Surface surf, Coord3f c, float d)`

- Description: TODO

#### `public void modify(MeshBuf buf, MeshBuf.Vertex v)`

- Description: TODO

#### `public float d(int x, int y)`

- Description: TODO

#### `public Vertex[] fortilea(Coord c)`

- Description: TODO

#### `public void calcnrm()`

- Description: TODO

#### `public void model(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

#### `private BaseSurface()`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `private FoamSurface()`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `private BottomFog()`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public ObFog(float basez)`

- Description: TODO

#### `public boolean equals(ObFog that)`

- Description: TODO

#### `public boolean equals(Object x)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public InstancedAttribute[] attribs()`

- Description: TODO

#### `public Tiler create(int id, Tileset set)`

- Description: TODO

#### `public WaterTile(int id, Tiler.MCons bottom, int depth)`

- Description: TODO

#### `public void lay(MapMesh m, Random rnd, Coord lc, Coord gc)`

- Description: TODO

#### `public void trans(MapMesh m, Random rnd, Tiler gt, Coord lc, Coord gc, int z, int bmask, int cmask)`

- Description: TODO

#### `public BottomSurface(MapMesh m)`

- Description: TODO

#### `public double getz(Coord tc)`

- Description: TODO

#### `public MCache.ZSurface getsurf(MapMesh m, MCache.SurfaceID id)`

- Description: TODO

#### `public Pipe.Op clickstate()`

- Description: TODO

#### `public Pipe.Op drawstate(Glob glob, Coord3f c)`

- Description: TODO
