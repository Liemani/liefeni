# Symbol

This file documents the responsibilities and members of `Symbol`.

## Meta

- Source: [Symbol.java](../../../../../src/haven/render/sl/Symbol.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the symbol shader-language AST node.

## Nested Types

### Fix

- Role: Represents fix within Symbol.
- Description: Describes the nested fix type used by the enclosing class.

### Gen

- Role: Represents gen within Symbol.
- Description: Describes the nested gen type used by the enclosing class.

### Shared

- Role: Represents shared within Symbol.
- Description: Describes the nested shared type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final String prefix`
- Role: Stores the prefix value.
- Description: Backs the cached state for this file.

#### `public final String name`
- Role: Stores the name value.
- Description: Backs the cached state for this file.

#### `public final String prefix`
- Role: Stores the prefix value.
- Description: Backs the cached state for this file.

### Methods

#### `public abstract String name(Context ctx)`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public Gen(String prefix)`
- Role: Performs gen.
- Description: Supports the gen operation used by the surrounding class.

#### `public Gen()`
- Role: Performs gen.
- Description: Supports the gen operation used by the surrounding class.

#### `public String name(Context ctx)`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Fix(String name)`
- Role: Performs fix.
- Description: Supports the fix operation used by the surrounding class.

#### `public String name(Context ctx)`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Shared(String prefix)`
- Role: Performs shared.
- Description: Supports the shared operation used by the surrounding class.

#### `public Shared()`
- Role: Performs shared.
- Description: Supports the shared operation used by the surrounding class.

#### `public String name(Context ctx)`
- Role: Performs name.
- Description: Supports the name operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.
