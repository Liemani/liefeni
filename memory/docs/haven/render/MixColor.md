# MixColor

This file documents the responsibilities and members of `MixColor`.

## Meta

- Source: [MixColor.java](../../../../src/haven/render/MixColor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the mix color render pipeline component.

## Members

### Constants

#### `public static final Slot<MixColor> slot = new Slot<>(Slot.Type.DRAW, MixColor.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final InstancedUniform u_color = new InstancedUniform.Vec4("mixcolor", p -> p.get(slot).color, slot)`
- Role: Defines the shared u color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final AutoVarying transfer = new AutoVarying(Type.VEC4)`
- Role: Defines the shared transfer constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Instancer<MixColor> instancer = new Instancer<MixColor>()`
- Role: Defines the shared instancer constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final float[] color`
- Role: Stores the color value.
- Description: Backs the cached state for this file.

### Methods

#### `public MixColor(float[] color)`
- Role: Creates a new MixColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public MixColor(FColor color)`
- Role: Creates a new MixColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public MixColor(float r, float g, float b, float a)`
- Role: Creates a new MixColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public MixColor(Color color)`
- Role: Creates a new MixColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public MixColor(int r, int g, int b, int a)`
- Role: Creates a new MixColor instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public InstancedAttribute[] attribs()`
- Role: Performs attribs.
- Description: Supports the attribs operation used by the surrounding class.
