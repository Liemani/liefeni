# IntLiteral

This file documents the responsibilities and members of `IntLiteral`.

## Meta

- Source: [IntLiteral.java](../../../../../src/haven/render/sl/IntLiteral.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the int literal shader-language AST node.

## Members

### Constants

#### `public static final IntLiteral z = new IntLiteral(0)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final IntLiteral u = new IntLiteral(1)`
- Role: Defines the shared u constant.
- Description: Shared constant used by the rest of the class.

#### `public static final IntLiteral n = new IntLiteral(-1)`
- Role: Defines the shared n constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final int val`
- Role: Stores the val value.
- Description: Backs the cached state for this file.

### Methods

#### `public IntLiteral(int val)`
- Role: Creates a new IntLiteral instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
