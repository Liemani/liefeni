---
source: [Context.java](../../../../../src/haven/render/sl/Context.java)
created: 2026-06-13
updated: 2026-06-14
---

# Context

Represents the context shader-language AST node.

## Members

### Constants

### Fields

#### `public final Map<Symbol, String> symtab = new HashMap<Symbol, String>()`
- Role: Caches symtab entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public final Map<String, Symbol> rsymtab = new HashMap<String, Symbol>()`
- Role: Caches rsymtab entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public int symgen = 1`
- Role: Stores the symgen value.
- Description: Backs the cached state for this file.

#### `public List<Toplevel> typedefs = new LinkedList<Toplevel>()`
- Role: Caches typedefs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public List<Toplevel> vardefs = new LinkedList<Toplevel>()`
- Role: Caches vardefs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public List<Toplevel> fundefs = new LinkedList<Toplevel>()`
- Role: Caches fundefs entries.
- Description: Reuses previously computed values to avoid repeated work.

#### `public Set<String> exts = new HashSet<String>()`
- Role: Caches exts entries.
- Description: Reuses previously computed values to avoid repeated work.

### Methods

#### `public void walk(Walker w)`
- Role: Walks the current structure.
- Description: Supports the walk operation used by the surrounding class.

#### `public void output(Output out)`
- Role: Performs output.
- Description: Supports the output operation used by the surrounding class.
