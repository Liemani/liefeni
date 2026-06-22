---
source: [Struct.java](../../../../../../src/haven/render/sl/Struct.java)
created: 2026-06-13
updated: 2026-06-20
---

# Struct

Represents a shader-language struct type and its constructor/definition helpers.

## Nested Types

### Field
One named struct field.

#### Members

##### Fields

#### `public final Type type`
- Role: Stores the field type.
- Description: Written into the struct declaration.

#### `public final String name`
- Role: Stores the field name.
- Description: Written into the struct declaration.

##### Methods

#### `public Field(Type type, String name)`
- Role: Builds a struct field.
- Description: Stores the type and field name.

### Constructor
Struct constructor expression.

#### Members

##### Fields

#### `public final Expression[] els`
- Role: Stores constructor arguments.
- Description: Emitted in order when the constructor is written.

##### Methods

#### `public Constructor(Expression... els)`
- Role: Builds a struct constructor expression.
- Description: Stores the supplied expressions.

#### `public void walk(Walker w)`
- Role: Walks constructor arguments.
- Description: Visits each child expression.

#### `public void output(Output out)`
- Role: Emits the constructor call.
- Description: Writes the struct name and comma-separated arguments.

### Definition
Struct type declaration node.

#### Members

##### Methods

#### `public void walk(Walker w)`
- Role: Walks the struct declaration.
- Description: Struct declarations do not have child expressions.

#### `public void output(Output out)`
- Role: Emits the struct declaration.
- Description: Writes the field list inside a `struct` block.

#### `public Struct type()`
- Role: Returns the enclosing struct type.
- Description: Used to deduplicate definitions in the context.

## Members

### Fields

#### `public final Symbol name`
- Role: Stores the struct symbol.
- Description: Used when printing and resolving the type.

#### `public final List<Field> fields`
- Role: Stores the field list.
- Description: Used when emitting and comparing struct types.

### Methods

#### `public Struct(Symbol name, Field... fields)`
- Role: Builds a struct type.
- Description: Stores the name and field list.

#### `public Struct(Symbol name)`
- Role: Builds an empty struct type.
- Description: Starts with no fields.

#### `public static Struct make(Symbol name, Object... args)`
- Role: Builds a struct type from alternating type/name arguments.
- Description: Convenience helper for compact declarations.

#### `public String name(Context ctx)`
- Role: Resolves the struct name.
- Description: Delegates to the underlying symbol.

#### `public int hashCode()`
- Role: Returns a hash for the field layout.
- Description: Based on the field list.

#### `public boolean equals(Object o)`
- Role: Compares struct field layouts.
- Description: Two structs are equal when their field lists match.

#### `public Constructor construct(Expression... els)`
- Role: Creates a struct constructor expression.
- Description: Convenience helper for building constructor nodes.

#### `public boolean defined(Context ctx)`
- Role: Checks whether the type is already declared.
- Description: Scans the typedef list in the context.

#### `public void use(Context ctx)`
- Role: Registers the struct definition.
- Description: Adds the declaration if it has not already been emitted.