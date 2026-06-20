---
source: [VertexBuilder.java](../../../src/haven/VertexBuilder.java)
created: 2026-06-13
updated: 2026-06-14
---

# VertexBuilder

Represents the vertex builder Haven component.

## Nested Types

### LayoutBuilder

- Role: Represents layout builder within VertexBuilder.
- Description: Describes the nested layout builder type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Layout fmt`
- Role: Holds the fmt state.
- Description: Backs the cached state for this file.

#### `public final int vsz`
- Role: Stores the vsz value.
- Description: Backs the cached state for this file.

#### `private final byte[] cur`
- Role: Stores the cur value.
- Description: Backs the cached state for this file.

#### `private int vn = 0`
- Role: Stores the vn value.
- Description: Backs the cached state for this file.

#### `private byte[] data`
- Role: Stores the data value.
- Description: Backs the cached state for this file.

#### `private final List<Attribute> attr = new ArrayList<>()`
- Role: Caches attr entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final List<VectorFormat> efmt = new ArrayList<>()`
- Role: Caches efmt entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final int bufidx`
- Role: Stores the bufidx value.
- Description: Backs the cached state for this file.

### Methods

#### `public VertexBuilder(Layout fmt)`
- Role: Creates a new VertexBuilder instance.
- Description: Constructs the instance and initializes its default state.

#### `public VertexBuilder set(int a, int el, float v)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public VertexBuilder set(int a, float... v)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public VertexBuilder set(int a, Coord3f c)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public VertexBuilder set(int a, FColor c)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public VertexBuilder set(int a, java.awt.Color c)`
- Role: Performs set.
- Description: Supports the set operation used by the surrounding class.

#### `public int voff()`
- Role: Performs voff.
- Description: Supports the voff operation used by the surrounding class.

#### `public int emit()`
- Role: Performs emit.
- Description: Supports the emit operation used by the surrounding class.

#### `public VertexBuilder emitm()`
- Role: Performs emitm.
- Description: Supports the emitm operation used by the surrounding class.

#### `public byte[] fina()`
- Role: Performs fina.
- Description: Supports the fina operation used by the surrounding class.

#### `public VertexArray finv()`
- Role: Performs finv.
- Description: Supports the finv operation used by the surrounding class.

#### `public LayoutBuilder(int bufidx)`
- Role: Performs layout builder.
- Description: Supports the layout builder operation used by the surrounding class.

#### `public LayoutBuilder()`
- Role: Performs layout builder.
- Description: Supports the layout builder operation used by the surrounding class.

#### `public LayoutBuilder add(Attribute attr, VectorFormat efmt)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Layout fin()`
- Role: Performs fin.
- Description: Supports the fin operation used by the surrounding class.

#### `public VertexBuilder buf()`
- Role: Performs buf.
- Description: Supports the buf operation used by the surrounding class.

#### `public static LayoutBuilder fmt()`
- Role: Performs fmt.
- Description: Supports the fmt operation used by the surrounding class.
