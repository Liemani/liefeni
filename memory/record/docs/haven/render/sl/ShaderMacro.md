---
source: [ShaderMacro.java](../../../../../../src/haven/render/sl/ShaderMacro.java)
created: 2026-06-13
updated: 2026-06-14
---

# ShaderMacro

Represents the shader macro shader-language AST node.

## Members

### Constants

#### `public static final ShaderMacro nil = new ShaderMacro()`
- Role: Defines the shared no-op macro.
- Description: Shared shader macro that does nothing.
- Value: `new ShaderMacro()`

#### `private static final WeakHashedSet<ShaderMacro> composed = new WeakHashedSet<>(Hash.eq)`
- Role: Caches composed shader macros.
- Description: Interns macro collections by identity-friendly equality.
- Value: `new WeakHashedSet<>(Hash.eq)`

#### `public static final ShaderMacro dump = new ShaderMacro()`
- Role: Defines the shared dump macro.
- Description: Shared shader macro that enables source dumping.
- Value: `new ShaderMacro()`

### Fields

#### `public final Collection<ShaderMacro> smacs`
- Role: Stores the composed macros.
- Description: Iterated when the composed macro is applied.

### Methods

#### `public void modify(ProgramContext prog)`
- Role: Installs the shader macro.
- Description: Applies the macro to the program context.

#### `public Composed(Collection<ShaderMacro> smacs)`
- Role: Combines several shader macros.
- Description: Stores the macro collection for later application.

#### `public void modify(ProgramContext prog)`
- Role: Installs the composed shader macro.
- Description: Applies every stored macro to the program context.

#### `public String toString()`
- Role: Formats the string representation.
- Description: Formats this ShaderMacro for debugging and logging.

#### `public boolean equals(Object that)`
- Role: Checks whether this value equals another value.
- Description: Returns whether the condition is satisfied.

#### `public int hashCode()`
- Role: Returns the hash code.
- Description: Returns whether the h code is present.

#### `public static ShaderMacro compose(Collection<ShaderMacro> smacs)`
- Role: Builds a composed shader macro.
- Description: Reuses or interns a combined macro for the provided collection.

#### `public static ShaderMacro compose(ShaderMacro... smacs)`
- Role: Builds a composed shader macro.
- Description: Reuses or interns a combined macro for the provided array.