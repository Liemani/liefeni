---
source: [RenderedNormals.java](../../../../src/haven/RenderedNormals.java)
created: 2026-06-13
updated: 2026-06-14
---

# RenderedNormals

Captures rendered normals into a shared framebuffer texture.

## Nested Types

### $maskcol

- Role: Disables the rendered-normals output for masked materials.
- Description: Clears the normals state before masked depth rendering writes its own target.

### Canon

- Role: Manages the shared normals framebuffer for a render context.
- Description: Owns the texture, resizes it with the framebuffer, and clears or releases it as needed.

## Members

### Constants

#### `public static final Slot<RenderedNormals> slot = new Slot<>(Slot.Type.SYS, RenderedNormals.class)`
- Role: Stores the active rendered-normals state in the pipe.
- Description: Lets shaders find the normals texture prepared for the current frame.
- Value: `new Slot<>(Slot.Type.SYS, RenderedNormals.class)`

#### `public static final FragData fragnorm = new FragData(Type.VEC3, "fragnorm", p -> ((p.get(States.maskdepth.slot) == null) ? p.get(slot).img : null), slot, States.maskdepth.slot)`
- Role: Exposes the fragment output for rendered normals.
- Description: Writes normals only when the mask-depth state is absent.
- Value: `new FragData(Type.VEC3, "fragnorm", p -> ((p.get(States.maskdepth.slot) == null) ? p.get(slot).img : null), slot, States.maskdepth.slot)`

#### `private static final ShaderMacro shader = prog ->`
- Role: Installs the normals output shader hook.
- Description: Forces the fragment pipeline to produce normals into `fragnorm`.
- Value: `prog ->`

### Fields

#### `public final Texture.Image<?> img`
- Role: Stores the normals image target.
- Description: This texture image receives the rendered normals.

#### `public Texture2D tex = null`
- Role: Stores the shared normals texture.
- Description: Recreated when the framebuffer size changes.

#### `private RenderedNormals state`
- Role: Stores the current pipe state wrapper.
- Description: Points at the `RenderedNormals` instance prepared for the current framebuffer.

#### `private int refcount = 0`
- Role: Tracks how many users hold the shared normals target.
- Description: Drops the shared texture once the last user releases it.

#### `final Pipe.Op mask = p -> p.put(slot, null)`
- Role: Clears the rendered-normals state under a mask.
- Description: Used by the material spec that suppresses normals output.

### Methods

#### `public RenderedNormals(Texture.Image<?> img)`
- Role: Wraps a texture image as a rendered-normals target.
- Description: Stores the output texture image used by the shader.

#### `public boolean equals(Object o)`
- Role: Compares normals targets by image identity.
- Description: Treats two wrappers as equal when they point at the same texture image.

#### `public ShaderMacro shader()`
- Role: Returns the normals output shader macro.
- Description: Produces the shader hook that writes depth-aligned normals.

#### `public void apply(Pipe p)`
- Role: Installs the rendered-normals state into the pipe.
- Description: Makes the normals image visible to downstream render passes.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Applies this object to the target pipe.

#### `public void dispose()`
- Role: Releases the shared normals texture.
- Description: Disposes the framebuffer-sized texture when the context no longer needs it.

#### `public void prerender(Render out)`
- Role: Clears the normals buffer before rendering.
- Description: Fills the target with a sentinel normal so untouched pixels are detectable.

#### `public void postrender(Render out)`
- Role: Optionally dumps the normals buffer after rendering.
- Description: Debug-only hook for inspecting the generated normals image.

#### `public static Canon get(Pipe state)`
- Role: Acquires the shared normals framebuffer for the current render context.
- Description: Creates the shared `Canon` lazily and bumps its reference count.

#### `public static void put(Pipe state)`
- Role: Releases the shared normals framebuffer.
- Description: Drops the reference count and disposes the framebuffer when the last user leaves.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Installs the material spec that disables normals output.
- Description: Adds the pipe op that clears the rendered-normals state for masked materials.
