# VertexBuilder

This file documents the responsibilities and members of `VertexBuilder`.

## Meta

- Source: [VertexBuilder.java](../../../src/haven/VertexBuilder.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Builds vertex data.

## Nested Types

### LayoutBuilder

- Description: TODO

## Members

### Constants

### Fields

#### `public final Layout fmt`

- Description: TODO

#### `public final int vsz`

- Description: TODO

#### `private final byte[] cur`

- Description: TODO

#### `private int vn = 0`

- Description: TODO

#### `private byte[] data`

- Description: TODO

#### `private final List<Attribute> attr = new ArrayList<>()`

- Description: TODO

#### `private final List<VectorFormat> efmt = new ArrayList<>()`

- Description: TODO

#### `public final int bufidx`

- Description: TODO

### Methods

#### `public VertexBuilder(Layout fmt)`

- Description: TODO

#### `public VertexBuilder set(int a, int el, float v)`

- Description: TODO

#### `public VertexBuilder set(int a, float... v)`

- Description: TODO

#### `public VertexBuilder set(int a, Coord3f c)`

- Description: TODO

#### `public VertexBuilder set(int a, FColor c)`

- Description: TODO

#### `public VertexBuilder set(int a, java.awt.Color c)`

- Description: TODO

#### `public int voff()`

- Description: TODO

#### `public int emit()`

- Description: TODO

#### `public VertexBuilder emitm()`

- Description: TODO

#### `public byte[] fina()`

- Description: TODO

#### `public VertexArray finv()`

- Description: TODO

#### `public LayoutBuilder(int bufidx)`

- Description: TODO

#### `public LayoutBuilder()`

- Description: TODO

#### `public LayoutBuilder add(Attribute attr, VectorFormat efmt)`

- Description: TODO

#### `public Layout fin()`

- Description: TODO

#### `public VertexBuilder buf()`

- Description: TODO

#### `public static LayoutBuilder fmt()`

- Description: TODO
