---
source: [Outlines.java](../../../../src/haven/Outlines.java)
created: 2026-06-13
updated: 2026-06-14
---

# Outlines

Represents the outlines Haven component.

## Nested Types

### Draw

- Role: Wraps the outline shader inputs.
- Description: Render-state container that binds the outline textures to a shader macro.

## Members

### Constants

### Fields

#### `private boolean symmetric`
- Role: Tracks the symmetric flag.
- Description: Caches the `symmetric` value for reuse.

#### `private final static Uniform snrm = new Uniform(SAMPLER2D, p -> ((Draw)p.get(RUtils.adhoc)).nrm, RUtils.adhoc)`
- Role: Implements the snrm operation.
- Description: Returns the get value.

#### `private final static Uniform sdep = new Uniform(SAMPLER2D, p -> ((Draw)p.get(RUtils.adhoc)).depth, RUtils.adhoc)`
- Role: Implements the sdep operation.
- Description: Returns the get value.

#### `private final static Uniform msnrm = new Uniform(SAMPLER2DMS, p -> ((Draw)p.get(RUtils.adhoc)).nrm, RUtils.adhoc)`
- Role: Implements the msnrm operation.
- Description: Returns the get value.

#### `private final static Uniform msdep = new Uniform(SAMPLER2DMS, p -> ((Draw)p.get(RUtils.adhoc)).depth, RUtils.adhoc)`
- Role: Implements the msdep operation.
- Description: Returns the get value.

#### `private final static ShaderMacro[] shaders = new ShaderMacro[4]`
- Role: Caches the shaders value.
- Description: Caches the `shaders` value for reuse.

#### `final Texture2D.Sampler2D nrm, depth`
- Role: Caches the depth value.
- Description: Caches the `depth` value for reuse.

#### `final Texture2D.Sampler2D nrm, depth`
- Role: Caches the depth value.
- Description: Caches the `depth` value for reuse.

### Methods

#### `Draw(ShaderMacro code, Texture2D.Sampler2D nrm, Texture2D.Sampler2D depth)`
- Role: Handles the draw workflow.
- Description: Draws the Outlines content.

#### `private static ShaderMacro shader(final boolean symmetric, final boolean ms)`
- Role: Returns the shader macro used by this context.
- Description: Returns the shader macro used by this context.

#### `public Outlines(boolean symmetric)`
- Role: Creates a new Outlines instance.
- Description: Constructs the Outlines instance from the supplied inputs.

#### `public void added(RenderTree.Slot slot)`
- Role: Handles the added path.
- Description: Adds the ed.

#### `public void removed(RenderTree.Slot slot)`
- Role: Handles the removed path.
- Description: Removes the d.