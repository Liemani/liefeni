---
source: [VertexArray.java](../../../../../src/haven/render/VertexArray.java)
created: 2026-06-13
updated: 2026-06-14
---

# VertexArray

Defines the vertex array render pipeline component.

## Nested Types

### Buffer

- Role: Represents one vertex-array buffer.
- Description: Wraps the raw storage for one vertex attribute stream.

### Input

- Role: Represents one vertex-array input.
- Description: Binds a vertex attribute to a buffer, offset, and stride.

### Layout

- Role: Represents one vertex-array layout.
- Description: Collects the full set of attribute inputs used by the array.

## Members

### Constants

### Fields

#### `public final Layout fmt`
- Role: Caches the fmt value.
- Description: Caches the `fmt` value for reuse.

#### `public final Buffer[] bufs`
- Role: Caches the bufs value.
- Description: Caches the `bufs` value for reuse.

#### `public boolean shared = false`
- Role: Tracks the shared flag.
- Description: Caches the `shared` value for reuse.

#### `public Disposable ro`
- Role: Caches the ro value.
- Description: Caches the `ro` value for reuse.

#### `public Object desc`
- Role: Caches the desc value.
- Description: Caches the `desc` value for reuse.

#### `public final Input[] inputs`
- Role: Caches the inputs value.
- Description: Caches the `inputs` value for reuse.

#### `public final int nbufs`
- Role: Caches the nbufs value.
- Description: Caches the `nbufs` value for reuse.

#### `public final Attribute tgt`
- Role: Caches the tgt value.
- Description: Stores the widget that accepted the hover event.

#### `public final VectorFormat el`
- Role: Caches the el value.
- Description: Caches the `el` value for reuse.

#### `public final int buf, offset, stride`
- Role: Caches the stride value.
- Description: Caches the `stride` value for reuse.

#### `public final int buf, offset, stride`
- Role: Caches the stride value.
- Description: Caches the `stride` value for reuse.

#### `public final int buf, offset, stride`
- Role: Caches the stride value.
- Description: Caches the `stride` value for reuse.

#### `public final boolean instanced`
- Role: Tracks the instanced flag.
- Description: Caches the `instanced` value for reuse.

#### `public final int size`
- Role: Caches the size value.
- Description: Caches the `size` value for reuse.

#### `public final Usage usage`
- Role: Caches the usage value.
- Description: Caches the `usage` value for reuse.

#### `public final Filler<? super Buffer> init`
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

#### `public VertexArray(Layout fmt, Buffer... bufs)`
- Role: Creates a new VertexArray instance.
- Description: Constructs the VertexArray instance from the supplied inputs.

#### `public int num()`
- Role: Handles the num path.
- Description: Implements the num operation.

#### `public Layout(Input... inputs)`
- Role: Handles the layout path.
- Description: Implements the layout operation.

#### `public Input(Attribute tgt, VectorFormat el, int buf, int offset, int stride, boolean instanced)`
- Role: Handles the input path.
- Description: Implements the input operation.

#### `public Input(Attribute tgt, VectorFormat el, int buf, int offset, int stride)`
- Role: Handles the input path.
- Description: Implements the input operation.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this VertexArray for debugging and logging.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this VertexArray for debugging and logging.

#### `public Buffer(int size, Usage usage, Filler<? super Buffer> init)`
- Role: Handles the buffer path.
- Description: Implements the buffer operation.

#### `public Buffer(ByteBuffer data, Usage usage)`
- Role: Handles the buffer path.
- Description: Implements the buffer operation.

#### `public int size()`
- Role: Handles the size path.
- Description: Implements the size operation.

#### `public Buffer shared()`
- Role: Handles the shared path.
- Description: Implements the shared operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this VertexArray for debugging and logging.

#### `public Buffer desc(Object desc)`
- Role: Handles the desc path.
- Description: Implements the desc operation.

#### `public VertexArray shared()`
- Role: Handles the shared path.
- Description: Implements the shared operation.

#### `public void dispose()`
- Role: Releases the resources owned by this object.
- Description: Releases the resources owned by this object.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this VertexArray for debugging and logging.

#### `public VertexArray desc(Object desc)`
- Role: Handles the desc path.
- Description: Implements the desc operation.