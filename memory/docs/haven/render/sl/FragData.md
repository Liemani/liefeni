# FragData

This file documents the responsibilities and members of `FragData`.

## Meta

- Source: [FragData.java](../../../../../src/haven/render/sl/FragData.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents fragment shader data.

## Nested Types

### Def

- Description: TODO

## Members

### Constants

#### `private static final Object defid = new PostProc.AutoID("fragdata", 15000)`

- Description: TODO

### Fields

#### `public final Function<Pipe, Object> value`

- Description: TODO

#### `public final Collection<State.Slot<?>> deps`

- Description: TODO

#### `public boolean primary = false`

- Description: TODO

### Methods

#### `public FragData(Type type, Symbol name, Function<Pipe, Object> value, State.Slot<?>... deps)`

- Description: TODO

#### `public FragData(Type type, String infix, Function<Pipe, Object> value, State.Slot<?>... deps)`

- Description: TODO

#### `public FragData(Type type, Function<Pipe, Object> value, State.Slot<?>... deps)`

- Description: TODO

#### `public FragData primary()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public void process(PostProc proc)`

- Description: TODO

#### `public Object ppid()`

- Description: TODO

#### `private FragData var()`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO

#### `public void use(Context ctx)`

- Description: TODO
