# Attribute

This file documents the responsibilities and members of `Attribute`.

## Meta

- Source: [Attribute.java](../../../../../src/haven/render/sl/Attribute.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the attribute shader-language AST node.

## Nested Types

### Def

- Role: Represents def within Attribute.
- Description: Describes the nested def type used by the enclosing class.

## Members

### Constants

### Fields

#### `public boolean primary = false`
- Role: Tracks the primary flag.
- Description: Supports the primary operation used by the surrounding class.

### Methods

#### `public Attribute(Type type, Symbol name)`
- Role: Creates a new Attribute instance.
- Description: Constructs the instance and initializes its default state.

#### `public Attribute(Type type, String infix)`
- Role: Creates a new Attribute instance.
- Description: Constructs the instance and initializes its default state.

#### `public Attribute(Type type)`
- Role: Creates a new Attribute instance.
- Description: Constructs the instance and initializes its default state.

#### `public Attribute primary()`
- Role: Performs primary.
- Description: Supports the primary operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `public void use(Context ctx)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.
