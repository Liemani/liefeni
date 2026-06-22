---
source: [Context.java](../../../../../../src/haven/render/sl/Context.java)
created: 2026-06-13
updated: 2026-06-14
---

# Context

Represents the context shader-language AST node.

## Members

### Constants

### Fields

#### `public final Map<Symbol, String> symtab = new HashMap<Symbol, String>()`
- Role: Implements the symtab operation.
- Description: Implements the public final map<symbol, string> symtab = new hash map<symbol, string>() operation.

#### `public final Map<String, Symbol> rsymtab = new HashMap<String, Symbol>()`
- Role: Implements the rsymtab operation.
- Description: Implements the public final map<string, symbol> rsymtab = new hash map<string, symbol>() operation.

#### `public int symgen = 1`
- Role: Caches the symgen value.
- Description: Caches the `symgen` value for reuse.

#### `public List<Toplevel> typedefs = new LinkedList<Toplevel>()`
- Role: Implements the typedefs operation.
- Description: Implements the public list<toplevel> typedefs = new linked list<toplevel>() operation.

#### `public List<Toplevel> vardefs = new LinkedList<Toplevel>()`
- Role: Implements the vardefs operation.
- Description: Implements the public list<toplevel> vardefs = new linked list<toplevel>() operation.

#### `public List<Toplevel> fundefs = new LinkedList<Toplevel>()`
- Role: Implements the fundefs operation.
- Description: Implements the public list<toplevel> fundefs = new linked list<toplevel>() operation.

#### `public Set<String> exts = new HashSet<String>()`
- Role: Implements the exts operation.
- Description: Implements the public set<string> exts = new hash set<string>() operation.

### Methods

#### `public void walk(Walker w)`
- Role: Walks the current shader context.
- Description: Visits every collected declaration in the context.

#### `public void output(Output out)`
- Role: Emits the shader context.
- Description: Writes the collected declarations to the output stream.