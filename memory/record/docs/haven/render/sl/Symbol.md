---
source: [Symbol.java](../../../../../../src/haven/render/sl/Symbol.java)
created: 2026-06-13
updated: 2026-06-20
---

# Symbol

Represents a shader-language symbol that resolves to a context-specific name.

## Nested Types

### Gen
Generated symbol name with a prefix and per-context uniqueness.

#### Members

##### Fields

#### `public final String prefix`
- Role: Stores the symbol prefix.
- Description: Used when generating a unique name in the context.

##### Methods

#### `public Gen(String prefix)`
- Role: Builds a generated symbol with an explicit prefix.
- Description: Stores the prefix used when generating names.

#### `public Gen()`
- Role: Builds a generated symbol with the default prefix.
- Description: Uses `g` as the default prefix.

#### `public String name(Context ctx)`
- Role: Resolves the generated symbol name.
- Description: Reuses an existing name in the context or generates a new one.

#### `public String toString()`
- Role: Returns a debug string.
- Description: Shows the generated-symbol prefix.

### Fix
Fixed literal symbol name.

#### Members

##### Fields

#### `public final String name`
- Role: Stores the fixed symbol text.
- Description: Returned unchanged when the symbol is resolved.

##### Methods

#### `public Fix(String name)`
- Role: Builds a fixed symbol.
- Description: Stores the literal name.

#### `public String name(Context ctx)`
- Role: Resolves the fixed symbol name.
- Description: Registers the literal name in the context or verifies that it is unused.

#### `public String toString()`
- Role: Returns a debug string.
- Description: Shows the literal symbol name.

### Shared
Context-shared symbol that uses one generated name across shader and program scopes.

#### Members

##### Fields

#### `public final String prefix`
- Role: Stores the shared prefix.
- Description: Used when generating the shared symbol name.

##### Methods

#### `public Shared(String prefix)`
- Role: Builds a shared symbol with an explicit prefix.
- Description: Stores the prefix used for shared-name generation.

#### `public Shared()`
- Role: Builds a shared symbol with the default prefix.
- Description: Uses `s_g` as the default prefix.

#### `public String name(Context ctx)`
- Role: Resolves the shared symbol name.
- Description: Requires a shader context and reuses one generated name across compatible contexts.

#### `public String toString()`
- Role: Returns a debug string.
- Description: Shows the shared-symbol prefix.

## Members

### Methods

#### `public abstract String name(Context ctx)`
- Role: Resolves the symbol to a context-specific name.
- Description: Implemented by each symbol strategy.