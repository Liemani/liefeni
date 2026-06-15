# VertexColor

This file documents the responsibilities and members of `VertexColor`.

## Meta

- Source: [VertexColor.java](../../../../src/haven/render/VertexColor.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents vertex color state.

## Members

### Constants

#### `public static final Slot<VertexColor> slot = new Slot<>(Slot.Type.DRAW, VertexColor.class)`

- Description: TODO

#### `public static final Attribute color = new Attribute(VEC4, "color")`

- Description: TODO

#### `public static final VertexColor instance = new VertexColor()`

- Description: TODO

#### `private static final AutoVarying fcolor = new AutoVarying(VEC4)`

- Description: TODO

#### `private static final ShaderMacro shader = prog ->`

- Description: TODO

### Fields

### Methods

#### `public ShaderMacro shader()`

- Description: TODO

#### `public void apply(Pipe p)`

- Description: TODO
