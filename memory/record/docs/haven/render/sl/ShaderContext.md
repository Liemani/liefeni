---
source: [ShaderContext.java](../../../../../../src/haven/render/sl/ShaderContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# ShaderContext

Represents the shader context shader-language AST node.

## Members

### Constants

### Fields

#### `public final ProgramContext prog`
- Role: Stores the backing program context.
- Description: Links the shader AST context to the owning program context.

### Methods

#### `public ShaderContext(ProgramContext prog)`
- Role: Creates one shader context wrapper.
- Description: Binds the shader-language context to the program context.