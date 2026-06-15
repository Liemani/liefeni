# Context

This file documents the responsibilities and members of `Context`.

## Meta

- Source: [Context.java](../../../../../src/haven/render/sl/Context.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a resource script context.

## Members

### Constants

### Fields

#### `public final Map<Symbol, String> symtab = new HashMap<Symbol, String>()`

- Description: TODO

#### `public final Map<String, Symbol> rsymtab = new HashMap<String, Symbol>()`

- Description: TODO

#### `public int symgen = 1`

- Description: TODO

#### `public List<Toplevel> typedefs = new LinkedList<Toplevel>()`

- Description: TODO

#### `public List<Toplevel> vardefs = new LinkedList<Toplevel>()`

- Description: TODO

#### `public List<Toplevel> fundefs = new LinkedList<Toplevel>()`

- Description: TODO

#### `public Set<String> exts = new HashSet<String>()`

- Description: TODO

### Methods

#### `public void walk(Walker w)`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO
