---
source: [Outlines.java](../../../src/haven/Outlines.java)
created: 2026-06-13
updated: 2026-06-14
---

# Outlines

Represents the outlines Haven component.

## Nested Types

### Draw

- Role: Represents draw within Outlines.
- Description: Describes the nested draw type used by the enclosing class.

## Members

### Constants

### Fields

#### `private boolean symmetric`
- Role: Tracks the symmetric flag.
- Description: Supports the symmetric operation used by the surrounding class.

#### `private final static Uniform snrm = new Uniform(SAMPLER2D, p -> ((Draw)p.get(RUtils.adhoc)).nrm, RUtils.adhoc)`
- Role: Holds the snrm state.
- Description: Backs the cached state for this file.

#### `private final static Uniform sdep = new Uniform(SAMPLER2D, p -> ((Draw)p.get(RUtils.adhoc)).depth, RUtils.adhoc)`
- Role: Holds the sdep state.
- Description: Backs the cached state for this file.

#### `private final static Uniform msnrm = new Uniform(SAMPLER2DMS, p -> ((Draw)p.get(RUtils.adhoc)).nrm, RUtils.adhoc)`
- Role: Holds the msnrm state.
- Description: Backs the cached state for this file.

#### `private final static Uniform msdep = new Uniform(SAMPLER2DMS, p -> ((Draw)p.get(RUtils.adhoc)).depth, RUtils.adhoc)`
- Role: Holds the msdep state.
- Description: Backs the cached state for this file.

#### `private final static ShaderMacro[] shaders = new ShaderMacro[4]`
- Role: Holds the shaders state.
- Description: Backs the cached state for this file.

#### `final Texture2D.Sampler2D nrm, depth`
- Role: Stores the depth value.
- Description: Backs the cached state for this file.

#### `final Texture2D.Sampler2D nrm, depth`
- Role: Stores the depth value.
- Description: Backs the cached state for this file.

### Methods

#### `Draw(ShaderMacro code, Texture2D.Sampler2D nrm, Texture2D.Sampler2D depth)`
- Role: Handles the draw workflow.
- Description: Supports the draw operation used by the surrounding class.

#### `private static ShaderMacro shader(final boolean symmetric, final boolean ms)`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public Outlines(boolean symmetric)`
- Role: Creates a new Outlines instance.
- Description: Constructs the instance and initializes its default state.

#### `public void added(RenderTree.Slot slot)`
- Role: Performs added.
- Description: Supports the added operation used by the surrounding class.

#### `public void removed(RenderTree.Slot slot)`
- Role: Performs removed.
- Description: Supports the removed operation used by the surrounding class.
