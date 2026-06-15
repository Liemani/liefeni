# Variable

This file documents the responsibilities and members of `Variable`.

## Meta

- Source: [Variable.java](../../../../../src/haven/render/sl/Variable.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a shader variable.

## Nested Types

### Definition

- Description: TODO

### Global

- Description: TODO

### Implicit

- Description: TODO

### Ref

- Description: TODO

## Members

### Constants

#### `private static final Object ppid = new PostProc.AutoID("vardef", 10000)`

- Description: TODO

### Fields

#### `public final Type type`

- Description: TODO

#### `public final Symbol name`

- Description: TODO

### Methods

#### `public Variable(Type type, Symbol name)`

- Description: TODO

#### `public void walk(Walker w)`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO

#### `public Ref ref()`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public Implicit(Type type, Symbol name)`

- Description: TODO

#### `public Global(Type type, Symbol name)`

- Description: TODO

#### `public Global(Type type)`

- Description: TODO

#### `public void process(PostProc proc)`

- Description: TODO

#### `public Object ppid()`

- Description: TODO

#### `public void walk(Walker w)`

- Description: TODO

#### `public Ref ref()`

- Description: TODO

#### `public boolean defined(Context ctx)`

- Description: TODO

#### `public void use(Context ctx)`

- Description: TODO

#### `public void walk(Walker w)`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO

#### `private Global var()`

- Description: TODO
