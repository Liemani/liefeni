---
source: [LPick.java](../../../../../src/haven/render/sl/LPick.java)
created: 2026-06-13
updated: 2026-06-14
---

# LPick

Represents the lpick shader-language AST node.

## Members

### Constants

#### `public static final String valid = "xyzwrgbastpq"`
- Role: Defines the shared valid constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final LValue val`
- Role: Holds the val state.
- Description: Backs the cached state for this file.

#### `public final char[] el`
- Role: Stores the el value.
- Description: Backs the cached state for this file.

### Methods

#### `public LPick(LValue val, char[] el)`
- Role: Creates a new LPick instance.
- Description: Constructs the instance and initializes its default state.

#### `public LPick(LValue val, String el)`
- Role: Creates a new LPick instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
