# FragColor

This file documents the responsibilities and members of `FragColor`.

## Meta

- Source: [FragColor.java](../../../../src/haven/render/FragColor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the frag color render pipeline component.

## Nested Types

### ColorValue

- Role: Represents color value within FragColor.
- Description: Describes the nested color value type used by the enclosing class.

### FragBlend

- Role: Represents frag blend within FragColor.
- Description: Describes the nested frag blend type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<FragColor> slot = new Slot<>(Slot.Type.SYS, FragColor.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Slot<FragBlend> blend = new Slot<>(Slot.Type.SYS, FragBlend.class)`
- Role: Defines the shared blend constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FragData fragcol = new FragData(Type.VEC4, "fragcol", p ->`
- Role: Defines the shared fragcol constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Object defcolor = new Object()`
- Role: Defines the shared defcolor constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro value = prog -> fragcol0(prog.fctx).force()`
- Role: Defines the shared value constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro mksrgb = prog -> fragcol0(prog.fctx).srgb = true`
- Role: Defines the shared mksrgb constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro[] shaders =`
- Role: Defines the shared frag color constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final T image`
- Role: Holds the image state.
- Description: Backs the cached state for this file.

#### `public final boolean srgb`
- Role: Tracks the srgb flag.
- Description: Supports the srgb operation used by the surrounding class.

#### `final BlendMode mode`
- Role: Holds the mode state.
- Description: Backs the cached state for this file.

#### `boolean srgb = false`
- Role: Tracks the srgb flag.
- Description: Supports the srgb operation used by the surrounding class.

### Methods

#### `public FragColor(T image, boolean srgb)`
- Role: Creates a new FragColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public FragColor(T image)`
- Role: Creates a new FragColor instance.
- Description: Constructs the instance and initializes its default state.

#### `FragBlend(BlendMode mode)`
- Role: Handles the frag blend workflow.
- Description: Supports the frag blend operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public static Pipe.Op blend(BlendMode mode)`
- Role: Performs blend.
- Description: Supports the blend operation used by the surrounding class.

#### `ColorValue(ValBlock vals)`
- Role: Handles the color value workflow.
- Description: Supports the color value operation used by the surrounding class.

#### `public Expression root()`
- Role: Performs root.
- Description: Supports the root operation used by the surrounding class.

#### `protected void cons2(Block blk)`
- Role: Performs cons2.
- Description: Supports the cons2 operation used by the surrounding class.

#### `private static ColorValue fragcol0(FragmentContext fctx)`
- Role: Performs fragcol0.
- Description: Supports the fragcol0 operation used by the surrounding class.

#### `public static Value fragcol(FragmentContext fctx)`
- Role: Performs fragcol.
- Description: Supports the fragcol operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
