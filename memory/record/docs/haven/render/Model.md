---
source: [Model.java](../../../../../src/haven/render/Model.java)
created: 2026-06-13
updated: 2026-06-14
---

# Model

Defines the model render pipeline component.

## Nested Types

### Indices

- Role: Stores index data for one mesh.
- Description: Owns the index buffer and its upload/disposal lifecycle.

### Mode

- Role: Selects one draw mode.
- Description: Enumerates the primitive topology used when rendering a model.

## Members

### Constants

### Fields

#### `public final Mode mode`
- Role: Caches the mode value.
- Description: Caches the `mode` value for reuse.

#### `public final VertexArray va`
- Role: Caches the va value.
- Description: Caches the `va` value for reuse.

#### `public final Indices ind`
- Role: Caches the ind value.
- Description: Caches the `ind` value for reuse.

#### `public final int f, n`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `public final int f, n`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `public final int ninst`
- Role: Caches the ninst value.
- Description: Caches the `ninst` value for reuse.

#### `public Disposable ro`
- Role: Caches the ro value.
- Description: Caches the `ro` value for reuse.

#### `public Object desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `public final NumberFormat fmt`
- Role: Caches the fmt value.
- Description: Caches the `fmt` value for reuse.

#### `public final int n`
- Role: Caches the n value.
- Description: Caches the `n` value for reuse.

#### `public final Usage usage`
- Role: Caches the usage value.
- Description: Caches the `usage` value for reuse.

#### `public final Filler<? super Indices> init`
- Role: Caches the init value.
- Description: Caches the `init` value for reuse.

#### `public boolean shared = false`
- Role: Tracks the shared flag.
- Description: Caches the `shared` value for reuse.

#### `public Disposable ro`
- Role: Caches the ro value.
- Description: Caches the `ro` value for reuse.

#### `public Object desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

### Methods

#### `public Model(Mode mode, VertexArray va, Indices ind, int f, int n, int ninst)`
- Role: Creates a new Model instance.
- Description: Constructs the Model instance from the supplied inputs.

#### `public Model(Mode mode, VertexArray va, Indices ind, int f, int n)`
- Role: Creates a new Model instance.
- Description: Constructs the Model instance from the supplied inputs.

#### `public Model(Mode mode, VertexArray va, Indices ind)`
- Role: Creates a new Model instance.
- Description: Constructs the Model instance from the supplied inputs.

#### `public Indices(int n, NumberFormat fmt, Usage usage, Filler<? super Indices> init)`
- Role: Handles the indices path.
- Description: Implements the indices operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public Indices shared()`
- Role: Handles the shared path.
- Description: Implements the shared operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Model for debugging and logging.

#### `public Indices desc(Object desc)`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public void draw(Pipe state, Render out)`
- Role: Draws the current content.
- Description: Draws the Model content.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this Model for debugging and logging.

#### `public Model desc(Object desc)`
- Role: Handles the desc path.
- Description: Implements the desc operation.