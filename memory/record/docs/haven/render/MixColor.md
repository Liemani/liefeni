---
source: [MixColor.java](../../../../../src/haven/render/MixColor.java)
created: 2026-06-13
updated: 2026-06-14
---

# MixColor

Applies a per-draw RGBA tint through the render pipeline.

## Members

### Constants

#### `public static final Slot<MixColor> slot = new Slot<>(Slot.Type.DRAW, MixColor.class)`
- Role: Stores the active mix-color state in the draw pipe.
- Description: Lets the shader read the tint for the current draw call.
- Value: `new Slot<>(Slot.Type.DRAW, MixColor.class)`

#### `public static final InstancedUniform u_color = new InstancedUniform.Vec4("mixcolor", p -> p.get(slot).color, slot)`
- Role: Exposes the mix color to the shader.
- Description: Reads the active RGBA tint from the draw state.
- Value: `new InstancedUniform.Vec4("mixcolor", p -> p.get(slot).color, slot)`

#### `public static final AutoVarying transfer = new AutoVarying(Type.VEC4)`
- Role: Transfers the mix color through the shader pipeline.
- Description: Carries the per-instance tint into the fragment stage.
- Value: `new AutoVarying(Type.VEC4)`

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the color-mix shader hook.
- Description: Blends the supplied color into the fragment output.
- Value: `prog ->`

#### `private static final Instancer<MixColor> instancer = new Instancer<MixColor>()`
- Role: Provides instanced mix-color state.
- Description: Reuses one instancer to upload color tint per instance.
- Value: `new Instancer<MixColor>()`

### Fields

#### `public final float[] color`
- Role: Stores the RGBA tint.
- Description: Used as the source color for the shader blend.

### Methods

#### `public MixColor(float[] color)`
- Role: Stores one mix color value.
- Description: Wraps an explicit RGBA color used for mixing into the shader state.

#### `public MixColor(FColor color)`
- Role: Creates a new MixColor instance.
- Description: Constructs the MixColor instance from the supplied inputs.

#### `public MixColor(float r, float g, float b, float a)`
- Role: Creates a new MixColor instance.
- Description: Constructs the MixColor instance from the supplied inputs.

#### `public MixColor(Color color)`
- Role: Creates a new MixColor instance.
- Description: Constructs the MixColor instance from the supplied inputs.

#### `public MixColor(int r, int g, int b, int a)`
- Role: Creates a new MixColor instance.
- Description: Constructs the MixColor instance from the supplied inputs.

#### `public ShaderMacro shader()`
- Role: Returns the mix-color shader macro.
- Description: Produces the shader hook that blends `color` into fragments.

#### `public void apply(Pipe p)`
- Role: Installs the mix-color state into the pipe.
- Description: Makes the tint visible to downstream shader stages.

#### `public InstancedAttribute[] attribs()`
- Role: Exposes the instanced mix-color attribute.
- Description: Returns the attribute list used to upload the tint per instance.
