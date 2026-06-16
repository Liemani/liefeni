# InstancedUniform

This file documents the responsibilities and members of `InstancedUniform`.

## Meta

- Source: [InstancedUniform.java](../../../../../src/haven/render/sl/InstancedUniform.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the instanced uniform shader-language AST node.

## Nested Types

### Float1

- Role: Represents float1 within InstancedUniform.
- Description: Describes the nested float1 type used by the enclosing class.

### IVec2

- Role: Represents ivec2 within InstancedUniform.
- Description: Describes the nested ivec2 type used by the enclosing class.

### Int

- Role: Represents int within InstancedUniform.
- Description: Describes the nested int type used by the enclosing class.

### Mat4

- Role: Represents mat4 within InstancedUniform.
- Description: Describes the nested mat4 type used by the enclosing class.

### Vec4

- Role: Represents vec4 within InstancedUniform.
- Description: Describes the nested vec4 type used by the enclosing class.

## Members

### Constants

#### `private static final Object refproc = new PostProc.AutoID("refproc", 9000)`
- Role: Defines the shared refproc constant.
- Description: Shared constant used by the rest of the class.

#### `public static final VectorFormat fmt = new VectorFormat(1, NumberFormat.FLOAT32)`
- Role: Defines the shared fmt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final VectorFormat fmt = new VectorFormat(4, NumberFormat.FLOAT32)`
- Role: Defines the shared fmt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final VectorFormat fmt = new VectorFormat(1, NumberFormat.SINT32)`
- Role: Defines the shared fmt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final VectorFormat fmt = new VectorFormat(2, NumberFormat.SINT32)`
- Role: Defines the shared fmt constant.
- Description: Shared constant used by the rest of the class.

#### `public static final VectorFormat fmt = new VectorFormat(16, NumberFormat.FLOAT32)`
- Role: Defines the shared fmt constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Slot[] deps`
- Role: Holds the deps state.
- Description: Backs the cached state for this file.

#### `public final Uniform uniform`
- Role: Holds the uniform state.
- Description: Backs the cached state for this file.

#### `public final InstancedAttribute attrib`
- Role: Holds the attrib state.
- Description: Backs the cached state for this file.

#### `public final Function<Pipe, Float> value`
- Role: Stores the value value.
- Description: Backs the cached state for this file.

#### `public final Function<Pipe, float[]> value`
- Role: Stores the value value.
- Description: Backs the cached state for this file.

#### `public final Function<Pipe, Integer> value`
- Role: Stores the value value.
- Description: Backs the cached state for this file.

#### `public final Function<Pipe, int[]> value`
- Role: Stores the value value.
- Description: Backs the cached state for this file.

#### `public final Function<Pipe, Matrix4f> value`
- Role: Holds the value state.
- Description: Backs the cached state for this file.

### Methods

#### `public InstancedUniform(Type type, String infix, Slot... deps)`
- Role: Creates a new InstancedUniform instance.
- Description: Constructs the instance and initializes its default state.

#### `public Expression ref()`
- Role: Performs ref.
- Description: Supports the ref operation used by the surrounding class.

#### `protected abstract Object uniformval(Pipe state)`
- Role: Performs uniformval.
- Description: Supports the uniformval operation used by the surrounding class.

#### `protected abstract VectorFormat attrfmt()`
- Role: Performs attrfmt.
- Description: Supports the attrfmt operation used by the surrounding class.

#### `protected abstract void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Performs attrfill.
- Description: Supports the attrfill operation used by the surrounding class.

#### `public Float1(String infix, Function<Pipe, Float> value, Slot... deps)`
- Role: Performs float1.
- Description: Supports the float1 operation used by the surrounding class.

#### `protected Object uniformval(Pipe state)`
- Role: Performs uniformval.
- Description: Supports the uniformval operation used by the surrounding class.

#### `protected VectorFormat attrfmt()`
- Role: Performs attrfmt.
- Description: Supports the attrfmt operation used by the surrounding class.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Performs attrfill.
- Description: Supports the attrfill operation used by the surrounding class.

#### `public Vec4(String infix, Function<Pipe, float[]> value, Slot... deps)`
- Role: Performs vec4.
- Description: Supports the vec4 operation used by the surrounding class.

#### `protected Object uniformval(Pipe state)`
- Role: Performs uniformval.
- Description: Supports the uniformval operation used by the surrounding class.

#### `protected VectorFormat attrfmt()`
- Role: Performs attrfmt.
- Description: Supports the attrfmt operation used by the surrounding class.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Performs attrfill.
- Description: Supports the attrfill operation used by the surrounding class.

#### `public Int(String infix, Function<Pipe, Integer> value, Slot... deps)`
- Role: Performs int.
- Description: Supports the int operation used by the surrounding class.

#### `protected Object uniformval(Pipe state)`
- Role: Performs uniformval.
- Description: Supports the uniformval operation used by the surrounding class.

#### `protected VectorFormat attrfmt()`
- Role: Performs attrfmt.
- Description: Supports the attrfmt operation used by the surrounding class.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Performs attrfill.
- Description: Supports the attrfill operation used by the surrounding class.

#### `public IVec2(String infix, Function<Pipe, int[]> value, Slot... deps)`
- Role: Performs ivec2.
- Description: Supports the ivec2 operation used by the surrounding class.

#### `protected Object uniformval(Pipe state)`
- Role: Performs uniformval.
- Description: Supports the uniformval operation used by the surrounding class.

#### `protected VectorFormat attrfmt()`
- Role: Performs attrfmt.
- Description: Supports the attrfmt operation used by the surrounding class.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Performs attrfill.
- Description: Supports the attrfill operation used by the surrounding class.

#### `public Mat4(String infix, Function<Pipe, Matrix4f> value, Slot... deps)`
- Role: Performs mat4.
- Description: Supports the mat4 operation used by the surrounding class.

#### `protected Object uniformval(Pipe state)`
- Role: Performs uniformval.
- Description: Supports the uniformval operation used by the surrounding class.

#### `protected VectorFormat attrfmt()`
- Role: Performs attrfmt.
- Description: Supports the attrfmt operation used by the surrounding class.

#### `protected void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Performs attrfill.
- Description: Supports the attrfill operation used by the surrounding class.
