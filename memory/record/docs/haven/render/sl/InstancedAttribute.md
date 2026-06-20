---
source: [InstancedAttribute.java](../../../../../src/haven/render/sl/InstancedAttribute.java)
created: 2026-06-13
updated: 2026-06-14
---

# InstancedAttribute

Represents the instanced attribute shader-language AST node.

## Members

### Constants

### Fields

### Methods

#### `public InstancedAttribute(Type type, Symbol name)`
- Role: Creates a new InstancedAttribute instance.
- Description: Constructs the instance and initializes its default state.

#### `public InstancedAttribute(Type type, String infix)`
- Role: Creates a new InstancedAttribute instance.
- Description: Constructs the instance and initializes its default state.

#### `public InstancedAttribute(Type type)`
- Role: Creates a new InstancedAttribute instance.
- Description: Constructs the instance and initializes its default state.

#### `public abstract VectorFormat attrfmt()`
- Role: Performs attrfmt.
- Description: Supports the attrfmt operation used by the surrounding class.

#### `public int attrsize()`
- Role: Performs attrsize.
- Description: Supports the attrsize operation used by the surrounding class.

#### `public abstract void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Performs attrfill.
- Description: Supports the attrfill operation used by the surrounding class.
