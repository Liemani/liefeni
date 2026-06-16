# Variable

This file documents the responsibilities and members of `Variable`.

## Meta

- Source: [Variable.java](../../../../../src/haven/render/sl/Variable.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the variable shader-language AST node.

## Nested Types

### Definition

- Role: Represents definition within Variable.
- Description: Describes the nested definition type used by the enclosing class.

### Global

- Role: Represents global within Variable.
- Description: Describes the nested global type used by the enclosing class.

### Implicit

- Role: Represents implicit within Variable.
- Description: Describes the nested implicit type used by the enclosing class.

### Ref

- Role: Represents ref within Variable.
- Description: Describes the nested ref type used by the enclosing class.

## Members

### Constants

#### `private static final Object ppid = new PostProc.AutoID("vardef", 10000)`
- Role: Defines the shared ppid constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final Type type`
- Role: Holds the type state.
- Description: Backs the cached state for this file.

#### `public final Symbol name`
- Role: Holds the name state.
- Description: Backs the cached state for this file.

### Methods

#### `public Variable(Type type, Symbol name)`
- Role: Creates a new Variable instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `public Ref ref()`
- Role: Performs ref.
- Description: Supports the ref operation used by the surrounding class.

#### `public String toString()`
- Role: Returns the string representation.
- Description: Provides a human-readable representation for debugging and logging.

#### `public Implicit(Type type, Symbol name)`
- Role: Performs implicit.
- Description: Supports the implicit operation used by the surrounding class.

#### `public Global(Type type, Symbol name)`
- Role: Performs global.
- Description: Supports the global operation used by the surrounding class.

#### `public Global(Type type)`
- Role: Performs global.
- Description: Supports the global operation used by the surrounding class.

#### `public void process(PostProc proc)`
- Role: Performs process.
- Description: Supports the process operation used by the surrounding class.

#### `public Object ppid()`
- Role: Performs ppid.
- Description: Supports the ppid operation used by the surrounding class.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public Ref ref()`
- Role: Performs ref.
- Description: Supports the ref operation used by the surrounding class.

#### `public boolean defined(Context ctx)`
- Role: Performs defined.
- Description: Supports the defined operation used by the surrounding class.

#### `public void use(Context ctx)`
- Role: Performs use.
- Description: Supports the use operation used by the surrounding class.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `private Global var()`
- Role: Performs var.
- Description: Supports the var operation used by the surrounding class.
