# VertexArray

This file documents the responsibilities and members of `VertexArray`.

## Meta

- Source: [VertexArray.java](../../../../src/haven/render/VertexArray.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a vertex array.

## Nested Types

### Buffer

- Description: TODO

### Input

- Description: TODO

### Layout

- Description: TODO

## Members

### Constants

### Fields

#### `public final Layout fmt`

- Description: TODO

#### `public final Buffer[] bufs`

- Description: TODO

#### `public boolean shared = false`

- Description: TODO

#### `public Disposable ro`

- Description: TODO

#### `public Object desc`

- Description: TODO

#### `public final Input[] inputs`

- Description: TODO

#### `public final int nbufs`

- Description: TODO

#### `public final Attribute tgt`

- Description: TODO

#### `public final VectorFormat el`

- Description: TODO

#### `public final int buf, offset, stride`

- Description: TODO

#### `public final int buf, offset, stride`

- Description: TODO

#### `public final int buf, offset, stride`

- Description: TODO

#### `public final boolean instanced`

- Description: TODO

#### `public final int size`

- Description: TODO

#### `public final Usage usage`

- Description: TODO

#### `public final Filler<? super Buffer> init`

- Description: TODO

#### `public boolean shared = false`

- Description: TODO

#### `public Disposable ro`

- Description: TODO

#### `public Object desc`

- Description: TODO

### Methods

#### `public VertexArray(Layout fmt, Buffer... bufs)`

- Description: TODO

#### `public int num()`

- Description: TODO

#### `public Layout(Input... inputs)`

- Description: TODO

#### `public Input(Attribute tgt, VectorFormat el, int buf, int offset, int stride, boolean instanced)`

- Description: TODO

#### `public Input(Attribute tgt, VectorFormat el, int buf, int offset, int stride)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Buffer(int size, Usage usage, Filler<? super Buffer> init)`

- Description: TODO

#### `public Buffer(ByteBuffer data, Usage usage)`

- Description: TODO

#### `public int size()`

- Description: TODO

#### `public Buffer shared()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Buffer desc(Object desc)`

- Description: TODO

#### `public VertexArray shared()`

- Description: TODO

#### `public void dispose()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public VertexArray desc(Object desc)`

- Description: TODO
