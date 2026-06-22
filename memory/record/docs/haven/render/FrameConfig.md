---
source: [FrameConfig.java](../../../../../src/haven/render/FrameConfig.java)
created: 2026-06-13
updated: 2026-06-14
---

# FrameConfig

Defines the frame config render pipeline component.

## Members

### Constants

#### `public static final Slot<FrameConfig> slot = new Slot<>(Slot.Type.SYS, FrameConfig.class)`
- Role: Publishes frame configuration state.
- Description: Shared slot used to expose frame size and sample count.
- Value: `new Slot<>(Slot.Type.SYS, FrameConfig.class)`

#### `public static final Uniform u_numsamples = new Uniform(Type.INT, "numsamples", p -> p.get(slot).samples, slot)`
- Role: Publishes the sample-count uniform.
- Description: Exposes the current sample count to shader code.
- Value: `new Uniform(Type.INT, "numsamples", p -> p.get(slot).samples, slot)`

#### `public static final Uniform u_screensize = new Uniform(Type.VEC2, "screensize", p -> p.get(slot).sz, slot)`
- Role: Publishes the screen-size uniform.
- Description: Exposes the framebuffer size to shader code.
- Value: `new Uniform(Type.VEC2, "screensize", p -> p.get(slot).sz, slot)`

#### `public static final Uniform u_pixelpitch = new Uniform(Type.VEC2, "pixelpitch", p ->`
- Role: Publishes the pixel-pitch uniform.
- Description: Exposes the inverse framebuffer size for shader code.
- Value: `new Uniform(Type.VEC2, "pixelpitch", p ->`

### Fields

#### `public final Coord sz`
- Role: Caches the sz value.
- Description: Caches the `sz` value for reuse.

#### `public final int samples`
- Role: Caches the samples value.
- Description: Caches the `samples` value for reuse.

### Methods

#### `public FrameConfig(Coord sz, int samples)`
- Role: Creates a new FrameConfig instance.
- Description: Constructs the FrameConfig instance from the supplied inputs.

#### `public FrameConfig(Coord sz)`
- Role: Creates a new FrameConfig instance.
- Description: Constructs the FrameConfig instance from the supplied inputs.

#### `public ShaderMacro shader()`
- Role: Builds the frame-config shader.
- Description: Returns the shader macro that exposes frame parameters.

#### `public void apply(Pipe p)`
- Role: Applies frame configuration.
- Description: Writes the framebuffer size and sample count into the current pipe.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this FrameConfig for debugging and logging.