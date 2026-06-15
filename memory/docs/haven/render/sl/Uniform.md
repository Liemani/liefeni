# Uniform

This file documents the responsibilities and members of `Uniform`.

## Meta

- Source: [Uniform.java](../../../../../src/haven/render/sl/Uniform.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a shader uniform.

## Nested Types

### Data

- Description: TODO

### Def

- Description: TODO

## Members

### Constants

### Fields

#### `public final Function<Pipe, Object> value`

- Description: TODO

#### `public final Collection<State.Slot<?>> deps`

- Description: TODO

#### `public final Function<Pipe, T> value`

- Description: TODO

#### `public final State.Slot<?>[] deps`

- Description: TODO

### Methods

#### `public Uniform(Type type, Symbol name, Function<Pipe, Object> value, State.Slot<?>... deps)`

- Description: TODO

#### `public Uniform(Type type, String infix, Function<Pipe, Object> value, State.Slot<?>... deps)`

- Description: TODO

#### `public Uniform(Type type, Function<Pipe, Object> value, State.Slot<?>... deps)`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO

#### `public void use(Context ctx)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Data(Function<Pipe, T> value, State.Slot<?>... deps)`

- Description: TODO
