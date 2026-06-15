# Homo3D

This file documents the responsibilities and members of `Homo3D`.

## Meta

- Source: [Homo3D.java](../../../../src/haven/render/Homo3D.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Provides homogeneous 3D math.

## Members

### Constants

#### `public static final Slot<Projection> prj = new Slot<>(Slot.Type.SYS, Projection.class)`

- Description: TODO

#### `public static final Slot<Camera> cam = new Slot<>(Slot.Type.SYS, Camera.class)`

- Description: TODO

#### `public static final Slot<Location.Chain> loc = new Slot<>(Slot.Type.GEOM, Location.Chain.class)`

- Description: TODO

#### `public static final Attribute vertex = new Attribute(VEC3, "vertex").primary()`

- Description: TODO

#### `public static final Attribute normal = new Attribute(VEC3, "normal")`

- Description: TODO

#### `static final Uniform u_prj = new Uniform(MAT4, "proj", Homo3D::prjxf, prj)`

- Description: TODO

#### `static final Uniform u_cam = new Uniform(MAT4, "cam", Homo3D::camxf, cam)`

- Description: TODO

#### `static final InstancedUniform u_wxf = new InstancedUniform.Mat4("wxf", Homo3D::locxf, loc)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

#### `public static final State state = new State()`

- Description: TODO

#### `public static final AutoVarying fragvert = new AutoVarying(VEC3, "s_vert")`

- Description: TODO

#### `public static final AutoVarying fragobjv = new AutoVarying(VEC3, "s_objv")`

- Description: TODO

#### `public static final AutoVarying fragmapv = new AutoVarying(VEC3, "s_mapv")`

- Description: TODO

#### `public static final AutoVarying frageyev = new AutoVarying(VEC3, "s_eyev")`

- Description: TODO

#### `private static final Object vertedir_id = new Object()`

- Description: TODO

#### `private static final Object fragedir_id = new Object()`

- Description: TODO

#### `private static final AutoVarying frageyen = new AutoVarying(VEC3, "s_eyen")`

- Description: TODO

### Fields

#### `public final Value objv, mapv, eyev, objn, eyen`

- Description: TODO

#### `public final Value objv, mapv, eyev, objn, eyen`

- Description: TODO

#### `public final Value objv, mapv, eyev, objn, eyen`

- Description: TODO

#### `public final Value objv, mapv, eyev, objn, eyen`

- Description: TODO

#### `public final Value objv, mapv, eyev, objn, eyen`

- Description: TODO

### Methods

#### `public static Matrix4f prjxf(Pipe p)`

- Description: TODO

#### `public static Matrix4f camxf(Pipe p)`

- Description: TODO

#### `public static Matrix4f locxf(Pipe p)`

- Description: TODO

#### `public Homo3D(ProgramContext prog)`

- Description: TODO

#### `public Expression plocxf(Expression v)`

- Description: TODO

#### `public Expression pcamxf(Expression v)`

- Description: TODO

#### `public Expression pmvxf(Expression v)`

- Description: TODO

#### `public Expression pprjxf(Expression v)`

- Description: TODO

#### `public Expression nlocxf(Expression v)`

- Description: TODO

#### `public Expression ncamxf(Expression v)`

- Description: TODO

#### `public Expression nmvxf(Expression v)`

- Description: TODO

#### `public static Homo3D get(ProgramContext prog)`

- Description: TODO

#### `public static Value vertedir(final VertexContext vctx)`

- Description: TODO

#### `public static Value fragedir(final FragmentContext fctx)`

- Description: TODO

#### `public static Value frageyen(FragmentContext fctx)`

- Description: TODO

#### `public static HomoCoord4f obj2clip(Coord3f objc, Pipe state)`

- Description: TODO

#### `public static Coord3f obj2view(Coord3f objc, Pipe state, Area view)`

- Description: TODO

#### `public static Coord3f obj2view(Coord3f c, Pipe state)`

- Description: TODO
