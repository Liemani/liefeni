---
source: [For.java](../../../../../../src/haven/render/sl/For.java)
created: 2026-06-13
updated: 2026-06-14
---

# For

Represents the for shader-language AST node.

## Members

### Constants

### Fields

#### `public final Expression init, cond, step`
- Role: Caches the step value.
- Description: Caches the `step` value for reuse.

#### `public final Expression init, cond, step`
- Role: Caches the step value.
- Description: Caches the `step` value for reuse.

#### `public final Expression init, cond, step`
- Role: Caches the step value.
- Description: Caches the `step` value for reuse.

#### `public final Statement body`
- Role: Caches the body value.
- Description: Caches the `body` value for reuse.

### Methods

#### `public For(Expression init, Expression cond, Expression step, Statement body)`
- Role: Creates one for-loop statement.
- Description: Stores the initializer, condition, step, and loop body.

#### `public void walk(Walker w)`
- Role: Visits the loop components.
- Description: Walks the initializer, condition, step, and body.

#### `public void output(Output out)`
- Role: Emits the for-loop statement.
- Description: Writes the loop header and body in shader syntax.