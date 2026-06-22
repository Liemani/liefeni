---
source: [BaseColor.java](../../../../../src/haven/render/BaseColor.java)
created: 2026-06-13
updated: 2026-06-14
---

# BaseColor

Defines the base color render pipeline component.

## Members

### Constants

#### `public static final Slot<BaseColor> slot = new Slot<>(Slot.Type.DRAW, BaseColor.class)`
- Role: Publishes base-color state.
- Description: Shared slot used to expose the active base color to the render pipe.
- Value: `new Slot<>(Slot.Type.DRAW, BaseColor.class)`

#### `public static final Uniform u_color = new Uniform(VEC4, "basecolor", p -> p.get(slot).color, slot)`
- Role: Publishes the base-color uniform.
- Description: Exposes the current base color to shader code.
- Value: `new Uniform(VEC4, "basecolor", p -> p.get(slot).color, slot)`

#### `private static final ShaderMacro shader = prog ->`
- Role: Builds the base-color shader.
- Description: Returns the shader macro that forwards the current base color.
- Value: `prog ->`

### Fields

#### `public final FColor color`
- Role: Caches the color value.
- Description: Caches the `color` value for reuse.

### Methods

#### `public BaseColor(FColor color)`
- Role: Creates a new BaseColor instance.
- Description: Constructs the BaseColor instance from the supplied inputs.

#### `public BaseColor(float r, float g, float b, float a)`
- Role: Creates a new BaseColor instance.
- Description: Constructs the BaseColor instance from the supplied inputs.

#### `public BaseColor(Color color)`
- Role: Creates a new BaseColor instance.
- Description: Constructs the BaseColor instance from the supplied inputs.

#### `public BaseColor(int r, int g, int b, int a)`
- Role: Creates a new BaseColor instance.
- Description: Constructs the BaseColor instance from the supplied inputs.

#### `public Color color()`
- Role: Returns the configured base color.
- Description: Exposes the color value carried by this render state.

#### `public ShaderMacro shader()`
- Role: Builds the base-color shader.
- Description: Returns the shader macro that forwards the current base color.

#### `public void apply(Pipe p)`
- Role: Applies base-color state.
- Description: Writes the active base color into the current pipe.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this BaseColor for debugging and logging.