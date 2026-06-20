---
source: [Model.java](../../../../src/haven/render/Model.java)
created: 2026-06-13
updated: 2026-06-14
---

# Model

Defines the model render pipeline component.

## Nested Types

### Indices

- Role: Represents indices within Model.
- Description: Describes the nested indices type used by the enclosing class.

### Mode

- Role: Represents mode within Model.
- Description: Describes the nested mode type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Mode mode`
- Role: Holds the mode state.
- Description: Backs the cached state for this file.

#### `public final VertexArray va`
- Role: Caches va entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Indices ind`
- Role: Holds the ind state.
- Description: Backs the cached state for this file.

#### `public final int f, n`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `public final int f, n`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `public final int ninst`
- Role: Stores the ninst value.
- Description: Backs the cached state for this file.

#### `public Disposable ro`
- Role: Holds the ro state.
- Description: Backs the cached state for this file.

#### `public Object desc`
- Role: Holds the desc state.
- Description: Backs the cached state for this file.

#### `public final NumberFormat fmt`
- Role: Holds the fmt state.
- Description: Backs the cached state for this file.

#### `public final int n`
- Role: Stores the n value.
- Description: Backs the cached state for this file.

#### `public final Usage usage`
- Role: Holds the usage state.
- Description: Backs the cached state for this file.

#### `public final Filler<? super Indices> init`
- Role: Holds the init state.
- Description: Backs the cached state for this file.

#### `public boolean shared = false`
- Role: Tracks the shared flag.
- Description: Supports the shared operation used by the surrounding class.

#### `public Disposable ro`
- Role: Holds the ro state.
- Description: Backs the cached state for this file.

#### `public Object desc`
- Role: Holds the desc state.
- Description: Backs the cached state for this file.

### Methods

#### `public Model(Mode mode, VertexArray va, Indices ind, int f, int n, int ninst)`
- Role: Creates a new Model instance.
- Description: Constructs the instance and initializes its default state.

#### `public Model(Mode mode, VertexArray va, Indices ind, int f, int n)`
- Role: Creates a new Model instance.
- Description: Constructs the instance and initializes its default state.

#### `public Model(Mode mode, VertexArray va, Indices ind)`
- Role: Creates a new Model instance.
- Description: Constructs the instance and initializes its default state.

#### `public Indices(int n, NumberFormat fmt, Usage usage, Filler<? super Indices> init)`
- Role: Performs indices.
- Description: Supports the indices operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public Indices shared()`
- Role: Performs shared.
- Description: Supports the shared operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Indices desc(Object desc)`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public void draw(Pipe state, Render out)`
- Role: Draws the current content.
- Description: Supports the draw operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Model desc(Object desc)`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.
