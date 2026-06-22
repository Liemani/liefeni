---
source: [VertexBuilder.java](../../../../src/haven/VertexBuilder.java)
created: 2026-06-13
updated: 2026-06-14
---

# VertexBuilder

Represents the vertex builder Haven component.

## Nested Types

### LayoutBuilder

- Role: Builds a vertex array layout.
- Description: Helper that collects attributes and element formats into a VertexArray.Layout.

## Members

### Constants

### Fields

#### `public final Layout fmt`
- Role: Caches the fmt value.
- Description: Caches the `fmt` value for reuse.

#### `public final int vsz`
- Role: Caches the vsz value.
- Description: Caches the `vsz` value for reuse.

#### `private final byte[] cur`
- Role: Caches the cur value.
- Description: Caches the `cur` value for reuse.

#### `private int vn = 0`
- Role: Caches the vn value.
- Description: Caches the `vn` value for reuse.

#### `private byte[] data`
- Role: Caches the data value.
- Description: Caches the `data` value for reuse.

#### `private final List<Attribute> attr = new ArrayList<>()`
- Role: Implements the attr operation.
- Description: Implements the private final list<attribute> attr = new array list<>() operation.

#### `private final List<VectorFormat> efmt = new ArrayList<>()`
- Role: Implements the efmt operation.
- Description: Implements the private final list<vector format> efmt = new array list<>() operation.

#### `public final int bufidx`
- Role: Caches the bufidx value.
- Description: Caches the `bufidx` value for reuse.

### Methods

#### `public VertexBuilder(Layout fmt)`
- Role: Creates a new VertexBuilder instance.
- Description: Constructs the VertexBuilder instance from the supplied inputs.

#### `public VertexBuilder set(int a, int el, float v)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public VertexBuilder set(int a, float... v)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public VertexBuilder set(int a, Coord3f c)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public VertexBuilder set(int a, FColor c)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public VertexBuilder set(int a, java.awt.Color c)`
- Role: Handles the set path.
- Description: Updates the cached set.

#### `public int voff()`
- Role: Handles the voff path.
- Description: Implements the voff operation.

#### `public int emit()`
- Role: Handles the emit path.
- Description: Implements the emit operation.

#### `public VertexBuilder emitm()`
- Role: Handles the emitm path.
- Description: Implements the emitm operation.

#### `public byte[] fina()`
- Role: Handles the fina path.
- Description: Implements the fina operation.

#### `public VertexArray finv()`
- Role: Handles the finv path.
- Description: Implements the finv operation.

#### `public LayoutBuilder(int bufidx)`
- Role: Handles the layout builder path.
- Description: Implements the layout builder operation.

#### `public LayoutBuilder()`
- Role: Handles the layout builder path.
- Description: Implements the layout builder operation.

#### `public LayoutBuilder add(Attribute attr, VectorFormat efmt)`
- Role: Adds the supplied value to the owning container.
- Description: Adds the supplied value to the owning container.

#### `public Layout fin()`
- Role: Handles the fin path.
- Description: Implements the fin operation.

#### `public VertexBuilder buf()`
- Role: Handles the buffer path.
- Description: Implements the buf operation.

#### `public static LayoutBuilder fmt()`
- Role: Handles the fmt path.
- Description: Implements the fmt operation.