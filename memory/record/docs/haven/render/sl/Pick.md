---
source: [Pick.java](../../../../../../src/haven/render/sl/Pick.java)
created: 2026-06-13
updated: 2026-06-14
---

# Pick

Represents the pick shader-language AST node.

## Members

### Constants

#### `public static final String valid = "xyzwrgbastpq"`
- Role: Caches the valid value.
- Description: Caches the `valid` value for reuse.
- Value: `"xyzwrgbastpq"`

### Fields

#### `public final Expression val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `public final char[] el`
- Role: Caches the el value.
- Description: Caches the `el` value for reuse.

### Methods

#### `public Pick(Expression val, char[] el)`
- Role: Creates one component pick expression.
- Description: Stores the source expression and selected component letters.

#### `public Pick(Expression val, String el)`
- Role: Creates one component pick expression.
- Description: Stores the source expression and selected component letters.

#### `public void walk(Walker w)`
- Role: Visits the source expression.
- Description: Walks the value being component-picked.

#### `public void output(Output out)`
- Role: Emits the component pick.
- Description: Writes the swizzle-style component selection.