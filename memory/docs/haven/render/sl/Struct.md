# Struct

This file documents the responsibilities and members of `Struct`.

## Meta

- Source: [Struct.java](../../../../../src/haven/render/sl/Struct.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the struct shader-language AST node.

## Nested Types

### Constructor

- Role: Represents constructor within Struct.
- Description: Describes the nested constructor type used by the enclosing class.

### Definition

- Role: Represents definition within Struct.
- Description: Describes the nested definition type used by the enclosing class.

### Field

- Role: Represents field within Struct.
- Description: Describes the nested field type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Symbol name`
- Role: Holds the name state.
- Description: Backs the cached state for this file.

#### `public final List<Field> fields`
- Role: Caches fields entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Type type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final Expression[] els`
- Role: Holds the els state.
- Description: Backs the cached state for this file.

### Methods

#### `public Field(Type type, String name)`
- Role: Performs field.
- Description: Supports the field operation used by the surrounding class.

#### `private Struct(Symbol name, List<Field> fields)`
- Role: Creates a new Struct instance.
- Description: Constructs the instance and initializes its default state.

#### `public Struct(Symbol name, Field... fields)`
- Role: Creates a new Struct instance.
- Description: Constructs the instance and initializes its default state.

#### `public Struct(Symbol name)`
- Role: Creates a new Struct instance.
- Description: Constructs the instance and initializes its default state.

#### `public static Struct make(Symbol name, Object... args)`
- Role: Performs make.
- Description: Supports the make operation used by the surrounding class.

#### `public String name(Context ctx)`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public boolean equals(Object o)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public Constructor(Expression... els)`
- Role: function Object() { [native code] }
- Description: Supports the constructor operation used by the surrounding class.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `public Constructor construct(Expression... els)`
- Role: Performs construct.
- Description: Supports the construct operation used by the surrounding class.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `public Struct type()`
- Role: Performs type.
- Description: Supports the type operation used by the surrounding class.

#### `public boolean defined(Context ctx)`
- Role: Performs defined.
- Description: Supports the defined operation used by the surrounding class.

#### `public void use(Context ctx)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.
