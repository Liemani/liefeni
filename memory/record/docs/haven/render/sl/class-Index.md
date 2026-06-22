---
source: [Index.java](../../../../../../src/haven/render/sl/Index.java)
created: 2026-06-15
updated: 2026-06-15
---

# Index

Represents an indexed l-value expression in shader language output.

## Members

### Constants

### Fields

#### `public final Expression val`
- Role: Caches the val value.
- Description: Caches the `val` value for reuse.

#### `public final Expression idx`
- Role: Caches the idx value.
- Description: Caches the `idx` value for reuse.

### Methods

#### `public Index(Expression val, Expression idx)`
- Role: Creates a new Index instance.
- Description: Creates an indexed expression from the base value and index.

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Visits both child expressions.

#### `public void output(Output out)`
- Role: Implements output.
- Description: Writes the indexed expression form to the shader output.