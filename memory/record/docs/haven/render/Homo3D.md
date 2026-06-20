---
source: [Homo3D.java](../../../../src/haven/render/Homo3D.java)
created: 2026-06-13
updated: 2026-06-14
---

# Homo3D

Defines the homo3 d render pipeline component.

## Members

### Constants

#### `public static final Slot<Projection> prj = new Slot<>(Slot.Type.SYS, Projection.class)`
- Role: Defines the shared prj constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<Camera> cam = new Slot<>(Slot.Type.SYS, Camera.class)`
- Role: Defines the shared cam constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<Location.Chain> loc = new Slot<>(Slot.Type.GEOM, Location.Chain.class)`
- Role: Defines the shared loc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute vertex = new Attribute(VEC3, "vertex").primary()`
- Role: Defines the shared vertex constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute normal = new Attribute(VEC3, "normal")`
- Role: Defines the shared normal constant.
- Description: Shared constant used by the rest of the class.

#### `static final Uniform u_prj = new Uniform(MAT4, "proj", Homo3D::prjxf, prj)`
- Role: Defines the shared u prj constant.
- Description: Shared constant used by the rest of the class.

#### `static final Uniform u_cam = new Uniform(MAT4, "cam", Homo3D::camxf, cam)`
- Role: Defines the shared u cam constant.
- Description: Shared constant used by the rest of the class.

#### `static final InstancedUniform u_wxf = new InstancedUniform.Mat4("wxf", Homo3D::locxf, loc)`
- Role: Defines the shared u wxf constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

#### `public static final State state = new State()`
- Role: Defines the shared state constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying fragvert = new AutoVarying(VEC3, "s_vert")`
- Role: Defines the shared fragvert constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying fragobjv = new AutoVarying(VEC3, "s_objv")`
- Role: Defines the shared fragobjv constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying fragmapv = new AutoVarying(VEC3, "s_mapv")`
- Role: Defines the shared fragmapv constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying frageyev = new AutoVarying(VEC3, "s_eyev")`
- Role: Defines the shared frageyev constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Object vertedir_id = new Object()`
- Role: Defines the shared vertedir id constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Object fragedir_id = new Object()`
- Role: Defines the shared fragedir id constant.
- Description: Shared constant used by the rest of the class.

#### `private static final AutoVarying frageyen = new AutoVarying(VEC3, "s_eyen")`
- Role: Defines the shared frageyen constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Value objv, mapv, eyev, objn, eyen`
- Role: Holds the eyen state.
- Description: Backs the cached state for this file.

#### `public final Value objv, mapv, eyev, objn, eyen`
- Role: Holds the eyen state.
- Description: Backs the cached state for this file.

#### `public final Value objv, mapv, eyev, objn, eyen`
- Role: Holds the eyen state.
- Description: Backs the cached state for this file.

#### `public final Value objv, mapv, eyev, objn, eyen`
- Role: Holds the eyen state.
- Description: Backs the cached state for this file.

#### `public final Value objv, mapv, eyev, objn, eyen`
- Role: Holds the eyen state.
- Description: Backs the cached state for this file.

### Methods

#### `public static Matrix4f prjxf(Pipe p)`
- Role: Performs prjxf.
- Description: Supports the prjxf operation used by the surrounding class.

#### `public static Matrix4f camxf(Pipe p)`
- Role: Performs camxf.
- Description: Supports the camxf operation used by the surrounding class.

#### `public static Matrix4f locxf(Pipe p)`
- Role: Performs locxf.
- Description: Supports the locxf operation used by the surrounding class.

#### `public Homo3D(ProgramContext prog)`
- Role: Creates a new Homo3D instance.
- Description: Constructs the instance and initializes its default state.

#### `public Expression plocxf(Expression v)`
- Role: Performs plocxf.
- Description: Supports the plocxf operation used by the surrounding class.

#### `public Expression pcamxf(Expression v)`
- Role: Performs pcamxf.
- Description: Supports the pcamxf operation used by the surrounding class.

#### `public Expression pmvxf(Expression v)`
- Role: Performs pmvxf.
- Description: Supports the pmvxf operation used by the surrounding class.

#### `public Expression pprjxf(Expression v)`
- Role: Performs pprjxf.
- Description: Supports the pprjxf operation used by the surrounding class.

#### `public Expression nlocxf(Expression v)`
- Role: Performs nlocxf.
- Description: Supports the nlocxf operation used by the surrounding class.

#### `public Expression ncamxf(Expression v)`
- Role: Performs ncamxf.
- Description: Supports the ncamxf operation used by the surrounding class.

#### `public Expression nmvxf(Expression v)`
- Role: Performs nmvxf.
- Description: Supports the nmvxf operation used by the surrounding class.

#### `public static Homo3D get(ProgramContext prog)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static Value vertedir(final VertexContext vctx)`
- Role: Performs vertedir.
- Description: Supports the vertedir operation used by the surrounding class.

#### `public static Value fragedir(final FragmentContext fctx)`
- Role: Performs fragedir.
- Description: Supports the fragedir operation used by the surrounding class.

#### `public static Value frageyen(FragmentContext fctx)`
- Role: Performs frageyen.
- Description: Supports the frageyen operation used by the surrounding class.

#### `public static HomoCoord4f obj2clip(Coord3f objc, Pipe state)`
- Role: Performs obj2clip.
- Description: Supports the obj2clip operation used by the surrounding class.

#### `public static Coord3f obj2view(Coord3f objc, Pipe state, Area view)`
- Role: Performs obj2view.
- Description: Supports the obj2view operation used by the surrounding class.

#### `public static Coord3f obj2view(Coord3f c, Pipe state)`
- Role: Performs obj2view.
- Description: Supports the obj2view operation used by the surrounding class.
