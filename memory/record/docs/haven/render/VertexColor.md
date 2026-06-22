---
source: [VertexColor.java](../../../../../src/haven/render/VertexColor.java)
created: 2026-06-13
updated: 2026-06-14
---

# VertexColor

Carries per-vertex color into the fragment pipeline.

## Members

### Constants

#### `public static final Slot<VertexColor> slot = new Slot<>(Slot.Type.DRAW, VertexColor.class)`
- Role: Stores the active vertex-color state in the draw pipe.
- Description: Lets the shader read the current vertex color.
- Value: `new Slot<>(Slot.Type.DRAW, VertexColor.class)`

#### `public static final Attribute color = new Attribute(VEC4, "color")`
- Role: Names the per-vertex color attribute.
- Description: Supplies RGBA values from the vertex buffer.
- Value: `new Attribute(VEC4, "color")`

#### `public static final VertexColor instance = new VertexColor()`
- Role: Provides the reusable vertex-color state.
- Description: Shared singleton used whenever vertex colors are needed.
- Value: `new VertexColor()`

#### `private static final AutoVarying fcolor = new AutoVarying(VEC4)`
- Role: Transfers vertex color into the fragment stage.
- Description: Passes the vertex color through the shader pipeline.
- Value: `new AutoVarying(VEC4)`

#### `private static final ShaderMacro shader = prog ->`
- Role: Installs the vertex-color shader hook.
- Description: Makes the per-vertex color available to fragment blending.
- Value: `prog ->`

### Fields

### Methods

#### `public ShaderMacro shader()`
- Role: Returns the vertex-color shader macro.
- Description: Produces the shader hook that forwards vertex colors.

#### `public void apply(Pipe p)`
- Role: Installs vertex-color state into the pipe.
- Description: Makes the per-vertex color attribute visible to the shader.
