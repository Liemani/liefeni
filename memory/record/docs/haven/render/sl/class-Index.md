---
source: [Index.java](../../../../../src/haven/render/sl/Index.java)
created: 2026-06-15
updated: 2026-06-15
---

# Index

Represents an indexed l-value expression in shader language output.

## Members

### Constants

### Fields

#### `public final Expression val`
- Role: Holds the val state.
- Description: Base expression being indexed.

#### `public final Expression idx`
- Role: Holds the idx state.
- Description: Index expression applied to `val`.

### Methods

#### `public Index(Expression val, Expression idx)`
- Role: Creates a new Index instance.
- Description: Creates an indexed expression from the base value and index.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Visits both child expressions.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Writes the indexed expression form to the shader output.
