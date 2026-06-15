# ShaderMacro

This file documents the responsibilities and members of `ShaderMacro`.

## Meta

- Source: [ShaderMacro.java](../../../../../src/haven/render/sl/ShaderMacro.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a shader macro.

## Members

### Constants

#### `public static final ShaderMacro nil = new ShaderMacro()`

- Description: TODO

#### `private static final WeakHashedSet<ShaderMacro> composed = new WeakHashedSet<>(Hash.eq)`

- Description: TODO

#### `public static final ShaderMacro dump = new ShaderMacro()`

- Description: TODO

### Fields

#### `public final Collection<ShaderMacro> smacs`

- Description: TODO

### Methods

#### `public void modify(ProgramContext prog)`

- Description: TODO

#### `public Composed(Collection<ShaderMacro> smacs)`

- Description: TODO

#### `public void modify(ProgramContext prog)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public boolean equals(Object that)`

- Description: TODO

#### `public int hashCode()`

- Description: TODO

#### `public static ShaderMacro compose(Collection<ShaderMacro> smacs)`

- Description: TODO

#### `public static ShaderMacro compose(ShaderMacro... smacs)`

- Description: TODO
