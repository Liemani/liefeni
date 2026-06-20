---
source: [Block.java](../../../../../src/haven/render/sl/Block.java)
created: 2026-06-13
updated: 2026-06-14
---

# Block

Represents the block shader-language AST node.

## Nested Types

### Def

- Role: Represents def within Block.
- Description: Describes the nested def type used by the enclosing class.

### Local

- Role: Represents local within Block.
- Description: Describes the nested local type used by the enclosing class.

## Members

### Constants

### Fields

#### `public final List<Statement> stmts = new LinkedList<Statement>()`
- Role: Caches stmts entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `private final Expression init`
- Role: Holds the init state.
- Description: Backs the cached state for this file.

### Methods

#### `public Block(Statement... stmts)`
- Role: Creates a new Block instance.
- Description: Constructs the instance and initializes its default state.

#### `public Local(Type type, Symbol name)`
- Role: Performs local.
- Description: Supports the local operation used by the surrounding class.

#### `public Local(Type type)`
- Role: Performs local.
- Description: Supports the local operation used by the surrounding class.

#### `public Def(Expression init)`
- Role: Performs def.
- Description: Supports the def operation used by the surrounding class.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.

#### `public void add(Statement stmt, Statement before)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void add(Statement stmt)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void add(Expression expr, Statement before)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public void add(Expression expr)`
- Role: Performs add.
- Description: Supports the add operation used by the surrounding class.

#### `public Local local(Type type, Symbol name, Expression init, Statement before)`
- Role: Performs local.
- Description: Supports the local operation used by the surrounding class.

#### `public Local local(Type type, Symbol name, Expression init)`
- Role: Performs local.
- Description: Supports the local operation used by the surrounding class.

#### `public Local local(Type type, String prefix, Expression init)`
- Role: Performs local.
- Description: Supports the local operation used by the surrounding class.

#### `public Local local(Type type, Expression init)`
- Role: Performs local.
- Description: Supports the local operation used by the surrounding class.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void trail(Output out, boolean nl)`
- Role: Performs trail.
- Description: Supports the trail operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
