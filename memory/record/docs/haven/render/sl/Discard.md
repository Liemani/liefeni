---
source: [Discard.java](../../../../../../src/haven/render/sl/Discard.java)
created: 2026-06-13
updated: 2026-06-14
---

# Discard

Represents the discard shader-language AST node.

## Members

### Constants

### Fields

### Methods

#### `public Discard()`
- Role: Creates a discard statement.
- Description: Represents the shader `discard` command.

#### `public void walk(Walker w)`
- Role: Visits the discard statement.
- Description: Discard has no child expressions to walk.

#### `public void output(Output out)`
- Role: Emits the discard statement.
- Description: Writes the shader `discard;` statement.