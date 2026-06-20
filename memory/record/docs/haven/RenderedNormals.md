---
source: [RenderedNormals.java](../../../src/haven/RenderedNormals.java)
created: 2026-06-13
updated: 2026-06-14
---

# RenderedNormals

Represents the rendered normals Haven component.

## Nested Types

### $maskcol

- Role: Represents $maskcol within RenderedNormals.
- Description: Describes the nested $maskcol type used by the enclosing class.

### Canon

- Role: Represents canon within RenderedNormals.
- Description: Describes the nested canon type used by the enclosing class.

## Members

### Constants

#### `public static final Slot<RenderedNormals> slot = new Slot<>(Slot.Type.SYS, RenderedNormals.class)`
- Role: Defines the shared slot constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FragData fragnorm = new FragData(Type.VEC3, "fragnorm", p -> ((p.get(States.maskdepth.slot) == null) ? p.get(slot).img : null), slot, States.maskdepth.slot)`
- Role: Defines the shared fragnorm constant.
- Description: Shared constant used by the rest of the class.

#### `private static final ShaderMacro shader = prog ->`
- Role: Defines the shared shader constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Texture.Image<?> img`
- Role: Stores the img value.
- Description: Backs the cached state for this file.

#### `public Texture2D tex = null`
- Role: Stores the tex value.
- Description: Backs the cached state for this file.

#### `private RenderedNormals state`
- Role: Holds the state state.
- Description: Backs the cached state for this file.

#### `private int refcount = 0`
- Role: Stores the refcount value.
- Description: Backs the cached state for this file.

#### `final Pipe.Op mask = p -> p.put(slot, null)`
- Role: Holds the mask state.
- Description: Backs the cached state for this file.

### Methods

#### `public RenderedNormals(Texture.Image<?> img)`
- Role: Creates a new RenderedNormals instance.
- Description: Constructs the instance and initializes its default state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public ShaderMacro shader()`
- Role: Performs shader.
- Description: Supports the shader operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void apply(Pipe p)`
- Role: Applies the menu-grid proxy changes.
- Description: Supports the apply operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void prerender(Render out)`
- Role: Performs prerender.
- Description: Supports the prerender operation used by the surrounding class.

#### `public void postrender(Render out)`
- Role: Performs postrender.
- Description: Supports the postrender operation used by the surrounding class.

#### `public static Canon get(Pipe state)`
- Role: Performs get.
- Description: Supports the get operation used by the surrounding class.

#### `public static void put(Pipe state)`
- Role: Performs put.
- Description: Supports the put operation used by the surrounding class.

#### `public void cons(Material.Buffer buf, Object... args)`
- Role: Performs cons.
- Description: Supports the cons operation used by the surrounding class.
