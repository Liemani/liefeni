# Index

This file documents the responsibilities and members of `Index`.

## Meta

- Source: [Index.java](../../../../../src/haven/render/sl/Index.java)
- Created: 2026-06-15
- Updated: 2026-06-15

## Role

Represents an indexed l-value expression in shader language output.

## Members

### Constants

### Fields

#### `public final Expression val`

- Description: Base expression being indexed.

#### `public final Expression idx`

- Description: Index expression applied to `val`.

### Methods

#### `public Index(Expression val, Expression idx)`

- Description: Creates an indexed expression from the base value and index.

#### `public void walk(Walker w)`

- Description: Visits both child expressions.

#### `public void output(Output out)`

- Description: Writes the indexed expression form to the shader output.
