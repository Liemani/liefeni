---
source: [ProgramContext.java](../../../../../src/haven/render/sl/ProgramContext.java)
created: 2026-06-13
updated: 2026-06-14
---

# ProgramContext

Represents the program context shader-language AST node.

## Members

### Constants

### Fields

#### `public final VertexContext vctx`
- Role: Stores the vctx value.
- Description: Backs the cached state for this file.

#### `public final FragmentContext fctx`
- Role: Stores the fctx value.
- Description: Backs the cached state for this file.

#### `public final Set<Uniform> uniforms = new HashSet<Uniform>()`
- Role: Caches uniforms entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Set<Attribute> attribs = new HashSet<Attribute>()`
- Role: Caches attribs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final List<FragData> fragdata = new ArrayList<FragData>()`
- Role: Caches fragdata entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Map<Symbol, String> symtab = new HashMap<Symbol, String>()`
- Role: Caches symtab entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Map<String, Symbol> rsymtab = new HashMap<String, Symbol>()`
- Role: Caches rsymtab entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int symgen = 1`
- Role: Stores the symgen value.
- Description: Backs the cached state for this file.

#### `public boolean dump = false`
- Role: Tracks the dump flag.
- Description: Supports the dump operation used by the surrounding class.

#### `public boolean instanced = false`
- Role: Tracks the instanced flag.
- Description: Supports the instanced operation used by the surrounding class.

#### `private final Collection<Object> mods = new LinkedList<Object>()`
- Role: Caches mods entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public ProgramContext()`
- Role: Creates a new ProgramContext instance.
- Description: Constructs the instance and initializes its default state.

#### `public void module(Object mod)`
- Role: Performs module.
- Description: Supports the module operation used by the surrounding class.

#### `public <T> T getmod(Class<T> cl)`
- Role: Performs getmod.
- Description: Supports the getmod operation used by the surrounding class.
