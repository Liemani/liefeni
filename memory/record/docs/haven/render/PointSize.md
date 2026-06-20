---
source: [PointSize.java](../../../../src/haven/render/PointSize.java)
created: 2026-06-13
updated: 2026-06-14
---

# PointSize

Defines the point size render pipeline component.

## Members

### Constants

#### `public static final Slot<State> slot = new Slot<>(Slot.Type.GEOM, State.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Uniform u_ptsz = new Uniform(Type.FLOAT, "pointsize", p -> ((PointSize)p.get(slot)).sz, slot)`
- Role: Defines the shared u ptsz constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final float sz`
- Role: Stores the sz value.
- Description: Backs the cached state for this file.

### Methods

#### `public PointSize(float sz)`
- Role: Creates a new PointSize instance.
- Description: Constructs the instance and initializes its default state.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
