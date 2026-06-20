---
source: [VertexArray.java](../../../../src/haven/render/VertexArray.java)
created: 2026-06-13
updated: 2026-06-14
---

# VertexArray

Defines the vertex array render pipeline component.

## Nested Types

### Buffer

- Role: Represents buffer within VertexArray.
- Description: Describes the nested buffer type used by the enclosing class.

### Input

- Role: Represents input within VertexArray.
- Description: Describes the nested input type used by the enclosing class.

### Layout

- Role: Represents layout within VertexArray.
- Description: Describes the nested layout type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Layout fmt`
- Role: Holds the fmt state.
- Description: Backs the cached state for this file.

#### `public final Buffer[] bufs`
- Role: Stores the bufs value.
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

#### `public final Input[] inputs`
- Role: Holds the inputs state.
- Description: Backs the cached state for this file.

#### `public final int nbufs`
- Role: Stores the nbufs value.
- Description: Backs the cached state for this file.

#### `public final Attribute tgt`
- Role: Holds the tgt state.
- Description: Backs the cached state for this file.

#### `public final VectorFormat el`
- Role: Holds the el state.
- Description: Backs the cached state for this file.

#### `public final int buf, offset, stride`
- Role: Stores the stride value.
- Description: Backs the cached state for this file.

#### `public final int buf, offset, stride`
- Role: Stores the stride value.
- Description: Backs the cached state for this file.

#### `public final int buf, offset, stride`
- Role: Stores the stride value.
- Description: Backs the cached state for this file.

#### `public final boolean instanced`
- Role: Tracks the instanced flag.
- Description: Supports the instanced operation used by the surrounding class.

#### `public final int size`
- Role: Stores the size value.
- Description: Backs the cached state for this file.

#### `public final Usage usage`
- Role: Holds the usage state.
- Description: Backs the cached state for this file.

#### `public final Filler<? super Buffer> init`
- Role: Stores the init value.
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

#### `public VertexArray(Layout fmt, Buffer... bufs)`
- Role: Creates a new VertexArray instance.
- Description: Constructs the instance and initializes its default state.

#### `public int num()`
- Role: Performs num.
- Description: Supports the num operation used by the surrounding class.

#### `public Layout(Input... inputs)`
- Role: Performs layout.
- Description: Supports the layout operation used by the surrounding class.

#### `public Input(Attribute tgt, VectorFormat el, int buf, int offset, int stride, boolean instanced)`
- Role: Performs input.
- Description: Supports the input operation used by the surrounding class.

#### `public Input(Attribute tgt, VectorFormat el, int buf, int offset, int stride)`
- Role: Performs input.
- Description: Supports the input operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Buffer(int size, Usage usage, Filler<? super Buffer> init)`
- Role: Performs buffer.
- Description: Supports the buffer operation used by the surrounding class.

#### `public Buffer(ByteBuffer data, Usage usage)`
- Role: Performs buffer.
- Description: Supports the buffer operation used by the surrounding class.

#### `public int size()`
- Role: Performs size.
- Description: Supports the size operation used by the surrounding class.

#### `public Buffer shared()`
- Role: Performs shared.
- Description: Supports the shared operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Buffer desc(Object desc)`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.

#### `public VertexArray shared()`
- Role: Performs shared.
- Description: Supports the shared operation used by the surrounding class.

#### `public void dispose()`
- Role: Performs dispose.
- Description: Supports the dispose operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public VertexArray desc(Object desc)`
- Role: Performs desc.
- Description: Supports the desc operation used by the surrounding class.
