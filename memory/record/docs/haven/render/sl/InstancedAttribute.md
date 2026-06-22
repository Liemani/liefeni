---
source: [InstancedAttribute.java](../../../../../../src/haven/render/sl/InstancedAttribute.java)
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
- Role: Creates one instanced attribute.
- Description: Stores the type and symbol for a per-instance vertex attribute.

#### `public InstancedAttribute(Type type, String infix)`
- Role: Creates one instanced attribute.
- Description: Builds a shared symbol name from the infix.

#### `public InstancedAttribute(Type type)`
- Role: Creates one auto-named instanced attribute.
- Description: Uses a generated shared symbol name.

#### `public abstract VectorFormat attrfmt()`
- Role: Returns the instance-attribute layout.
- Description: Describes how the attribute is packed in the instance buffer.

#### `public int attrsize()`
- Role: Returns the attribute size.
- Description: Reports the packed size of one instance attribute.

#### `public abstract void attrfill(ByteBuffer buf, int offset, Pipe state)`
- Role: Writes one instance attribute.
- Description: Serializes the attribute value into the instance buffer.