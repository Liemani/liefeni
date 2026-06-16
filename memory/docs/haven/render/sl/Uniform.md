# Uniform

This file documents the responsibilities and members of `Uniform`.

## Meta

- Source: [Uniform.java](../../../../../src/haven/render/sl/Uniform.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the uniform shader-language AST node.

## Nested Types

### Data

- Role: Represents data within Uniform.
- Description: Describes the nested data type used by the enclosing class.

### Def

- Role: Represents def within Uniform.
- Description: Describes the nested def type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final Function<Pipe, Object> value`
- Role: Holds the value state.
- Description: Backs the cached state for this file.

#### `public final Collection<State.Slot<?>> deps`
- Role: Caches deps entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Function<Pipe, T> value`
- Role: Holds the value state.
- Description: Backs the cached state for this file.

#### `public final State.Slot<?>[] deps`
- Role: Holds the deps state.
- Description: Backs the cached state for this file.

### Methods

#### `public Uniform(Type type, Symbol name, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Creates a new Uniform instance.
- Description: Constructs the instance and initializes its default state.

#### `public Uniform(Type type, String infix, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Creates a new Uniform instance.
- Description: Constructs the instance and initializes its default state.

#### `public Uniform(Type type, Function<Pipe, Object> value, State.Slot<?>... deps)`
- Role: Creates a new Uniform instance.
- Description: Constructs the instance and initializes its default state.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `public void use(Context ctx)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Data(Function<Pipe, T> value, State.Slot<?>... deps)`
- Role: Performs data.
- Description: Supports the data operation used by the surrounding class.
