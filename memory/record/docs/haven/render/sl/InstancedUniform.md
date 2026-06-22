---
source: [InstancedUniform.java](../../../../../../src/haven/render/sl/InstancedUniform.java)
created: 2026-06-13
updated: 2026-06-14
---

# InstancedUniform

Represents the instanced uniform shader-language AST node.

## Nested Types

### Float1
Float-valued instanced uniform that stores one scalar per instance.

#### Members

##### Fields

#### `public final Function<Pipe, Float> value`
- Role: Stores the scalar provider.
- Description: Reads the instance-specific float from the render state.

##### Methods

#### `public Float1(String infix, Function<Pipe, Float> value, Slot... deps)`
- Role: Builds a float instanced uniform.
- Description: Registers the scalar provider and dependency slots.

#### `protected Object uniformval(Pipe state)`
- Role: Resolves the scalar uniform value.
- Description: Returns the current float from the render state.

#### `protected VectorFormat attrfmt()`
- Role: Returns the attribute layout.
- Description: Uses one 32-bit float per instance.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Writes the instance attribute.
- Description: Stores the scalar in the instance buffer.

### IVec2
Two-component integer instanced uniform.

#### Members

##### Fields

#### `public final Function<Pipe, int[]> value`
- Role: Stores the vector provider.
- Description: Reads the instance-specific integer pair.

##### Methods

#### `public IVec2(String infix, Function<Pipe, int[]> value, Slot... deps)`
- Role: Builds an ivec2 instanced uniform.
- Description: Registers the vector provider and dependency slots.

#### `protected Object uniformval(Pipe state)`
- Role: Resolves the uniform value.
- Description: Returns the current integer vector from the render state.

#### `protected VectorFormat attrfmt()`
- Role: Returns the attribute layout.
- Description: Uses two signed 32-bit integers per instance.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Writes the instance attribute.
- Description: Stores the integer pair in the instance buffer.

### Int
Single signed integer instanced uniform.

#### Members

##### Fields

#### `public final Function<Pipe, Integer> value`
- Role: Stores the scalar provider.
- Description: Reads the instance-specific integer from the render state.

##### Methods

#### `public Int(String infix, Function<Pipe, Integer> value, Slot... deps)`
- Role: Builds an int instanced uniform.
- Description: Registers the scalar provider and dependency slots.

#### `protected Object uniformval(Pipe state)`
- Role: Resolves the uniform value.
- Description: Returns the current integer from the render state.

#### `protected VectorFormat attrfmt()`
- Role: Returns the attribute layout.
- Description: Uses one signed 32-bit integer per instance.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Writes the instance attribute.
- Description: Stores the integer in the instance buffer.

### Mat4
Matrix instanced uniform that stores a full 4x4 matrix per instance.

#### Members

##### Fields

#### `public final Function<Pipe, Matrix4f> value`
- Role: Stores the matrix provider.
- Description: Reads the instance-specific transform matrix.

##### Methods

#### `public Mat4(String infix, Function<Pipe, Matrix4f> value, Slot... deps)`
- Role: Builds a matrix instanced uniform.
- Description: Registers the matrix provider and dependency slots.

#### `protected Object uniformval(Pipe state)`
- Role: Resolves the uniform value.
- Description: Returns the current matrix from the render state.

#### `protected VectorFormat attrfmt()`
- Role: Returns the attribute layout.
- Description: Uses sixteen 32-bit floats per instance.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Writes the instance attribute.
- Description: Stores the matrix into the instance buffer.

### Vec4
Four-component float vector instanced uniform.

#### Members

##### Fields

#### `public final Function<Pipe, float[]> value`
- Role: Stores the vector provider.
- Description: Reads the instance-specific float vector.

##### Methods

#### `public Vec4(String infix, Function<Pipe, float[]> value, Slot... deps)`
- Role: Builds a vec4 instanced uniform.
- Description: Registers the vector provider and dependency slots.

#### `protected Object uniformval(Pipe state)`
- Role: Resolves the uniform value.
- Description: Returns the current float vector from the render state.

#### `protected VectorFormat attrfmt()`
- Role: Returns the attribute layout.
- Description: Uses four 32-bit floats per instance.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Writes the instance attribute.
- Description: Stores the vector in the instance buffer.

## Members

### Constants

#### `private static final Object refproc = new PostProc.AutoID("refproc", 9000)`
- Role: Implements the refproc operation.
- Description: Implements the auto id operation.
- Value: `new PostProc.AutoID("refproc", 9000)`

#### `public static final VectorFormat fmt = new VectorFormat(1, NumberFormat.FLOAT32)`
- Role: Implements the fmt operation.
- Description: Implements the vector format operation.
- Value: `new VectorFormat(1, NumberFormat.FLOAT32)`

#### `public static final VectorFormat fmt = new VectorFormat(4, NumberFormat.FLOAT32)`
- Role: Implements the fmt operation.
- Description: Implements the vector format operation.
- Value: `new VectorFormat(4, NumberFormat.FLOAT32)`

#### `public static final VectorFormat fmt = new VectorFormat(1, NumberFormat.SINT32)`
- Role: Implements the fmt operation.
- Description: Implements the vector format operation.
- Value: `new VectorFormat(1, NumberFormat.SINT32)`

#### `public static final VectorFormat fmt = new VectorFormat(2, NumberFormat.SINT32)`
- Role: Implements the fmt operation.
- Description: Implements the vector format operation.
- Value: `new VectorFormat(2, NumberFormat.SINT32)`

#### `public static final VectorFormat fmt = new VectorFormat(16, NumberFormat.FLOAT32)`
- Role: Implements the fmt operation.
- Description: Implements the vector format operation.
- Value: `new VectorFormat(16, NumberFormat.FLOAT32)`

### Fields

#### `public final Slot[] deps`
- Role: Stores dependency slots.
- Description: Tracks which render states affect the instance value.

#### `public final Uniform uniform`
- Role: Holds the backing uniform.
- Description: Exposes the uniform definition used for the instance value.

#### `public final InstancedAttribute attrib`
- Role: Holds the backing attribute.
- Description: Exposes the instance attribute used to upload the value.

#### `public final Function<Pipe, Float> value`
- Role: Stores the float provider.
- Description: Reads the instance-specific float from the render state.

#### `public final Function<Pipe, float[]> value`
- Role: Stores the vector provider.
- Description: Reads the instance-specific float vector.

#### `public final Function<Pipe, Integer> value`
- Role: Stores the integer provider.
- Description: Reads the instance-specific integer from the render state.

#### `public final Function<Pipe, int[]> value`
- Role: Stores the integer-vector provider.
- Description: Reads the instance-specific integer vector.

#### `public final Function<Pipe, Matrix4f> value`
- Role: Stores the matrix provider.
- Description: Reads the instance-specific transform matrix.

### Methods

#### `public InstancedUniform(Type type, String infix, Slot... deps)`
- Role: Creates one instanced uniform binding.
- Description: Stores the uniform type, name prefix, and dependency slots.

#### `public Expression ref()`
- Role: Returns the uniform reference.
- Description: Exposes the expression bound to the current instanced uniform.

#### `protected abstract Object uniformval(Pipe state)`
- Role: Resolves the uniform value.
- Description: Implemented by subclasses for each instance data shape.

#### `protected abstract VectorFormat attrfmt()`
- Role: Returns the attribute layout.
- Description: Describes how the instance data is packed into attributes.

#### `protected abstract void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Implements attrfill.
- Description: Implements the attrfill operation for this node.

#### `public Float1(String infix, Function<Pipe, Float> value, Slot... deps)`
- Role: Implements float1.
- Description: Implements the float1 operation for this node.

#### `protected Object uniformval(Pipe state)`
- Role: Implements uniformval.
- Description: Implements the uniformval operation for this node.

#### `protected VectorFormat attrfmt()`
- Role: Implements attrfmt.
- Description: Implements the attrfmt operation for this node.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Implements attrfill.
- Description: Implements the attrfill operation for this node.

#### `public Vec4(String infix, Function<Pipe, float[]> value, Slot... deps)`
- Role: Implements vec4.
- Description: Implements the vec4 operation for this node.

#### `protected Object uniformval(Pipe state)`
- Role: Implements uniformval.
- Description: Implements the uniformval operation for this node.

#### `protected VectorFormat attrfmt()`
- Role: Implements attrfmt.
- Description: Implements the attrfmt operation for this node.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Implements attrfill.
- Description: Implements the attrfill operation for this node.

#### `public Int(String infix, Function<Pipe, Integer> value, Slot... deps)`
- Role: Implements int.
- Description: Implements the int operation for this node.

#### `protected Object uniformval(Pipe state)`
- Role: Implements uniformval.
- Description: Implements the uniformval operation for this node.

#### `protected VectorFormat attrfmt()`
- Role: Implements attrfmt.
- Description: Implements the attrfmt operation for this node.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Implements attrfill.
- Description: Implements the attrfill operation for this node.

#### `public IVec2(String infix, Function<Pipe, int[]> value, Slot... deps)`
- Role: Implements ivec2.
- Description: Implements the ivec2 operation for this node.

#### `protected Object uniformval(Pipe state)`
- Role: Implements uniformval.
- Description: Implements the uniformval operation for this node.

#### `protected VectorFormat attrfmt()`
- Role: Implements attrfmt.
- Description: Implements the attrfmt operation for this node.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Implements attrfill.
- Description: Implements the attrfill operation for this node.

#### `public Mat4(String infix, Function<Pipe, Matrix4f> value, Slot... deps)`
- Role: Implements mat4.
- Description: Implements the mat4 operation for this node.

#### `protected Object uniformval(Pipe state)`
- Role: Implements uniformval.
- Description: Implements the uniformval operation for this node.

#### `protected VectorFormat attrfmt()`
- Role: Implements attrfmt.
- Description: Implements the attrfmt operation for this node.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Implements attrfill.
- Description: Implements the attrfill operation for this node.