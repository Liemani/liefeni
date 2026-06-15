# PostProc

This file documents the responsibilities and members of `PostProc`.

## Meta

- Source: [PostProc.java](../../../../../src/haven/render/sl/PostProc.java)
- Created: `2026-06-13`
- Updated: `2026-06-14`

## Role

Represents a post-processing step.

## Nested Types

### AutoID

- Description: TODO

### AutoMacro

- Description: TODO

### ProcExpression

- Description: TODO

### Processed

- Description: TODO

## Members

### Constants

#### `public static final AutoID misc = new AutoID("misc", 0)`

- Description: TODO

### Fields

#### `public final Object id`

- Description: TODO

#### `public final Context ctx`

- Description: TODO

#### `public final String name`

- Description: TODO

#### `public final int order`

- Description: TODO

#### `public final Object id`

- Description: TODO

#### `protected Expression exp = null`

- Description: TODO

### Methods

#### `public void process(PostProc proc)`

- Description: TODO

#### `public Object ppid()`

- Description: TODO

#### `public AutoID(String name, int order)`

- Description: TODO

#### `public AutoID(int order)`

- Description: TODO

#### `public void proc(Context ctx)`

- Description: TODO

#### `public String toString()`

- Description: TODO

#### `public PostProc(Object id, Context ctx)`

- Description: TODO

#### `public PostProc(Object id)`

- Description: TODO

#### `public PostProc()`

- Description: TODO

#### `public void el(Element el)`

- Description: TODO

#### `public static void autoproc(Context ctx)`

- Description: TODO

#### `public ProcExpression(Object id)`

- Description: TODO

#### `public Object ppid()`

- Description: TODO

#### `public AutoMacro(Object id)`

- Description: TODO

#### `protected abstract Expression expand(Context ctx)`

- Description: TODO

#### `protected Expression expand0(PostProc proc)`

- Description: TODO

#### `public void process(PostProc proc)`

- Description: TODO

#### `public void walk(Walker w)`

- Description: TODO

#### `public void output(Output out)`

- Description: TODO
