---
source: [Block.java](../../../../../../src/haven/render/sl/Block.java)
created: 2026-06-13
updated: 2026-06-20
---

# Block

Represents a statement block and provides helpers for adding statements and local declarations.

## Nested Types

### `Local`
Local variable declaration helper used by `Block.local()`.

#### Members

##### Methods

#### `public Local(Type type, Symbol name)`
- Role: Builds a local variable descriptor.
- Description: Stores the type and symbol used for the local declaration.

#### `public Local(Type type)`
- Role: Builds a local variable descriptor with a generated name.
- Description: Uses an auto-generated symbol for the local declaration.

### `Def`
Local-variable declaration statement emitted by the block.

#### Members

##### Fields

#### `private final Expression init`
- Role: Stores the initializer expression.
- Description: Written only when the local is declared with an initializer.

##### Methods

#### `public Def(Expression init)`
- Role: Builds a local declaration statement.
- Description: Stores the initializer expression for later emission.

#### `public void walk(Walker w)`
- Role: Visits the initializer expression.
- Description: Walks the initializer when one is present.

#### `public void output(Output out)`
- Role: Emits the local declaration.
- Description: Writes the local type, name, and optional initializer to output.

## Members

### Fields

#### `public final List<Statement> stmts = new LinkedList<Statement>()`
- Role: Stores the statements in the block.

### Methods

#### `public Block(Statement... stmts)`
- Role: Creates one statement block.
- Description: Wraps the provided statements in a new block.

#### `public void add(Statement stmt, Statement before)` / `add(Statement stmt)` / `add(Expression expr, Statement before)` / `add(Expression expr)`
- Role: Adds statements to the block.
- Description: Inserts one statement or expression statement with optional ordering.

#### `public Local local(Type type, Symbol name, Expression init, Statement before)` / overloads
- Role: Declares a local variable in the block.
- Description: Adds a new local declaration with optional initializer and insertion point.

#### `public void walk(Walker w)`
- Role: Visits all statements in the block.
- Description: Walks the statement list in emission order.

#### `public void trail(Output out, boolean nl)` / `public void output(Output out)`
- Role: Emits the block source code.
- Description: Writes the block body and optional trailing newline.