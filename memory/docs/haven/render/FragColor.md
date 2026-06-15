# FragColor

This file documents the responsibilities and members of `FragColor`.

## Meta

- Source: [FragColor.java](../../../../src/haven/render/FragColor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents fragment color state.

## Nested Types

### ColorValue

- Description: TODO

### FragBlend

- Description: TODO

## Members

### Constants

#### `public static final Slot<FragColor> slot = new Slot<>(Slot.Type.SYS, FragColor.class)`

- Description: TODO

#### `public static final Slot<FragBlend> blend = new Slot<>(Slot.Type.SYS, FragBlend.class)`

- Description: TODO

#### `public static final FragData fragcol = new FragData(Type.VEC4, "fragcol", p ->`

- Description: TODO

#### `public static final Object defcolor = new Object()`

- Description: TODO

#### `private static final ShaderMacro value = prog -> fragcol0(prog.fctx).force()`

- Description: TODO

#### `private static final ShaderMacro mksrgb = prog -> fragcol0(prog.fctx).srgb = true`

- Description: TODO

#### `private static final ShaderMacro[] shaders =`

- Description: TODO

### Fields

#### `public final T image`

- Description: TODO

#### `public final boolean srgb`

- Description: TODO

#### `final BlendMode mode`

- Description: TODO

#### `boolean srgb = false`

- Description: TODO

### Methods

#### `public FragColor(T image, boolean srgb)`

- Description: TODO

#### `public FragColor(T image)`

- Description: TODO

#### `FragBlend(BlendMode mode)`

- Description: TODO

#### `public void apply(Pipe buf)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public static Pipe.Op blend(BlendMode mode)`

- Description: TODO

#### `ColorValue(ValBlock vals)`

- Description: TODO

#### `public Expression root()`

- Description: TODO

#### `protected void cons2(Block blk)`

- Description: TODO

#### `private static ColorValue fragcol0(FragmentContext fctx)`

- Description: TODO

#### `public static Value fragcol(FragmentContext fctx)`

- Description: TODO

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public String toString()`

- Description: TODO
