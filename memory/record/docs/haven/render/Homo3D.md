---
source: [Homo3D.java](../../../../../src/haven/render/Homo3D.java)
created: 2026-06-13
updated: 2026-06-14
---

# Homo3D

Defines the homo3 d render pipeline component.

## Members

### Constants

#### `public static final Slot<Projection> prj = new Slot<>(Slot.Type.SYS, Projection.class)`
- Role: Implements the prj operation.
- Description: Implements the public static final slot<projection> prj = new slot<>(slot.type.sys, projection.class) operation.
- Value: `new Slot<>(Slot.Type.SYS, Projection.class)`

#### `public static final Slot<Camera> cam = new Slot<>(Slot.Type.SYS, Camera.class)`
- Role: Implements the cam operation.
- Description: Implements the public static final slot<camera> cam = new slot<>(slot.type.sys, camera.class) operation.
- Value: `new Slot<>(Slot.Type.SYS, Camera.class)`

#### `public static final Slot<Location.Chain> loc = new Slot<>(Slot.Type.GEOM, Location.Chain.class)`
- Role: Implements the loc operation.
- Description: Implements the public static final slot<location.chain> loc = new slot<>(slot.type.geom, location.chain.class) operation.
- Value: `new Slot<>(Slot.Type.GEOM, Location.Chain.class)`

#### `public static final Attribute vertex = new Attribute(VEC3, "vertex").primary()`
- Role: Implements the vertex operation.
- Description: Implements the primary operation.
- Value: `new Attribute(VEC3, "vertex").primary()`

#### `public static final Attribute normal = new Attribute(VEC3, "normal")`
- Role: Implements the normal operation.
- Description: Implements the attribute operation.
- Value: `new Attribute(VEC3, "normal")`

#### `static final Uniform u_prj = new Uniform(MAT4, "proj", Homo3D::prjxf, prj)`
- Role: Implements the u prj operation.
- Description: Implements the uniform operation.
- Value: `new Uniform(MAT4, "proj", Homo3D::prjxf, prj)`

#### `static final Uniform u_cam = new Uniform(MAT4, "cam", Homo3D::camxf, cam)`
- Role: Implements the u cam operation.
- Description: Implements the uniform operation.
- Value: `new Uniform(MAT4, "cam", Homo3D::camxf, cam)`

#### `static final InstancedUniform u_wxf = new InstancedUniform.Mat4("wxf", Homo3D::locxf, loc)`
- Role: Implements the u wxf operation.
- Description: Implements the mat4 operation.
- Value: `new InstancedUniform.Mat4("wxf", Homo3D::locxf, loc)`

#### `private static final ShaderMacro shader = prog ->`
- Role: Caches the shader value.
- Description: Caches the `shader` value for reuse.
- Value: `prog ->`

#### `public static final State state = new State()`
- Role: Implements the state operation.
- Description: Implements the state operation.
- Value: `new State()`

#### `public static final AutoVarying fragvert = new AutoVarying(VEC3, "s_vert")`
- Role: Implements the fragvert operation.
- Description: Implements the auto varying operation.
- Value: `new AutoVarying(VEC3, "s_vert")`

#### `public static final AutoVarying fragobjv = new AutoVarying(VEC3, "s_objv")`
- Role: Implements the fragobjv operation.
- Description: Implements the auto varying operation.
- Value: `new AutoVarying(VEC3, "s_objv")`

#### `public static final AutoVarying fragmapv = new AutoVarying(VEC3, "s_mapv")`
- Role: Implements the fragmapv operation.
- Description: Implements the auto varying operation.
- Value: `new AutoVarying(VEC3, "s_mapv")`

#### `public static final AutoVarying frageyev = new AutoVarying(VEC3, "s_eyev")`
- Role: Implements the frageyev operation.
- Description: Implements the auto varying operation.
- Value: `new AutoVarying(VEC3, "s_eyev")`

#### `private static final Object vertedir_id = new Object()`
- Role: Implements the vertedir id operation.
- Description: Implements the object operation.
- Value: `new Object()`

#### `private static final Object fragedir_id = new Object()`
- Role: Implements the fragedir id operation.
- Description: Implements the object operation.
- Value: `new Object()`

#### `private static final AutoVarying frageyen = new AutoVarying(VEC3, "s_eyen")`
- Role: Implements the frageyen operation.
- Description: Implements the auto varying operation.
- Value: `new AutoVarying(VEC3, "s_eyen")`

### Fields

#### `public final Value objv, mapv, eyev, objn, eyen`
- Role: Caches the eyen value.
- Description: Caches the `eyen` value for reuse.

#### `public final Value objv, mapv, eyev, objn, eyen`
- Role: Caches the eyen value.
- Description: Caches the `eyen` value for reuse.

#### `public final Value objv, mapv, eyev, objn, eyen`
- Role: Caches the eyen value.
- Description: Caches the `eyen` value for reuse.

#### `public final Value objv, mapv, eyev, objn, eyen`
- Role: Caches the eyen value.
- Description: Caches the `eyen` value for reuse.

#### `public final Value objv, mapv, eyev, objn, eyen`
- Role: Caches the eyen value.
- Description: Caches the `eyen` value for reuse.

### Methods

#### `public static Matrix4f prjxf(Pipe p)`
- Role: Returns the projection transform.
- Description: Reads the projection matrix from the pipe.

#### `public static Matrix4f camxf(Pipe p)`
- Role: Returns the camera transform.
- Description: Reads the camera matrix from the pipe.

#### `public static Matrix4f locxf(Pipe p)`
- Role: Returns the location transform.
- Description: Reads the world transform from the pipe.

#### `public Homo3D(ProgramContext prog)`
- Role: Creates a new Homo3D instance.
- Description: Constructs the Homo3D instance from the supplied inputs.

#### `public Expression plocxf(Expression v)`
- Role: Builds a projected location transform.
- Description: Produces the shader expression for world-space position.

#### `public Expression pcamxf(Expression v)`
- Role: Builds a projected camera transform.
- Description: Produces the shader expression for camera-space position.

#### `public Expression pmvxf(Expression v)`
- Role: Builds a projected model-view transform.
- Description: Produces the shader expression for model-view position.

#### `public Expression pprjxf(Expression v)`
- Role: Builds a projected projection transform.
- Description: Produces the shader expression for clip-space projection.

#### `public Expression nlocxf(Expression v)`
- Role: Builds a normalized location transform.
- Description: Produces the shader expression for normalized world-space position.

#### `public Expression ncamxf(Expression v)`
- Role: Builds a normalized camera transform.
- Description: Produces the shader expression for normalized camera-space position.

#### `public Expression nmvxf(Expression v)`
- Role: Builds a normalized model-view transform.
- Description: Produces the shader expression for normalized model-view position.

#### `public static Homo3D get(ProgramContext prog)`
- Role: Returns the Homo3D helper.
- Description: Reuses the Homo3D shader helper attached to the program context.

#### `public static Value vertedir(final VertexContext vctx)`
- Role: Reads the vertex forward direction.
- Description: Returns the direction vector used for vertex-space lighting.

#### `public static Value fragedir(final FragmentContext fctx)`
- Role: Reads the fragment forward direction.
- Description: Returns the direction vector used for fragment-space lighting.

#### `public static Value frageyen(FragmentContext fctx)`
- Role: Reads the fragment eye direction.
- Description: Returns the eye-space direction vector used by fragment shading.

#### `public static HomoCoord4f obj2clip(Coord3f objc, Pipe state)`
- Role: Projects object coordinates to clip space.
- Description: Converts object coordinates into clip coordinates using the current pipe state.

#### `public static Coord3f obj2view(Coord3f objc, Pipe state, Area view)`
- Role: Projects object coordinates to view space.
- Description: Converts object coordinates into screen-relative view coordinates.

#### `public static Coord3f obj2view(Coord3f c, Pipe state)`
- Role: Projects object coordinates to view space.
- Description: Converts object coordinates into view coordinates with the current pipe state.