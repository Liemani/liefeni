# Varying

This file documents the responsibilities and members of `Varying`.

## Meta

- Source: [Varying.java](../../../../../src/haven/render/sl/Varying.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the varying shader-language AST node.

## Nested Types

### Def

- Role: Represents def within Varying.
- Description: Describes the nested def type used by the enclosing class.

### Interpol

- Role: Represents interpol within Varying.
- Description: Describes the nested interpol type used by the enclosing class.

## Members

### Constants

### Fields

#### `public Interpol ipol = Interpol.NORMAL`
- Role: Stores the ipol value.
- Description: Backs the cached state for this file.

### Methods

#### `protected Interpol ipol(Context ctx)`
- Role: Performs ipol.
- Description: Supports the ipol operation used by the surrounding class.

#### `public Varying(Type type, Symbol name)`
- Role: Creates a new Varying instance.
- Description: Constructs the instance and initializes its default state.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `public void use(Context ctx)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.
