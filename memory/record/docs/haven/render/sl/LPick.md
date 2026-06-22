---
source: [LPick.java](../../../../../../src/haven/render/sl/LPick.java)
created: 2026-06-13
updated: 2026-06-14
---

# LPick

Represents the lpick shader-language AST node.

## Members

### Constants

#### `public static final String valid = "xyzwrgbastpq"`
- Role: Caches the valid value.
- Description: Caches the `valid` value for reuse.
- Value: `"xyzwrgbastpq"`

### Fields

#### `public final LValue val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `public final char[] el`
- Role: Caches the el value.
- Description: Caches the `el` value for reuse.

### Methods

#### `public LPick(LValue val, char[] el)`
- Role: Creates one l-value pick expression.
- Description: Stores the mutable source expression and selected component letters.

#### `public LPick(LValue val, String el)`
- Role: Creates one l-value pick expression.
- Description: Stores the mutable source expression and selected component letters.

#### `public void walk(Walker w)`
- Role: Visits the source l-value.
- Description: Walks the value being component-picked.

#### `public void output(Output out)`
- Role: Emits the component pick.
- Description: Writes the swizzle-style component selection.