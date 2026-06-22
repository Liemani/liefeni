---
source: [ProgramContext.java](../../../../../../src/haven/render/sl/ProgramContext.java)
created: 2026-06-13
updated: 2026-06-20
---

# ProgramContext

Collects shader modules, symbols, uniforms, attributes, and fragment outputs while a program is being built.

## Members

### Fields

#### `public final List<Uniform> uniforms`
- Role: Stores declared uniforms.

#### `public final List<Attribute> attribs`
- Role: Stores declared vertex attributes.

#### `public final List<FragData> fragdata`
- Role: Stores declared fragment outputs.

#### `public final Map<Symbol, String> symtab`
- Role: Maps symbols to generated names.

#### `public final Map<String, Symbol> rsymtab`
- Role: Maps generated names back to symbols.

#### `public int symgen = 1`
- Role: Tracks the next generated symbol id.

#### `public boolean dump = false`
- Role: Enables shader source dumping.

#### `public boolean instanced = false`
- Role: Marks whether the program uses instanced rendering.

### Methods

#### `public ProgramContext()`
- Role: Creates an empty program context.

#### `public void module(Object mod)`
- Role: Registers a shader module or helper object.

#### `public <T> T getmod(Class<T> cl)`
- Role: Looks up a previously registered module by type.