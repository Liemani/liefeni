---
source: [Variable.java](../../../../../../src/haven/render/sl/Variable.java)
created: 2026-06-13
updated: 2026-06-20
---

# Variable

Represents a named shader-language value with type information and context-aware definition helpers.

## Nested Types

### Ref
Reference to a variable in generated shader code.

#### Members

##### Methods

#### `public void walk(Walker w)`
- Role: Walks as a leaf reference.
- Description: Variable references do not add child nodes.

#### `public void output(Output out)`
- Role: Emits the variable name.
- Description: Writes the resolved symbol name.

### Implicit
Variable that resolves directly from the shader context without emitting a definition.

### Global
Variable that can emit its declaration into a program context.

#### Members

##### Nested Types

###### `Ref`
Reference that registers post-processing usage for globals.

###### `Definition`
Top-level variable declaration emitted into the program context.

##### Methods

#### `public Global(Type type, Symbol name)`
- Role: Builds a named global variable.
- Description: Stores the type and symbol for a global declaration.

#### `public Global(Type type)`
- Role: Builds an auto-named global variable.
- Description: Uses a generated symbol name.

#### `public Ref ref()`
- Role: Returns a global-aware reference.
- Description: Uses a post-processed reference wrapper.

#### `public boolean defined(Context ctx)`
- Role: Checks whether the variable is already declared.
- Description: Scans the context declaration list.

#### `public void use(Context ctx)`
- Role: Ensures the variable is declared.
- Description: Adds a definition to the context if needed.

## Members

### Fields

#### `public final Type type`
- Role: Stores the variable type.
- Description: Used when declaring or emitting the variable.

#### `public final Symbol name`
- Role: Stores the variable symbol.
- Description: Used when emitting the variable name.

### Methods

#### `public Variable(Type type, Symbol name)`
- Role: Creates a named typed variable.
- Description: Stores the type and symbol.

#### `public Ref ref()`
- Role: Returns a reference to this variable.
- Description: Produces a leaf expression pointing at the variable.

#### `public String toString()`
- Role: Returns a debug description.
- Description: Shows class, type, and symbol.