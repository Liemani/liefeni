---
source: [Output.java](../../../../../src/haven/render/sl/Output.java)
created: 2026-06-13
updated: 2026-06-14
---

# Output

Represents the output shader-language AST node.

## Members

### Constants

### Fields

#### `private final Writer out`
- Role: Holds the out state.
- Description: Backs the cached state for this file.

#### `public final Context ctx`
- Role: Stores the ctx value.
- Description: Backs the cached state for this file.

#### `public int indent = 0`
- Role: Stores the indent value.
- Description: Backs the cached state for this file.

### Methods

#### `public Output(Writer out, Context ctx)`
- Role: Creates a new Output instance.
- Description: Constructs the instance and initializes its default state.

#### `public void write(char c)`
- Role: Writes the target data.
- Description: Supports the write operation used by the surrounding class.

#### `public void write(String str)`
- Role: Writes the target data.
- Description: Supports the write operation used by the surrounding class.

#### `public void write(Symbol sym)`
- Role: Writes the target data.
- Description: Supports the write operation used by the surrounding class.

#### `public void indent()`
- Role: Performs indent.
- Description: Supports the indent operation used by the surrounding class.
