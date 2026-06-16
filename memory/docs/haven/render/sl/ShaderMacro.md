# ShaderMacro

This file documents the responsibilities and members of `ShaderMacro`.

## Meta

- Source: [ShaderMacro.java](../../../../../src/haven/render/sl/ShaderMacro.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the shader macro shader-language AST node.

## Members

### Constants

#### `public static final ShaderMacro nil = new ShaderMacro()`
- Role: Defines the shared nil constant.
- Description: Shared constant used by the rest of the class.

#### `private static final WeakHashedSet<ShaderMacro> composed = new WeakHashedSet<>(Hash.eq)`
- Role: Defines the shared composed constant.
- Description: Shared constant used by the rest of the class.

#### `public static final ShaderMacro dump = new ShaderMacro()`
- Role: Defines the shared dump constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Collection<ShaderMacro> smacs`
- Role: Caches smacs entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public void modify(ProgramContext prog)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public Composed(Collection<ShaderMacro> smacs)`
- Role: Performs composed.
- Description: Supports the composed operation used by the surrounding class.

#### `public void modify(ProgramContext prog)`
- Role: Performs modify.
- Description: Supports the modify operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns a boolean result for the described condition.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Exposes the requested value without mutating state.

#### `public static ShaderMacro compose(Collection<ShaderMacro> smacs)`
- Role: Performs compose.
- Description: Supports the compose operation used by the surrounding class.

#### `public static ShaderMacro compose(ShaderMacro... smacs)`
- Role: Performs compose.
- Description: Supports the compose operation used by the surrounding class.
