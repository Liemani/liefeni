# InstancedUniform

This file documents the responsibilities and members of `InstancedUniform`.

## Meta

- Source: [InstancedUniform.java](../../../../../src/haven/render/sl/InstancedUniform.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents an instanced uniform.

## Nested Types

### Float1

- Description: TODO

### IVec2

- Description: TODO

### Int

- Description: TODO

### Mat4

- Description: TODO

### Vec4

- Description: TODO

## Members

### Constants

#### `private static final Object refproc = new PostProc.AutoID("refproc", 9000)`

- Description: TODO

#### `public static final VectorFormat fmt = new VectorFormat(1, NumberFormat.FLOAT32)`

- Description: TODO

#### `public static final VectorFormat fmt = new VectorFormat(4, NumberFormat.FLOAT32)`

- Description: TODO

#### `public static final VectorFormat fmt = new VectorFormat(1, NumberFormat.SINT32)`

- Description: TODO

#### `public static final VectorFormat fmt = new VectorFormat(2, NumberFormat.SINT32)`

- Description: TODO

#### `public static final VectorFormat fmt = new VectorFormat(16, NumberFormat.FLOAT32)`

- Description: TODO

### Fields

#### `public final Slot[] deps`

- Description: TODO

#### `public final Uniform uniform`

- Description: TODO

#### `public final InstancedAttribute attrib`

- Description: TODO

#### `public final Function<Pipe, Float> value`

- Description: TODO

#### `public final Function<Pipe, float[]> value`

- Description: TODO

#### `public final Function<Pipe, Integer> value`

- Description: TODO

#### `public final Function<Pipe, int[]> value`

- Description: TODO

#### `public final Function<Pipe, Matrix4f> value`

- Description: TODO

### Methods

#### `public InstancedUniform(Type type, String infix, Slot... deps)`

- Description: TODO

#### `public Expression ref()`

- Description: TODO

#### `protected abstract Object uniformval(Pipe state)`

- Description: TODO

#### `protected abstract VectorFormat attrfmt()`

- Description: TODO

#### `protected abstract void attrfill(ByteBuffer buf, int offset, Pipe state)`

- Description: TODO

#### `public Float1(String infix, Function<Pipe, Float> value, Slot... deps)`

- Description: TODO

#### `protected Object uniformval(Pipe state)`

- Description: TODO

#### `protected VectorFormat attrfmt()`

- Description: TODO

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`

- Description: TODO

#### `public Vec4(String infix, Function<Pipe, float[]> value, Slot... deps)`

- Description: TODO

#### `protected Object uniformval(Pipe state)`

- Description: TODO

#### `protected VectorFormat attrfmt()`

- Description: TODO

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`

- Description: TODO

#### `public Int(String infix, Function<Pipe, Integer> value, Slot... deps)`

- Description: TODO

#### `protected Object uniformval(Pipe state)`

- Description: TODO

#### `protected VectorFormat attrfmt()`

- Description: TODO

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`

- Description: TODO

#### `public IVec2(String infix, Function<Pipe, int[]> value, Slot... deps)`

- Description: TODO

#### `protected Object uniformval(Pipe state)`

- Description: TODO

#### `protected VectorFormat attrfmt()`

- Description: TODO

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`

- Description: TODO

#### `public Mat4(String infix, Function<Pipe, Matrix4f> value, Slot... deps)`

- Description: TODO

#### `protected Object uniformval(Pipe state)`

- Description: TODO

#### `protected VectorFormat attrfmt()`

- Description: TODO

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`

- Description: TODO
