---
source: [HueMod.java](../../../../src/haven/resutil/HueMod.java)
created: 2026-06-13
updated: 2026-06-14
---

# HueMod

Provides resource helper logic for hue mod.

## Members

### Constants

#### `public static final Slot<HueMod> slot = new Slot<>(Slot.Type.DRAW, HueMod.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Uniform cxf = new Uniform(VEC3, p ->`
- Role: Defines the shared cxf constant.
- Description: Shared constant used by the rest of the class.

#### `private static final Function apply = new Function.Def(VEC4)`
- Role: Defines the shared apply constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `final float tgthue, huemod, satmod`
- Role: Stores the satmod value.
- Description: Backs the cached state for this file.

#### `final float tgthue, huemod, satmod`
- Role: Stores the satmod value.
- Description: Backs the cached state for this file.

#### `final float tgthue, huemod, satmod`
- Role: Stores the satmod value.
- Description: Backs the cached state for this file.

### Methods

#### `public HueMod(float tgthue, float huemod, float satmod)`
- Role: Creates a new HueMod instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe buf)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
