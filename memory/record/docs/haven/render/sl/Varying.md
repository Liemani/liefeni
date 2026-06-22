---
source: [Varying.java](../../../../../../src/haven/render/sl/Varying.java)
created: 2026-06-13
updated: 2026-06-20
---

# Varying

Represents the varying shader-language AST node.

## Nested Types

### Interpol
Interpolation mode used when emitting the varying.

### Def
Top-level varying declaration emitted into the vertex and fragment shader contexts.

#### Members

##### Methods

#### `public void output(Output out)`
- Role: Emits the varying declaration.
- Description: Writes interpolation qualifiers and vertex/fragment direction keywords.

## Members

### Fields

#### `public Interpol ipol = Interpol.NORMAL`
- Role: Stores the interpolation mode.
- Description: Defaults to smooth interpolation.

### Methods

#### `protected Interpol ipol(Context ctx)`
- Role: Returns the interpolation mode for the current context.
- Description: Hook for subclasses.

#### `public Varying(Type type, Symbol name)`
- Role: Creates a new varying.
- Description: Stores the type and symbol for the varying.

#### `public void use(Context ctx)`
- Role: Registers the varying in the shader context.
- Description: Adds a definition if needed.