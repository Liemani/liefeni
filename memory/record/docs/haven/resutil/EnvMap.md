---
source: [EnvMap.java](../../../../../src/haven/resutil/EnvMap.java)
created: 2026-06-13
updated: 2026-06-20
---

# EnvMap

Applies environment-map lighting using a cubemap sky, a tint color, and the current camera basis.

## Members

### Constants

#### `public static final Slot<EnvMap> slot = new Slot<EnvMap>(Slot.Type.DRAW, EnvMap.class)`
- Role: Registers the env-map draw state.
- Description: Makes the current environment settings visible to the shader.

#### `private static final Uniform csky = new Uniform(SAMPLERCUBE, p -> p.get(slot).sky, slot)`
- Role: Exposes the sky cubemap to the shader.
- Description: Used when sampling the environment reflection.

#### `private static final Uniform ccol = new Uniform(VEC3, p -> p.get(slot).col, slot)`
- Role: Exposes the tint color to the shader.
- Description: Multiplies the cubemap sample before output.

#### `private static final Uniform icam = new Uniform(MAT3, p -> Homo3D.camxf(p).transpose().trim3(), Homo3D.cam)`
- Role: Exposes the camera basis to the shader.
- Description: Converts view direction into cubemap lookup space.

#### `private static final SamplerCube sky = WaterTile.sky`
- Role: Reuses the shared sky cubemap.
- Description: Shares the same environment texture as water rendering.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the env-map shader path.
- Description: Binds the sky and color uniforms for fragment shading.

### Fields

#### `public final float[] col`
- Role: Stores the tint color as RGB floats.
- Description: Derived from the constructor `Color`.

### Methods

#### `public EnvMap(Color col)`
- Role: Builds an env-map state.
- Description: Stores the supplied tint for later rendering.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Serializes material arguments.
- Description: Supports resource decoding for the material system.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro for this state.
- Description: The macro uses the sky cube and tint color.

#### `public void apply(Pipe buf)`
- Role: Installs the state into the draw pipe.
- Description: Publishes sky, tint, and camera data for rendering.