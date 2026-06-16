# VertexColor

This file documents the responsibilities and members of `VertexColor`.

## Meta

- Source: [VertexColor.java](../../../../src/haven/render/VertexColor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Defines the vertex color render pipeline component.

## Members

### Constants

#### `public static final Slot<VertexColor> slot = new Slot<>(Slot.Type.DRAW, VertexColor.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final Attribute color = new Attribute(VEC4, "color")`
- Role: Defines the shared color constant.
- Description: Shared constant used by the rest of the class.

#### `public static final VertexColor instance = new VertexColor()`
- Role: Defines the shared instance constant.
- Description: Shared constant used by the rest of the class.

#### `private static final AutoVarying fcolor = new AutoVarying(VEC4)`
- Role: Defines the shared fcolor constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

### Methods

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.
