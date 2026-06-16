# ColorMask

This file documents the responsibilities and members of `ColorMask`.

## Meta

- Source: [ColorMask.java](../../../src/haven/ColorMask.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the color mask Haven component.

## Members

### Constants

#### `public static final Slot<ColorMask> slot = new Slot<ColorMask>(Slot.Type.DRAW, ColorMask.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform ccol = new Uniform(VEC4, p -> p.get(slot).col, slot)`
- Role: Defines the shared ccol constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro sh = prog ->`
- Role: Defines the shared sh constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `private final FColor col`
- Role: Stores the col value.
- Description: Backs the cached state for this file.

### Methods

#### `public ColorMask(FColor col)`
- Role: Creates a new ColorMask instance.
- Description: Constructs the instance and initializes its default state.

#### `public ColorMask(Color col)`
- Role: Creates a new ColorMask instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
