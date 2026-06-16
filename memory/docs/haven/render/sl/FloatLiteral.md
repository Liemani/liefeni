# FloatLiteral

This file documents the responsibilities and members of `FloatLiteral`.

## Meta

- Source: [FloatLiteral.java](../../../../../src/haven/render/sl/FloatLiteral.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents the float literal shader-language AST node.

## Members

### Constants

#### `public static final FloatLiteral z = new FloatLiteral(0)`
- Role: Defines the shared z constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FloatLiteral u = new FloatLiteral(1)`
- Role: Defines the shared u constant.
- Description: Shared constant used by the rest of the class.

#### `public static final FloatLiteral n = new FloatLiteral(-1)`
- Role: Defines the shared n constant.
- Description: Shared constant used by the rest of the class.

### Fields

#### `public final double val`
- Role: Stores the val value.
- Description: Backs the cached state for this file.

### Methods

#### `public FloatLiteral(double val)`
- Role: Creates a new FloatLiteral instance.
- Description: Constructs the instance and initializes its default state.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
