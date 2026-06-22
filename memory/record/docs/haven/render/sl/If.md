---
source: [If.java](../../../../../../src/haven/render/sl/If.java)
created: 2026-06-13
updated: 2026-06-14
---

# If

Represents the if shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression cond`
- Role: Caches the cond value.
- Description: Caches the `cond` value for reuse.

#### `public final Statement t, f`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

#### `public final Statement t, f`
- Role: Caches the f value.
- Description: Caches the `f` value for reuse.

### Methods

#### `public If(Expression cond, Statement t, Statement f)`
- Role: Creates one if-statement with an else branch.
- Description: Stores the condition and both branch statements.

#### `public If(Expression cond, Statement t)`
- Role: Creates one if-statement.
- Description: Stores the condition and the then branch.

#### `public void walk(Walker w)`
- Role: Visits the condition and branches.
- Description: Walks the condition first, then each branch statement.

#### `public void output(Output out)`
- Role: Emits the if-statement.
- Description: Writes the condition and branch blocks in shader syntax.