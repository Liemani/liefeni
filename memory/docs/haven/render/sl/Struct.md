# Struct

This file documents the responsibilities and members of `Struct`.

## Meta

- Source: [Struct.java](../../../../../src/haven/render/sl/Struct.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a shader struct.

## Nested Types

### Constructor

- Description: TODO

### Definition

- Description: TODO

### Field

- Description: TODO

## Members

### Constants

### Fields

#### `public final Symbol name`

- Description: TODO

#### `public final List<Field> fields`

- Description: TODO

#### `public final Type type`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final Expression[] els`

- Description: TODO

### Methods

#### `public Field(Type type, String name)`

- Description: TODO

#### `private Struct(Symbol name, List<Field> fields)`

- Description: TODO

#### `public Struct(Symbol name, Field... fields)`

- Description: TODO

#### `public Struct(Symbol name)`

- Description: TODO

#### `public static Struct make(Symbol name, Object... args)`

- Description: TODO

#### `public String name(Context ctx)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public boolean equals(Object o)`

- Description: TODO

#### `public Constructor(Expression... els)`

- Description: TODO

#### `public void walk(Walker w)`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO

#### `public Constructor construct(Expression... els)`

- Description: TODO

#### `public void walk(Walker w)`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO

#### `public Struct type()`

- Description: TODO

#### `public boolean defined(Context ctx)`

- Description: TODO

#### `public void use(Context ctx)`

- Description: TODO
