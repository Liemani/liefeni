---
source: [Placeholder.java](../../../../../../src/haven/render/sl/Placeholder.java)
created: 2026-06-13
updated: 2026-06-14
---

# Placeholder

Represents the placeholder shader-language AST node.

## Members

### Constants

### Fields

#### `public final String comment`
- Role: Caches the comment value.
- Description: Caches the `comment` value for reuse.

### Methods

#### `public Placeholder(String comment)`
- Role: Creates one placeholder node.
- Description: Stores a comment string for incomplete shader output.

#### `public Placeholder()`
- Role: Creates one empty placeholder node.
- Description: Uses an empty comment string.

#### `public void walk(Walker w)`
- Role: Visits the placeholder node.
- Description: Placeholder nodes have no child expressions.

#### `public void output(Output out)`
- Role: Emits the placeholder comment.
- Description: Writes the comment text as a shader comment.