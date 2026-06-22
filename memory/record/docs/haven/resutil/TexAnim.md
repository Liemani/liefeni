---
source: [TexAnim.java](../../../../../src/haven/resutil/TexAnim.java)
created: 2026-06-13
updated: 2026-06-20
---

# TexAnim

Offsets texture coordinates by a supplied axis vector.

## Members

### Constants

#### `public static final Slot<TexAnim> slot = new Slot<TexAnim>(Slot.Type.DRAW, TexAnim.class)`
- Role: Registers the texture-animation state for draw processing.
- Description: Stores the current texture-axis offset in the render pipe.

#### `private static final Uniform cax = new Uniform(VEC2, p -> p.get(slot).ax, slot)`
- Role: Exposes the texture-axis offset to the shader.
- Description: Supplies the translation vector used by the shader macro.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the texture-coordinate animation step.
- Description: Adds the axis offset to the sampled coordinates.

### Fields

#### `public final Coord3f ax`
- Role: Stores the texture-axis offset.
- Description: Passed into the shader as the animation vector.

### Methods

#### `public TexAnim(Coord3f ax)`
- Role: Builds a texture-animation state.
- Description: Stores the supplied axis vector.

#### `public void cons(Material.Buffer buf,Object... args)`
- Role: Serializes the animation state into a material buffer.
- Description: Supports resource decoding for material specifications.

#### `public ShaderMacro shader()`
- Role: Returns the animation shader.
- Description: Applies the coordinate offset at draw time.

#### `public void apply(Pipe buf)`
- Role: Installs the state into the draw pipe.
- Description: Publishes the current texture animation vector.