---
source: [FragColor.java](../../../../../src/haven/render/FragColor.java)
created: 2026-06-13
updated: 2026-06-14
---

# FragColor

Defines the frag color render pipeline component.

## Nested Types

### ColorValue

- Role: Computes the fragment color value.
- Description: Builds the color expression used by the fragment shader context.

### FragBlend

- Role: Applies fragment blend state.
- Description: Injects the blend mode into the render pipe for this fragment output.

## Members

### Constants

#### `public static final Slot<FragColor> slot = new Slot<>(Slot.Type.SYS, FragColor.class)`
- Role: Implements the slot operation.
- Description: Implements the public static final slot<frag color> slot = new slot<>(slot.type.sys, frag color.class) operation.
- Value: `new Slot<>(Slot.Type.SYS, FragColor.class)`

#### `public static final Slot<FragBlend> blend = new Slot<>(Slot.Type.SYS, FragBlend.class)`
- Role: Implements the blend operation.
- Description: Implements the public static final slot<frag blend> blend = new slot<>(slot.type.sys, frag blend.class) operation.
- Value: `new Slot<>(Slot.Type.SYS, FragBlend.class)`

#### `public static final FragData fragcol = new FragData(Type.VEC4, "fragcol", p ->`
- Role: Implements the fragcol operation.
- Description: Implements the frag data operation.
- Value: `new FragData(Type.VEC4, "fragcol", p ->`

#### `public static final Object defcolor = new Object()`
- Role: Implements the defcolor operation.
- Description: Implements the object operation.
- Value: `new Object()`

#### `private static final ShaderMacro value = prog -> fragcol0(prog.fctx).force()`
- Role: Implements the value operation.
- Description: Implements the force operation.
- Value: `prog -> fragcol0(prog.fctx).force()`

#### `private static final ShaderMacro mksrgb = prog -> fragcol0(prog.fctx).srgb = true`
- Role: Implements the mksrgb operation.
- Description: Implements the fragcol0 operation.
- Value: `prog -> fragcol0(prog.fctx).srgb = true`

#### `private static final ShaderMacro[] shaders =`
- Role: Caches the shaders value.
- Description: Caches the `shaders` value for reuse.
- Value: ``

### Fields

#### `public final T image`
- Role: Caches the image value.
- Description: Caches the `image` value for reuse.

#### `public final boolean srgb`
- Role: Tracks the srgb flag.
- Description: Caches the `srgb` value for reuse.

#### `final BlendMode mode`
- Role: Caches the mode value.
- Description: Caches the `mode` value for reuse.

#### `boolean srgb = false`
- Role: Tracks the srgb flag.
- Description: Caches the `srgb` value for reuse.

### Methods

#### `public FragColor(T image, boolean srgb)`
- Role: Stores one fragment color binding.
- Description: Wraps a texture image together with the sRGB flag used by the shader.

#### `public FragColor(T image)`
- Role: Stores one fragment color binding.
- Description: Wraps a texture image with the default linear-color behavior.

#### `FragBlend(BlendMode mode)`
- Role: Applies fragment blend state.
- Description: Writes the configured blend mode into the fragment state pipe.

#### `public void apply(Pipe buf)`
- Role: Applies fragment color state.
- Description: Writes the fragment image and sRGB state into the pipe.

#### `public ShaderMacro shader()`
- Role: Builds the fragment-color shader.
- Description: Returns the shader macro that reads the bound fragment color.

#### `public static Pipe.Op blend(BlendMode mode)`
- Role: Builds fragment blend state.
- Description: Returns a pipe op that installs the requested blend mode.

#### `ColorValue(ValBlock vals)`
- Role: Builds a fragment-color expression.
- Description: Represents the shader-side color value computed from the source image.

#### `public Expression root()`
- Role: Returns the expression root.
- Description: Exposes the base expression used for fragment color evaluation.

#### `protected void cons2(Block blk)`
- Role: Emits fragment-color code.
- Description: Adds the color conversion logic to the shader block.

#### `private static ColorValue fragcol0(FragmentContext fctx)`
- Role: Resolves the fragment color value.
- Description: Returns the cached color expression for the current fragment context.

#### `public static Value fragcol(FragmentContext fctx)`
- Role: Reads the fragment color value.
- Description: Returns the shader value for the active fragment color.

#### `public ShaderMacro shader()`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this FragColor for debugging and logging.