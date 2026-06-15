# Block

This file documents the responsibilities and members of `Block`.

## Meta

- Source: [Block.java](../../../../../src/haven/render/sl/Block.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a shader statement block.

## Nested Types

### Def

- Description: TODO

### Local

- Description: TODO

## Members

### Constants

### Fields

#### `public final List<Statement> stmts = new LinkedList<Statement>()`

- Description: TODO

#### `private final Expression init`

- Description: TODO

### Methods

#### `public Block(Statement... stmts)`

- Description: TODO

#### `public Local(Type type, Symbol name)`

- Description: TODO

#### `public Local(Type type)`

- Description: TODO

#### `public Def(Expression init)`

- Description: TODO

#### `public void walk(Walker w)`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO

#### `public void add(Statement stmt, Statement before)`

- Description: TODO

#### `public void add(Statement stmt)`

- Description: TODO

#### `public void add(Expression expr, Statement before)`

- Description: TODO

#### `public void add(Expression expr)`

- Description: TODO

#### `public Local local(Type type, Symbol name, Expression init, Statement before)`

- Description: TODO

#### `public Local local(Type type, Symbol name, Expression init)`

- Description: TODO

#### `public Local local(Type type, String prefix, Expression init)`

- Description: TODO

#### `public Local local(Type type, Expression init)`

- Description: TODO

#### `public void walk(Walker w)`

- Description: TODO

#### `public void trail(Output out, boolean nl)`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO
