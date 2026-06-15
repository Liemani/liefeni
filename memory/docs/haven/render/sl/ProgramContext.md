# ProgramContext

This file documents the responsibilities and members of `ProgramContext`.

## Meta

- Source: [ProgramContext.java](../../../../../src/haven/render/sl/ProgramContext.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents shader program context.

## Members

### Constants

### Fields

#### `public final VertexContext vctx`

- Description: TODO

#### `public final FragmentContext fctx`

- Description: TODO

#### `public final Set<Uniform> uniforms = new HashSet<Uniform>()`

- Description: TODO

#### `public final Set<Attribute> attribs = new HashSet<Attribute>()`

- Description: TODO

#### `public final List<FragData> fragdata = new ArrayList<FragData>()`

- Description: TODO

#### `public final Map<Symbol, String> symtab = new HashMap<Symbol, String>()`

- Description: TODO

#### `public final Map<String, Symbol> rsymtab = new HashMap<String, Symbol>()`

- Description: TODO

#### `public int symgen = 1`

- Description: TODO

#### `public boolean dump = false`

- Description: TODO

#### `public boolean instanced = false`

- Description: TODO

#### `private final Collection<Object> mods = new LinkedList<Object>()`

- Description: TODO

### Methods

#### `public ProgramContext()`

- Description: TODO

#### `public void module(Object mod)`

- Description: TODO

#### `public <T> T getmod(Class<T> cl)`

- Description: TODO
