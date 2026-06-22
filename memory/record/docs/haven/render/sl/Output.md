---
source: [Output.java](../../../../../../src/haven/render/sl/Output.java)
created: 2026-06-13
updated: 2026-06-20
---

# Output

Serializes shader-language AST nodes into text using a rendering context.

## Members

### Fields

#### `private final Writer out`
- Role: Holds the underlying text writer.

#### `public final Context ctx`
- Role: Holds the active shader context.

#### `public int indent = 0`
- Role: Tracks indentation depth.

### Methods

#### `public Output(Writer out, Context ctx)`
- Role: Creates a shader output writer.
- Description: Binds the text writer and shader context.

#### `public void write(char c)` / `public void write(String str)` / `public void write(Symbol sym)`
- Role: Emits text or symbols.
- Description: Writes raw text or resolved symbol names to output.

#### `public void indent()`
- Role: Writes the current indentation prefix.
- Description: Emits the current indentation whitespace.