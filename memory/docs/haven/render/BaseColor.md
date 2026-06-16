# BaseColor

This file documents the responsibilities and members of `BaseColor`.

## Meta

- Source: [BaseColor.java](../../../../src/haven/render/BaseColor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the base color render pipeline component.

## Members

### Constants

#### `public static final Slot<BaseColor> slot = new Slot<>(Slot.Type.DRAW, BaseColor.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform u_color = new Uniform(VEC4, "basecolor", p -> p.get(slot).color, slot)`
- Role: Defines the shared u color constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final FColor color`
- Role: Stores the color value.
- Description: Backs the cached state for this file.

### Methods

#### `public BaseColor(FColor color)`
- Role: Creates a new BaseColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public BaseColor(float r, float g, float b, float a)`
- Role: Creates a new BaseColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public BaseColor(Color color)`
- Role: Creates a new BaseColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public BaseColor(int r, int g, int b, int a)`
- Role: Creates a new BaseColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public Color color()`
- Role: Performs color.
- Description: Supports the color operation used by the surrounding class.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
